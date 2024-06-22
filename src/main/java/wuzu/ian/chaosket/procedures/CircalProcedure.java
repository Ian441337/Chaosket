package wuzu.ian.chaosket.procedures;

import org.joml.Vector3f;
import org.joml.Quaternionf;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Camera;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferUploader;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.systems.RenderSystem;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class CircalProcedure {
	private static RenderLevelStageEvent _provider = null;
	private static boolean _usingBuffers = false;
	private static VertexBuffer _debuglinestripBuffer = null;
	private static VertexBuffer _debuglineBuffer = null;
	private static VertexBuffer _quadBuffer = null;
	private static VertexBuffer _textureBuffer = null;
	private static VertexBuffer _trianglefanBuffer = null;
	private static VertexBuffer _trianglestripBuffer = null;
	private static VertexBuffer _triangleBuffer = null;
	private static BufferBuilder _bufferBuilder = null;
	private static int _skyLevel = 240;
	private static int _blockLevel = 240;

	private static void begin(int type) {
		if (_bufferBuilder == null) {
			_bufferBuilder = Tesselator.getInstance().getBuilder();
			switch (type) {
				case 0 :
					_bufferBuilder.begin(VertexFormat.Mode.DEBUG_LINE_STRIP, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
				case 1 :
					_bufferBuilder.begin(VertexFormat.Mode.DEBUG_LINES, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
				case 2 :
					_bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
				case 3 :
					_bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR_TEX_LIGHTMAP);
					break;
				case 4 :
					_bufferBuilder.begin(VertexFormat.Mode.TRIANGLE_FAN, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
				case 5 :
					_bufferBuilder.begin(VertexFormat.Mode.TRIANGLE_STRIP, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
				case 6 :
					_bufferBuilder.begin(VertexFormat.Mode.TRIANGLES, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
			}
		}
	}

	private static void vertex(double x, double y, double z, int color) {
		vertex(x, y, z, color, 0.0F, 0.0F);
	}

	private static void vertex(double x, double y, double z, int color, float u, float v) {
		if (_bufferBuilder != null && _bufferBuilder.building()) {
			if (_bufferBuilder.currentElement().getUsage() == VertexFormatElement.Usage.POSITION) {
				if (_usingBuffers) {
					_bufferBuilder.vertex(x, y, z);
				} else {
					Vec3 camPos = _provider.getCamera().getPosition();
					_bufferBuilder.vertex(x - camPos.x(), y - camPos.y(), z - camPos.z());
				}
			}
			if (_bufferBuilder.currentElement().getUsage() == VertexFormatElement.Usage.COLOR) {
				_bufferBuilder.color(color);
			}
			if (_bufferBuilder.currentElement().getType() == VertexFormatElement.Type.FLOAT && _bufferBuilder.currentElement().getUsage() == VertexFormatElement.Usage.UV) {
				_bufferBuilder.uv(u, v);
			}
			if (_bufferBuilder.currentElement().getType() == VertexFormatElement.Type.SHORT && _bufferBuilder.currentElement().getUsage() == VertexFormatElement.Usage.UV) {
				_bufferBuilder.uv2(_skyLevel, _blockLevel);
			}
			_bufferBuilder.endVertex();
		}
	}

	private static void end(int type) {
		if (_bufferBuilder != null && _bufferBuilder.building()) {
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			switch (type) {
				case 0 :
					endDebuglinestrip();
					break;
				case 1 :
					endDebuglines();
					break;
				case 2 :
					endQuads();
					break;
				case 3 :
					endTexture();
					break;
				case 4 :
					endTrianglefan();
					break;
				case 5 :
					endTrianglestrip();
					break;
				case 6 :
					endTriangles();
					break;
			}
			_bufferBuilder = null;
		}
	}

	private static void endDebuglinestrip() {
		if (_debuglinestripBuffer != null)
			_debuglinestripBuffer.close();
		_debuglinestripBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_debuglinestripBuffer.bind();
		_debuglinestripBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_debuglinestripBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_debuglinestripBuffer.close();
		}
	}

	private static void endDebuglines() {
		if (_debuglineBuffer != null)
			_debuglineBuffer.close();
		_debuglineBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_debuglineBuffer.bind();
		_debuglineBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_debuglineBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_debuglineBuffer.close();
		}
	}

	private static void endQuads() {
		if (_quadBuffer != null)
			_quadBuffer.close();
		_quadBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_quadBuffer.bind();
		_quadBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_quadBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_quadBuffer.close();
		}
	}

	private static void endTexture() {
		if (_textureBuffer != null)
			_textureBuffer.close();
		_textureBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_textureBuffer.bind();
		_textureBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorTexLightmapShader);
			_textureBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorTexLightmapShader());
			_textureBuffer.close();
		}
	}

	private static void endTrianglefan() {
		if (_trianglefanBuffer != null)
			_trianglefanBuffer.close();
		_trianglefanBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_trianglefanBuffer.bind();
		_trianglefanBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_trianglefanBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_trianglefanBuffer.close();
		}
	}

	private static void endTrianglestrip() {
		if (_trianglestripBuffer != null)
			_trianglestripBuffer.close();
		_trianglestripBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_trianglestripBuffer.bind();
		_trianglestripBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_trianglestripBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_trianglestripBuffer.close();
		}
	}

	private static void endTriangles() {
		if (_triangleBuffer != null)
			_triangleBuffer.close();
		_triangleBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_triangleBuffer.bind();
		_triangleBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_triangleBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_triangleBuffer.close();
		}
	}

	private static void renderBuffer(VertexBuffer vertexBuffer, double x, double y, double z, int color) {
		renderBuffer(vertexBuffer, x, y, z, 0.0F, 0.0F, 0.0F, color);
	}

	private static void renderBuffer(VertexBuffer vertexBuffer, double x, double y, double z, float yaw, float pitch, float roll, int color) {
		renderBuffer(vertexBuffer, x, y, z, 1.0F, 1.0F, 1.0F, yaw, pitch, roll, color);
	}

	private static void renderBuffer(VertexBuffer vertexBuffer, double x, double y, double z, float scaleX, float scaleY, float scaleZ, float yaw, float pitch, float roll, int color) {
		if (_usingBuffers && vertexBuffer != null) {
			Vec3 camPos = _provider.getCamera().getPosition();
			PoseStack poseStack = _provider.getPoseStack();
			poseStack.pushPose();
			poseStack.translate(x - camPos.x(), y - camPos.y(), z - camPos.z());
			poseStack.mulPose(com.mojang.math.Axis.YN.rotationDegrees(yaw));
			poseStack.mulPose(com.mojang.math.Axis.XP.rotationDegrees(pitch));
			poseStack.mulPose(com.mojang.math.Axis.ZN.rotationDegrees(roll));
			poseStack.scale(scaleX, scaleY, scaleZ);
			RenderSystem.setShaderColor((color >> 16 & 255) / 255.0F, (color >> 8 & 255) / 255.0F, (color & 255) / 255.0F, (color >>> 24) / 255.0F);
			vertexBuffer.bind();
			ShaderInstance shaderInstance = GameRenderer.getPositionShader();
			if (vertexBuffer.getFormat() == DefaultVertexFormat.POSITION_COLOR_LIGHTMAP) {
				shaderInstance = GameRenderer.getPositionColorLightmapShader();
			} else if (vertexBuffer.getFormat() == DefaultVertexFormat.POSITION_COLOR_TEX_LIGHTMAP) {
				shaderInstance = GameRenderer.getPositionColorTexLightmapShader();
			}
			vertexBuffer.drawWithShader(poseStack.last().pose(), _provider.getProjectionMatrix(), shaderInstance);
			VertexBuffer.unbind();
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			poseStack.popPose();
		}
	}

	private static void renderParticle(float size, double x, double y, double z, float angles, int color) {
		Camera camera = Minecraft.getInstance().gameRenderer.getMainCamera();
		Vec3 camPos = camera.getPosition();
		Vector3f pos0 = new Vector3f(0.5F, 0.5F, 0.0F);
		Vector3f pos1 = new Vector3f(0.5F, -0.5F, 0.0F);
		Vector3f pos2 = new Vector3f(-0.5F, -0.5F, 0.0F);
		Vector3f pos3 = new Vector3f(-0.5F, 0.5F, 0.0F);
		Quaternionf quaternionf = camera.rotation();
		pos0.rotate(quaternionf);
		pos1.rotate(quaternionf);
		pos2.rotate(quaternionf);
		pos3.rotate(quaternionf);
		pos0.mul(size);
		pos1.mul(size);
		pos2.mul(size);
		pos3.mul(size);
		pos0.add((float) (x - camPos.x()), (float) (y - camPos.y()), (float) (z - camPos.z()));
		pos1.add((float) (x - camPos.x()), (float) (y - camPos.y()), (float) (z - camPos.z()));
		pos2.add((float) (x - camPos.x()), (float) (y - camPos.y()), (float) (z - camPos.z()));
		pos3.add((float) (x - camPos.x()), (float) (y - camPos.y()), (float) (z - camPos.z()));
		RenderSystem.setShaderColor((color >> 16 & 255) / 255.0F, (color >> 8 & 255) / 255.0F, (color & 255) / 255.0F, (color >>> 24) / 255.0F);
		RenderSystem.setShader(GameRenderer::getPositionTexColorShader);
		BufferBuilder bufferBuilder = Tesselator.getInstance().getBuilder();
		bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
		bufferBuilder.vertex(pos0.x(), pos0.y(), pos0.z()).uv(0.0F, 0.0F).color(255, 255, 255, 255).endVertex();
		bufferBuilder.vertex(pos1.x(), pos1.y(), pos1.z()).uv(0.0F, 1.0F).color(255, 255, 255, 255).endVertex();
		bufferBuilder.vertex(pos2.x(), pos2.y(), pos2.z()).uv(1.0F, 1.0F).color(255, 255, 255, 255).endVertex();
		bufferBuilder.vertex(pos3.x(), pos3.y(), pos3.z()).uv(1.0F, 0.0F).color(255, 255, 255, 255).endVertex();
		BufferUploader.drawWithShader(bufferBuilder.end());
		RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
	}

	@SubscribeEvent
	public static void renderWorld(RenderLevelStageEvent event) {
		_provider = event;
		if (_provider.getStage() == RenderLevelStageEvent.Stage.AFTER_WEATHER) {
			ClientLevel level = Minecraft.getInstance().level;
			Entity entity = _provider.getCamera().getEntity();
			Vec3 entPos = entity.getPosition(_provider.getPartialTick());
			Minecraft.getInstance().gameRenderer.lightTexture().turnOnLightLayer();
			RenderSystem.depthMask(true);
			RenderSystem.enableBlend();
			RenderSystem.defaultBlendFunc();
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			execute(_provider);
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.colorMask(true, true, true, true);
			RenderSystem.enableCull();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.depthMask(true);
			Minecraft.getInstance().gameRenderer.lightTexture().turnOffLightLayer();
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		begin(4);
		vertex(0.5, 0, 0.5, (int) (255 << 24 | 255 << 16 | 0 << 8 | 0));
		vertex(0.5, 0, (-0.5), (int) (255 << 24 | 255 << 16 | 0 << 8 | 0));
		vertex(0.5, 0, (-0.5), (int) (255 << 24 | 255 << 16 | 0 << 8 | 0));
		vertex((-0.5), 0, (-0.5), (int) (255 << 24 | 255 << 16 | 0 << 8 | 0));
		vertex((-0.5), 0.5, (-0.5), (int) (255 << 24 | 0 << 16 | 0 << 8 | 255));
		end(4);
		renderBuffer(_trianglefanBuffer, 0, 0, 0, (int) (255 << 24 | 255 << 16 | 255 << 8 | 255));
	}
}

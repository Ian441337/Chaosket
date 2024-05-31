package wuzu.ian.chaosket.client.gui;

import wuzu.ian.chaosket.world.inventory.TravelanchorMenu;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TravelanchorScreen extends AbstractContainerScreen<TravelanchorMenu> {
	private final static HashMap<String, Object> guistate = TravelanchorMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox travel_anchor_name;

	public TravelanchorScreen(TravelanchorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("chaosket:textures/screens/travelanchor.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		travel_anchor_name.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (travel_anchor_name.isFocused())
			return travel_anchor_name.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		travel_anchor_name.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.chaosket.travelanchor.label_travel_anchor"), 51, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		travel_anchor_name = new EditBox(this.font, this.leftPos + 43, this.topPos + 34, 118, 18, Component.translatable("gui.chaosket.travelanchor.travel_anchor_name")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.chaosket.travelanchor.travel_anchor_name").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.chaosket.travelanchor.travel_anchor_name").getString());
				else
					setSuggestion(null);
			}
		};
		travel_anchor_name.setSuggestion(Component.translatable("gui.chaosket.travelanchor.travel_anchor_name").getString());
		travel_anchor_name.setMaxLength(32767);
		guistate.put("text:travel_anchor_name", travel_anchor_name);
		this.addWidget(this.travel_anchor_name);
	}
}

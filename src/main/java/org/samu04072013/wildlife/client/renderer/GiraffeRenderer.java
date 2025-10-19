package org.samu04072013.wildlife.client.renderer;

import org.samu04072013.wildlife.entity.GiraffeEntity;
import org.samu04072013.wildlife.client.model.Modelgiraffe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.mojang.blaze3d.vertex.PoseStack;

public class GiraffeRenderer extends MobRenderer<GiraffeEntity, LivingEntityRenderState, Modelgiraffe> {
	private GiraffeEntity entity = null;

	public GiraffeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgiraffe(context.bakeLayer(Modelgiraffe.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GiraffeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("wildlife:textures/entities/giraffe1.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}
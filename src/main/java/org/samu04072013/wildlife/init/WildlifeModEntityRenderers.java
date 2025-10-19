/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.samu04072013.wildlife.init;

import org.samu04072013.wildlife.client.renderer.GiraffeRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class WildlifeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WildlifeModEntities.GIRAFFE.get(), GiraffeRenderer::new);
	}
}
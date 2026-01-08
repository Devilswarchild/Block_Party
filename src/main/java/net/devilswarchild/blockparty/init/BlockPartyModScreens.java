/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.devilswarchild.blockparty.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.devilswarchild.blockparty.client.gui.RecordPlayerScreen;

@EventBusSubscriber(Dist.CLIENT)
public class BlockPartyModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(BlockPartyModMenus.RECORD_PLAYER.get(), RecordPlayerScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}
package net.ywoswho.magiac;

import net.fabricmc.api.ModInitializer;

import net.ywoswho.magiac.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Magiac implements ModInitializer {
	public static final String MOD_ID = "magiac";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Welcome to Magiac Mod!");

		ModItems.initialize();
	}
}
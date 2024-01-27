package com.pettracker;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PetTracker
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PetTrackerPlugin.class);
		RuneLite.main(args);
	}
}
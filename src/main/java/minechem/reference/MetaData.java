package minechem.reference;

import cpw.mods.fml.common.ModMetadata;
import java.util.Arrays;

public class MetaData
{
	/**
	 * Setup mod metadata
	 *
	 * @param metadata
	 * @return edited metadata object
	 */
	public static ModMetadata init(ModMetadata metadata)
	{
		metadata.modId = Reference.ID;
		metadata.name = Reference.NAME;
		metadata.description = Reference.NAME + " is a mod about chemistry, allowing you to research blocks and items, and then break them down into their base compounds and elements.";
		metadata.url = "http://www.minechemmod.com/";
		metadata.logoFile = "assets/" + Reference.ID + "/logo.png";
		metadata.version = Reference.V_MAJOR + "." + Reference.V_MINOR + "." + Reference.V_REVIS;
		metadata.authorList = Arrays.asList("pixlepix", "jakimfett", "maxwolf");
		metadata.credits = "View a full list of contributors on our site!";
		metadata.autogenerated = false;
		return metadata;
	}
}

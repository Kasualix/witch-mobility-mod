package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.FireboltBroomItem;
import net.mindshake.witchmobility.item.SilverArrowBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireboltBroomItemModel extends AnimatedGeoModel<FireboltBroomItem> {
    @Override
    public Identifier getModelResource(FireboltBroomItem object) {
        return EntityResources.BASIC_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(FireboltBroomItem object) {
        return EntityResources.FIREBOLT_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(FireboltBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}

package com.hrznstudio.escapade.entity.creature.treasurepig;

import com.hrznstudio.escapade.Escapade;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.PigModel;
import net.minecraft.util.ResourceLocation;

public class TreasurePigRenderer extends MobRenderer<TreasurePigEntity, TreasurePigModel<TreasurePigEntity>> {

    public static final ResourceLocation TREASURE_PIG = new ResourceLocation(Escapade.MODID, "textures/entity/treasure_pig");

    public TreasurePigRenderer(EntityRendererManager renderManagerIn, PigModel<TreasurePigEntity> entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
    }

    @Override
    public ResourceLocation getEntityTexture(TreasurePigEntity entity) {
        return TREASURE_PIG;
    }

}

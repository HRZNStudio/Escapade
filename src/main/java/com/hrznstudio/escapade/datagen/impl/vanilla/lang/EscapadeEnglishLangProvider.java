package com.hrznstudio.escapade.datagen.impl.vanilla.lang;

import com.hrznstudio.escapade.datagen.impl.vanilla.lang.base.EscapadeBaseLangProvider;
import com.hrznstudio.escapade.registry.EscapadeEntityRegistration;
import net.minecraft.data.DataGenerator;

public class EscapadeEnglishLangProvider extends EscapadeBaseLangProvider {

    public EscapadeEnglishLangProvider(DataGenerator gen) {
        super(gen, "en_us");
    }

    @Override
    protected void addTranslations() {
        addEntities();
    }

    private void addEntities() {
        add(EscapadeEntityRegistration.TREASURE_PIG.get(), "Treasure Pig");
    }
}

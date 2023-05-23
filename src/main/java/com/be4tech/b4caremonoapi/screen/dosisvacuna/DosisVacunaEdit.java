package com.be4tech.b4caremonoapi.screen.dosisvacuna;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DosisVacuna;

@UiController("DosisVacuna.edit")
@UiDescriptor("dosis-vacuna-edit.xml")
@EditedEntityContainer("dosisVacunaDc")
public class DosisVacunaEdit extends StandardEditor<DosisVacuna> {
}
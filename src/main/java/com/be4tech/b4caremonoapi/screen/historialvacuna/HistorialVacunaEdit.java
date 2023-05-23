package com.be4tech.b4caremonoapi.screen.historialvacuna;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.HistorialVacuna;

@UiController("HistorialVacuna.edit")
@UiDescriptor("historial-vacuna-edit.xml")
@EditedEntityContainer("historialVacunaDc")
public class HistorialVacunaEdit extends StandardEditor<HistorialVacuna> {
}
package com.be4tech.b4caremonoapi.screen.historiaclinica;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.HistoriaClinica;

@UiController("HistoriaClinica.edit")
@UiDescriptor("historia-clinica-edit.xml")
@EditedEntityContainer("historiaClinicaDc")
public class HistoriaClinicaEdit extends StandardEditor<HistoriaClinica> {
}
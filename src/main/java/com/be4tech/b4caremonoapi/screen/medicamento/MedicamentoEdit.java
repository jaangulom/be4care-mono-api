package com.be4tech.b4caremonoapi.screen.medicamento;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Medicamento;

@UiController("Medicamento.edit")
@UiDescriptor("medicamento-edit.xml")
@EditedEntityContainer("medicamentoDc")
public class MedicamentoEdit extends StandardEditor<Medicamento> {
}
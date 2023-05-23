package com.be4tech.b4caremonoapi.screen.tratamientomedicamento;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TratamientoMedicamento;

@UiController("TratamientoMedicamento.edit")
@UiDescriptor("tratamiento-medicamento-edit.xml")
@EditedEntityContainer("tratamientoMedicamentoDc")
public class TratamientoMedicamentoEdit extends StandardEditor<TratamientoMedicamento> {
}
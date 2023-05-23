package com.be4tech.b4caremonoapi.screen.tratamientomedicamento;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TratamientoMedicamento;

@UiController("TratamientoMedicamento.browse")
@UiDescriptor("tratamiento-medicamento-browse.xml")
@LookupComponent("tratamientoMedicamentoesTable")
public class TratamientoMedicamentoBrowse extends StandardLookup<TratamientoMedicamento> {
}
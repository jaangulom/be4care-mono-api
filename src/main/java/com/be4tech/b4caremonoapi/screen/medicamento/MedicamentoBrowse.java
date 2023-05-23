package com.be4tech.b4caremonoapi.screen.medicamento;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Medicamento;

@UiController("Medicamento.browse")
@UiDescriptor("medicamento-browse.xml")
@LookupComponent("medicamentoesTable")
public class MedicamentoBrowse extends StandardLookup<Medicamento> {
}
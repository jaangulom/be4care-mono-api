package com.be4tech.b4caremonoapi.screen.examenfisico;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.ExamenFisico;

@UiController("ExamenFisico.browse")
@UiDescriptor("examen-fisico-browse.xml")
@LookupComponent("examenFisicoesTable")
public class ExamenFisicoBrowse extends StandardLookup<ExamenFisico> {
}
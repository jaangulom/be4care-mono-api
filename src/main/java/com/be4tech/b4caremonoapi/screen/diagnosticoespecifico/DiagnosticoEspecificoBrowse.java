package com.be4tech.b4caremonoapi.screen.diagnosticoespecifico;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DiagnosticoEspecifico;

@UiController("DiagnosticoEspecifico.browse")
@UiDescriptor("diagnostico-especifico-browse.xml")
@LookupComponent("diagnosticoEspecificoesTable")
public class DiagnosticoEspecificoBrowse extends StandardLookup<DiagnosticoEspecifico> {
}
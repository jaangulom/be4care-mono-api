package com.be4tech.b4caremonoapi.screen.diagnostico;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Diagnostico;

@UiController("Diagnostico.browse")
@UiDescriptor("diagnostico-browse.xml")
@LookupComponent("diagnosticoesTable")
public class DiagnosticoBrowse extends StandardLookup<Diagnostico> {
}
package com.be4tech.b4caremonoapi.screen.diagnosticohist;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DiagnosticoHist;

@UiController("DiagnosticoHist.browse")
@UiDescriptor("diagnostico-hist-browse.xml")
@LookupComponent("diagnosticoHistsTable")
public class DiagnosticoHistBrowse extends StandardLookup<DiagnosticoHist> {
}
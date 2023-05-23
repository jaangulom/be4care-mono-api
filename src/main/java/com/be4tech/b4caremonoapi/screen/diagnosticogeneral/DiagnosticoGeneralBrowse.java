package com.be4tech.b4caremonoapi.screen.diagnosticogeneral;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DiagnosticoGeneral;

@UiController("DiagnosticoGeneral.browse")
@UiDescriptor("diagnostico-general-browse.xml")
@LookupComponent("diagnosticoGeneralsTable")
public class DiagnosticoGeneralBrowse extends StandardLookup<DiagnosticoGeneral> {
}
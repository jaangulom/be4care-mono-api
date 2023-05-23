package com.be4tech.b4caremonoapi.screen.diagnosticogeneral;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DiagnosticoGeneral;

@UiController("DiagnosticoGeneral.edit")
@UiDescriptor("diagnostico-general-edit.xml")
@EditedEntityContainer("diagnosticoGeneralDc")
public class DiagnosticoGeneralEdit extends StandardEditor<DiagnosticoGeneral> {
}
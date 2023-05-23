package com.be4tech.b4caremonoapi.screen.diagnosticohist;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DiagnosticoHist;

@UiController("DiagnosticoHist.edit")
@UiDescriptor("diagnostico-hist-edit.xml")
@EditedEntityContainer("diagnosticoHistDc")
public class DiagnosticoHistEdit extends StandardEditor<DiagnosticoHist> {
}
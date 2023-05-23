package com.be4tech.b4caremonoapi.screen.diagnosticoespecifico;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DiagnosticoEspecifico;

@UiController("DiagnosticoEspecifico.edit")
@UiDescriptor("diagnostico-especifico-edit.xml")
@EditedEntityContainer("diagnosticoEspecificoDc")
public class DiagnosticoEspecificoEdit extends StandardEditor<DiagnosticoEspecifico> {
}
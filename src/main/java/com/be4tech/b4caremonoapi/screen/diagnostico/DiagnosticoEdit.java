package com.be4tech.b4caremonoapi.screen.diagnostico;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Diagnostico;

@UiController("Diagnostico.edit")
@UiDescriptor("diagnostico-edit.xml")
@EditedEntityContainer("diagnosticoDc")
public class DiagnosticoEdit extends StandardEditor<Diagnostico> {
}
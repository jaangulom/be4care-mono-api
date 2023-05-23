package com.be4tech.b4caremonoapi.screen.paciente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Paciente;

@UiController("Paciente.edit")
@UiDescriptor("paciente-edit.xml")
@EditedEntityContainer("pacienteDc")
public class PacienteEdit extends StandardEditor<Paciente> {
}
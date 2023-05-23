package com.be4tech.b4caremonoapi.screen.completerapaciente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.CompleTeraPaciente;

@UiController("CompleTeraPaciente.edit")
@UiDescriptor("comple-tera-paciente-edit.xml")
@EditedEntityContainer("compleTeraPacienteDc")
public class CompleTeraPacienteEdit extends StandardEditor<CompleTeraPaciente> {
}
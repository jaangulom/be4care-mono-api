package com.be4tech.b4caremonoapi.screen.datosextrapaciente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DatosExtraPaciente;

@UiController("DatosExtraPaciente.edit")
@UiDescriptor("datos-extra-paciente-edit.xml")
@EditedEntityContainer("datosExtraPacienteDc")
public class DatosExtraPacienteEdit extends StandardEditor<DatosExtraPaciente> {
}
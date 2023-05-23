package com.be4tech.b4caremonoapi.screen.archivospaciente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.ArchivosPaciente;

@UiController("ArchivosPaciente.edit")
@UiDescriptor("archivos-paciente-edit.xml")
@EditedEntityContainer("archivosPacienteDc")
public class ArchivosPacienteEdit extends StandardEditor<ArchivosPaciente> {
}
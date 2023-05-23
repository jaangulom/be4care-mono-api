package com.be4tech.b4caremonoapi.screen.pacientecuidador;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.PacienteCuidador;

@UiController("PacienteCuidador.edit")
@UiDescriptor("paciente-cuidador-edit.xml")
@EditedEntityContainer("pacienteCuidadorDc")
public class PacienteCuidadorEdit extends StandardEditor<PacienteCuidador> {
}
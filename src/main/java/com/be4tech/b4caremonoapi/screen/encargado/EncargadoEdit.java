package com.be4tech.b4caremonoapi.screen.encargado;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Encargado;

@UiController("Encargado.edit")
@UiDescriptor("encargado-edit.xml")
@EditedEntityContainer("encargadoDc")
public class EncargadoEdit extends StandardEditor<Encargado> {
}
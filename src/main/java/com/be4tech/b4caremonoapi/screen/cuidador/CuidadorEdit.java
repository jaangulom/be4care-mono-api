package com.be4tech.b4caremonoapi.screen.cuidador;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Cuidador;

@UiController("Cuidador.edit")
@UiDescriptor("cuidador-edit.xml")
@EditedEntityContainer("cuidadorDc")
public class CuidadorEdit extends StandardEditor<Cuidador> {
}
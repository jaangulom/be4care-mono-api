package com.be4tech.b4caremonoapi.screen.escala;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Escala;

@UiController("Escala.edit")
@UiDescriptor("escala-edit.xml")
@EditedEntityContainer("escalaDc")
public class EscalaEdit extends StandardEditor<Escala> {
}
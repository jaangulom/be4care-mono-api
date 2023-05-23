package com.be4tech.b4caremonoapi.screen.encuesta;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Encuesta;

@UiController("Encuesta.edit")
@UiDescriptor("encuesta-edit.xml")
@EditedEntityContainer("encuestaDc")
public class EncuestaEdit extends StandardEditor<Encuesta> {
}
package com.be4tech.b4caremonoapi.screen.estandarpregunta;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.EstandarPregunta;

@UiController("EstandarPregunta.edit")
@UiDescriptor("estandar-pregunta-edit.xml")
@EditedEntityContainer("estandarPreguntaDc")
public class EstandarPreguntaEdit extends StandardEditor<EstandarPregunta> {
}
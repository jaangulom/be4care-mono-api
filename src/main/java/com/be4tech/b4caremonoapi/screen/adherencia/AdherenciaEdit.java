package com.be4tech.b4caremonoapi.screen.adherencia;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Adherencia;

@UiController("Adherencia.edit")
@UiDescriptor("adherencia-edit.xml")
@EditedEntityContainer("adherenciaDc")
public class AdherenciaEdit extends StandardEditor<Adherencia> {
}
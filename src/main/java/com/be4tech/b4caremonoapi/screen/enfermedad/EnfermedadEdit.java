package com.be4tech.b4caremonoapi.screen.enfermedad;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Enfermedad;

@UiController("Enfermedad.edit")
@UiDescriptor("enfermedad-edit.xml")
@EditedEntityContainer("enfermedadDc")
public class EnfermedadEdit extends StandardEditor<Enfermedad> {
}
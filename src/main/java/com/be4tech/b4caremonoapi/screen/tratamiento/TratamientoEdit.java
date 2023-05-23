package com.be4tech.b4caremonoapi.screen.tratamiento;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Tratamiento;

@UiController("Tratamiento.edit")
@UiDescriptor("tratamiento-edit.xml")
@EditedEntityContainer("tratamientoDc")
public class TratamientoEdit extends StandardEditor<Tratamiento> {
}
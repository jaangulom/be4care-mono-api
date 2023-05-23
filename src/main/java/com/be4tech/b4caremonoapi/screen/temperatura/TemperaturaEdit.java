package com.be4tech.b4caremonoapi.screen.temperatura;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Temperatura;

@UiController("Temperatura.edit")
@UiDescriptor("temperatura-edit.xml")
@EditedEntityContainer("temperaturaDc")
public class TemperaturaEdit extends StandardEditor<Temperatura> {
}
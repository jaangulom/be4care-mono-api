package com.be4tech.b4caremonoapi.screen.alarma;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Alarma;

@UiController("Alarma.edit")
@UiDescriptor("alarma-edit.xml")
@EditedEntityContainer("alarmaDc")
public class AlarmaEdit extends StandardEditor<Alarma> {
}
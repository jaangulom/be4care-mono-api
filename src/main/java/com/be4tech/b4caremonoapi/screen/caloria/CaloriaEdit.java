package com.be4tech.b4caremonoapi.screen.caloria;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Caloria;

@UiController("Caloria.edit")
@UiDescriptor("caloria-edit.xml")
@EditedEntityContainer("caloriaDc")
public class CaloriaEdit extends StandardEditor<Caloria> {
}
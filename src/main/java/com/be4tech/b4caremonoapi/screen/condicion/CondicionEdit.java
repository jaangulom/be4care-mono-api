package com.be4tech.b4caremonoapi.screen.condicion;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Condicion;

@UiController("Condicion.edit")
@UiDescriptor("condicion-edit.xml")
@EditedEntityContainer("condicionDc")
public class CondicionEdit extends StandardEditor<Condicion> {
}
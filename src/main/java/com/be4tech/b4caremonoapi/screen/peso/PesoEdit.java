package com.be4tech.b4caremonoapi.screen.peso;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Peso;

@UiController("Peso.edit")
@UiDescriptor("peso-edit.xml")
@EditedEntityContainer("pesoDc")
public class PesoEdit extends StandardEditor<Peso> {
}
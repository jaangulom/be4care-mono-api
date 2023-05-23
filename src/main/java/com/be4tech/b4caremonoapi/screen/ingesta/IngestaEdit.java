package com.be4tech.b4caremonoapi.screen.ingesta;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Ingesta;

@UiController("Ingesta.edit")
@UiDescriptor("ingesta-edit.xml")
@EditedEntityContainer("ingestaDc")
public class IngestaEdit extends StandardEditor<Ingesta> {
}
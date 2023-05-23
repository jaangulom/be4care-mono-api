package com.be4tech.b4caremonoapi.screen.paso;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Paso;

@UiController("Paso.edit")
@UiDescriptor("paso-edit.xml")
@EditedEntityContainer("pasoDc")
public class PasoEdit extends StandardEditor<Paso> {
}
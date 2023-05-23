package com.be4tech.b4caremonoapi.screen.acompanante;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Acompanante;

@UiController("Acompanante.edit")
@UiDescriptor("acompanante-edit.xml")
@EditedEntityContainer("acompananteDc")
public class AcompananteEdit extends StandardEditor<Acompanante> {
}
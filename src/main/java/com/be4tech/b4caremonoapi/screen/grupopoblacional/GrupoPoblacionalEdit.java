package com.be4tech.b4caremonoapi.screen.grupopoblacional;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.GrupoPoblacional;

@UiController("GrupoPoblacional.edit")
@UiDescriptor("grupo-poblacional-edit.xml")
@EditedEntityContainer("grupoPoblacionalDc")
public class GrupoPoblacionalEdit extends StandardEditor<GrupoPoblacional> {
}
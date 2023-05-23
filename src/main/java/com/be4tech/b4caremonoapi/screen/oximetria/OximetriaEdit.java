package com.be4tech.b4caremonoapi.screen.oximetria;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Oximetria;

@UiController("Oximetria.edit")
@UiDescriptor("oximetria-edit.xml")
@EditedEntityContainer("oximetriaDc")
public class OximetriaEdit extends StandardEditor<Oximetria> {
}
package com.be4tech.b4caremonoapi.screen.glucosa;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Glucosa;

@UiController("Glucosa.edit")
@UiDescriptor("glucosa-edit.xml")
@EditedEntityContainer("glucosaDc")
public class GlucosaEdit extends StandardEditor<Glucosa> {
}
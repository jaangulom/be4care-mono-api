package com.be4tech.b4caremonoapi.screen.indicefuncional;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.IndiceFuncional;

@UiController("IndiceFuncional.edit")
@UiDescriptor("indice-funcional-edit.xml")
@EditedEntityContainer("indiceFuncionalDc")
public class IndiceFuncionalEdit extends StandardEditor<IndiceFuncional> {
}
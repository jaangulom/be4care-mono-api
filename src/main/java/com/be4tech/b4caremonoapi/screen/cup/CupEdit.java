package com.be4tech.b4caremonoapi.screen.cup;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Cup;

@UiController("Cup.edit")
@UiDescriptor("cup-edit.xml")
@EditedEntityContainer("cupDc")
public class CupEdit extends StandardEditor<Cup> {
}
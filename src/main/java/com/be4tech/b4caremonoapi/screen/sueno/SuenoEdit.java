package com.be4tech.b4caremonoapi.screen.sueno;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Sueno;

@UiController("Sueno.edit")
@UiDescriptor("sueno-edit.xml")
@EditedEntityContainer("suenoDc")
public class SuenoEdit extends StandardEditor<Sueno> {
}
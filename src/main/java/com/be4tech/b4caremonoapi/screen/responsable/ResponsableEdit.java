package com.be4tech.b4caremonoapi.screen.responsable;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Responsable;

@UiController("Responsable.edit")
@UiDescriptor("responsable-edit.xml")
@EditedEntityContainer("responsableDc")
public class ResponsableEdit extends StandardEditor<Responsable> {
}
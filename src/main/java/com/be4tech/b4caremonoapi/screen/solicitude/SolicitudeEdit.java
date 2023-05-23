package com.be4tech.b4caremonoapi.screen.solicitude;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Solicitude;

@UiController("Solicitude.edit")
@UiDescriptor("solicitude-edit.xml")
@EditedEntityContainer("solicitudeDc")
public class SolicitudeEdit extends StandardEditor<Solicitude> {
}
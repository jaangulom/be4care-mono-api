package com.be4tech.b4caremonoapi.screen.notificacion;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Notificacion;

@UiController("Notificacion.edit")
@UiDescriptor("notificacion-edit.xml")
@EditedEntityContainer("notificacionDc")
public class NotificacionEdit extends StandardEditor<Notificacion> {
}
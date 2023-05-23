package com.be4tech.b4caremonoapi.screen.notificacion;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Notificacion;

@UiController("Notificacion.browse")
@UiDescriptor("notificacion-browse.xml")
@LookupComponent("notificacionsTable")
public class NotificacionBrowse extends StandardLookup<Notificacion> {
}
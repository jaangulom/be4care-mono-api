package com.be4tech.b4caremonoapi.screen.seguimientohistorialalarma;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.SeguimientoHistorialAlarma;

@UiController("SeguimientoHistorialAlarma.browse")
@UiDescriptor("seguimiento-historial-alarma-browse.xml")
@LookupComponent("seguimientoHistorialAlarmasTable")
public class SeguimientoHistorialAlarmaBrowse extends StandardLookup<SeguimientoHistorialAlarma> {
}
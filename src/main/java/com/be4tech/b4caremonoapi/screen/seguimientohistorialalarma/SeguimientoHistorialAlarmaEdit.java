package com.be4tech.b4caremonoapi.screen.seguimientohistorialalarma;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.SeguimientoHistorialAlarma;

@UiController("SeguimientoHistorialAlarma.edit")
@UiDescriptor("seguimiento-historial-alarma-edit.xml")
@EditedEntityContainer("seguimientoHistorialAlarmaDc")
public class SeguimientoHistorialAlarmaEdit extends StandardEditor<SeguimientoHistorialAlarma> {
}
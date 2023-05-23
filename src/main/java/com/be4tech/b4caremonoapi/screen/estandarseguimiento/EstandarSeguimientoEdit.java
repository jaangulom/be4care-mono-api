package com.be4tech.b4caremonoapi.screen.estandarseguimiento;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.EstandarSeguimiento;

@UiController("EstandarSeguimiento.edit")
@UiDescriptor("estandar-seguimiento-edit.xml")
@EditedEntityContainer("estandarSeguimientoDc")
public class EstandarSeguimientoEdit extends StandardEditor<EstandarSeguimiento> {
}
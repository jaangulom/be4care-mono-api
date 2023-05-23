package com.be4tech.b4caremonoapi.screen.estandarseguimiento;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.EstandarSeguimiento;

@UiController("EstandarSeguimiento.browse")
@UiDescriptor("estandar-seguimiento-browse.xml")
@LookupComponent("estandarSeguimientoesTable")
public class EstandarSeguimientoBrowse extends StandardLookup<EstandarSeguimiento> {
}
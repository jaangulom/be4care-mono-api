package com.be4tech.b4caremonoapi.screen.tipopoblacion;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TipoPoblacion;

@UiController("TipoPoblacion.browse")
@UiDescriptor("tipo-poblacion-browse.xml")
@LookupComponent("tipoPoblacionsTable")
public class TipoPoblacionBrowse extends StandardLookup<TipoPoblacion> {
}
package com.be4tech.b4caremonoapi.screen.tipopoblacion;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TipoPoblacion;

@UiController("TipoPoblacion.edit")
@UiDescriptor("tipo-poblacion-edit.xml")
@EditedEntityContainer("tipoPoblacionDc")
public class TipoPoblacionEdit extends StandardEditor<TipoPoblacion> {
}
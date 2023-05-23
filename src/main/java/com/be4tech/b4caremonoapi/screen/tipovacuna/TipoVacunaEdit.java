package com.be4tech.b4caremonoapi.screen.tipovacuna;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TipoVacuna;

@UiController("TipoVacuna.edit")
@UiDescriptor("tipo-vacuna-edit.xml")
@EditedEntityContainer("tipoVacunaDc")
public class TipoVacunaEdit extends StandardEditor<TipoVacuna> {
}
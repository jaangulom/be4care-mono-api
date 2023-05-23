package com.be4tech.b4caremonoapi.screen.tipovacuna;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TipoVacuna;

@UiController("TipoVacuna.browse")
@UiDescriptor("tipo-vacuna-browse.xml")
@LookupComponent("tipoVacunasTable")
public class TipoVacunaBrowse extends StandardLookup<TipoVacuna> {
}
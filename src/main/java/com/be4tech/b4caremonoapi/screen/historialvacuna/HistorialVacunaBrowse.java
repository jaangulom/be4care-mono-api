package com.be4tech.b4caremonoapi.screen.historialvacuna;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.HistorialVacuna;

@UiController("HistorialVacuna.browse")
@UiDescriptor("historial-vacuna-browse.xml")
@LookupComponent("historialVacunasTable")
public class HistorialVacunaBrowse extends StandardLookup<HistorialVacuna> {
}
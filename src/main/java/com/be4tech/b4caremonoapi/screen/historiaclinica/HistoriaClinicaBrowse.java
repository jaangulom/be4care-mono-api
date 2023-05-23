package com.be4tech.b4caremonoapi.screen.historiaclinica;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.HistoriaClinica;

@UiController("HistoriaClinica.browse")
@UiDescriptor("historia-clinica-browse.xml")
@LookupComponent("historiaClinicasTable")
public class HistoriaClinicaBrowse extends StandardLookup<HistoriaClinica> {
}
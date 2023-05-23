package com.be4tech.b4caremonoapi.screen.dosisvacuna;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DosisVacuna;

@UiController("DosisVacuna.browse")
@UiDescriptor("dosis-vacuna-browse.xml")
@LookupComponent("dosisVacunasTable")
public class DosisVacunaBrowse extends StandardLookup<DosisVacuna> {
}
package com.be4tech.b4caremonoapi.screen.vacuna;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Vacuna;

@UiController("Vacuna.browse")
@UiDescriptor("vacuna-browse.xml")
@LookupComponent("vacunasTable")
public class VacunaBrowse extends StandardLookup<Vacuna> {
}
package com.be4tech.b4caremonoapi.screen.acompanante;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Acompanante;

@UiController("Acompanante.browse")
@UiDescriptor("acompanante-browse.xml")
@LookupComponent("acompanantesTable")
public class AcompananteBrowse extends StandardLookup<Acompanante> {
}
package com.be4tech.b4caremonoapi.screen.escala;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Escala;

@UiController("Escala.browse")
@UiDescriptor("escala-browse.xml")
@LookupComponent("escalasTable")
public class EscalaBrowse extends StandardLookup<Escala> {
}
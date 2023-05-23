package com.be4tech.b4caremonoapi.screen.peso;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Peso;

@UiController("Peso.browse")
@UiDescriptor("peso-browse.xml")
@LookupComponent("pesoesTable")
public class PesoBrowse extends StandardLookup<Peso> {
}
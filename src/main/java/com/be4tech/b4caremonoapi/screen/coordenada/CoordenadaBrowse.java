package com.be4tech.b4caremonoapi.screen.coordenada;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Coordenada;

@UiController("Coordenada.browse")
@UiDescriptor("coordenada-browse.xml")
@LookupComponent("coordenadasTable")
public class CoordenadaBrowse extends StandardLookup<Coordenada> {
}
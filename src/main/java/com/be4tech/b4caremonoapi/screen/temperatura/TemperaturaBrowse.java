package com.be4tech.b4caremonoapi.screen.temperatura;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Temperatura;

@UiController("Temperatura.browse")
@UiDescriptor("temperatura-browse.xml")
@LookupComponent("temperaturasTable")
public class TemperaturaBrowse extends StandardLookup<Temperatura> {
}
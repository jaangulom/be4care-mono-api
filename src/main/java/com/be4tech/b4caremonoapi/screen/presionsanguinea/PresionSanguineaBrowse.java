package com.be4tech.b4caremonoapi.screen.presionsanguinea;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.PresionSanguinea;

@UiController("PresionSanguinea.browse")
@UiDescriptor("presion-sanguinea-browse.xml")
@LookupComponent("presionSanguineasTable")
public class PresionSanguineaBrowse extends StandardLookup<PresionSanguinea> {
}
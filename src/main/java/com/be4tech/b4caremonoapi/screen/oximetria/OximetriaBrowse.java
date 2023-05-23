package com.be4tech.b4caremonoapi.screen.oximetria;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Oximetria;

@UiController("Oximetria.browse")
@UiDescriptor("oximetria-browse.xml")
@LookupComponent("oximetriasTable")
public class OximetriaBrowse extends StandardLookup<Oximetria> {
}
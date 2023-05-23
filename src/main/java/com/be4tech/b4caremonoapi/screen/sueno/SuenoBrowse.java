package com.be4tech.b4caremonoapi.screen.sueno;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Sueno;

@UiController("Sueno.browse")
@UiDescriptor("sueno-browse.xml")
@LookupComponent("suenoesTable")
public class SuenoBrowse extends StandardLookup<Sueno> {
}
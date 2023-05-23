package com.be4tech.b4caremonoapi.screen.caloria;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Caloria;

@UiController("Caloria.browse")
@UiDescriptor("caloria-browse.xml")
@LookupComponent("caloriasTable")
public class CaloriaBrowse extends StandardLookup<Caloria> {
}
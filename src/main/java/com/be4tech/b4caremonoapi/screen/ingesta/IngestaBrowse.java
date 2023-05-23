package com.be4tech.b4caremonoapi.screen.ingesta;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Ingesta;

@UiController("Ingesta.browse")
@UiDescriptor("ingesta-browse.xml")
@LookupComponent("ingestasTable")
public class IngestaBrowse extends StandardLookup<Ingesta> {
}
package com.be4tech.b4caremonoapi.screen.paso;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Paso;

@UiController("Paso.browse")
@UiDescriptor("paso-browse.xml")
@LookupComponent("pasoesTable")
public class PasoBrowse extends StandardLookup<Paso> {
}
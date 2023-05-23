package com.be4tech.b4caremonoapi.screen.condicion;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Condicion;

@UiController("Condicion.browse")
@UiDescriptor("condicion-browse.xml")
@LookupComponent("condicionsTable")
public class CondicionBrowse extends StandardLookup<Condicion> {
}
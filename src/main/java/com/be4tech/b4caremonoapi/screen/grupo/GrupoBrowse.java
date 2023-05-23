package com.be4tech.b4caremonoapi.screen.grupo;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Grupo;

@UiController("Grupo.browse")
@UiDescriptor("grupo-browse.xml")
@LookupComponent("grupoesTable")
public class GrupoBrowse extends StandardLookup<Grupo> {
}
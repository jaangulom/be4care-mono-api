package com.be4tech.b4caremonoapi.screen.componente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Componente;

@UiController("Componente.browse")
@UiDescriptor("componente-browse.xml")
@LookupComponent("componentesTable")
public class ComponenteBrowse extends StandardLookup<Componente> {
}
package com.be4tech.b4caremonoapi.screen.recurso;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Recurso;

@UiController("Recurso.browse")
@UiDescriptor("recurso-browse.xml")
@LookupComponent("recursoesTable")
public class RecursoBrowse extends StandardLookup<Recurso> {
}
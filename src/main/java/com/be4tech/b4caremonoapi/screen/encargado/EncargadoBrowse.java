package com.be4tech.b4caremonoapi.screen.encargado;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Encargado;

@UiController("Encargado.browse")
@UiDescriptor("encargado-browse.xml")
@LookupComponent("encargadoesTable")
public class EncargadoBrowse extends StandardLookup<Encargado> {
}
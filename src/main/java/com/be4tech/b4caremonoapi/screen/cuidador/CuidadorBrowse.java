package com.be4tech.b4caremonoapi.screen.cuidador;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Cuidador;

@UiController("Cuidador.browse")
@UiDescriptor("cuidador-browse.xml")
@LookupComponent("cuidadorsTable")
public class CuidadorBrowse extends StandardLookup<Cuidador> {
}
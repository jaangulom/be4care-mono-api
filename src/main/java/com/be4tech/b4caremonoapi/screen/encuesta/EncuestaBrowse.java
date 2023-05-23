package com.be4tech.b4caremonoapi.screen.encuesta;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Encuesta;

@UiController("Encuesta.browse")
@UiDescriptor("encuesta-browse.xml")
@LookupComponent("encuestasTable")
public class EncuestaBrowse extends StandardLookup<Encuesta> {
}
package com.be4tech.b4caremonoapi.screen.estandarpregunta;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.EstandarPregunta;

@UiController("EstandarPregunta.browse")
@UiDescriptor("estandar-pregunta-browse.xml")
@LookupComponent("estandarPreguntasTable")
public class EstandarPreguntaBrowse extends StandardLookup<EstandarPregunta> {
}
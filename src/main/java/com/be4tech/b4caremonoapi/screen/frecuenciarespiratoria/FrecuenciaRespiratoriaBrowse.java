package com.be4tech.b4caremonoapi.screen.frecuenciarespiratoria;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.FrecuenciaRespiratoria;

@UiController("FrecuenciaRespiratoria.browse")
@UiDescriptor("frecuencia-respiratoria-browse.xml")
@LookupComponent("frecuenciaRespiratoriasTable")
public class FrecuenciaRespiratoriaBrowse extends StandardLookup<FrecuenciaRespiratoria> {
}
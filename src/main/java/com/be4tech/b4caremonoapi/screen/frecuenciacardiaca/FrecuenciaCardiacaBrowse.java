package com.be4tech.b4caremonoapi.screen.frecuenciacardiaca;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.FrecuenciaCardiaca;

@UiController("FrecuenciaCardiaca.browse")
@UiDescriptor("frecuencia-cardiaca-browse.xml")
@LookupComponent("frecuenciaCardiacasTable")
public class FrecuenciaCardiacaBrowse extends StandardLookup<FrecuenciaCardiaca> {
}
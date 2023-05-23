package com.be4tech.b4caremonoapi.screen.frecuenciarespiratoria;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.FrecuenciaRespiratoria;

@UiController("FrecuenciaRespiratoria.edit")
@UiDescriptor("frecuencia-respiratoria-edit.xml")
@EditedEntityContainer("frecuenciaRespiratoriaDc")
public class FrecuenciaRespiratoriaEdit extends StandardEditor<FrecuenciaRespiratoria> {
}
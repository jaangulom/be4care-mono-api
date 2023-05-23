package com.be4tech.b4caremonoapi.screen.frecuenciacardiaca;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.FrecuenciaCardiaca;

@UiController("FrecuenciaCardiaca.edit")
@UiDescriptor("frecuencia-cardiaca-edit.xml")
@EditedEntityContainer("frecuenciaCardiacaDc")
public class FrecuenciaCardiacaEdit extends StandardEditor<FrecuenciaCardiaca> {
}
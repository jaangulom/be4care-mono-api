package com.be4tech.b4caremonoapi.screen.resultadolab;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.ResultadoLab;

@UiController("ResultadoLab.edit")
@UiDescriptor("resultado-lab-edit.xml")
@EditedEntityContainer("resultadoLabDc")
public class ResultadoLabEdit extends StandardEditor<ResultadoLab> {
}
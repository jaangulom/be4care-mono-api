package com.be4tech.b4caremonoapi.screen.resultadolab;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.ResultadoLab;

@UiController("ResultadoLab.browse")
@UiDescriptor("resultado-lab-browse.xml")
@LookupComponent("resultadoLabsTable")
public class ResultadoLabBrowse extends StandardLookup<ResultadoLab> {
}
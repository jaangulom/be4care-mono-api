package com.be4tech.b4caremonoapi.screen.areaencargado;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.AreaEncargado;

@UiController("AreaEncargado.edit")
@UiDescriptor("area-encargado-edit.xml")
@EditedEntityContainer("areaEncargadoDc")
public class AreaEncargadoEdit extends StandardEditor<AreaEncargado> {
}
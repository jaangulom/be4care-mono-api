package com.be4tech.b4caremonoapi.screen.examenfisico;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.ExamenFisico;

@UiController("ExamenFisico.edit")
@UiDescriptor("examen-fisico-edit.xml")
@EditedEntityContainer("examenFisicoDc")
public class ExamenFisicoEdit extends StandardEditor<ExamenFisico> {
}
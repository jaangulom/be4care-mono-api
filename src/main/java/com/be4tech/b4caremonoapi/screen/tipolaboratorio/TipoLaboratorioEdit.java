package com.be4tech.b4caremonoapi.screen.tipolaboratorio;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TipoLaboratorio;

@UiController("TipoLaboratorio.edit")
@UiDescriptor("tipo-laboratorio-edit.xml")
@EditedEntityContainer("tipoLaboratorioDc")
public class TipoLaboratorioEdit extends StandardEditor<TipoLaboratorio> {
}
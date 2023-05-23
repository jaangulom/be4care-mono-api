package com.be4tech.b4caremonoapi.screen.asignaciongrupo;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.AsignacionGrupo;

@UiController("AsignacionGrupo.edit")
@UiDescriptor("asignacion-grupo-edit.xml")
@EditedEntityContainer("asignacionGrupoDc")
public class AsignacionGrupoEdit extends StandardEditor<AsignacionGrupo> {
}
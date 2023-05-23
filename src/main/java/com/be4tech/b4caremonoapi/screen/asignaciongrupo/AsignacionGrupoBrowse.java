package com.be4tech.b4caremonoapi.screen.asignaciongrupo;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.AsignacionGrupo;

@UiController("AsignacionGrupo.browse")
@UiDescriptor("asignacion-grupo-browse.xml")
@LookupComponent("asignacionGrupoesTable")
public class AsignacionGrupoBrowse extends StandardLookup<AsignacionGrupo> {
}
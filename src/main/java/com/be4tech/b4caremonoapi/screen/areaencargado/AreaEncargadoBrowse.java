package com.be4tech.b4caremonoapi.screen.areaencargado;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.AreaEncargado;

@UiController("AreaEncargado.browse")
@UiDescriptor("area-encargado-browse.xml")
@LookupComponent("areaEncargadoesTable")
public class AreaEncargadoBrowse extends StandardLookup<AreaEncargado> {
}
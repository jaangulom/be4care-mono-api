package com.be4tech.b4caremonoapi.screen.rol;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Rol;

@UiController("Rol.browse")
@UiDescriptor("rol-browse.xml")
@LookupComponent("rolsTable")
public class RolBrowse extends StandardLookup<Rol> {
}
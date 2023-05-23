package com.be4tech.b4caremonoapi.screen.rol;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Rol;

@UiController("Rol.edit")
@UiDescriptor("rol-edit.xml")
@EditedEntityContainer("rolDc")
public class RolEdit extends StandardEditor<Rol> {
}
package com.be4tech.b4caremonoapi.screen.grupo;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Grupo;

@UiController("Grupo.edit")
@UiDescriptor("grupo-edit.xml")
@EditedEntityContainer("grupoDc")
public class GrupoEdit extends StandardEditor<Grupo> {
}
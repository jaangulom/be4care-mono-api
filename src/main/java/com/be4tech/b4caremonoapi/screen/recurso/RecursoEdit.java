package com.be4tech.b4caremonoapi.screen.recurso;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Recurso;

@UiController("Recurso.edit")
@UiDescriptor("recurso-edit.xml")
@EditedEntityContainer("recursoDc")
public class RecursoEdit extends StandardEditor<Recurso> {
}
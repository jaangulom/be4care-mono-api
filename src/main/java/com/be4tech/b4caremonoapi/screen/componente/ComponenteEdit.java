package com.be4tech.b4caremonoapi.screen.componente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Componente;

@UiController("Componente.edit")
@UiDescriptor("componente-edit.xml")
@EditedEntityContainer("componenteDc")
public class ComponenteEdit extends StandardEditor<Componente> {
}
package com.be4tech.b4caremonoapi.screen.coordenada;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Coordenada;

@UiController("Coordenada.edit")
@UiDescriptor("coordenada-edit.xml")
@EditedEntityContainer("coordenadaDc")
public class CoordenadaEdit extends StandardEditor<Coordenada> {
}
package com.be4tech.b4caremonoapi.screen.estilosvida;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.EstilosVida;

@UiController("EstilosVida.edit")
@UiDescriptor("estilos-vida-edit.xml")
@EditedEntityContainer("estilosVidaDc")
public class EstilosVidaEdit extends StandardEditor<EstilosVida> {
}
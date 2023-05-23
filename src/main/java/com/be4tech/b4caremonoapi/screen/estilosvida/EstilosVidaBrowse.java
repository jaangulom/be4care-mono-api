package com.be4tech.b4caremonoapi.screen.estilosvida;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.EstilosVida;

@UiController("EstilosVida.browse")
@UiDescriptor("estilos-vida-browse.xml")
@LookupComponent("estilosVidasTable")
public class EstilosVidaBrowse extends StandardLookup<EstilosVida> {
}
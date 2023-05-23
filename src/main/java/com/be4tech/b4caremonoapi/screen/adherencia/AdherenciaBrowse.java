package com.be4tech.b4caremonoapi.screen.adherencia;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Adherencia;

@UiController("Adherencia.browse")
@UiDescriptor("adherencia-browse.xml")
@LookupComponent("adherenciasTable")
public class AdherenciaBrowse extends StandardLookup<Adherencia> {
}
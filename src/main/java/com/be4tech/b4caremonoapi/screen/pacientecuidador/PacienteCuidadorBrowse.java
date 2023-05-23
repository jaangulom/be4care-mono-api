package com.be4tech.b4caremonoapi.screen.pacientecuidador;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.PacienteCuidador;

@UiController("PacienteCuidador.browse")
@UiDescriptor("paciente-cuidador-browse.xml")
@LookupComponent("pacienteCuidadorsTable")
public class PacienteCuidadorBrowse extends StandardLookup<PacienteCuidador> {
}
package com.be4tech.b4caremonoapi.screen.paciente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Paciente;

@UiController("Paciente.browse")
@UiDescriptor("paciente-browse.xml")
@LookupComponent("pacientesTable")
public class PacienteBrowse extends StandardLookup<Paciente> {
}
package com.be4tech.b4caremonoapi.screen.completerapaciente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.CompleTeraPaciente;

@UiController("CompleTeraPaciente.browse")
@UiDescriptor("comple-tera-paciente-browse.xml")
@LookupComponent("compleTeraPacientesTable")
public class CompleTeraPacienteBrowse extends StandardLookup<CompleTeraPaciente> {
}
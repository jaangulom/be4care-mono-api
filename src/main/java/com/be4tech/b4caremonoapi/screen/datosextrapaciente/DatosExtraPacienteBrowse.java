package com.be4tech.b4caremonoapi.screen.datosextrapaciente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DatosExtraPaciente;

@UiController("DatosExtraPaciente.browse")
@UiDescriptor("datos-extra-paciente-browse.xml")
@LookupComponent("datosExtraPacientesTable")
public class DatosExtraPacienteBrowse extends StandardLookup<DatosExtraPaciente> {
}
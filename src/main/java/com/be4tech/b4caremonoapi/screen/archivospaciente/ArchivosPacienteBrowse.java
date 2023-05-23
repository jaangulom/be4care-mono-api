package com.be4tech.b4caremonoapi.screen.archivospaciente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.ArchivosPaciente;

@UiController("ArchivosPaciente.browse")
@UiDescriptor("archivos-paciente-browse.xml")
@LookupComponent("archivosPacientesTable")
public class ArchivosPacienteBrowse extends StandardLookup<ArchivosPaciente> {
}
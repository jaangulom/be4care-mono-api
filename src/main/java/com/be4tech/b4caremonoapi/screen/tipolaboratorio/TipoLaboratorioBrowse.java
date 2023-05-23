package com.be4tech.b4caremonoapi.screen.tipolaboratorio;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TipoLaboratorio;

@UiController("TipoLaboratorio.browse")
@UiDescriptor("tipo-laboratorio-browse.xml")
@LookupComponent("tipoLaboratoriosTable")
public class TipoLaboratorioBrowse extends StandardLookup<TipoLaboratorio> {
}
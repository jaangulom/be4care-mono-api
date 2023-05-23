package com.be4tech.b4caremonoapi.screen.completerapeutica;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.CompleTerapeutica;

@UiController("CompleTerapeutica.browse")
@UiDescriptor("comple-terapeutica-browse.xml")
@LookupComponent("compleTerapeuticasTable")
public class CompleTerapeuticaBrowse extends StandardLookup<CompleTerapeutica> {
}
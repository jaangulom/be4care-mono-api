package com.be4tech.b4caremonoapi.screen.empresa;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Empresa;

@UiController("Empresa.browse")
@UiDescriptor("empresa-browse.xml")
@LookupComponent("empresasTable")
public class EmpresaBrowse extends StandardLookup<Empresa> {
}
package com.be4tech.b4caremonoapi.screen.empresa;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Empresa;

@UiController("Empresa.edit")
@UiDescriptor("empresa-edit.xml")
@EditedEntityContainer("empresaDc")
public class EmpresaEdit extends StandardEditor<Empresa> {
}
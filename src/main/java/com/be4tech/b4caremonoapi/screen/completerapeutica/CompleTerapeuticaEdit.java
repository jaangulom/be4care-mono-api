package com.be4tech.b4caremonoapi.screen.completerapeutica;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.CompleTerapeutica;

@UiController("CompleTerapeutica.edit")
@UiDescriptor("comple-terapeutica-edit.xml")
@EditedEntityContainer("compleTerapeuticaDc")
public class CompleTerapeuticaEdit extends StandardEditor<CompleTerapeutica> {
}
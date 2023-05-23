package com.be4tech.b4caremonoapi.screen.vacuna;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Vacuna;

@UiController("Vacuna.edit")
@UiDescriptor("vacuna-edit.xml")
@EditedEntityContainer("vacunaDc")
public class VacunaEdit extends StandardEditor<Vacuna> {
}
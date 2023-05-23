package com.be4tech.b4caremonoapi.screen.estandaralarma;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.EstandarAlarma;

@UiController("EstandarAlarma.edit")
@UiDescriptor("estandar-alarma-edit.xml")
@EditedEntityContainer("estandarAlarmaDc")
public class EstandarAlarmaEdit extends StandardEditor<EstandarAlarma> {
}
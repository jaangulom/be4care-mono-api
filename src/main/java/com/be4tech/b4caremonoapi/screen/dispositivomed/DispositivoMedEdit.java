package com.be4tech.b4caremonoapi.screen.dispositivomed;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DispositivoMed;

@UiController("DispositivoMed.edit")
@UiDescriptor("dispositivo-med-edit.xml")
@EditedEntityContainer("dispositivoMedDc")
public class DispositivoMedEdit extends StandardEditor<DispositivoMed> {
}
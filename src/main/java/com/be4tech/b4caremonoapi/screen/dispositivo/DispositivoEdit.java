package com.be4tech.b4caremonoapi.screen.dispositivo;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Dispositivo;

@UiController("Dispositivo.edit")
@UiDescriptor("dispositivo-edit.xml")
@EditedEntityContainer("dispositivoDc")
public class DispositivoEdit extends StandardEditor<Dispositivo> {
}
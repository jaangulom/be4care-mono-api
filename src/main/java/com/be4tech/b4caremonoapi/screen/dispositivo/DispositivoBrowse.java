package com.be4tech.b4caremonoapi.screen.dispositivo;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Dispositivo;

@UiController("Dispositivo.browse")
@UiDescriptor("dispositivo-browse.xml")
@LookupComponent("dispositivoesTable")
public class DispositivoBrowse extends StandardLookup<Dispositivo> {
}
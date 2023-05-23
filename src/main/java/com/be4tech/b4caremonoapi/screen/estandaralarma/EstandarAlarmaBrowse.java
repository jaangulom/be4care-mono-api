package com.be4tech.b4caremonoapi.screen.estandaralarma;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.EstandarAlarma;

@UiController("EstandarAlarma.browse")
@UiDescriptor("estandar-alarma-browse.xml")
@LookupComponent("estandarAlarmasTable")
public class EstandarAlarmaBrowse extends StandardLookup<EstandarAlarma> {
}
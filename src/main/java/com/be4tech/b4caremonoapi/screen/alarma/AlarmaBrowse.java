package com.be4tech.b4caremonoapi.screen.alarma;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Alarma;

@UiController("Alarma.browse")
@UiDescriptor("alarma-browse.xml")
@LookupComponent("alarmasTable")
public class AlarmaBrowse extends StandardLookup<Alarma> {
}
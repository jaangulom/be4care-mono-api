package com.be4tech.b4caremonoapi.screen.dispositivomed;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.DispositivoMed;

@UiController("DispositivoMed.browse")
@UiDescriptor("dispositivo-med-browse.xml")
@LookupComponent("dispositivoMedsTable")
public class DispositivoMedBrowse extends StandardLookup<DispositivoMed> {
}
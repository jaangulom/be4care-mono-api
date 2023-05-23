package com.be4tech.b4caremonoapi.screen.solicitude;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Solicitude;

@UiController("Solicitude.browse")
@UiDescriptor("solicitude-browse.xml")
@LookupComponent("solicitudesTable")
public class SolicitudeBrowse extends StandardLookup<Solicitude> {
}
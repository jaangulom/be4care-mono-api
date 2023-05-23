package com.be4tech.b4caremonoapi.screen.estandarsolicitude;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.EstandarSolicitude;

@UiController("EstandarSolicitude.browse")
@UiDescriptor("estandar-solicitude-browse.xml")
@LookupComponent("estandarSolicitudesTable")
public class EstandarSolicitudeBrowse extends StandardLookup<EstandarSolicitude> {
}
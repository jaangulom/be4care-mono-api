package com.be4tech.b4caremonoapi.screen.estandarsolicitude;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.EstandarSolicitude;

@UiController("EstandarSolicitude.edit")
@UiDescriptor("estandar-solicitude-edit.xml")
@EditedEntityContainer("estandarSolicitudeDc")
public class EstandarSolicitudeEdit extends StandardEditor<EstandarSolicitude> {
}
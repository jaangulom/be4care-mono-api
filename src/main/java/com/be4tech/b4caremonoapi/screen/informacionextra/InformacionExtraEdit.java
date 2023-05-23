package com.be4tech.b4caremonoapi.screen.informacionextra;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.InformacionExtra;

@UiController("InformacionExtra.edit")
@UiDescriptor("informacion-extra-edit.xml")
@EditedEntityContainer("informacionExtraDc")
public class InformacionExtraEdit extends StandardEditor<InformacionExtra> {
}
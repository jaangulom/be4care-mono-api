package com.be4tech.b4caremonoapi.screen.informacionextra;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.InformacionExtra;

@UiController("InformacionExtra.browse")
@UiDescriptor("informacion-extra-browse.xml")
@LookupComponent("informacionExtrasTable")
public class InformacionExtraBrowse extends StandardLookup<InformacionExtra> {
}
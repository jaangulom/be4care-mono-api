package com.be4tech.b4caremonoapi.screen.grupopoblacional;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.GrupoPoblacional;

@UiController("GrupoPoblacional.browse")
@UiDescriptor("grupo-poblacional-browse.xml")
@LookupComponent("grupoPoblacionalsTable")
public class GrupoPoblacionalBrowse extends StandardLookup<GrupoPoblacional> {
}
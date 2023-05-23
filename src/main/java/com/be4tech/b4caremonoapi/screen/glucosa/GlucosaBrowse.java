package com.be4tech.b4caremonoapi.screen.glucosa;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Glucosa;

@UiController("Glucosa.browse")
@UiDescriptor("glucosa-browse.xml")
@LookupComponent("glucosasTable")
public class GlucosaBrowse extends StandardLookup<Glucosa> {
}
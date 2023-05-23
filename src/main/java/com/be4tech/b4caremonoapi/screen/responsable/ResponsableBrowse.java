package com.be4tech.b4caremonoapi.screen.responsable;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Responsable;

@UiController("Responsable.browse")
@UiDescriptor("responsable-browse.xml")
@LookupComponent("responsablesTable")
public class ResponsableBrowse extends StandardLookup<Responsable> {
}
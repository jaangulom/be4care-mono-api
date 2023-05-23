package com.be4tech.b4caremonoapi.screen.triage;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Triage;

@UiController("Triage.browse")
@UiDescriptor("triage-browse.xml")
@LookupComponent("triagesTable")
public class TriageBrowse extends StandardLookup<Triage> {
}
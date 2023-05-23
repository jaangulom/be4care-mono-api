package com.be4tech.b4caremonoapi.screen.cup;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Cup;

@UiController("Cup.browse")
@UiDescriptor("cup-browse.xml")
@LookupComponent("cupsTable")
public class CupBrowse extends StandardLookup<Cup> {
}
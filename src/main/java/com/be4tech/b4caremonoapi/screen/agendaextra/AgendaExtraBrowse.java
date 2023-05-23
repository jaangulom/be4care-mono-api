package com.be4tech.b4caremonoapi.screen.agendaextra;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.AgendaExtra;

@UiController("AgendaExtra.browse")
@UiDescriptor("agenda-extra-browse.xml")
@LookupComponent("agendaExtrasTable")
public class AgendaExtraBrowse extends StandardLookup<AgendaExtra> {
}
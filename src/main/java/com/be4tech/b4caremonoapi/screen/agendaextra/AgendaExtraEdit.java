package com.be4tech.b4caremonoapi.screen.agendaextra;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.AgendaExtra;

@UiController("AgendaExtra.edit")
@UiDescriptor("agenda-extra-edit.xml")
@EditedEntityContainer("agendaExtraDc")
public class AgendaExtraEdit extends StandardEditor<AgendaExtra> {
}
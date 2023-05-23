package com.be4tech.b4caremonoapi.screen.triage;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Triage;

@UiController("Triage.edit")
@UiDescriptor("triage-edit.xml")
@EditedEntityContainer("triageDc")
public class TriageEdit extends StandardEditor<Triage> {
}
package com.be4tech.b4caremonoapi.screen.enfermedad;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Enfermedad;

@UiController("Enfermedad.browse")
@UiDescriptor("enfermedad-browse.xml")
@LookupComponent("enfermedadsTable")
public class EnfermedadBrowse extends StandardLookup<Enfermedad> {
}
package com.be4tech.b4caremonoapi.screen.tratamiento;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Tratamiento;

@UiController("Tratamiento.browse")
@UiDescriptor("tratamiento-browse.xml")
@LookupComponent("tratamientoesTable")
public class TratamientoBrowse extends StandardLookup<Tratamiento> {
}
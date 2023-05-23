package com.be4tech.b4caremonoapi.screen.antecedente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Antecedente;

@UiController("Antecedente.browse")
@UiDescriptor("antecedente-browse.xml")
@LookupComponent("antecedentesTable")
public class AntecedenteBrowse extends StandardLookup<Antecedente> {
}
package com.be4tech.b4caremonoapi.screen.antecedentesginecologico;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.AntecedentesGinecologico;

@UiController("AntecedentesGinecologico.browse")
@UiDescriptor("antecedentes-ginecologico-browse.xml")
@LookupComponent("antecedentesGinecologicoesTable")
public class AntecedentesGinecologicoBrowse extends StandardLookup<AntecedentesGinecologico> {
}
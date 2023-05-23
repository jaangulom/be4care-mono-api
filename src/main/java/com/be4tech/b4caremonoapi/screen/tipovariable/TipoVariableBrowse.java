package com.be4tech.b4caremonoapi.screen.tipovariable;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TipoVariable;

@UiController("TipoVariable.browse")
@UiDescriptor("tipo-variable-browse.xml")
@LookupComponent("tipoVariablesTable")
public class TipoVariableBrowse extends StandardLookup<TipoVariable> {
}
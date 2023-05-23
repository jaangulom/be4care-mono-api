package com.be4tech.b4caremonoapi.screen.tipovariable;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TipoVariable;

@UiController("TipoVariable.edit")
@UiDescriptor("tipo-variable-edit.xml")
@EditedEntityContainer("tipoVariableDc")
public class TipoVariableEdit extends StandardEditor<TipoVariable> {
}
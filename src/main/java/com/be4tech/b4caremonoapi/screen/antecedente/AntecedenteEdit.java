package com.be4tech.b4caremonoapi.screen.antecedente;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Antecedente;

@UiController("Antecedente.edit")
@UiDescriptor("antecedente-edit.xml")
@EditedEntityContainer("antecedenteDc")
public class AntecedenteEdit extends StandardEditor<Antecedente> {
}
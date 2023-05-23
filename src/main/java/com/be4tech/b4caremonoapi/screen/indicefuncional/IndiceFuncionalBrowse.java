package com.be4tech.b4caremonoapi.screen.indicefuncional;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.IndiceFuncional;

@UiController("IndiceFuncional.browse")
@UiDescriptor("indice-funcional-browse.xml")
@LookupComponent("indiceFuncionalsTable")
public class IndiceFuncionalBrowse extends StandardLookup<IndiceFuncional> {
}
package com.be4tech.b4caremonoapi.screen.configadicionalvar;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.ConfigAdicionalVar;

@UiController("ConfigAdicionalVar.browse")
@UiDescriptor("config-adicional-var-browse.xml")
@LookupComponent("configAdicionalVarsTable")
public class ConfigAdicionalVarBrowse extends StandardLookup<ConfigAdicionalVar> {
}
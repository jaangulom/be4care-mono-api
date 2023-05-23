package com.be4tech.b4caremonoapi.screen.ip;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Ip;

@UiController("Ip.edit")
@UiDescriptor("ip-edit.xml")
@EditedEntityContainer("ipDc")
public class IpEdit extends StandardEditor<Ip> {
}
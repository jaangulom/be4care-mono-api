package com.be4tech.b4caremonoapi.screen.ip;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Ip;

@UiController("Ip.browse")
@UiDescriptor("ip-browse.xml")
@LookupComponent("ipsTable")
public class IpBrowse extends StandardLookup<Ip> {
}
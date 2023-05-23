package com.be4tech.b4caremonoapi.screen.segimientodisp;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.SegimientoDisp;

@UiController("SegimientoDisp.browse")
@UiDescriptor("segimiento-disp-browse.xml")
@LookupComponent("segimientoDispsTable")
public class SegimientoDispBrowse extends StandardLookup<SegimientoDisp> {
}
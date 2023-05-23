package com.be4tech.b4caremonoapi.screen.segimientodisp;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.SegimientoDisp;

@UiController("SegimientoDisp.edit")
@UiDescriptor("segimiento-disp-edit.xml")
@EditedEntityContainer("segimientoDispDc")
public class SegimientoDispEdit extends StandardEditor<SegimientoDisp> {
}
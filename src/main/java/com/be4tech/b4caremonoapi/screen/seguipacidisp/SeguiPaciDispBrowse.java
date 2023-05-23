package com.be4tech.b4caremonoapi.screen.seguipacidisp;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.SeguiPaciDisp;

@UiController("SeguiPaciDisp.browse")
@UiDescriptor("segui-paci-disp-browse.xml")
@LookupComponent("seguiPaciDispsTable")
public class SeguiPaciDispBrowse extends StandardLookup<SeguiPaciDisp> {
}
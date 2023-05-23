package com.be4tech.b4caremonoapi.screen.area;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Area;

@UiController("Area.browse")
@UiDescriptor("area-browse.xml")
@LookupComponent("areasTable")
public class AreaBrowse extends StandardLookup<Area> {
}
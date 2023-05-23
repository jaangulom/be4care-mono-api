package com.be4tech.b4caremonoapi.screen.area;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Area;

@UiController("Area.edit")
@UiDescriptor("area-edit.xml")
@EditedEntityContainer("areaDc")
public class AreaEdit extends StandardEditor<Area> {
}
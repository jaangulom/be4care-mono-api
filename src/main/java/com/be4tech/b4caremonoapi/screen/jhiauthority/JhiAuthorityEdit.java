package com.be4tech.b4caremonoapi.screen.jhiauthority;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.JhiAuthority;

@UiController("JhiAuthority.edit")
@UiDescriptor("jhi-authority-edit.xml")
@EditedEntityContainer("jhiAuthorityDc")
public class JhiAuthorityEdit extends StandardEditor<JhiAuthority> {
}
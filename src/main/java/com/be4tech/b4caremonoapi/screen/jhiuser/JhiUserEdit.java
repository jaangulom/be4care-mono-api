package com.be4tech.b4caremonoapi.screen.jhiuser;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.JhiUser;

@UiController("JhiUser.edit")
@UiDescriptor("jhi-user-edit.xml")
@EditedEntityContainer("jhiUserDc")
public class JhiUserEdit extends StandardEditor<JhiUser> {
}
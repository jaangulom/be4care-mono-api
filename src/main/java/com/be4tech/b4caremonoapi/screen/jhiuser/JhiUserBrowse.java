package com.be4tech.b4caremonoapi.screen.jhiuser;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.JhiUser;

@UiController("JhiUser.browse")
@UiDescriptor("jhi-user-browse.xml")
@LookupComponent("jhiUsersTable")
public class JhiUserBrowse extends StandardLookup<JhiUser> {
}
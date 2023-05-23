package com.be4tech.b4caremonoapi.screen.jhiauthority;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.JhiAuthority;

@UiController("JhiAuthority.browse")
@UiDescriptor("jhi-authority-browse.xml")
@LookupComponent("jhiAuthoritiesTable")
public class JhiAuthorityBrowse extends StandardLookup<JhiAuthority> {
}
package com.be4tech.b4caremonoapi.screen.tokendisp;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TokenDisp;

@UiController("TokenDisp.browse")
@UiDescriptor("token-disp-browse.xml")
@LookupComponent("tokenDispsTable")
public class TokenDispBrowse extends StandardLookup<TokenDisp> {
}
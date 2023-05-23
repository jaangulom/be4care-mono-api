package com.be4tech.b4caremonoapi.screen.tokendisp;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.TokenDisp;

@UiController("TokenDisp.edit")
@UiDescriptor("token-disp-edit.xml")
@EditedEntityContainer("tokenDispDc")
public class TokenDispEdit extends StandardEditor<TokenDisp> {
}
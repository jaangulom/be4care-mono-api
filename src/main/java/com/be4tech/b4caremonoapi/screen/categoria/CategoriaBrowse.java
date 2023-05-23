package com.be4tech.b4caremonoapi.screen.categoria;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Categoria;

@UiController("Categoria.browse")
@UiDescriptor("categoria-browse.xml")
@LookupComponent("categoriasTable")
public class CategoriaBrowse extends StandardLookup<Categoria> {
}
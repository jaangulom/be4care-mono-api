package com.be4tech.b4caremonoapi.screen.categoria;

import io.jmix.ui.screen.*;
import com.be4tech.b4caremonoapi.entity.Categoria;

@UiController("Categoria.edit")
@UiDescriptor("categoria-edit.xml")
@EditedEntityContainer("categoriaDc")
public class CategoriaEdit extends StandardEditor<Categoria> {
}
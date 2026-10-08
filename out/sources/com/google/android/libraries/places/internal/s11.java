package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class s11 extends wd.i {
    final /* synthetic */ Map A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s11(w11 w11Var, String str, vd.p.b bVar, int i15, int i16, ImageView.ScaleType scaleType, Bitmap.Config config, vd.p.a aVar, Map map) {
        super(str, bVar, 0, 0, scaleType, config, aVar);
        this.A = map;
        Objects.requireNonNull(w11Var);
    }

    @Override // vd.n
    public final Map v() {
        return this.A;
    }
}

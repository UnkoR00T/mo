package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class yx extends gy {
    yx() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gy
    public final void a() {
        if (!k()) {
            for (int i15 = 0; i15 < c(); i15++) {
                ((pv) ((zx) g(i15)).b()).K1();
            }
            Iterator it = d().iterator();
            while (it.hasNext()) {
                ((pv) ((Map.Entry) it.next()).getKey()).K1();
            }
        }
        super.a();
    }
}

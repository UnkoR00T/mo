package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class n5 extends u5 {
    n5() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.u5
    public final void a() {
        if (!k()) {
            for (int i15 = 0; i15 < c(); i15++) {
                ((a3) ((o5) g(i15)).b()).i();
            }
            Iterator it = d().iterator();
            while (it.hasNext()) {
                ((a3) ((Map.Entry) it.next()).getKey()).i();
            }
        }
        super.a();
    }
}

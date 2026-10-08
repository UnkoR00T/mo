package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class x00 extends b10 {
    x00() {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.b10
    public final void a() {
        if (!b()) {
            for (int i15 = 0; i15 < c(); i15++) {
                ((py) ((y00) d(i15)).b()).c();
            }
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((py) ((Map.Entry) it.next()).getKey()).c();
            }
        }
        super.a();
    }
}

package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class g3 extends f3 {
    g3(int i15) {
        super(i15, null);
    }

    @Override // com.google.android.gms.internal.clearcut.f3
    public final void r() {
        if (!a()) {
            for (int i15 = 0; i15 < m(); i15++) {
                Map.Entry entryG = g(i15);
                if (((z0) entryG.getKey()).o1()) {
                    entryG.setValue(Collections.unmodifiableList((List) entryG.getValue()));
                }
            }
            for (Map.Entry entry : n()) {
                if (((z0) entry.getKey()).o1()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.r();
    }
}

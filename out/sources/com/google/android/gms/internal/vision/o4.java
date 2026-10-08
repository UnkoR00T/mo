package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class o4 extends p4 {
    o4(int i15) {
        super(i15, null);
    }

    @Override // com.google.android.gms.internal.vision.p4
    public final void e() {
        if (!i()) {
            for (int i15 = 0; i15 < k(); i15++) {
                Map.Entry entryH = h(i15);
                if (((g2) entryH.getKey()).c()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry entry : n()) {
                if (((g2) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }
}

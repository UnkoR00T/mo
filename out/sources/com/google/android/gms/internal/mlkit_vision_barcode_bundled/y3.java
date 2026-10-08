package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class y3 implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map.Entry f30316a;

    public final a4 a() {
        return (a4) this.f30316a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f30316a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((a4) this.f30316a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof r4) {
            return ((a4) this.f30316a.getValue()).c((r4) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

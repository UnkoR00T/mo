package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class pw implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map.Entry f30559a;

    public final rw a() {
        return (rw) this.f30559a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f30559a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((rw) this.f30559a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof jx) {
            return ((rw) this.f30559a.getValue()).c((jx) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

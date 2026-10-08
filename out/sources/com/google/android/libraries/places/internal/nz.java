package com.google.android.libraries.places.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class nz implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map.Entry f33103a;

    public final pz a() {
        return (pz) this.f33103a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f33103a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((pz) this.f33103a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof g00)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        throw null;
    }
}

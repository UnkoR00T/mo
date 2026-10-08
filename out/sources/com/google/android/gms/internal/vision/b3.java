package com.google.android.gms.internal.vision;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class b3<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map.Entry<K, z2> f30972a;

    private b3(Map.Entry<K, z2> entry) {
        this.f30972a = entry;
    }

    public final z2 a() {
        return this.f30972a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f30972a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f30972a.getValue() == null) {
            return null;
        }
        return z2.d();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof u3) {
            return this.f30972a.getValue().a((u3) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

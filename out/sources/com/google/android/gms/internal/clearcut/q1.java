package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class q1<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map.Entry<K, o1> f29519a;

    private q1(Map.Entry<K, o1> entry) {
        this.f29519a = entry;
    }

    public final o1 a() {
        return this.f29519a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f29519a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f29519a.getValue() == null) {
            return null;
        }
        return o1.d();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof l2) {
            return this.f29519a.getValue().b((l2) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

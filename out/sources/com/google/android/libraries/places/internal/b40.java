package com.google.android.libraries.places.internal;

import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b40 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final IdentityHashMap f31733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b40 f31734c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IdentityHashMap f31735a;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        f31733b = identityHashMap;
        f31734c = new b40(identityHashMap);
    }

    private b40(IdentityHashMap identityHashMap) {
        this.f31735a = identityHashMap;
    }

    public static z30 b() {
        return new z30(f31734c, null);
    }

    public final Object a(a40 a40Var) {
        return this.f31735a.get(a40Var);
    }

    public final z30 c() {
        return new z30(this, null);
    }

    final /* synthetic */ IdentityHashMap d() {
        return this.f31735a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b40.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = this.f31735a;
        IdentityHashMap identityHashMap2 = ((b40) obj).f31735a;
        if (identityHashMap.size() != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !zj.l.a(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iB = 0;
        for (Map.Entry entry : this.f31735a.entrySet()) {
            iB += zj.l.b(entry.getKey(), entry.getValue());
        }
        return iB;
    }

    public final String toString() {
        return this.f31735a.toString();
    }

    /* synthetic */ b40(IdentityHashMap identityHashMap, byte[] bArr) {
        this.f31735a = identityHashMap;
    }
}

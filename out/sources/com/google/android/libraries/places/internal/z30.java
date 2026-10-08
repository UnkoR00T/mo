package com.google.android.libraries.places.internal;

import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class z30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b40 f34464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IdentityHashMap f34465b;

    /* synthetic */ z30(b40 b40Var, byte[] bArr) {
        this.f34464a = b40Var;
    }

    private final IdentityHashMap d(int i15) {
        if (this.f34465b == null) {
            IdentityHashMap identityHashMap = new IdentityHashMap(this.f34464a.d().size() + i15);
            this.f34465b = identityHashMap;
            identityHashMap.putAll(this.f34464a.d());
            this.f34464a = null;
        }
        return this.f34465b;
    }

    public final z30 a(a40 a40Var, Object obj) {
        d(1).put(a40Var, obj);
        return this;
    }

    public final z30 b(a40 a40Var) {
        b40 b40Var = this.f34464a;
        if (b40Var == null) {
            this.f34465b.remove(a40Var);
            return this;
        }
        if (b40Var.d().containsKey(a40Var)) {
            d(0).remove(a40Var);
        }
        return this;
    }

    public final b40 c() {
        if (this.f34465b != null) {
            this.f34464a = new b40(this.f34465b, null);
            this.f34465b = null;
        }
        return this.f34464a;
    }
}

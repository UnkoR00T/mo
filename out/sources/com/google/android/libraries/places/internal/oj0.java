package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class oj0 extends c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f40 f33186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a80 f33187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f80 f33188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a70 f33189d;

    public oj0(f80 f80Var, a80 a80Var, f40 f40Var, a70 a70Var) {
        this.f33188c = (f80) zj.p.r(f80Var, "method");
        this.f33187b = (a80) zj.p.r(a80Var, "headers");
        this.f33186a = (f40) zj.p.r(f40Var, "callOptions");
        this.f33189d = (a70) zj.p.r(a70Var, "pickDetailsConsumer");
    }

    @Override // com.google.android.libraries.places.internal.c70
    public final f40 a() {
        return this.f33186a;
    }

    @Override // com.google.android.libraries.places.internal.c70
    public final a80 b() {
        return this.f33187b;
    }

    @Override // com.google.android.libraries.places.internal.c70
    public final f80 c() {
        return this.f33188c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oj0.class == obj.getClass()) {
            oj0 oj0Var = (oj0) obj;
            if (zj.l.a(this.f33186a, oj0Var.f33186a) && zj.l.a(this.f33187b, oj0Var.f33187b) && zj.l.a(this.f33188c, oj0Var.f33188c) && zj.l.a(this.f33189d, oj0Var.f33189d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zj.l.b(this.f33186a, this.f33187b, this.f33188c, this.f33189d);
    }

    public final String toString() {
        f40 f40Var = this.f33186a;
        a80 a80Var = this.f33187b;
        String strValueOf = String.valueOf(this.f33188c);
        String strValueOf2 = String.valueOf(a80Var);
        String strValueOf3 = String.valueOf(f40Var);
        int length = strValueOf.length();
        StringBuilder sb5 = new StringBuilder(length + 17 + strValueOf2.length() + 13 + strValueOf3.length() + 1);
        sb5.append("[method=");
        sb5.append(strValueOf);
        sb5.append(" headers=");
        sb5.append(strValueOf2);
        sb5.append(" callOptions=");
        sb5.append(strValueOf3);
        sb5.append("]");
        return sb5.toString();
    }
}

package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class y60 extends g70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b70 f34347a;

    public y60(b70 b70Var) {
        this.f34347a = (b70) zj.p.r(b70Var, "result");
    }

    @Override // com.google.android.libraries.places.internal.g70
    public final b70 a(c70 c70Var) {
        return this.f34347a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y60) {
            return this.f34347a.equals(((y60) obj).f34347a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34347a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f34347a);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 19);
        sb5.append("FixedResultPicker(");
        sb5.append(strValueOf);
        sb5.append(")");
        return sb5.toString();
    }
}

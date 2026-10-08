package com.google.android.libraries.places.internal;

import java.net.URI;

/* JADX INFO: loaded from: classes4.dex */
public final class um0 implements vm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URI f33949a;

    @Override // com.google.android.libraries.places.internal.vm0
    public final t80 a(o80 o80Var, l80 l80Var) {
        return o80Var.a(this.f33949a, l80Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof um0) {
            return this.f33949a.equals(((um0) obj).f33949a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33949a.hashCode();
    }

    public final String toString() {
        return this.f33949a.toString();
    }
}

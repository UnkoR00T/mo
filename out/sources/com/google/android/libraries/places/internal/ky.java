package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class ky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32771b;

    ky(Object obj, int i15) {
        this.f32770a = obj;
        this.f32771b = i15;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ky)) {
            return false;
        }
        ky kyVar = (ky) obj;
        return this.f32770a == kyVar.f32770a && this.f32771b == kyVar.f32771b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f32770a) * 65535) + this.f32771b;
    }
}

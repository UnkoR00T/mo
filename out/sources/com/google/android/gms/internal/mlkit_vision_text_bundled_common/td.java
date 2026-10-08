package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30637b;

    public td(int i15, int i16) {
        ul.c(i15 < 32767 && i15 >= 0);
        ul.c(i16 < 32767 && i16 >= 0);
        this.f30636a = i15;
        this.f30637b = i16;
    }

    public final int a() {
        return this.f30637b;
    }

    public final int b() {
        return this.f30636a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof td) {
            td tdVar = (td) obj;
            if (this.f30636a == tdVar.f30636a && this.f30637b == tdVar.f30637b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30636a << 16) | this.f30637b;
    }

    public final String toString() {
        return this.f30636a + "x" + this.f30637b;
    }
}

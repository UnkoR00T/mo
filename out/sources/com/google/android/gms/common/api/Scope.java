package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import jg.s;
import kg.c;

/* JADX INFO: loaded from: classes3.dex */
public final class Scope extends kg.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f29004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29005b;

    Scope(int i15, String str) {
        s.g(str, "scopeUri must not be null or empty");
        this.f29004a = i15;
        this.f29005b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f29005b.equals(((Scope) obj).f29005b);
        }
        return false;
    }

    public String h() {
        return this.f29005b;
    }

    public int hashCode() {
        return this.f29005b.hashCode();
    }

    public String toString() {
        return this.f29005b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f29004a;
        int iA = c.a(parcel);
        c.m(parcel, 1, i16);
        c.u(parcel, 2, h(), false);
        c.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}

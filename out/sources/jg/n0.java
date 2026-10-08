package jg;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends kg.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f102525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final IBinder f102526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gg.a f102527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f102528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f102529e;

    n0(int i15, IBinder iBinder, gg.a aVar, boolean z15, boolean z16) {
        this.f102525a = i15;
        this.f102526b = iBinder;
        this.f102527c = aVar;
        this.f102528d = z15;
        this.f102529e = z16;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f102527c.equals(n0Var.f102527c) && r.a(h(), n0Var.h());
    }

    public final l h() {
        IBinder iBinder = this.f102526b;
        if (iBinder == null) {
            return null;
        }
        return l.a.m3(iBinder);
    }

    public final gg.a m() {
        return this.f102527c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f102525a);
        kg.c.l(parcel, 2, this.f102526b, false);
        kg.c.t(parcel, 3, this.f102527c, i15, false);
        kg.c.c(parcel, 4, this.f102528d);
        kg.c.c(parcel, 5, this.f102529e);
        kg.c.b(parcel, iA);
    }
}

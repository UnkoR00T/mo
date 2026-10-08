package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends kg.a {
    public static final Parcelable.Creator<o> CREATOR = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f30178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f30179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f30180h;

    public o(int i15, int i16, int i17, int i18, int i19, int i25, boolean z15, String str) {
        this.f30173a = i15;
        this.f30174b = i16;
        this.f30175c = i17;
        this.f30176d = i18;
        this.f30177e = i19;
        this.f30178f = i25;
        this.f30179g = z15;
        this.f30180h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f30173a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f30174b);
        kg.c.m(parcel, 3, this.f30175c);
        kg.c.m(parcel, 4, this.f30176d);
        kg.c.m(parcel, 5, this.f30177e);
        kg.c.m(parcel, 6, this.f30178f);
        kg.c.c(parcel, 7, this.f30179g);
        kg.c.u(parcel, 8, this.f30180h, false);
        kg.c.b(parcel, iA);
    }
}

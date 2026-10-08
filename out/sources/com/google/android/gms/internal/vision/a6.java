package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a6 extends kg.a {
    public static final Parcelable.Creator<a6> CREATOR = new b6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f30967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30968e;

    public a6(int i15, int i16, int i17, long j15, int i18) {
        this.f30964a = i15;
        this.f30965b = i16;
        this.f30966c = i17;
        this.f30967d = j15;
        this.f30968e = i18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f30964a);
        kg.c.m(parcel, 3, this.f30965b);
        kg.c.m(parcel, 4, this.f30966c);
        kg.c.r(parcel, 5, this.f30967d);
        kg.c.m(parcel, 6, this.f30968e);
        kg.c.b(parcel, iA);
    }
}

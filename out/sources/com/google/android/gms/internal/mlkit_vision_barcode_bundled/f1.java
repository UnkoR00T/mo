package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends kg.a {
    public static final Parcelable.Creator<f1> CREATOR = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f29714e;

    public f1(int i15, int i16, int i17, int i18, long j15) {
        this.f29710a = i15;
        this.f29711b = i16;
        this.f29712c = i17;
        this.f29713d = i18;
        this.f29714e = j15;
    }

    public final int h() {
        return this.f29712c;
    }

    public final int m() {
        return this.f29710a;
    }

    public final int p() {
        return this.f29713d;
    }

    public final int r() {
        return this.f29711b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f29710a);
        kg.c.m(parcel, 2, this.f29711b);
        kg.c.m(parcel, 3, this.f29712c);
        kg.c.m(parcel, 4, this.f29713d);
        kg.c.r(parcel, 5, this.f29714e);
        kg.c.b(parcel, iA);
    }
}

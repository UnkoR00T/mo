package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends kg.a {
    public static final Parcelable.Creator<t0> CREATOR = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f30235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f30237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f30238e;

    public t0(boolean z15, byte[] bArr, boolean z16, float f15, boolean z17) {
        this.f30234a = z15;
        this.f30235b = bArr;
        this.f30236c = z16;
        this.f30237d = f15;
        this.f30238e = z17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        boolean z15 = this.f30234a;
        int iA = kg.c.a(parcel);
        kg.c.c(parcel, 1, z15);
        kg.c.f(parcel, 2, this.f30235b, false);
        kg.c.c(parcel, 3, this.f30236c);
        kg.c.i(parcel, 4, this.f30237d);
        kg.c.c(parcel, 5, this.f30238e);
        kg.c.b(parcel, iA);
    }
}

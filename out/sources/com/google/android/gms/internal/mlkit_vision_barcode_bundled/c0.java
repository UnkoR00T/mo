package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends kg.a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29658b;

    public c0(int i15, boolean z15) {
        this.f29657a = i15;
        this.f29658b = z15;
    }

    public final int h() {
        return this.f29657a;
    }

    public final boolean m() {
        return this.f29658b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f29657a);
        kg.c.c(parcel, 2, this.f29658b);
        kg.c.b(parcel, iA);
    }
}

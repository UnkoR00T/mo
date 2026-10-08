package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends kg.a {
    public static final Parcelable.Creator<v0> CREATOR = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f30275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30277c;

    public v0(float[] fArr, int i15, boolean z15) {
        this.f30275a = fArr;
        this.f30276b = i15;
        this.f30277c = z15;
    }

    public final int h() {
        return this.f30276b;
    }

    public final boolean m() {
        return this.f30277c;
    }

    public final float[] p() {
        return this.f30275a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        float[] fArr = this.f30275a;
        int iA = kg.c.a(parcel);
        kg.c.j(parcel, 1, fArr, false);
        kg.c.m(parcel, 2, this.f30276b);
        kg.c.c(parcel, 3, this.f30277c);
        kg.c.b(parcel, iA);
    }
}

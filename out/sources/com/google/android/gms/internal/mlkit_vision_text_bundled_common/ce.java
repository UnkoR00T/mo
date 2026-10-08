package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ce extends kg.a {
    public static final Parcelable.Creator<ce> CREATOR = new df();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f30376e;

    public ce(int i15, int i16, int i17, int i18, float f15) {
        this.f30372a = i15;
        this.f30373b = i16;
        this.f30374c = i17;
        this.f30375d = i18;
        this.f30376e = f15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f30372a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, i16);
        kg.c.m(parcel, 3, this.f30373b);
        kg.c.m(parcel, 4, this.f30374c);
        kg.c.m(parcel, 5, this.f30375d);
        kg.c.i(parcel, 6, this.f30376e);
        kg.c.b(parcel, iA);
    }
}

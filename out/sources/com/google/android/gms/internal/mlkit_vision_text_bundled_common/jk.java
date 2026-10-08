package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jk extends kg.a {
    public static final Parcelable.Creator<jk> CREATOR = new kl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi[] f30458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce f30459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ce f30460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f30462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f30463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f30464g;

    public jk(hi[] hiVarArr, ce ceVar, ce ceVar2, String str, float f15, String str2, boolean z15) {
        this.f30458a = hiVarArr;
        this.f30459b = ceVar;
        this.f30460c = ceVar2;
        this.f30461d = str;
        this.f30462e = f15;
        this.f30463f = str2;
        this.f30464g = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        hi[] hiVarArr = this.f30458a;
        int iA = kg.c.a(parcel);
        kg.c.x(parcel, 2, hiVarArr, i15, false);
        kg.c.t(parcel, 3, this.f30459b, i15, false);
        kg.c.t(parcel, 4, this.f30460c, i15, false);
        kg.c.u(parcel, 5, this.f30461d, false);
        kg.c.i(parcel, 6, this.f30462e);
        kg.c.u(parcel, 7, this.f30463f, false);
        kg.c.c(parcel, 8, this.f30464g);
        kg.c.b(parcel, iA);
    }
}

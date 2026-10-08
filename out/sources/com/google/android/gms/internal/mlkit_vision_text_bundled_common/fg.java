package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class fg extends kg.a {
    public static final Parcelable.Creator<fg> CREATOR = new gh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jk[] f30414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce f30415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ce f30416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ce f30417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f30419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f30420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f30421h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f30422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f30423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f30424l;

    public fg(jk[] jkVarArr, ce ceVar, ce ceVar2, ce ceVar3, String str, float f15, String str2, int i15, boolean z15, int i16, int i17) {
        this.f30414a = jkVarArr;
        this.f30415b = ceVar;
        this.f30416c = ceVar2;
        this.f30417d = ceVar3;
        this.f30418e = str;
        this.f30419f = f15;
        this.f30420g = str2;
        this.f30421h = i15;
        this.f30422j = z15;
        this.f30423k = i16;
        this.f30424l = i17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        jk[] jkVarArr = this.f30414a;
        int iA = kg.c.a(parcel);
        kg.c.x(parcel, 2, jkVarArr, i15, false);
        kg.c.t(parcel, 3, this.f30415b, i15, false);
        kg.c.t(parcel, 4, this.f30416c, i15, false);
        kg.c.t(parcel, 5, this.f30417d, i15, false);
        kg.c.u(parcel, 6, this.f30418e, false);
        kg.c.i(parcel, 7, this.f30419f);
        kg.c.u(parcel, 8, this.f30420g, false);
        kg.c.m(parcel, 9, this.f30421h);
        kg.c.c(parcel, 10, this.f30422j);
        kg.c.m(parcel, 11, this.f30423k);
        kg.c.m(parcel, 12, this.f30424l);
        kg.c.b(parcel, iA);
    }
}

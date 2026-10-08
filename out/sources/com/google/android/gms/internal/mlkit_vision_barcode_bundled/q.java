package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends kg.a {
    public static final Parcelable.Creator<q> CREATOR = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f30197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v[] f30200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s[] f30201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f30202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n[] f30203g;

    public q(u uVar, String str, String str2, v[] vVarArr, s[] sVarArr, String[] strArr, n[] nVarArr) {
        this.f30197a = uVar;
        this.f30198b = str;
        this.f30199c = str2;
        this.f30200d = vVarArr;
        this.f30201e = sVarArr;
        this.f30202f = strArr;
        this.f30203g = nVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        u uVar = this.f30197a;
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, uVar, i15, false);
        kg.c.u(parcel, 2, this.f30198b, false);
        kg.c.u(parcel, 3, this.f30199c, false);
        kg.c.x(parcel, 4, this.f30200d, i15, false);
        kg.c.x(parcel, 5, this.f30201e, i15, false);
        kg.c.v(parcel, 6, this.f30202f, false);
        kg.c.x(parcel, 7, this.f30203g, i15, false);
        kg.c.b(parcel, iA);
    }
}

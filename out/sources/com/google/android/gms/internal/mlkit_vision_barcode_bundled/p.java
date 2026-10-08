package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends kg.a {
    public static final Parcelable.Creator<p> CREATOR = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f30193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f30194g;

    public p(String str, String str2, String str3, String str4, String str5, o oVar, o oVar2) {
        this.f30188a = str;
        this.f30189b = str2;
        this.f30190c = str3;
        this.f30191d = str4;
        this.f30192e = str5;
        this.f30193f = oVar;
        this.f30194g = oVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30188a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f30189b, false);
        kg.c.u(parcel, 3, this.f30190c, false);
        kg.c.u(parcel, 4, this.f30191d, false);
        kg.c.u(parcel, 5, this.f30192e, false);
        kg.c.t(parcel, 6, this.f30193f, i15, false);
        kg.c.t(parcel, 7, this.f30194g, i15, false);
        kg.c.b(parcel, iA);
    }
}

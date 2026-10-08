package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends kg.a {
    public static final Parcelable.Creator<u> CREATOR = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f30250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f30251g;

    public u(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f30245a = str;
        this.f30246b = str2;
        this.f30247c = str3;
        this.f30248d = str4;
        this.f30249e = str5;
        this.f30250f = str6;
        this.f30251g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30245a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f30246b, false);
        kg.c.u(parcel, 3, this.f30247c, false);
        kg.c.u(parcel, 4, this.f30248d, false);
        kg.c.u(parcel, 5, this.f30249e, false);
        kg.c.u(parcel, 6, this.f30250f, false);
        kg.c.u(parcel, 7, this.f30251g, false);
        kg.c.b(parcel, iA);
    }
}

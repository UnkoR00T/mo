package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends kg.a {
    public static final Parcelable.Creator<z> CREATOR = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f30322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Point[] f30323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f30324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s f30325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v f30326h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f30327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final y f30328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final x f30329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final t f30330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p f30331n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final q f30332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final r f30333q;

    public z(int i15, String str, String str2, byte[] bArr, Point[] pointArr, int i16, s sVar, v vVar, w wVar, y yVar, x xVar, t tVar, p pVar, q qVar, r rVar) {
        this.f30319a = i15;
        this.f30320b = str;
        this.f30321c = str2;
        this.f30322d = bArr;
        this.f30323e = pointArr;
        this.f30324f = i16;
        this.f30325g = sVar;
        this.f30326h = vVar;
        this.f30327j = wVar;
        this.f30328k = yVar;
        this.f30329l = xVar;
        this.f30330m = tVar;
        this.f30331n = pVar;
        this.f30332p = qVar;
        this.f30333q = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f30319a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.u(parcel, 2, this.f30320b, false);
        kg.c.u(parcel, 3, this.f30321c, false);
        kg.c.f(parcel, 4, this.f30322d, false);
        kg.c.x(parcel, 5, this.f30323e, i15, false);
        kg.c.m(parcel, 6, this.f30324f);
        kg.c.t(parcel, 7, this.f30325g, i15, false);
        kg.c.t(parcel, 8, this.f30326h, i15, false);
        kg.c.t(parcel, 9, this.f30327j, i15, false);
        kg.c.t(parcel, 10, this.f30328k, i15, false);
        kg.c.t(parcel, 11, this.f30329l, i15, false);
        kg.c.t(parcel, 12, this.f30330m, i15, false);
        kg.c.t(parcel, 13, this.f30331n, i15, false);
        kg.c.t(parcel, 14, this.f30332p, i15, false);
        kg.c.t(parcel, 15, this.f30333q, i15, false);
        kg.c.b(parcel, iA);
    }
}

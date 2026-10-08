package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import kg.a;
import xh.c;

/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("wrapper.cc")
public class FaceParcel extends a {

    @RecentlyNonNull
    public static final Parcelable.Creator<FaceParcel> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f31464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f31465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f31466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f31467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f31468h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f31469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @RecentlyNonNull
    public final LandmarkParcel[] f31470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f31471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f31472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f31473n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xh.a[] f31474p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f31475q;

    public FaceParcel(int i15, int i16, float f15, float f16, float f17, float f18, float f19, float f25, float f26, LandmarkParcel[] landmarkParcelArr, float f27, float f28, float f29, xh.a[] aVarArr, float f35) {
        this.f31461a = i15;
        this.f31462b = i16;
        this.f31463c = f15;
        this.f31464d = f16;
        this.f31465e = f17;
        this.f31466f = f18;
        this.f31467g = f19;
        this.f31468h = f25;
        this.f31469j = f26;
        this.f31470k = landmarkParcelArr;
        this.f31471l = f27;
        this.f31472m = f28;
        this.f31473n = f29;
        this.f31474p = aVarArr;
        this.f31475q = f35;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f31461a);
        kg.c.m(parcel, 2, this.f31462b);
        kg.c.i(parcel, 3, this.f31463c);
        kg.c.i(parcel, 4, this.f31464d);
        kg.c.i(parcel, 5, this.f31465e);
        kg.c.i(parcel, 6, this.f31466f);
        kg.c.i(parcel, 7, this.f31467g);
        kg.c.i(parcel, 8, this.f31468h);
        kg.c.x(parcel, 9, this.f31470k, i15, false);
        kg.c.i(parcel, 10, this.f31471l);
        kg.c.i(parcel, 11, this.f31472m);
        kg.c.i(parcel, 12, this.f31473n);
        kg.c.x(parcel, 13, this.f31474p, i15, false);
        kg.c.i(parcel, 14, this.f31469j);
        kg.c.i(parcel, 15, this.f31475q);
        kg.c.b(parcel, iA);
    }

    @UsedByNative("wrapper.cc")
    public FaceParcel(int i15, int i16, float f15, float f16, float f17, float f18, float f19, float f25, @RecentlyNonNull LandmarkParcel[] landmarkParcelArr, float f26, float f27, float f28) {
        this(i15, i16, f15, f16, f17, f18, f19, f25, 0.0f, landmarkParcelArr, f26, f27, f28, new xh.a[0], -1.0f);
    }
}

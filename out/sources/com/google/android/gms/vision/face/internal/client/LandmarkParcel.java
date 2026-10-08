package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import kg.a;
import kg.c;
import xh.d;

/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("wrapper.cc")
public final class LandmarkParcel extends a {

    @RecentlyNonNull
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f31477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31479d;

    @UsedByNative("wrapper.cc")
    public LandmarkParcel(int i15, float f15, float f16, int i16) {
        this.f31476a = i15;
        this.f31477b = f15;
        this.f31478c = f16;
        this.f31479d = i16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i15) {
        int iA = c.a(parcel);
        c.m(parcel, 1, this.f31476a);
        c.i(parcel, 2, this.f31477b);
        c.i(parcel, 3, this.f31478c);
        c.m(parcel, 4, this.f31479d);
        c.b(parcel, iA);
    }
}

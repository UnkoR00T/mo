package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import jg.r;
import jg.s;
import kg.a;
import kg.c;
import nh.q;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f31419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f31420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f31422d;

    public CameraPosition(LatLng latLng, float f15, float f16, float f17) {
        s.m(latLng, "camera target must not be null.");
        boolean z15 = false;
        if (f16 >= 0.0f && f16 <= 90.0f) {
            z15 = true;
        }
        s.c(z15, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f16));
        this.f31419a = latLng;
        this.f31420b = f15;
        this.f31421c = f16 + 0.0f;
        this.f31422d = (((double) f17) <= 0.0d ? (f17 % 360.0f) + 360.0f : f17) % 360.0f;
    }

    public static final CameraPosition h(LatLng latLng, float f15) {
        return new CameraPosition(latLng, f15, 0.0f, 0.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f31419a.equals(cameraPosition.f31419a) && Float.floatToIntBits(this.f31420b) == Float.floatToIntBits(cameraPosition.f31420b) && Float.floatToIntBits(this.f31421c) == Float.floatToIntBits(cameraPosition.f31421c) && Float.floatToIntBits(this.f31422d) == Float.floatToIntBits(cameraPosition.f31422d);
    }

    public int hashCode() {
        return r.b(this.f31419a, Float.valueOf(this.f31420b), Float.valueOf(this.f31421c), Float.valueOf(this.f31422d));
    }

    public String toString() {
        return r.c(this).a("target", this.f31419a).a("zoom", Float.valueOf(this.f31420b)).a("tilt", Float.valueOf(this.f31421c)).a("bearing", Float.valueOf(this.f31422d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        LatLng latLng = this.f31419a;
        int iA = c.a(parcel);
        c.t(parcel, 2, latLng, i15, false);
        c.i(parcel, 3, this.f31420b);
        c.i(parcel, 4, this.f31421c);
        c.i(parcel, 5, this.f31422d);
        c.b(parcel, iA);
    }
}

package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import kg.a;
import kg.c;
import nh.u;

/* JADX INFO: loaded from: classes3.dex */
public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f31423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f31424b;

    public LatLng(double d15, double d16) {
        if (d16 < -180.0d || d16 >= 180.0d) {
            this.f31424b = ((((d16 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f31424b = d16;
        }
        this.f31423a = Math.max(-90.0d, Math.min(90.0d, d15));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f31423a) == Double.doubleToLongBits(latLng.f31423a) && Double.doubleToLongBits(this.f31424b) == Double.doubleToLongBits(latLng.f31424b);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f31423a);
        long j15 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f31424b);
        return ((((int) j15) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f31423a + "," + this.f31424b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        double d15 = this.f31423a;
        int iA = c.a(parcel);
        c.h(parcel, 2, d15);
        c.h(parcel, 3, this.f31424b);
        c.b(parcel, iA);
    }
}

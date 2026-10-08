package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import jg.r;
import jg.s;
import kg.c;
import nh.t;

/* JADX INFO: loaded from: classes3.dex */
public final class LatLngBounds extends kg.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f31425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f31426b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f31427a = Double.POSITIVE_INFINITY;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f31428b = Double.NEGATIVE_INFINITY;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f31429c = Double.NaN;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private double f31430d = Double.NaN;

        public LatLngBounds a() {
            s.p(!Double.isNaN(this.f31429c), "no included points");
            return new LatLngBounds(new LatLng(this.f31427a, this.f31429c), new LatLng(this.f31428b, this.f31430d));
        }

        public a b(LatLng latLng) {
            s.m(latLng, "point must not be null");
            this.f31427a = Math.min(this.f31427a, latLng.f31423a);
            this.f31428b = Math.max(this.f31428b, latLng.f31423a);
            double d15 = latLng.f31424b;
            if (Double.isNaN(this.f31429c)) {
                this.f31429c = d15;
                this.f31430d = d15;
                return this;
            }
            double d16 = this.f31429c;
            double d17 = this.f31430d;
            if (d16 > d17 ? !(d16 <= d15 || d15 <= d17) : !(d16 <= d15 && d15 <= d17)) {
                Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                if (((d16 - d15) + 360.0d) % 360.0d < ((d15 - d17) + 360.0d) % 360.0d) {
                    this.f31429c = d15;
                    return this;
                }
                this.f31430d = d15;
            }
            return this;
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        s.m(latLng, "southwest must not be null.");
        s.m(latLng2, "northeast must not be null.");
        double d15 = latLng2.f31423a;
        double d16 = latLng.f31423a;
        s.c(d15 >= d16, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d16), Double.valueOf(latLng2.f31423a));
        this.f31425a = latLng;
        this.f31426b = latLng2;
    }

    public static a h() {
        return new a();
    }

    private final boolean p(double d15) {
        LatLng latLng = this.f31426b;
        double d16 = this.f31425a.f31424b;
        double d17 = latLng.f31424b;
        if (d16 <= d17) {
            return d16 <= d15 && d15 <= d17;
        }
        return d16 <= d15 || d15 <= d17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f31425a.equals(latLngBounds.f31425a) && this.f31426b.equals(latLngBounds.f31426b);
    }

    public int hashCode() {
        return r.b(this.f31425a, this.f31426b);
    }

    public boolean m(LatLng latLng) {
        LatLng latLng2 = (LatLng) s.m(latLng, "point must not be null.");
        double d15 = latLng2.f31423a;
        return this.f31425a.f31423a <= d15 && d15 <= this.f31426b.f31423a && p(latLng2.f31424b);
    }

    public String toString() {
        return r.c(this).a("southwest", this.f31425a).a("northeast", this.f31426b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        LatLng latLng = this.f31425a;
        int iA = c.a(parcel);
        c.t(parcel, 2, latLng, i15, false);
        c.t(parcel, 3, this.f31426b, i15, false);
        c.b(parcel, iA);
    }
}

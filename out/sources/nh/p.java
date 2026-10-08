package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends kg.a {
    public static final Parcelable.Creator<p> CREATOR = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f136311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f136312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LatLng f136313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LatLng f136314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LatLngBounds f136315e;

    public p(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f136311a = latLng;
        this.f136312b = latLng2;
        this.f136313c = latLng3;
        this.f136314d = latLng4;
        this.f136315e = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f136311a.equals(pVar.f136311a) && this.f136312b.equals(pVar.f136312b) && this.f136313c.equals(pVar.f136313c) && this.f136314d.equals(pVar.f136314d) && this.f136315e.equals(pVar.f136315e);
    }

    public int hashCode() {
        return jg.r.b(this.f136311a, this.f136312b, this.f136313c, this.f136314d, this.f136315e);
    }

    public String toString() {
        return jg.r.c(this).a("nearLeft", this.f136311a).a("nearRight", this.f136312b).a("farLeft", this.f136313c).a("farRight", this.f136314d).a("latLngBounds", this.f136315e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        LatLng latLng = this.f136311a;
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 2, latLng, i15, false);
        kg.c.t(parcel, 3, this.f136312b, i15, false);
        kg.c.t(parcel, 4, this.f136313c, i15, false);
        kg.c.t(parcel, 5, this.f136314d, i15, false);
        kg.c.t(parcel, 6, this.f136315e, i15, false);
        kg.c.b(parcel, iA);
    }
}

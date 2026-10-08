package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends kg.a {
    public static final Parcelable.Creator<k> CREATOR = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f136295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136297c;

    public k(LatLng latLng, String str, String str2) {
        this.f136295a = latLng;
        this.f136296b = str;
        this.f136297c = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        LatLng latLng = this.f136295a;
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 2, latLng, i15, false);
        kg.c.u(parcel, 3, this.f136296b, false);
        kg.c.u(parcel, 4, this.f136297c, false);
        kg.c.b(parcel, iA);
    }
}

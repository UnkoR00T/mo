package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import jg.r;
import kh.l;

/* JADX INFO: loaded from: classes3.dex */
public final class LocationAvailability extends kg.a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f31366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l[] f31367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LocationAvailability f31361f = new LocationAvailability(0, 1, 1, 0, null, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LocationAvailability f31362g = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();

    LocationAvailability(int i15, int i16, int i17, long j15, l[] lVarArr, boolean z15) {
        this.f31366d = i15 < 1000 ? 0 : 1000;
        this.f31363a = i16;
        this.f31364b = i17;
        this.f31365c = j15;
        this.f31367e = lVarArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f31363a == locationAvailability.f31363a && this.f31364b == locationAvailability.f31364b && this.f31365c == locationAvailability.f31365c && this.f31366d == locationAvailability.f31366d && Arrays.equals(this.f31367e, locationAvailability.f31367e)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.f31366d < 1000;
    }

    public int hashCode() {
        return r.b(Integer.valueOf(this.f31366d));
    }

    public String toString() {
        boolean zH = h();
        StringBuilder sb5 = new StringBuilder(String.valueOf(zH).length() + 22);
        sb5.append("LocationAvailability[");
        sb5.append(zH);
        sb5.append("]");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f31363a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f31364b);
        kg.c.r(parcel, 3, this.f31365c);
        kg.c.m(parcel, 4, this.f31366d);
        kg.c.x(parcel, 5, this.f31367e, i15, false);
        kg.c.c(parcel, 6, h());
        kg.c.b(parcel, iA);
    }
}

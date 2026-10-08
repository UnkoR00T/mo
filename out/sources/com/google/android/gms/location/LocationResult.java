package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jg.r;
import kh.k;

/* JADX INFO: loaded from: classes3.dex */
public final class LocationResult extends kg.a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final List f31396b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new c();

    LocationResult(List list) {
        this.f31397a = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (Build.VERSION.SDK_INT >= 31) {
            return this.f31397a.equals(locationResult.f31397a);
        }
        if (this.f31397a.size() != locationResult.f31397a.size()) {
            return false;
        }
        Iterator it = locationResult.f31397a.iterator();
        for (Location location : this.f31397a) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !r.a(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public Location h() {
        int size = this.f31397a.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f31397a.get(size - 1);
    }

    public int hashCode() {
        return r.b(this.f31397a);
    }

    public List<Location> m() {
        return this.f31397a;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder("LocationResult");
        int i15 = k.f110945d;
        List list = this.f31397a;
        sb5.ensureCapacity(list.size() * 100);
        sb5.append("[");
        Iterator it = list.iterator();
        boolean z15 = false;
        while (it.hasNext()) {
            k.a((Location) it.next(), sb5);
            sb5.append(", ");
            z15 = true;
        }
        if (z15) {
            sb5.setLength(sb5.length() - 2);
        }
        sb5.append("]");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.y(parcel, 1, m(), false);
        kg.c.b(parcel, iA);
    }
}

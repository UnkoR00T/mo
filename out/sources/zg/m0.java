package zg;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class m0 extends kg.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LocationRequest f235096a;

    m0(LocationRequest locationRequest, List list, boolean z15, boolean z16, boolean z17, boolean z18, String str, long j15) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jg.d dVar = (jg.d) it.next();
                    com.google.android.gms.common.util.m.a(workSource, dVar.f102437a, dVar.f102438b);
                }
            }
            aVar.n(workSource);
        }
        if (z15) {
            aVar.c(1);
        }
        if (z16) {
            aVar.l(2);
        }
        if (z17) {
            aVar.m(true);
        }
        if (z18) {
            aVar.k(true);
        }
        if (j15 != Long.MAX_VALUE) {
            aVar.e(j15);
        }
        this.f235096a = aVar.a();
    }

    @Deprecated
    public static m0 h(String str, LocationRequest locationRequest) {
        return new m0(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            return jg.r.a(this.f235096a, ((m0) obj).f235096a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f235096a.hashCode();
    }

    public final String toString() {
        return this.f235096a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f235096a, i15, false);
        kg.c.b(parcel, iA);
    }
}

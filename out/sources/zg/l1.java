package zg;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends a implements m1 {
    l1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // zg.m1
    public final LocationAvailability M0(String str) {
        Parcel parcelL3 = l3();
        parcelL3.writeString(str);
        Parcel parcelM3 = m3(34, parcelL3);
        LocationAvailability locationAvailability = (LocationAvailability) n.a(parcelM3, LocationAvailability.CREATOR);
        parcelM3.recycle();
        return locationAvailability;
    }

    @Override // zg.m1
    public final void M1(o0 o0Var) {
        Parcel parcelL3 = l3();
        n.b(parcelL3, o0Var);
        n3(59, parcelL3);
    }

    @Override // zg.m1
    public final jg.m R1(kh.a aVar, k0 k0Var) {
        Parcel parcelL3 = l3();
        n.b(parcelL3, aVar);
        n.b(parcelL3, k0Var);
        Parcel parcelM3 = m3(92, parcelL3);
        jg.m mVarM3 = jg.m.a.m3(parcelM3.readStrongBinder());
        parcelM3.recycle();
        return mVarM3;
    }

    @Override // zg.m1
    public final void X(k0 k0Var, ig.f fVar) {
        Parcel parcelL3 = l3();
        n.b(parcelL3, k0Var);
        n.c(parcelL3, fVar);
        n3(89, parcelL3);
    }

    @Override // zg.m1
    public final void Y2(kh.i iVar, k0 k0Var) {
        Parcel parcelL3 = l3();
        n.b(parcelL3, iVar);
        n.b(parcelL3, k0Var);
        n3(91, parcelL3);
    }

    @Override // zg.m1
    public final void r0(k0 k0Var, LocationRequest locationRequest, ig.f fVar) {
        Parcel parcelL3 = l3();
        n.b(parcelL3, k0Var);
        n.b(parcelL3, locationRequest);
        n.c(parcelL3, fVar);
        n3(88, parcelL3);
    }

    @Override // zg.m1
    public final jg.m w1(kh.a aVar, q1 q1Var) {
        Parcel parcelL3 = l3();
        n.b(parcelL3, aVar);
        n.c(parcelL3, q1Var);
        Parcel parcelM3 = m3(87, parcelL3);
        jg.m mVarM3 = jg.m.a.m3(parcelM3.readStrongBinder());
        parcelM3.recycle();
        return mVarM3;
    }
}

package mh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends ah.a implements v0 {
    u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // mh.v0
    public final void F(rg.b bVar) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, bVar);
        n3(11, parcelM3);
    }

    @Override // mh.v0
    public final void F0(rg.b bVar, int i15) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, bVar);
        parcelM3.writeInt(20000000);
        n3(6, parcelM3);
    }

    @Override // mh.v0
    public final d H(rg.b bVar, GoogleMapOptions googleMapOptions) {
        d a1Var;
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, bVar);
        ah.m.c(parcelM3, googleMapOptions);
        Parcel parcelL3 = l3(3, parcelM3);
        IBinder strongBinder = parcelL3.readStrongBinder();
        if (strongBinder == null) {
            a1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            a1Var = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new a1(strongBinder);
        }
        parcelL3.recycle();
        return a1Var;
    }

    @Override // mh.v0
    public final int c() {
        Parcel parcelL3 = l3(9, m3());
        int i15 = parcelL3.readInt();
        parcelL3.recycle();
        return i15;
    }

    @Override // mh.v0
    public final a d() {
        a f0Var;
        Parcel parcelL3 = l3(4, m3());
        IBinder strongBinder = parcelL3.readStrongBinder();
        if (strongBinder == null) {
            f0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            f0Var = iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new f0(strongBinder);
        }
        parcelL3.recycle();
        return f0Var;
    }

    @Override // mh.v0
    public final ah.p k() {
        Parcel parcelL3 = l3(5, m3());
        ah.p pVarM3 = ah.o.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return pVarM3;
    }

    @Override // mh.v0
    public final void o1(rg.b bVar, String str) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, bVar);
        parcelM3.writeString(str);
        n3(12, parcelM3);
    }

    @Override // mh.v0
    public final void p0(rg.b bVar, int i15) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, bVar);
        parcelM3.writeInt(i15);
        n3(10, parcelM3);
    }
}

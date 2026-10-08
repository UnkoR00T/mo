package mh;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends ah.a implements d {
    a1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // mh.d
    public final void Q0(y yVar) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, yVar);
        n3(9, parcelM3);
    }

    @Override // mh.d
    public final void e() {
        n3(13, m3());
    }

    @Override // mh.d
    public final void g() {
        n3(5, m3());
    }

    @Override // mh.d
    public final void h() {
        n3(4, m3());
    }

    @Override // mh.d
    public final rg.b m() {
        Parcel parcelL3 = l3(8, m3());
        rg.b bVarM3 = rg.b.a.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return bVarM3;
    }

    @Override // mh.d
    public final void n() {
        n3(12, m3());
    }

    @Override // mh.d
    public final void onLowMemory() {
        n3(6, m3());
    }

    @Override // mh.d
    public final void s() {
        n3(3, m3());
    }

    @Override // mh.d
    public final void w(Bundle bundle) {
        Parcel parcelM3 = m3();
        ah.m.c(parcelM3, bundle);
        n3(2, parcelM3);
    }
}

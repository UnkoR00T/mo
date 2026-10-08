package mh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends ah.a implements b {
    w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // mh.b
    public final void C0(k kVar) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, kVar);
        n3(32, parcelM3);
    }

    @Override // mh.b
    public final void C1(String str) {
        Parcel parcelM3 = m3();
        parcelM3.writeString(str);
        n3(61, parcelM3);
    }

    @Override // mh.b
    public final void C2(e1 e1Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, e1Var);
        n3(98, parcelM3);
    }

    @Override // mh.b
    public final void E0(i iVar) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, iVar);
        n3(45, parcelM3);
    }

    @Override // mh.b
    public final void G0(float f15) {
        Parcel parcelM3 = m3();
        parcelM3.writeFloat(f15);
        n3(93, parcelM3);
    }

    @Override // mh.b
    public final void G1(rg.b bVar, t0 t0Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, bVar);
        ah.m.d(parcelM3, t0Var);
        n3(6, parcelM3);
    }

    @Override // mh.b
    public final void H1(boolean z15) {
        Parcel parcelM3 = m3();
        int i15 = ah.m.f6293b;
        parcelM3.writeInt(z15 ? 1 : 0);
        n3(41, parcelM3);
    }

    @Override // mh.b
    public final void J1(k1 k1Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, k1Var);
        n3(89, parcelM3);
    }

    @Override // mh.b
    public final f M2() {
        f q0Var;
        Parcel parcelL3 = l3(25, m3());
        IBinder strongBinder = parcelL3.readStrongBinder();
        if (strongBinder == null) {
            q0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            q0Var = iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new q0(strongBinder);
        }
        parcelL3.recycle();
        return q0Var;
    }

    @Override // mh.b
    public final void N0(int i15) {
        Parcel parcelM3 = m3();
        parcelM3.writeInt(i15);
        n3(16, parcelM3);
    }

    @Override // mh.b
    public final boolean N1(boolean z15) {
        Parcel parcelM3 = m3();
        int i15 = ah.m.f6293b;
        parcelM3.writeInt(z15 ? 1 : 0);
        Parcel parcelL3 = l3(20, parcelM3);
        boolean zE = ah.m.e(parcelL3);
        parcelL3.recycle();
        return zE;
    }

    @Override // mh.b
    public final void O(LatLngBounds latLngBounds) {
        Parcel parcelM3 = m3();
        ah.m.c(parcelM3, latLngBounds);
        n3(95, parcelM3);
    }

    @Override // mh.b
    public final void O0(j0 j0Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, j0Var);
        n3(80, parcelM3);
    }

    @Override // mh.b
    public final void O2(n0 n0Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, n0Var);
        n3(87, parcelM3);
    }

    @Override // mh.b
    public final void P0(rg.b bVar, int i15, t0 t0Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, bVar);
        parcelM3.writeInt(i15);
        ah.m.d(parcelM3, t0Var);
        n3(7, parcelM3);
    }

    @Override // mh.b
    public final void S(e0 e0Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, e0Var);
        n3(37, parcelM3);
    }

    @Override // mh.b
    public final void V(m1 m1Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, m1Var);
        n3(83, parcelM3);
    }

    @Override // mh.b
    public final void V2(y0 y0Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, y0Var);
        n3(33, parcelM3);
    }

    @Override // mh.b
    public final void X1(int i15, int i16, int i17, int i18) {
        Parcel parcelM3 = m3();
        parcelM3.writeInt(i15);
        parcelM3.writeInt(i16);
        parcelM3.writeInt(i17);
        parcelM3.writeInt(i18);
        n3(39, parcelM3);
    }

    @Override // mh.b
    public final void Z2(w wVar) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, wVar);
        n3(29, parcelM3);
    }

    @Override // mh.b
    public final void a2(c0 c0Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, c0Var);
        n3(31, parcelM3);
    }

    @Override // mh.b
    public final void a3(boolean z15) {
        Parcel parcelM3 = m3();
        int i15 = ah.m.f6293b;
        parcelM3.writeInt(z15 ? 1 : 0);
        n3(22, parcelM3);
    }

    @Override // mh.b
    public final void c1(a0 a0Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, a0Var);
        n3(30, parcelM3);
    }

    @Override // mh.b
    public final void c3(m mVar) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, mVar);
        n3(86, parcelM3);
    }

    @Override // mh.b
    public final void clear() {
        n3(14, m3());
    }

    @Override // mh.b
    public final void e0(h0 h0Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, h0Var);
        n3(107, parcelM3);
    }

    @Override // mh.b
    public final void f1(o oVar) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, oVar);
        n3(84, parcelM3);
    }

    @Override // mh.b
    public final void g3(u uVar) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, uVar);
        n3(42, parcelM3);
    }

    @Override // mh.b
    public final ah.e h1(nh.i iVar) {
        Parcel parcelM3 = m3();
        ah.m.c(parcelM3, iVar);
        Parcel parcelL3 = l3(11, parcelM3);
        ah.e eVarM3 = ah.d.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return eVarM3;
    }

    @Override // mh.b
    public final boolean i1(nh.g gVar) {
        Parcel parcelM3 = m3();
        ah.m.c(parcelM3, gVar);
        Parcel parcelL3 = l3(91, parcelM3);
        boolean zE = ah.m.e(parcelL3);
        parcelL3.recycle();
        return zE;
    }

    @Override // mh.b
    public final ah.h i3(nh.m mVar) {
        Parcel parcelM3 = m3();
        ah.m.c(parcelM3, mVar);
        Parcel parcelL3 = l3(10, parcelM3);
        ah.h hVarM3 = ah.g.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return hVarM3;
    }

    @Override // mh.b
    public final void j0(l0 l0Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, l0Var);
        n3(85, parcelM3);
    }

    @Override // mh.b
    public final void j1(int i15) {
        Parcel parcelM3 = m3();
        parcelM3.writeInt(i15);
        n3(113, parcelM3);
    }

    @Override // mh.b
    public final void k0(c1 c1Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, c1Var);
        n3(99, parcelM3);
    }

    @Override // mh.b
    public final CameraPosition n0() {
        Parcel parcelL3 = l3(1, m3());
        CameraPosition cameraPosition = (CameraPosition) ah.m.a(parcelL3, CameraPosition.CREATOR);
        parcelL3.recycle();
        return cameraPosition;
    }

    @Override // mh.b
    public final void o2(s sVar) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, sVar);
        n3(28, parcelM3);
    }

    @Override // mh.b
    public final void r2(rg.b bVar) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, bVar);
        n3(4, parcelM3);
    }

    @Override // mh.b
    public final void u1() {
        n3(8, m3());
    }

    @Override // mh.b
    public final e v() {
        e o0Var;
        Parcel parcelL3 = l3(26, m3());
        IBinder strongBinder = parcelL3.readStrongBinder();
        if (strongBinder == null) {
            o0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            o0Var = iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new o0(strongBinder);
        }
        parcelL3.recycle();
        return o0Var;
    }

    @Override // mh.b
    public final void v2(g1 g1Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, g1Var);
        n3(97, parcelM3);
    }

    @Override // mh.b
    public final void w2(boolean z15) {
        Parcel parcelM3 = m3();
        int i15 = ah.m.f6293b;
        parcelM3.writeInt(z15 ? 1 : 0);
        n3(18, parcelM3);
    }

    @Override // mh.b
    public final void x0(i1 i1Var) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, i1Var);
        n3(96, parcelM3);
    }

    @Override // mh.b
    public final void x2(float f15) {
        Parcel parcelM3 = m3();
        parcelM3.writeFloat(f15);
        n3(92, parcelM3);
    }

    @Override // mh.b
    public final void z(c cVar) {
        Parcel parcelM3 = m3();
        ah.m.d(parcelM3, cVar);
        n3(24, parcelM3);
    }
}

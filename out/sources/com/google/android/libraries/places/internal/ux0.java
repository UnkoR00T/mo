package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes4.dex */
final class ux0 {
    ux0() {
    }

    static final f30 a(LatLng latLng) {
        e30 e30VarK = f30.K();
        e30VarK.A(latLng.f31423a);
        e30VarK.D(latLng.f31424b);
        return (f30) e30VarK.H0();
    }

    static final zr b(ii.j jVar) {
        LatLng latLngA = jVar.a();
        yr yrVarI = zr.I();
        e30 e30VarK = f30.K();
        e30VarK.A(latLngA.f31423a);
        e30VarK.D(latLngA.f31424b);
        yrVarI.A(e30VarK);
        yrVarI.D(jVar.b());
        return (zr) yrVarI.H0();
    }

    static final fp c(ii.q0 q0Var) {
        LatLng latLngB = q0Var.b();
        LatLng latLngA = q0Var.a();
        ep epVarK = fp.K();
        e30 e30VarK = f30.K();
        e30VarK.A(latLngB.f31423a);
        e30VarK.D(latLngB.f31424b);
        epVarK.A((f30) e30VarK.H0());
        e30 e30VarK2 = f30.K();
        e30VarK2.A(latLngA.f31423a);
        e30VarK2.D(latLngA.f31424b);
        epVarK.D((f30) e30VarK2.H0());
        return (fp) epVarK.H0();
    }
}

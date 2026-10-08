package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yz f34578a;

    private zz(u10 u10Var, Object obj, u10 u10Var2, Object obj2) {
        this.f34578a = new yz(u10Var, obj, u10Var2, obj2);
    }

    public static zz a(u10 u10Var, Object obj, u10 u10Var2, Object obj2) {
        return new zz(u10Var, obj, u10Var2, obj2);
    }

    static void b(dy dyVar, yz yzVar, Object obj, Object obj2) {
        qy.i(dyVar, yzVar.f34451a, 1, obj);
        qy.i(dyVar, yzVar.f34453c, 2, obj2);
    }

    static int c(yz yzVar, Object obj, Object obj2) {
        return qy.k(yzVar.f34451a, 1, obj) + qy.k(yzVar.f34453c, 2, obj2);
    }

    public final int d(int i15, Object obj, Object obj2) {
        yz yzVar = this.f34578a;
        int iD = dy.d(i15 << 3);
        int iC = c(yzVar, obj, obj2);
        return iD + dy.d(iC) + iC;
    }

    final yz e() {
        return this.f34578a;
    }
}

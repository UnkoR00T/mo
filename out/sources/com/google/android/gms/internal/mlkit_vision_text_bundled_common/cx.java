package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class cx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bx f30393a;

    private cx(vy vyVar, Object obj, vy vyVar2, Object obj2) {
        this.f30393a = new bx(vyVar, obj, vyVar2, obj2);
    }

    static int b(bx bxVar, Object obj, Object obj2) {
        return qv.a(bxVar.f30366a, 1, obj) + qv.a(bxVar.f30368c, 2, obj2);
    }

    public static cx d(vy vyVar, Object obj, vy vyVar2, Object obj2) {
        return new cx(vyVar, obj, vyVar2, obj2);
    }

    static void e(gv gvVar, bx bxVar, Object obj, Object obj2) {
        qv.k(gvVar, bxVar.f30366a, 1, obj);
        qv.k(gvVar, bxVar.f30368c, 2, obj2);
    }

    public final int a(int i15, Object obj, Object obj2) {
        bx bxVar = this.f30393a;
        int iD = gv.d(i15 << 3);
        int iB = b(bxVar, obj, obj2);
        return iD + gv.d(iB) + iB;
    }

    final bx c() {
        return this.f30393a;
    }
}

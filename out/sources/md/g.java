package md;

import r0.c0;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f125641b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0<String, fd.f> f125642a = new c0<>(20);

    g() {
    }

    public static g b() {
        return f125641b;
    }

    public fd.f a(String str) {
        if (str == null) {
            return null;
        }
        return this.f125642a.d(str);
    }

    public void c(String str, fd.f fVar) {
        if (str == null) {
            return;
        }
        this.f125642a.e(str, fVar);
    }
}

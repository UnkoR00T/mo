package ge4;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Executor f72418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final u f72419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final c f72420c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f72418a = null;
            f72419b = new u();
            f72420c = new c();
        } else if (property.equals("Dalvik")) {
            f72418a = new a();
            f72419b = new u.a();
            f72420c = new c.a();
        } else {
            f72418a = null;
            f72419b = new u.b();
            f72420c = new c.a();
        }
    }
}

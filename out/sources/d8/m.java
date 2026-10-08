package d8;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public interface m {

    public static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40306a;

        public a(Throwable th4, int i15) {
            super(th4);
            this.f40306a = i15;
        }
    }

    static void g(m mVar, m mVar2) {
        if (mVar == mVar2) {
            return;
        }
        if (mVar2 != null) {
            mVar2.e(null);
        }
        if (mVar != null) {
            mVar.f(null);
        }
    }

    UUID a();

    default boolean b() {
        return false;
    }

    a c();

    z7.b d();

    void e(t.a aVar);

    void f(t.a aVar);

    int getState();

    Map<String, String> h();

    boolean i(String str);
}

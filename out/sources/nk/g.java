package nk;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f137052b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f137053c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<qk.b> f137054a = new AtomicReference<>();

    private static class b implements qk.b {
        private b() {
        }

        @Override // qk.b
        public qk.b.a a(qk.c cVar, String str, String str2) {
            return f.f137050a;
        }
    }

    public static g b() {
        return f137052b;
    }

    public qk.b a() {
        qk.b bVar = this.f137054a.get();
        return bVar == null ? f137053c : bVar;
    }
}

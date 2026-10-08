package androidx.recyclerview.widget;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f13227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f13228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h.f<T> f13229c;

    public static final class a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Object f13230d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Executor f13231e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Executor f13232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Executor f13233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h.f<T> f13234c;

        public a(h.f<T> fVar) {
            this.f13234c = fVar;
        }

        public c<T> a() {
            if (this.f13233b == null) {
                synchronized (f13230d) {
                    try {
                        if (f13231e == null) {
                            f13231e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                this.f13233b = f13231e;
            }
            return new c<>(this.f13232a, this.f13233b, this.f13234c);
        }
    }

    c(Executor executor, Executor executor2, h.f<T> fVar) {
        this.f13227a = executor;
        this.f13228b = executor2;
        this.f13229c = fVar;
    }

    public Executor a() {
        return this.f13228b;
    }

    public h.f<T> b() {
        return this.f13229c;
    }

    public Executor c() {
        return this.f13227a;
    }
}

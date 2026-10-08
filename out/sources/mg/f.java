package mg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f126325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mg.a f126326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f126327c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f126328a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private mg.a f126329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Executor f126330c;

        public a a(hg.g gVar) {
            this.f126328a.add(gVar);
            return this;
        }

        public f b() {
            return new f(this.f126328a, this.f126329b, this.f126330c, true, null);
        }

        public a c(mg.a aVar) {
            return d(aVar, null);
        }

        public a d(mg.a aVar, Executor executor) {
            this.f126329b = aVar;
            this.f126330c = executor;
            return this;
        }
    }

    /* synthetic */ f(List list, mg.a aVar, Executor executor, boolean z15, byte[] bArr) {
        s.m(list, "APIs must not be null.");
        s.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            s.m(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f126325a = list;
        this.f126326b = aVar;
        this.f126327c = executor;
    }

    public static a d() {
        return new a();
    }

    public List<hg.g> a() {
        return this.f126325a;
    }

    public mg.a b() {
        return this.f126326b;
    }

    public Executor c() {
        return this.f126327c;
    }
}

package v;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d3 f202560b = d3.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e3 f202561c = new e3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v2<d3> f202562a = v2.h(f202560b);

    private static class a<T> implements x2.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i6.a<T> f202563a;

        a(i6.a<T> aVar) {
            this.f202563a = aVar;
        }

        @Override // v.x2.a
        public void a(T t15) {
            this.f202563a.accept(t15);
        }

        @Override // v.x2.a
        public void onError(Throwable th4) {
            o.e1.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th4);
        }
    }

    public static e3 b() {
        return f202561c;
    }

    public d3 a() {
        try {
            return this.f202562a.b().get();
        } catch (InterruptedException | ExecutionException e15) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e15);
        }
    }

    public void c(Executor executor, i6.a<d3> aVar) {
        this.f202562a.a(executor, new a(aVar));
    }

    public void d(d3 d3Var) {
        this.f202562a.g(d3Var);
    }
}

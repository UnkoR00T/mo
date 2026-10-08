package ge4;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class i extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f72312a;

    class a implements e<Object, d<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f72313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f72314b;

        a(Type type, Executor executor) {
            this.f72313a = type;
            this.f72314b = executor;
        }

        @Override // ge4.e
        public Type a() {
            return this.f72313a;
        }

        @Override // ge4.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d<Object> b(d<Object> dVar) {
            Executor executor = this.f72314b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    static final class b<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Executor f72316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<T> f72317b;

        class a implements f<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f72318a;

            a(f fVar) {
                this.f72318a = fVar;
            }

            public static /* synthetic */ void d(a aVar, f fVar, x xVar) {
                if (b.this.f72317b.M()) {
                    fVar.a(b.this, new IOException("Canceled"));
                } else {
                    fVar.b(b.this, xVar);
                }
            }

            @Override // ge4.f
            public void a(d<T> dVar, final Throwable th4) {
                Executor executor = b.this.f72316a;
                final f fVar = this.f72318a;
                executor.execute(new Runnable() { // from class: ge4.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(i.b.this, th4);
                    }
                });
            }

            @Override // ge4.f
            public void b(d<T> dVar, final x<T> xVar) {
                Executor executor = b.this.f72316a;
                final f fVar = this.f72318a;
                executor.execute(new Runnable() { // from class: ge4.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.a.d(this.f72320a, fVar, xVar);
                    }
                });
            }
        }

        b(Executor executor, d<T> dVar) {
            this.f72316a = executor;
            this.f72317b = dVar;
        }

        @Override // ge4.d
        public fv.b0 C() {
            return this.f72317b.C();
        }

        @Override // ge4.d
        public void F1(f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f72317b.F1(new a(fVar));
        }

        @Override // ge4.d
        public boolean M() {
            return this.f72317b.M();
        }

        @Override // ge4.d
        public void cancel() {
            this.f72317b.cancel();
        }

        @Override // ge4.d
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public d<T> m39clone() {
            return new b(this.f72316a, this.f72317b.m39clone());
        }
    }

    i(Executor executor) {
        this.f72312a = executor;
    }

    @Override // ge4.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(c0.g(0, (ParameterizedType) type), c0.l(annotationArr, a0.class) ? null : this.f72312a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}

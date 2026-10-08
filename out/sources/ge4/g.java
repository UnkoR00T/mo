package ge4;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
@IgnoreJRERequirement
final class g extends e.a {

    @IgnoreJRERequirement
    private static final class a<R> implements e<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f72305a;

        /* JADX INFO: renamed from: ge4.g$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        private class C1660a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CompletableFuture<R> f72306a;

            public C1660a(CompletableFuture<R> completableFuture) {
                this.f72306a = completableFuture;
            }

            @Override // ge4.f
            public void a(d<R> dVar, Throwable th4) {
                this.f72306a.completeExceptionally(th4);
            }

            @Override // ge4.f
            public void b(d<R> dVar, x<R> xVar) {
                if (xVar.f()) {
                    this.f72306a.complete(xVar.a());
                } else {
                    this.f72306a.completeExceptionally(new m(xVar));
                }
            }
        }

        a(Type type) {
            this.f72305a = type;
        }

        @Override // ge4.e
        public Type a() {
            return this.f72305a;
        }

        @Override // ge4.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.F1(new C1660a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    private static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<?> f72308a;

        b(d<?> dVar) {
            this.f72308a = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z15) {
            if (z15) {
                this.f72308a.cancel();
            }
            return super.cancel(z15);
        }
    }

    @IgnoreJRERequirement
    private static final class c<R> implements e<R, CompletableFuture<x<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f72309a;

        @IgnoreJRERequirement
        private class a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CompletableFuture<x<R>> f72310a;

            public a(CompletableFuture<x<R>> completableFuture) {
                this.f72310a = completableFuture;
            }

            @Override // ge4.f
            public void a(d<R> dVar, Throwable th4) {
                this.f72310a.completeExceptionally(th4);
            }

            @Override // ge4.f
            public void b(d<R> dVar, x<R> xVar) {
                this.f72310a.complete(xVar);
            }
        }

        c(Type type) {
            this.f72309a = type;
        }

        @Override // ge4.e
        public Type a() {
            return this.f72309a;
        }

        @Override // ge4.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<x<R>> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.F1(new a(bVar));
            return bVar;
        }
    }

    g() {
    }

    @Override // ge4.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeB = e.a.b(0, (ParameterizedType) type);
        if (e.a.c(typeB) != x.class) {
            return new a(typeB);
        }
        if (typeB instanceof ParameterizedType) {
            return new c(e.a.b(0, (ParameterizedType) typeB));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}

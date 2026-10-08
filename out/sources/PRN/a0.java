package PRN;

import java.util.concurrent.CancellationException;
import ju.d2;
import ju.g3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001aE\u0010\u0013\u001a\u00020\r\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0017\u001a\u00020\r\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001aO\u0010\u0019\u001a\u00020\r\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001c\u001a\u00020\r\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001d\u001a(\u0010!\u001a\u00020 \"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lju/d2;", "", "tag", "Lcom/google/common/util/concurrent/q;", "Ljava/lang/Void;", "h", "(Lju/d2;Ljava/lang/Object;)Lcom/google/common/util/concurrent/q;", "T", "Lju/w0;", "g", "(Lju/w0;Ljava/lang/Object;)Lcom/google/common/util/concurrent/q;", "Lju/x;", "destination", "Loq/i0;", "s", "(Lju/w0;Lju/x;)V", "R", "Lkotlin/Function1;", "transform", "t", "(Lju/w0;Lju/x;Ler/l;)V", "", "completionCause", "q", "(Lju/w0;Lju/x;Ljava/lang/Throwable;)V", "r", "(Lju/w0;Lju/x;Ljava/lang/Throwable;Ler/l;)V", "cause", "p", "(Lju/x;Ljava/lang/Throwable;)V", "", "timeoutMillis", "", "o", "(Lju/w0;JLtq/e;)Ljava/lang/Object;", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f595e;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f594d = obj;
            this.f595e |= PKIFailureInfo.systemUnavail;
            return a0.o(null, 0L, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class b<T> extends vq.k implements er.p<ju.p0, tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ju.w0<T> f597f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ju.w0<? extends T> w0Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f597f = w0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f596e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.w0<T> w0Var = this.f597f;
            this.f596e = 1;
            Object objI = w0Var.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super T> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f597f, eVar);
        }
    }

    public static final <T> com.google.common.util.concurrent.q<T> g(final ju.w0<? extends T> w0Var, final Object obj) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: PRN.w
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return a0.m(w0Var, obj, aVar);
            }
        });
    }

    public static final com.google.common.util.concurrent.q<Void> h(final d2 d2Var, final Object obj) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: PRN.u
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return a0.k(d2Var, obj, aVar);
            }
        });
    }

    public static /* synthetic */ com.google.common.util.concurrent.q i(ju.w0 w0Var, Object obj, int i15, Object obj2) {
        if ((i15 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return g(w0Var, obj);
    }

    public static /* synthetic */ com.google.common.util.concurrent.q j(d2 d2Var, Object obj, int i15, Object obj2) {
        if ((i15 & 1) != 0) {
            obj = "Job.asListenableFuture";
        }
        return h(d2Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(d2 d2Var, Object obj, final androidx.concurrent.futures.c.a aVar) {
        d2Var.C0(new er.l() { // from class: PRN.x
            @Override // er.l
            public final Object b(Object obj2) {
                return a0.l(aVar, (Throwable) obj2);
            }
        });
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(androidx.concurrent.futures.c.a aVar, Throwable th4) {
        if (th4 == null) {
            aVar.c(null);
        } else if (th4 instanceof CancellationException) {
            aVar.d();
        } else {
            aVar.f(th4);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(final ju.w0 w0Var, Object obj, final androidx.concurrent.futures.c.a aVar) {
        w0Var.C0(new er.l() { // from class: PRN.y
            @Override // er.l
            public final Object b(Object obj2) {
                return a0.n(aVar, w0Var, (Throwable) obj2);
            }
        });
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(androidx.concurrent.futures.c.a aVar, ju.w0 w0Var, Throwable th4) {
        if (th4 == null) {
            aVar.c(w0Var.C());
        } else if (th4 instanceof CancellationException) {
            aVar.d();
        } else {
            aVar.f(th4);
        }
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object o(ju.w0<? extends T> w0Var, long j15, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f595e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f595e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objE = aVar.f594d;
        Object objE2 = uq.b.e();
        int i16 = aVar.f595e;
        if (i16 == 0) {
            oq.u.b(objE);
            b bVar = new b(w0Var, null);
            aVar.f595e = 1;
            objE = g3.e(j15, bVar, aVar);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objE);
        }
        return vq.b.a(objE != null);
    }

    public static final <T> void p(ju.x<T> xVar, Throwable th4) {
        if (th4 instanceof CancellationException) {
            xVar.u((CancellationException) th4);
        } else {
            xVar.p(th4);
        }
    }

    public static final <T> void q(ju.w0<? extends T> w0Var, ju.x<T> xVar, Throwable th4) {
        if (th4 != null) {
            p(xVar, th4);
        } else {
            xVar.d0(w0Var.C());
        }
    }

    public static final <T, R> void r(ju.w0<? extends T> w0Var, ju.x<R> xVar, Throwable th4, er.l<? super T, ? extends R> lVar) {
        if (th4 != null) {
            p(xVar, th4);
        } else {
            xVar.d0(lVar.b(w0Var.C()));
        }
    }

    public static final <T> void s(final ju.w0<? extends T> w0Var, final ju.x<T> xVar) {
        w0Var.C0(new er.l() { // from class: PRN.v
            @Override // er.l
            public final Object b(Object obj) {
                return a0.u(w0Var, xVar, (Throwable) obj);
            }
        });
    }

    public static final <T, R> void t(final ju.w0<? extends T> w0Var, final ju.x<R> xVar, final er.l<? super T, ? extends R> lVar) {
        w0Var.C0(new er.l() { // from class: PRN.z
            @Override // er.l
            public final Object b(Object obj) {
                return a0.v(w0Var, xVar, lVar, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(ju.w0 w0Var, ju.x xVar, Throwable th4) {
        q(w0Var, xVar, th4);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(ju.w0 w0Var, ju.x xVar, er.l lVar, Throwable th4) {
        r(w0Var, xVar, th4, lVar);
        return oq.i0.f148189a;
    }
}

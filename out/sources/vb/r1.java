package vb;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"T", "Lcom/google/common/util/concurrent/q;", "Landroidx/work/c;", "worker", "d", "(Lcom/google/common/util/concurrent/q;Landroidx/work/c;Ltq/e;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/Future;", "future", "e", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "f", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f205868a = ub.w.i("WorkerWrapper");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.l<Throwable, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.c f205869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.q<T> f205870b;

        a(androidx.work.c cVar, com.google.common.util.concurrent.q<T> qVar) {
            this.f205869a = cVar;
            this.f205870b = qVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(Throwable th4) {
            c(th4);
            return oq.i0.f148189a;
        }

        public final void c(Throwable th4) {
            if (th4 instanceof g1) {
                this.f205869a.j(((g1) th4).getReason());
            }
            this.f205870b.cancel(false);
        }
    }

    public static final <T> Object d(com.google.common.util.concurrent.q<T> qVar, androidx.work.c cVar, tq.e<? super T> eVar) throws Throwable {
        try {
            if (qVar.isDone()) {
                return e(qVar);
            }
            ju.p pVar = new ju.p(uq.b.c(eVar), 1);
            pVar.D();
            qVar.b(new b0(qVar, pVar), ub.h.INSTANCE);
            pVar.E(new a(cVar, qVar));
            Object objX = pVar.x();
            if (objX == uq.b.e()) {
                vq.g.c(eVar);
            }
            return objX;
        } catch (ExecutionException e15) {
            throw f(e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> V e(Future<V> future) {
        V v15;
        boolean z15 = false;
        while (true) {
            try {
                v15 = future.get();
                break;
            } catch (InterruptedException unused) {
                z15 = true;
            } catch (Throwable th4) {
                if (z15) {
                    Thread.currentThread().interrupt();
                }
                throw th4;
            }
        }
        if (z15) {
            Thread.currentThread().interrupt();
        }
        return v15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable f(ExecutionException executionException) {
        return executionException.getCause();
    }
}

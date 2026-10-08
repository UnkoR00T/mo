package ub;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ljava/util/concurrent/Executor;", "Lkotlin/Function0;", "block", "Lcom/google/common/util/concurrent/q;", "e", "(Ljava/util/concurrent/Executor;Ler/a;)Lcom/google/common/util/concurrent/q;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> com.google.common.util.concurrent.q<T> e(final Executor executor, final er.a<? extends T> aVar) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: ub.w0
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar2) {
                return z0.f(executor, aVar, aVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(Executor executor, final er.a aVar, final androidx.concurrent.futures.c.a aVar2) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aVar2.a(new Runnable() { // from class: ub.x0
            @Override // java.lang.Runnable
            public final void run() {
                z0.g(atomicBoolean);
            }
        }, h.INSTANCE);
        executor.execute(new Runnable() { // from class: ub.y0
            @Override // java.lang.Runnable
            public final void run() {
                z0.h(atomicBoolean, aVar2, aVar);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AtomicBoolean atomicBoolean, androidx.concurrent.futures.c.a aVar, er.a aVar2) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(aVar2.a());
        } catch (Throwable th4) {
            aVar.f(th4);
        }
    }
}

package ub;

import java.util.concurrent.Executor;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lub/l0;", "tracer", "", AnnotatedPrivateKey.LABEL, "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "Loq/i0;", "block", "Lub/a0;", "c", "(Lub/l0;Ljava/lang/String;Ljava/util/concurrent/Executor;Ler/a;)Lub/a0;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {
    public static final a0 c(final l0 l0Var, final String str, final Executor executor, final er.a<oq.i0> aVar) {
        final androidx.p016lifecycle.b0 b0Var = new androidx.p016lifecycle.b0(a0.f197063b);
        return new b0(b0Var, androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: ub.c0
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar2) {
                return e0.d(executor, l0Var, str, aVar, b0Var, aVar2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(Executor executor, final l0 l0Var, final String str, final er.a aVar, final androidx.p016lifecycle.b0 b0Var, final androidx.concurrent.futures.c.a aVar2) {
        executor.execute(new Runnable() { // from class: ub.d0
            @Override // java.lang.Runnable
            public final void run() {
                e0.e(l0Var, str, aVar, b0Var, aVar2);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(l0 l0Var, String str, er.a aVar, androidx.p016lifecycle.b0 b0Var, androidx.concurrent.futures.c.a aVar2) {
        boolean zIsEnabled = l0Var.isEnabled();
        if (zIsEnabled) {
            try {
                l0Var.a(str);
            } catch (Throwable th4) {
                if (zIsEnabled) {
                    l0Var.d();
                }
                throw th4;
            }
        }
        try {
            aVar.a();
            a0.b.c cVar = a0.f197062a;
            b0Var.m(cVar);
            aVar2.c(cVar);
        } catch (Throwable th5) {
            b0Var.m(new a0.b.a(th5));
            aVar2.f(th5);
        }
        oq.i0 i0Var = oq.i0.f148189a;
        if (zIsEnabled) {
            l0Var.d();
        }
    }
}

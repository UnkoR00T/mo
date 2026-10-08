package androidx.concurrent.futures;

import com.google.common.util.concurrent.q;
import er.l;
import fr.t;
import fr.w;
import java.util.concurrent.ExecutionException;
import ju.p;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"T", "Lcom/google/common/util/concurrent/q;", "b", "(Lcom/google/common/util/concurrent/q;Ltq/e;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "c", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "concurrent-futures-ktx"}, k = 2, mv = {1, 4, 0})
public final class e {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "L;", "it", "Loq/i0;", "invoke", "(L;)V", "kotlin/Throwable", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    static final class a extends w implements l<Throwable, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f11199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar) {
            super(1);
            this.f11199b = qVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            this.f11199b.cancel(false);
        }
    }

    public static final <T> Object b(q<T> qVar, tq.e<? super T> eVar) throws Throwable {
        try {
            if (qVar.isDone()) {
                return androidx.concurrent.futures.a.r(qVar);
            }
            p pVar = new p(uq.b.c(eVar), 1);
            qVar.b(new g(qVar, pVar), d.INSTANCE);
            pVar.E(new a(qVar));
            Object objX = pVar.x();
            if (objX == uq.b.e()) {
                vq.g.c(eVar);
            }
            return objX;
        } catch (ExecutionException e15) {
            throw c(e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            t.h();
        }
        return cause;
    }
}

package tu;

import java.util.concurrent.CancellationException;
import ju.n;
import ju.p;
import oq.i0;
import oq.t;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vh.f;
import vh.l;
import vq.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a(\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"T", "Lvh/l;", "a", "(Lvh/l;Ltq/e;)Ljava/lang/Object;", "Lvh/b;", "cancellationTokenSource", "b", "(Lvh/l;Lvh/b;Ltq/e;)Ljava/lang/Object;", "c", "kotlinx-coroutines-play-services"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<TResult> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<T> f192316a;

        /* JADX WARN: Multi-variable type inference failed */
        a(n<? super T> nVar) {
            this.f192316a = nVar;
        }

        @Override // vh.f
        public final void a(l<T> lVar) {
            Exception excL = lVar.l();
            if (excL != null) {
                e eVar = this.f192316a;
                t.Companion companion = t.INSTANCE;
                eVar.i(t.b(u.a(excL)));
            } else {
                if (lVar.o()) {
                    n.a.a(this.f192316a, null, 1, null);
                    return;
                }
                e eVar2 = this.f192316a;
                t.Companion companion2 = t.INSTANCE;
                eVar2.i(t.b(lVar.m()));
            }
        }
    }

    /* JADX INFO: renamed from: tu.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C5022b implements er.l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ vh.b f192317a;

        C5022b(vh.b bVar) {
            this.f192317a = bVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            this.f192317a.a();
        }
    }

    public static final <T> Object a(l<T> lVar, e<? super T> eVar) {
        return c(lVar, null, eVar);
    }

    public static final <T> Object b(l<T> lVar, vh.b bVar, e<? super T> eVar) {
        return c(lVar, bVar, eVar);
    }

    private static final <T> Object c(l<T> lVar, vh.b bVar, e<? super T> eVar) throws Exception {
        if (!lVar.p()) {
            p pVar = new p(uq.b.c(eVar), 1);
            pVar.D();
            lVar.b(tu.a.f192315a, new a(pVar));
            if (bVar != null) {
                pVar.E(new C5022b(bVar));
            }
            Object objX = pVar.x();
            if (objX == uq.b.e()) {
                g.c(eVar);
            }
            return objX;
        }
        Exception excL = lVar.l();
        if (excL != null) {
            throw excL;
        }
        if (!lVar.o()) {
            return lVar.m();
        }
        throw new CancellationException("Task " + lVar + " was cancelled normally.");
    }
}

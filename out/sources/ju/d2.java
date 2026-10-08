package ju;

import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 ,2\u00020\u0001:\u0001-J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH¦@¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00182\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H'¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\bR\u0014\u0010\"\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\bR\u0014\u0010#\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lju/d2;", "Ltq/i$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "N", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "Loq/i0;", "u", "(Ljava/util/concurrent/CancellationException;)V", "Lju/w;", "child", "Lju/u;", "d1", "(Lju/w;)Lju/u;", "T0", "(Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lju/i1;", "C0", "(Ler/l;)Lju/i1;", "onCancelling", "invokeImmediately", "J", "(ZZLer/l;)Lju/i1;", "h", "isActive", "r", "isCompleted", "isCancelled", "Leu/h;", "getChildren", "()Leu/h;", "children", "Lru/e;", "o1", "()Lru/e;", "onJoin", "a0", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d2 extends tq.i.b {

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f105671a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(d2 d2Var, CancellationException cancellationException, int i15, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i15 & 1) != 0) {
                cancellationException = null;
            }
            d2Var.u(cancellationException);
        }

        public static <R> R b(d2 d2Var, R r15, er.p<? super R, ? super tq.i.b, ? extends R> pVar) {
            return (R) tq.i.b.a.a(d2Var, r15, pVar);
        }

        public static <E extends tq.i.b> E c(d2 d2Var, tq.i.c<E> cVar) {
            return (E) tq.i.b.a.b(d2Var, cVar);
        }

        public static tq.i d(d2 d2Var, tq.i.c<?> cVar) {
            return tq.i.b.a.c(d2Var, cVar);
        }

        public static tq.i e(d2 d2Var, tq.i iVar) {
            return tq.i.b.a.d(d2Var, iVar);
        }
    }

    /* JADX INFO: renamed from: ju.d2$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lju/d2$b;", "Ltq/i$c;", "Lju/d2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements tq.i.c<d2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f105671a = new Companion();

        private Companion() {
        }
    }

    i1 C0(er.l<? super Throwable, oq.i0> handler);

    i1 J(boolean onCancelling, boolean invokeImmediately, er.l<? super Throwable, oq.i0> handler);

    CancellationException N();

    Object T0(tq.e<? super oq.i0> eVar);

    u d1(w child);

    eu.h<d2> getChildren();

    boolean h();

    boolean isCancelled();

    ru.e o1();

    boolean r();

    boolean start();

    void u(CancellationException cause);
}

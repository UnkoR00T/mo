package p076m2;

import er.l;
import er.p;
import ju.n;
import oq.i0;
import oq.t;
import oq.u;
import p071kotlin.Metadata;
import tq.i;
import vq.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lm2/e;", "Lm2/l2;", "Lkotlin/Function0;", "Loq/i0;", "onNewAwaiters", "<init>", "(Ler/a;)V", "", "timeNanos", "e", "(J)V", "R", "Lkotlin/Function1;", "onFrame", "x1", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "a", "Ler/a;", "Ly2/e;", "Lm2/e$a;", "b", "Ly2/e;", "queue", "", "d", "()Z", "hasAwaiters", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onNewAwaiters;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y2.e<a<?>> queue = new y2.e<>();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R$\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0016"}, d2 = {"Lm2/e$a;", "R", "Ly2/e$a;", "Lkotlin/Function1;", "", "onFrame", "Lju/n;", "continuation", "<init>", "(Ler/l;Lju/n;)V", "Loq/i0;", "a", "()V", "", "exception", "b", "(Ljava/lang/Throwable;)V", "timeNanos", "c", "(J)V", "Lju/n;", "Ler/l;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a<R> extends y2.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private n<? super R> continuation;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private l<? super Long, ? extends R> onFrame;

        public a(l<? super Long, ? extends R> lVar, n<? super R> nVar) {
            this.continuation = nVar;
            this.onFrame = lVar;
        }

        @Override // y2.e.a
        public void a() {
            this.onFrame = null;
            this.continuation = null;
        }

        @Override // y2.e.a
        public void b(Throwable exception) {
            n<? super R> nVar = this.continuation;
            if (nVar != null) {
                t.Companion companion = t.INSTANCE;
                nVar.i(t.b(u.a(exception)));
            }
        }

        public final void c(long timeNanos) {
            n<? super R> nVar;
            Object objB;
            l<? super Long, ? extends R> lVar = this.onFrame;
            if (lVar == null || (nVar = this.continuation) == null) {
                return;
            }
            try {
                t.Companion companion = t.INSTANCE;
                objB = t.b(lVar.b(Long.valueOf(timeNanos)));
            } catch (Throwable th4) {
                t.Companion companion2 = t.INSTANCE;
                objB = t.b(u.a(th4));
            }
            nVar.i(objB);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f122841a;

        b(g gVar) {
            this.f122841a = gVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            this.f122841a.cancel();
        }
    }

    public e(er.a<i0> aVar) {
        this.onNewAwaiters = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(long j15, a aVar) {
        aVar.c(j15);
        return i0.f148189a;
    }

    @Override // tq.i
    public /* bridge */ i D1(i.c<?> cVar) {
        return l2.a.c(this, cVar);
    }

    public final boolean d() {
        return this.queue.f();
    }

    public final void e(final long timeNanos) {
        this.queue.e(new l() { // from class: m2.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.f(timeNanos, (e.a) obj);
            }
        });
    }

    @Override // tq.i.b, tq.i
    public /* bridge */ <E extends i.b> E m(i.c<E> cVar) {
        return (E) l2.a.b(this, cVar);
    }

    @Override // tq.i
    public /* bridge */ i n0(i iVar) {
        return l2.a.d(this, iVar);
    }

    @Override // tq.i
    public /* bridge */ <R> R s1(R r15, p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) l2.a.a(this, r15, pVar);
    }

    @Override // p076m2.l2
    public <R> Object x1(l<? super Long, ? extends R> lVar, tq.e<? super R> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        pVar.E(new b(this.queue.b(new a(lVar, pVar), this.onNewAwaiters)));
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            g.c(eVar);
        }
        return objX;
    }
}

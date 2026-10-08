package androidx.compose.ui.platform;

import android.view.Choreographer;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/l0;", "Lm2/l2;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/j0;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/j0;)V", "R", "Lkotlin/Function1;", "", "onFrame", "x1", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "a", "Landroid/view/Choreographer;", "()Landroid/view/Choreographer;", "b", "Landroidx/compose/ui/platform/j0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 implements p076m2.l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j0 dispatcher;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<Throwable, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f10658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f10659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j0 j0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f10658b = j0Var;
            this.f10659c = frameCallback;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(Throwable th4) {
            c(th4);
            return oq.i0.f148189a;
        }

        public final void c(Throwable th4) {
            this.f10658b.i3(this.f10659c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<Throwable, oq.i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f10661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f10661c = frameCallback;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(Throwable th4) {
            c(th4);
            return oq.i0.f148189a;
        }

        public final void c(Throwable th4) {
            l0.this.getChoreographer().removeFrameCallback(this.f10661c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTimeNanos", "Loq/i0;", "doFrame", "(J)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<R> f10662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f10663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.l<Long, R> f10664c;

        /* JADX WARN: Multi-variable type inference failed */
        c(ju.n<? super R> nVar, l0 l0Var, er.l<? super Long, ? extends R> lVar) {
            this.f10662a = nVar;
            this.f10663b = l0Var;
            this.f10664c = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j15) {
            Object objB;
            tq.e eVar = this.f10662a;
            er.l<Long, R> lVar = this.f10664c;
            try {
                oq.t.Companion companion = oq.t.INSTANCE;
                objB = oq.t.b(lVar.b(Long.valueOf(j15)));
            } catch (Throwable th4) {
                oq.t.Companion companion2 = oq.t.INSTANCE;
                objB = oq.t.b(oq.u.a(th4));
            }
            eVar.i(objB);
        }
    }

    public l0(Choreographer choreographer, j0 j0Var) {
        this.choreographer = choreographer;
        this.dispatcher = j0Var;
    }

    @Override // tq.i
    public /* bridge */ tq.i D1(tq.i.c<?> cVar) {
        return m2.l2.a.c(this, cVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // tq.i.b, tq.i
    public /* bridge */ <E extends tq.i.b> E m(tq.i.c<E> cVar) {
        return (E) m2.l2.a.b(this, cVar);
    }

    @Override // tq.i
    public /* bridge */ tq.i n0(tq.i iVar) {
        return m2.l2.a.d(this, iVar);
    }

    @Override // tq.i
    public /* bridge */ <R> R s1(R r15, er.p<? super R, ? super tq.i.b, ? extends R> pVar) {
        return (R) m2.l2.a.a(this, r15, pVar);
    }

    @Override // p076m2.l2
    public <R> Object x1(er.l<? super Long, ? extends R> lVar, tq.e<? super R> eVar) {
        j0 j0Var = this.dispatcher;
        if (j0Var == null) {
            tq.i.b bVarM = eVar.getContext().m(tq.f.INSTANCE);
            j0Var = bVarM instanceof j0 ? (j0) bVarM : null;
        }
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        c cVar = new c(pVar, this, lVar);
        if (j0Var == null || !fr.t.c(j0Var.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(cVar);
            pVar.E(new b(cVar));
        } else {
            j0Var.e3(cVar);
            pVar.E(new a(j0Var, cVar));
        }
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }
}

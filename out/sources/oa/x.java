package oa;

import java.util.concurrent.RejectedExecutionException;
import ju.b3;
import ju.p0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0082@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"R", "Loa/u;", "Lkotlin/Function1;", "Ltq/e;", "", "block", "e", "(Loa/u;Ler/l;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lju/p0;", "transactionBlock", "d", "(Loa/u;Ler/p;Ltq/e;)Ljava/lang/Object;", "Ltq/f;", "dispatcher", "Ltq/i;", "c", "(Loa/u;Ltq/f;)Ltq/i;", "b", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
final /* synthetic */ class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<R> f143811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f143812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.p<p0, tq.e<? super R>, Object> f143813c;

        /* JADX INFO: renamed from: oa.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C3570a extends vq.k implements er.p<p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f143814e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f143815f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u f143816g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ ju.n<R> f143817h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ er.p<p0, tq.e<? super R>, Object> f143818j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C3570a(u uVar, ju.n<? super R> nVar, er.p<? super p0, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super C3570a> eVar) {
                super(2, eVar);
                this.f143816g = uVar;
                this.f143817h = nVar;
                this.f143818j = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                tq.e eVar;
                Object objE = uq.b.e();
                int i15 = this.f143814e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    tq.i iVarC = x.c(this.f143816g, (tq.f) ((p0) this.f143815f).getCoroutineContext().m(tq.f.INSTANCE));
                    tq.e eVar2 = this.f143817h;
                    oq.t.Companion companion = oq.t.INSTANCE;
                    er.p<p0, tq.e<? super R>, Object> pVar = this.f143818j;
                    this.f143815f = eVar2;
                    this.f143814e = 1;
                    obj = ju.i.g(iVarC, pVar, this);
                    if (obj == objE) {
                        return objE;
                    }
                    eVar = eVar2;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (tq.e) this.f143815f;
                    oq.u.b(obj);
                }
                eVar.i(oq.t.b(obj));
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((C3570a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                C3570a c3570a = new C3570a(this.f143816g, this.f143817h, this.f143818j, eVar);
                c3570a.f143815f = obj;
                return c3570a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(ju.n<? super R> nVar, u uVar, er.p<? super p0, ? super tq.e<? super R>, ? extends Object> pVar) {
            this.f143811a = nVar;
            this.f143812b = uVar;
            this.f143813c = pVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ju.i.e(this.f143811a.getContext().D1(tq.f.INSTANCE), new C3570a(this.f143812b, this.f143811a, this.f143813c, null));
            } catch (Throwable th4) {
                this.f143811a.Q(th4);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class b<R> extends vq.k implements er.p<p0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f143819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f143820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super R>, Object> f143821g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f143821g = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f143819e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            if (((p0) this.f143820f).getCoroutineContext().m(c0.INSTANCE) == null) {
                throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
            }
            er.l<tq.e<? super R>, Object> lVar = this.f143821g;
            this.f143819e = 1;
            Object objB = lVar.b(this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super R> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f143821g, eVar);
            bVar.f143820f = obj;
            return bVar;
        }
    }

    public static final <R> Object b(u uVar, er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super R> eVar) {
        if ((!uVar.H() || !uVar.O() || !uVar.I()) && eVar.getContext().m(y.f143822a) != null) {
            return v.e(uVar, lVar, eVar);
        }
        return lVar.b(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tq.i c(u uVar, tq.f fVar) {
        tq.i iVarN0 = fVar.n0(new c0(fVar));
        return iVarN0.n0(b3.a(uVar.C(), iVarN0));
    }

    private static final <R> Object d(u uVar, er.p<? super p0, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) {
        ju.p pVar2 = new ju.p(uq.b.c(eVar), 1);
        pVar2.D();
        try {
            uVar.E().execute(new a(pVar2, uVar, pVar));
        } catch (RejectedExecutionException e15) {
            pVar2.Q(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e15));
        }
        Object objX = pVar2.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    public static final <R> Object e(u uVar, er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super R> eVar) {
        b bVar = new b(lVar, null);
        c0 c0Var = (c0) eVar.getContext().m(c0.INSTANCE);
        tq.f transactionDispatcher = c0Var != null ? c0Var.getTransactionDispatcher() : null;
        return transactionDispatcher != null ? ju.i.g(transactionDispatcher, bVar, eVar) : d(uVar, bVar, eVar);
    }
}

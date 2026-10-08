package lu;

import ju.d2;
import ju.j0;
import ju.p0;
import ju.r0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0093\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016j\u0004\u0018\u0001`\u00182*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Llu/w;", "Lkotlin/Function0;", "Loq/i0;", "block", "b", "(Llu/w;Ler/a;Ltq/e;)Ljava/lang/Object;", "E", "Lju/p0;", "Ltq/i;", "context", "", "capacity", "Lkotlin/Function2;", "Ltq/e;", "", "Llu/y;", "e", "(Lju/p0;Ltq/i;ILer/p;)Llu/y;", "Llu/a;", "onBufferOverflow", "Lju/r0;", "start", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "f", "(Lju/p0;Ltq/i;ILlu/a;Lju/r0;Ler/l;Ler/p;)Llu/y;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f120476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f120477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120478f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f120479g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f120478f = obj;
            this.f120479g |= PKIFailureInfo.systemUnavail;
            return u.b(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements er.l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<i0> f120480a;

        /* JADX WARN: Multi-variable type inference failed */
        b(ju.n<? super i0> nVar) {
            this.f120480a = nVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            ju.n<i0> nVar = this.f120480a;
            oq.t.Companion companion = oq.t.INSTANCE;
            nVar.i(oq.t.b(i0.f148189a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(w<?> wVar, er.a<i0> aVar, tq.e<? super i0> eVar) throws Throwable {
        a aVar2;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i15 = aVar2.f120479g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f120479g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object obj = aVar2.f120478f;
        Object objE = uq.b.e();
        int i16 = aVar2.f120479g;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                if (aVar2.getContext().m(d2.INSTANCE) != wVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                aVar2.f120476d = wVar;
                aVar2.f120477e = aVar;
                aVar2.f120479g = 1;
                ju.p pVar = new ju.p(uq.b.c(aVar2), 1);
                pVar.D();
                wVar.g(new b(pVar));
                Object objX = pVar.x();
                if (objX == uq.b.e()) {
                    vq.g.c(aVar2);
                }
                if (objX == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (er.a) aVar2.f120477e;
                oq.u.b(obj);
            }
            aVar.a();
            return i0.f148189a;
        } catch (Throwable th4) {
            aVar.a();
            throw th4;
        }
    }

    public static /* synthetic */ Object c(w wVar, er.a aVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = new er.a() { // from class: lu.t
                @Override // er.a
                public final Object a() {
                    return u.d();
                }
            };
        }
        return b(wVar, aVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d() {
        return i0.f148189a;
    }

    public static final <E> y<E> e(p0 p0Var, tq.i iVar, int i15, er.p<? super w<? super E>, ? super tq.e<? super i0>, ? extends Object> pVar) {
        return f(p0Var, iVar, i15, lu.a.SUSPEND, r0.DEFAULT, null, pVar);
    }

    public static final <E> y<E> f(p0 p0Var, tq.i iVar, int i15, lu.a aVar, r0 r0Var, er.l<? super Throwable, i0> lVar, er.p<? super w<? super E>, ? super tq.e<? super i0>, ? extends Object> pVar) {
        v vVar = new v(j0.j(p0Var, iVar), j.b(i15, aVar, null, 4, null));
        if (lVar != null) {
            vVar.C0(lVar);
        }
        vVar.n1(r0Var, vVar, pVar);
        return vVar;
    }

    public static /* synthetic */ y g(p0 p0Var, tq.i iVar, int i15, er.p pVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            iVar = tq.j.f191408a;
        }
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        return e(p0Var, iVar, i15, pVar);
    }

    public static /* synthetic */ y h(p0 p0Var, tq.i iVar, int i15, lu.a aVar, r0 r0Var, er.l lVar, er.p pVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            iVar = tq.j.f191408a;
        }
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        if ((i16 & 4) != 0) {
            aVar = lu.a.SUSPEND;
        }
        if ((i16 & 8) != 0) {
            r0Var = r0.DEFAULT;
        }
        if ((i16 & 16) != 0) {
            lVar = null;
        }
        er.l lVar2 = lVar;
        return f(p0Var, iVar, i15, aVar, r0Var, lVar2, pVar);
    }
}

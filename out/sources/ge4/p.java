package ge4;

import ju.g1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0087@¢\u0006\u0004\b\u0007\u0010\u0004\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\t\u0010\u0004\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "T", "Lge4/d;", "a", "(Lge4/d;Ltq/e;)Ljava/lang/Object;", "b", "Loq/i0;", "d", "Lge4/x;", "c", "", "", "e", "(Ljava/lang/Throwable;Ltq/e;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ge4.d<T> f72342a;

        a(ge4.d<T> dVar) {
            this.f72342a = dVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            this.f72342a.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ge4/p$b", "Lge4/f;", "Lge4/d;", "call", "Lge4/x;", "response", "Loq/i0;", "b", "(Lge4/d;Lge4/x;)V", "", "t", "a", "(Lge4/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements ge4.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<T> f72343a;

        /* JADX WARN: Multi-variable type inference failed */
        b(ju.n<? super T> nVar) {
            this.f72343a = nVar;
        }

        @Override // ge4.f
        public void a(ge4.d<T> call, Throwable t15) {
            ju.n<T> nVar = this.f72343a;
            oq.t.Companion companion = oq.t.INSTANCE;
            nVar.i(oq.t.b(oq.u.a(t15)));
        }

        @Override // ge4.f
        public void b(ge4.d<T> call, x<T> response) {
            if (!response.f()) {
                ju.n<T> nVar = this.f72343a;
                oq.t.Companion companion = oq.t.INSTANCE;
                nVar.i(oq.t.b(oq.u.a(new m(response))));
                return;
            }
            T tA = response.a();
            if (tA != null) {
                this.f72343a.i(oq.t.b(tA));
                return;
            }
            o oVar = (o) call.C().j(o.class);
            oq.h hVar = new oq.h("Response from " + oVar.b().getName() + '.' + oVar.a().getName() + " was null but response body type was declared as non-null");
            ju.n<T> nVar2 = this.f72343a;
            oq.t.Companion companion2 = oq.t.INSTANCE;
            nVar2.i(oq.t.b(oq.u.a(hVar)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements er.l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ge4.d<T> f72344a;

        c(ge4.d<T> dVar) {
            this.f72344a = dVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            this.f72344a.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ge4/p$d", "Lge4/f;", "Lge4/d;", "call", "Lge4/x;", "response", "Loq/i0;", "b", "(Lge4/d;Lge4/x;)V", "", "t", "a", "(Lge4/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements ge4.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<T> f72345a;

        /* JADX WARN: Multi-variable type inference failed */
        d(ju.n<? super T> nVar) {
            this.f72345a = nVar;
        }

        @Override // ge4.f
        public void a(ge4.d<T> call, Throwable t15) {
            ju.n<T> nVar = this.f72345a;
            oq.t.Companion companion = oq.t.INSTANCE;
            nVar.i(oq.t.b(oq.u.a(t15)));
        }

        @Override // ge4.f
        public void b(ge4.d<T> call, x<T> response) {
            if (response.f()) {
                ju.n<T> nVar = this.f72345a;
                oq.t.Companion companion = oq.t.INSTANCE;
                nVar.i(oq.t.b(response.a()));
            } else {
                ju.n<T> nVar2 = this.f72345a;
                oq.t.Companion companion2 = oq.t.INSTANCE;
                nVar2.i(oq.t.b(oq.u.a(new m(response))));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements er.l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ge4.d<T> f72346a;

        e(ge4.d<T> dVar) {
            this.f72346a = dVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            this.f72346a.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ge4/p$f", "Lge4/f;", "Lge4/d;", "call", "Lge4/x;", "response", "Loq/i0;", "b", "(Lge4/d;Lge4/x;)V", "", "t", "a", "(Lge4/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements ge4.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<x<T>> f72347a;

        /* JADX WARN: Multi-variable type inference failed */
        f(ju.n<? super x<T>> nVar) {
            this.f72347a = nVar;
        }

        @Override // ge4.f
        public void a(ge4.d<T> call, Throwable t15) {
            ju.n<x<T>> nVar = this.f72347a;
            oq.t.Companion companion = oq.t.INSTANCE;
            nVar.i(oq.t.b(oq.u.a(t15)));
        }

        @Override // ge4.f
        public void b(ge4.d<T> call, x<T> response) {
            this.f72347a.i(oq.t.b(response));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f72348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f72349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f72350f;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f72349e = obj;
            this.f72350f |= PKIFailureInfo.systemUnavail;
            return p.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tq.e<?> f72351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f72352b;

        h(tq.e<?> eVar, Throwable th4) {
            this.f72351a = eVar;
            this.f72352b = th4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            tq.e eVarC = uq.b.c(this.f72351a);
            oq.t.Companion companion = oq.t.INSTANCE;
            eVarC.i(oq.t.b(oq.u.a(this.f72352b)));
        }
    }

    public static final <T> Object a(ge4.d<T> dVar, tq.e<? super T> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        pVar.E(new a(dVar));
        dVar.F1(new b(pVar));
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    public static final <T> Object b(ge4.d<T> dVar, tq.e<? super T> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        pVar.E(new c(dVar));
        dVar.F1(new d(pVar));
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    public static final <T> Object c(ge4.d<T> dVar, tq.e<? super x<T>> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        pVar.E(new e(dVar));
        dVar.F1(new f(pVar));
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    public static final Object d(ge4.d<i0> dVar, tq.e<? super i0> eVar) {
        return b(dVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(Throwable th4, tq.e<?> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f72350f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f72350f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f72349e;
        Object objE = uq.b.e();
        int i16 = gVar.f72350f;
        if (i16 == 0) {
            oq.u.b(obj);
            gVar.f72348d = th4;
            gVar.f72350f = 1;
            g1.a().F1(gVar.getContext(), new h(gVar, th4));
            Object objE2 = uq.b.e();
            if (objE2 == uq.b.e()) {
                vq.g.c(gVar);
            }
            if (objE2 == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        throw new oq.g();
    }
}

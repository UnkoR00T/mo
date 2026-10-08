package ed;

import androidx.p016lifecycle.DefaultLifecycleObserver;
import fr.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/j;", "Loq/i0;", "a", "(Landroidx/lifecycle/j;Ltq/e;)Ljava/lang/Object;", "Landroidx/lifecycle/p;", "observer", "b", "(Landroidx/lifecycle/j;Landroidx/lifecycle/p;)V", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f49471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f49472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f49474g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f49473f = obj;
            this.f49474g |= PKIFailureInfo.systemUnavail;
            return r.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ed/r$b", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/q;", "owner", "Loq/i0;", "onStart", "(Landroidx/lifecycle/q;)V", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<i0> f49475a;

        /* JADX WARN: Multi-variable type inference failed */
        b(ju.n<? super i0> nVar) {
            this.f49475a = nVar;
        }

        @Override // androidx.p016lifecycle.DefaultLifecycleObserver
        public void onStart(androidx.p016lifecycle.q owner) {
            ju.n<i0> nVar = this.f49475a;
            oq.t.Companion companion = oq.t.INSTANCE;
            nVar.i(oq.t.b(i0.f148189a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, ed.r$b] */
    public static final Object a(androidx.p016lifecycle.j jVar, tq.e<? super i0> eVar) throws Throwable {
        a aVar;
        androidx.p016lifecycle.j jVar2;
        p0 p0Var;
        Throwable th4;
        androidx.p016lifecycle.p pVar;
        androidx.p016lifecycle.p pVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f49474g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f49474g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f49473f;
        Object objE = uq.b.e();
        int i16 = aVar.f49474g;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var = (p0) aVar.f49472e;
            jVar2 = (androidx.p016lifecycle.j) aVar.f49471d;
            try {
                oq.u.b(obj);
                pVar2 = (androidx.p016lifecycle.p) p0Var.f66410a;
                if (pVar2 != null) {
                    jVar2.d(pVar2);
                }
                return i0.f148189a;
            } catch (Throwable th5) {
                th4 = th5;
                pVar = (androidx.p016lifecycle.p) p0Var.f66410a;
                if (pVar != null) {
                    jVar2.d(pVar);
                }
                throw th4;
            }
        }
        oq.u.b(obj);
        if (jVar.getState().e(androidx.lifecycle.j.b.STARTED)) {
            return i0.f148189a;
        }
        p0 p0Var2 = new p0();
        try {
            aVar.f49471d = jVar;
            aVar.f49472e = p0Var2;
            aVar.f49474g = 1;
            ju.p pVar3 = new ju.p(uq.b.c(aVar), 1);
            pVar3.D();
            ?? bVar = new b(pVar3);
            p0Var2.f66410a = bVar;
            jVar.a((androidx.p016lifecycle.p) bVar);
            Object objX = pVar3.x();
            if (objX == uq.b.e()) {
                vq.g.c(aVar);
            }
            if (objX == objE) {
                return objE;
            }
            jVar2 = jVar;
            p0Var = p0Var2;
            pVar2 = (androidx.p016lifecycle.p) p0Var.f66410a;
            if (pVar2 != null) {
                jVar2.d(pVar2);
            }
            return i0.f148189a;
        } catch (Throwable th6) {
            jVar2 = jVar;
            p0Var = p0Var2;
            th4 = th6;
            pVar = (androidx.p016lifecycle.p) p0Var.f66410a;
            if (pVar != null) {
                jVar2.d(pVar);
            }
            throw th4;
        }
    }

    public static final void b(androidx.p016lifecycle.j jVar, androidx.p016lifecycle.p pVar) {
        jVar.d(pVar);
        jVar.a(pVar);
    }
}

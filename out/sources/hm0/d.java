package hm0;

import al0.ChildData;
import al0.ParentOrGuardData;
import gm0.ApplicantDataResponse;
import gm0.ChildrenResponse;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\bH\u0096@¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lhm0/d;", "Lpm0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "", "Lal0/u;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lal0/j0;", "b", "Lpl/gov/coi/common/network/g0;", "Lwl0/c;", "Loq/k;", "f", "()Lwl0/c;", "client", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements pm0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85361d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85363f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85361d = obj;
            this.f85363f |= PKIFailureInfo.systemUnavail;
            return d.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/o1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<ChildrenResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85364e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85364e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.c cVarF = d.this.f();
            this.f85364e = 1;
            Object objC = wl0.c.c(cVarF, null, this, 1, null);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<ChildrenResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85366d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85368f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85366d = obj;
            this.f85368f |= PKIFailureInfo.systemUnavail;
            return d.this.b(this);
        }
    }

    /* JADX INFO: renamed from: hm0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C1990d extends vq.k implements er.l<tq.e<? super ge4.x<ApplicantDataResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85369e;

        C1990d(tq.e<? super C1990d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85369e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.c cVarF = d.this.f();
            this.f85369e = 1;
            Object objD = wl0.c.d(cVarF, null, this, 1, null);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C1990d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<ApplicantDataResponse>> eVar) {
            return ((C1990d) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final pl.gov.coi.common.network.w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: hm0.c
            @Override // er.a
            public final Object a() {
                return d.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.c e(pl.gov.coi.common.network.w wVar) {
        return (wl0.c) pl.gov.coi.common.network.w.b(wVar, null, wl0.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.c f() {
        return (wl0.c) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.b
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<ChildData>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f85363f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f85363f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f85361d;
        Object objE = uq.b.e();
        int i16 = aVar.f85363f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(null);
            aVar.f85363f = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(xl0.b.c(((ChildrenResponse) ((dx.i.Right) iVar).b()).a()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.b
    public Object b(tq.e<? super dx.i<? extends dx.b, ParentOrGuardData>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f85368f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f85368f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f85366d;
        Object objE = uq.b.e();
        int i16 = cVar.f85368f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C1990d c1990d = new C1990d(null);
            cVar.f85368f = 1;
            objB = g0Var.b(c1990d, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(xl0.b.b((ApplicantDataResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}

package hm0;

import al0.IdentityCardSuspensionData;
import gm0.PhysicalIdCardSuspensionInitResponse;
import gm0.PhysicalIdCardSuspensionResponse;
import gm0.PhysicalIdCardSuspensionV3Request;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lhm0/r;", "Lpm0/h;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lal0/f0;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lal0/a;", "accessToken", "Lal0/c0;", "action", "Liy/b0;", "idCardSeriesAndNumber", "Lal0/e0;", "a", "(Liy/b0;Lal0/c0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lwl0/t;", "Loq/k;", "i", "()Lwl0/t;", "client", "Lwl0/u;", "c", "j", "()Lwl0/u;", "clientV3", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements pm0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientV3;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85521d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85523f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85521d = obj;
            this.f85523f |= PKIFailureInfo.systemUnavail;
            return r.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/s6;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<PhysicalIdCardSuspensionInitResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85524e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85524e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.t tVarI = r.this.i();
            this.f85524e = 1;
            Object objA = tVarI.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return r.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PhysicalIdCardSuspensionInitResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f85528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f85529g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f85531j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85529g = obj;
            this.f85531j |= PKIFailureInfo.systemUnavail;
            return r.this.a(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/t6;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super ge4.x<PhysicalIdCardSuspensionResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85532e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85535h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ al0.c0 f85536j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(iy.b0 b0Var, iy.b0 b0Var2, al0.c0 c0Var, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f85534g = b0Var;
            this.f85535h = b0Var2;
            this.f85536j = c0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85532e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.u uVarJ = r.this.j();
            String strE = iy.c0.e(this.f85534g);
            PhysicalIdCardSuspensionV3Request physicalIdCardSuspensionV3Request = new PhysicalIdCardSuspensionV3Request(xl0.j.d(this.f85536j), iy.c0.e(this.f85535h), null, null, 8, null);
            this.f85532e = 1;
            Object objA = uVarJ.a(strE, physicalIdCardSuspensionV3Request, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return r.this.new d(this.f85534g, this.f85535h, this.f85536j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PhysicalIdCardSuspensionResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public r(final pl.gov.coi.common.network.w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: hm0.p
            @Override // er.a
            public final Object a() {
                return r.h(wVar);
            }
        });
        this.clientV3 = oq.l.a(new er.a() { // from class: hm0.q
            @Override // er.a
            public final Object a() {
                return r.g(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.u g(pl.gov.coi.common.network.w wVar) {
        return (wl0.u) pl.gov.coi.common.network.w.b(wVar, null, wl0.u.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.t h(pl.gov.coi.common.network.w wVar) {
        return (wl0.t) pl.gov.coi.common.network.w.b(wVar, null, wl0.t.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.t i() {
        return (wl0.t) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.u j() {
        return (wl0.u) this.clientV3.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.h
    public Object a(iy.b0 b0Var, al0.c0 c0Var, iy.b0 b0Var2, tq.e<? super dx.i<? extends dx.b, ? extends al0.e0>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f85531j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f85531j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f85529g;
        Object objE = uq.b.e();
        int i16 = cVar.f85531j;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(b0Var, b0Var2, c0Var, null);
            cVar.f85526d = vq.j.a(b0Var);
            cVar.f85527e = vq.j.a(c0Var);
            cVar.f85528f = vq.j.a(b0Var2);
            cVar.f85531j = 1;
            objB = g0Var.b(dVar, cVar);
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
            return xl0.j.b(((PhysicalIdCardSuspensionResponse) ((dx.i.Right) iVar).b()).getResult());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.h
    public Object b(tq.e<? super dx.i<? extends dx.b, IdentityCardSuspensionData>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f85523f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f85523f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f85521d;
        Object objE = uq.b.e();
        int i16 = aVar.f85523f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(null);
            aVar.f85523f = 1;
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
            return xl0.j.c((PhysicalIdCardSuspensionInitResponse) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }
}

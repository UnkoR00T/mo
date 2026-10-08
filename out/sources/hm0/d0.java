package hm0;

import al0.ApplicantDataModel;
import al0.BEGenerateXmlResponse;
import al0.ChildData;
import al0.x0;
import gm0.GeneratePhysicalIdCardXmlApplicationChildV4Request;
import gm0.PhysicalIdCardApplicationChildDataRequest;
import gm0.PhysicalIdCardApplicationInitResponse;
import gm0.PhysicalIdCardXmlApplicationV4Response;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lhm0/d0;", "Lpm0/m;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lxl0/n;", "underLegalGuardianshipToRequestMapper", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lxl0/n;)V", "Lal0/u;", "childData", "Ldx/i;", "Ldx/b;", "Lal0/e;", "b", "(Lal0/u;Ltq/e;)Ljava/lang/Object;", "Lal0/a;", "accessToken", "Lal0/x0;", "data", "Lal0/m;", "a", "(Liy/b0;Lal0/x0;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lxl0/n;", "Lwl0/i;", "c", "Loq/k;", "j", "()Lwl0/i;", "client", "Lwl0/j;", "d", "k", "()Lwl0/j;", "clientV4", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 implements pm0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xl0.n underLegalGuardianshipToRequestMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientV4;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85376e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85377f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85379h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85377f = obj;
            this.f85379h |= PKIFailureInfo.systemUnavail;
            return d0.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/x6;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<PhysicalIdCardXmlApplicationV4Response>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85380e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85382g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ x0 f85383h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(iy.b0 b0Var, x0 x0Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f85382g = b0Var;
            this.f85383h = x0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85380e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.j jVarK = d0.this.k();
            String strE = iy.c0.e(this.f85382g);
            GeneratePhysicalIdCardXmlApplicationChildV4Request generatePhysicalIdCardXmlApplicationChildV4RequestC = d0.this.underLegalGuardianshipToRequestMapper.b(new xl0.n.Params(this.f85383h));
            this.f85380e = 1;
            Object objA = jVarK.a(strE, generatePhysicalIdCardXmlApplicationChildV4RequestC, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d0.this.new b(this.f85382g, this.f85383h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PhysicalIdCardXmlApplicationV4Response>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85385e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85387g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85385e = obj;
            this.f85387g |= PKIFailureInfo.systemUnavail;
            return d0.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/u5;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super ge4.x<PhysicalIdCardApplicationInitResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85388e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ChildData f85390g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ChildData childData, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f85390g = childData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85388e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.i iVarJ = d0.this.j();
            PhysicalIdCardApplicationChildDataRequest physicalIdCardApplicationChildDataRequestN = xl0.f.n(this.f85390g);
            this.f85388e = 1;
            Object objA = iVarJ.a(physicalIdCardApplicationChildDataRequestN, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d0.this.new d(this.f85390g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PhysicalIdCardApplicationInitResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public d0(final pl.gov.coi.common.network.w wVar, g0 g0Var, xl0.n nVar) {
        this.networkCallMediator = g0Var;
        this.underLegalGuardianshipToRequestMapper = nVar;
        this.client = oq.l.a(new er.a() { // from class: hm0.b0
            @Override // er.a
            public final Object a() {
                return d0.i(wVar);
            }
        });
        this.clientV4 = oq.l.a(new er.a() { // from class: hm0.c0
            @Override // er.a
            public final Object a() {
                return d0.h(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.j h(pl.gov.coi.common.network.w wVar) {
        return (wl0.j) pl.gov.coi.common.network.w.b(wVar, null, wl0.j.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.i i(pl.gov.coi.common.network.w wVar) {
        return (wl0.i) pl.gov.coi.common.network.w.b(wVar, null, wl0.i.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.i j() {
        return (wl0.i) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.j k() {
        return (wl0.j) this.clientV4.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.m
    public Object a(iy.b0 b0Var, x0 x0Var, tq.e<? super dx.i<? extends dx.b, BEGenerateXmlResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f85379h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f85379h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f85377f;
        Object objE = uq.b.e();
        int i16 = aVar.f85379h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(b0Var, x0Var, null);
            aVar.f85375d = vq.j.a(b0Var);
            aVar.f85376e = vq.j.a(x0Var);
            aVar.f85379h = 1;
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
            return xl0.f.h((PhysicalIdCardXmlApplicationV4Response) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.m
    public Object b(ChildData childData, tq.e<? super dx.i<? extends dx.b, ApplicantDataModel>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f85387g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f85387g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f85385e;
        Object objE = uq.b.e();
        int i16 = cVar.f85387g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(childData, null);
            cVar.f85384d = vq.j.a(childData);
            cVar.f85387g = 1;
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
            return new dx.i.Right(xl0.f.c((PhysicalIdCardApplicationInitResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}

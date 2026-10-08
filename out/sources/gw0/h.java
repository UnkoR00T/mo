package gw0;

import fw0.VehicleDto;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgw0/h;", "Ljw0/d;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Luv0/d;", "plateNumber", "Ldx/i;", "Ldx/b;", "Lrv0/c;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Ldw0/f;", "b", "Loq/k;", "d", "()Ldw0/f;", "safeBusClient", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements jw0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.common.network.g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k safeBusClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77464e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77466g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77464e = obj;
            this.f77466g |= PKIFailureInfo.systemUnavail;
            return h.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/p3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<VehicleDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77467e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f77469g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f77469g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77467e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.f fVarD = h.this.d();
            String str = this.f77469g;
            this.f77467e = 1;
            Object objA = fVarD.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new b(this.f77469g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<VehicleDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public h(final pl.gov.coi.common.network.w wVar, pl.gov.coi.common.network.g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.safeBusClient = oq.l.a(new er.a() { // from class: gw0.g
            @Override // er.a
            public final Object a() {
                return h.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.f d() {
        return (dw0.f) this.safeBusClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.f e(pl.gov.coi.common.network.w wVar) {
        return (dw0.f) pl.gov.coi.common.network.w.b(wVar, null, dw0.f.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.d
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, rv0.c>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f77466g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f77466g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f77464e;
        Object objE = uq.b.e();
        int i16 = aVar.f77466g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, null);
            aVar.f77463d = vq.j.a(str);
            aVar.f77466g = 1;
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
            return new dx.i.Right(ew0.c.h((VehicleDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}

package gw0;

import fw0.PenaltyPointsDto;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qv0.PenaltyPoints;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lgw0/d;", "Ljw0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lqv0/c;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Ldw0/c;", "b", "Loq/k;", "d", "()Ldw0/c;", "penaltyPointsClient", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements jw0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.common.network.g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k penaltyPointsClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f77407d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f77409f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77407d = obj;
            this.f77409f |= PKIFailureInfo.systemUnavail;
            return d.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/e1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<PenaltyPointsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77410e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77410e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.c cVarD = d.this.d();
            this.f77410e = 1;
            Object objA = cVarD.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PenaltyPointsDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final pl.gov.coi.common.network.w wVar, pl.gov.coi.common.network.g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.penaltyPointsClient = oq.l.a(new er.a() { // from class: gw0.c
            @Override // er.a
            public final Object a() {
                return d.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.c d() {
        return (dw0.c) this.penaltyPointsClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.c e(pl.gov.coi.common.network.w wVar) {
        return (dw0.c) pl.gov.coi.common.network.w.b(wVar, null, dw0.c.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.b
    public Object a(tq.e<? super dx.i<? extends dx.b, PenaltyPoints>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f77409f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f77409f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f77407d;
        Object objE = uq.b.e();
        int i16 = aVar.f77409f;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            b bVar = new b(null);
            aVar.f77409f = 1;
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
            return new dx.i.Right(ew0.b.c((PenaltyPointsDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}

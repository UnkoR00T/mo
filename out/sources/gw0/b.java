package gw0;

import fw0.DriverQualificationsRequest;
import fw0.DriverQualificationsResponse;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pv0.DriverQualifications;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lgw0/b;", "Ljw0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Liy/b0;", "firstName", "surnameName", "seriesAndNumber", "Ldx/i;", "Ldx/b;", "Lpv0/a;", "a", "(Liy/b0;Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Ldw0/b;", "b", "Loq/k;", "e", "()Ldw0/b;", "driverQualificationsController", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements jw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.common.network.g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k driverQualificationsController;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77357f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77358g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f77360j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77358g = obj;
            this.f77360j |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: gw0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/a0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C1758b extends vq.k implements er.l<tq.e<? super ge4.x<DriverQualificationsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f77362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f77363g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f77364h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ iy.b0 f77365j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ b f77366k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1758b(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, b bVar, tq.e<? super C1758b> eVar) {
            super(1, eVar);
            this.f77363g = b0Var;
            this.f77364h = b0Var2;
            this.f77365j = b0Var3;
            this.f77366k = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77362f;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            DriverQualificationsRequest driverQualificationsRequest = new DriverQualificationsRequest(fu.r.u1(iy.c0.e(this.f77363g)).toString(), fu.r.u1(iy.c0.e(this.f77364h)).toString(), iy.c0.e(this.f77365j));
            dw0.b bVarE = this.f77366k.e();
            this.f77361e = vq.j.a(driverQualificationsRequest);
            this.f77362f = 1;
            Object objA = bVarE.a(driverQualificationsRequest, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new C1758b(this.f77363g, this.f77364h, this.f77365j, this.f77366k, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<DriverQualificationsResponse>> eVar) {
            return ((C1758b) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final pl.gov.coi.common.network.w wVar, pl.gov.coi.common.network.g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.driverQualificationsController = oq.l.a(new er.a() { // from class: gw0.a
            @Override // er.a
            public final Object a() {
                return b.d(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.b d(pl.gov.coi.common.network.w wVar) {
        return (dw0.b) pl.gov.coi.common.network.w.b(wVar, null, dw0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.b e() {
        return (dw0.b) this.driverQualificationsController.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.a
    public Object a(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, tq.e<? super dx.i<? extends dx.b, DriverQualifications>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f77360j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f77360j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f77358g;
        Object objE = uq.b.e();
        int i16 = aVar.f77360j;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            C1758b c1758b = new C1758b(b0Var, b0Var2, b0Var3, this, null);
            aVar.f77355d = vq.j.a(b0Var);
            aVar.f77356e = vq.j.a(b0Var2);
            aVar.f77357f = vq.j.a(b0Var3);
            aVar.f77360j = 1;
            objB = g0Var.b(c1758b, aVar);
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
            return ew0.a.d((DriverQualificationsResponse) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }
}

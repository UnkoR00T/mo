package pt0;

import dx.i;
import er.l;
import ge4.x;
import kt0.RegisterDeviceRequest;
import kt0.RegisterDeviceResponse;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ot0.RegisterDeviceRequestDto;
import ot0.RegisterDeviceResponseDto;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lpt0/b;", "Lrt0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Lkt0/g;", "registerDeviceRequest", "Ldx/i;", "Ldx/b;", "Lkt0/h;", "a", "(Lkt0/g;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lmt0/a;", "b", "Loq/k;", "d", "()Lmt0/a;", "httpService", "pushservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements rt0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k httpService;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f162510e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f162512g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162510e = obj;
            this.f162512g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: pt0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lot0/o;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C4008b extends vq.k implements l<tq.e<? super x<RegisterDeviceResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162513e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ RegisterDeviceRequest f162515g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4008b(RegisterDeviceRequest registerDeviceRequest, tq.e<? super C4008b> eVar) {
            super(1, eVar);
            this.f162515g = registerDeviceRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162513e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mt0.a aVarD = b.this.d();
            RegisterDeviceRequestDto registerDeviceRequestDtoL = nt0.a.l(this.f162515g);
            this.f162513e = 1;
            Object objA = aVarD.a(registerDeviceRequestDtoL, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C4008b(this.f162515g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<RegisterDeviceResponseDto>> eVar) {
            return ((C4008b) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.httpService = oq.l.a(new er.a() { // from class: pt0.a
            @Override // er.a
            public final Object a() {
                return b.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mt0.a d() {
        return (mt0.a) this.httpService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mt0.a e(w wVar) {
        return (mt0.a) w.b(wVar, null, mt0.a.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rt0.a
    public Object a(RegisterDeviceRequest registerDeviceRequest, tq.e<? super i<? extends dx.b, RegisterDeviceResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f162512g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f162512g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f162510e;
        Object objE = uq.b.e();
        int i16 = aVar.f162512g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C4008b c4008b = new C4008b(registerDeviceRequest, null);
            aVar.f162509d = j.a(registerDeviceRequest);
            aVar.f162512g = 1;
            objB = g0Var.b(c4008b, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(nt0.a.e((RegisterDeviceResponseDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}

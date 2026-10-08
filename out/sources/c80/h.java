package c80;

import er.l;
import et3.JwtDto;
import et3.JwtRequestDto;
import ge4.x;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import z70.Jwt;
import z70.JwtRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lc80/h;", "Le80/d;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Lz70/g;", "request", "Ldx/i;", "Ldx/b;", "Lz70/f;", "a", "(Lz70/g;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Ldt3/d;", "b", "Loq/k;", "d", "()Ldt3/d;", "httpService", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements e80.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k httpService;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f24504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f24505e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f24507g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f24505e = obj;
            this.f24507g |= PKIFailureInfo.systemUnavail;
            return h.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Let3/j;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<JwtDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24508e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ JwtRequest f24510g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JwtRequest jwtRequest, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f24510g = jwtRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24508e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            dt3.d dVarD = h.this.d();
            JwtRequestDto jwtRequestDtoH = b80.a.h(this.f24510g);
            this.f24508e = 1;
            Object objA = dVarD.a(jwtRequestDtoH, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new b(this.f24510g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<JwtDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public h(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.httpService = oq.l.a(new er.a() { // from class: c80.g
            @Override // er.a
            public final Object a() {
                return h.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dt3.d d() {
        return (dt3.d) this.httpService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dt3.d e(w wVar) {
        return (dt3.d) w.b(wVar, null, dt3.d.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e80.d
    public Object a(JwtRequest jwtRequest, tq.e<? super dx.i<? extends dx.b, Jwt>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f24507g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f24507g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f24505e;
        Object objE = uq.b.e();
        int i16 = aVar.f24507g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(jwtRequest, null);
            aVar.f24504d = vq.j.a(jwtRequest);
            aVar.f24507g = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(b80.a.f((JwtDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}

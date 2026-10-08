package yh0;

import ge4.x;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import th0.AppActivationChallengeWithBeKeys;
import th0.GenerateActivationChallengeByPersonalSignatureRequest;
import xh0.AppActivationChallengeWithKeysResponseDto;
import xh0.GenerateActivationChallengeByPersonalSignatureRequestDtoDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lyh0/b;", "Lai0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Lth0/h;", "request", "Ldx/i;", "Ldx/b;", "Lth0/b;", "a", "(Lth0/h;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lvh0/c;", "b", "Loq/k;", "e", "()Lvh0/c;", "client", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements ai0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f226926e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f226928g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226926e = obj;
            this.f226928g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: yh0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxh0/a;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C6087b extends vq.k implements er.l<tq.e<? super x<AppActivationChallengeWithKeysResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226929e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ GenerateActivationChallengeByPersonalSignatureRequest f226931g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6087b(GenerateActivationChallengeByPersonalSignatureRequest generateActivationChallengeByPersonalSignatureRequest, tq.e<? super C6087b> eVar) {
            super(1, eVar);
            this.f226931g = generateActivationChallengeByPersonalSignatureRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226929e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            vh0.c cVarE = b.this.e();
            GenerateActivationChallengeByPersonalSignatureRequestDtoDto generateActivationChallengeByPersonalSignatureRequestDtoDtoV = wh0.a.f213304a.v(this.f226931g);
            this.f226929e = 1;
            Object objA = cVarE.a(generateActivationChallengeByPersonalSignatureRequestDtoDtoV, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C6087b(this.f226931g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AppActivationChallengeWithKeysResponseDto>> eVar) {
            return ((C6087b) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: yh0.a
            @Override // er.a
            public final Object a() {
                return b.d(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vh0.c d(w wVar) {
        return (vh0.c) w.b(wVar, null, vh0.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vh0.c e() {
        return (vh0.c) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ai0.a
    public Object a(GenerateActivationChallengeByPersonalSignatureRequest generateActivationChallengeByPersonalSignatureRequest, tq.e<? super dx.i<? extends dx.b, AppActivationChallengeWithBeKeys>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f226928g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f226928g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f226926e;
        Object objE = uq.b.e();
        int i16 = aVar.f226928g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C6087b c6087b = new C6087b(generateActivationChallengeByPersonalSignatureRequest, null);
            aVar.f226925d = vq.j.a(generateActivationChallengeByPersonalSignatureRequest);
            aVar.f226928g = 1;
            objB = g0Var.b(c6087b, aVar);
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
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(wh0.a.f213304a.a((AppActivationChallengeWithKeysResponseDto) ((dx.i.Right) iVar).b()));
    }
}

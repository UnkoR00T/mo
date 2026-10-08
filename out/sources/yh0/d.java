package yh0;

import ge4.x;
import iy.b0;
import iy.c0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import th0.AppActivationChallengeWithBeKeys;
import th0.InitExternalAuthInput;
import th0.InitExternalAuthMobileResponse;
import xh0.AppActivationChallengeWithKeysResponseDto;
import xh0.GenerateActivationChallengeRequestDto;
import xh0.InitExternalAuthInputDto;
import xh0.InitExternalAuthnMobileResponseDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lyh0/d;", "Lai0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Lth0/k;", "request", "Ldx/i;", "Ldx/b;", "Lth0/l;", "b", "(Lth0/k;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "samlArt", "Lth0/b;", "a", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lvh0/d;", "Loq/k;", "f", "()Lvh0/d;", "client", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements ai0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f226936e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f226938g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226936e = obj;
            this.f226938g |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxh0/a;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<AppActivationChallengeWithKeysResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226939e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f226941g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b0 b0Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f226941g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226939e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            vh0.d dVarF = d.this.f();
            GenerateActivationChallengeRequestDto generateActivationChallengeRequestDto = new GenerateActivationChallengeRequestDto(c0.e(this.f226941g));
            this.f226939e = 1;
            Object objA = dVarF.a(generateActivationChallengeRequestDto, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(this.f226941g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AppActivationChallengeWithKeysResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f226943e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f226945g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226943e = obj;
            this.f226945g |= PKIFailureInfo.systemUnavail;
            return d.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: yh0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxh0/q;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C6088d extends vq.k implements er.l<tq.e<? super x<InitExternalAuthnMobileResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226946e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InitExternalAuthInput f226948g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6088d(InitExternalAuthInput initExternalAuthInput, tq.e<? super C6088d> eVar) {
            super(1, eVar);
            this.f226948g = initExternalAuthInput;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226946e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            vh0.d dVarF = d.this.f();
            InitExternalAuthInputDto initExternalAuthInputDtoX = wh0.a.f213304a.x(this.f226948g);
            this.f226946e = 1;
            Object objB = dVarF.b(initExternalAuthInputDtoX, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C6088d(this.f226948g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<InitExternalAuthnMobileResponseDto>> eVar) {
            return ((C6088d) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: yh0.c
            @Override // er.a
            public final Object a() {
                return d.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vh0.d e(w wVar) {
        return (vh0.d) w.b(wVar, null, vh0.d.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vh0.d f() {
        return (vh0.d) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ai0.b
    public Object a(b0 b0Var, tq.e<? super dx.i<? extends dx.b, AppActivationChallengeWithBeKeys>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f226938g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f226938g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f226936e;
        Object objE = uq.b.e();
        int i16 = aVar.f226938g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(b0Var, null);
            aVar.f226935d = vq.j.a(b0Var);
            aVar.f226938g = 1;
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
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(wh0.a.f213304a.a((AppActivationChallengeWithKeysResponseDto) ((dx.i.Right) iVar).b()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ai0.b
    public Object b(InitExternalAuthInput initExternalAuthInput, tq.e<? super dx.i<? extends dx.b, InitExternalAuthMobileResponse>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f226945g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f226945g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f226943e;
        Object objE = uq.b.e();
        int i16 = cVar.f226945g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C6088d c6088d = new C6088d(initExternalAuthInput, null);
            cVar.f226942d = vq.j.a(initExternalAuthInput);
            cVar.f226945g = 1;
            objB = g0Var.b(c6088d, cVar);
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
        return new dx.i.Right(wh0.a.f213304a.i((InitExternalAuthnMobileResponseDto) ((dx.i.Right) iVar).b()));
    }
}

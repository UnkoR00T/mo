package yh0;

import ge4.x;
import iy.b0;
import iy.c0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import th0.AsyncAppActivationWithKeysResponse;
import xh0.AsyncAppActivationWithKeysResponseDto;
import xh0.TokenAppActivationRequestDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lyh0/k;", "Lai0/e;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Liy/b0;", "activationChallenge", "", "deviceName", "publicKey", "Ldx/i;", "Ldx/b;", "Lth0/c;", "a", "(Liy/b0;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "b", "Lpl/gov/coi/common/network/g0;", "Lvh0/a;", "Loq/k;", "i", "()Lvh0/a;", "clientCitizen", "Lvh0/b;", "c", "j", "()Lvh0/b;", "clientRefugee", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements ai0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientCitizen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientRefugee;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f226972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f226973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f226974g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f226976j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226974g = obj;
            this.f226976j |= PKIFailureInfo.systemUnavail;
            return k.this.b(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxh0/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<AsyncAppActivationWithKeysResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226977e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f226979g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f226980h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f226981j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b0 b0Var, String str, String str2, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f226979g = b0Var;
            this.f226980h = str;
            this.f226981j = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226977e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            vh0.a aVarI = k.this.i();
            TokenAppActivationRequestDto tokenAppActivationRequestDto = new TokenAppActivationRequestDto(c0.e(this.f226979g), this.f226980h, this.f226981j, null, 8, null);
            this.f226977e = 1;
            Object objA = aVarI.a(tokenAppActivationRequestDto, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new b(this.f226979g, this.f226980h, this.f226981j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AsyncAppActivationWithKeysResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f226983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f226984f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f226985g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f226987j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226985g = obj;
            this.f226987j |= PKIFailureInfo.systemUnavail;
            return k.this.a(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxh0/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<AsyncAppActivationWithKeysResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226988e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f226990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f226991h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f226992j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b0 b0Var, String str, String str2, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f226990g = b0Var;
            this.f226991h = str;
            this.f226992j = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226988e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            vh0.b bVarJ = k.this.j();
            TokenAppActivationRequestDto tokenAppActivationRequestDto = new TokenAppActivationRequestDto(c0.e(this.f226990g), this.f226991h, this.f226992j, null, 8, null);
            this.f226988e = 1;
            Object objA = bVarJ.a(tokenAppActivationRequestDto, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new d(this.f226990g, this.f226991h, this.f226992j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AsyncAppActivationWithKeysResponseDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public k(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.clientCitizen = oq.l.a(new er.a() { // from class: yh0.i
            @Override // er.a
            public final Object a() {
                return k.g(wVar);
            }
        });
        this.clientRefugee = oq.l.a(new er.a() { // from class: yh0.j
            @Override // er.a
            public final Object a() {
                return k.h(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vh0.a g(w wVar) {
        return (vh0.a) w.b(wVar, null, vh0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vh0.b h(w wVar) {
        return (vh0.b) w.b(wVar, null, vh0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vh0.a i() {
        return (vh0.a) this.clientCitizen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vh0.b j() {
        return (vh0.b) this.clientRefugee.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ai0.e
    public Object a(b0 b0Var, String str, String str2, tq.e<? super dx.i<? extends dx.b, AsyncAppActivationWithKeysResponse>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f226987j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f226987j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f226985g;
        Object objE = uq.b.e();
        int i16 = cVar.f226987j;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(b0Var, str, str2, null);
            cVar.f226982d = vq.j.a(b0Var);
            cVar.f226983e = vq.j.a(str);
            cVar.f226984f = vq.j.a(str2);
            cVar.f226987j = 1;
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
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(wh0.a.f213304a.b((AsyncAppActivationWithKeysResponseDto) ((dx.i.Right) iVar).b()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ai0.e
    public Object b(b0 b0Var, String str, String str2, tq.e<? super dx.i<? extends dx.b, AsyncAppActivationWithKeysResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f226976j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f226976j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f226974g;
        Object objE = uq.b.e();
        int i16 = aVar.f226976j;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(b0Var, str, str2, null);
            aVar.f226971d = vq.j.a(b0Var);
            aVar.f226972e = vq.j.a(str);
            aVar.f226973f = vq.j.a(str2);
            aVar.f226976j = 1;
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
        return new dx.i.Right(wh0.a.f213304a.b((AsyncAppActivationWithKeysResponseDto) ((dx.i.Right) iVar).b()));
    }
}

package c80;

import er.l;
import et3.AppActivationChallengeWithKeysResponse;
import et3.AsyncAppActivationWithKeysResponse;
import et3.GenerateActivationChallengeForJuniorRequestDto;
import et3.TokenAppActivationRequest;
import ge4.x;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import z70.ActivationChallengeWithKeysResponse;
import z70.AppActivationWithKeysResponse;
import z70.TokenApplicationActivationRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lc80/d;", "Le80/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "token", "Ldx/i;", "Ldx/b;", "Lz70/a;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lz70/i;", "tokenAppActivationRequest", "Lz70/b;", "a", "(Lz70/i;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Ldt3/a;", "Loq/k;", "e", "()Ldt3/a;", "httpService", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements e80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k httpService;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f24479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f24480e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f24482g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f24480e = obj;
            this.f24482g |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Let3/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<AsyncAppActivationWithKeysResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24483e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TokenApplicationActivationRequest f24485g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(TokenApplicationActivationRequest tokenApplicationActivationRequest, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f24485g = tokenApplicationActivationRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24483e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            dt3.a aVarE = d.this.e();
            TokenAppActivationRequest tokenAppActivationRequestI = b80.a.i(this.f24485g);
            this.f24483e = 1;
            Object objB = aVarE.b(tokenAppActivationRequestI, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(this.f24485g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AsyncAppActivationWithKeysResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f24486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f24487e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f24489g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f24487e = obj;
            this.f24489g |= PKIFailureInfo.systemUnavail;
            return d.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: c80.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Let3/a;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C0648d extends vq.k implements l<tq.e<? super x<AppActivationChallengeWithKeysResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24490e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f24492g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0648d(String str, tq.e<? super C0648d> eVar) {
            super(1, eVar);
            this.f24492g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24490e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            dt3.a aVarE = d.this.e();
            GenerateActivationChallengeForJuniorRequestDto generateActivationChallengeForJuniorRequestDto = new GenerateActivationChallengeForJuniorRequestDto(this.f24492g);
            this.f24490e = 1;
            Object objA = aVarE.a(generateActivationChallengeForJuniorRequestDto, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C0648d(this.f24492g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AppActivationChallengeWithKeysResponse>> eVar) {
            return ((C0648d) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.httpService = oq.l.a(new er.a() { // from class: c80.c
            @Override // er.a
            public final Object a() {
                return d.f(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dt3.a e() {
        return (dt3.a) this.httpService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dt3.a f(w wVar) {
        return (dt3.a) w.b(wVar, null, dt3.a.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e80.b
    public Object a(TokenApplicationActivationRequest tokenApplicationActivationRequest, tq.e<? super dx.i<? extends dx.b, AppActivationWithKeysResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f24482g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f24482g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f24480e;
        Object objE = uq.b.e();
        int i16 = aVar.f24482g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(tokenApplicationActivationRequest, null);
            aVar.f24479d = vq.j.a(tokenApplicationActivationRequest);
            aVar.f24482g = 1;
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
            return new dx.i.Right(b80.a.b((AsyncAppActivationWithKeysResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e80.b
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, ActivationChallengeWithKeysResponse>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f24489g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f24489g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f24487e;
        Object objE = uq.b.e();
        int i16 = cVar.f24489g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C0648d c0648d = new C0648d(str, null);
            cVar.f24486d = vq.j.a(str);
            cVar.f24489g = 1;
            objB = g0Var.b(c0648d, cVar);
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
            return new dx.i.Right(b80.a.a((AppActivationChallengeWithKeysResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}

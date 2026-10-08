package w01;

import dx.i;
import er.l;
import ge4.x;
import iy.b0;
import iy.c0;
import jo2.AuthorizationStatusResponseDto;
import jo2.CompleteAuthorizationSignedRequestDto;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import tq.e;
import vq.d;
import vq.j;
import vq.k;
import y01.TrustedProfileAuthorizationStatusResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u001a"}, d2 = {"Lw01/c;", "Lw01/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ly01/a;", "action", "Liy/b0;", "signedRequest", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Ly01/a;Liy/b0;Ltq/e;)Ljava/lang/Object;", "", "authId", "Ly01/e;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lio2/a;", "Lio2/a;", "httpService", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements w01.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io2.a httpService;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f209144e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f209146g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209144e = obj;
            this.f209146g |= PKIFailureInfo.systemUnavail;
            return c.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo2/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements l<e<? super x<AuthorizationStatusResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209147e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f209149g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, e<? super b> eVar) {
            super(1, eVar);
            this.f209149g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f209147e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            io2.a aVar = c.this.httpService;
            String str = this.f209149g;
            this.f209147e = 1;
            Object objB = aVar.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final e<i0> M(e<?> eVar) {
            return c.this.new b(this.f209149g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super x<AuthorizationStatusResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: w01.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C5497c extends k implements l<e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209150e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y01.a f209152g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b0 f209153h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5497c(y01.a aVar, b0 b0Var, e<? super C5497c> eVar) {
            super(1, eVar);
            this.f209152g = aVar;
            this.f209153h = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f209150e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            io2.a aVar = c.this.httpService;
            jo2.c cVarC = w01.a.c(this.f209152g);
            CompleteAuthorizationSignedRequestDto completeAuthorizationSignedRequestDto = new CompleteAuthorizationSignedRequestDto(c0.e(this.f209153h));
            this.f209150e = 1;
            Object objA = aVar.a(cVarC, completeAuthorizationSignedRequestDto, this);
            return objA == objE ? objE : objA;
        }

        public final e<i0> M(e<?> eVar) {
            return c.this.new C5497c(this.f209152g, this.f209153h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super x<i0>> eVar) {
            return ((C5497c) M(eVar)).J(i0.f148189a);
        }
    }

    public c(w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.httpService = (io2.a) w.b(wVar, null, io2.a.class, 1, null);
    }

    @Override // w01.b
    public Object a(y01.a aVar, b0 b0Var, e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new C5497c(aVar, b0Var, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w01.b
    public Object b(String str, e<? super i<? extends dx.b, TrustedProfileAuthorizationStatusResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f209146g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209146g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f209144e;
        Object objE = uq.b.e();
        int i16 = aVar.f209146g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, null);
            aVar.f209143d = j.a(str);
            aVar.f209146g = 1;
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
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(w01.a.b((AuthorizationStatusResponseDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}

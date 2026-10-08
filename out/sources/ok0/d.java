package ok0;

import ge4.x;
import jk0.ExternalQualifiedSignatureAuthenticateRequest;
import jk0.ExternalQualifiedSignatureAuthenticateResponse;
import jk0.ExternalQualifiedSignatureAuthorizationResponse;
import jk0.ExternalQualifiedSignatureAuthorizationStatusResponse;
import jk0.ExternalQualifiedSignatureCompleteAuthorizationRequest;
import jk0.ExternalQualifiedSignatureGenerateProviderEntryUrlRequest;
import jk0.ExternalQualifiedSignatureStartAuthenticationRequest;
import jk0.ExternalQualifiedSignatureStartResponse;
import jk0.QualifiedSignatureInfo;
import jk0.QualifiedSignatureProviderEntryResponse;
import nk0.ExternalQualifiedSignatureAuthenticateRequestDto;
import nk0.ExternalQualifiedSignatureAuthenticateResponseDto;
import nk0.ExternalQualifiedSignatureAuthorizationResponseDto;
import nk0.ExternalQualifiedSignatureAuthorizationStatusResponseDto;
import nk0.ExternalQualifiedSignatureCompleteAuthorizationRequestDto;
import nk0.ExternalQualifiedSignatureGenerateProviderEntryUrlRequestDto;
import nk0.ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto;
import nk0.ExternalQualifiedSignatureProvidersMobileInfoDto;
import nk0.ExternalQualifiedSignatureStartAuthenticationRequestDto;
import nk0.ExternalQualifiedSignatureStartResponseDto;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u000e\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\u000e\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0096@¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lok0/d;", "Lqk0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Ljk0/m;", "a", "(Ltq/e;)Ljava/lang/Object;", "Ljk0/h;", "request", "Ljk0/n;", "c", "(Ljk0/h;Ltq/e;)Ljava/lang/Object;", "Ljk0/j;", "Ljk0/k;", "b", "(Ljk0/j;Ltq/e;)Ljava/lang/Object;", "Ljk0/a;", "Ljk0/b;", "d", "(Ljk0/a;Ltq/e;)Ljava/lang/Object;", "Ljk0/c;", "action", "Ljk0/g;", "Ljk0/d;", "f", "(Ljk0/c;Ljk0/g;Ltq/e;)Ljava/lang/Object;", "", "processId", "authorizationId", "Ljk0/f;", "e", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Llk0/a;", "Loq/k;", "j", "()Llk0/a;", "client", "digitalservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements qk0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f146476e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f146478g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146476e = obj;
            this.f146478g |= PKIFailureInfo.systemUnavail;
            return d.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnk0/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<ExternalQualifiedSignatureAuthenticateResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146479e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ExternalQualifiedSignatureAuthenticateRequest f146481g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ExternalQualifiedSignatureAuthenticateRequest externalQualifiedSignatureAuthenticateRequest, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f146481g = externalQualifiedSignatureAuthenticateRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146479e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lk0.a aVarJ = d.this.j();
            ExternalQualifiedSignatureAuthenticateRequestDto externalQualifiedSignatureAuthenticateRequestDtoJ = mk0.a.j(this.f146481g);
            this.f146479e = 1;
            Object objF = aVarJ.f(externalQualifiedSignatureAuthenticateRequestDtoJ, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(this.f146481g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ExternalQualifiedSignatureAuthenticateResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146484f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f146486h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146484f = obj;
            this.f146486h |= PKIFailureInfo.systemUnavail;
            return d.this.e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ok0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnk0/f;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C3641d extends vq.k implements er.l<tq.e<? super x<ExternalQualifiedSignatureAuthorizationStatusResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146487e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f146489g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f146490h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3641d(String str, String str2, tq.e<? super C3641d> eVar) {
            super(1, eVar);
            this.f146489g = str;
            this.f146490h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146487e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lk0.a aVarJ = d.this.j();
            String str = this.f146489g;
            String str2 = this.f146490h;
            this.f146487e = 1;
            Object objC = aVarJ.c(str, str2, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C3641d(this.f146489g, this.f146490h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ExternalQualifiedSignatureAuthorizationStatusResponseDto>> eVar) {
            return ((C3641d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146493f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f146495h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146493f = obj;
            this.f146495h |= PKIFailureInfo.systemUnavail;
            return d.this.f(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnk0/d;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<ExternalQualifiedSignatureAuthorizationResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146496e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ jk0.c f146498g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ExternalQualifiedSignatureCompleteAuthorizationRequest f146499h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(jk0.c cVar, ExternalQualifiedSignatureCompleteAuthorizationRequest externalQualifiedSignatureCompleteAuthorizationRequest, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f146498g = cVar;
            this.f146499h = externalQualifiedSignatureCompleteAuthorizationRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146496e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lk0.a aVarJ = d.this.j();
            nk0.c cVarK = mk0.a.k(this.f146498g);
            ExternalQualifiedSignatureCompleteAuthorizationRequestDto externalQualifiedSignatureCompleteAuthorizationRequestDtoL = mk0.a.l(this.f146499h);
            this.f146496e = 1;
            Object objB = aVarJ.b(cVarK, externalQualifiedSignatureCompleteAuthorizationRequestDtoL, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new f(this.f146498g, this.f146499h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ExternalQualifiedSignatureAuthorizationResponseDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f146501e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f146503g;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146501e = obj;
            this.f146503g |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnk0/i;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146504e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ExternalQualifiedSignatureGenerateProviderEntryUrlRequest f146506g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ExternalQualifiedSignatureGenerateProviderEntryUrlRequest externalQualifiedSignatureGenerateProviderEntryUrlRequest, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f146506g = externalQualifiedSignatureGenerateProviderEntryUrlRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146504e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lk0.a aVarJ = d.this.j();
            ExternalQualifiedSignatureGenerateProviderEntryUrlRequestDto externalQualifiedSignatureGenerateProviderEntryUrlRequestDtoM = mk0.a.m(this.f146506g);
            this.f146504e = 1;
            Object objE2 = aVarJ.e(externalQualifiedSignatureGenerateProviderEntryUrlRequestDtoM, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new h(this.f146506g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f146507d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f146509f;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146507d = obj;
            this.f146509f |= PKIFailureInfo.systemUnavail;
            return d.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnk0/l;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<ExternalQualifiedSignatureProvidersMobileInfoDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146510e;

        j(tq.e<? super j> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146510e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lk0.a aVarJ = d.this.j();
            this.f146510e = 1;
            Object objA = aVarJ.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new j(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ExternalQualifiedSignatureProvidersMobileInfoDto>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f146513e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f146515g;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146513e = obj;
            this.f146515g |= PKIFailureInfo.systemUnavail;
            return d.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnk0/o;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<ExternalQualifiedSignatureStartResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146516e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ExternalQualifiedSignatureStartAuthenticationRequest f146518g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ExternalQualifiedSignatureStartAuthenticationRequest externalQualifiedSignatureStartAuthenticationRequest, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f146518g = externalQualifiedSignatureStartAuthenticationRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146516e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lk0.a aVarJ = d.this.j();
            ExternalQualifiedSignatureStartAuthenticationRequestDto externalQualifiedSignatureStartAuthenticationRequestDtoO = mk0.a.o(this.f146518g);
            this.f146516e = 1;
            Object objD = aVarJ.d(externalQualifiedSignatureStartAuthenticationRequestDtoO, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new l(this.f146518g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ExternalQualifiedSignatureStartResponseDto>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: ok0.c
            @Override // er.a
            public final Object a() {
                return d.i(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lk0.a i(w wVar) {
        return (lk0.a) w.b(wVar, null, lk0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lk0.a j() {
        return (lk0.a) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk0.b
    public Object a(tq.e<? super dx.i<? extends dx.b, QualifiedSignatureInfo>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f146509f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f146509f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f146507d;
        Object objE = uq.b.e();
        int i16 = iVar.f146509f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(null);
            iVar.f146509f = 1;
            objB = g0Var.b(jVar, iVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(mk0.a.g((ExternalQualifiedSignatureProvidersMobileInfoDto) ((dx.i.Right) iVar2).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk0.b
    public Object b(ExternalQualifiedSignatureStartAuthenticationRequest externalQualifiedSignatureStartAuthenticationRequest, tq.e<? super dx.i<? extends dx.b, ExternalQualifiedSignatureStartResponse>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f146515g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f146515g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f146513e;
        Object objE = uq.b.e();
        int i16 = kVar.f146515g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(externalQualifiedSignatureStartAuthenticationRequest, null);
            kVar.f146512d = vq.j.a(externalQualifiedSignatureStartAuthenticationRequest);
            kVar.f146515g = 1;
            objB = g0Var.b(lVar, kVar);
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
            return new dx.i.Right(mk0.a.f((ExternalQualifiedSignatureStartResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk0.b
    public Object c(ExternalQualifiedSignatureGenerateProviderEntryUrlRequest externalQualifiedSignatureGenerateProviderEntryUrlRequest, tq.e<? super dx.i<? extends dx.b, QualifiedSignatureProviderEntryResponse>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f146503g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f146503g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f146501e;
        Object objE = uq.b.e();
        int i16 = gVar.f146503g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(externalQualifiedSignatureGenerateProviderEntryUrlRequest, null);
            gVar.f146500d = vq.j.a(externalQualifiedSignatureGenerateProviderEntryUrlRequest);
            gVar.f146503g = 1;
            objB = g0Var.b(hVar, gVar);
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
            return new dx.i.Right(mk0.a.h((ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk0.b
    public Object d(ExternalQualifiedSignatureAuthenticateRequest externalQualifiedSignatureAuthenticateRequest, tq.e<? super dx.i<? extends dx.b, ExternalQualifiedSignatureAuthenticateResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f146478g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f146478g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f146476e;
        Object objE = uq.b.e();
        int i16 = aVar.f146478g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(externalQualifiedSignatureAuthenticateRequest, null);
            aVar.f146475d = vq.j.a(externalQualifiedSignatureAuthenticateRequest);
            aVar.f146478g = 1;
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
            return new dx.i.Right(mk0.a.a((ExternalQualifiedSignatureAuthenticateResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk0.b
    public Object e(String str, String str2, tq.e<? super dx.i<? extends dx.b, ExternalQualifiedSignatureAuthorizationStatusResponse>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f146486h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f146486h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f146484f;
        Object objE = uq.b.e();
        int i16 = cVar.f146486h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C3641d c3641d = new C3641d(str, str2, null);
            cVar.f146482d = vq.j.a(str);
            cVar.f146483e = vq.j.a(str2);
            cVar.f146486h = 1;
            objB = g0Var.b(c3641d, cVar);
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
            return new dx.i.Right(mk0.a.d((ExternalQualifiedSignatureAuthorizationStatusResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk0.b
    public Object f(jk0.c cVar, ExternalQualifiedSignatureCompleteAuthorizationRequest externalQualifiedSignatureCompleteAuthorizationRequest, tq.e<? super dx.i<? extends dx.b, ExternalQualifiedSignatureAuthorizationResponse>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f146495h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f146495h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f146493f;
        Object objE = uq.b.e();
        int i16 = eVar2.f146495h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(cVar, externalQualifiedSignatureCompleteAuthorizationRequest, null);
            eVar2.f146491d = vq.j.a(cVar);
            eVar2.f146492e = vq.j.a(externalQualifiedSignatureCompleteAuthorizationRequest);
            eVar2.f146495h = 1;
            objB = g0Var.b(fVar, eVar2);
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
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mk0.a.b((ExternalQualifiedSignatureAuthorizationResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}

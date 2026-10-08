package hm0;

import al0.PassportChildAgreementGetChildData;
import al0.s0;
import fr.q0;
import gm0.PassportAgreementDetailsResponse;
import gm0.PassportAgreementResponse;
import gm0.PassportChildAgreementAttachmentConfigOutput;
import gm0.PassportChildAgreementGetChildDataResponse;
import gm0.PassportChildAgreementGetParentDataResponse;
import gm0.PassportChildAgreementInvalidateRequest;
import gm0.PassportChildAgreementInvalidateRequestDto;
import gm0.PassportChildAgreementInvalidateSignedRequest;
import gm0.PassportChildAgreementXmlResponse;
import gm0.VerifyPassportChildAgreementRequest;
import gm0.VerifyPassportChildAgreementResponse;
import gm0.n5;
import java.util.List;
import java.util.concurrent.CancellationException;
import jl0.BEPassportAgreement;
import jl0.BEPassportAgreementDetails;
import jl0.PassportChildAgreementAttachmentConfigOutputModel;
import jl0.PassportChildAgreementParentData;
import jl0.PassportChildAgreementXmlRequest;
import jl0.SubmitPassportChildAgreementRequest;
import jl0.VerifyPassportChildApplicationAgreementRequest;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\\\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122.\u0010\u001d\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\f0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0018H\u0096@¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0\fH\u0096@¢\u0006\u0004\b\"\u0010\u0011J,\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020&0\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b'\u0010(J,\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020+0\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010*\u001a\u00020)H\u0096@¢\u0006\u0004\b,\u0010-J,\u00101\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\f2\u0006\u0010.\u001a\u00020\u00192\u0006\u00100\u001a\u00020/H\u0096@¢\u0006\u0004\b1\u00102J$\u00105\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\f2\u0006\u00104\u001a\u000203H\u0096@¢\u0006\u0004\b5\u00106J$\u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002070\f2\u0006\u0010$\u001a\u00020#H\u0096@¢\u0006\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010=R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lhm0/t;", "Lpm0/i;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lez/a;", "currentTimeProvider", "Lay/j;", "jsonSerializer", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lez/a;Lay/j;)V", "Ldx/i;", "Ldx/b;", "", "Ljl0/a;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "agreementId", "Ljl0/c;", "h", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "challenge", "Lkotlin/Function2;", "Liy/b0;", "Ltq/e;", "Lry/a;", "", "signBase64", "Loq/i0;", "f", "(Ljava/lang/String;Ljava/lang/String;Ler/p;Ltq/e;)Ljava/lang/Object;", "Ljl0/w;", "e", "Lal0/s0;", "passportType", "childId", "Lal0/k0;", "i", "(Lal0/s0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljl0/z;", "request", "", "j", "(Lal0/s0;Ljl0/z;Ltq/e;)Ljava/lang/Object;", "externalAuthorizationToken", "Ljl0/x;", "passportChildAgreementXmlRequest", "d", "(Liy/b0;Ljl0/x;Ltq/e;)Ljava/lang/Object;", "Ljl0/y;", "submitPassportChildAgreementRequest", "g", "(Ljl0/y;Ltq/e;)Ljava/lang/Object;", "Ljl0/s;", "b", "(Lal0/s0;Ltq/e;)Ljava/lang/Object;", "a", "Lpl/gov/coi/common/network/g0;", "Lez/a;", "Lay/j;", "Lwl0/f;", "Loq/k;", "m", "()Lwl0/f;", "client", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements pm0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85543e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85544f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85546h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85544f = obj;
            this.f85546h |= PKIFailureInfo.systemUnavail;
            return t.this.d(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/x3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildAgreementXmlResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85547e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ PassportChildAgreementXmlRequest f85550h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(iy.b0 b0Var, PassportChildAgreementXmlRequest passportChildAgreementXmlRequest, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f85549g = b0Var;
            this.f85550h = passportChildAgreementXmlRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85547e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.f fVarM = t.this.m();
            String strE = iy.c0.e(this.f85549g);
            gm0.PassportChildAgreementXmlRequest passportChildAgreementXmlRequestM = em0.c.m(this.f85550h);
            this.f85547e = 1;
            Object objE2 = fVarM.e(strE, passportChildAgreementXmlRequestM, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new b(this.f85549g, this.f85550h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildAgreementXmlResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85552e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85554g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85552e = obj;
            this.f85554g |= PKIFailureInfo.systemUnavail;
            return t.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/m3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildAgreementAttachmentConfigOutput>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85555e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s0 f85557g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s0 s0Var, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f85557g = s0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85555e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.f fVarM = t.this.m();
            n5 n5VarG = em0.a.g(this.f85557g);
            this.f85555e = 1;
            Object objG = fVarM.g(n5VarG, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new d(this.f85557g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildAgreementAttachmentConfigOutput>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85559e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85561g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85559e = obj;
            this.f85561g |= PKIFailureInfo.systemUnavail;
            return t.this.h(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/c3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super ge4.x<PassportAgreementDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85562e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f85564g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f85564g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85562e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.f fVarM = t.this.m();
            String str = this.f85564g;
            this.f85562e = 1;
            Object objH = fVarM.h(str, this);
            return objH == objE ? objE : objH;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new f(this.f85564g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportAgreementDetailsResponse>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85565d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85567f;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85565d = obj;
            this.f85567f |= PKIFailureInfo.systemUnavail;
            return t.this.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/s3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildAgreementGetParentDataResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85568e;

        h(tq.e<? super h> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85568e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.f fVarM = t.this.m();
            this.f85568e = 1;
            Object objB = fVarM.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new h(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildAgreementGetParentDataResponse>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85570d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85572f;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85570d = obj;
            this.f85572f |= PKIFailureInfo.systemUnavail;
            return t.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/i3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super ge4.x<PassportAgreementResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85573e;

        j(tq.e<? super j> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85573e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.f fVarM = t.this.m();
            this.f85573e = 1;
            Object objC = fVarM.c(this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new j(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportAgreementResponse>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85577f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85579h;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85577f = obj;
            this.f85579h |= PKIFailureInfo.systemUnavail;
            return t.this.i(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/r3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildAgreementGetChildDataResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85580e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s0 f85582g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f85583h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(s0 s0Var, String str, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f85582g = s0Var;
            this.f85583h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85580e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.f fVarM = t.this.m();
            n5 n5VarG = em0.a.g(this.f85582g);
            String str = this.f85583h;
            this.f85580e = 1;
            Object objA = fVarM.a(n5VarG, str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new l(this.f85582g, this.f85583h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildAgreementGetChildDataResponse>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.l<tq.e<? super ge4.x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85584e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SubmitPassportChildAgreementRequest f85586g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(SubmitPassportChildAgreementRequest submitPassportChildAgreementRequest, tq.e<? super m> eVar) {
            super(1, eVar);
            this.f85586g = submitPassportChildAgreementRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85584e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.f fVarM = t.this.m();
            gm0.SubmitPassportChildAgreementRequest submitPassportChildAgreementRequestN = em0.c.n(this.f85586g);
            this.f85584e = 1;
            Object objD = fVarM.d(submitPassportChildAgreementRequestN, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new m(this.f85586g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<i0>> eVar) {
            return ((m) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class n extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85589f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85591h;

        n(tq.e<? super n> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85589f = obj;
            this.f85591h |= PKIFailureInfo.systemUnavail;
            return t.this.j(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/i7;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.l<tq.e<? super ge4.x<VerifyPassportChildAgreementResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85592e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s0 f85594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ VerifyPassportChildApplicationAgreementRequest f85595h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(s0 s0Var, VerifyPassportChildApplicationAgreementRequest verifyPassportChildApplicationAgreementRequest, tq.e<? super o> eVar) {
            super(1, eVar);
            this.f85594g = s0Var;
            this.f85595h = verifyPassportChildApplicationAgreementRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85592e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.f fVarM = t.this.m();
            n5 n5VarG = em0.a.g(this.f85594g);
            VerifyPassportChildAgreementRequest verifyPassportChildAgreementRequestO = em0.c.o(this.f85595h);
            this.f85592e = 1;
            Object objF = fVarM.f(n5VarG, verifyPassportChildAgreementRequestO, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new o(this.f85594g, this.f85595h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<VerifyPassportChildAgreementResponse>> eVar) {
            return ((o) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f85598f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f85599g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f85600h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f85601j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f85602k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f85603l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f85604m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f85605n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f85606p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f85607q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f85608r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f85609s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f85610t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f85612w;

        p(tq.e<? super p> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85610t = obj;
            this.f85612w |= PKIFailureInfo.systemUnavail;
            return t.this.f(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.l<tq.e<? super ge4.x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85613e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85615g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(iy.b0 b0Var, tq.e<? super q> eVar) {
            super(1, eVar);
            this.f85615g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85613e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.f fVarM = t.this.m();
            PassportChildAgreementInvalidateSignedRequest passportChildAgreementInvalidateSignedRequest = new PassportChildAgreementInvalidateSignedRequest(iy.c0.e(this.f85615g));
            this.f85613e = 1;
            Object objI = fVarM.i(passportChildAgreementInvalidateSignedRequest, this);
            return objI == objE ? objE : objI;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new q(this.f85615g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<i0>> eVar) {
            return ((q) M(eVar)).J(i0.f148189a);
        }
    }

    public t(final pl.gov.coi.common.network.w wVar, g0 g0Var, ez.a aVar, ay.j jVar) {
        this.networkCallMediator = g0Var;
        this.currentTimeProvider = aVar;
        this.jsonSerializer = jVar;
        this.client = oq.l.a(new er.a() { // from class: hm0.s
            @Override // er.a
            public final Object a() {
                return t.l(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.f l(pl.gov.coi.common.network.w wVar) {
        return (wl0.f) pl.gov.coi.common.network.w.b(wVar, null, wl0.f.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.f m() {
        return (wl0.f) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.i
    public Object b(s0 s0Var, tq.e<? super dx.i<? extends dx.b, PassportChildAgreementAttachmentConfigOutputModel>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f85554g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f85554g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f85552e;
        Object objE = uq.b.e();
        int i16 = cVar.f85554g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(s0Var, null);
            cVar.f85551d = vq.j.a(s0Var);
            cVar.f85554g = 1;
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
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(em0.a.e((PassportChildAgreementAttachmentConfigOutput) ((dx.i.Right) iVar).b(), this.currentTimeProvider));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.i
    public Object c(tq.e<? super dx.i<? extends dx.b, ? extends List<BEPassportAgreement>>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f85572f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f85572f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f85570d;
        Object objE = uq.b.e();
        int i16 = iVar.f85572f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(null);
            iVar.f85572f = 1;
            objB = g0Var.b(jVar, iVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(em0.c.b((PassportAgreementResponse) ((dx.i.Right) iVar2).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.i
    public Object d(iy.b0 b0Var, PassportChildAgreementXmlRequest passportChildAgreementXmlRequest, tq.e<? super dx.i<? extends dx.b, ry.a>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f85546h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f85546h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f85544f;
        Object objE = uq.b.e();
        int i16 = aVar.f85546h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(b0Var, passportChildAgreementXmlRequest, null);
            aVar.f85542d = vq.j.a(b0Var);
            aVar.f85543e = vq.j.a(passportChildAgreementXmlRequest);
            aVar.f85546h = 1;
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
            return new dx.i.Right(ry.a.a(ry.a.b(iy.c0.g(((PassportChildAgreementXmlResponse) ((dx.i.Right) iVar).b()).getXml()))));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.i
    public Object e(tq.e<? super dx.i<? extends dx.b, PassportChildAgreementParentData>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f85567f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f85567f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f85565d;
        Object objE = uq.b.e();
        int i16 = gVar.f85567f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(null);
            gVar.f85567f = 1;
            objB = g0Var.b(hVar, gVar);
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
            return new dx.i.Right(em0.c.e((PassportChildAgreementGetParentDataResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // pm0.i
    public Object f(String str, String str2, er.p<? super iy.b0, ? super tq.e<? super dx.i<? extends dx.b, ry.a>>, ? extends Object> pVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        p pVar2;
        Object objB;
        ex.b bVar;
        er.p<? super iy.b0, ? super tq.e<? super dx.i<? extends dx.b, ry.a>>, ? extends Object> pVar3;
        String str3;
        Object obj;
        int i15;
        dx.j<dx.b> jVarA;
        ex.b bVar2;
        iy.b0 b0Var;
        ex.b bVar3;
        int i16;
        int i17;
        int i18;
        int i19;
        String str4;
        ex.b bVar4;
        if (eVar instanceof p) {
            pVar2 = (p) eVar;
            int i25 = pVar2.f85612w;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                pVar2.f85612w = i25 - PKIFailureInfo.systemUnavail;
            } else {
                pVar2 = new p(eVar);
            }
        } else {
            pVar2 = new p(eVar);
        }
        Object objB2 = pVar2.f85610t;
        Object objE = uq.b.e();
        ?? r15 = pVar2.f85612w;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objB2);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    iy.b0 b0VarG = iy.c0.g(this.jsonSerializer.b(new PassportChildAgreementInvalidateRequest(str2, new PassportChildAgreementInvalidateRequestDto(str)), q0.n(PassportChildAgreementInvalidateRequest.class)));
                    pVar2.f85596d = vq.j.a(str);
                    pVar2.f85597e = vq.j.a(str2);
                    pVar2.f85598f = vq.j.a(pVar);
                    pVar2.f85599g = jVarA;
                    pVar2.f85600h = vq.j.a(aVar);
                    pVar2.f85601j = aVar;
                    pVar2.f85602k = vq.j.a(b0VarG);
                    pVar2.f85603l = aVar;
                    pVar2.f85605n = 0;
                    pVar2.f85606p = 0;
                    pVar2.f85607q = 0;
                    pVar2.f85608r = 0;
                    pVar2.f85609s = 0;
                    pVar2.f85612w = 1;
                    Object objB3 = pVar.B(b0VarG, pVar2);
                    if (objB3 != objE) {
                        i19 = 0;
                        pVar3 = pVar;
                        obj = objB3;
                        str4 = str;
                        str3 = str2;
                        bVar = aVar;
                        bVar2 = bVar;
                        b0Var = b0VarG;
                        i15 = 0;
                        i18 = 0;
                        i17 = 0;
                        i16 = 0;
                        bVar3 = bVar2;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = pVar2.f85609s;
                        int i27 = pVar2.f85608r;
                        int i28 = pVar2.f85607q;
                        int i29 = pVar2.f85606p;
                        int i35 = pVar2.f85605n;
                        ex.b bVar5 = (ex.b) pVar2.f85603l;
                        iy.b0 b0Var2 = (iy.b0) pVar2.f85602k;
                        bVar = (ex.b) pVar2.f85601j;
                        ex.b bVar6 = (ex.b) pVar2.f85600h;
                        dx.j<dx.b> jVar = (dx.j) pVar2.f85599g;
                        pVar3 = (er.p) pVar2.f85598f;
                        str3 = (String) pVar2.f85597e;
                        obj = objB2;
                        String str5 = (String) pVar2.f85596d;
                        try {
                            oq.u.b(obj);
                            i15 = i26;
                            jVarA = jVar;
                            bVar2 = bVar6;
                            b0Var = b0Var2;
                            bVar3 = bVar5;
                            i16 = i35;
                            i17 = i29;
                            i18 = i28;
                            i19 = i27;
                            str4 = str5;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            dx.i iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar4 = (ex.b) pVar2.f85604m;
                        oq.u.b(objB2);
                    }
                    bVar4.a((dx.i) objB2);
                    return new dx.i.Right(i0.f148189a);
                } catch (CancellationException e18) {
                    throw e18;
                }
                iy.b0 data = ((ry.a) bVar3.a((dx.i) obj)).getData();
                g0 g0Var = this.networkCallMediator;
                String str6 = str3;
                q qVar = new q(data, null);
                pVar2.f85596d = vq.j.a(str4);
                pVar2.f85597e = vq.j.a(str6);
                pVar2.f85598f = vq.j.a(pVar3);
                pVar2.f85599g = jVarA;
                pVar2.f85600h = vq.j.a(bVar2);
                pVar2.f85601j = vq.j.a(bVar);
                pVar2.f85602k = vq.j.a(data);
                pVar2.f85603l = vq.j.a(b0Var);
                pVar2.f85604m = bVar;
                pVar2.f85605n = i16;
                pVar2.f85606p = i17;
                pVar2.f85607q = i18;
                pVar2.f85608r = i19;
                pVar2.f85609s = i15;
                pVar2.f85612w = 2;
                objB2 = g0Var.b(qVar, pVar2);
                if (objB2 != objE) {
                    bVar4 = bVar;
                    bVar4.a((dx.i) objB2);
                    return new dx.i.Right(i0.f148189a);
                }
                return objE;
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    @Override // pm0.i
    public Object g(SubmitPassportChildAgreementRequest submitPassportChildAgreementRequest, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new m(submitPassportChildAgreementRequest, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.i
    public Object h(String str, tq.e<? super dx.i<? extends dx.b, BEPassportAgreementDetails>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f85561g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f85561g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f85559e;
        Object objE = uq.b.e();
        int i16 = eVar2.f85561g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, null);
            eVar2.f85558d = vq.j.a(str);
            eVar2.f85561g = 1;
            objB = g0Var.b(fVar, eVar2);
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
            return new dx.i.Right(em0.b.c((PassportAgreementDetailsResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.i
    public Object i(s0 s0Var, String str, tq.e<? super dx.i<? extends dx.b, PassportChildAgreementGetChildData>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f85579h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f85579h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f85577f;
        Object objE = uq.b.e();
        int i16 = kVar.f85579h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(s0Var, str, null);
            kVar.f85575d = vq.j.a(s0Var);
            kVar.f85576e = vq.j.a(str);
            kVar.f85579h = 1;
            objB = g0Var.b(lVar, kVar);
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
            return new dx.i.Right(em0.a.a((PassportChildAgreementGetChildDataResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.i
    public Object j(s0 s0Var, VerifyPassportChildApplicationAgreementRequest verifyPassportChildApplicationAgreementRequest, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        n nVar;
        if (eVar instanceof n) {
            nVar = (n) eVar;
            int i15 = nVar.f85591h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                nVar.f85591h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                nVar = new n(eVar);
            }
        } else {
            nVar = new n(eVar);
        }
        Object objB = nVar.f85589f;
        Object objE = uq.b.e();
        int i16 = nVar.f85591h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            o oVar = new o(s0Var, verifyPassportChildApplicationAgreementRequest, null);
            nVar.f85587d = vq.j.a(s0Var);
            nVar.f85588e = vq.j.a(verifyPassportChildApplicationAgreementRequest);
            nVar.f85591h = 1;
            objB = g0Var.b(oVar, nVar);
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
            return new dx.i.Right(vq.b.a(((VerifyPassportChildAgreementResponse) ((dx.i.Right) iVar).b()).getAgreementAlreadyExists()));
        }
        throw new oq.p();
    }
}

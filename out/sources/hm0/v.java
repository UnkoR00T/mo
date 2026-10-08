package hm0;

import al0.ChildData;
import al0.s0;
import cl0.BEPassportChildApplicationAttachmentConfigResponse;
import cl0.BEPassportChildApplicationCountryDictionary;
import cl0.BEPassportChildApplicationOfficeDictionary;
import cl0.BEPassportChildApplicationParentData;
import cl0.BEPassportChildApplicationStatusResponse;
import cl0.BEPassportChildApplicationSubmitOnlinePaymentResponse;
import cl0.BEPassportChildApplicationXmlRequest;
import cl0.PassportChildApplicationGetChildData;
import cl0.PassportChildApplicationVerifyOfficeElectronicDeliveryAddress;
import gm0.PassportChildApplicationAttachmentConfigResponse;
import gm0.PassportChildApplicationCountryDictionaryDto;
import gm0.PassportChildApplicationGetChildDataResponse;
import gm0.PassportChildApplicationGetChildrenResponse;
import gm0.PassportChildApplicationGetParentDataResponse;
import gm0.PassportChildApplicationOfficeDictionaryDto;
import gm0.PassportChildApplicationStatusResponse;
import gm0.PassportChildApplicationSubmitOnlinePaymentResponse;
import gm0.PassportChildApplicationSubmitResponse;
import gm0.PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto;
import gm0.PassportChildApplicationXmlRequest;
import gm0.PassportChildApplicationXmlResponse;
import gm0.SubmitPassportChildApplicationAfterOnlinePaymentRequest;
import gm0.SubmitPassportChildApplicationRequest;
import gm0.j5;
import gm0.n5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\nH\u0096@¢\u0006\u0004\b\u0011\u0010\u000eJ,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000f0\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000f0\nH\u0096@¢\u0006\u0004\b\u001f\u0010\u000eJ,\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020$0\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b%\u0010&J$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020'0\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b(\u0010)J,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010*\u001a\u00020$H\u0096@¢\u0006\u0004\b+\u0010,J,\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020-0\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010*\u001a\u00020$H\u0096@¢\u0006\u0004\b.\u0010,J$\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002000\n2\u0006\u0010/\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b1\u00102J,\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010!\u001a\u00020 2\u0006\u00103\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b4\u00105J$\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002060\n2\u0006\u00103\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b7\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00109R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lhm0/v;", "Lpm0/j;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lez/a;", "currentTimeProvider", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lez/a;)V", "Ldx/i;", "Ldx/b;", "Lcl0/r;", "k", "(Ltq/e;)Ljava/lang/Object;", "", "Lal0/u;", "d", "Lal0/s0;", "passportType", "", "childId", "Lcl0/k0;", "e", "(Lal0/s0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lcl0/g0;", "passportOfficePlace", "Lcl0/q;", "i", "(Lcl0/g0;Ltq/e;)Ljava/lang/Object;", "Lcl0/o;", "a", "Liy/b0;", "externalAuthorizationToken", "Lcl0/d0;", "passportChildApplicationXmlRequest", "Lry/a;", "c", "(Liy/b0;Lcl0/d0;Ltq/e;)Ljava/lang/Object;", "Lcl0/h;", "b", "(Lal0/s0;Ltq/e;)Ljava/lang/Object;", "signedRequest", "h", "(Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lcl0/b0;", "l", "recipientOfficeUnitCode", "Lcl0/l0;", "j", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "applicationId", "g", "(Liy/b0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lcl0/a0;", "f", "Lpl/gov/coi/common/network/g0;", "Lez/a;", "Lwl0/g;", "Loq/k;", "p", "()Lwl0/g;", "client", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements pm0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85622f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85624h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85622f = obj;
            this.f85624h |= PKIFailureInfo.systemUnavail;
            return v.this.g(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/a5;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildApplicationSubmitResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85625e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85627g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f85628h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(iy.b0 b0Var, String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f85627g = b0Var;
            this.f85628h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85625e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            String strE = iy.c0.e(this.f85627g);
            SubmitPassportChildApplicationAfterOnlinePaymentRequest submitPassportChildApplicationAfterOnlinePaymentRequest = new SubmitPassportChildApplicationAfterOnlinePaymentRequest(this.f85628h);
            this.f85625e = 1;
            Object objC = gVarP.c(strE, submitPassportChildApplicationAfterOnlinePaymentRequest, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new b(this.f85627g, this.f85628h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildApplicationSubmitResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85631f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85633h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85631f = obj;
            this.f85633h |= PKIFailureInfo.systemUnavail;
            return v.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/e5;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildApplicationXmlResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85634e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85636g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BEPassportChildApplicationXmlRequest f85637h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(iy.b0 b0Var, BEPassportChildApplicationXmlRequest bEPassportChildApplicationXmlRequest, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f85636g = b0Var;
            this.f85637h = bEPassportChildApplicationXmlRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85634e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            String strE = iy.c0.e(this.f85636g);
            PassportChildApplicationXmlRequest c5VarF = zl0.a.F(this.f85637h);
            this.f85634e = 1;
            Object objA = gVarP.a(strE, c5VarF, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new d(this.f85636g, this.f85637h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildApplicationXmlResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85639e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85641g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85639e = obj;
            this.f85641g |= PKIFailureInfo.systemUnavail;
            return v.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/z3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildApplicationAttachmentConfigResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85642e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s0 f85644g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(s0 s0Var, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f85644g = s0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85642e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            n5 n5VarG = em0.a.g(this.f85644g);
            this.f85642e = 1;
            Object objD = gVarP.d(n5VarG, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new f(this.f85644g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildApplicationAttachmentConfigResponse>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85647f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85649h;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85647f = obj;
            this.f85649h |= PKIFailureInfo.systemUnavail;
            return v.this.e(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/k4;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildApplicationGetChildDataResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85650e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s0 f85652g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f85653h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(s0 s0Var, String str, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f85652g = s0Var;
            this.f85653h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85650e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            n5 n5VarG = em0.a.g(this.f85652g);
            String str = this.f85653h;
            this.f85650e = 1;
            Object objB = gVarP.b(n5VarG, str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new h(this.f85652g, this.f85653h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildApplicationGetChildDataResponse>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85654d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85656f;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85654d = obj;
            this.f85656f |= PKIFailureInfo.systemUnavail;
            return v.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/l4;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildApplicationGetChildrenResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85657e;

        j(tq.e<? super j> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85657e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            this.f85657e = 1;
            Object objK = gVarP.k(this);
            return objK == objE ? objE : objK;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new j(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildApplicationGetChildrenResponse>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85659d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85661f;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85659d = obj;
            this.f85661f |= PKIFailureInfo.systemUnavail;
            return v.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Lgm0/i4;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super ge4.x<List<? extends PassportChildApplicationCountryDictionaryDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85662e;

        l(tq.e<? super l> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85662e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            this.f85662e = 1;
            Object objL = gVarP.l(this);
            return objL == objE ? objE : objL;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new l(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<List<PassportChildApplicationCountryDictionaryDto>>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85664d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85666f;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85664d = obj;
            this.f85666f |= PKIFailureInfo.systemUnavail;
            return v.this.k(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/n4;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildApplicationGetParentDataResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85667e;

        n(tq.e<? super n> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85667e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            this.f85667e = 1;
            Object objJ = gVarP.j(this);
            return objJ == objE ? objE : objJ;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new n(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildApplicationGetParentDataResponse>> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85670e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85672g;

        o(tq.e<? super o> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85670e = obj;
            this.f85672g |= PKIFailureInfo.systemUnavail;
            return v.this.i(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Lgm0/o4;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.l<tq.e<? super ge4.x<List<? extends PassportChildApplicationOfficeDictionaryDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85673e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ cl0.g0 f85675g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(cl0.g0 g0Var, tq.e<? super p> eVar) {
            super(1, eVar);
            this.f85675g = g0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85673e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            j5 j5VarF = em0.a.f(this.f85675g);
            this.f85673e = 1;
            Object objG = gVarP.g(j5VarF, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new p(this.f85675g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<List<PassportChildApplicationOfficeDictionaryDto>>> eVar) {
            return ((p) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85677e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85679g;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85677e = obj;
            this.f85679g |= PKIFailureInfo.systemUnavail;
            return v.this.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/x4;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildApplicationStatusResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85680e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f85682g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, tq.e<? super r> eVar) {
            super(1, eVar);
            this.f85682g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85680e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            String str = this.f85682g;
            this.f85680e = 1;
            Object objE2 = gVarP.e(str, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new r(this.f85682g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildApplicationStatusResponse>> eVar) {
            return ((r) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85685f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85687h;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85685f = obj;
            this.f85687h |= PKIFailureInfo.systemUnavail;
            return v.this.h(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/a5;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildApplicationSubmitResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85688e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85690g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85691h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(iy.b0 b0Var, iy.b0 b0Var2, tq.e<? super t> eVar) {
            super(1, eVar);
            this.f85690g = b0Var;
            this.f85691h = b0Var2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85688e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            String strE = iy.c0.e(this.f85690g);
            SubmitPassportChildApplicationRequest submitPassportChildApplicationRequest = new SubmitPassportChildApplicationRequest(iy.c0.e(this.f85691h));
            this.f85688e = 1;
            Object objH = gVarP.h(strE, submitPassportChildApplicationRequest, this);
            return objH == objE ? objE : objH;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new t(this.f85690g, this.f85691h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildApplicationSubmitResponse>> eVar) {
            return ((t) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class u extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85694f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85696h;

        u(tq.e<? super u> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85694f = obj;
            this.f85696h |= PKIFailureInfo.systemUnavail;
            return v.this.l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: hm0.v$v, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/y4;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C1992v extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildApplicationSubmitOnlinePaymentResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85697e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85700h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1992v(iy.b0 b0Var, iy.b0 b0Var2, tq.e<? super C1992v> eVar) {
            super(1, eVar);
            this.f85699g = b0Var;
            this.f85700h = b0Var2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85697e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            String strE = iy.c0.e(this.f85699g);
            SubmitPassportChildApplicationRequest submitPassportChildApplicationRequest = new SubmitPassportChildApplicationRequest(iy.c0.e(this.f85700h));
            this.f85697e = 1;
            Object objI = gVarP.i(strE, submitPassportChildApplicationRequest, this);
            return objI == objE ? objE : objI;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new C1992v(this.f85699g, this.f85700h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildApplicationSubmitOnlinePaymentResponse>> eVar) {
            return ((C1992v) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class w extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85702e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85704g;

        w(tq.e<? super w> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85702e = obj;
            this.f85704g |= PKIFailureInfo.systemUnavail;
            return v.this.j(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/b5;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.l<tq.e<? super ge4.x<PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85705e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f85707g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str, tq.e<? super x> eVar) {
            super(1, eVar);
            this.f85707g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85705e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.g gVarP = v.this.p();
            String str = this.f85707g;
            this.f85705e = 1;
            Object objF = gVarP.f(str, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new x(this.f85707g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto>> eVar) {
            return ((x) M(eVar)).J(i0.f148189a);
        }
    }

    public v(final pl.gov.coi.common.network.w wVar, g0 g0Var, ez.a aVar) {
        this.networkCallMediator = g0Var;
        this.currentTimeProvider = aVar;
        this.client = oq.l.a(new er.a() { // from class: hm0.u
            @Override // er.a
            public final Object a() {
                return v.o(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.g o(pl.gov.coi.common.network.w wVar) {
        return (wl0.g) pl.gov.coi.common.network.w.b(wVar, null, wl0.g.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.g p() {
        return (wl0.g) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<BEPassportChildApplicationCountryDictionary>>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f85661f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f85661f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f85659d;
        Object objE = uq.b.e();
        int i16 = kVar.f85661f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(null);
            kVar.f85661f = 1;
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
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zl0.a.f((PassportChildApplicationCountryDictionaryDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object b(s0 s0Var, tq.e<? super dx.i<? extends dx.b, BEPassportChildApplicationAttachmentConfigResponse>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f85641g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f85641g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f85639e;
        Object objE = uq.b.e();
        int i16 = eVar2.f85641g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(s0Var, null);
            eVar2.f85638d = vq.j.a(s0Var);
            eVar2.f85641g = 1;
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
            return new dx.i.Right(zl0.a.e((PassportChildApplicationAttachmentConfigResponse) ((dx.i.Right) iVar).b(), this.currentTimeProvider));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object c(iy.b0 b0Var, BEPassportChildApplicationXmlRequest bEPassportChildApplicationXmlRequest, tq.e<? super dx.i<? extends dx.b, ry.a>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f85633h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f85633h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f85631f;
        Object objE = uq.b.e();
        int i16 = cVar.f85633h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(b0Var, bEPassportChildApplicationXmlRequest, null);
            cVar.f85629d = vq.j.a(b0Var);
            cVar.f85630e = vq.j.a(bEPassportChildApplicationXmlRequest);
            cVar.f85633h = 1;
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
            return new dx.i.Right(ry.a.a(ry.a.b(iy.c0.g(((PassportChildApplicationXmlResponse) ((dx.i.Right) iVar).b()).getXml()))));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object d(tq.e<? super dx.i<? extends dx.b, ? extends List<ChildData>>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f85656f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f85656f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f85654d;
        Object objE = uq.b.e();
        int i16 = iVar.f85656f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(null);
            iVar.f85656f = 1;
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
            return new dx.i.Right(zl0.a.n(((PassportChildApplicationGetChildrenResponse) ((dx.i.Right) iVar2).b()).a()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object e(s0 s0Var, String str, tq.e<? super dx.i<? extends dx.b, PassportChildApplicationGetChildData>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f85649h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f85649h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f85647f;
        Object objE = uq.b.e();
        int i16 = gVar.f85649h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(s0Var, str, null);
            gVar.f85645d = vq.j.a(s0Var);
            gVar.f85646e = vq.j.a(str);
            gVar.f85649h = 1;
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
            return new dx.i.Right(zl0.a.l((PassportChildApplicationGetChildDataResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object f(String str, tq.e<? super dx.i<? extends dx.b, BEPassportChildApplicationStatusResponse>> eVar) throws Throwable {
        q qVar;
        if (eVar instanceof q) {
            qVar = (q) eVar;
            int i15 = qVar.f85679g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                qVar.f85679g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                qVar = new q(eVar);
            }
        } else {
            qVar = new q(eVar);
        }
        Object objB = qVar.f85677e;
        Object objE = uq.b.e();
        int i16 = qVar.f85679g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            r rVar = new r(str, null);
            qVar.f85676d = vq.j.a(str);
            qVar.f85679g = 1;
            objB = g0Var.b(rVar, qVar);
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
            return new dx.i.Right(zl0.a.i((PassportChildApplicationStatusResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object g(iy.b0 b0Var, String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f85624h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f85624h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f85622f;
        Object objE = uq.b.e();
        int i16 = aVar.f85624h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(b0Var, str, null);
            aVar.f85620d = vq.j.a(b0Var);
            aVar.f85621e = vq.j.a(str);
            aVar.f85624h = 1;
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
            return new dx.i.Right(((PassportChildApplicationSubmitResponse) ((dx.i.Right) iVar).b()).getApplicationNumber());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object h(iy.b0 b0Var, iy.b0 b0Var2, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        s sVar;
        if (eVar instanceof s) {
            sVar = (s) eVar;
            int i15 = sVar.f85687h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                sVar.f85687h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                sVar = new s(eVar);
            }
        } else {
            sVar = new s(eVar);
        }
        Object objB = sVar.f85685f;
        Object objE = uq.b.e();
        int i16 = sVar.f85687h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            t tVar = new t(b0Var, b0Var2, null);
            sVar.f85683d = vq.j.a(b0Var);
            sVar.f85684e = vq.j.a(b0Var2);
            sVar.f85687h = 1;
            objB = g0Var.b(tVar, sVar);
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
            return new dx.i.Right(((PassportChildApplicationSubmitResponse) ((dx.i.Right) iVar).b()).getApplicationNumber());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object i(cl0.g0 g0Var, tq.e<? super dx.i<? extends dx.b, ? extends List<BEPassportChildApplicationOfficeDictionary>>> eVar) throws Throwable {
        o oVar;
        if (eVar instanceof o) {
            oVar = (o) eVar;
            int i15 = oVar.f85672g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f85672g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(eVar);
            }
        } else {
            oVar = new o(eVar);
        }
        Object objB = oVar.f85670e;
        Object objE = uq.b.e();
        int i16 = oVar.f85672g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var2 = this.networkCallMediator;
            p pVar = new p(g0Var, null);
            oVar.f85669d = vq.j.a(g0Var);
            oVar.f85672g = 1;
            objB = g0Var2.b(pVar, oVar);
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
        List list = (List) ((dx.i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(em0.a.d((PassportChildApplicationOfficeDictionaryDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object j(String str, tq.e<? super dx.i<? extends dx.b, PassportChildApplicationVerifyOfficeElectronicDeliveryAddress>> eVar) throws Throwable {
        w wVar;
        if (eVar instanceof w) {
            wVar = (w) eVar;
            int i15 = wVar.f85704g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                wVar.f85704g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                wVar = new w(eVar);
            }
        } else {
            wVar = new w(eVar);
        }
        Object objB = wVar.f85702e;
        Object objE = uq.b.e();
        int i16 = wVar.f85704g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            x xVar = new x(str, null);
            wVar.f85701d = vq.j.a(str);
            wVar.f85704g = 1;
            objB = g0Var.b(xVar, wVar);
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
            return new dx.i.Right(zl0.a.m((PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object k(tq.e<? super dx.i<? extends dx.b, BEPassportChildApplicationParentData>> eVar) throws Throwable {
        m mVar;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f85666f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f85666f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objB = mVar.f85664d;
        Object objE = uq.b.e();
        int i16 = mVar.f85666f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            n nVar = new n(null);
            mVar.f85666f = 1;
            objB = g0Var.b(nVar, mVar);
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
            return new dx.i.Right(zl0.a.g((PassportChildApplicationGetParentDataResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.j
    public Object l(iy.b0 b0Var, iy.b0 b0Var2, tq.e<? super dx.i<? extends dx.b, BEPassportChildApplicationSubmitOnlinePaymentResponse>> eVar) throws Throwable {
        u uVar;
        if (eVar instanceof u) {
            uVar = (u) eVar;
            int i15 = uVar.f85696h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                uVar.f85696h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                uVar = new u(eVar);
            }
        } else {
            uVar = new u(eVar);
        }
        Object objB = uVar.f85694f;
        Object objE = uq.b.e();
        int i16 = uVar.f85696h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C1992v c1992v = new C1992v(b0Var, b0Var2, null);
            uVar.f85692d = vq.j.a(b0Var);
            uVar.f85693e = vq.j.a(b0Var2);
            uVar.f85696h = 1;
            objB = g0Var.b(c1992v, uVar);
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
            return new dx.i.Right(zl0.a.j((PassportChildApplicationSubmitOnlinePaymentResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}

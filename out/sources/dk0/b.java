package dk0;

import ck0.CompanyApplicationResumptionRequest;
import ck0.CompanyApplicationResumptionV2Request;
import ck0.CompanyApplicationSetupCitizenDataDto;
import ck0.CompanyApplicationSuspensionRequest;
import ck0.CompanyApplicationSuspensionV2Request;
import ck0.GenerateApplicationResponse;
import fk0.BECitizenData;
import fk0.BEGenerateApplicationRequest;
import fk0.BEGenerateApplicationResponse;
import fk0.BEResumptionRequest;
import fk0.BEResumptionRequestV2;
import fk0.BESuspensionRequest;
import fk0.BESuspensionRequestV2;
import ge4.x;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Ldk0/b;", "Lgk0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lfk0/r;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lfk0/o0;", "request", "Lfk0/p0;", "e", "(Lfk0/o0;Ltq/e;)Ljava/lang/Object;", "Lfk0/c1;", "c", "(Lfk0/c1;Ltq/e;)Ljava/lang/Object;", "Lfk0/h1;", "b", "(Lfk0/h1;Ltq/e;)Ljava/lang/Object;", "Lfk0/d1;", "d", "(Lfk0/d1;Ltq/e;)Ljava/lang/Object;", "Lfk0/i1;", "f", "(Lfk0/i1;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/w;", "Lpl/gov/coi/common/network/g0;", "Lak0/a;", "Loq/k;", "j", "()Lak0/a;", "companyApplicationControllerApi", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gk0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k companyApplicationControllerApi = oq.l.a(new er.a() { // from class: dk0.a
        @Override // er.a
        public final Object a() {
            return b.i(this.f42995a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f42999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43000e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43002g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43000e = obj;
            this.f43002g |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, this);
        }
    }

    /* JADX INFO: renamed from: dk0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lck0/c1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C0951b extends vq.k implements er.l<tq.e<? super x<GenerateApplicationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ BEGenerateApplicationRequest f43004f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f43005g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0951b(BEGenerateApplicationRequest bEGenerateApplicationRequest, b bVar, tq.e<? super C0951b> eVar) {
            super(1, eVar);
            this.f43004f = bEGenerateApplicationRequest;
            this.f43005g = bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r5 == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r5 == r0) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f43003e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L58
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L3e
            L1e:
                oq.u.b(r5)
                fk0.o0 r5 = r4.f43004f
                boolean r5 = r5.getUseNewContactFormat()
                if (r5 != r3) goto L41
                dk0.b r5 = r4.f43005g
                ak0.a r5 = dk0.b.h(r5)
                fk0.o0 r1 = r4.f43004f
                ck0.e1 r1 = bk0.a.p0(r1)
                r4.f43003e = r3
                java.lang.Object r5 = r5.g(r1, r4)
                if (r5 != r0) goto L3e
                goto L57
            L3e:
                ge4.x r5 = (ge4.x) r5
                return r5
            L41:
                if (r5 != 0) goto L5b
                dk0.b r5 = r4.f43005g
                ak0.a r5 = dk0.b.h(r5)
                fk0.o0 r1 = r4.f43004f
                ck0.d1 r1 = bk0.a.i0(r1)
                r4.f43003e = r2
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L58
            L57:
                return r0
            L58:
                ge4.x r5 = (ge4.x) r5
                return r5
            L5b:
                oq.p r5 = new oq.p
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: dk0.b.C0951b.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new C0951b(this.f43004f, this.f43005g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GenerateApplicationResponse>> eVar) {
            return ((C0951b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43007e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43009g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43007e = obj;
            this.f43009g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lck0/c1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<GenerateApplicationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43010e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BEResumptionRequest f43012g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(BEResumptionRequest bEResumptionRequest, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f43012g = bEResumptionRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43010e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ak0.a aVarJ = b.this.j();
            CompanyApplicationResumptionRequest companyApplicationResumptionRequestX = bk0.a.X(this.f43012g);
            this.f43010e = 1;
            Object objD = aVarJ.d(companyApplicationResumptionRequestX, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new d(this.f43012g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GenerateApplicationResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43014e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43016g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43014e = obj;
            this.f43016g |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lck0/c1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<GenerateApplicationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43017e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BEResumptionRequestV2 f43019g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(BEResumptionRequestV2 bEResumptionRequestV2, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f43019g = bEResumptionRequestV2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43017e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ak0.a aVarJ = b.this.j();
            CompanyApplicationResumptionV2Request companyApplicationResumptionV2RequestY = bk0.a.Y(this.f43019g);
            this.f43017e = 1;
            Object objB = aVarJ.b(companyApplicationResumptionV2RequestY, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new f(this.f43019g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GenerateApplicationResponse>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43021e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43023g;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43021e = obj;
            this.f43023g |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lck0/c1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<GenerateApplicationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43024e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BESuspensionRequest f43026g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(BESuspensionRequest bESuspensionRequest, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f43026g = bESuspensionRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43024e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ak0.a aVarJ = b.this.j();
            CompanyApplicationSuspensionRequest companyApplicationSuspensionRequestD0 = bk0.a.d0(this.f43026g);
            this.f43024e = 1;
            Object objF = aVarJ.f(companyApplicationSuspensionRequestD0, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new h(this.f43026g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GenerateApplicationResponse>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43028e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43030g;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43028e = obj;
            this.f43030g |= PKIFailureInfo.systemUnavail;
            return b.this.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lck0/c1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<GenerateApplicationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43031e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BESuspensionRequestV2 f43033g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(BESuspensionRequestV2 bESuspensionRequestV2, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f43033g = bESuspensionRequestV2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43031e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ak0.a aVarJ = b.this.j();
            CompanyApplicationSuspensionV2Request companyApplicationSuspensionV2RequestE0 = bk0.a.e0(this.f43033g);
            this.f43031e = 1;
            Object objE2 = aVarJ.e(companyApplicationSuspensionV2RequestE0, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new j(this.f43033g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GenerateApplicationResponse>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f43034d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f43036f;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43034d = obj;
            this.f43036f |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lck0/c0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<CompanyApplicationSetupCitizenDataDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43037e;

        l(tq.e<? super l> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43037e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ak0.a aVarJ = b.this.j();
            this.f43037e = 1;
            Object objA = aVarJ.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new l(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<CompanyApplicationSetupCitizenDataDto>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    public b(w wVar, g0 g0Var) {
        this.httpServiceFactory = wVar;
        this.networkCallMediator = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ak0.a i(b bVar) {
        return (ak0.a) w.b(bVar.httpServiceFactory, null, ak0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ak0.a j() {
        return (ak0.a) this.companyApplicationControllerApi.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gk0.a
    public Object a(tq.e<? super dx.i<? extends dx.b, BECitizenData>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f43036f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f43036f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f43034d;
        Object objE = uq.b.e();
        int i16 = kVar.f43036f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(null);
            kVar.f43036f = 1;
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
            return new dx.i.Right(bk0.a.c((CompanyApplicationSetupCitizenDataDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gk0.a
    public Object b(BESuspensionRequest bESuspensionRequest, tq.e<? super dx.i<? extends dx.b, BEGenerateApplicationResponse>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f43023g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f43023g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f43021e;
        Object objE = uq.b.e();
        int i16 = gVar.f43023g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(bESuspensionRequest, null);
            gVar.f43020d = vq.j.a(bESuspensionRequest);
            gVar.f43023g = 1;
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
            return new dx.i.Right(bk0.a.y((GenerateApplicationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gk0.a
    public Object c(BEResumptionRequest bEResumptionRequest, tq.e<? super dx.i<? extends dx.b, BEGenerateApplicationResponse>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f43009g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f43009g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f43007e;
        Object objE = uq.b.e();
        int i16 = cVar.f43009g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(bEResumptionRequest, null);
            cVar.f43006d = vq.j.a(bEResumptionRequest);
            cVar.f43009g = 1;
            objB = g0Var.b(dVar, cVar);
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
            return new dx.i.Right(bk0.a.y((GenerateApplicationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gk0.a
    public Object d(BEResumptionRequestV2 bEResumptionRequestV2, tq.e<? super dx.i<? extends dx.b, BEGenerateApplicationResponse>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f43016g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f43016g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f43014e;
        Object objE = uq.b.e();
        int i16 = eVar2.f43016g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(bEResumptionRequestV2, null);
            eVar2.f43013d = vq.j.a(bEResumptionRequestV2);
            eVar2.f43016g = 1;
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
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(bk0.a.y((GenerateApplicationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gk0.a
    public Object e(BEGenerateApplicationRequest bEGenerateApplicationRequest, tq.e<? super dx.i<? extends dx.b, BEGenerateApplicationResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f43002g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f43002g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f43000e;
        Object objE = uq.b.e();
        int i16 = aVar.f43002g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C0951b c0951b = new C0951b(bEGenerateApplicationRequest, this, null);
            aVar.f42999d = vq.j.a(bEGenerateApplicationRequest);
            aVar.f43002g = 1;
            objB = g0Var.b(c0951b, aVar);
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
            return new dx.i.Right(bk0.a.y((GenerateApplicationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gk0.a
    public Object f(BESuspensionRequestV2 bESuspensionRequestV2, tq.e<? super dx.i<? extends dx.b, BEGenerateApplicationResponse>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f43030g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f43030g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f43028e;
        Object objE = uq.b.e();
        int i16 = iVar.f43030g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(bESuspensionRequestV2, null);
            iVar.f43027d = vq.j.a(bESuspensionRequestV2);
            iVar.f43030g = 1;
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
            return new dx.i.Right(bk0.a.y((GenerateApplicationResponse) ((dx.i.Right) iVar2).b()));
        }
        throw new p();
    }
}

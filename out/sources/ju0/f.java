package ju0;

import cu0.BadDomainReport;
import cu0.FraudReport;
import cu0.IllegalContentReport;
import cu0.IncidentId;
import cu0.OtherReport;
import cu0.ReportedIncidentReference;
import er.p;
import fv.b0;
import fv.y;
import fv.z;
import ge4.x;
import iu0.BadDomainReportDto;
import iu0.FraudReportDto;
import iu0.IllegalContentReportDto;
import iu0.IncidentIdDto;
import iu0.OtherReportDto;
import iu0.ReportedIncidentReferenceDto;
import java.io.InputStream;
import ju.g1;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.e0;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.s;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J,\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020$0\u00102\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\fH\u0096@¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b*\u0010+J$\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020$0\u00102\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00101R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u00103\u001a\u0004\b4\u00105R\u001b\u0010:\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u00103\u001a\u0004\b8\u00109R\u001b\u0010>\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lju0/f;", "Llu0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/s;", "httpClientFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lpl/gov/coi/common/network/e0;", "multipartManager", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/s;Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/e0;)V", "Lwx/i;", "Lfv/y$c;", "u", "(Lwx/i;)Lfv/y$c;", "Ldx/i;", "Ldx/b;", "Lcu0/e;", "g", "(Ltq/e;)Ljava/lang/Object;", "incidentId", "Lcu0/b;", "fraudReport", "Lcu0/g;", "d", "(Lcu0/e;Lcu0/b;Ltq/e;)Ljava/lang/Object;", "Lcu0/a;", "badDomainReport", "c", "(Lcu0/e;Lcu0/a;Ltq/e;)Ljava/lang/Object;", "Lcu0/f;", "otherReport", "a", "(Lcu0/e;Lcu0/f;Ltq/e;)Ljava/lang/Object;", "file", "Loq/i0;", "b", "(Lcu0/e;Lwx/i;Ltq/e;)Ljava/lang/Object;", "", "url", "Ljava/io/InputStream;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lcu0/c;", "illegalContentReport", "f", "(Lcu0/c;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lpl/gov/coi/common/network/e0;", "Lgu0/c;", "Loq/k;", "r", "()Lgu0/c;", "reportIncidentService", "Lgu0/b;", "q", "()Lgu0/b;", "reportIllegalContentService", "Lfv/z;", "p", "()Lfv/z;", "defaultClient", "securityincidentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements lu0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e0 multipartManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k reportIncidentService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k reportIllegalContentService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k defaultClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f105825d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f105827f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105825d = obj;
            this.f105827f |= PKIFailureInfo.systemUnavail;
            return f.this.g(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Liu0/j;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<IncidentIdDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105828e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105828e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gu0.c cVarR = f.this.r();
            this.f105828e = 1;
            Object objC = cVarR.c(this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<IncidentIdDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Ljava/io/InputStream;", "<anonymous>", "(Lju/p0;)Ljava/io/InputStream;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super InputStream>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f105831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f105832g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, f fVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f105831f = str;
            this.f105832g = fVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f105830e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            fv.e0 body = this.f105832g.p().b(new b0.a().k(this.f105831f).b()).B().getBody();
            if (body != null) {
                return body.b();
            }
            return null;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super InputStream> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f105831f, this.f105832g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f105833d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f105834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105835f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f105837h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105835f = obj;
            this.f105837h |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Liu0/l;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super x<ReportedIncidentReferenceDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105838e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ IncidentId f105840g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BadDomainReport f105841h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(IncidentId incidentId, BadDomainReport badDomainReport, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f105840g = incidentId;
            this.f105841h = badDomainReport;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105838e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gu0.c cVarR = f.this.r();
            String incidentId = this.f105840g.getIncidentId();
            BadDomainReportDto badDomainReportDtoC = hu0.b.c(this.f105841h);
            this.f105838e = 1;
            Object objD = cVarR.d(incidentId, badDomainReportDtoC, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new e(this.f105840g, this.f105841h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ReportedIncidentReferenceDto>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: ju0.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2507f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f105842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f105843e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f105845g;

        C2507f(tq.e<? super C2507f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105843e = obj;
            this.f105845g |= PKIFailureInfo.systemUnavail;
            return f.this.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105846e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ IllegalContentReport f105848g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(IllegalContentReport illegalContentReport, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f105848g = illegalContentReport;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105846e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gu0.b bVarQ = f.this.q();
            IllegalContentReportDto illegalContentReportDtoE = hu0.b.e(this.f105848g);
            this.f105846e = 1;
            Object objA = bVarQ.a(illegalContentReportDtoE, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new g(this.f105848g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f105849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f105850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105851f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f105853h;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105851f = obj;
            this.f105853h |= PKIFailureInfo.systemUnavail;
            return f.this.d(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Liu0/l;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.l<tq.e<? super x<ReportedIncidentReferenceDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105854e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ IncidentId f105856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ FraudReport f105857h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(IncidentId incidentId, FraudReport fraudReport, tq.e<? super i> eVar) {
            super(1, eVar);
            this.f105856g = incidentId;
            this.f105857h = fraudReport;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105854e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gu0.c cVarR = f.this.r();
            String incidentId = this.f105856g.getIncidentId();
            FraudReportDto fraudReportDtoD = hu0.b.d(this.f105857h);
            this.f105854e = 1;
            Object objA = cVarR.a(incidentId, fraudReportDtoD, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new i(this.f105856g, this.f105857h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ReportedIncidentReferenceDto>> eVar) {
            return ((i) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f105858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f105859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105860f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f105862h;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105860f = obj;
            this.f105862h |= PKIFailureInfo.systemUnavail;
            return f.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Liu0/l;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.l<tq.e<? super x<ReportedIncidentReferenceDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105863e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ IncidentId f105865g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ OtherReport f105866h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(IncidentId incidentId, OtherReport otherReport, tq.e<? super k> eVar) {
            super(1, eVar);
            this.f105865g = incidentId;
            this.f105866h = otherReport;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105863e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gu0.c cVarR = f.this.r();
            String incidentId = this.f105865g.getIncidentId();
            OtherReportDto otherReportDtoG = hu0.b.g(this.f105866h);
            this.f105863e = 1;
            Object objE2 = cVarR.e(incidentId, otherReportDtoG, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new k(this.f105865g, this.f105866h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ReportedIncidentReferenceDto>> eVar) {
            return ((k) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f105867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f105868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105869f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f105871h;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105869f = obj;
            this.f105871h |= PKIFailureInfo.systemUnavail;
            return f.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105872e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ IncidentId f105874g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wx.i f105875h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(IncidentId incidentId, wx.i iVar, tq.e<? super m> eVar) {
            super(1, eVar);
            this.f105874g = incidentId;
            this.f105875h = iVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105872e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gu0.c cVarR = f.this.r();
            String incidentId = this.f105874g.getIncidentId();
            y.c cVarU = f.this.u(this.f105875h);
            this.f105872e = 1;
            Object objB = cVarR.b(incidentId, cVarU, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new m(this.f105874g, this.f105875h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((m) M(eVar)).J(i0.f148189a);
        }
    }

    public f(final w wVar, final s sVar, g0 g0Var, e0 e0Var) {
        this.networkCallMediator = g0Var;
        this.multipartManager = e0Var;
        this.reportIncidentService = oq.l.a(new er.a() { // from class: ju0.c
            @Override // er.a
            public final Object a() {
                return f.t(wVar);
            }
        });
        this.reportIllegalContentService = oq.l.a(new er.a() { // from class: ju0.d
            @Override // er.a
            public final Object a() {
                return f.s(wVar);
            }
        });
        this.defaultClient = oq.l.a(new er.a() { // from class: ju0.e
            @Override // er.a
            public final Object a() {
                return f.o(sVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z o(s sVar) {
        return s.b(sVar, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z p() {
        return (z) this.defaultClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gu0.b q() {
        return (gu0.b) this.reportIllegalContentService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gu0.c r() {
        return (gu0.c) this.reportIncidentService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gu0.b s(w wVar) {
        return (gu0.b) w.b(wVar, null, gu0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gu0.c t(w wVar) {
        return (gu0.c) w.b(wVar, null, gu0.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y.c u(wx.i iVar) {
        return e0.c(this.multipartManager, iVar.getFileContent().getBytes(), iVar.getMetadata().getName(), iVar.getMetadata().getExtension(), null, null, 24, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lu0.b
    public Object a(IncidentId incidentId, OtherReport otherReport, tq.e<? super dx.i<? extends dx.b, ReportedIncidentReference>> eVar) throws Throwable {
        j jVar;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f105862h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f105862h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object objB = jVar.f105860f;
        Object objE = uq.b.e();
        int i16 = jVar.f105862h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            k kVar = new k(incidentId, otherReport, null);
            jVar.f105858d = vq.j.a(incidentId);
            jVar.f105859e = vq.j.a(otherReport);
            jVar.f105862h = 1;
            objB = g0Var.b(kVar, jVar);
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
            return new dx.i.Right(hu0.b.b((ReportedIncidentReferenceDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lu0.b
    public Object b(IncidentId incidentId, wx.i iVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        l lVar;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i15 = lVar.f105871h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f105871h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        Object objB = lVar.f105869f;
        Object objE = uq.b.e();
        int i16 = lVar.f105871h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            m mVar = new m(incidentId, iVar, null);
            lVar.f105867d = vq.j.a(incidentId);
            lVar.f105868e = vq.j.a(iVar);
            lVar.f105871h = 1;
            objB = g0Var.b(mVar, lVar);
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
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
        }
        if (!(iVar2 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lu0.b
    public Object c(IncidentId incidentId, BadDomainReport badDomainReport, tq.e<? super dx.i<? extends dx.b, ReportedIncidentReference>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f105837h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f105837h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objB = dVar.f105835f;
        Object objE = uq.b.e();
        int i16 = dVar.f105837h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            e eVar2 = new e(incidentId, badDomainReport, null);
            dVar.f105833d = vq.j.a(incidentId);
            dVar.f105834e = vq.j.a(badDomainReport);
            dVar.f105837h = 1;
            objB = g0Var.b(eVar2, dVar);
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
            return new dx.i.Right(hu0.b.b((ReportedIncidentReferenceDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lu0.b
    public Object d(IncidentId incidentId, FraudReport fraudReport, tq.e<? super dx.i<? extends dx.b, ReportedIncidentReference>> eVar) throws Throwable {
        h hVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f105853h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f105853h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objB = hVar.f105851f;
        Object objE = uq.b.e();
        int i16 = hVar.f105853h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            i iVar = new i(incidentId, fraudReport, null);
            hVar.f105849d = vq.j.a(incidentId);
            hVar.f105850e = vq.j.a(fraudReport);
            hVar.f105853h = 1;
            objB = g0Var.b(iVar, hVar);
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
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(hu0.b.b((ReportedIncidentReferenceDto) ((dx.i.Right) iVar2).b()));
        }
        throw new oq.p();
    }

    @Override // lu0.b
    public Object e(String str, tq.e<? super InputStream> eVar) {
        return ju.i.g(g1.b(), new c(str, this, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lu0.b
    public Object f(IllegalContentReport illegalContentReport, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        C2507f c2507f;
        if (eVar instanceof C2507f) {
            c2507f = (C2507f) eVar;
            int i15 = c2507f.f105845g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c2507f.f105845g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c2507f = new C2507f(eVar);
            }
        } else {
            c2507f = new C2507f(eVar);
        }
        Object objB = c2507f.f105843e;
        Object objE = uq.b.e();
        int i16 = c2507f.f105845g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            g gVar = new g(illegalContentReport, null);
            c2507f.f105842d = vq.j.a(illegalContentReport);
            c2507f.f105845g = 1;
            objB = g0Var.b(gVar, c2507f);
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
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lu0.b
    public Object g(tq.e<? super dx.i<? extends dx.b, IncidentId>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f105827f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f105827f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f105825d;
        Object objE = uq.b.e();
        int i16 = aVar.f105827f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(null);
            aVar.f105827f = 1;
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
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(hu0.b.a((IncidentIdDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}

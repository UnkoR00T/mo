package yt0;

import ge4.x;
import java.time.OffsetDateTime;
import java.util.List;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.HttpServiceParameters;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.serializer.ZonedDateTimeSerializer;
import pl.gov.coi.common.network.w;
import pl.gov.coi.common.network.y;
import tt0.BEAttachments;
import tt0.BEAttachmentsConfiguration;
import tt0.BEReportCategoriesResponse;
import tt0.BEReportedInterventionGroup;
import tt0.BESendReportResponse;
import tt0.s;
import xt0.AttachmentsInterventionConfigurationResponse;
import xt0.GetReportedInterventionsResponse;
import xt0.GetReportedObjectInterventionResponse;
import xt0.GetReportedProductInterventionResponse;
import xt0.InterventionTypeCategoryResponse;
import xt0.ReportedInterventionResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a0\u000eH\u0096@¢\u0006\u0004\b\u001b\u0010\u0012J\"\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u000eH\u0096@¢\u0006\u0004\b\u001e\u0010\u0012J,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b-\u0010.R\u001b\u00101\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b0\u0010.¨\u00062"}, d2 = {"Lyt0/c;", "Lau0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lez/a;", "currentTimeProvider", "Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;", "zonedDateTimeSerializer", "Lay/h;", "jsonFactory", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lez/a;Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;Lay/h;)V", "Ldx/i;", "Ldx/b;", "Ltt0/f;", "b", "(Ltq/e;)Ljava/lang/Object;", "Ltt0/s;", "report", "Ltt0/a;", "attachments", "Ltt0/t;", "e", "(Ltt0/s;Ltt0/a;Ltq/e;)Ljava/lang/Object;", "Ltt0/b;", "d", "", "Ltt0/m;", "a", "", "initiativeId", "Ltt0/e;", "type", "Ltt0/l;", "c", "(Ljava/lang/String;Ltt0/e;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lez/a;", "Lay/j;", "Lay/j;", "offsetDateTimeSerializer", "Lvt0/a;", "Loq/k;", "k", "()Lvt0/a;", "client", "l", "zonedDateTimeClient", "sanitaryinspectorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements au0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ay.j offsetDateTimeSerializer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k zonedDateTimeClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229294a;

        static {
            int[] iArr = new int[tt0.e.values().length];
            try {
                iArr[tt0.e.LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tt0.e.PRODUCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f229294a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f229295d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f229297f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229295d = obj;
            this.f229297f |= PKIFailureInfo.systemUnavail;
            return c.this.b(this);
        }
    }

    /* JADX INFO: renamed from: yt0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxt0/x;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C6156c extends vq.k implements er.l<tq.e<? super x<InterventionTypeCategoryResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229298e;

        C6156c(tq.e<? super C6156c> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229298e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vt0.a aVarK = c.this.k();
            this.f229298e = 1;
            Object objD = aVarK.d(this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new C6156c(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<InterventionTypeCategoryResponse>> eVar) {
            return ((C6156c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f229300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f229301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229302f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f229304h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229302f = obj;
            this.f229304h |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxt0/f;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super x<GetReportedObjectInterventionResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229305e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f229307g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f229307g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229305e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vt0.a aVarK = c.this.k();
            String str = this.f229307g;
            this.f229305e = 1;
            Object objC = aVarK.c(str, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new e(this.f229307g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GetReportedObjectInterventionResponse>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxt0/k;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<GetReportedProductInterventionResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229308e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f229310g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f229310g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229308e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vt0.a aVarK = c.this.k();
            String str = this.f229310g;
            this.f229308e = 1;
            Object objE2 = aVarK.e(str, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new f(this.f229310g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GetReportedProductInterventionResponse>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f229311d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f229313f;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229311d = obj;
            this.f229313f |= PKIFailureInfo.systemUnavail;
            return c.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxt0/e;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<GetReportedInterventionsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229314e;

        h(tq.e<? super h> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229314e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vt0.a aVarK = c.this.k();
            this.f229314e = 1;
            Object objA = aVarK.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new h(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GetReportedInterventionsResponse>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f229316d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f229318f;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229316d = obj;
            this.f229318f |= PKIFailureInfo.systemUnavail;
            return c.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxt0/a;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<AttachmentsInterventionConfigurationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229319e;

        j(tq.e<? super j> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229319e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vt0.a aVarK = c.this.k();
            this.f229319e = 1;
            Object objF = aVarK.f(this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new j(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AttachmentsInterventionConfigurationResponse>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f229321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f229322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229323f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f229325h;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229323f = obj;
            this.f229325h |= PKIFailureInfo.systemUnavail;
            return c.this.e(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxt0/n0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<ReportedInterventionResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ s f229327f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f229328g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BEAttachments f229329h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(s sVar, c cVar, BEAttachments bEAttachments, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f229327f = sVar;
            this.f229328g = cVar;
            this.f229329h = bEAttachments;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (r5 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        
            if (r5 == r0) goto L21;
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
                int r1 = r4.f229326e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L60
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L40
            L1e:
                oq.u.b(r5)
                tt0.s r5 = r4.f229327f
                boolean r1 = r5 instanceof tt0.s.ObjectRequest
                if (r1 == 0) goto L43
                yt0.c r5 = r4.f229328g
                vt0.a r5 = yt0.c.i(r5)
                tt0.s r1 = r4.f229327f
                tt0.s$e r1 = (tt0.s.ObjectRequest) r1
                tt0.a r2 = r4.f229329h
                xt0.d0 r1 = wt0.a.A(r1, r2)
                r4.f229326e = r3
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L40
                goto L5f
            L40:
                ge4.x r5 = (ge4.x) r5
                return r5
            L43:
                boolean r5 = r5 instanceof tt0.s.ProductRequest
                if (r5 == 0) goto L63
                yt0.c r5 = r4.f229328g
                vt0.a r5 = yt0.c.i(r5)
                tt0.s r1 = r4.f229327f
                tt0.s$h r1 = (tt0.s.ProductRequest) r1
                tt0.a r3 = r4.f229329h
                xt0.g0 r1 = wt0.a.C(r1, r3)
                r4.f229326e = r2
                java.lang.Object r5 = r5.g(r1, r4)
                if (r5 != r0) goto L60
            L5f:
                return r0
            L60:
                ge4.x r5 = (ge4.x) r5
                return r5
            L63:
                oq.p r5 = new oq.p
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yt0.c.l.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new l(this.f229327f, this.f229328g, this.f229329h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ReportedInterventionResponse>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    public c(final w wVar, g0 g0Var, ez.a aVar, ZonedDateTimeSerializer zonedDateTimeSerializer, ay.h hVar) {
        this.networkCallMediator = g0Var;
        this.currentTimeProvider = aVar;
        this.offsetDateTimeSerializer = hVar.c(OffsetDateTime.class, zonedDateTimeSerializer);
        this.client = oq.l.a(new er.a() { // from class: yt0.a
            @Override // er.a
            public final Object a() {
                return c.j(wVar);
            }
        });
        this.zonedDateTimeClient = oq.l.a(new er.a() { // from class: yt0.b
            @Override // er.a
            public final Object a() {
                return c.m(this.f229287a, wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vt0.a j(w wVar) {
        return (vt0.a) w.b(wVar, null, vt0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vt0.a k() {
        return (vt0.a) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vt0.a l() {
        return (vt0.a) this.zonedDateTimeClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vt0.a m(c cVar, w wVar) {
        return (vt0.a) wVar.a(new y.Backend(new y.b.C3925b(new HttpServiceParameters(null, cVar.offsetDateTimeSerializer, 1, null))), vt0.a.class);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // au0.a
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<BEReportedInterventionGroup>>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f229313f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f229313f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f229311d;
        Object objE = uq.b.e();
        int i16 = gVar.f229313f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(null);
            gVar.f229313f = 1;
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
            return wt0.a.c((GetReportedInterventionsResponse) ((dx.i.Right) iVar).b());
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // au0.a
    public Object b(tq.e<? super dx.i<? extends dx.b, BEReportCategoriesResponse>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f229297f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f229297f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objB = bVar.f229295d;
        Object objE = uq.b.e();
        int i16 = bVar.f229297f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C6156c c6156c = new C6156c(null);
            bVar.f229297f = 1;
            objB = g0Var.b(c6156c, bVar);
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
            return wt0.a.i((InterventionTypeCategoryResponse) ((dx.i.Right) iVar).b());
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (r8 == r1) goto L35;
     */
    @Override // au0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r6, tt0.e r7, tq.e<? super dx.i<? extends dx.b, ? extends tt0.l>> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt0.c.c(java.lang.String, tt0.e, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // au0.a
    public Object d(tq.e<? super dx.i<? extends dx.b, BEAttachmentsConfiguration>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f229318f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f229318f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f229316d;
        Object objE = uq.b.e();
        int i16 = iVar.f229318f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(null);
            iVar.f229318f = 1;
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
            return wt0.a.a((AttachmentsInterventionConfigurationResponse) ((dx.i.Right) iVar2).b(), this.currentTimeProvider);
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // au0.a
    public Object e(s sVar, BEAttachments bEAttachments, tq.e<? super dx.i<? extends dx.b, BESendReportResponse>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f229325h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f229325h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f229323f;
        Object objE = uq.b.e();
        int i16 = kVar.f229325h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(sVar, this, bEAttachments, null);
            kVar.f229321d = vq.j.a(sVar);
            kVar.f229322e = vq.j.a(bEAttachments);
            kVar.f229325h = 1;
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
            return new dx.i.Right(wt0.a.w((ReportedInterventionResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}

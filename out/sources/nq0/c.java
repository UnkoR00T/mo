package nq0;

import ge4.x;
import iq0.Announcements;
import iq0.AnonymousFeatureFlags;
import iq0.ApplicationFormServices;
import iq0.BESearchConfig;
import iq0.EnvironmentViolationImageSettings;
import iq0.MobileSettings;
import iq0.SearchTags;
import iq0.TrustedCertificates;
import mq0.AnnouncementsDto;
import mq0.AnonymousFeatureFlagsDto;
import mq0.ApplicationFormServicesDto;
import mq0.EnvironmentViolationImageSettingsDto;
import mq0.MobileSettingsDto;
import mq0.SearchConfigDto;
import mq0.SearchTagsDto;
import mq0.TrustedCertificatesDto;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u000eJ\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\nH\u0096@¢\u0006\u0004\b\u0012\u0010\u000eJ\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\nH\u0096@¢\u0006\u0004\b\u0014\u0010\u000eJ\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00150\nH\u0096@¢\u0006\u0004\b\u0016\u0010\u000eJ\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\nH\u0096@¢\u0006\u0004\b\u0018\u0010\u000eJ\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\nH\u0096@¢\u0006\u0004\b\u001a\u0010\u000eJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\nH\u0096@¢\u0006\u0004\b\u001c\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lnq0/c;", "Lpq0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Ld00/a;", "inMemoryCache", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Ld00/a;)V", "Ldx/i;", "Ldx/b;", "Liq0/w;", "g", "(Ltq/e;)Ljava/lang/Object;", "Liq0/f;", "e", "Liq0/h0;", "c", "Liq0/c;", "h", "Liq0/k;", "a", "Liq0/s;", "f", "Liq0/l;", "b", "Liq0/b0;", "d", "Lpl/gov/coi/common/network/g0;", "Ld00/a;", "Lkq0/f;", "Lkq0/f;", "mobileSettingsHttpService", "Lkq0/b;", "Lkq0/b;", "anonymousFeatureFlagsHttpService", "Lkq0/g;", "Lkq0/g;", "trustedCertificatesHttpService", "Lkq0/a;", "Lkq0/a;", "whatsNewControllerApi", "Lkq0/c;", "Lkq0/c;", "applicationFormServicesControllerApi", "Lkq0/d;", "Loq/k;", "t", "()Lkq0/d;", "environmentViolationImageSettingsControllerApi", "Lkq0/e;", "i", "u", "()Lkq0/e;", "globalSearchControllerApi", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements pq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d00.a inMemoryCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kq0.f mobileSettingsHttpService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final kq0.b anonymousFeatureFlagsHttpService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final kq0.g trustedCertificatesHttpService;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final kq0.a whatsNewControllerApi;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final kq0.c applicationFormServicesControllerApi;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k environmentViolationImageSettingsControllerApi;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final oq.k globalSearchControllerApi;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Liq0/f;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends AnonymousFeatureFlags>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137690e;

        /* JADX INFO: renamed from: nq0.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lmq0/f;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
        static final class C3396a extends vq.k implements er.l<tq.e<? super x<AnonymousFeatureFlagsDto>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f137692e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c f137693f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C3396a(c cVar, tq.e<? super C3396a> eVar) {
                super(1, eVar);
                this.f137693f = cVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f137692e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                kq0.b bVar = this.f137693f.anonymousFeatureFlagsHttpService;
                this.f137692e = 1;
                Object objE2 = bVar.e(this);
                return objE2 == objE ? objE : objE2;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new C3396a(this.f137693f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super x<AnonymousFeatureFlagsDto>> eVar) {
                return ((C3396a) M(eVar)).J(i0.f148189a);
            }
        }

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137690e;
            if (i15 == 0) {
                u.b(obj);
                g0 g0Var = c.this.networkCallMediator;
                C3396a c3396a = new C3396a(c.this, null);
                this.f137690e = 1;
                obj = g0Var.b(c3396a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(lq0.a.f((AnonymousFeatureFlagsDto) ((dx.i.Right) iVar).b()));
            }
            throw new p();
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, AnonymousFeatureFlags>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f137694d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f137696f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f137694d = obj;
            this.f137696f |= PKIFailureInfo.systemUnavail;
            return c.this.a(this);
        }
    }

    /* JADX INFO: renamed from: nq0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lmq0/k;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C3397c extends vq.k implements er.l<tq.e<? super x<ApplicationFormServicesDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137697e;

        C3397c(tq.e<? super C3397c> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137697e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kq0.c cVar = c.this.applicationFormServicesControllerApi;
            this.f137697e = 1;
            Object objA = cVar.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new C3397c(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ApplicationFormServicesDto>> eVar) {
            return ((C3397c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f137699d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f137701f;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f137699d = obj;
            this.f137701f |= PKIFailureInfo.systemUnavail;
            return c.this.f(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lmq0/p;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super x<EnvironmentViolationImageSettingsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137702e;

        e(tq.e<? super e> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137702e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kq0.d dVarT = c.this.t();
            this.f137702e = 1;
            Object objA = dVarT.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new e(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<EnvironmentViolationImageSettingsDto>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f137704d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f137706f;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f137704d = obj;
            this.f137706f |= PKIFailureInfo.systemUnavail;
            return c.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lmq0/y;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super x<SearchConfigDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137707e;

        g(tq.e<? super g> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137707e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kq0.e eVarU = c.this.u();
            this.f137707e = 1;
            Object objB = eVarU.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new g(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SearchConfigDto>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f137709d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f137711f;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f137709d = obj;
            this.f137711f |= PKIFailureInfo.systemUnavail;
            return c.this.g(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lmq0/u;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.l<tq.e<? super x<MobileSettingsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137712e;

        i(tq.e<? super i> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137712e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kq0.f fVar = c.this.mobileSettingsHttpService;
            this.f137712e = 1;
            Object objA = fVar.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new i(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<MobileSettingsDto>> eVar) {
            return ((i) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f137714d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f137716f;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f137714d = obj;
            this.f137716f |= PKIFailureInfo.systemUnavail;
            return c.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lmq0/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.l<tq.e<? super x<SearchTagsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137717e;

        k(tq.e<? super k> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137717e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kq0.e eVarU = c.this.u();
            this.f137717e = 1;
            Object objD = eVarU.d(this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new k(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SearchTagsDto>> eVar) {
            return ((k) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f137719d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f137721f;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f137719d = obj;
            this.f137721f |= PKIFailureInfo.systemUnavail;
            return c.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lmq0/g0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.l<tq.e<? super x<TrustedCertificatesDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137722e;

        m(tq.e<? super m> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137722e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kq0.g gVar = c.this.trustedCertificatesHttpService;
            this.f137722e = 1;
            Object objC = gVar.c(this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new m(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<TrustedCertificatesDto>> eVar) {
            return ((m) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class n extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f137724d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f137726f;

        n(tq.e<? super n> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f137724d = obj;
            this.f137726f |= PKIFailureInfo.systemUnavail;
            return c.this.h(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lmq0/c;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.l<tq.e<? super x<AnnouncementsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137727e;

        o(tq.e<? super o> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137727e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kq0.a aVar = c.this.whatsNewControllerApi;
            this.f137727e = 1;
            Object objA = aVar.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new o(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AnnouncementsDto>> eVar) {
            return ((o) M(eVar)).J(i0.f148189a);
        }
    }

    public c(final w wVar, g0 g0Var, d00.a aVar) {
        this.networkCallMediator = g0Var;
        this.inMemoryCache = aVar;
        this.mobileSettingsHttpService = (kq0.f) w.b(wVar, null, kq0.f.class, 1, null);
        this.anonymousFeatureFlagsHttpService = (kq0.b) w.b(wVar, null, kq0.b.class, 1, null);
        this.trustedCertificatesHttpService = (kq0.g) w.b(wVar, null, kq0.g.class, 1, null);
        this.whatsNewControllerApi = (kq0.a) w.b(wVar, null, kq0.a.class, 1, null);
        this.applicationFormServicesControllerApi = (kq0.c) w.b(wVar, null, kq0.c.class, 1, null);
        this.environmentViolationImageSettingsControllerApi = oq.l.a(new er.a() { // from class: nq0.a
            @Override // er.a
            public final Object a() {
                return c.s(wVar);
            }
        });
        this.globalSearchControllerApi = oq.l.a(new er.a() { // from class: nq0.b
            @Override // er.a
            public final Object a() {
                return c.v(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kq0.d s(w wVar) {
        return (kq0.d) w.b(wVar, null, kq0.d.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kq0.d t() {
        return (kq0.d) this.environmentViolationImageSettingsControllerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kq0.e u() {
        return (kq0.e) this.globalSearchControllerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kq0.e v(w wVar) {
        return (kq0.e) w.b(wVar, null, kq0.e.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pq0.a
    public Object a(tq.e<? super dx.i<? extends dx.b, ApplicationFormServices>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f137696f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f137696f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objB = bVar.f137694d;
        Object objE = uq.b.e();
        int i16 = bVar.f137696f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C3397c c3397c = new C3397c(null);
            bVar.f137696f = 1;
            objB = g0Var.b(c3397c, bVar);
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
            return new dx.i.Right(lq0.a.i((ApplicationFormServicesDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pq0.a
    public Object b(tq.e<? super dx.i<? extends dx.b, BESearchConfig>> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f137706f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f137706f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objB = fVar.f137704d;
        Object objE = uq.b.e();
        int i16 = fVar.f137706f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            g gVar = new g(null);
            fVar.f137706f = 1;
            objB = g0Var.b(gVar, fVar);
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
            return new dx.i.Right(lq0.a.j((SearchConfigDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pq0.a
    public Object c(tq.e<? super dx.i<? extends dx.b, TrustedCertificates>> eVar) throws Throwable {
        l lVar;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i15 = lVar.f137721f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f137721f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        Object objB = lVar.f137719d;
        Object objE = uq.b.e();
        int i16 = lVar.f137721f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            m mVar = new m(null);
            lVar.f137721f = 1;
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
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(lq0.a.C((TrustedCertificatesDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pq0.a
    public Object d(tq.e<? super dx.i<? extends dx.b, SearchTags>> eVar) throws Throwable {
        j jVar;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f137716f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f137716f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object objB = jVar.f137714d;
        Object objE = uq.b.e();
        int i16 = jVar.f137716f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            k kVar = new k(null);
            jVar.f137716f = 1;
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
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(lq0.a.w((SearchTagsDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // pq0.a
    public Object e(tq.e<? super dx.i<? extends dx.b, AnonymousFeatureFlags>> eVar) {
        d00.a aVar = this.inMemoryCache;
        gu.b.Companion companion = gu.b.INSTANCE;
        return d00.a.p(aVar, 0, gu.b.A(gu.d.q(5, gu.e.MINUTES)), new a(null), eVar, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pq0.a
    public Object f(tq.e<? super dx.i<? extends dx.b, EnvironmentViolationImageSettings>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f137701f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f137701f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objB = dVar.f137699d;
        Object objE = uq.b.e();
        int i16 = dVar.f137701f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            e eVar2 = new e(null);
            dVar.f137701f = 1;
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
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(lq0.a.n((EnvironmentViolationImageSettingsDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pq0.a
    public Object g(tq.e<? super dx.i<? extends dx.b, MobileSettings>> eVar) throws Throwable {
        h hVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f137711f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f137711f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objB = hVar.f137709d;
        Object objE = uq.b.e();
        int i16 = hVar.f137711f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            i iVar = new i(null);
            hVar.f137711f = 1;
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
            return iVar2;
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(lq0.a.r((MobileSettingsDto) ((dx.i.Right) iVar2).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pq0.a
    public Object h(tq.e<? super dx.i<? extends dx.b, Announcements>> eVar) throws Throwable {
        n nVar;
        if (eVar instanceof n) {
            nVar = (n) eVar;
            int i15 = nVar.f137726f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                nVar.f137726f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                nVar = new n(eVar);
            }
        } else {
            nVar = new n(eVar);
        }
        Object objB = nVar.f137724d;
        Object objE = uq.b.e();
        int i16 = nVar.f137726f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            o oVar = new o(null);
            nVar.f137726f = 1;
            objB = g0Var.b(oVar, nVar);
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
            return new dx.i.Right(lq0.a.d((AnnouncementsDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}

package pl.gov.mc.fringers.mobywatel;

import android.content.Context;
import android.content.res.Configuration;
import ju.p0;
import oq.i0;
import p071kotlin.Metadata;
import pc4.h6;
import y00.m0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010U\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\b@\u0010R\"\u0004\bS\u0010TR\"\u0010\\\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bW\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010j\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010f\u001a\u0004\b^\u0010g\"\u0004\bh\u0010iR\"\u0010q\u001a\u00020k8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010w\u001a\u00020r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010s\u001a\u0004\b0\u0010t\"\u0004\bu\u0010vR\"\u0010~\u001a\u00020x8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b(\u0010{\"\u0004\b|\u0010}R'\u0010\u0084\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0087.¢\u0006\u0016\n\u0005\b\u0012\u0010\u0080\u0001\u001a\u0005\by\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R)\u0010\u008b\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\u001a\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u0092\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008d\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R)\u0010\u0099\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0005\bH\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R1\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010©\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b\u0094\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R)\u0010°\u0001\u001a\u00030ª\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0005\b \u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R)\u0010·\u0001\u001a\u00030±\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0006\b²\u0001\u0010³\u0001\u001a\u0005\b8\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010»\u0001\u001a\u00030¸\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001¨\u0006¼\u0001"}, d2 = {"Lpl/gov/mc/fringers/mobywatel/MObywatelApplication;", "Loz/g;", "Landroidx/work/a$c;", "<init>", "()V", "Landroid/content/Context;", "base", "Loq/i0;", "attachBaseContext", "(Landroid/content/Context;)V", "onCreate", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lk7/a;", "f", "Lk7/a;", "x", "()Lk7/a;", "setWorkerFactory", "(Lk7/a;)V", "workerFactory", "Lc54/b;", "g", "Lc54/b;", "y", "()Lc54/b;", "setFeatureEnabledUseCase", "(Lc54/b;)V", "isFeatureEnabledUseCase", "Lsw/f;", "h", "Lsw/f;", "v", "()Lsw/f;", "setStrictModeInitializer", "(Lsw/f;)V", "strictModeInitializer", "Ly00/f0;", "j", "Ly00/f0;", "t", "()Ly00/f0;", "setSecurityProviderEarlyInitializer", "(Ly00/f0;)V", "securityProviderEarlyInitializer", "Ly00/m0;", "k", "Ly00/m0;", "u", "()Ly00/m0;", "setSecurityProviderLateInitializer", "(Ly00/m0;)V", "securityProviderLateInitializer", "Lpx/b;", "l", "Lpx/b;", "getLocalLogger", "()Lpx/b;", "setLocalLogger", "(Lpx/b;)V", "localLogger", "Lpx/d;", "m", "Lpx/d;", "s", "()Lpx/d;", "setRemoteLogger", "(Lpx/d;)V", "remoteLogger", "Lmx/c;", "n", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "setLabelProvider", "(Lmx/c;)V", "labelProvider", "Lmz0/a;", "p", "Lmz0/a;", "()Lmz0/a;", "setGetChosenThemeUC", "(Lmz0/a;)V", "getChosenThemeUC", "Loi2/b;", "q", "Loi2/b;", "()Loi2/b;", "setLegacyJavaWrapper", "(Loi2/b;)V", "legacyJavaWrapper", "Lpl/gov/coi/common/network/r;", "r", "Lpl/gov/coi/common/network/r;", "getHttpClientConfig", "()Lpl/gov/coi/common/network/r;", "setHttpClientConfig", "(Lpl/gov/coi/common/network/r;)V", "httpClientConfig", "Liy/v;", "Liy/v;", "()Liy/v;", "setPkcs12Manager", "(Liy/v;)V", "pkcs12Manager", "Lgx/d;", "Lgx/d;", "o", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Liy/e;", "Liy/e;", "()Liy/e;", "setBytesManager", "(Liy/e;)V", "bytesManager", "Liy/c;", "w", "Liy/c;", "()Liy/c;", "setBytesConverter", "(Liy/c;)V", "bytesConverter", "Ld93/b;", "Ld93/b;", "()Ld93/b;", "setThreatDetectionManager", "(Ld93/b;)V", "threatDetectionManager", "Ly04/a;", "Ly04/a;", "i", "()Ly04/a;", "setBuildConfigRepository", "(Ly04/a;)V", "buildConfigRepository", "Ln90/a;", "z", "Ln90/a;", "()Ln90/a;", "setMJuniorAppActivatedUC", "(Ln90/a;)V", "isMJuniorAppActivatedUC", "Lyg0/b;", "A", "Lyg0/b;", "()Lyg0/b;", "setGetMJuniorThemeFlowUC", "(Lyg0/b;)V", "getMJuniorThemeFlowUC", "Ldx/j;", "Ldx/b;", "B", "Ldx/j;", "getExceptionParser", "()Ldx/j;", "setExceptionParser", "(Ldx/j;)V", "exceptionParser", "Lv64/o;", "C", "Lv64/o;", "()Lv64/o;", "setUserLoggedInUseCase", "(Lv64/o;)V", "isUserLoggedInUseCase", "Lyw/a;", ip.a.f96138c, "Lyw/a;", "()Lyw/a;", "setAccessibilityLabelResolver", "(Lyw/a;)V", "accessibilityLabelResolver", "Lv64/c;", "E", "Lv64/c;", "()Lv64/c;", "setCheckIsActivatedUseCase", "(Lv64/c;)V", "checkIsActivatedUseCase", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "workManagerConfiguration", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MObywatelApplication extends e implements androidx.work.a.c {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public yg0.b getMJuniorThemeFlowUC;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public dx.j<dx.b> exceptionParser;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public v64.o isUserLoggedInUseCase;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public yw.a accessibilityLabelResolver;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public v64.c checkIsActivatedUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public k7.a workerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public sw.f strictModeInitializer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public y00.f0 securityProviderEarlyInitializer;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public m0 securityProviderLateInitializer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public px.b localLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public px.d remoteLogger;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public mx.c labelProvider;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public mz0.a getChosenThemeUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public oi2.b legacyJavaWrapper;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public pl.gov.coi.common.network.r httpClientConfig;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public iy.v pkcs12Manager;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public iy.e bytesManager;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public iy.c bytesConverter;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public d93.b threatDetectionManager;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public y04.a buildConfigRepository;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public n90.a isMJuniorAppActivatedUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159296a;

        static {
            int[] iArr = new int[xg0.a.values().length];
            try {
                iArr[xg0.a.ENERGY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xg0.a.GEOMETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xg0.a.COSMOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f159296a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)I"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super Integer>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f159297e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f159299a;

            static {
                int[] iArr = new int[lz0.a.values().length];
                try {
                    iArr[lz0.a.SYSTEM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lz0.a.LIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lz0.a.DARK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f159299a = iArr;
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f159297e;
            int i16 = 1;
            if (i15 == 0) {
                oq.u.b(obj);
                mz0.a aVarM = MObywatelApplication.this.m();
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f159297e = 1;
                obj = aVarM.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            int i17 = a.f159299a[((lz0.a) obj).ordinal()];
            if (i17 == 1) {
                i16 = -1;
            } else if (i17 != 2) {
                if (i17 != 3) {
                    throw new oq.p();
                }
                i16 = 2;
            }
            return vq.b.e(i16);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Integer> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return MObywatelApplication.this.new b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context g(Context context) {
        return context;
    }

    public final v64.o A() {
        v64.o oVar = this.isUserLoggedInUseCase;
        if (oVar != null) {
            return oVar;
        }
        return null;
    }

    @Override // androidx.work.a.c
    public androidx.work.a a() {
        return new androidx.work.a.C0293a().w(x()).v(3).a();
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        final Context contextC = lh2.a.f118282a.c(base);
        super.attachBaseContext(contextC);
        h6.f154667a.y(new er.a() { // from class: pl.gov.mc.fringers.mobywatel.m
            @Override // er.a
            public final Object a() {
                return MObywatelApplication.g(contextC);
            }
        });
    }

    public final yw.a h() {
        yw.a aVar = this.accessibilityLabelResolver;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final y04.a i() {
        y04.a aVar = this.buildConfigRepository;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final iy.c j() {
        iy.c cVar = this.bytesConverter;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final iy.e k() {
        iy.e eVar = this.bytesManager;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    public final v64.c l() {
        v64.c cVar = this.checkIsActivatedUseCase;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final mz0.a m() {
        mz0.a aVar = this.getChosenThemeUC;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final yg0.b n() {
        yg0.b bVar = this.getMJuniorThemeFlowUC;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final gx.d o() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        c70.a.f23835a.b(i().getIsAutomaticTest(), h());
        super.onConfigurationChanged(newConfig);
    }

    @Override // pl.gov.mc.fringers.mobywatel.e, android.app.Application
    public void onCreate() {
        io.sentry.android.core.performance.h.s(this);
        super.onCreate();
        c70.a.f23835a.b(i().getIsAutomaticTest(), h());
        int i15 = 2;
        px.d.i2(s(), getString(f0.E0), null, 2, null);
        if (y().a(b54.c.STRICT_MODE).booleanValue()) {
            v().a();
        }
        if (!t().getInitialized()) {
            px.b.y5(s(), "Early SecurityProvider NOT initialized.", null, px.c.a(this), 2, null);
        }
        u().a();
        gi.a.a(this, getString(f0.Y));
        n90.a aVarZ = z();
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        if (aVarZ.b(c1792a).booleanValue()) {
            int i16 = a.f159296a[n().a(c1792a).getValue().ordinal()];
            if (i16 == 1 || i16 == 2) {
                i15 = 1;
            } else if (i16 != 3) {
                oq.p pVar = new oq.p();
                io.sentry.android.core.performance.h.t(this);
                throw pVar;
            }
            androidx.appcompat.app.f.L(i15);
        } else {
            androidx.appcompat.app.f.L(((Number) ju.j.b(null, new b(null), 1, null)).intValue());
        }
        sh2.a.k(o(), y(), q(), r(), k(), j(), s(), i(), A(), l());
        if (y().a(b54.c.THREAT_DETECTION).booleanValue()) {
            w().b();
        }
        s().F8("Application created", px.d.a.NAVIGATION);
        io.sentry.android.core.performance.h.t(this);
    }

    public final oi2.b q() {
        oi2.b bVar = this.legacyJavaWrapper;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final iy.v r() {
        iy.v vVar = this.pkcs12Manager;
        if (vVar != null) {
            return vVar;
        }
        return null;
    }

    public final px.d s() {
        px.d dVar = this.remoteLogger;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    public final y00.f0 t() {
        y00.f0 f0Var = this.securityProviderEarlyInitializer;
        if (f0Var != null) {
            return f0Var;
        }
        return null;
    }

    public final m0 u() {
        m0 m0Var = this.securityProviderLateInitializer;
        if (m0Var != null) {
            return m0Var;
        }
        return null;
    }

    public final sw.f v() {
        sw.f fVar = this.strictModeInitializer;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }

    public final d93.b w() {
        d93.b bVar = this.threatDetectionManager;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final k7.a x() {
        k7.a aVar = this.workerFactory;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final c54.b y() {
        c54.b bVar = this.isFeatureEnabledUseCase;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final n90.a z() {
        n90.a aVar = this.isMJuniorAppActivatedUC;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }
}

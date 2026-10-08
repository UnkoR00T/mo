package yj2;

import a14.t;
import er.q;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v64.k;
import v64.o;
import vq.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lyj2/h;", "Luj2/c;", "La14/t;", "monitorActivityVisibilityUseCase", "Lnx/b;", "loginViewLifecycleManager", "Lxj2/a;", "inactivityLogoutManager", "Lv64/o;", "isUserLoggedInUseCase", "Lv64/c;", "checkIsActivatedUseCase", "Lv64/k;", "consumeLoggedOutUseCase", "Lgx/d;", "globalEventManager", "<init>", "(La14/t;Lnx/b;Lxj2/a;Lv64/o;Lv64/c;Lv64/k;Lgx/d;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "La14/t;", "b", "Lnx/b;", "c", "Lxj2/a;", "d", "Lv64/o;", "e", "Lv64/c;", "f", "Lv64/k;", "g", "Lgx/d;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements uj2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t monitorActivityVisibilityUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nx.b loginViewLifecycleManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xj2.a inactivityLogoutManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o isUserLoggedInUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v64.c checkIsActivatedUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k consumeLoggedOutUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f227408a;

        static {
            int[] iArr = new int[nx.c.values().length];
            try {
                iArr[nx.c.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nx.c.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f227408a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f227409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f227410b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f227411a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f227412b;

            /* JADX INFO: renamed from: yj2.h$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6096a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f227413d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f227414e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f227415f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f227417h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f227418j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f227419k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                Object f227420l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                Object f227421m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f227422n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                int f227423p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f227424q;

                public C6096a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f227413d = obj;
                    this.f227414e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, h hVar2) {
                this.f227411a = hVar;
                this.f227412b = hVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x015e, code lost:
            
                if (r2.F(r4, r0) == r1) goto L37;
             */
            @Override // mu.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(java.lang.Object r13, tq.e r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 356
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yj2.h.b.a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public b(mu.g gVar, h hVar) {
            this.f227409a = gVar;
            this.f227410b = hVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i0> hVar, tq.e eVar) {
            Object objA = this.f227409a.a(new a(hVar, this.f227410b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f227425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f227426b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f227427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f227428b;

            /* JADX INFO: renamed from: yj2.h$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6097a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f227429d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f227430e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f227431f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f227433h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f227434j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f227435k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                Object f227436l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                Object f227437m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f227438n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                int f227439p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f227440q;

                public C6097a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f227429d = obj;
                    this.f227430e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, h hVar2) {
                this.f227427a = hVar;
                this.f227428b = hVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00f4, code lost:
            
                if (r2.F(r7, r0) == r1) goto L26;
             */
            @Override // mu.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(java.lang.Object r10, tq.e r11) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 250
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yj2.h.c.a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public c(mu.g gVar, h hVar) {
            this.f227425a = gVar;
            this.f227426b = hVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i0> hVar, tq.e eVar) {
            Object objA = this.f227425a.a(new a(hVar, this.f227426b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f227441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f227442e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f227444g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f227442e = obj;
            this.f227444g |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loq/i0;", "<unused var>", "<anonymous>", "(VV)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<i0, i0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227445e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f227445e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i0 i0Var, i0 i0Var2, tq.e<? super i0> eVar) {
            return new e(eVar).J(i0.f148189a);
        }
    }

    public h(t tVar, nx.b bVar, xj2.a aVar, o oVar, v64.c cVar, k kVar, gx.d dVar) {
        this.monitorActivityVisibilityUseCase = tVar;
        this.loginViewLifecycleManager = bVar;
        this.inactivityLogoutManager = aVar;
        this.isUserLoggedInUseCase = oVar;
        this.checkIsActivatedUseCase = cVar;
        this.consumeLoggedOutUseCase = kVar;
        this.globalEventManager = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super i0> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f227444g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f227444g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f227442e;
        Object objE = uq.b.e();
        int i16 = dVar.f227444g;
        if (i16 == 0) {
            u.b(obj);
            mu.g gVarJ = mu.i.J(new b((mu.g) this.monitorActivityVisibilityUseCase.a(gz.b.a.C1792a.f78542a), this), new c(this.loginViewLifecycleManager.G2(), this), new e(null));
            dVar.f227441d = j.a(c1792a);
            dVar.f227444g = 1;
            if (mu.i.i(gVarJ, dVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return i0.f148189a;
    }
}

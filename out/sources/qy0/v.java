package qy0;

import androidx.p016lifecycle.u0;
import ez0.PointDetailsEntryPointData;
import fr.q0;
import k10.c0;
import k10.z;
import kh0.BEDashboardFavoritePoints;
import kh0.BEFavoriteMeasurementPoint;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007Bk\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J*\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010&\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b(\u0010)J6\u00100\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0082@¢\u0006\u0004\b0\u00101J\u0018\u00104\u001a\u00020-2\u0006\u00103\u001a\u000202H\u0082@¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020-H\u0082@¢\u0006\u0004\b6\u00107J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020908H\u0096\u0001¢\u0006\u0004\b:\u0010;J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020<08H\u0096\u0001¢\u0006\u0004\b=\u0010;J\u0018\u0010@\u001a\u00020-2\u0006\u0010?\u001a\u00020>H\u0096\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020-H\u0096\u0001¢\u0006\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010_\u001a\u00020Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR,\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030d8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\be\u0010f\u0012\u0004\bi\u0010C\u001a\u0004\bg\u0010hR&\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0k8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bl\u0010m\u0012\u0004\bp\u0010C\u001a\u0004\bn\u0010oR \u0010w\u001a\b\u0012\u0004\u0012\u00020r0q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lqy0/v;", "Ll00/g;", "Lqy0/b;", "Lqy0/a;", "Lqy0/c;", "", "Lnx/b;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lry0/c;", "dashboardDialogMapper", "Lly0/h;", "loadDashboardContainerUC", "Lry0/e;", "dashboardScreenMapper", "Lib4/c;", "genericDomainErrorMapper", "Lly0/d;", "deleteFromFavouriteUC", "Lmx/c;", "labelProvider", "globalSnackBarManager", "Lly0/i;", "migrateFavoritePointUC", "Lac4/a;", "callActionWithLoaderUseCase", "Loz/q;", "ownerViewLifecycleManager", "Lpy0/b;", "setupData", "<init>", "(Lyy/a;Lry0/c;Lly0/h;Lry0/e;Lib4/c;Lly0/d;Lmx/c;Li70/e;Lly0/i;Lac4/a;Loz/q;Lpy0/b;)V", "state", "Lqy0/c$a;", "G9", "(Lqy0/b;)Lqy0/c$a;", "Lk10/c0;", "dashboardSetupData", "Lk10/l;", "D9", "(Lk10/c0;Lpy0/b;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onCloseClick", "B9", "(Ldx/b;Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "", "pointId", "A9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "I9", "(Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lry0/c;", "c", "Lly0/h;", "d", "Lry0/e;", "e", "Lib4/c;", "f", "Lly0/d;", "g", "Lmx/c;", "h", "Li70/e;", "j", "Lly0/i;", "k", "Lac4/a;", "l", "Loz/q;", "m", "Lpy0/b;", "Loz/j;", "n", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lqy0/b$b;", "p", "Lqy0/b$b;", "initialState", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "Lxw/b;", "Lqy0/a$g;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<qy0.b, qy0.a> implements qy0.c, zx.d, nx.b, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ry0.c dashboardDialogMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ly0.h loadDashboardContainerUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ry0.e dashboardScreenMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ly0.d deleteFromFavouriteUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ly0.i migrateFavoritePointUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final py0.b setupData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final qy0.b.Initial initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<qy0.b, qy0.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<qy0.c.a> state;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qy0.a.g> navAction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169413e;

        /* JADX INFO: renamed from: qy0.v$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnx/a;", "viewLifecycle", "Loq/i0;", "<anonymous>", "(Lnx/a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C4286a extends vq.k implements er.p<nx.a, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f169415e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f169416f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ v f169417g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4286a(v vVar, tq.e<? super C4286a> eVar) {
                super(2, eVar);
                this.f169417g = vVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                nx.a aVar = (nx.a) this.f169416f;
                uq.b.e();
                if (this.f169415e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                if (aVar == nx.a.RESUMED) {
                    qy0.c.a value = this.f169417g.getState().getValue();
                    if (!(value instanceof qy0.c.a.Empty) && !(value instanceof qy0.c.a.Initialized)) {
                        if (!fr.t.c(value, qy0.c.a.b.f169368a)) {
                            throw new oq.p();
                        }
                        this.f169417g.d9(qy0.a.f.f169346a);
                    }
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(nx.a aVar, tq.e<? super i0> eVar) {
                return ((C4286a) v(aVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C4286a c4286a = new C4286a(this.f169417g, eVar);
                c4286a.f169416f = obj;
                return c4286a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f169413e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarS = mu.i.S(v.this.x8(), new C4286a(v.this, null));
                this.f169413e = 1;
                if (mu.i.i(gVarS, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return v.this.new a(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f169418a;

        static {
            int[] iArr = new int[py0.b.values().length];
            try {
                iArr[py0.b.POINT_DELETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[py0.b.POINT_ADDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[py0.b.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f169418a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f169419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f169420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f169421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f169422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f169423h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f169424j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f169425k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f169427m;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f169425k = obj;
            this.f169427m |= PKIFailureInfo.systemUnavail;
            return v.this.A9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f169428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f169429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f169430f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f169431g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f169432h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f169433j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f169434k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f169436m;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f169434k = obj;
            this.f169436m |= PKIFailureInfo.systemUnavail;
            return v.this.D9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f169437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f169438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f169439g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f169440h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f169441j;

        e(tq.e<? super e> eVar) {
            super(1, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
        
            if (r1.B9(r3, r4, r5, r6) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f169441j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r6.f169438f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r6.f169437e
                dx.i r0 = (dx.i) r0
                oq.u.b(r7)
                goto L82
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                oq.u.b(r7)
                goto L3a
            L26:
                oq.u.b(r7)
                qy0.v r7 = qy0.v.this
                ly0.i r7 = qy0.v.u9(r7)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r6.f169441j = r3
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L3a
                goto L70
            L3a:
                dx.i r7 = (dx.i) r7
                qy0.v r1 = qy0.v.this
                boolean r3 = r7 instanceof dx.i.Left
                if (r3 == 0) goto L71
                r3 = r7
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                dx.b r3 = (dx.b) r3
                qy0.a$f r4 = qy0.a.f.f169346a
                er.a r4 = qy0.v.p9(r1, r4)
                qy0.a$b r5 = qy0.a.b.f169341a
                er.a r5 = qy0.v.p9(r1, r5)
                java.lang.Object r7 = vq.j.a(r7)
                r6.f169437e = r7
                java.lang.Object r7 = vq.j.a(r3)
                r6.f169438f = r7
                r7 = 0
                r6.f169439g = r7
                r6.f169440h = r7
                r6.f169441j = r2
                java.lang.Object r7 = qy0.v.w9(r1, r3, r4, r5, r6)
                if (r7 != r0) goto L82
            L70:
                return r0
            L71:
                boolean r0 = r7 instanceof dx.i.Right
                if (r0 == 0) goto L85
                dx.i$c r7 = (dx.i.Right) r7
                java.lang.Object r7 = r7.b()
                oq.i0 r7 = (oq.i0) r7
                qy0.a$e r7 = qy0.a.e.f169345a
                qy0.v.r9(r1, r7)
            L82:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L85:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qy0.v.e.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new e(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<qy0.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f169443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f169444b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f169445a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f169446b;

            /* JADX INFO: renamed from: qy0.v$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4287a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f169447d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f169448e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f169449f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f169451h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f169452j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f169453k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f169454l;

                public C4287a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f169447d = obj;
                    this.f169448e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f169445a = hVar;
                this.f169446b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4287a c4287a;
                if (eVar instanceof C4287a) {
                    c4287a = (C4287a) eVar;
                    int i15 = c4287a.f169448e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4287a.f169448e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4287a = new C4287a(eVar);
                    }
                } else {
                    c4287a = new C4287a(eVar);
                }
                Object obj2 = c4287a.f169447d;
                Object objE = uq.b.e();
                int i16 = c4287a.f169448e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f169445a;
                    qy0.c.a aVarG9 = this.f169446b.G9((qy0.b) obj);
                    c4287a.f169449f = vq.j.a(obj);
                    c4287a.f169451h = vq.j.a(c4287a);
                    c4287a.f169452j = vq.j.a(obj);
                    c4287a.f169453k = vq.j.a(hVar);
                    c4287a.f169454l = 0;
                    c4287a.f169448e = 1;
                    if (hVar.F(aVarG9, c4287a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public f(mu.g gVar, v vVar) {
            this.f169443a = gVar;
            this.f169444b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qy0.c.a> hVar, tq.e eVar) {
            Object objA = this.f169443a.a(new a(hVar, this.f169444b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqy0/a$b;", "<unused var>", "Lqy0/b;", "Loq/i0;", "<anonymous>", "(Lqy0/a$b;Lqy0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<qy0.a.b, qy0.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169455e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f169455e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qy0.a.g> bVarY1 = v.this.Y1();
                qy0.a.g.C4282a c4282a = qy0.a.g.C4282a.f169347a;
                this.f169455e = 1;
                if (bVarY1.F(c4282a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.b bVar, qy0.b bVar2, tq.e<? super i0> eVar) {
            return v.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqy0/a$a;", "<unused var>", "Lqy0/b;", "Loq/i0;", "<anonymous>", "(Lqy0/a$a;Lqy0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<qy0.a.C4281a, qy0.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169457e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f169457e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qy0.a.g> bVarY1 = v.this.Y1();
                qy0.a.g.d dVar = qy0.a.g.d.f169350a;
                this.f169457e = 1;
                if (bVarY1.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.C4281a c4281a, qy0.b bVar, tq.e<? super i0> eVar) {
            return v.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqy0/a$k;", "<unused var>", "Lqy0/b;", "Loq/i0;", "<anonymous>", "(Lqy0/a$k;Lqy0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<qy0.a.k, qy0.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169459e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f169459e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.y(new p50.a.DefaultWithIcon(v.this.labelProvider.c(zx0.b.f238246d), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.k kVar, qy0.b bVar, tq.e<? super i0> eVar) {
            return v.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqy0/a$l;", "action", "Lqy0/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqy0/a$l;Lqy0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<qy0.a.ToPoint, qy0.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169462f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qy0.a.ToPoint toPoint = (qy0.a.ToPoint) this.f169462f;
            Object objE = uq.b.e();
            int i15 = this.f169461e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qy0.a.g> bVarY1 = v.this.Y1();
                qy0.a.g.ToPoint toPoint2 = new qy0.a.g.ToPoint(new PointDetailsEntryPointData(toPoint.getPointId(), ez0.a.DASHBOARD));
                this.f169462f = vq.j.a(toPoint);
                this.f169461e = 1;
                if (bVarY1.F(toPoint2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.ToPoint toPoint, qy0.b bVar, tq.e<? super i0> eVar) {
            j jVar = v.this.new j(eVar);
            jVar.f169462f = toPoint;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqy0/a$d;", "action", "Lqy0/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqy0/a$d;Lqy0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<qy0.a.GoToEditWidget, qy0.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169465f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qy0.a.GoToEditWidget goToEditWidget = (qy0.a.GoToEditWidget) this.f169465f;
            Object objE = uq.b.e();
            int i15 = this.f169464e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qy0.a.g> bVarY1 = v.this.Y1();
                qy0.a.g.GoToEditWidget goToEditWidget2 = new qy0.a.g.GoToEditWidget(new BEDashboardFavoritePoints(goToEditWidget.a(), goToEditWidget.getWidgetPointId()));
                this.f169465f = vq.j.a(goToEditWidget);
                this.f169464e = 1;
                if (bVarY1.F(goToEditWidget2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.GoToEditWidget goToEditWidget, qy0.b bVar, tq.e<? super i0> eVar) {
            k kVar = v.this.new k(eVar);
            kVar.f169465f = goToEditWidget;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqy0/b$b;", "it", "Loq/i0;", "<anonymous>", "(Lqy0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<qy0.b.Initial, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169467e;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f169467e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (v.this.setupData == py0.b.POINT_DELETED) {
                v.this.d9(qy0.a.k.f169356a);
            }
            v vVar = v.this;
            vVar.P5(vVar.setupData);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(qy0.b.Initial initial, tq.e<? super i0> eVar) {
            return ((l) v(initial, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return v.this.new l(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqy0/a$e;", "<unused var>", "Lk10/c0;", "Lqy0/b$b;", "state", "Lk10/l;", "Lqy0/b;", "<anonymous>", "(Lqy0/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<qy0.a.e, c0<qy0.b.Initial>, tq.e<? super k10.l<? extends qy0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169470f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f169470f;
            Object objE = uq.b.e();
            int i15 = this.f169469e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            py0.b setupData = ((qy0.b.Initial) c0Var.a()).getSetupData();
            v vVar = v.this;
            this.f169470f = vq.j.a(c0Var);
            this.f169469e = 1;
            Object objD9 = vVar.D9(c0Var, setupData, this);
            return objD9 == objE ? objE : objD9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.e eVar, c0<qy0.b.Initial> c0Var, tq.e<? super k10.l<? extends qy0.b>> eVar2) {
            m mVar = v.this.new m(eVar2);
            mVar.f169470f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqy0/a$f;", "<unused var>", "Lqy0/b$b;", "Loq/i0;", "<anonymous>", "(Lqy0/a$f;Lqy0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<qy0.a.f, qy0.b.Initial, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169472e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f169472e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                this.f169472e = 1;
                if (vVar.I9(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.f fVar, qy0.b.Initial initial, tq.e<? super i0> eVar) {
            return v.this.new n(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqy0/a$e;", "<unused var>", "Lk10/c0;", "Lqy0/b$a;", "state", "Lk10/l;", "Lqy0/b;", "<anonymous>", "(Lqy0/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<qy0.a.e, c0<qy0.b.Empty>, tq.e<? super k10.l<? extends qy0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169475f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f169475f;
            Object objE = uq.b.e();
            int i15 = this.f169474e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            py0.b setupData = ((qy0.b.Empty) c0Var.a()).getSetupData();
            v vVar = v.this;
            this.f169475f = vq.j.a(c0Var);
            this.f169474e = 1;
            Object objD9 = vVar.D9(c0Var, setupData, this);
            return objD9 == objE ? objE : objD9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.e eVar, c0<qy0.b.Empty> c0Var, tq.e<? super k10.l<? extends qy0.b>> eVar2) {
            o oVar = v.this.new o(eVar2);
            oVar.f169475f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqy0/a$e;", "<unused var>", "Lk10/c0;", "Lqy0/b$c;", "state", "Lk10/l;", "Lqy0/b;", "<anonymous>", "(Lqy0/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<qy0.a.e, c0<qy0.b.Initialized>, tq.e<? super k10.l<? extends qy0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169478f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f169478f;
            Object objE = uq.b.e();
            int i15 = this.f169477e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            py0.b setupData = ((qy0.b.Initialized) c0Var.a()).getSetupData();
            v vVar = v.this;
            this.f169478f = vq.j.a(c0Var);
            this.f169477e = 1;
            Object objD9 = vVar.D9(c0Var, setupData, this);
            return objD9 == objE ? objE : objD9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.e eVar, c0<qy0.b.Initialized> c0Var, tq.e<? super k10.l<? extends qy0.b>> eVar2) {
            p pVar = v.this.new p(eVar2);
            pVar.f169478f = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqy0/a$h;", "<unused var>", "Lqy0/b$c;", "state", "Loq/i0;", "<anonymous>", "(Lqy0/a$h;Lqy0/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<qy0.a.h, qy0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169481f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qy0.b.Initialized initialized = (qy0.b.Initialized) this.f169481f;
            Object objE = uq.b.e();
            int i15 = this.f169480e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qy0.a.g> bVarY1 = v.this.Y1();
                qy0.a.g.GoToEditWidget goToEditWidget = new qy0.a.g.GoToEditWidget(new BEDashboardFavoritePoints(initialized.a(), initialized.getWidgetPointId()));
                this.f169481f = vq.j.a(initialized);
                this.f169480e = 1;
                if (bVarY1.F(goToEditWidget, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.h hVar, qy0.b.Initialized initialized, tq.e<? super i0> eVar) {
            q qVar = v.this.new q(eVar);
            qVar.f169481f = initialized;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqy0/a$j;", "action", "Lqy0/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqy0/a$j;Lqy0/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<qy0.a.ShowDialog, qy0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169484f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qy0.a.ShowDialog showDialog = (qy0.a.ShowDialog) this.f169484f;
            Object objE = uq.b.e();
            int i15 = this.f169483e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qy0.a.g> bVarY1 = v.this.Y1();
                qy0.a.g.ShowNavigationDialog showNavigationDialog = new qy0.a.g.ShowNavigationDialog(v.this.dashboardDialogMapper.b(new ry0.c.Params(v.this.b9(new qy0.a.DeletePointFromFavorites(showDialog.getPointId())))));
                this.f169484f = vq.j.a(showDialog);
                this.f169483e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.ShowDialog showDialog, qy0.b.Initialized initialized, tq.e<? super i0> eVar) {
            r rVar = v.this.new r(eVar);
            rVar.f169484f = showDialog;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqy0/a$c;", "action", "Lqy0/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqy0/a$c;Lqy0/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<qy0.a.DeletePointFromFavorites, qy0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169487f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qy0.a.DeletePointFromFavorites deletePointFromFavorites = (qy0.a.DeletePointFromFavorites) this.f169487f;
            Object objE = uq.b.e();
            int i15 = this.f169486e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                String pointId = deletePointFromFavorites.getPointId();
                this.f169487f = vq.j.a(deletePointFromFavorites);
                this.f169486e = 1;
                if (vVar.A9(pointId, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.DeletePointFromFavorites deletePointFromFavorites, qy0.b.Initialized initialized, tq.e<? super i0> eVar) {
            s sVar = v.this.new s(eVar);
            sVar.f169487f = deletePointFromFavorites;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqy0/a$i;", "action", "Lqy0/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqy0/a$i;Lqy0/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<qy0.a.OnPointClick, qy0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169490f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qy0.a.OnPointClick onPointClick = (qy0.a.OnPointClick) this.f169490f;
            uq.b.e();
            if (this.f169489e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (onPointClick.getPoint().getQuality() != kh0.l.UNKNOWN) {
                v.this.d9(new qy0.a.ToPoint(onPointClick.getPoint().getId()));
            } else {
                v.this.d9(new qy0.a.ShowDialog(onPointClick.getPoint().getId()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qy0.a.OnPointClick onPointClick, qy0.b.Initialized initialized, tq.e<? super i0> eVar) {
            t tVar = v.this.new t(eVar);
            tVar.f169490f = onPointClick;
            return tVar.J(i0.f148189a);
        }
    }

    public v(yy.a aVar, ry0.c cVar, ly0.h hVar, ry0.e eVar, ib4.c cVar2, ly0.d dVar, mx.c cVar3, i70.e eVar2, ly0.i iVar, ac4.a aVar2, oz.q qVar, py0.b bVar) {
        this.dashboardDialogMapper = cVar;
        this.loadDashboardContainerUC = hVar;
        this.dashboardScreenMapper = eVar;
        this.genericDomainErrorMapper = cVar2;
        this.deleteFromFavouriteUC = dVar;
        this.labelProvider = cVar3;
        this.globalSnackBarManager = eVar2;
        this.migrateFavoritePointUC = iVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.ownerViewLifecycleManager = qVar;
        this.setupData = bVar;
        this.lifecycleConnector = qVar;
        ju.k.d(u0.a(this), null, null, new a(null), 3, null);
        qy0.b.Initial initial = new qy0.b.Initial(null, 1, null);
        this.initialState = initial;
        this.stateMachine = aVar.a(initial, new er.l() { // from class: qy0.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.K9(this.f169396a, (k10.v) obj);
            }
        });
        this.state = a9(new f(e9().getState(), this), G9(initial));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        if (B9(r2, r5, r4, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A9(java.lang.String r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qy0.v.A9(java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B9(dx.b bVar, final er.a<i0> aVar, final er.a<i0> aVar2, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new qy0.a.g.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: qy0.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.C9(aVar, aVar2, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            aVar.a();
        } else if (aVar2 != null) {
            aVar2.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (B9(r2, r4, r5, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D9(k10.c0<?> r7, final py0.b r8, tq.e<? super k10.l<? extends qy0.b>> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qy0.v.D9(k10.c0, py0.b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qy0.b.Empty E9(py0.b bVar, Object obj) {
        return new qy0.b.Empty(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qy0.b.Initialized F9(BEDashboardFavoritePoints bEDashboardFavoritePoints, py0.b bVar, Object obj) {
        return new qy0.b.Initialized(bVar, bEDashboardFavoritePoints.a(), bEDashboardFavoritePoints.getWidgetPointId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qy0.c.a G9(qy0.b state) {
        return this.dashboardScreenMapper.b(new ry0.e.Params(state, b9(qy0.a.b.f169341a), b9(qy0.a.C4281a.f169340a), new er.l() { // from class: qy0.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.H9(this.f169390a, (BEFavoriteMeasurementPoint) obj);
            }
        }, b9(qy0.a.h.f169353a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(v vVar, BEFavoriteMeasurementPoint bEFavoriteMeasurementPoint) {
        vVar.d9(new qy0.a.OnPointClick(bEFavoriteMeasurementPoint));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I9(tq.e<? super i0> eVar) {
        Object objA = ac4.a.a(this.callActionWithLoaderUseCase, null, new e(null), eVar, 1, null);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(qy0.b.class), new er.l() { // from class: qy0.m
            @Override // er.l
            public final Object b(Object obj) {
                return v.L9(this.f169386a, (z) obj);
            }
        });
        vVar2.c(q0.c(qy0.b.Initial.class), new er.l() { // from class: qy0.n
            @Override // er.l
            public final Object b(Object obj) {
                return v.M9(this.f169387a, (z) obj);
            }
        });
        vVar2.c(q0.c(qy0.b.Empty.class), new er.l() { // from class: qy0.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.N9(this.f169388a, (z) obj);
            }
        });
        vVar2.c(q0.c(qy0.b.Initialized.class), new er.l() { // from class: qy0.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.O9(this.f169389a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(v vVar, z zVar) {
        g gVar = vVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(qy0.a.b.class), oVar, gVar);
        zVar.x(q0.c(qy0.a.C4281a.class), oVar, vVar.new h(null));
        zVar.x(q0.c(qy0.a.k.class), oVar, vVar.new i(null));
        zVar.x(q0.c(qy0.a.ToPoint.class), oVar, vVar.new j(null));
        zVar.x(q0.c(qy0.a.GoToEditWidget.class), oVar, vVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(v vVar, z zVar) {
        zVar.C(vVar.new l(null));
        m mVar = vVar.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(qy0.a.e.class), oVar, mVar);
        zVar.x(q0.c(qy0.a.f.class), oVar, vVar.new n(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(v vVar, z zVar) {
        o oVar = vVar.new o(null);
        zVar.v(q0.c(qy0.a.e.class), k10.o.CANCEL_PREVIOUS, oVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(v vVar, z zVar) {
        p pVar = vVar.new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(qy0.a.e.class), oVar, pVar);
        zVar.x(q0.c(qy0.a.h.class), oVar, vVar.new q(null));
        zVar.x(q0.c(qy0.a.ShowDialog.class), oVar, vVar.new r(null));
        zVar.x(q0.c(qy0.a.DeletePointFromFavorites.class), oVar, vVar.new s(null));
        zVar.x(q0.c(qy0.a.OnPointClick.class), oVar, vVar.new t(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(py0.b bVar) {
        super.P5(bVar);
    }

    @Override // zx.b
    public xw.b<qy0.a.g> Y1() {
        return this.navAction;
    }

    @Override // qy0.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<qy0.b, qy0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<qy0.c.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}

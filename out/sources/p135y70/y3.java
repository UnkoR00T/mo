package p135y70;

import androidx.p016lifecycle.u0;
import er.l;
import er.p;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import oz.q;
import p071kotlin.Metadata;
import r74.DefaultNotificationDetailsData;
import vq.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0003Bq\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J(\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0082@¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020%2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u00101\u001a\u00020%2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020%H\u0014¢\u0006\u0004\b3\u0010-J\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b7\u00108J\u0018\u0010;\u001a\u00020%2\u0006\u0010:\u001a\u000209H\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b=\u0010-J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0096\u0001¢\u0006\u0004\b@\u0010AJ\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020B0>H\u0096\u0001¢\u0006\u0004\bC\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010_\u001a\u00020Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030`8\u0014X\u0094\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR \u0010l\u001a\b\u0012\u0004\u0012\u00020g0f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR \u0010s\u001a\b\u0012\u0004\u0012\u00020n0m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR \u0010w\u001a\b\u0012\u0004\u0012\u00020t0m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010p\u001a\u0004\bv\u0010r¨\u0006x"}, d2 = {"Ly70/y3;", "Ll00/g;", "Ly70/c;", "", "Lnx/b;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lyg0/b;", "getAppThemeFlowUC", "Lqg0/i;", "setupLaunchStateUC", "Lsc0/b;", "isLoginLockedUC", "Loz/q;", "ownerViewLifecycleManager", "Lec0/a;", "cancelScheduledInactivityLogoutUC", "Lec0/d;", "scheduleInactivityLogoutUC", "Lgx/d;", "globalEventManager", "Lqg0/h;", "logoutFromAppUC", "La14/q;", "goToStoreIntentUseCase", "globalSnackBarManager", "Ly70/c4;", "consumePendingNavigationUC", "Lj90/d;", "beMarkNotificationAsDisplayedUC", "<init>", "(Lyy/a;Lyg0/b;Lqg0/i;Lsc0/b;Loz/q;Lec0/a;Lec0/d;Lgx/d;Lqg0/h;La14/q;Li70/e;Ly70/c4;Lj90/d;)V", "", "packageName", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "s9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ly70/f4;", "pending", "x9", "(Ly70/f4;Ltq/e;)Ljava/lang/Object;", "u9", "()V", "v9", "Lr74/a;", "data", "w9", "(Lr74/a;)V", "Y8", "Lgx/b;", "event", "", "j5", "(Lgx/b;)Z", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lqg0/i;", "c", "Lsc0/b;", "d", "Loz/q;", "e", "Lec0/a;", "f", "Lec0/d;", "g", "Lgx/d;", "h", "Lqg0/h;", "j", "La14/q;", "k", "Li70/e;", "l", "Ly70/c4;", "m", "Lj90/d;", "Loz/j;", "n", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ly70/b;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lxg0/a;", "r", "Lmu/p0;", "r9", "()Lmu/p0;", "juniorTheme", "Ly70/d;", "s", "getState", "state", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y3 extends l00.g<p135y70.c, Object> implements l00.e, gx.c, i70.e, nx.b, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qg0.i setupLaunchStateUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sc0.b isLoginLockedUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ec0.a cancelScheduledInactivityLogoutUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ec0.d scheduleInactivityLogoutUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final qg0.h logoutFromAppUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.q goToStoreIntentUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final c4 consumePendingNavigationUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final j90.d beMarkNotificationAsDisplayedUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final t<p135y70.c, Object> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<xg0.a> juniorTheme;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p135y70.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p0<p135y70.d> state = a9(new h(e9().getState()), p135y70.d.f224987a);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f225163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f225164e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f225166g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f225164e = obj;
            this.f225166g |= PKIFailureInfo.systemUnavail;
            return y3.this.s9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225167e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
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
                int r1 = r4.f225167e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                y70.y3 r5 = p135y70.y3.this
                qg0.h r5 = p135y70.y3.l9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f225167e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                y70.y3 r5 = p135y70.y3.this
                xw.b r5 = r5.Y1()
                y70.b$f r1 = y70.b.f.f224972a
                r4.f225167e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y70.y3.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return y3.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225169e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            if (p135y70.y3.t9(r6, null, r5, 1, null) == r0) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f225169e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                oq.u.b(r6)
                goto L56
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                oq.u.b(r6)
                goto L4a
            L21:
                oq.u.b(r6)
                goto L39
            L25:
                oq.u.b(r6)
                y70.y3 r6 = p135y70.y3.this
                qg0.h r6 = p135y70.y3.l9(r6)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r5.f225169e = r4
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L39
                goto L55
            L39:
                y70.y3 r6 = p135y70.y3.this
                xw.b r6 = r6.Y1()
                y70.b$f r1 = y70.b.f.f224972a
                r5.f225169e = r3
                java.lang.Object r6 = r6.F(r1, r5)
                if (r6 != r0) goto L4a
                goto L55
            L4a:
                y70.y3 r6 = p135y70.y3.this
                r5.f225169e = r2
                r1 = 0
                java.lang.Object r6 = p135y70.y3.t9(r6, r1, r5, r4, r1)
                if (r6 != r0) goto L56
            L55:
                return r0
            L56:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: y70.y3.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return y3.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225171e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f225171e;
            if (i15 == 0) {
                u.b(obj);
                y3 y3Var = y3.this;
                this.f225171e = 1;
                if (y3.t9(y3Var, null, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return y3.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f225173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f225174f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        
            if (r1.x9(r5, r4) == r0) goto L17;
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
                int r1 = r4.f225174f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r4.f225173e
                y70.f4 r0 = (p135y70.f4) r0
                oq.u.b(r5)
                goto L57
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1e:
                oq.u.b(r5)
                goto L36
            L22:
                oq.u.b(r5)
                y70.y3 r5 = p135y70.y3.this
                xw.b r5 = r5.Y1()
                y70.b$a r1 = y70.b.a.f224967a
                r4.f225174f = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L36
                goto L56
            L36:
                y70.y3 r5 = p135y70.y3.this
                y70.c4 r5 = p135y70.y3.k9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                java.lang.Object r5 = r5.a(r1)
                y70.f4 r5 = (p135y70.f4) r5
                if (r5 == 0) goto L57
                y70.y3 r1 = p135y70.y3.this
                java.lang.Object r3 = vq.j.a(r5)
                r4.f225173e = r3
                r4.f225174f = r2
                java.lang.Object r5 = p135y70.y3.q9(r1, r5, r4)
                if (r5 != r0) goto L57
            L56:
                return r0
            L57:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y70.y3.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return y3.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ DefaultNotificationDetailsData f225177f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y3 f225178g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(DefaultNotificationDetailsData defaultNotificationDetailsData, y3 y3Var, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f225177f = defaultNotificationDetailsData;
            this.f225178g = y3Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        
            if (r6.F(r1, r5) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f225176e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r6)
                goto L59
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                oq.u.b(r6)
                goto L43
            L1e:
                oq.u.b(r6)
                r74.a r6 = r5.f225177f
                boolean r6 = r6.getMessageDisplayed()
                if (r6 != 0) goto L43
                y70.y3 r6 = r5.f225178g
                j90.d r6 = p135y70.y3.i9(r6)
                j90.d$a r1 = new j90.d$a
                r74.a r4 = r5.f225177f
                java.lang.String r4 = r4.getMessageId()
                r1.<init>(r4)
                r5.f225176e = r3
                java.lang.Object r6 = r6.d(r1, r5)
                if (r6 != r0) goto L43
                goto L58
            L43:
                y70.y3 r6 = r5.f225178g
                xw.b r6 = r6.Y1()
                y70.b$d r1 = new y70.b$d
                r74.a r3 = r5.f225177f
                r1.<init>(r3)
                r5.f225176e = r2
                java.lang.Object r6 = r6.F(r1, r5)
                if (r6 != r0) goto L59
            L58:
                return r0
            L59:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: y70.y3.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new f(this.f225177f, this.f225178g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f225179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f225180e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f225182g;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f225180e = obj;
            this.f225182g |= PKIFailureInfo.systemUnavail;
            return y3.this.x9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements mu.g<p135y70.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f225183a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f225184a;

            /* JADX INFO: renamed from: y70.y3$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6030a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f225185d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f225186e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f225187f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f225189h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f225190j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f225191k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f225192l;

                public C6030a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f225185d = obj;
                    this.f225186e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f225184a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6030a c6030a;
                if (eVar instanceof C6030a) {
                    c6030a = (C6030a) eVar;
                    int i15 = c6030a.f225186e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6030a.f225186e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6030a = new C6030a(eVar);
                    }
                } else {
                    c6030a = new C6030a(eVar);
                }
                Object obj2 = c6030a.f225185d;
                Object objE = uq.b.e();
                int i16 = c6030a.f225186e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f225184a;
                    p135y70.d dVar = p135y70.d.f224987a;
                    c6030a.f225187f = vq.j.a(obj);
                    c6030a.f225189h = vq.j.a(c6030a);
                    c6030a.f225190j = vq.j.a(obj);
                    c6030a.f225191k = vq.j.a(hVar);
                    c6030a.f225192l = 0;
                    c6030a.f225186e = 1;
                    if (hVar.F(dVar, c6030a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public h(mu.g gVar) {
            this.f225183a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super p135y70.d> hVar, tq.e eVar) {
            Object objA = this.f225183a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Ly70/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Ly70/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends k implements er.q<nx.a, p135y70.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f225193e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f225194f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f225195g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f225196h;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0061  */
        /* JADX WARN: Code duplicated, block: B:25:0x0075  */
        /* JADX WARN: Code duplicated, block: B:27:0x008b  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:39:0x00db  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
        
            if (r9.F(r2, r8) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
        
            if (r2.F(r3, r8) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
        
            if (r2.F(r3, r8) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00f1, code lost:
        
            if (r4.x9(r2, r8) == r1) goto L41;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: y70.y3.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, p135y70.c cVar, tq.e<? super i0> eVar) {
            i iVar = y3.this.new i(eVar);
            iVar.f225196h = aVar;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly70/a;", "<unused var>", "Ly70/c;", "Loq/i0;", "<anonymous>", "(Ly70/a;Ly70/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends k implements er.q<p135y70.a, p135y70.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f225198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f225199f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        
            if (r8.F(r1, r7) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
        
            if (r1.F(r2, r7) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
        
            if (r1.F(r2, r7) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
        
            if (r1.F(r3, r7) == r0) goto L37;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: y70.y3.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p135y70.a aVar, p135y70.c cVar, tq.e<? super i0> eVar) {
            return y3.this.new j(eVar).J(i0.f148189a);
        }
    }

    public y3(yy.a aVar, yg0.b bVar, qg0.i iVar, sc0.b bVar2, q qVar, ec0.a aVar2, ec0.d dVar, gx.d dVar2, qg0.h hVar, a14.q qVar2, i70.e eVar, c4 c4Var, j90.d dVar3) {
        this.setupLaunchStateUC = iVar;
        this.isLoginLockedUC = bVar2;
        this.ownerViewLifecycleManager = qVar;
        this.cancelScheduledInactivityLogoutUC = aVar2;
        this.scheduleInactivityLogoutUC = dVar;
        this.globalEventManager = dVar2;
        this.logoutFromAppUC = hVar;
        this.goToStoreIntentUseCase = qVar2;
        this.globalSnackBarManager = eVar;
        this.consumePendingNavigationUC = c4Var;
        this.beMarkNotificationAsDisplayedUC = dVar3;
        this.lifecycleConnector = qVar;
        this.stateMachine = aVar.a(p135y70.c.f224978a, new l() { // from class: y70.w3
            @Override // er.l
            public final Object b(Object obj) {
                return y3.z9(this.f225134a, (v) obj);
            }
        });
        this.juniorTheme = (p0) bVar.a(gz.b.a.C1792a.f78542a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(y3 y3Var, z zVar) {
        k10.k.s(zVar, y3Var.x8(), null, y3Var.new i(null), 2, null);
        j jVar = y3Var.new j(null);
        zVar.x(q0.c(p135y70.a.class), o.CANCEL_PREVIOUS, jVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s9(String str, tq.e<? super dx.i<dx.b.Business, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f225166g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f225166g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f225164e;
        Object objE = uq.b.e();
        int i16 = aVar.f225166g;
        if (i16 == 0) {
            u.b(objC);
            a14.q qVar = this.goToStoreIntentUseCase;
            a14.q.Params params = new a14.q.Params(str);
            aVar.f225163d = vq.j.a(str);
            aVar.f225166g = 1;
            objC = qVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            this.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
        }
        return iVar;
    }

    static /* synthetic */ Object t9(y3 y3Var, String str, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = null;
        }
        return y3Var.s9(str, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r8.F(r2, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x9(p135y70.f4 r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof y70.y3.g
            if (r0 == 0) goto L13
            r0 = r8
            y70.y3$g r0 = (y70.y3.g) r0
            int r1 = r0.f225182g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f225182g = r1
            goto L18
        L13:
            y70.y3$g r0 = new y70.y3$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f225180e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f225182g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f225179d
            y70.f4 r7 = (p135y70.f4) r7
            oq.u.b(r8)
            goto L8d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f225179d
            y70.f4 r7 = (p135y70.f4) r7
            oq.u.b(r8)
            goto L6e
        L40:
            oq.u.b(r8)
            boolean r8 = r7 instanceof p135y70.f4.DefaultNotification
            if (r8 == 0) goto L90
            r8 = r7
            y70.f4$a r8 = (p135y70.f4.DefaultNotification) r8
            r74.a r2 = r8.getData()
            boolean r2 = r2.getMessageDisplayed()
            if (r2 != 0) goto L6e
            j90.d r2 = r6.beMarkNotificationAsDisplayedUC
            j90.d$a r5 = new j90.d$a
            r74.a r8 = r8.getData()
            java.lang.String r8 = r8.getMessageId()
            r5.<init>(r8)
            r0.f225179d = r7
            r0.f225182g = r4
            java.lang.Object r8 = r2.d(r5, r0)
            if (r8 != r1) goto L6e
            goto L8c
        L6e:
            xw.b r8 = r6.Y1()
            y70.b$d r2 = new y70.b$d
            r4 = r7
            y70.f4$a r4 = (p135y70.f4.DefaultNotification) r4
            r74.a r4 = r4.getData()
            r2.<init>(r4)
            java.lang.Object r7 = vq.j.a(r7)
            r0.f225179d = r7
            r0.f225182g = r3
            java.lang.Object r7 = r8.F(r2, r0)
            if (r7 != r1) goto L8d
        L8c:
            return r1
        L8d:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        L90:
            oq.p r7 = new oq.p
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p135y70.y3.x9(y70.f4, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final y3 y3Var, v vVar) {
        vVar.c(q0.c(p135y70.c.class), new l() { // from class: y70.x3
            @Override // er.l
            public final Object b(Object obj) {
                return y3.A9(this.f225140a, (z) obj);
            }
        });
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
    public xw.b<p135y70.b> Y1() {
        return this.navAction;
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        this.globalEventManager.a(this);
        super.Y8();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected t<p135y70.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // gx.c
    public boolean j5(gx.b event) {
        if (fr.t.c(event, gx.a.b.f78191a)) {
            ju.k.d(u0.a(this), null, null, new b(null), 3, null);
            return true;
        }
        if (fr.t.c(event, gx.a.c.f78192a)) {
            ju.k.d(u0.a(this), null, null, new c(null), 3, null);
            return true;
        }
        if (!(event instanceof gx.a.GoToStore)) {
            return false;
        }
        ju.k.d(u0.a(this), null, null, new d(null), 3, null);
        return true;
    }

    public p0<xg0.a> r9() {
        return this.juniorTheme;
    }

    public void u9() {
        this.globalEventManager.b(this);
        d9(p135y70.a.f224960a);
    }

    public void v9() {
        ju.k.d(u0.a(this), null, null, new e(null), 3, null);
    }

    public void w9(DefaultNotificationDetailsData data) {
        ju.k.d(u0.a(this), null, null, new f(data, this, null), 3, null);
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(p135y70.d dVar) {
        super.P5(dVar);
    }
}

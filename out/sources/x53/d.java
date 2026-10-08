package x53;

import androidx.p016lifecycle.t0;
import er.l;
import mu.b0;
import mu.h;
import mu.i;
import mu.p0;
import mu.r0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import oz.q;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010)R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00105\u001a\b\u0012\u0004\u0012\u00020,008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010<\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lx53/d;", "Landroidx/lifecycle/t0;", "Lx53/c;", "", "Lnx/b;", "Loz/q;", "ownerViewLifecycleManager", "Lg04/g;", "checkBiometricStatusUseCase", "Li70/e;", "globalSnackBarManager", "Lmx/c;", "labelProvider", "<init>", "(Loz/q;Lg04/g;Li70/e;Lmx/c;)V", "Loq/i0;", "b9", "(Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "currentPassword", "Q2", "(Liy/b0;)V", "currentPin", "o8", "Q1", "()Liy/b0;", "N5", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "b", "Loz/q;", "c", "Lg04/g;", "d", "Li70/e;", "e", "Lmx/c;", "f", "c9", "()Loz/q;", "lifecycleConnector", "Lmu/b0;", "Lx53/a;", "g", "Lmu/b0;", "_sharedData", "Lmu/p0;", "h", "Lmu/p0;", "d9", "()Lmu/p0;", "sharedData", "Lxw/b;", "Lx53/b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends t0 implements c, zx.d, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g04.g checkBiometricStatusUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q lifecycleConnector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b0<TurnOnSharedData> _sharedData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<TurnOnSharedData> sharedData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<b> navAction;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216925e;

        /* JADX INFO: renamed from: x53.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C5784a implements mu.g<i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.g f216927a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f216928b;

            /* JADX INFO: renamed from: x53.d$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5785a<T> implements h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ h f216929a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d f216930b;

                /* JADX INFO: renamed from: x53.d$a$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C5786a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f216931d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f216932e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f216933f;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f216935h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    Object f216936j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    Object f216937k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    Object f216938l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    Object f216939m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    Object f216940n;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    Object f216941p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    Object f216942q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    int f216943r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    int f216944s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f216945t;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    int f216946v;

                    public C5786a(tq.e eVar) {
                        super(eVar);
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f216931d = obj;
                        this.f216932e |= PKIFailureInfo.systemUnavail;
                        return C5785a.this.F(null, this);
                    }
                }

                public C5785a(h hVar, d dVar) {
                    this.f216929a = hVar;
                    this.f216930b = dVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x0218, code lost:
                
                    if (r1.F(r7, r2) == r3) goto L49;
                 */
                @Override // mu.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object F(java.lang.Object r18, tq.e r19) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 542
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: x53.d.a.C5784a.C5785a.F(java.lang.Object, tq.e):java.lang.Object");
                }
            }

            public C5784a(mu.g gVar, d dVar) {
                this.f216927a = gVar;
                this.f216928b = dVar;
            }

            @Override // mu.g
            public Object a(h<? super i0> hVar, tq.e eVar) {
                Object objA = this.f216927a.a(new C5785a(hVar, this.f216928b), eVar);
                return objA == uq.b.e() ? objA : i0.f148189a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f216925e;
            if (i15 == 0) {
                u.b(obj);
                C5784a c5784a = new C5784a(d.this.G2(), d.this);
                this.f216925e = 1;
                if (i.i(c5784a, this) == objE) {
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public d(q qVar, g04.g gVar, i70.e eVar, mx.c cVar) {
        this.ownerViewLifecycleManager = qVar;
        this.checkBiometricStatusUseCase = gVar;
        this.globalSnackBarManager = eVar;
        this.labelProvider = cVar;
        this.lifecycleConnector = qVar;
        b0<TurnOnSharedData> b0VarA = r0.a(new TurnOnSharedData(null, null, 3, null));
        this._sharedData = b0VarA;
        this.sharedData = i.b(b0VarA);
        i00.a.a(this, new a(null));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b9(tq.e<? super i0> eVar) {
        this.globalSnackBarManager.y(new p50.a.Default(this.labelProvider.c(c53.a.f23717p), false, null, 6, null));
        Object objF = Y1().F(b.a.f216916a, eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // x53.c
    public iy.b0 N5() {
        return d9().getValue().getCurrentPin();
    }

    @Override // x53.c
    public iy.b0 Q1() {
        return d9().getValue().getCurrentPassword();
    }

    @Override // x53.c
    public void Q2(iy.b0 currentPassword) {
        TurnOnSharedData value;
        b0<TurnOnSharedData> b0Var = this._sharedData;
        do {
            value = b0Var.getValue();
        } while (!b0Var.s(value, TurnOnSharedData.b(value, currentPassword, null, 2, null)));
    }

    @Override // zx.b
    public xw.b<b> Y1() {
        return this.navAction;
    }

    /* JADX INFO: renamed from: c9, reason: from getter */
    public q getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    public p0<TurnOnSharedData> d9() {
        return this.sharedData;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: e9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // x53.c
    public void o8(iy.b0 currentPin) {
        TurnOnSharedData value;
        b0<TurnOnSharedData> b0Var = this._sharedData;
        do {
            value = b0Var.getValue();
        } while (!b0Var.s(value, TurnOnSharedData.b(value, null, currentPin, 1, null)));
    }
}

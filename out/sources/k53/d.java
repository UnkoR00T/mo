package k53;

import androidx.p016lifecycle.t0;
import g04.l;
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
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010&R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u00102\u001a\b\u0012\u0004\u0012\u00020)0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00109\u001a\b\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lk53/d;", "Landroidx/lifecycle/t0;", "Lk53/c;", "", "Lnx/b;", "Loz/q;", "ownerViewLifecycleManager", "Lg04/g;", "checkBiometricStatusUseCase", "Lg04/l;", "getPasswordFromBiometricUseCase", "Liy/c;", "bytesConverter", "<init>", "(Loz/q;Lg04/g;Lg04/l;Liy/c;)V", "Liy/b0;", "decryptedPassword", "Loq/i0;", "Z6", "(Liy/b0;)V", "Ldx/i;", "Ldx/b;", "O8", "(Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "b", "Loz/q;", "c", "Lg04/g;", "d", "Lg04/l;", "e", "Liy/c;", "f", "b9", "()Loz/q;", "lifecycleConnector", "Lmu/b0;", "Lk53/a;", "g", "Lmu/b0;", "_sharedData", "Lmu/p0;", "h", "Lmu/p0;", "getSharedData", "()Lmu/p0;", "sharedData", "Lxw/b;", "Lk53/b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends t0 implements c, zx.d, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g04.g checkBiometricStatusUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l getPasswordFromBiometricUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q lifecycleConnector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b0<ChangePinSharedData> _sharedData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<ChangePinSharedData> sharedData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<k53.b> navAction;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108618e;

        /* JADX INFO: renamed from: k53.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C2583a implements mu.g<i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.g f108620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f108621b;

            /* JADX INFO: renamed from: k53.d$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2584a<T> implements h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ h f108622a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d f108623b;

                /* JADX INFO: renamed from: k53.d$a$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C2585a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f108624d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f108625e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f108626f;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f108628h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    Object f108629j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    Object f108630k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    Object f108631l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    Object f108632m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    Object f108633n;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    Object f108634p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    Object f108635q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    int f108636r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    int f108637s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f108638t;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    int f108639v;

                    public C2585a(tq.e eVar) {
                        super(eVar);
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f108624d = obj;
                        this.f108625e |= PKIFailureInfo.systemUnavail;
                        return C2584a.this.F(null, this);
                    }
                }

                public C2584a(h hVar, d dVar) {
                    this.f108622a = hVar;
                    this.f108623b = dVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x0227, code lost:
                
                    if (r1.F(r7, r2) == r3) goto L50;
                 */
                @Override // mu.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object F(java.lang.Object r18, tq.e r19) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 557
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: k53.d.a.C2583a.C2584a.F(java.lang.Object, tq.e):java.lang.Object");
                }
            }

            public C2583a(mu.g gVar, d dVar) {
                this.f108620a = gVar;
                this.f108621b = dVar;
            }

            @Override // mu.g
            public Object a(h<? super i0> hVar, tq.e eVar) {
                Object objA = this.f108620a.a(new C2584a(hVar, this.f108621b), eVar);
                return objA == uq.b.e() ? objA : i0.f148189a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108618e;
            if (i15 == 0) {
                u.b(obj);
                C2583a c2583a = new C2583a(d.this.G2(), d.this);
                this.f108618e = 1;
                if (i.i(c2583a, this) == objE) {
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f108640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f108641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f108642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f108643g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f108644h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f108646k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f108644h = obj;
            this.f108646k |= PKIFailureInfo.systemUnavail;
            return d.this.O8(this);
        }
    }

    public d(q qVar, g04.g gVar, l lVar, iy.c cVar) {
        this.ownerViewLifecycleManager = qVar;
        this.checkBiometricStatusUseCase = gVar;
        this.getPasswordFromBiometricUseCase = lVar;
        this.bytesConverter = cVar;
        this.lifecycleConnector = qVar;
        b0<ChangePinSharedData> b0VarA = r0.a(new ChangePinSharedData(null, null, null, 7, null));
        this._sharedData = b0VarA;
        this.sharedData = i.b(b0VarA);
        i00.a.a(this, new a(null));
        this.navAction = new xw.b<>();
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // k53.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object O8(tq.e<? super dx.i<? extends dx.b, iy.b0>> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k53.d.O8(tq.e):java.lang.Object");
    }

    @Override // zx.b
    public xw.b<k53.b> Y1() {
        return this.navAction;
    }

    @Override // k53.c
    public void Z6(iy.b0 decryptedPassword) {
        b0<ChangePinSharedData> b0Var = this._sharedData;
        while (true) {
            ChangePinSharedData value = b0Var.getValue();
            iy.b0 b0Var2 = decryptedPassword;
            if (b0Var.s(value, ChangePinSharedData.b(value, null, null, b0Var2, 3, null))) {
                return;
            } else {
                decryptedPassword = b0Var2;
            }
        }
    }

    @Override // zx.b
    /* JADX INFO: renamed from: a9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(k53.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    /* JADX INFO: renamed from: b9, reason: from getter */
    public q getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: c9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}

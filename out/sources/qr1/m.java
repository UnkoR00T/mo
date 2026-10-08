package qr1;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030'8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0014048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lqr1/m;", "Ll00/g;", "Lqr1/d;", "", "Lqr1/e;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lrr1/a;", "mapper", "Lgy/a;", "permissionManager", "globalSnackBarManager", "<init>", "(Lyy/a;Lrr1/a;Lgy/a;Li70/e;)V", "Lgy/c;", "permissionResult", "Lp50/a$a;", "n9", "(Lgy/c;)Lp50/a$a;", "Lqr1/e$a;", "m9", "(Lqr1/d;)Lqr1/e$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lrr1/a;", "c", "Lgy/a;", "d", "Li70/e;", "e", "Lqr1/d;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lqr1/b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<qr1.d, Object> implements e, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rr1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final qr1.d initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<qr1.d, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qr1.b> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f168224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f168225b;

        /* JADX INFO: renamed from: qr1.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4248a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f168226a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f168227b;

            /* JADX INFO: renamed from: qr1.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4249a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f168228d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f168229e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f168230f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f168232h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f168233j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f168234k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f168235l;

                public C4249a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f168228d = obj;
                    this.f168229e |= PKIFailureInfo.systemUnavail;
                    return C4248a.this.F(null, this);
                }
            }

            public C4248a(mu.h hVar, m mVar) {
                this.f168226a = hVar;
                this.f168227b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4249a c4249a;
                if (eVar instanceof C4249a) {
                    c4249a = (C4249a) eVar;
                    int i15 = c4249a.f168229e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4249a.f168229e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4249a = new C4249a(eVar);
                    }
                } else {
                    c4249a = new C4249a(eVar);
                }
                Object obj2 = c4249a.f168228d;
                Object objE = uq.b.e();
                int i16 = c4249a.f168229e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f168226a;
                    e.Data dataM9 = this.f168227b.m9((qr1.d) obj);
                    c4249a.f168230f = vq.j.a(obj);
                    c4249a.f168232h = vq.j.a(c4249a);
                    c4249a.f168233j = vq.j.a(obj);
                    c4249a.f168234k = vq.j.a(hVar);
                    c4249a.f168235l = 0;
                    c4249a.f168229e = 1;
                    if (hVar.F(dataM9, c4249a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f168224a = gVar;
            this.f168225b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f168224a.a(new C4248a(hVar, this.f168225b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqr1/b;", "action", "Lqr1/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqr1/b;Lqr1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<qr1.b, qr1.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168237f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qr1.b bVar = (qr1.b) this.f168237f;
            Object objE = uq.b.e();
            int i15 = this.f168236e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<qr1.b> bVarY1 = m.this.Y1();
                this.f168237f = vq.j.a(bVar);
                this.f168236e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qr1.b bVar, qr1.d dVar, tq.e<? super i0> eVar) {
            b bVar2 = m.this.new b(eVar);
            bVar2.f168237f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqr1/a;", "<unused var>", "Lqr1/d;", "Loq/i0;", "<anonymous>", "(Lqr1/a;Lqr1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<qr1.a, qr1.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168239e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f168239e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.this.globalSnackBarManager.y(m.this.n9(m.this.permissionManager.h(gy.d.GPS)));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qr1.a aVar, qr1.d dVar, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqr1/c;", "<unused var>", "Lqr1/d;", "Loq/i0;", "<anonymous>", "(Lqr1/c;Lqr1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<qr1.c, qr1.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168241e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f168241e;
            if (i15 == 0) {
                u.b(obj);
                gy.a aVar = m.this.permissionManager;
                gy.d dVar = gy.d.GPS;
                this.f168241e = 1;
                obj = aVar.d(dVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            m.this.globalSnackBarManager.y(m.this.n9((gy.c) obj));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qr1.c cVar, qr1.d dVar, tq.e<? super i0> eVar) {
            return m.this.new d(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, rr1.a aVar2, gy.a aVar3, i70.e eVar) {
        this.mapper = aVar2;
        this.permissionManager = aVar3;
        this.globalSnackBarManager = eVar;
        qr1.d dVar = qr1.d.f168203a;
        this.initialState = dVar;
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: qr1.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f168215a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data m9(qr1.d dVar) {
        return this.mapper.b(new rr1.a.Params(dVar, b9(qr1.a.f168200a), b9(qr1.c.f168202a), b9(qr1.b.a.f168201a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p50.a.Default n9(gy.c permissionResult) {
        String str;
        if (fr.t.c(permissionResult, gy.c.a.f78236a)) {
            str = "Permission granted.";
        } else if (permissionResult instanceof gy.c.NotGranted) {
            str = "Permission not granted.\nshouldShowRationale = " + ((gy.c.NotGranted) permissionResult).getShouldShowRationale();
        } else {
            if (!fr.t.c(permissionResult, gy.c.C1774c.f78238a)) {
                throw new oq.p();
            }
            str = "Unknown permission status. Something went wrong.";
        }
        return new p50.a.Default(mx.b.b(str, "SnackBarMessage"), true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final m mVar, v vVar) {
        vVar.c(q0.c(qr1.d.class), new er.l() { // from class: qr1.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.q9(this.f168216a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(qr1.b.class), oVar, bVar);
        zVar.x(q0.c(qr1.a.class), oVar, mVar.new c(null));
        zVar.x(q0.c(qr1.c.class), oVar, mVar.new d(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<qr1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<qr1.d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}

package gl2;

import a14.v;
import fr.q0;
import k10.c0;
import k10.t;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001=BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0017078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lgl2/m;", "Ll00/g;", "Lgl2/b;", "Lgl2/a;", "Lgl2/c;", "", "Lyy/a;", "stateMachineFactory", "Lgl2/d;", "mapper", "Lib4/c;", "genericErrorMapper", "La14/v;", "openAppIntentUseCase", "Ldl2/b;", "shouldShowMyIkpAlertUC", "Ldl2/a;", "saveHideMyIkpAlertFlagUC", "La14/q;", "goToStoreIntentUseCase", "<init>", "(Lyy/a;Lgl2/d;Lib4/c;La14/v;Ldl2/b;Ldl2/a;La14/q;)V", "state", "Lgl2/c$a;", "s9", "(Lgl2/b;)Lgl2/c$a;", "b", "Lgl2/d;", "c", "Lib4/c;", "d", "La14/v;", "e", "Ldl2/b;", "f", "Ldl2/a;", "g", "La14/q;", "Lgl2/b$a;", "h", "Lgl2/b$a;", "initialState", "Lxw/b;", "Lgl2/a$d;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "m", "a", "myikp_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<gl2.b, a> implements gl2.c, zx.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f73613n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gl2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v openAppIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final dl2.b shouldShowMyIkpAlertUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dl2.a saveHideMyIkpAlertFlagUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a14.q goToStoreIntentUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final gl2.b.a initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.d> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t<gl2.b, a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<gl2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<gl2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f73624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f73625b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f73626a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f73627b;

            /* JADX INFO: renamed from: gl2.m$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1690a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f73628d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f73629e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f73630f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f73632h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f73633j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f73634k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f73635l;

                public C1690a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f73628d = obj;
                    this.f73629e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f73626a = hVar;
                this.f73627b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1690a c1690a;
                if (eVar instanceof C1690a) {
                    c1690a = (C1690a) eVar;
                    int i15 = c1690a.f73629e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1690a.f73629e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1690a = new C1690a(eVar);
                    }
                } else {
                    c1690a = new C1690a(eVar);
                }
                Object obj2 = c1690a.f73628d;
                Object objE = uq.b.e();
                int i16 = c1690a.f73629e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f73626a;
                    gl2.c.a aVarS9 = this.f73627b.s9((gl2.b) obj);
                    c1690a.f73630f = vq.j.a(obj);
                    c1690a.f73632h = vq.j.a(c1690a);
                    c1690a.f73633j = vq.j.a(obj);
                    c1690a.f73634k = vq.j.a(hVar);
                    c1690a.f73635l = 0;
                    c1690a.f73629e = 1;
                    if (hVar.F(aVarS9, c1690a) == objE) {
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

        public b(mu.g gVar, m mVar) {
            this.f73624a = gVar;
            this.f73625b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super gl2.c.a> hVar, tq.e eVar) {
            Object objA = this.f73624a.a(new a(hVar, this.f73625b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgl2/a$a;", "<unused var>", "Lgl2/b;", "Loq/i0;", "<anonymous>", "(Lgl2/a$a;Lgl2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<a.C1686a, gl2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73636e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73636e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a.d> bVarY1 = m.this.Y1();
                a.d.C1687a c1687a = a.d.C1687a.f73577a;
                this.f73636e = 1;
                if (bVarY1.F(c1687a, this) == objE) {
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
        public final Object w(a.C1686a c1686a, gl2.b bVar, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lgl2/b$a;", "state", "Lk10/l;", "Lgl2/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<gl2.b.a>, tq.e<? super k10.l<? extends gl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73639f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gl2.b.Initialized O(boolean z15, gl2.b.a aVar) {
            return new gl2.b.Initialized(z15);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f73639f;
            Object objE = uq.b.e();
            int i15 = this.f73638e;
            if (i15 == 0) {
                u.b(obj);
                dl2.b bVar = m.this.shouldShowMyIkpAlertUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f73639f = c0Var;
                this.f73638e = 1;
                obj = bVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            return c0Var.d(new er.l() { // from class: gl2.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.d.O(zBooleanValue, (b.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<gl2.b.a> c0Var, tq.e<? super k10.l<? extends gl2.b>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f73639f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgl2/a$b;", "<unused var>", "Lk10/c0;", "Lgl2/b$b;", "state", "Lk10/l;", "Lgl2/b;", "<anonymous>", "(Lgl2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a.b, c0<gl2.b.Initialized>, tq.e<? super k10.l<? extends gl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73642f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gl2.b.Initialized O(gl2.b.Initialized initialized) {
            return initialized.a(false);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f73642f;
            Object objE = uq.b.e();
            int i15 = this.f73641e;
            if (i15 == 0) {
                u.b(obj);
                dl2.a aVar = m.this.saveHideMyIkpAlertFlagUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f73642f = c0Var;
                this.f73641e = 1;
                if (aVar.a(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: gl2.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.e.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, c0<gl2.b.Initialized> c0Var, tq.e<? super k10.l<? extends gl2.b>> eVar) {
            e eVar2 = m.this.new e(eVar);
            eVar2.f73642f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgl2/a$f;", "action", "Lgl2/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgl2/a$f;Lgl2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a.OpenMyIkpApp, gl2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73645f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.OpenMyIkpApp openMyIkpApp = (a.OpenMyIkpApp) this.f73645f;
            Object objE = uq.b.e();
            int i15 = this.f73644e;
            if (i15 == 0) {
                u.b(obj);
                v vVar = m.this.openAppIntentUseCase;
                v.Params params = new v.Params(openMyIkpApp.getDeepLink(), "pl.gov.cez.mojeikp");
                this.f73645f = vq.j.a(openMyIkpApp);
                this.f73644e = 1;
                if (vVar.c(params, this) == objE) {
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
        public final Object w(a.OpenMyIkpApp openMyIkpApp, gl2.b.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = m.this.new f(eVar);
            fVar.f73645f = openMyIkpApp;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgl2/a$e;", "<unused var>", "Lgl2/b$b;", "Loq/i0;", "<anonymous>", "(Lgl2/a$e;Lgl2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.e, gl2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73647e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73647e;
            if (i15 == 0) {
                u.b(obj);
                a14.q qVar = m.this.goToStoreIntentUseCase;
                a14.q.Params params = new a14.q.Params("pl.gov.cez.mojeikp");
                this.f73647e = 1;
                obj = qVar.c(params, this);
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
            m mVar = m.this;
            if (iVar instanceof dx.i.Left) {
                new a.HandleGenericError(new dx.b.Business(null, null, mVar.mapper.e(), mVar.mapper.c(), null, mVar.mapper.f(), null, 83, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.e eVar, gl2.b.Initialized initialized, tq.e<? super i0> eVar2) {
            return m.this.new g(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgl2/a$c;", "action", "Lgl2/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgl2/a$c;Lgl2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.HandleGenericError, gl2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73650f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m mVar, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                    mVar.d9(a.e.f73579a);
                } else {
                    if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                        throw new oq.p();
                    }
                    mVar.d9(a.C1686a.f73574a);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.HandleGenericError handleGenericError = (a.HandleGenericError) this.f73650f;
            Object objE = uq.b.e();
            int i15 = this.f73649e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a.d> bVarY1 = m.this.Y1();
                ib4.c cVar = m.this.genericErrorMapper;
                dx.b domainError = handleGenericError.getDomainError();
                final m mVar = m.this;
                a.d.HandleGenericError handleGenericError2 = new a.d.HandleGenericError(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: gl2.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.h.O(mVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f73650f = vq.j.a(handleGenericError);
                this.f73649e = 1;
                if (bVarY1.F(handleGenericError2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.HandleGenericError handleGenericError, gl2.b.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = m.this.new h(eVar);
            hVar.f73650f = handleGenericError;
            return hVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, gl2.d dVar, ib4.c cVar, v vVar, dl2.b bVar, dl2.a aVar2, a14.q qVar) {
        this.mapper = dVar;
        this.genericErrorMapper = cVar;
        this.openAppIntentUseCase = vVar;
        this.shouldShowMyIkpAlertUC = bVar;
        this.saveHideMyIkpAlertFlagUC = aVar2;
        this.goToStoreIntentUseCase = qVar;
        gl2.b.a aVar3 = gl2.b.a.f73581a;
        this.initialState = aVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: gl2.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.u9(this.f73608a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), s9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gl2.c.a s9(gl2.b state) {
        return this.mapper.b(new gl2.d.Params(state, b9(a.b.f73575a), b9(new a.OpenMyIkpApp("mojeikp://lista_recept")), b9(new a.OpenMyIkpApp("mojeikp://lista_skierowan")), b9(new a.OpenMyIkpApp("mojeikp://ser_lista_umowionych_wizyt")), b9(new a.OpenMyIkpApp("mojeikp://uprawnienia")), b9(new a.OpenMyIkpApp("mojeikp://ezwm_lista")), b9(new a.OpenMyIkpApp("mojeikp://kontakt_do_poz")), b9(new a.OpenMyIkpApp("mojeikp://ubezpieczenie_zdrowotne_za_granica")), b9(a.e.f73579a), b9(a.C1686a.f73574a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final m mVar, k10.v vVar) {
        vVar.c(q0.c(gl2.b.class), new er.l() { // from class: gl2.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.v9(this.f73609a, (z) obj);
            }
        });
        vVar.c(q0.c(gl2.b.a.class), new er.l() { // from class: gl2.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.w9(this.f73610a, (z) obj);
            }
        });
        vVar.c(q0.c(gl2.b.Initialized.class), new er.l() { // from class: gl2.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.x9(this.f73611a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(m mVar, z zVar) {
        c cVar = mVar.new c(null);
        zVar.x(q0.c(a.C1686a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(m mVar, z zVar) {
        zVar.A(mVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(m mVar, z zVar) {
        e eVar = mVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(a.b.class), oVar, eVar);
        zVar.x(q0.c(a.OpenMyIkpApp.class), oVar, mVar.new f(null));
        zVar.x(q0.c(a.e.class), oVar, mVar.new g(null));
        zVar.x(q0.c(a.HandleGenericError.class), oVar, mVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<gl2.b, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<gl2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}

package fd0;

import fr.q0;
import java.util.Iterator;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lfd0/p;", "Ll00/g;", "Lfd0/e;", "", "Lfd0/f;", "Lyy/a;", "stateMachineFactory", "Lgd0/b;", "mapper", "Lyg0/c;", "setMJuniorThemeUC", "Lyg0/b;", "getMJuniorThemeFlowUC", "Lyg0/d;", "setForceConfigChangeUC", "Lyg0/a;", "consumeForceConfigChangeUC", "<init>", "(Lyy/a;Lgd0/b;Lyg0/c;Lyg0/b;Lyg0/d;Lyg0/a;)V", "state", "Lfd0/f$a;", "m9", "(Lfd0/e;)Lfd0/f$a;", "Loq/i0;", "Y8", "()V", "b", "Lgd0/b;", "c", "Lyg0/c;", "d", "Lyg0/b;", "e", "Lyg0/d;", "f", "Lyg0/a;", "Lxw/b;", "Lfd0/d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gd0.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yg0.c setMJuniorThemeUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yg0.b getMJuniorThemeFlowUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yg0.d setForceConfigChangeUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final yg0.a consumeForceConfigChangeUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fd0.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<f.a> state = a9(new a(e9().getState(), this), m9(new State(null, 1, null)));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f61359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f61360b;

        /* JADX INFO: renamed from: fd0.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1385a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f61361a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f61362b;

            /* JADX INFO: renamed from: fd0.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1386a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f61363d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f61364e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f61365f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f61367h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f61368j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f61369k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f61370l;

                public C1386a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f61363d = obj;
                    this.f61364e |= PKIFailureInfo.systemUnavail;
                    return C1385a.this.F(null, this);
                }
            }

            public C1385a(mu.h hVar, p pVar) {
                this.f61361a = hVar;
                this.f61362b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1386a c1386a;
                if (eVar instanceof C1386a) {
                    c1386a = (C1386a) eVar;
                    int i15 = c1386a.f61364e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1386a.f61364e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1386a = new C1386a(eVar);
                    }
                } else {
                    c1386a = new C1386a(eVar);
                }
                Object obj2 = c1386a.f61363d;
                Object objE = uq.b.e();
                int i16 = c1386a.f61364e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f61361a;
                    f.a aVarM9 = this.f61362b.m9((State) obj);
                    c1386a.f61365f = vq.j.a(obj);
                    c1386a.f61367h = vq.j.a(c1386a);
                    c1386a.f61368j = vq.j.a(obj);
                    c1386a.f61369k = vq.j.a(hVar);
                    c1386a.f61370l = 0;
                    c1386a.f61364e = 1;
                    if (hVar.F(aVarM9, c1386a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f61359a = gVar;
            this.f61360b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.a> hVar, tq.e eVar) {
            Object objA = this.f61359a.a(new C1385a(hVar, this.f61360b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfd0/a;", "<unused var>", "Lfd0/e;", "Loq/i0;", "<anonymous>", "(Lfd0/a;Lfd0/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<fd0.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61371e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f61371e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<fd0.d> bVarY1 = p.this.Y1();
                fd0.d.a aVar = fd0.d.a.f61332a;
                this.f61371e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(fd0.a aVar, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfd0/c;", "<unused var>", "Lfd0/e;", "Loq/i0;", "<anonymous>", "(Lfd0/c;Lfd0/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<fd0.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61373e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f61373e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<fd0.d> bVarY1 = p.this.Y1();
                fd0.d.b bVar = fd0.d.b.f61333a;
                this.f61373e = 1;
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
        public final Object w(fd0.c cVar, State state, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfd0/b;", "action", "Lfd0/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfd0/b;Lfd0/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ChangeTheme, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f61376f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ChangeTheme changeTheme = (ChangeTheme) this.f61376f;
            Object objE = uq.b.e();
            int i15 = this.f61375e;
            if (i15 == 0) {
                u.b(obj);
                yg0.c cVar = p.this.setMJuniorThemeUC;
                yg0.c.Params params = new yg0.c.Params(changeTheme.getTheme());
                this.f61376f = vq.j.a(changeTheme);
                this.f61375e = 1;
                if (cVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            p.this.setForceConfigChangeUC.a(gz.b.a.C1792a.f78542a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeTheme changeTheme, State state, tq.e<? super i0> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f61376f = changeTheme;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxg0/a;", "value", "Lk10/c0;", "Lfd0/e;", "state", "Lk10/l;", "<anonymous>", "(Lxg0/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<xg0.a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f61379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f61380g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f61382a;

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
                f61382a = iArr;
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(xg0.a aVar, p pVar, State state) {
            xg0.a next;
            int i15 = a.f61382a[aVar.ordinal()];
            int i16 = 1;
            if (i15 != 1 && i15 != 2) {
                if (i15 != 3) {
                    throw new oq.p();
                }
                i16 = 2;
            }
            androidx.appcompat.app.f.L(i16);
            pVar.setForceConfigChangeUC.a(gz.b.a.C1792a.f78542a);
            Iterator<xg0.a> it = xg0.a.e().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next != aVar);
            xg0.a aVar2 = next;
            if (aVar2 == null) {
                aVar2 = xg0.a.ENERGY;
            }
            return state.a(aVar2);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xg0.a aVar = (xg0.a) this.f61379f;
            c0 c0Var = (c0) this.f61380g;
            uq.b.e();
            if (this.f61378e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final p pVar = p.this;
            return c0Var.b(new er.l() { // from class: fd0.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O(aVar, pVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xg0.a aVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f61379f = aVar;
            eVar2.f61380g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, gd0.b bVar, yg0.c cVar, yg0.b bVar2, yg0.d dVar, yg0.a aVar2) {
        this.mapper = bVar;
        this.setMJuniorThemeUC = cVar;
        this.getMJuniorThemeFlowUC = bVar2;
        this.setForceConfigChangeUC = dVar;
        this.consumeForceConfigChangeUC = aVar2;
        this.stateMachine = aVar.a(new State(null, 1, null), new er.l() { // from class: fd0.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f61348a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.a m9(State state) {
        return this.mapper.b(new gd0.b.Params(state, b9(fd0.c.f61331a), b9(fd0.a.f61329a), new er.l() { // from class: fd0.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.n9(this.f61350a, (xg0.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(p pVar, xg0.a aVar) {
        pVar.d9(new ChangeTheme(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: fd0.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f61349a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fd0.a.class), oVar, bVar);
        zVar.x(q0.c(fd0.c.class), oVar, pVar.new c(null));
        zVar.x(q0.c(ChangeTheme.class), oVar, pVar.new d(null));
        k10.k.m(zVar, pVar.getMJuniorThemeFlowUC.a(gz.b.a.C1792a.f78542a), null, pVar.new e(null), 2, null);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<fd0.d> Y1() {
        return this.navAction;
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        super.Y8();
        this.consumeForceConfigChangeUC.a(gz.b.a.C1792a.f78542a);
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}

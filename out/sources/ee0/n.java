package ee0;

import fr.q0;
import java.util.Iterator;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lee0/n;", "Ll00/g;", "Lee0/d;", "", "Lee0/e;", "Lyy/a;", "stateMachineFactory", "Lfe0/b;", "mapper", "Lyg0/c;", "setAppThemeUC", "Lyg0/b;", "getAppThemeFlowUC", "<init>", "(Lyy/a;Lfe0/b;Lyg0/c;Lyg0/b;)V", "state", "Lee0/e$a;", "l9", "(Lee0/d;)Lee0/e$a;", "b", "Lfe0/b;", "c", "Lyg0/c;", "d", "Lyg0/b;", "Lxw/b;", "Lee0/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fe0.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yg0.c setAppThemeUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yg0.b getAppThemeFlowUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ee0.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.a> state = a9(new a(e9().getState(), this), l9(new State(null, 1, null)));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f49568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f49569b;

        /* JADX INFO: renamed from: ee0.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1175a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f49570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f49571b;

            /* JADX INFO: renamed from: ee0.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1176a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f49572d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f49573e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f49574f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f49576h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f49577j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f49578k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f49579l;

                public C1176a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f49572d = obj;
                    this.f49573e |= PKIFailureInfo.systemUnavail;
                    return C1175a.this.F(null, this);
                }
            }

            public C1175a(mu.h hVar, n nVar) {
                this.f49570a = hVar;
                this.f49571b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1176a c1176a;
                if (eVar instanceof C1176a) {
                    c1176a = (C1176a) eVar;
                    int i15 = c1176a.f49573e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1176a.f49573e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1176a = new C1176a(eVar);
                    }
                } else {
                    c1176a = new C1176a(eVar);
                }
                Object obj2 = c1176a.f49572d;
                Object objE = uq.b.e();
                int i16 = c1176a.f49573e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f49570a;
                    e.a aVarL9 = this.f49571b.l9((State) obj);
                    c1176a.f49574f = vq.j.a(obj);
                    c1176a.f49576h = vq.j.a(c1176a);
                    c1176a.f49577j = vq.j.a(obj);
                    c1176a.f49578k = vq.j.a(hVar);
                    c1176a.f49579l = 0;
                    c1176a.f49573e = 1;
                    if (hVar.F(aVarL9, c1176a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f49568a = gVar;
            this.f49569b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.a> hVar, tq.e eVar) {
            Object objA = this.f49568a.a(new C1175a(hVar, this.f49569b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lee0/a;", "<unused var>", "Lee0/d;", "Loq/i0;", "<anonymous>", "(Lee0/a;Lee0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ee0.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49580e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49580e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ee0.c> bVarY1 = n.this.Y1();
                ee0.c.a aVar = ee0.c.a.f49546a;
                this.f49580e = 1;
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
        public final Object w(ee0.a aVar, State state, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lee0/b;", "action", "Lee0/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lee0/b;Lee0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ChangeTheme, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49583f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ChangeTheme changeTheme = (ChangeTheme) this.f49583f;
            Object objE = uq.b.e();
            int i15 = this.f49582e;
            if (i15 == 0) {
                u.b(obj);
                yg0.c cVar = n.this.setAppThemeUC;
                yg0.c.Params params = new yg0.c.Params(changeTheme.getTheme());
                this.f49583f = vq.j.a(changeTheme);
                this.f49582e = 1;
                if (cVar.c(params, this) == objE) {
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
        public final Object w(ChangeTheme changeTheme, State state, tq.e<? super i0> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f49583f = changeTheme;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxg0/a;", "value", "Lk10/c0;", "Lee0/d;", "state", "Lk10/l;", "<anonymous>", "(Lxg0/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<xg0.a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49586f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f49587g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(xg0.a aVar, State state) {
            xg0.a next;
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
            final xg0.a aVar = (xg0.a) this.f49586f;
            c0 c0Var = (c0) this.f49587g;
            uq.b.e();
            if (this.f49585e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: ee0.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.d.O(aVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xg0.a aVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f49586f = aVar;
            dVar.f49587g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, fe0.b bVar, yg0.c cVar, yg0.b bVar2) {
        this.mapper = bVar;
        this.setAppThemeUC = cVar;
        this.getAppThemeFlowUC = bVar2;
        this.stateMachine = aVar.a(new State(null, 1, null), new er.l() { // from class: ee0.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f49559a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.a l9(State state) {
        return this.mapper.b(new fe0.b.Params(state, b9(ee0.a.f49544a), new er.l() { // from class: ee0.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f49560a, (xg0.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, xg0.a aVar) {
        nVar.d9(new ChangeTheme(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ee0.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f49561a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ee0.a.class), oVar, bVar);
        zVar.x(q0.c(ChangeTheme.class), oVar, nVar.new c(null));
        k10.k.m(zVar, nVar.getAppThemeFlowUC.a(gz.b.a.C1792a.f78542a), null, new d(null), 2, null);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ee0.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}

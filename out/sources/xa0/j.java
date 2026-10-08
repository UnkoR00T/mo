package xa0;

import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lxa0/j;", "Ll00/g;", "Lxa0/b;", "", "Lxa0/c;", "Lyy/a;", "stateMachineFactory", "Lya0/d;", "mapper", "Lc54/b;", "isFeatureEnabledUseCase", "<init>", "(Lyy/a;Lya0/d;Lc54/b;)V", "state", "Lxa0/c$a;", "j9", "(Lxa0/b;)Lxa0/c$a;", "b", "Lya0/d;", "Lxw/b;", "Lxa0/a;", "c", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "d", "Lxa0/b;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<State, Object> implements xa0.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ya0.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xa0.a> navAction = new xw.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<xa0.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<xa0.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f217757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f217758b;

        /* JADX INFO: renamed from: xa0.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5812a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f217759a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f217760b;

            /* JADX INFO: renamed from: xa0.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5813a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f217761d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f217762e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f217763f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f217765h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f217766j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f217767k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f217768l;

                public C5813a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f217761d = obj;
                    this.f217762e |= PKIFailureInfo.systemUnavail;
                    return C5812a.this.F(null, this);
                }
            }

            public C5812a(mu.h hVar, j jVar) {
                this.f217759a = hVar;
                this.f217760b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5813a c5813a;
                if (eVar instanceof C5813a) {
                    c5813a = (C5813a) eVar;
                    int i15 = c5813a.f217762e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5813a.f217762e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5813a = new C5813a(eVar);
                    }
                } else {
                    c5813a = new C5813a(eVar);
                }
                Object obj2 = c5813a.f217761d;
                Object objE = uq.b.e();
                int i16 = c5813a.f217762e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f217759a;
                    xa0.c.Data dataJ9 = this.f217760b.j9((State) obj);
                    c5813a.f217763f = vq.j.a(obj);
                    c5813a.f217765h = vq.j.a(c5813a);
                    c5813a.f217766j = vq.j.a(obj);
                    c5813a.f217767k = vq.j.a(hVar);
                    c5813a.f217768l = 0;
                    c5813a.f217762e = 1;
                    if (hVar.F(dataJ9, c5813a) == objE) {
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

        public a(mu.g gVar, j jVar) {
            this.f217757a = gVar;
            this.f217758b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super xa0.c.Data> hVar, tq.e eVar) {
            Object objA = this.f217757a.a(new C5812a(hVar, this.f217758b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxa0/a$c;", "<unused var>", "Lxa0/b;", "Loq/i0;", "<anonymous>", "(Lxa0/a$c;Lxa0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<xa0.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217769e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f217769e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<xa0.a> bVarY1 = j.this.Y1();
                xa0.a.c cVar = xa0.a.c.f217738a;
                this.f217769e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(xa0.a.c cVar, State state, tq.e<? super i0> eVar) {
            return j.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxa0/a$d;", "<unused var>", "Lxa0/b;", "Loq/i0;", "<anonymous>", "(Lxa0/a$d;Lxa0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<xa0.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217771e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f217771e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<xa0.a> bVarY1 = j.this.Y1();
                xa0.a.d dVar = xa0.a.d.f217739a;
                this.f217771e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(xa0.a.d dVar, State state, tq.e<? super i0> eVar) {
            return j.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxa0/a$a;", "<unused var>", "Lxa0/b;", "Loq/i0;", "<anonymous>", "(Lxa0/a$a;Lxa0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<xa0.a.C5811a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217773e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f217773e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<xa0.a> bVarY1 = j.this.Y1();
                xa0.a.C5811a c5811a = xa0.a.C5811a.f217736a;
                this.f217773e = 1;
                if (bVarY1.F(c5811a, this) == objE) {
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
        public final Object w(xa0.a.C5811a c5811a, State state, tq.e<? super i0> eVar) {
            return j.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxa0/a$b;", "<unused var>", "Lxa0/b;", "Loq/i0;", "<anonymous>", "(Lxa0/a$b;Lxa0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<xa0.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217775e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f217775e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<xa0.a> bVarY1 = j.this.Y1();
                xa0.a.b bVar = xa0.a.b.f217737a;
                this.f217775e = 1;
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
        public final Object w(xa0.a.b bVar, State state, tq.e<? super i0> eVar) {
            return j.this.new e(eVar).J(i0.f148189a);
        }
    }

    public j(yy.a aVar, ya0.d dVar, c54.b bVar) {
        this.mapper = dVar;
        State state = new State(bVar.a(b54.c.SCHOOL_INFO).booleanValue());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: xa0.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.l9(this.f217750a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xa0.c.Data j9(State state) {
        return this.mapper.b(new ya0.d.Params(state, b9(xa0.a.c.f217738a), b9(xa0.a.d.f217739a), b9(xa0.a.C5811a.f217736a), b9(xa0.a.b.f217737a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final j jVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: xa0.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.m9(this.f217751a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xa0.a.c.class), oVar, bVar);
        zVar.x(q0.c(xa0.a.d.class), oVar, jVar.new c(null));
        zVar.x(q0.c(xa0.a.C5811a.class), oVar, jVar.new d(null));
        zVar.x(q0.c(xa0.a.b.class), oVar, jVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<xa0.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<xa0.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}

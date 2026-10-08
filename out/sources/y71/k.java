package y71;

import er.q;
import fr.q0;
import i61.DataSplit;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00010B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Ly71/k;", "Ll00/g;", "Ly71/c;", "Ly71/a;", "Ly71/d;", "", "Lyy/a;", "stateMachineFactory", "Lz71/c;", "mapper", "Lz71/b;", "dialogMapper", "Ly71/b;", "setupData", "<init>", "(Lyy/a;Lz71/c;Lz71/b;Ly71/b;)V", "state", "Ly71/d$a;", "n9", "(Ly71/c;)Ly71/d$a;", "b", "Lz71/c;", "c", "Lz71/b;", "d", "Ly71/b;", "e", "Ly71/c;", "initialState", "Lxw/b;", "Ly71/a$b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "j", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, a> implements y71.d, zx.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f225238k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z71.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z71.b dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<State, a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<y71.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<y71.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f225246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f225247b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f225248a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f225249b;

            /* JADX INFO: renamed from: y71.k$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6034a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f225250d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f225251e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f225252f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f225254h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f225255j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f225256k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f225257l;

                public C6034a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f225250d = obj;
                    this.f225251e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, k kVar) {
                this.f225248a = hVar;
                this.f225249b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6034a c6034a;
                if (eVar instanceof C6034a) {
                    c6034a = (C6034a) eVar;
                    int i15 = c6034a.f225251e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6034a.f225251e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6034a = new C6034a(eVar);
                    }
                } else {
                    c6034a = new C6034a(eVar);
                }
                Object obj2 = c6034a.f225250d;
                Object objE = uq.b.e();
                int i16 = c6034a.f225251e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f225248a;
                    y71.d.Data dataN9 = this.f225249b.n9((State) obj);
                    c6034a.f225252f = vq.j.a(obj);
                    c6034a.f225254h = vq.j.a(c6034a);
                    c6034a.f225255j = vq.j.a(obj);
                    c6034a.f225256k = vq.j.a(hVar);
                    c6034a.f225257l = 0;
                    c6034a.f225251e = 1;
                    if (hVar.F(dataN9, c6034a) == objE) {
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

        public b(mu.g gVar, k kVar) {
            this.f225246a = gVar;
            this.f225247b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super y71.d.Data> hVar, tq.e eVar) {
            Object objA = this.f225246a.a(new a(hVar, this.f225247b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly71/a$b;", "action", "Ly71/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly71/a$b;Ly71/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f225259f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.b bVar = (a.b) this.f225259f;
            Object objE = uq.b.e();
            int i15 = this.f225258e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a.b> bVarY1 = k.this.Y1();
                this.f225259f = vq.j.a(bVar);
                this.f225258e = 1;
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
        public final Object w(a.b bVar, State state, tq.e<? super i0> eVar) {
            c cVar = k.this.new c(eVar);
            cVar.f225259f = bVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly71/a$a;", "<unused var>", "Lk10/c0;", "Ly71/c;", "state", "Lk10/l;", "<anonymous>", "(Ly71/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<a.C6031a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f225262f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, state.getModifiedBottomLine().f(1), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f225262f;
            uq.b.e();
            if (this.f225261e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Object objA = c0Var.a();
            k kVar = k.this;
            if (((State) objA).getModifiedBottomLine().q() > 1) {
                return c0Var.b(new er.l() { // from class: y71.l
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return k.d.O((State) obj2);
                    }
                });
            }
            kVar.d9(new a.b.ShowDialog(kVar.dialogMapper.f()));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.C6031a c6031a, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = k.this.new d(eVar);
            dVar.f225262f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly71/a$c;", "<unused var>", "Lk10/c0;", "Ly71/c;", "state", "Lk10/l;", "<anonymous>", "(Ly71/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<a.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f225265f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, state.getModifiedBottomLine().b(state.getOriginalBottomLine().i(state.getModifiedBottomLine().q())), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f225265f;
            uq.b.e();
            if (this.f225264e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Object objA = c0Var.a();
            k kVar = k.this;
            State state = (State) objA;
            if (state.getModifiedBottomLine().q() < state.getOriginalBottomLine().q()) {
                return c0Var.b(new er.l() { // from class: y71.m
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return k.e.O((State) obj2);
                    }
                });
            }
            kVar.d9(new a.b.ShowDialog(kVar.dialogMapper.e()));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = k.this.new e(eVar);
            eVar2.f225265f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly71/a$d;", "<unused var>", "Ly71/c;", "state", "Loq/i0;", "<anonymous>", "(Ly71/a$d;Ly71/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f225268f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f225268f;
            Object objE = uq.b.e();
            int i15 = this.f225267e;
            if (i15 == 0) {
                u.b(obj);
                k.this.setupData.getContract().I7(state.getSplitType(), new DataSplit(state.getTopLine(), state.getModifiedBottomLine()));
                k kVar = k.this;
                a.b.c cVar = a.b.c.f225208a;
                this.f225268f = vq.j.a(state);
                this.f225267e = 1;
                if (kVar.F(cVar, this) == objE) {
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
        public final Object w(a.d dVar, State state, tq.e<? super i0> eVar) {
            f fVar = k.this.new f(eVar);
            fVar.f225268f = state;
            return fVar.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, z71.c cVar, z71.b bVar, SetupData setupData) {
        this.mapper = cVar;
        this.dialogMapper = bVar;
        this.setupData = setupData;
        State state = new State(setupData.getSplitType(), setupData.getDataSplit().getFirstLine(), setupData.getDataSplit().getSecondLine(), setupData.getDataSplit().getSecondLine());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: y71.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.p9(this.f225236a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y71.d.Data n9(State state) {
        return this.mapper.b(new z71.c.Params(state, b9(a.C6031a.f225205a), b9(a.c.f225210a), b9(a.d.f225211a), b9(a.b.C6032a.f225206a), b9(a.b.C6033b.f225207a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: y71.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.q9(this.f225235a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(k kVar, z zVar) {
        c cVar = kVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.b.class), oVar, cVar);
        zVar.v(q0.c(a.C6031a.class), oVar, kVar.new d(null));
        zVar.v(q0.c(a.c.class), oVar, kVar.new e(null));
        zVar.x(q0.c(a.d.class), oVar, kVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<y71.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}

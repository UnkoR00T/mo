package v41;

import fr.q0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lv41/p;", "Ll00/g;", "Lv41/e;", "", "Lv41/f;", "Lyy/a;", "stateMachineFactory", "Lx41/h;", "mapper", "Lq31/c;", "exitDialogMapper", "Lw41/a;", "contract", "<init>", "(Lyy/a;Lx41/h;Lq31/c;Lw41/a;)V", "Lv41/f$a;", "m9", "(Lv41/e;)Lv41/f$a;", "b", "Lx41/h;", "c", "Lq31/c;", "d", "Lw41/a;", "e", "Lv41/e;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lv41/c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x41.h mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w41.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v41.c> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f203824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f203825b;

        /* JADX INFO: renamed from: v41.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5306a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f203826a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f203827b;

            /* JADX INFO: renamed from: v41.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5307a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f203828d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f203829e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f203830f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f203832h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f203833j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f203834k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f203835l;

                public C5307a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f203828d = obj;
                    this.f203829e |= PKIFailureInfo.systemUnavail;
                    return C5306a.this.F(null, this);
                }
            }

            public C5306a(mu.h hVar, p pVar) {
                this.f203826a = hVar;
                this.f203827b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5307a c5307a;
                if (eVar instanceof C5307a) {
                    c5307a = (C5307a) eVar;
                    int i15 = c5307a.f203829e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5307a.f203829e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5307a = new C5307a(eVar);
                    }
                } else {
                    c5307a = new C5307a(eVar);
                }
                Object obj2 = c5307a.f203828d;
                Object objE = uq.b.e();
                int i16 = c5307a.f203829e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f203826a;
                    f.Data dataM9 = this.f203827b.m9((State) obj);
                    c5307a.f203830f = vq.j.a(obj);
                    c5307a.f203832h = vq.j.a(c5307a);
                    c5307a.f203833j = vq.j.a(obj);
                    c5307a.f203834k = vq.j.a(hVar);
                    c5307a.f203835l = 0;
                    c5307a.f203829e = 1;
                    if (hVar.F(dataM9, c5307a) == objE) {
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
            this.f203824a = gVar;
            this.f203825b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f203824a.a(new C5306a(hVar, this.f203825b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv41/d;", "<unused var>", "Lv41/e;", "Loq/i0;", "<anonymous>", "(Lv41/d;Lv41/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<v41.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203836e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f203838e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f203839f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f203839f = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f203838e;
                if (i15 == 0) {
                    u.b(obj);
                    xw.b<v41.c> bVarY1 = this.f203839f.Y1();
                    v41.c.b bVar = v41.c.b.f203798a;
                    this.f203838e = 1;
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

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f203839f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p pVar) {
            i00.a.a(pVar, new a(pVar, null));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f203836e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<v41.c> bVarY1 = p.this.Y1();
                q31.c cVar = p.this.exitDialogMapper;
                final p pVar = p.this;
                v41.c.ShowDialog showDialog = new v41.c.ShowDialog(cVar.b(new q31.c.Params(new er.a() { // from class: v41.q
                    @Override // er.a
                    public final Object a() {
                        return p.b.O(pVar);
                    }
                })));
                this.f203836e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(v41.d dVar, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv41/a;", "<unused var>", "Lv41/e;", "Loq/i0;", "<anonymous>", "(Lv41/a;Lv41/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<v41.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203840e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f203840e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<v41.c> bVarY1 = p.this.Y1();
                v41.c.a aVar = v41.c.a.f203797a;
                this.f203840e = 1;
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
        public final Object w(v41.a aVar, State state, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv41/b;", "action", "Lv41/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv41/b;Lv41/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<GoToNextScreen, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f203842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f203843f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f203844g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoToNextScreen goToNextScreen = (GoToNextScreen) this.f203844g;
            Object objE = uq.b.e();
            int i15 = this.f203843f;
            if (i15 == 0) {
                u.b(obj);
                bl0.d dVarA6 = p.this.contract.A6();
                p.this.contract.S2(goToNextScreen.getMaritalStatusType());
                if (dVarA6 != goToNextScreen.getMaritalStatusType()) {
                    p.this.contract.U1();
                }
                xw.b<v41.c> bVarY1 = p.this.Y1();
                v41.c.C5305c c5305c = v41.c.C5305c.f203799a;
                this.f203844g = vq.j.a(goToNextScreen);
                this.f203842e = vq.j.a(dVarA6);
                this.f203843f = 1;
                if (bVarY1.F(c5305c, this) == objE) {
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
        public final Object w(GoToNextScreen goToNextScreen, State state, tq.e<? super i0> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f203844g = goToNextScreen;
            return dVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, x41.h hVar, q31.c cVar, w41.a aVar2) {
        this.mapper = hVar;
        this.exitDialogMapper = cVar;
        this.contract = aVar2;
        State state = new State(aVar2.x());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: v41.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f203816a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data m9(State state) {
        return this.mapper.b(new x41.h.Params(state, new er.l() { // from class: v41.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.n9(this.f203815a, (bl0.d) obj);
            }
        }, b9(v41.d.f203801a), b9(v41.a.f203795a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(p pVar, bl0.d dVar) {
        pVar.d9(new GoToNextScreen(dVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: v41.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f203814a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(v41.d.class), oVar, bVar);
        zVar.x(q0.c(v41.a.class), oVar, pVar.new c(null));
        zVar.x(q0.c(GoToNextScreen.class), oVar, pVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<v41.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(w41.a aVar) {
        super.P5(aVar);
    }
}

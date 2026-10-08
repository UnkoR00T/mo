package dv3;

import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import mx.Label;
import o20.s2;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ldv3/g;", "Ll00/g;", "Ldv3/c;", "", "Ldv3/d;", "Lyy/a;", "stateMachineFactory", "Lev3/a;", "documentCardViewMapper", "Ljx/g;", "systemInfo", "Ldv3/q;", "rotationVMS", "Ldv3/a;", "currentTimeVMS", "Lbv3/a;", "vmsAdapter", "<init>", "(Lyy/a;Lev3/a;Ljx/g;Ldv3/q;Ldv3/a;Lbv3/a;)V", "state", "Ldv3/d$a;", "k9", "(Ldv3/c;)Ldv3/d$a;", "b", "Lev3/a;", "c", "Lbv3/a;", "d", "Ldv3/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "documentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g extends l00.g<State, Object> implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ev3.a documentCardViewMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bv3.a vmsAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0004\u0010\r¨\u0006\u000f"}, d2 = {"dv3/g$a", "Lo20/s2;", "Lmu/g;", "", "a", "Lmu/g;", "w", "()Lmu/g;", "rotation", "Lmu/p0;", "Lmx/a;", "b", "Lmu/p0;", "()Lmu/p0;", "currentTime", "documentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements s2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final mu.g<Float> rotation;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final p0<Label> currentTime;

        a(q qVar, g gVar, dv3.a aVar) {
            this.rotation = qVar.f();
            this.currentTime = gVar.a9(aVar.g(), aVar.f());
        }

        @Override // o20.s2
        public p0<Label> a() {
            return this.currentTime;
        }

        @Override // o20.s2
        public mu.g<Float> w() {
            return this.rotation;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f44701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f44702b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f44703a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f44704b;

            /* JADX INFO: renamed from: dv3.g$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1017a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f44705d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f44706e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f44707f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f44709h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f44710j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f44711k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f44712l;

                public C1017a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f44705d = obj;
                    this.f44706e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, g gVar) {
                this.f44703a = hVar;
                this.f44704b = gVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1017a c1017a;
                if (eVar instanceof C1017a) {
                    c1017a = (C1017a) eVar;
                    int i15 = c1017a.f44706e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1017a.f44706e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1017a = new C1017a(eVar);
                    }
                } else {
                    c1017a = new C1017a(eVar);
                }
                Object obj2 = c1017a.f44705d;
                Object objE = uq.b.e();
                int i16 = c1017a.f44706e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f44703a;
                    d.Data dataK9 = this.f44704b.k9((State) obj);
                    c1017a.f44707f = vq.j.a(obj);
                    c1017a.f44709h = vq.j.a(c1017a);
                    c1017a.f44710j = vq.j.a(obj);
                    c1017a.f44711k = vq.j.a(hVar);
                    c1017a.f44712l = 0;
                    c1017a.f44706e = 1;
                    if (hVar.F(dataK9, c1017a) == objE) {
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

        public b(mu.g gVar, g gVar2) {
            this.f44701a = gVar;
            this.f44702b = gVar2;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f44701a.a(new a(hVar, this.f44702b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldv3/b;", "<unused var>", "Lk10/c0;", "Ldv3/c;", "state", "Lk10/l;", "<anonymous>", "(Ldv3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<dv3.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44714f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(r rVar, State state) {
            return State.b(state, null, new r.Disabled(!((r.Disabled) rVar).getForceEnabled()), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f44714f;
            uq.b.e();
            if (this.f44713e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final r animationsState = ((State) c0Var.a()).getAnimationsState();
            if (fr.t.c(animationsState, r.b.f44728a)) {
                return c0Var.c();
            }
            if (animationsState instanceof r.Disabled) {
                return c0Var.b(new er.l() { // from class: dv3.h
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g.c.O(animationsState, (State) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dv3.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f44714f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    public g(yy.a aVar, ev3.a aVar2, jx.g gVar, q qVar, dv3.a aVar3, bv3.a aVar4) {
        r disabled;
        this.documentCardViewMapper = aVar2;
        this.vmsAdapter = aVar4;
        bv3.c setupData = aVar4.getSetupData();
        boolean zR = gVar.r();
        if (zR) {
            disabled = r.b.f44728a;
        } else {
            if (zR) {
                throw new oq.p();
            }
            disabled = new r.Disabled(false);
        }
        State state = new State(setupData, disabled, new a(qVar, this, aVar3));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: dv3.f
            @Override // er.l
            public final Object b(Object obj) {
                return g.l9((v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data k9(State state) {
        return this.documentCardViewMapper.b(new ev3.a.Params(state, b9(dv3.b.f44689a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: dv3.e
            @Override // er.l
            public final Object b(Object obj) {
                return g.m9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(z zVar) {
        c cVar = new c(null);
        zVar.v(q0.c(dv3.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }
}

package ai1;

import ch1.h0;
import fr.q0;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lai1/m;", "Ll00/g;", "Lai1/e;", "", "Lai1/f;", "Lch1/h0;", "isQualifiedSignatureFeatureFlagActiveUC", "Lyy/a;", "stateMachineFactory", "Lbi1/a;", "scannerScreenMapper", "<init>", "(Lch1/h0;Lyy/a;Lbi1/a;)V", "state", "Lai1/f$a;", "l9", "(Lai1/e;)Lai1/f$a;", "b", "Lch1/h0;", "c", "Lbi1/a;", "d", "Lai1/e;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lai1/a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h0 isQualifiedSignatureFeatureFlagActiveUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bi1.a scannerScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ai1.a> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f6401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f6402b;

        /* JADX INFO: renamed from: ai1.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0135a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f6403a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f6404b;

            /* JADX INFO: renamed from: ai1.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0136a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f6405d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f6406e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f6407f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f6409h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f6410j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f6411k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f6412l;

                public C0136a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f6405d = obj;
                    this.f6406e |= PKIFailureInfo.systemUnavail;
                    return C0135a.this.F(null, this);
                }
            }

            public C0135a(mu.h hVar, m mVar) {
                this.f6403a = hVar;
                this.f6404b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0136a c0136a;
                if (eVar instanceof C0136a) {
                    c0136a = (C0136a) eVar;
                    int i15 = c0136a.f6406e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0136a.f6406e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0136a = new C0136a(eVar);
                    }
                } else {
                    c0136a = new C0136a(eVar);
                }
                Object obj2 = c0136a.f6405d;
                Object objE = uq.b.e();
                int i16 = c0136a.f6406e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f6403a;
                    f.Data dataL9 = this.f6404b.l9((State) obj);
                    c0136a.f6407f = vq.j.a(obj);
                    c0136a.f6409h = vq.j.a(c0136a);
                    c0136a.f6410j = vq.j.a(obj);
                    c0136a.f6411k = vq.j.a(hVar);
                    c0136a.f6412l = 0;
                    c0136a.f6406e = 1;
                    if (hVar.F(dataL9, c0136a) == objE) {
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
            this.f6401a = gVar;
            this.f6402b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f6401a.a(new C0135a(hVar, this.f6402b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lai1/e;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6414f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(m mVar, State state) {
            return state.a(mVar.isQualifiedSignatureFeatureFlagActiveUC.b(gz.b.a.C1792a.f78542a).booleanValue());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f6414f;
            uq.b.e();
            if (this.f6413e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final m mVar = m.this;
            return c0Var.b(new er.l() { // from class: ai1.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.b.O(mVar, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f6414f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lai1/c;", "<unused var>", "Lai1/e;", "Loq/i0;", "<anonymous>", "(Lai1/c;Lai1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ai1.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6416e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f6416e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                ai1.a.b bVar = ai1.a.b.f6377a;
                this.f6416e = 1;
                if (mVar.F(bVar, this) == objE) {
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
        public final Object w(ai1.c cVar, State state, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lai1/b;", "<unused var>", "Lai1/e;", "Loq/i0;", "<anonymous>", "(Lai1/b;Lai1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ai1.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6418e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f6418e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                ai1.a.C0134a c0134a = ai1.a.C0134a.f6376a;
                this.f6418e = 1;
                if (mVar.F(c0134a, this) == objE) {
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
        public final Object w(ai1.b bVar, State state, tq.e<? super i0> eVar) {
            return m.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lai1/d;", "<unused var>", "Lai1/e;", "Loq/i0;", "<anonymous>", "(Lai1/d;Lai1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ai1.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6420e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f6420e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                ai1.a.c cVar = ai1.a.c.f6378a;
                this.f6420e = 1;
                if (mVar.F(cVar, this) == objE) {
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
        public final Object w(ai1.d dVar, State state, tq.e<? super i0> eVar) {
            return m.this.new e(eVar).J(i0.f148189a);
        }
    }

    public m(h0 h0Var, yy.a aVar, bi1.a aVar2) {
        this.isQualifiedSignatureFeatureFlagActiveUC = h0Var;
        this.scannerScreenMapper = aVar2;
        State state = new State(false);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ai1.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.n9(this.f6393a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data l9(State state) {
        return this.scannerScreenMapper.b(new bi1.a.Params(state, b9(ai1.c.f6380a), b9(ai1.b.f6379a), b9(ai1.d.f6381a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ai1.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f6394a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(m mVar, z zVar) {
        zVar.A(mVar.new b(null));
        c cVar = mVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ai1.c.class), oVar, cVar);
        zVar.x(q0.c(ai1.b.class), oVar, mVar.new d(null));
        zVar.x(q0.c(ai1.d.class), oVar, mVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ai1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ai1.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}

package nq1;

import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00128\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lnq1/z;", "Ll00/g;", "Lnq1/u;", "Lnq1/t;", "Lnq1/v;", "", "Lyy/a;", "stateMachineFactory", "Lnq1/s;", "mapper", "<init>", "(Lyy/a;Lnq1/s;)V", "state", "Lnq1/v$a;", "k9", "(Lnq1/u;)Lnq1/v$a;", "b", "Lnq1/s;", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lnq1/t$h;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<State, t> implements v, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, t> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<v.Data> state = a9(new a(e9().getState(), this), k9(new State(null, null, null, null, null, null, 63, null)));

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<t.h> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<v.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f137780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f137781b;

        /* JADX INFO: renamed from: nq1.z$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3398a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f137782a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f137783b;

            /* JADX INFO: renamed from: nq1.z$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3399a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f137784d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f137785e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f137786f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f137788h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f137789j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f137790k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f137791l;

                public C3399a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f137784d = obj;
                    this.f137785e |= PKIFailureInfo.systemUnavail;
                    return C3398a.this.F(null, this);
                }
            }

            public C3398a(mu.h hVar, z zVar) {
                this.f137782a = hVar;
                this.f137783b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3399a c3399a;
                if (eVar instanceof C3399a) {
                    c3399a = (C3399a) eVar;
                    int i15 = c3399a.f137785e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3399a.f137785e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3399a = new C3399a(eVar);
                    }
                } else {
                    c3399a = new C3399a(eVar);
                }
                Object obj2 = c3399a.f137784d;
                Object objE = uq.b.e();
                int i16 = c3399a.f137785e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f137782a;
                    v.Data dataK9 = this.f137783b.k9((State) obj);
                    c3399a.f137786f = vq.j.a(obj);
                    c3399a.f137788h = vq.j.a(c3399a);
                    c3399a.f137789j = vq.j.a(obj);
                    c3399a.f137790k = vq.j.a(hVar);
                    c3399a.f137791l = 0;
                    c3399a.f137785e = 1;
                    if (hVar.F(dataK9, c3399a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, z zVar) {
            this.f137780a = gVar;
            this.f137781b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super v.Data> hVar, tq.e eVar) {
            Object objA = this.f137780a.a(new C3398a(hVar, this.f137781b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnq1/t$a;", "<unused var>", "Lnq1/u;", "Loq/i0;", "<anonymous>", "(Lnq1/t$a;Lnq1/u;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<t.a, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137792e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137792e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<t.h> bVarY1 = z.this.Y1();
                t.h.a aVar = t.h.a.f137764a;
                this.f137792e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t.a aVar, State state, tq.e<? super oq.i0> eVar) {
            return z.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnq1/t$f;", "action", "Lk10/c0;", "Lnq1/u;", "state", "Lk10/l;", "<anonymous>", "(Lnq1/t$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<t.MutateDefaultSelectedIndex, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137795f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f137796g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(t.MutateDefaultSelectedIndex mutateDefaultSelectedIndex, State state) {
            return State.b(state, Integer.valueOf(mutateDefaultSelectedIndex.getIndex()), null, null, null, null, null, 62, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final t.MutateDefaultSelectedIndex mutateDefaultSelectedIndex = (t.MutateDefaultSelectedIndex) this.f137795f;
            k10.c0 c0Var = (k10.c0) this.f137796g;
            uq.b.e();
            if (this.f137794e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nq1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.c.O(mutateDefaultSelectedIndex, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t.MutateDefaultSelectedIndex mutateDefaultSelectedIndex, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f137795f = mutateDefaultSelectedIndex;
            cVar.f137796g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnq1/t$g;", "action", "Lk10/c0;", "Lnq1/u;", "state", "Lk10/l;", "<anonymous>", "(Lnq1/t$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<t.MutateDefaultWithOptionalsSelectedIndex, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f137799g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(t.MutateDefaultWithOptionalsSelectedIndex mutateDefaultWithOptionalsSelectedIndex, State state) {
            return State.b(state, null, Integer.valueOf(mutateDefaultWithOptionalsSelectedIndex.getIndex()), null, null, null, null, 61, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final t.MutateDefaultWithOptionalsSelectedIndex mutateDefaultWithOptionalsSelectedIndex = (t.MutateDefaultWithOptionalsSelectedIndex) this.f137798f;
            k10.c0 c0Var = (k10.c0) this.f137799g;
            uq.b.e();
            if (this.f137797e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nq1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.d.O(mutateDefaultWithOptionalsSelectedIndex, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t.MutateDefaultWithOptionalsSelectedIndex mutateDefaultWithOptionalsSelectedIndex, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f137798f = mutateDefaultWithOptionalsSelectedIndex;
            dVar.f137799g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnq1/t$e;", "action", "Lk10/c0;", "Lnq1/u;", "state", "Lk10/l;", "<anonymous>", "(Lnq1/t$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<t.MutateDefaultErrorSelectedIndex, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137801f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f137802g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(t.MutateDefaultErrorSelectedIndex mutateDefaultErrorSelectedIndex, State state) {
            return State.b(state, null, null, Integer.valueOf(mutateDefaultErrorSelectedIndex.getIndex()), null, null, null, 59, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final t.MutateDefaultErrorSelectedIndex mutateDefaultErrorSelectedIndex = (t.MutateDefaultErrorSelectedIndex) this.f137801f;
            k10.c0 c0Var = (k10.c0) this.f137802g;
            uq.b.e();
            if (this.f137800e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nq1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.e.O(mutateDefaultErrorSelectedIndex, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t.MutateDefaultErrorSelectedIndex mutateDefaultErrorSelectedIndex, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f137801f = mutateDefaultErrorSelectedIndex;
            eVar2.f137802g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnq1/t$c;", "action", "Lk10/c0;", "Lnq1/u;", "state", "Lk10/l;", "<anonymous>", "(Lnq1/t$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<t.MutateContentBoxSelectedIndex, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f137805g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(t.MutateContentBoxSelectedIndex mutateContentBoxSelectedIndex, State state) {
            return State.b(state, null, null, null, Integer.valueOf(mutateContentBoxSelectedIndex.getIndex()), null, null, 55, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final t.MutateContentBoxSelectedIndex mutateContentBoxSelectedIndex = (t.MutateContentBoxSelectedIndex) this.f137804f;
            k10.c0 c0Var = (k10.c0) this.f137805g;
            uq.b.e();
            if (this.f137803e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nq1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.f.O(mutateContentBoxSelectedIndex, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t.MutateContentBoxSelectedIndex mutateContentBoxSelectedIndex, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f137804f = mutateContentBoxSelectedIndex;
            fVar.f137805g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnq1/t$d;", "action", "Lk10/c0;", "Lnq1/u;", "state", "Lk10/l;", "<anonymous>", "(Lnq1/t$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<t.MutateContentBoxWithOptionalsSelectedIndex, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f137808g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(t.MutateContentBoxWithOptionalsSelectedIndex mutateContentBoxWithOptionalsSelectedIndex, State state) {
            return State.b(state, null, null, null, null, Integer.valueOf(mutateContentBoxWithOptionalsSelectedIndex.getIndex()), null, 47, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final t.MutateContentBoxWithOptionalsSelectedIndex mutateContentBoxWithOptionalsSelectedIndex = (t.MutateContentBoxWithOptionalsSelectedIndex) this.f137807f;
            k10.c0 c0Var = (k10.c0) this.f137808g;
            uq.b.e();
            if (this.f137806e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nq1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.g.O(mutateContentBoxWithOptionalsSelectedIndex, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t.MutateContentBoxWithOptionalsSelectedIndex mutateContentBoxWithOptionalsSelectedIndex, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f137807f = mutateContentBoxWithOptionalsSelectedIndex;
            gVar.f137808g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnq1/t$b;", "action", "Lk10/c0;", "Lnq1/u;", "state", "Lk10/l;", "<anonymous>", "(Lnq1/t$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<t.MutateContentBoxErrorSelectedIndex, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f137811g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(t.MutateContentBoxErrorSelectedIndex mutateContentBoxErrorSelectedIndex, State state) {
            return State.b(state, null, null, null, null, null, Integer.valueOf(mutateContentBoxErrorSelectedIndex.getIndex()), 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final t.MutateContentBoxErrorSelectedIndex mutateContentBoxErrorSelectedIndex = (t.MutateContentBoxErrorSelectedIndex) this.f137810f;
            k10.c0 c0Var = (k10.c0) this.f137811g;
            uq.b.e();
            if (this.f137809e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nq1.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.h.O(mutateContentBoxErrorSelectedIndex, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t.MutateContentBoxErrorSelectedIndex mutateContentBoxErrorSelectedIndex, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f137810f = mutateContentBoxErrorSelectedIndex;
            hVar.f137811g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    public z(yy.a aVar, s sVar) {
        this.mapper = sVar;
        this.stateMachine = aVar.a(new State(null, null, null, null, null, null, 63, null), new er.l() { // from class: nq1.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.n9(this.f137773a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v.Data k9(State state) {
        return this.mapper.b(new s.Params(state, new er.l() { // from class: nq1.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.l9(this.f137774a, (t) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l9(z zVar, t tVar) {
        zVar.d9(tVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: nq1.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.o9(this.f137775a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o9(z zVar, k10.z zVar2) {
        b bVar = zVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(t.a.class), oVar, bVar);
        zVar2.v(q0.c(t.MutateDefaultSelectedIndex.class), oVar, new c(null));
        zVar2.v(q0.c(t.MutateDefaultWithOptionalsSelectedIndex.class), oVar, new d(null));
        zVar2.v(q0.c(t.MutateDefaultErrorSelectedIndex.class), oVar, new e(null));
        zVar2.v(q0.c(t.MutateContentBoxSelectedIndex.class), oVar, new f(null));
        zVar2.v(q0.c(t.MutateContentBoxWithOptionalsSelectedIndex.class), oVar, new g(null));
        zVar2.v(q0.c(t.MutateContentBoxErrorSelectedIndex.class), oVar, new h(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<t.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, t> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<v.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(v.Data data) {
        super.P5(data);
    }
}

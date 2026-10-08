package i83;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Li83/o;", "Ll00/g;", "Li83/f;", "", "Li83/g;", "Lyy/a;", "stateMachineFactory", "Lj83/a;", "welcomeScreenMapper", "Lk83/a;", "activationProcessType", "<init>", "(Lyy/a;Lj83/a;Lk83/a;)V", "state", "Li83/g$a;", "j9", "(Li83/f;)Li83/g$a;", "b", "Lj83/a;", "c", "Lk83/a;", "d", "Li83/f;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Li83/d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j83.a welcomeScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k83.a activationProcessType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i83.d> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f90302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f90303b;

        /* JADX INFO: renamed from: i83.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2139a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f90304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f90305b;

            /* JADX INFO: renamed from: i83.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2140a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f90306d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f90307e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f90308f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f90310h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f90311j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f90312k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f90313l;

                public C2140a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f90306d = obj;
                    this.f90307e |= PKIFailureInfo.systemUnavail;
                    return C2139a.this.F(null, this);
                }
            }

            public C2139a(mu.h hVar, o oVar) {
                this.f90304a = hVar;
                this.f90305b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2140a c2140a;
                if (eVar instanceof C2140a) {
                    c2140a = (C2140a) eVar;
                    int i15 = c2140a.f90307e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2140a.f90307e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2140a = new C2140a(eVar);
                    }
                } else {
                    c2140a = new C2140a(eVar);
                }
                Object obj2 = c2140a.f90306d;
                Object objE = uq.b.e();
                int i16 = c2140a.f90307e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f90304a;
                    g.Data dataJ9 = this.f90305b.j9((State) obj);
                    c2140a.f90308f = vq.j.a(obj);
                    c2140a.f90310h = vq.j.a(c2140a);
                    c2140a.f90311j = vq.j.a(obj);
                    c2140a.f90312k = vq.j.a(hVar);
                    c2140a.f90313l = 0;
                    c2140a.f90307e = 1;
                    if (hVar.F(dataJ9, c2140a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f90302a = gVar;
            this.f90303b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f90302a.a(new C2139a(hVar, this.f90303b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li83/a;", "<unused var>", "Li83/f;", "Loq/i0;", "<anonymous>", "(Li83/a;Li83/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<i83.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90314e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f90314e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i83.d> bVarY1 = o.this.Y1();
                i83.d.a aVar = i83.d.a.f90276a;
                this.f90314e = 1;
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
        public final Object w(i83.a aVar, State state, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li83/b;", "<unused var>", "Li83/f;", "Loq/i0;", "<anonymous>", "(Li83/b;Li83/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<i83.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90316e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f90316e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i83.d> bVarY1 = o.this.Y1();
                i83.d.b bVar = i83.d.b.f90277a;
                this.f90316e = 1;
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
        public final Object w(i83.b bVar, State state, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li83/e;", "<unused var>", "Li83/f;", "Loq/i0;", "<anonymous>", "(Li83/e;Li83/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<i83.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90318e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f90318e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i83.d> bVarY1 = o.this.Y1();
                i83.d.C2138d c2138d = i83.d.C2138d.f90279a;
                this.f90318e = 1;
                if (bVarY1.F(c2138d, this) == objE) {
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
        public final Object w(i83.e eVar, State state, tq.e<? super i0> eVar2) {
            return o.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li83/c;", "<unused var>", "Li83/f;", "Loq/i0;", "<anonymous>", "(Li83/c;Li83/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<i83.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90320e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f90320e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i83.d> bVarY1 = o.this.Y1();
                i83.d.c cVar = i83.d.c.f90278a;
                this.f90320e = 1;
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
        public final Object w(i83.c cVar, State state, tq.e<? super i0> eVar) {
            return o.this.new e(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, j83.a aVar2, k83.a aVar3) {
        this.welcomeScreenMapper = aVar2;
        this.activationProcessType = aVar3;
        State state = new State(aVar3);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: i83.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.l9(this.f90295a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data j9(State state) {
        return this.welcomeScreenMapper.b(new j83.a.Params(state, b9(i83.b.f90274a), b9(i83.a.f90273a), b9(i83.e.f90280a), b9(i83.c.f90275a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final o oVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: i83.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.m9(this.f90294a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(i83.a.class), oVar2, bVar);
        zVar.x(q0.c(i83.b.class), oVar2, oVar.new c(null));
        zVar.x(q0.c(i83.e.class), oVar2, oVar.new d(null));
        zVar.x(q0.c(i83.c.class), oVar2, oVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<i83.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(k83.a aVar) {
        super.P5(aVar);
    }
}

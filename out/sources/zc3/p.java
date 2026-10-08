package zc3;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lzc3/p;", "Ll00/g;", "Lzc3/g;", "", "Lzc3/h;", "Lyy/a;", "stateMachineFactory", "Lad3/b;", "screenMapper", "Lzc3/f;", "setupData", "<init>", "(Lyy/a;Lad3/b;Lzc3/f;)V", "Lzc3/h$a;", "k9", "(Lzc3/g;)Lzc3/h$a;", "b", "Lad3/b;", "c", "Lzc3/f;", "d", "Lzc3/g;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lzc3/d;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ad3.b screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f234291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f234292b;

        /* JADX INFO: renamed from: zc3.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6311a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f234293a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f234294b;

            /* JADX INFO: renamed from: zc3.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6312a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f234295d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f234296e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f234297f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f234299h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f234300j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f234301k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f234302l;

                public C6312a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f234295d = obj;
                    this.f234296e |= PKIFailureInfo.systemUnavail;
                    return C6311a.this.F(null, this);
                }
            }

            public C6311a(mu.h hVar, p pVar) {
                this.f234293a = hVar;
                this.f234294b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6312a c6312a;
                if (eVar instanceof C6312a) {
                    c6312a = (C6312a) eVar;
                    int i15 = c6312a.f234296e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6312a.f234296e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6312a = new C6312a(eVar);
                    }
                } else {
                    c6312a = new C6312a(eVar);
                }
                Object obj2 = c6312a.f234295d;
                Object objE = uq.b.e();
                int i16 = c6312a.f234296e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f234293a;
                    h.Data dataK9 = this.f234294b.k9((State) obj);
                    c6312a.f234297f = vq.j.a(obj);
                    c6312a.f234299h = vq.j.a(c6312a);
                    c6312a.f234300j = vq.j.a(obj);
                    c6312a.f234301k = vq.j.a(hVar);
                    c6312a.f234302l = 0;
                    c6312a.f234296e = 1;
                    if (hVar.F(dataK9, c6312a) == objE) {
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
            this.f234291a = gVar;
            this.f234292b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f234291a.a(new C6311a(hVar, this.f234292b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzc3/c;", "<unused var>", "Lzc3/g;", "Loq/i0;", "<anonymous>", "(Lzc3/c;Lzc3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<zc3.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234303e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f234303e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                d.a aVar = d.a.f234263a;
                this.f234303e = 1;
                if (pVar.F(aVar, this) == objE) {
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
        public final Object w(zc3.c cVar, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzc3/e;", "<unused var>", "Lzc3/g;", "state", "Loq/i0;", "<anonymous>", "(Lzc3/e;Lzc3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234306f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f234306f;
            Object objE = uq.b.e();
            int i15 = this.f234305e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                d.ToPassportInvalidation toPassportInvalidation = new d.ToPassportInvalidation(state.getData().getPassport().getNumber());
                this.f234306f = vq.j.a(state);
                this.f234305e = 1;
                if (pVar.F(toPassportInvalidation, this) == objE) {
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
        public final Object w(e eVar, State state, tq.e<? super i0> eVar2) {
            c cVar = p.this.new c(eVar2);
            cVar.f234306f = state;
            return cVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ad3.b bVar, SetupData setupData) {
        this.screenMapper = bVar;
        this.setupData = setupData;
        State state = new State(setupData);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: zc3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.m9(this.f234284a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data k9(State state) {
        return this.screenMapper.b(new ad3.b.Params(state, b9(zc3.c.f234262a), b9(e.f234266a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: zc3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.n9(this.f234283a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(zc3.c.class), oVar, bVar);
        zVar.x(q0.c(e.class), oVar, pVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}

package ir2;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lir2/p;", "Ll00/g;", "Lir2/f;", "", "Lir2/g;", "Lyy/a;", "stateMachineFactory", "Lkr2/a;", "mapper", "Ljr2/a;", "contract", "<init>", "(Lyy/a;Lkr2/a;Ljr2/a;)V", "Lir2/g$a;", "j9", "(Lir2/f;)Lir2/g$a;", "b", "Lkr2/a;", "c", "Ljr2/a;", "d", "Lir2/f;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lir2/e;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kr2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jr2.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f96750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f96751b;

        /* JADX INFO: renamed from: ir2.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2259a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f96752a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f96753b;

            /* JADX INFO: renamed from: ir2.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2260a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f96754d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f96755e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f96756f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f96758h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f96759j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f96760k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f96761l;

                public C2260a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f96754d = obj;
                    this.f96755e |= PKIFailureInfo.systemUnavail;
                    return C2259a.this.F(null, this);
                }
            }

            public C2259a(mu.h hVar, p pVar) {
                this.f96752a = hVar;
                this.f96753b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2260a c2260a;
                if (eVar instanceof C2260a) {
                    c2260a = (C2260a) eVar;
                    int i15 = c2260a.f96755e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2260a.f96755e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2260a = new C2260a(eVar);
                    }
                } else {
                    c2260a = new C2260a(eVar);
                }
                Object obj2 = c2260a.f96754d;
                Object objE = uq.b.e();
                int i16 = c2260a.f96755e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f96752a;
                    g.Data dataJ9 = this.f96753b.j9((State) obj);
                    c2260a.f96756f = vq.j.a(obj);
                    c2260a.f96758h = vq.j.a(c2260a);
                    c2260a.f96759j = vq.j.a(obj);
                    c2260a.f96760k = vq.j.a(hVar);
                    c2260a.f96761l = 0;
                    c2260a.f96755e = 1;
                    if (hVar.F(dataJ9, c2260a) == objE) {
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
            this.f96750a = gVar;
            this.f96751b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f96750a.a(new C2259a(hVar, this.f96751b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lir2/d;", "<unused var>", "Lir2/f;", "Loq/i0;", "<anonymous>", "(Lir2/d;Lir2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96762e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f96762e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<e> bVarY1 = p.this.Y1();
                e.a aVar = e.a.f96727a;
                this.f96762e = 1;
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
        public final Object w(d dVar, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, kr2.a aVar2, jr2.a aVar3) {
        this.mapper = aVar2;
        this.contract = aVar3;
        State state = new State(aVar3.t4());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ir2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.l9(this.f96743a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data j9(State state) {
        return this.mapper.b(new kr2.a.Params(state, b9(d.f96726a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ir2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.m9(this.f96742a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.x(q0.c(d.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<e> Y1() {
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
    public /* bridge */ void P5(jr2.a aVar) {
        super.P5(aVar);
    }
}

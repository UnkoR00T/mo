package sl1;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ul1.ProhibitedAccessData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lsl1/l;", "Ll00/g;", "Lsl1/c;", "", "Lsl1/d;", "Lyy/a;", "stateMachineFactory", "Ltl1/a;", "mapper", "Lul1/a;", "data", "<init>", "(Lyy/a;Ltl1/a;Lul1/a;)V", "state", "Lsl1/d$a;", "k9", "(Lsl1/c;)Lsl1/d$a;", "b", "Ltl1/a;", "c", "Lul1/a;", "d", "Lsl1/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsl1/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tl1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ProhibitedAccessData data;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sl1.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f182190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f182191b;

        /* JADX INFO: renamed from: sl1.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4690a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f182192a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f182193b;

            /* JADX INFO: renamed from: sl1.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4691a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f182194d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f182195e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f182196f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f182198h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f182199j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f182200k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f182201l;

                public C4691a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f182194d = obj;
                    this.f182195e |= PKIFailureInfo.systemUnavail;
                    return C4690a.this.F(null, this);
                }
            }

            public C4690a(mu.h hVar, l lVar) {
                this.f182192a = hVar;
                this.f182193b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4691a c4691a;
                if (eVar instanceof C4691a) {
                    c4691a = (C4691a) eVar;
                    int i15 = c4691a.f182195e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4691a.f182195e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4691a = new C4691a(eVar);
                    }
                } else {
                    c4691a = new C4691a(eVar);
                }
                Object obj2 = c4691a.f182194d;
                Object objE = uq.b.e();
                int i16 = c4691a.f182195e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f182192a;
                    d.Data dataK9 = this.f182193b.k9((State) obj);
                    c4691a.f182196f = vq.j.a(obj);
                    c4691a.f182198h = vq.j.a(c4691a);
                    c4691a.f182199j = vq.j.a(obj);
                    c4691a.f182200k = vq.j.a(hVar);
                    c4691a.f182201l = 0;
                    c4691a.f182195e = 1;
                    if (hVar.F(dataK9, c4691a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f182190a = gVar;
            this.f182191b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f182190a.a(new C4690a(hVar, this.f182191b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsl1/b;", "<unused var>", "Lsl1/c;", "Loq/i0;", "<anonymous>", "(Lsl1/b;Lsl1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<sl1.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182202e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f182202e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                sl1.a.C4689a c4689a = sl1.a.C4689a.f182169a;
                this.f182202e = 1;
                if (lVar.F(c4689a, this) == objE) {
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
        public final Object w(sl1.b bVar, State state, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, tl1.a aVar2, ProhibitedAccessData prohibitedAccessData) {
        this.mapper = aVar2;
        this.data = prohibitedAccessData;
        State state = new State(prohibitedAccessData);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: sl1.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f182183a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data k9(State state) {
        return this.mapper.b(new tl1.a.Params(state, b9(sl1.b.f182170a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: sl1.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f182182a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(sl1.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sl1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(sl1.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ProhibitedAccessData prohibitedAccessData) {
        super.P5(prohibitedAccessData);
    }
}

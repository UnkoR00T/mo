package in3;

import er.q;
import f00.j0;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001*B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lin3/l;", "Ll00/g;", "Lin3/c;", "", "Lin3/d;", "Lyy/a;", "stateMachineFactory", "Ljn3/a;", "mapper", "Lin3/e;", "model", "<init>", "(Lyy/a;Ljn3/a;Lin3/e;)V", "state", "Lin3/d$a;", "j9", "(Lin3/c;)Lin3/d$a;", "b", "Ljn3/a;", "c", "Lin3/e;", "d", "Lin3/c;", "initialState", "Lxw/b;", "Lin3/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, Object> implements d, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jn3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e model;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<in3.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lin3/l$a;", "Lf00/j0;", "Lin3/e;", "Lin3/l;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<e, l> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f93584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f93585b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f93586a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f93587b;

            /* JADX INFO: renamed from: in3.l$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2212a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f93588d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f93589e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f93590f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f93592h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f93593j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f93594k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f93595l;

                public C2212a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f93588d = obj;
                    this.f93589e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, l lVar) {
                this.f93586a = hVar;
                this.f93587b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2212a c2212a;
                if (eVar instanceof C2212a) {
                    c2212a = (C2212a) eVar;
                    int i15 = c2212a.f93589e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2212a.f93589e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2212a = new C2212a(eVar);
                    }
                } else {
                    c2212a = new C2212a(eVar);
                }
                Object obj2 = c2212a.f93588d;
                Object objE = uq.b.e();
                int i16 = c2212a.f93589e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f93586a;
                    d.Data dataJ9 = this.f93587b.j9((State) obj);
                    c2212a.f93590f = vq.j.a(obj);
                    c2212a.f93592h = vq.j.a(c2212a);
                    c2212a.f93593j = vq.j.a(obj);
                    c2212a.f93594k = vq.j.a(hVar);
                    c2212a.f93595l = 0;
                    c2212a.f93589e = 1;
                    if (hVar.F(dataJ9, c2212a) == objE) {
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

        public b(mu.g gVar, l lVar) {
            this.f93584a = gVar;
            this.f93585b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f93584a.a(new a(hVar, this.f93585b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lin3/a;", "<unused var>", "Lin3/c;", "Loq/i0;", "<anonymous>", "(Lin3/a;Lin3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<in3.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93596e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f93596e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<in3.b> bVarY1 = l.this.Y1();
                in3.b.a aVar = in3.b.a.f93564a;
                this.f93596e = 1;
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
        public final Object w(in3.a aVar, State state, tq.e<? super i0> eVar) {
            return l.this.new c(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, jn3.a aVar2, e eVar) {
        this.mapper = aVar2;
        this.model = eVar;
        State state = new State(eVar.a());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: in3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.l9(this.f93577a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data j9(State state) {
        return this.mapper.b(new jn3.a.Params(state, b9(in3.a.f93563a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: in3.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f93576a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, z zVar) {
        c cVar = lVar.new c(null);
        zVar.x(q0.c(in3.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<in3.b> Y1() {
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
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(d.Data data) {
        super.P5(data);
    }
}

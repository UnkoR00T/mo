package qq1;

import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lqq1/k;", "Ll00/g;", "Lqq1/c;", "", "Lqq1/d;", "Lyy/a;", "stateMachineFactory", "Lrq1/k;", "mapper", "<init>", "(Lyy/a;Lrq1/k;)V", "state", "Lqq1/d$a;", "j9", "(Lqq1/c;)Lqq1/d$a;", "b", "Lrq1/k;", "Lxw/b;", "Lqq1/b;", "c", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "d", "Lqq1/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rq1.k mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qq1.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f168087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f168088b;

        /* JADX INFO: renamed from: qq1.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4245a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f168089a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f168090b;

            /* JADX INFO: renamed from: qq1.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4246a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f168091d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f168092e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f168093f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f168095h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f168096j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f168097k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f168098l;

                public C4246a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f168091d = obj;
                    this.f168092e |= PKIFailureInfo.systemUnavail;
                    return C4245a.this.F(null, this);
                }
            }

            public C4245a(mu.h hVar, k kVar) {
                this.f168089a = hVar;
                this.f168090b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4246a c4246a;
                if (eVar instanceof C4246a) {
                    c4246a = (C4246a) eVar;
                    int i15 = c4246a.f168092e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4246a.f168092e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4246a = new C4246a(eVar);
                    }
                } else {
                    c4246a = new C4246a(eVar);
                }
                Object obj2 = c4246a.f168091d;
                Object objE = uq.b.e();
                int i16 = c4246a.f168092e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f168089a;
                    d.Data dataJ9 = this.f168090b.j9((State) obj);
                    c4246a.f168093f = vq.j.a(obj);
                    c4246a.f168095h = vq.j.a(c4246a);
                    c4246a.f168096j = vq.j.a(obj);
                    c4246a.f168097k = vq.j.a(hVar);
                    c4246a.f168098l = 0;
                    c4246a.f168092e = 1;
                    if (hVar.F(dataJ9, c4246a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f168087a = gVar;
            this.f168088b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f168087a.a(new C4245a(hVar, this.f168088b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqq1/a;", "<unused var>", "Lqq1/c;", "Loq/i0;", "<anonymous>", "(Lqq1/a;Lqq1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<qq1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168099e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f168099e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<qq1.b> bVarY1 = k.this.Y1();
                qq1.b.a aVar = qq1.b.a.f168069a;
                this.f168099e = 1;
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
        public final Object w(qq1.a aVar, State state, tq.e<? super i0> eVar) {
            return k.this.new b(eVar).J(i0.f148189a);
        }
    }

    public k(yy.a aVar, rq1.k kVar) {
        this.mapper = kVar;
        State state = new State(v.k1(sq1.a.e()));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: qq1.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.l9(this.f168080a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data j9(State state) {
        return this.mapper.b(new rq1.k.Params(state, b9(qq1.a.f168068a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final k kVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: qq1.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.m9(this.f168081a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        zVar.x(q0.c(qq1.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<qq1.b> Y1() {
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
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}

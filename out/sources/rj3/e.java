package rj3;

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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lrj3/e;", "Ll00/g;", "Lrj3/k;", "", "Lrj3/l;", "Lsj3/a;", "vehicleHistoryNoDataMapper", "Ltj3/b;", "noDataPayload", "Lyy/a;", "stateMachineFactory", "<init>", "(Lsj3/a;Ltj3/b;Lyy/a;)V", "state", "Lrj3/l$a;", "j9", "(Lrj3/k;)Lrj3/l$a;", "b", "Lsj3/a;", "c", "Ltj3/b;", "d", "Lrj3/k;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lrj3/j;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends l00.g<State, Object> implements l, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sj3.a vehicleHistoryNoDataMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tj3.b noDataPayload;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<j> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<l.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<l.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f174645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f174646b;

        /* JADX INFO: renamed from: rj3.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4452a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f174647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f174648b;

            /* JADX INFO: renamed from: rj3.e$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4453a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f174649d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f174650e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f174651f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f174653h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f174654j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f174655k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f174656l;

                public C4453a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f174649d = obj;
                    this.f174650e |= PKIFailureInfo.systemUnavail;
                    return C4452a.this.F(null, this);
                }
            }

            public C4452a(mu.h hVar, e eVar) {
                this.f174647a = hVar;
                this.f174648b = eVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4453a c4453a;
                if (eVar instanceof C4453a) {
                    c4453a = (C4453a) eVar;
                    int i15 = c4453a.f174650e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4453a.f174650e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4453a = new C4453a(eVar);
                    }
                } else {
                    c4453a = new C4453a(eVar);
                }
                Object obj2 = c4453a.f174649d;
                Object objE = uq.b.e();
                int i16 = c4453a.f174650e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f174647a;
                    l.Data dataJ9 = this.f174648b.j9((State) obj);
                    c4453a.f174651f = vq.j.a(obj);
                    c4453a.f174653h = vq.j.a(c4453a);
                    c4453a.f174654j = vq.j.a(obj);
                    c4453a.f174655k = vq.j.a(hVar);
                    c4453a.f174656l = 0;
                    c4453a.f174650e = 1;
                    if (hVar.F(dataJ9, c4453a) == objE) {
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

        public a(mu.g gVar, e eVar) {
            this.f174645a = gVar;
            this.f174646b = eVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super l.Data> hVar, tq.e eVar) {
            Object objA = this.f174645a.a(new C4452a(hVar, this.f174646b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrj3/i;", "<unused var>", "Lrj3/k;", "Loq/i0;", "<anonymous>", "(Lrj3/i;Lrj3/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174657e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f174657e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<j> bVarY1 = e.this.Y1();
                j.a aVar = j.a.f174662a;
                this.f174657e = 1;
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
        public final Object w(i iVar, State state, tq.e<? super i0> eVar) {
            return e.this.new b(eVar).J(i0.f148189a);
        }
    }

    public e(sj3.a aVar, tj3.b bVar, yy.a aVar2) {
        this.vehicleHistoryNoDataMapper = aVar;
        this.noDataPayload = bVar;
        State state = new State(bVar);
        this.initialState = state;
        this.stateMachine = aVar2.a(state, new er.l() { // from class: rj3.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.l9(this.f174638a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.Data j9(State state) {
        return this.vehicleHistoryNoDataMapper.b(new sj3.a.Params(state, b9(i.f174661a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final e eVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: rj3.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.m9(this.f174637a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(e eVar, z zVar) {
        b bVar = eVar.new b(null);
        zVar.x(q0.c(i.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<l.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(tj3.b bVar) {
        super.P5(bVar);
    }
}

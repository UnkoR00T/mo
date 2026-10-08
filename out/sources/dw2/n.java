package dw2;

import a14.w;
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
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R,\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u001d\u001a\u0004\b.\u0010/R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u0014098\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010\u001d\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Ldw2/n;", "Ll00/g;", "Ldw2/e;", "", "Ldw2/f;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lfw2/a;", "mapper", "Lu04/a;", "commonEndpoints", "La14/w;", "openUrlIntentUseCase", "globalSnackBarManager", "Llv2/a;", "applicationOwner", "<init>", "(Lyy/a;Lfw2/a;Lu04/a;La14/w;Li70/e;Llv2/a;)V", "state", "Ldw2/f$a;", "l9", "(Ldw2/e;)Ldw2/f$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lfw2/a;", "c", "Lu04/a;", "d", "La14/w;", "e", "Li70/e;", "f", "Llv2/a;", "g", "Ldw2/e;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Ldw2/b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements f, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fw2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final lv2.a applicationOwner;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dw2.b> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f44977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f44978b;

        /* JADX INFO: renamed from: dw2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1024a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f44979a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f44980b;

            /* JADX INFO: renamed from: dw2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1025a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f44981d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f44982e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f44983f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f44985h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f44986j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f44987k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f44988l;

                public C1025a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f44981d = obj;
                    this.f44982e |= PKIFailureInfo.systemUnavail;
                    return C1024a.this.F(null, this);
                }
            }

            public C1024a(mu.h hVar, n nVar) {
                this.f44979a = hVar;
                this.f44980b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1025a c1025a;
                if (eVar instanceof C1025a) {
                    c1025a = (C1025a) eVar;
                    int i15 = c1025a.f44982e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1025a.f44982e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1025a = new C1025a(eVar);
                    }
                } else {
                    c1025a = new C1025a(eVar);
                }
                Object obj2 = c1025a.f44981d;
                Object objE = uq.b.e();
                int i16 = c1025a.f44982e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f44979a;
                    f.Data dataL9 = this.f44980b.l9((State) obj);
                    c1025a.f44983f = vq.j.a(obj);
                    c1025a.f44985h = vq.j.a(c1025a);
                    c1025a.f44986j = vq.j.a(obj);
                    c1025a.f44987k = vq.j.a(hVar);
                    c1025a.f44988l = 0;
                    c1025a.f44982e = 1;
                    if (hVar.F(dataL9, c1025a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f44977a = gVar;
            this.f44978b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f44977a.a(new C1024a(hVar, this.f44978b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldw2/a;", "<unused var>", "Ldw2/e;", "Loq/i0;", "<anonymous>", "(Ldw2/a;Ldw2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<dw2.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44989e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44989e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<dw2.b> bVarY1 = n.this.Y1();
                dw2.b.a aVar = dw2.b.a.f44948a;
                this.f44989e = 1;
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
        public final Object w(dw2.a aVar, State state, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldw2/c;", "<unused var>", "Ldw2/e;", "Loq/i0;", "<anonymous>", "(Ldw2/c;Ldw2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<dw2.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44991e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44991e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = n.this.openUrlIntentUseCase;
                w.Params params = new w.Params(n.this.commonEndpoints.G(), false, 2, null);
                this.f44991e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            n nVar = n.this;
            if (iVar instanceof dx.i.Left) {
                nVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dw2.c cVar, State state, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldw2/d;", "<unused var>", "Ldw2/e;", "Loq/i0;", "<anonymous>", "(Ldw2/d;Ldw2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<dw2.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44993e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44993e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = n.this.openUrlIntentUseCase;
                w.Params params = new w.Params(n.this.commonEndpoints.d0(), false, 2, null);
                this.f44993e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            n nVar = n.this;
            if (iVar instanceof dx.i.Left) {
                nVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dw2.d dVar, State state, tq.e<? super i0> eVar) {
            return n.this.new d(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, fw2.a aVar2, u04.a aVar3, w wVar, i70.e eVar, lv2.a aVar4) {
        this.mapper = aVar2;
        this.commonEndpoints = aVar3;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.applicationOwner = aVar4;
        State state = new State(aVar4);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: dw2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f44967a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data l9(State state) {
        return this.mapper.b(new fw2.a.Params(state, b9(dw2.a.f44947a), b9(dw2.c.f44949a), b9(dw2.d.f44950a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: dw2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f44966a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dw2.a.class), oVar, bVar);
        zVar.x(q0.c(dw2.c.class), oVar, nVar.new c(null));
        zVar.x(q0.c(dw2.d.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<dw2.b> Y1() {
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
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(lv2.a aVar) {
        super.P5(aVar);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}

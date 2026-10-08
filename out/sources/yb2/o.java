package yb2;

import a14.w;
import fr.q0;
import iy.b0;
import iy.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R&\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u0012048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lyb2/o;", "Ll00/g;", "Lyb2/f;", "", "Lyb2/g;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lac2/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "globalSnackBarManager", "Lzb2/a;", "contract", "<init>", "(Lyy/a;Lac2/a;La14/w;Li70/e;Lzb2/a;)V", "state", "Lyb2/g$a;", "m9", "(Lyb2/f;)Lyb2/g$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lac2/a;", "c", "La14/w;", "d", "Li70/e;", "e", "Lzb2/a;", "f", "Lyb2/f;", "initialState", "Lxw/b;", "Lyb2/a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, Object> implements g, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zb2.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yb2.a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f226078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f226079b;

        /* JADX INFO: renamed from: yb2.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6059a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f226080a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f226081b;

            /* JADX INFO: renamed from: yb2.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6060a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f226082d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f226083e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f226084f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f226086h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f226087j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f226088k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f226089l;

                public C6060a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f226082d = obj;
                    this.f226083e |= PKIFailureInfo.systemUnavail;
                    return C6059a.this.F(null, this);
                }
            }

            public C6059a(mu.h hVar, o oVar) {
                this.f226080a = hVar;
                this.f226081b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6060a c6060a;
                if (eVar instanceof C6060a) {
                    c6060a = (C6060a) eVar;
                    int i15 = c6060a.f226083e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6060a.f226083e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6060a = new C6060a(eVar);
                    }
                } else {
                    c6060a = new C6060a(eVar);
                }
                Object obj2 = c6060a.f226082d;
                Object objE = uq.b.e();
                int i16 = c6060a.f226083e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f226080a;
                    g.Data dataM9 = this.f226081b.m9((State) obj);
                    c6060a.f226084f = vq.j.a(obj);
                    c6060a.f226086h = vq.j.a(c6060a);
                    c6060a.f226087j = vq.j.a(obj);
                    c6060a.f226088k = vq.j.a(hVar);
                    c6060a.f226089l = 0;
                    c6060a.f226083e = 1;
                    if (hVar.F(dataM9, c6060a) == objE) {
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
            this.f226078a = gVar;
            this.f226079b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f226078a.a(new C6059a(hVar, this.f226079b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyb2/d;", "action", "Lyb2/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyb2/d;Lyb2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<OnLinkClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226091f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnLinkClick onLinkClick = (OnLinkClick) this.f226091f;
            Object objE = uq.b.e();
            int i15 = this.f226090e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = o.this.openUrlIntentUseCase;
                w.Params params = new w.Params(c0.e(onLinkClick.getUrl()), false, 2, null);
                this.f226091f = vq.j.a(onLinkClick);
                this.f226090e = 1;
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
            o oVar = o.this;
            if (iVar instanceof dx.i.Left) {
                oVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnLinkClick onLinkClick, State state, tq.e<? super i0> eVar) {
            b bVar = o.this.new b(eVar);
            bVar.f226091f = onLinkClick;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyb2/e;", "<unused var>", "Lyb2/f;", "Loq/i0;", "<anonymous>", "(Lyb2/e;Lyb2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<yb2.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226093e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226093e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                yb2.a.c cVar = yb2.a.c.f226050a;
                this.f226093e = 1;
                if (oVar.F(cVar, this) == objE) {
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
        public final Object w(yb2.e eVar, State state, tq.e<? super i0> eVar2) {
            return o.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyb2/c;", "<unused var>", "Lyb2/f;", "Loq/i0;", "<anonymous>", "(Lyb2/c;Lyb2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<yb2.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226095e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226095e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<yb2.a> bVarY1 = o.this.Y1();
                yb2.a.b bVar = yb2.a.b.f226049a;
                this.f226095e = 1;
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
        public final Object w(yb2.c cVar, State state, tq.e<? super i0> eVar) {
            return o.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyb2/b;", "<unused var>", "Lyb2/f;", "Loq/i0;", "<anonymous>", "(Lyb2/b;Lyb2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yb2.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226097e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226097e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<yb2.a> bVarY1 = o.this.Y1();
                yb2.a.C6058a c6058a = yb2.a.C6058a.f226048a;
                this.f226097e = 1;
                if (bVarY1.F(c6058a, this) == objE) {
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
        public final Object w(yb2.b bVar, State state, tq.e<? super i0> eVar) {
            return o.this.new e(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, ac2.a aVar2, w wVar, i70.e eVar, zb2.a aVar3) {
        this.mapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.contract = aVar3;
        State state = new State(aVar3.O3());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: yb2.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.p9(this.f226069a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data m9(State state) {
        return this.mapper.b(new ac2.a.Params(state, new er.l() { // from class: yb2.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.n9(this.f226068a, (b0) obj);
            }
        }, b9(yb2.e.f226055a), b9(yb2.b.f226051a), b9(yb2.c.f226052a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(o oVar, b0 b0Var) {
        oVar.d9(new OnLinkClick(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final o oVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: yb2.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(this.f226067a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(OnLinkClick.class), oVar2, bVar);
        zVar.x(q0.c(yb2.e.class), oVar2, oVar.new c(null));
        zVar.x(q0.c(yb2.c.class), oVar2, oVar.new d(null));
        zVar.x(q0.c(yb2.b.class), oVar2, oVar.new e(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<yb2.a> Y1() {
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
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(yb2.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(zb2.a aVar) {
        super.P5(aVar);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}

package lx2;

import a14.w;
import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030&8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u00102\u001a\b\u0012\u0004\u0012\u00020-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00108\u001a\b\u0012\u0004\u0012\u00020\u0011038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Llx2/q;", "Ll00/g;", "Llx2/g;", "", "Llx2/h;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lnx2/c;", "mapper", "La14/w;", "openUrlIntentUseCase", "globalSnackBarManager", "Lmx2/a;", "contract", "<init>", "(Lyy/a;Lnx2/c;La14/w;Li70/e;Lmx2/a;)V", "Llx2/h$a;", "o9", "(Llx2/g;)Llx2/h$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lnx2/c;", "c", "La14/w;", "d", "Li70/e;", "e", "Lmx2/a;", "f", "Llx2/g;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Llx2/a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, Object> implements h, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nx2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx2.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<lx2.a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f121141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f121142b;

        /* JADX INFO: renamed from: lx2.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2964a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f121143a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f121144b;

            /* JADX INFO: renamed from: lx2.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2965a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f121145d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f121146e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f121147f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f121149h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f121150j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f121151k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f121152l;

                public C2965a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f121145d = obj;
                    this.f121146e |= PKIFailureInfo.systemUnavail;
                    return C2964a.this.F(null, this);
                }
            }

            public C2964a(mu.h hVar, q qVar) {
                this.f121143a = hVar;
                this.f121144b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2965a c2965a;
                if (eVar instanceof C2965a) {
                    c2965a = (C2965a) eVar;
                    int i15 = c2965a.f121146e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2965a.f121146e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2965a = new C2965a(eVar);
                    }
                } else {
                    c2965a = new C2965a(eVar);
                }
                Object obj2 = c2965a.f121145d;
                Object objE = uq.b.e();
                int i16 = c2965a.f121146e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f121143a;
                    h.Data dataO9 = this.f121144b.o9((State) obj);
                    c2965a.f121147f = vq.j.a(obj);
                    c2965a.f121149h = vq.j.a(c2965a);
                    c2965a.f121150j = vq.j.a(obj);
                    c2965a.f121151k = vq.j.a(hVar);
                    c2965a.f121152l = 0;
                    c2965a.f121146e = 1;
                    if (hVar.F(dataO9, c2965a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, q qVar) {
            this.f121141a = gVar;
            this.f121142b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f121141a.a(new C2964a(hVar, this.f121142b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llx2/c;", "<unused var>", "Llx2/g;", "Loq/i0;", "<anonymous>", "(Llx2/c;Llx2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<lx2.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121153e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121153e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                lx2.a.C2963a c2963a = lx2.a.C2963a.f121107a;
                this.f121153e = 1;
                if (qVar.F(c2963a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lx2.c cVar, State state, tq.e<? super i0> eVar) {
            return q.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llx2/d;", "<unused var>", "Llx2/g;", "Loq/i0;", "<anonymous>", "(Llx2/d;Llx2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<lx2.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121155e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121155e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                lx2.a.b bVar = lx2.a.b.f121108a;
                this.f121155e = 1;
                if (qVar.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lx2.d dVar, State state, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llx2/e;", "action", "Llx2/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llx2/e;Llx2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OpenUrl, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121158f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f121158f;
            Object objE = uq.b.e();
            int i15 = this.f121157e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = q.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f121158f = vq.j.a(openUrl);
                this.f121157e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            q qVar = q.this;
            if (iVar instanceof dx.i.Left) {
                qVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, State state, tq.e<? super i0> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f121158f = openUrl;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llx2/f;", "action", "Lk10/c0;", "Llx2/g;", "state", "Lk10/l;", "<anonymous>", "(Llx2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<Select, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121162g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Select select, State state) {
            return new State(state.getApplicationOwner(), select.getAnswer());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Select select = (Select) this.f121161f;
            c0 c0Var = (c0) this.f121162g;
            uq.b.e();
            if (this.f121160e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lx2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(select, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Select select, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f121161f = select;
            eVar2.f121162g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llx2/b;", "<unused var>", "Lk10/c0;", "Llx2/g;", "state", "Lk10/l;", "<anonymous>", "(Llx2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<lx2.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121164f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f121164f;
            Object objE = uq.b.e();
            int i15 = this.f121163e;
            if (i15 == 0) {
                oq.u.b(obj);
                q.this.contract.i(((State) c0Var.a()).getSelectedAnswer());
                q qVar = q.this;
                lx2.a.c cVar = lx2.a.c.f121109a;
                this.f121164f = c0Var;
                this.f121163e = 1;
                if (qVar.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lx2.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f121164f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, nx2.c cVar, w wVar, i70.e eVar, mx2.a aVar2) {
        this.mapper = cVar;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.contract = aVar2;
        lv2.a applicationOwner = aVar2.getApplicationOwner();
        Boolean boolG = aVar2.g();
        State state = new State(applicationOwner, boolG != null ? boolG.booleanValue() : true);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: lx2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f121132a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data o9(State state) {
        return this.mapper.b(new nx2.c.Params(state, new er.l() { // from class: lx2.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.p9(this.f121129a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: lx2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f121130a, (String) obj);
            }
        }, b9(lx2.b.f121110a), b9(lx2.c.f121111a), b9(lx2.d.f121112a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(q qVar, boolean z15) {
        qVar.d9(new Select(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(q qVar, String str) {
        qVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final q qVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: lx2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f121131a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lx2.c.class), oVar, bVar);
        zVar.x(q0.c(lx2.d.class), oVar, qVar.new c(null));
        zVar.x(q0.c(OpenUrl.class), oVar, qVar.new d(null));
        zVar.v(q0.c(Select.class), oVar, new e(null));
        zVar.v(q0.c(lx2.b.class), oVar, qVar.new f(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<lx2.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(lx2.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(mx2.a aVar) {
        super.P5(aVar);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}

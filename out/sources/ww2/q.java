package ww2;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import mv2.CustomErrorData;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lww2/q;", "Ll00/g;", "Lww2/g;", "", "Lww2/h;", "Lyy/a;", "stateMachineFactory", "Lxw2/c;", "mapper", "Lmx/c;", "labelProvider", "Lyw2/a;", "applicationOwner", "<init>", "(Lyy/a;Lxw2/c;Lmx/c;Lyw2/a;)V", "Lww2/h$a;", "m9", "(Lww2/g;)Lww2/h$a;", "b", "Lxw2/c;", "c", "Lmx/c;", "d", "Lyw2/a;", "e", "Lww2/g;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lww2/a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xw2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yw2.a applicationOwner;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ww2.a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f215546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f215547b;

        /* JADX INFO: renamed from: ww2.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5726a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f215548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f215549b;

            /* JADX INFO: renamed from: ww2.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5727a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f215550d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f215551e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f215552f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f215554h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f215555j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f215556k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f215557l;

                public C5727a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f215550d = obj;
                    this.f215551e |= PKIFailureInfo.systemUnavail;
                    return C5726a.this.F(null, this);
                }
            }

            public C5726a(mu.h hVar, q qVar) {
                this.f215548a = hVar;
                this.f215549b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5727a c5727a;
                if (eVar instanceof C5727a) {
                    c5727a = (C5727a) eVar;
                    int i15 = c5727a.f215551e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5727a.f215551e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5727a = new C5727a(eVar);
                    }
                } else {
                    c5727a = new C5727a(eVar);
                }
                Object obj2 = c5727a.f215550d;
                Object objE = uq.b.e();
                int i16 = c5727a.f215551e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f215548a;
                    h.Data dataM9 = this.f215549b.m9((State) obj);
                    c5727a.f215552f = vq.j.a(obj);
                    c5727a.f215554h = vq.j.a(c5727a);
                    c5727a.f215555j = vq.j.a(obj);
                    c5727a.f215556k = vq.j.a(hVar);
                    c5727a.f215557l = 0;
                    c5727a.f215551e = 1;
                    if (hVar.F(dataM9, c5727a) == objE) {
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
            this.f215546a = gVar;
            this.f215547b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f215546a.a(new C5726a(hVar, this.f215547b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lww2/c;", "<unused var>", "Lww2/g;", "Loq/i0;", "<anonymous>", "(Lww2/c;Lww2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ww2.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215558e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215558e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                ww2.a.C5725a c5725a = ww2.a.C5725a.f215514a;
                this.f215558e = 1;
                if (qVar.F(c5725a, this) == objE) {
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
        public final Object w(ww2.c cVar, State state, tq.e<? super i0> eVar) {
            return q.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lww2/d;", "<unused var>", "Lww2/g;", "Loq/i0;", "<anonymous>", "(Lww2/d;Lww2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ww2.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215560e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215560e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                ww2.a.b bVar = ww2.a.b.f215515a;
                this.f215560e = 1;
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
        public final Object w(ww2.d dVar, State state, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lww2/e;", "action", "Lk10/c0;", "Lww2/g;", "state", "Lk10/l;", "<anonymous>", "(Lww2/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<Select, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215563f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f215564g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Select select, State state) {
            return state.a(select.getCitizenship());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Select select = (Select) this.f215563f;
            c0 c0Var = (c0) this.f215564g;
            uq.b.e();
            if (this.f215562e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ww2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O(select, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Select select, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f215563f = select;
            dVar.f215564g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lww2/b;", "<unused var>", "Lk10/c0;", "Lww2/g;", "state", "Lk10/l;", "<anonymous>", "(Lww2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ww2.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215566f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f215568a;

            static {
                int[] iArr = new int[f.values().length];
                try {
                    iArr[f.NOT_POLISH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f.POLISH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f215568a = iArr;
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ww2.a customError;
            c0 c0Var = (c0) this.f215566f;
            Object objE = uq.b.e();
            int i15 = this.f215565e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ww2.a> bVarY1 = q.this.Y1();
                int i16 = a.f215568a[((State) c0Var.a()).getSelectedCitizenship().ordinal()];
                if (i16 == 1) {
                    customError = new ww2.a.CustomError(new CustomErrorData(q.this.labelProvider.c(gv2.a.J0), null, CustomErrorData.EnumC3191a.CLOSE, q.this.labelProvider.c(gv2.a.f77286n), new er.a() { // from class: ww2.s
                        @Override // er.a
                        public final Object a() {
                            return q.e.O();
                        }
                    }, 2, null));
                } else {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    customError = ww2.a.d.f215517a;
                }
                this.f215566f = c0Var;
                this.f215565e = 1;
                if (bVarY1.F(customError, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ww2.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f215566f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, xw2.c cVar, mx.c cVar2, yw2.a aVar2) {
        this.mapper = cVar;
        this.labelProvider = cVar2;
        this.applicationOwner = aVar2;
        State state = new State(f.POLISH);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ww2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.p9(this.f215538a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data m9(State state) {
        return this.mapper.b(new xw2.c.Params(state, this.applicationOwner, new er.l() { // from class: ww2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.n9(this.f215537a, (f) obj);
            }
        }, b9(ww2.b.f215518a), b9(ww2.c.f215519a), b9(ww2.d.f215520a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(q qVar, f fVar) {
        qVar.d9(new Select(fVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ww2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f215536a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ww2.c.class), oVar, bVar);
        zVar.x(q0.c(ww2.d.class), oVar, qVar.new c(null));
        zVar.v(q0.c(Select.class), oVar, new d(null));
        zVar.v(q0.c(ww2.b.class), oVar, qVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ww2.a> Y1() {
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
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ww2.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(yw2.a aVar) {
        super.P5(aVar);
    }
}

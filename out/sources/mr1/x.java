package mr1;

import fr.q0;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030'8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lmr1/x;", "Ll00/g;", "Lmr1/e;", "", "Lmr1/f;", "Lyy/a;", "stateMachineFactory", "Lc44/a;", "getBaseUrlUseCase", "Lc44/c;", "setBaseUrlUseCase", "Lc44/b;", "getDefaultBaseUrlUseCase", "Lmr1/k;", "mapper", "<init>", "(Lyy/a;Lc44/a;Lc44/c;Lc44/b;Lmr1/k;)V", "state", "Lmr1/f$a;", "n9", "(Lmr1/e;)Lmr1/f$a;", "b", "Lc44/c;", "c", "Lmr1/k;", "", "d", "Ljava/lang/String;", "baseUrl", "e", "Lmr1/e;", "initState", "Lxw/b;", "Lmr1/d;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c44.c setBaseUrlUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String baseUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<mr1.d> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f127980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f127981b;

        /* JADX INFO: renamed from: mr1.x$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3156a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f127982a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f127983b;

            /* JADX INFO: renamed from: mr1.x$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3157a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f127984d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f127985e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f127986f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f127988h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f127989j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f127990k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f127991l;

                public C3157a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f127984d = obj;
                    this.f127985e |= PKIFailureInfo.systemUnavail;
                    return C3156a.this.F(null, this);
                }
            }

            public C3156a(mu.h hVar, x xVar) {
                this.f127982a = hVar;
                this.f127983b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3157a c3157a;
                if (eVar instanceof C3157a) {
                    c3157a = (C3157a) eVar;
                    int i15 = c3157a.f127985e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3157a.f127985e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3157a = new C3157a(eVar);
                    }
                } else {
                    c3157a = new C3157a(eVar);
                }
                Object obj2 = c3157a.f127984d;
                Object objE = uq.b.e();
                int i16 = c3157a.f127985e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f127982a;
                    f.Data dataN9 = this.f127983b.n9((State) obj);
                    c3157a.f127986f = vq.j.a(obj);
                    c3157a.f127988h = vq.j.a(c3157a);
                    c3157a.f127989j = vq.j.a(obj);
                    c3157a.f127990k = vq.j.a(hVar);
                    c3157a.f127991l = 0;
                    c3157a.f127985e = 1;
                    if (hVar.F(dataN9, c3157a) == objE) {
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

        public a(mu.g gVar, x xVar) {
            this.f127980a = gVar;
            this.f127981b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f127980a.a(new C3156a(hVar, this.f127981b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lmr1/e;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127993f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(x xVar, State state) {
            return State.b(state, null, xVar.baseUrl, false, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f127993f;
            uq.b.e();
            if (this.f127992e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x xVar = x.this;
            return c0Var.d(new er.l() { // from class: mr1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.b.O(xVar, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = x.this.new b(eVar);
            bVar.f127993f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmr1/b;", "<unused var>", "Lmr1/e;", "Loq/i0;", "<anonymous>", "(Lmr1/b;Lmr1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<mr1.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127995e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127995e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mr1.d> bVarY1 = x.this.Y1();
                mr1.d.a aVar = mr1.d.a.f127933a;
                this.f127995e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(mr1.b bVar, State state, tq.e<? super i0> eVar) {
            return x.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmr1/a;", "action", "Lk10/c0;", "Lmr1/e;", "state", "Lk10/l;", "<anonymous>", "(Lmr1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<BottomSheetVisibilityChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f127999g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, BottomSheetVisibilityChanged bottomSheetVisibilityChanged, State state) {
            return State.b((State) c0Var.a(), null, null, bottomSheetVisibilityChanged.getVisible(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final BottomSheetVisibilityChanged bottomSheetVisibilityChanged = (BottomSheetVisibilityChanged) this.f127998f;
            final k10.c0 c0Var = (k10.c0) this.f127999g;
            uq.b.e();
            if (this.f127997e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mr1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.d.O(c0Var, bottomSheetVisibilityChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(BottomSheetVisibilityChanged bottomSheetVisibilityChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f127998f = bottomSheetVisibilityChanged;
            dVar.f127999g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmr1/c;", "action", "Lk10/c0;", "Lmr1/e;", "state", "Lk10/l;", "<anonymous>", "(Lmr1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<FormDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128001f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f128002g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, FormDataChanged formDataChanged, State state) {
            return State.b((State) c0Var.a(), null, formDataChanged.getUrl(), false, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final FormDataChanged formDataChanged = (FormDataChanged) this.f128001f;
            final k10.c0 c0Var = (k10.c0) this.f128002g;
            uq.b.e();
            if (this.f128000e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.setBaseUrlUseCase.a(new c44.c.Params(formDataChanged.getUrl()));
            return c0Var.d(new er.l() { // from class: mr1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.e.O(c0Var, formDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(FormDataChanged formDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = x.this.new e(eVar);
            eVar2.f128001f = formDataChanged;
            eVar2.f128002g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public x(yy.a aVar, c44.a aVar2, c44.c cVar, c44.b bVar, k kVar) {
        this.setBaseUrlUseCase = cVar;
        this.mapper = kVar;
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        String strA = aVar2.a(c1792a);
        this.baseUrl = strA;
        State state = new State(pq.v.s(bVar.a(c1792a), "http://smockin-api.pro.coi.gov.pl/wszymanski/", "http://smockin-api.pro.coi.gov.pl/mtrzesniewski/", "http://smockin-api.pro.coi.gov.pl/pwiktorski/", "http://smockin-api.pro.coi.gov.pl/mkostaniak"), strA, false);
        this.initState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: mr1.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.r9(this.f127969a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data n9(State state) {
        return this.mapper.b(new k.Params(state, new er.l() { // from class: mr1.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.o9(this.f127970a, (Label) obj);
            }
        }, new er.l() { // from class: mr1.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.p9(this.f127971a, ((Boolean) obj).booleanValue());
            }
        }, b9(mr1.b.f127930a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(x xVar, Label label) {
        xVar.d9(new FormDataChanged(label.getText()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(x xVar, boolean z15) {
        xVar.d9(new BottomSheetVisibilityChanged(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: mr1.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.s9(this.f127972a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(x xVar, k10.z zVar) {
        zVar.A(xVar.new b(null));
        c cVar = xVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(mr1.b.class), oVar, cVar);
        zVar.v(q0.c(BottomSheetVisibilityChanged.class), oVar, new d(null));
        zVar.v(q0.c(FormDataChanged.class), oVar, xVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<mr1.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(f.Data data) {
        super.P5(data);
    }
}

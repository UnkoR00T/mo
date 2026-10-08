package a93;

import c93.TopicListSetupData;
import fr.q0;
import mu.p0;
import oo0.Topic;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"La93/z;", "Ll00/g;", "La93/h;", "", "La93/i;", "Lyy/a;", "stateMachineFactory", "Lb93/b;", "topicListMapper", "Lc93/a;", "setupData", "<init>", "(Lyy/a;Lb93/b;Lc93/a;)V", "state", "La93/i$a;", "m9", "(La93/h;)La93/i$a;", "b", "Lb93/b;", "c", "Lc93/a;", "d", "La93/h;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "La93/c;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<State, Object> implements i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b93.b topicListMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TopicListSetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a93.c> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<i.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f5095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f5096b;

        /* JADX INFO: renamed from: a93.z$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0089a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f5097a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f5098b;

            /* JADX INFO: renamed from: a93.z$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0090a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f5099d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f5100e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f5101f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f5103h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f5104j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f5105k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f5106l;

                public C0090a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f5099d = obj;
                    this.f5100e |= PKIFailureInfo.systemUnavail;
                    return C0089a.this.F(null, this);
                }
            }

            public C0089a(mu.h hVar, z zVar) {
                this.f5097a = hVar;
                this.f5098b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0090a c0090a;
                if (eVar instanceof C0090a) {
                    c0090a = (C0090a) eVar;
                    int i15 = c0090a.f5100e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0090a.f5100e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0090a = new C0090a(eVar);
                    }
                } else {
                    c0090a = new C0090a(eVar);
                }
                Object obj2 = c0090a.f5099d;
                Object objE = uq.b.e();
                int i16 = c0090a.f5100e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f5097a;
                    i.Data dataM9 = this.f5098b.m9((State) obj);
                    c0090a.f5101f = vq.j.a(obj);
                    c0090a.f5103h = vq.j.a(c0090a);
                    c0090a.f5104j = vq.j.a(obj);
                    c0090a.f5105k = vq.j.a(hVar);
                    c0090a.f5106l = 0;
                    c0090a.f5100e = 1;
                    if (hVar.F(dataM9, c0090a) == objE) {
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

        public a(mu.g gVar, z zVar) {
            this.f5095a = gVar;
            this.f5096b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i.Data> hVar, tq.e eVar) {
            Object objA = this.f5095a.a(new C0089a(hVar, this.f5096b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La93/a;", "<unused var>", "Lk10/c0;", "La93/h;", "state", "Lk10/l;", "<anonymous>", "(La93/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<a93.a, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5108f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, "", false, null, null, 12, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f5108f;
            Object objE = uq.b.e();
            int i15 = this.f5107e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (((State) c0Var.a()).getIsSearchActive()) {
                    return c0Var.b(new er.l() { // from class: a93.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.b.O((State) obj2);
                        }
                    });
                }
                xw.b<a93.c> bVarY1 = z.this.Y1();
                a93.c.a aVar = a93.c.a.f5041a;
                this.f5108f = c0Var;
                this.f5107e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(a93.a aVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = z.this.new b(eVar);
            bVar.f5108f = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La93/d;", "action", "La93/h;", "<unused var>", "Loq/i0;", "<anonymous>", "(La93/d;La93/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnTopicClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5111f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnTopicClick onTopicClick = (OnTopicClick) this.f5111f;
            Object objE = uq.b.e();
            int i15 = this.f5110e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a93.c> bVarY1 = z.this.Y1();
                a93.c.GoBackAndSelectTopic goBackAndSelectTopic = new a93.c.GoBackAndSelectTopic(onTopicClick.getTopic());
                this.f5111f = vq.j.a(onTopicClick);
                this.f5110e = 1;
                if (bVarY1.F(goBackAndSelectTopic, this) == objE) {
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
        public final Object w(OnTopicClick onTopicClick, State state, tq.e<? super i0> eVar) {
            c cVar = z.this.new c(eVar);
            cVar.f5111f = onTopicClick;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La93/e;", "action", "Lk10/c0;", "La93/h;", "state", "Lk10/l;", "<anonymous>", "(La93/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<QueryChange, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f5115g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(QueryChange queryChange, State state) {
            return State.b(state, queryChange.getQuery(), false, null, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final QueryChange queryChange = (QueryChange) this.f5114f;
            k10.c0 c0Var = (k10.c0) this.f5115g;
            uq.b.e();
            if (this.f5113e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a93.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.d.O(queryChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(QueryChange queryChange, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f5114f = queryChange;
            dVar.f5115g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La93/f;", "action", "Lk10/c0;", "La93/h;", "state", "Lk10/l;", "<anonymous>", "(La93/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SearchActiveChange, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f5118g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SearchActiveChange searchActiveChange, State state) {
            return State.b(state, "", searchActiveChange.getActive(), null, null, 12, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SearchActiveChange searchActiveChange = (SearchActiveChange) this.f5117f;
            k10.c0 c0Var = (k10.c0) this.f5118g;
            uq.b.e();
            if (this.f5116e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a93.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.e.O(searchActiveChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SearchActiveChange searchActiveChange, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f5117f = searchActiveChange;
            eVar2.f5118g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La93/b;", "<unused var>", "Lk10/c0;", "La93/h;", "state", "Lk10/l;", "<anonymous>", "(La93/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a93.b, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5120f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, "", false, null, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f5120f;
            uq.b.e();
            if (this.f5119e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a93.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.f.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a93.b bVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f5120f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, b93.b bVar, TopicListSetupData topicListSetupData) {
        this.topicListMapper = bVar;
        this.setupData = topicListSetupData;
        State state = new State("", false, topicListSetupData.a(), topicListSetupData.getSelectedTopic());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: a93.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.r9(this.f5088a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.Data m9(State state) {
        return this.topicListMapper.b(new b93.b.Params(state, b9(a93.a.f5038a), new er.l() { // from class: a93.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.n9(this.f5085a, (Topic) obj);
            }
        }, b9(a93.b.f5039a), new er.l() { // from class: a93.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.o9(this.f5086a, (String) obj);
            }
        }, new er.l() { // from class: a93.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.p9(this.f5087a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(z zVar, Topic topic) {
        zVar.d9(new OnTopicClick(topic));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(z zVar, String str) {
        zVar.d9(new QueryChange(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(z zVar, boolean z15) {
        zVar.d9(new SearchActiveChange(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: a93.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.s9(this.f5084a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(z zVar, k10.z zVar2) {
        b bVar = zVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(a93.a.class), oVar, bVar);
        zVar2.x(q0.c(OnTopicClick.class), oVar, zVar.new c(null));
        zVar2.v(q0.c(QueryChange.class), oVar, new d(null));
        zVar2.v(q0.c(SearchActiveChange.class), oVar, new e(null));
        zVar2.v(q0.c(a93.b.class), oVar, new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a93.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(TopicListSetupData topicListSetupData) {
        super.P5(topicListSetupData);
    }
}

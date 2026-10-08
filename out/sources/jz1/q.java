package jz1;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import un0.AvailableElectionSupport;
import un0.ElectionSupportCommitteeData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ljz1/q;", "Ll00/g;", "Ljz1/e;", "", "Ljz1/f;", "Lkz1/b;", "mapper", "Lun0/a;", "availableElectionSupport", "Lyy/a;", "stateMachineFactory", "<init>", "(Lkz1/b;Lun0/a;Lyy/a;)V", "state", "Ljz1/f$a;", "n9", "(Ljz1/e;)Ljz1/f$a;", "b", "Lkz1/b;", "c", "Lun0/a;", "d", "Ljz1/e;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ljz1/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kz1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AvailableElectionSupport availableElectionSupport;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<jz1.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f106958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f106959b;

        /* JADX INFO: renamed from: jz1.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2547a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f106960a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f106961b;

            /* JADX INFO: renamed from: jz1.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2548a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f106962d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f106963e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f106964f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f106966h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f106967j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f106968k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f106969l;

                public C2548a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f106962d = obj;
                    this.f106963e |= PKIFailureInfo.systemUnavail;
                    return C2547a.this.F(null, this);
                }
            }

            public C2547a(mu.h hVar, q qVar) {
                this.f106960a = hVar;
                this.f106961b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2548a c2548a;
                if (eVar instanceof C2548a) {
                    c2548a = (C2548a) eVar;
                    int i15 = c2548a.f106963e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2548a.f106963e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2548a = new C2548a(eVar);
                    }
                } else {
                    c2548a = new C2548a(eVar);
                }
                Object obj2 = c2548a.f106962d;
                Object objE = uq.b.e();
                int i16 = c2548a.f106963e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f106960a;
                    f.Data dataN9 = this.f106961b.n9((State) obj);
                    c2548a.f106964f = vq.j.a(obj);
                    c2548a.f106966h = vq.j.a(c2548a);
                    c2548a.f106967j = vq.j.a(obj);
                    c2548a.f106968k = vq.j.a(hVar);
                    c2548a.f106969l = 0;
                    c2548a.f106963e = 1;
                    if (hVar.F(dataN9, c2548a) == objE) {
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
            this.f106958a = gVar;
            this.f106959b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f106958a.a(new C2547a(hVar, this.f106959b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljz1/b;", "action", "Ljz1/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljz1/b;Ljz1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<jz1.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106971f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jz1.b bVar = (jz1.b) this.f106971f;
            Object objE = uq.b.e();
            int i15 = this.f106970e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                this.f106971f = vq.j.a(bVar);
                this.f106970e = 1;
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
        public final Object w(jz1.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = q.this.new b(eVar);
            bVar2.f106971f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljz1/c;", "action", "Lk10/c0;", "Ljz1/e;", "state", "Lk10/l;", "<anonymous>", "(Ljz1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<SetSearchActive, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106974f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f106975g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetSearchActive setSearchActive, State state) {
            return State.b(state, null, setSearchActive.getIsActive() ? state.getSearchQuery() : "", setSearchActive.getIsActive(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetSearchActive setSearchActive = (SetSearchActive) this.f106974f;
            c0 c0Var = (c0) this.f106975g;
            uq.b.e();
            if (this.f106973e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jz1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.O(setSearchActive, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetSearchActive setSearchActive, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f106974f = setSearchActive;
            cVar.f106975g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljz1/d;", "action", "Lk10/c0;", "Ljz1/e;", "state", "Lk10/l;", "<anonymous>", "(Ljz1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<SetSearchQuery, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106976e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106977f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f106978g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetSearchQuery setSearchQuery, State state) {
            return State.b(state, null, setSearchQuery.getQuery(), false, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetSearchQuery setSearchQuery = (SetSearchQuery) this.f106977f;
            c0 c0Var = (c0) this.f106978g;
            uq.b.e();
            if (this.f106976e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jz1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O(setSearchQuery, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetSearchQuery setSearchQuery, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f106977f = setSearchQuery;
            dVar.f106978g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljz1/a;", "action", "Ljz1/e;", "state", "Loq/i0;", "<anonymous>", "(Ljz1/a;Ljz1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<CommitteeSelect, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106980f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f106981g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            CommitteeSelect committeeSelect = (CommitteeSelect) this.f106980f;
            State state = (State) this.f106981g;
            Object objE = uq.b.e();
            int i15 = this.f106979e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                jz1.b.Next next = new jz1.b.Next(state.getAvailableElectionSupport(), committeeSelect.getElectionSupportCommitteeData(), state.getAvailableElectionSupport().getCommitteeSubjectDistrictName());
                this.f106980f = vq.j.a(committeeSelect);
                this.f106981g = vq.j.a(state);
                this.f106979e = 1;
                if (qVar.F(next, this) == objE) {
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
        public final Object w(CommitteeSelect committeeSelect, State state, tq.e<? super i0> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f106980f = committeeSelect;
            eVar2.f106981g = state;
            return eVar2.J(i0.f148189a);
        }
    }

    public q(kz1.b bVar, AvailableElectionSupport availableElectionSupport, yy.a aVar) {
        this.mapper = bVar;
        this.availableElectionSupport = availableElectionSupport;
        State state = new State(availableElectionSupport, "", false);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: jz1.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f106951a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data n9(State state) {
        return this.mapper.b(new kz1.b.Params(state, b9(jz1.b.C2546b.f106924a), b9(jz1.b.a.f106923a), new er.l() { // from class: jz1.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.o9(this.f106948a, (String) obj);
            }
        }, new er.l() { // from class: jz1.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.p9(this.f106949a, ((Boolean) obj).booleanValue());
            }
        }, b9(new SetSearchQuery("")), new er.l() { // from class: jz1.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f106950a, (ElectionSupportCommitteeData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(q qVar, String str) {
        qVar.d9(new SetSearchQuery(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(q qVar, boolean z15) {
        qVar.d9(new SetSearchActive(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(q qVar, ElectionSupportCommitteeData electionSupportCommitteeData) {
        qVar.d9(new CommitteeSelect(electionSupportCommitteeData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: jz1.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f106947a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(jz1.b.class), oVar, bVar);
        zVar.v(q0.c(SetSearchActive.class), oVar, new c(null));
        zVar.v(q0.c(SetSearchQuery.class), oVar, new d(null));
        zVar.x(q0.c(CommitteeSelect.class), oVar, qVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<jz1.b> Y1() {
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
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(jz1.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(AvailableElectionSupport availableElectionSupport) {
        super.P5(availableElectionSupport);
    }
}

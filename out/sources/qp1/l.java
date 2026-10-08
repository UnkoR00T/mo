package qp1;

import fr.q0;
import java.time.DayOfWeek;
import java.time.LocalDate;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import l30.w;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00198\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lqp1/l;", "Ll00/g;", "Lqp1/b;", "Lqp1/a;", "Lqp1/c;", "", "Lyy/a;", "stateMachineFactory", "Lez/a;", "currentTimeProvider", "Lez/b;", "dateCalculator", "Lrp1/a;", "mapper", "<init>", "(Lyy/a;Lez/a;Lez/b;Lrp1/a;)V", "state", "Lqp1/c$a;", "m9", "(Lqp1/b;)Lqp1/c$a;", "b", "Lrp1/a;", "c", "Lqp1/b;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lqp1/a$a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, qp1.a> implements qp1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rp1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<State, qp1.a> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qp1.a.InterfaceC4233a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<qp1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<qp1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f167894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f167895b;

        /* JADX INFO: renamed from: qp1.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4235a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f167896a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f167897b;

            /* JADX INFO: renamed from: qp1.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4236a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f167898d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f167899e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f167900f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f167902h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f167903j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f167904k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f167905l;

                public C4236a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f167898d = obj;
                    this.f167899e |= PKIFailureInfo.systemUnavail;
                    return C4235a.this.F(null, this);
                }
            }

            public C4235a(mu.h hVar, l lVar) {
                this.f167896a = hVar;
                this.f167897b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4236a c4236a;
                if (eVar instanceof C4236a) {
                    c4236a = (C4236a) eVar;
                    int i15 = c4236a.f167899e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4236a.f167899e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4236a = new C4236a(eVar);
                    }
                } else {
                    c4236a = new C4236a(eVar);
                }
                Object obj2 = c4236a.f167898d;
                Object objE = uq.b.e();
                int i16 = c4236a.f167899e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f167896a;
                    qp1.c.Data dataM9 = this.f167897b.m9((State) obj);
                    c4236a.f167900f = vq.j.a(obj);
                    c4236a.f167902h = vq.j.a(c4236a);
                    c4236a.f167903j = vq.j.a(obj);
                    c4236a.f167904k = vq.j.a(hVar);
                    c4236a.f167905l = 0;
                    c4236a.f167899e = 1;
                    if (hVar.F(dataM9, c4236a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f167894a = gVar;
            this.f167895b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qp1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f167894a.a(new C4235a(hVar, this.f167895b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqp1/a$a;", "action", "Lqp1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqp1/a$a;Lqp1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<qp1.a.InterfaceC4233a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167906e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167907f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qp1.a.InterfaceC4233a interfaceC4233a = (qp1.a.InterfaceC4233a) this.f167907f;
            Object objE = uq.b.e();
            int i15 = this.f167906e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<qp1.a.InterfaceC4233a> bVarY1 = l.this.Y1();
                this.f167907f = vq.j.a(interfaceC4233a);
                this.f167906e = 1;
                if (bVarY1.F(interfaceC4233a, this) == objE) {
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
        public final Object w(qp1.a.InterfaceC4233a interfaceC4233a, State state, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f167907f = interfaceC4233a;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqp1/a$d;", "action", "Lk10/c0;", "Lqp1/b;", "state", "Lk10/l;", "<anonymous>", "(Lqp1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<qp1.a.UpdateDominantYearMonth, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f167911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ez.b f167912h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ez.b bVar, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f167912h = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ez.b bVar, qp1.a.UpdateDominantYearMonth updateDominantYearMonth, State state) {
            return State.b(state, bVar.c(updateDominantYearMonth.getFirstDayInWeekDate()), null, null, null, null, 30, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final qp1.a.UpdateDominantYearMonth updateDominantYearMonth = (qp1.a.UpdateDominantYearMonth) this.f167910f;
            c0 c0Var = (c0) this.f167911g;
            uq.b.e();
            if (this.f167909e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final ez.b bVar = this.f167912h;
            return c0Var.b(new er.l() { // from class: qp1.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.c.O(bVar, updateDominantYearMonth, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qp1.a.UpdateDominantYearMonth updateDominantYearMonth, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(this.f167912h, eVar);
            cVar.f167910f = updateDominantYearMonth;
            cVar.f167911g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqp1/a$c;", "action", "Lk10/c0;", "Lqp1/b;", "state", "Lk10/l;", "<anonymous>", "(Lqp1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<qp1.a.SelectDate, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f167915g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ez.b f167916h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ez.b bVar, tq.e<? super d> eVar) {
            super(3, eVar);
            this.f167916h = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(qp1.a.SelectDate selectDate, int i15, State state) {
            return State.b(state, null, null, null, selectDate.getDate(), new w(i15), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final qp1.a.SelectDate selectDate = (qp1.a.SelectDate) this.f167914f;
            c0 c0Var = (c0) this.f167915g;
            uq.b.e();
            if (this.f167913e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final int iA = this.f167916h.a(((State) c0Var.a()).getFirstDayInCurrentWeekDate(), this.f167916h.f(DayOfWeek.MONDAY, selectDate.getDate()));
            return c0Var.b(new er.l() { // from class: qp1.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.d.O(selectDate, iA, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qp1.a.SelectDate selectDate, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(this.f167916h, eVar);
            dVar.f167914f = selectDate;
            dVar.f167915g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqp1/a$b;", "<unused var>", "Lqp1/b;", "state", "Loq/i0;", "<anonymous>", "(Lqp1/a$b;Lqp1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<qp1.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167918f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(l lVar, LocalDate localDate) {
            lVar.d9(new qp1.a.SelectDate(new fz.b.LocalDate(localDate)));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f167918f;
            uq.b.e();
            if (this.f167917e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            l lVar = l.this;
            LocalDate date = state.getSelectedDate().getDate();
            final l lVar2 = l.this;
            lVar.d9(new qp1.a.InterfaceC4233a.GoToDatePicker(new uw.j.Single(null, date, new er.l() { // from class: qp1.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.e.O(lVar2, (LocalDate) obj2);
                }
            }, null, null, 25, null)));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qp1.a.b bVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = l.this.new e(eVar);
            eVar2.f167918f = state;
            return eVar2.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, ez.a aVar2, final ez.b bVar, rp1.a aVar3) {
        this.mapper = aVar3;
        fz.b.LocalDate localDate = new fz.b.LocalDate(aVar2.c());
        fz.b.LocalDate localDateF = bVar.f(DayOfWeek.MONDAY, new fz.b.LocalDate(aVar2.c()));
        State state = new State(bVar.c(localDateF), localDateF, localDate, localDate, null, 16, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: qp1.h
            @Override // er.l
            public final Object b(Object obj) {
                return l.q9(this.f167883a, bVar, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qp1.c.Data m9(State state) {
        return this.mapper.b(new rp1.a.Params(state, b9(qp1.a.InterfaceC4233a.C4234a.f167859a), new er.l() { // from class: qp1.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f167885a, (fz.b.LocalDate) obj);
            }
        }, new er.l() { // from class: qp1.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f167886a, (fz.b.LocalDate) obj);
            }
        }, b9(qp1.a.b.f167861a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, fz.b.LocalDate localDate) {
        lVar.d9(new qp1.a.SelectDate(localDate));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(l lVar, fz.b.LocalDate localDate) {
        lVar.d9(new qp1.a.UpdateDominantYearMonth(localDate));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final l lVar, final ez.b bVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: qp1.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.r9(this.f167887a, bVar, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(l lVar, ez.b bVar, z zVar) {
        b bVar2 = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(qp1.a.InterfaceC4233a.class), oVar, bVar2);
        zVar.v(q0.c(qp1.a.UpdateDominantYearMonth.class), oVar, new c(bVar, null));
        zVar.v(q0.c(qp1.a.SelectDate.class), oVar, new d(bVar, null));
        zVar.x(q0.c(qp1.a.b.class), oVar, lVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<qp1.a.InterfaceC4233a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, qp1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<qp1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}

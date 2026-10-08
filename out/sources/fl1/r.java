package fl1;

import fr.q0;
import il0.BeChildAndParentsData;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030&8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lfl1/r;", "Ll00/g;", "Lfl1/b;", "Lfl1/a;", "Lfl1/c;", "", "Lyy/a;", "stateMachineFactory", "Lhl1/f;", "mapper", "Lez/a;", "currentTimeProvider", "Lqk1/b;", "validateChildDataUC", "Lgl1/a;", "contract", "<init>", "(Lyy/a;Lhl1/f;Lez/a;Lqk1/b;Lgl1/a;)V", "state", "Lfl1/c$a;", "t9", "(Lfl1/b;)Lfl1/c$a;", "b", "Lhl1/f;", "c", "Lez/a;", "d", "Lqk1/b;", "e", "Lfl1/b;", "initialState", "Lxw/b;", "Lfl1/a$a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<State, fl1.a> implements fl1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hl1.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qk1.b validateChildDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fl1.a.InterfaceC1439a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, fl1.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<fl1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<fl1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f64859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f64860b;

        /* JADX INFO: renamed from: fl1.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1444a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f64861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f64862b;

            /* JADX INFO: renamed from: fl1.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1445a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f64863d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f64864e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f64865f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f64867h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f64868j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f64869k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f64870l;

                public C1445a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f64863d = obj;
                    this.f64864e |= PKIFailureInfo.systemUnavail;
                    return C1444a.this.F(null, this);
                }
            }

            public C1444a(mu.h hVar, r rVar) {
                this.f64861a = hVar;
                this.f64862b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1445a c1445a;
                if (eVar instanceof C1445a) {
                    c1445a = (C1445a) eVar;
                    int i15 = c1445a.f64864e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1445a.f64864e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1445a = new C1445a(eVar);
                    }
                } else {
                    c1445a = new C1445a(eVar);
                }
                Object obj2 = c1445a.f64863d;
                Object objE = uq.b.e();
                int i16 = c1445a.f64864e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f64861a;
                    fl1.c.Data dataT9 = this.f64862b.t9((State) obj);
                    c1445a.f64865f = vq.j.a(obj);
                    c1445a.f64867h = vq.j.a(c1445a);
                    c1445a.f64868j = vq.j.a(obj);
                    c1445a.f64869k = vq.j.a(hVar);
                    c1445a.f64870l = 0;
                    c1445a.f64864e = 1;
                    if (hVar.F(dataT9, c1445a) == objE) {
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

        public a(mu.g gVar, r rVar) {
            this.f64859a = gVar;
            this.f64860b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fl1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f64859a.a(new C1444a(hVar, this.f64860b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfl1/a$b;", "<unused var>", "Lfl1/b;", "Loq/i0;", "<anonymous>", "(Lfl1/a$b;Lfl1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<fl1.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64871e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f64871e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                fl1.a.InterfaceC1439a.C1440a c1440a = fl1.a.InterfaceC1439a.C1440a.f64775a;
                this.f64871e = 1;
                if (rVar.F(c1440a, this) == objE) {
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
        public final Object w(fl1.a.b bVar, State state, tq.e<? super i0> eVar) {
            return r.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfl1/a$f;", "<unused var>", "Lfl1/b;", "Loq/i0;", "<anonymous>", "(Lfl1/a$f;Lfl1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<fl1.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64873e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f64873e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                fl1.a.InterfaceC1439a.b bVar = fl1.a.InterfaceC1439a.b.f64776a;
                this.f64873e = 1;
                if (rVar.F(bVar, this) == objE) {
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
        public final Object w(fl1.a.f fVar, State state, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfl1/a$k;", "<unused var>", "Lk10/c0;", "Lfl1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfl1/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<fl1.a.k, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f64875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f64876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f64877g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f64878h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f64879j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f64880k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f64881l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ gl1.a f64883n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(gl1.a aVar, tq.e<? super d> eVar) {
            super(3, eVar);
            this.f64883n = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Map map, State state) {
            Object next;
            State.Field fieldB = State.Field.b(state.f(), null, ((hz.g) v0.j(map, lk1.a.FIRST_NAME)).a(), 1, null);
            State.Field fieldB2 = State.Field.b(state.j(), null, ((hz.g) v0.j(map, lk1.a.SECOND_NAME)).a(), 1, null);
            State.Field fieldB3 = State.Field.b(state.h(), null, ((hz.g) v0.j(map, lk1.a.LAST_NAME)).a(), 1, null);
            State.Field fieldB4 = State.Field.b(state.e(), null, ((hz.g) v0.j(map, lk1.a.FAMILY_NAME)).a(), 1, null);
            State.Field fieldB5 = State.Field.b(state.d(), null, ((hz.g) v0.j(map, lk1.a.BIRTH_PLACE)).a(), 1, null);
            State.Field fieldB6 = State.Field.b(state.c(), null, ((hz.g) v0.j(map, lk1.a.BIRTH_DATE)).a(), 1, null);
            State.Field fieldB7 = State.Field.b(state.g(), null, ((hz.g) v0.j(map, lk1.a.ID_SERIES_AND_NUMBER)).a(), 1, null);
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Map.Entry) next).getValue() instanceof hz.g.Invalid));
            Map.Entry entry = (Map.Entry) next;
            return State.b(state, null, fieldB, fieldB2, fieldB3, fieldB4, fieldB5, fieldB6, fieldB7, entry != null ? (lk1.a) entry.getKey() : null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objD;
            k10.c0 c0Var = (k10.c0) this.f64881l;
            Object objE = uq.b.e();
            int i15 = this.f64880k;
            if (i15 == 0) {
                oq.u.b(obj);
                qk1.b bVar = r.this.validateChildDataUC;
                State state = (State) c0Var.a();
                qk1.b.Params params = new qk1.b.Params(state.getType(), state.f().d(), state.j().d(), state.h().d(), state.e().d(), state.d().d(), state.c().d(), state.g().d());
                this.f64881l = c0Var;
                this.f64880k = 1;
                objD = bVar.d(params, this);
                if (objD != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f64876f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            objD = obj;
            gl1.a aVar = this.f64883n;
            r rVar = r.this;
            final Map map = (Map) objD;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() instanceof hz.g.Invalid) {
                        return c0Var.b(new er.l() { // from class: fl1.t
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return r.d.O(map, (State) obj2);
                            }
                        });
                    }
                }
            }
            k10.l lVarC = c0Var.c();
            State state2 = (State) c0Var.a();
            iy.b0 b0VarD = state2.f().d();
            iy.b0 b0VarD2 = state2.j().d();
            iy.b0 b0VarD3 = state2.h().d();
            iy.b0 b0VarD4 = state2.e().d();
            String strD = state2.d().d();
            fz.b.LocalDate localDateD = state2.c().d();
            if (localDateD == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aVar.k(new BeChildAndParentsData.ChildData(b0VarD, b0VarD2, b0VarD3, b0VarD4, localDateD, strD, state2.g().d()));
            fl1.a.InterfaceC1439a.d dVar = fl1.a.InterfaceC1439a.d.f64778a;
            this.f64881l = vq.j.a(c0Var);
            this.f64875e = vq.j.a(map);
            this.f64876f = lVarC;
            this.f64877g = vq.j.a(lVarC);
            this.f64878h = 0;
            this.f64879j = 0;
            this.f64880k = 2;
            return rVar.F(dVar, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fl1.a.k kVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = r.this.new d(this.f64883n, eVar);
            dVar.f64881l = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfl1/a$h;", "action", "Lk10/c0;", "Lfl1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfl1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<fl1.a.OnFirstNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f64886g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(fl1.a.OnFirstNameChanged onFirstNameChanged, State state) {
            return State.b(state, null, new State.Field(onFirstNameChanged.getValue(), null, 2, null), null, null, null, null, null, null, null, 509, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fl1.a.OnFirstNameChanged onFirstNameChanged = (fl1.a.OnFirstNameChanged) this.f64885f;
            k10.c0 c0Var = (k10.c0) this.f64886g;
            uq.b.e();
            if (this.f64884e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fl1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.e.O(onFirstNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fl1.a.OnFirstNameChanged onFirstNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f64885f = onFirstNameChanged;
            eVar2.f64886g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfl1/a$m;", "action", "Lk10/c0;", "Lfl1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfl1/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<fl1.a.OnSecondNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f64889g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(fl1.a.OnSecondNameChanged onSecondNameChanged, State state) {
            return State.b(state, null, null, new State.Field(onSecondNameChanged.getValue(), null, 2, null), null, null, null, null, null, null, 507, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fl1.a.OnSecondNameChanged onSecondNameChanged = (fl1.a.OnSecondNameChanged) this.f64888f;
            k10.c0 c0Var = (k10.c0) this.f64889g;
            uq.b.e();
            if (this.f64887e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fl1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.f.O(onSecondNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fl1.a.OnSecondNameChanged onSecondNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f64888f = onSecondNameChanged;
            fVar.f64889g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfl1/a$j;", "action", "Lk10/c0;", "Lfl1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfl1/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<fl1.a.OnLastNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64890e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64891f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f64892g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(fl1.a.OnLastNameChanged onLastNameChanged, State state) {
            return State.b(state, null, null, null, new State.Field(onLastNameChanged.getValue(), null, 2, null), null, null, null, null, null, 503, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fl1.a.OnLastNameChanged onLastNameChanged = (fl1.a.OnLastNameChanged) this.f64891f;
            k10.c0 c0Var = (k10.c0) this.f64892g;
            uq.b.e();
            if (this.f64890e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fl1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.g.O(onLastNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fl1.a.OnLastNameChanged onLastNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f64891f = onLastNameChanged;
            gVar.f64892g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfl1/a$g;", "action", "Lk10/c0;", "Lfl1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfl1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<fl1.a.OnFamilyNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64894f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f64895g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(fl1.a.OnFamilyNameChanged onFamilyNameChanged, State state) {
            return State.b(state, null, null, null, null, new State.Field(onFamilyNameChanged.getValue(), null, 2, null), null, null, null, null, 495, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fl1.a.OnFamilyNameChanged onFamilyNameChanged = (fl1.a.OnFamilyNameChanged) this.f64894f;
            k10.c0 c0Var = (k10.c0) this.f64895g;
            uq.b.e();
            if (this.f64893e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fl1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.h.O(onFamilyNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fl1.a.OnFamilyNameChanged onFamilyNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f64894f = onFamilyNameChanged;
            hVar.f64895g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfl1/a$e;", "action", "Lk10/c0;", "Lfl1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfl1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<fl1.a.OnBirthPlaceChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64897f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f64898g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(fl1.a.OnBirthPlaceChanged onBirthPlaceChanged, State state) {
            return State.b(state, null, null, null, null, null, new State.Field(onBirthPlaceChanged.getValue(), null, 2, null), null, null, null, 479, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fl1.a.OnBirthPlaceChanged onBirthPlaceChanged = (fl1.a.OnBirthPlaceChanged) this.f64897f;
            k10.c0 c0Var = (k10.c0) this.f64898g;
            uq.b.e();
            if (this.f64896e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fl1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.i.O(onBirthPlaceChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fl1.a.OnBirthPlaceChanged onBirthPlaceChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f64897f = onBirthPlaceChanged;
            iVar.f64898g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfl1/a$d;", "action", "Lfl1/b;", "state", "Loq/i0;", "<anonymous>", "(Lfl1/a$d;Lfl1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<fl1.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64900f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(r rVar, LocalDate localDate) {
            rVar.d9(new fl1.a.OnBirthDateChanged(new fz.b.LocalDate(localDate)));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f64900f;
            Object objE = uq.b.e();
            int i15 = this.f64899e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                fz.b.LocalDate localDateD = state.c().d();
                LocalDate date = localDateD != null ? localDateD.getDate() : null;
                final r rVar2 = r.this;
                fl1.a.InterfaceC1439a.DatePicker datePicker = new fl1.a.InterfaceC1439a.DatePicker(new uw.j.Single(null, date, new er.l() { // from class: fl1.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.j.O(rVar2, (LocalDate) obj2);
                    }
                }, null, r.this.currentTimeProvider.c(), 9, null));
                this.f64900f = vq.j.a(state);
                this.f64899e = 1;
                if (rVar.F(datePicker, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fl1.a.d dVar, State state, tq.e<? super i0> eVar) {
            j jVar = r.this.new j(eVar);
            jVar.f64900f = state;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfl1/a$c;", "action", "Lk10/c0;", "Lfl1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfl1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<fl1.a.OnBirthDateChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64903f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f64904g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(fl1.a.OnBirthDateChanged onBirthDateChanged, State state) {
            return State.b(state, null, null, null, null, null, null, new State.Field(onBirthDateChanged.getValue(), null, 2, null), null, null, 447, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fl1.a.OnBirthDateChanged onBirthDateChanged = (fl1.a.OnBirthDateChanged) this.f64903f;
            k10.c0 c0Var = (k10.c0) this.f64904g;
            uq.b.e();
            if (this.f64902e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fl1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.k.O(onBirthDateChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fl1.a.OnBirthDateChanged onBirthDateChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = new k(eVar);
            kVar.f64903f = onBirthDateChanged;
            kVar.f64904g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfl1/a$i;", "action", "Lk10/c0;", "Lfl1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfl1/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<fl1.a.OnIdSeriesAndNumberChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64906f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f64907g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(iy.b0 b0Var, State state) {
            return State.b(state, null, null, null, null, null, null, null, new State.Field(b0Var, null, 2, null), null, 383, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fl1.a.OnIdSeriesAndNumberChanged onIdSeriesAndNumberChanged = (fl1.a.OnIdSeriesAndNumberChanged) this.f64906f;
            k10.c0 c0Var = (k10.c0) this.f64907g;
            uq.b.e();
            if (this.f64905e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String strE = iy.c0.e(onIdSeriesAndNumberChanged.getValue());
            StringBuilder sb5 = new StringBuilder();
            for (int i15 = 0; i15 < strE.length(); i15++) {
                char cCharAt = strE.charAt(i15);
                if (!fu.a.c(cCharAt)) {
                    sb5.append(cCharAt);
                }
            }
            final iy.b0 b0VarG = iy.c0.g(sb5.toString().toUpperCase(Locale.ROOT));
            return b0VarG.c(((State) c0Var.a()).g().d()) ? c0Var.c() : c0Var.b(new er.l() { // from class: fl1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.l.O(b0VarG, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fl1.a.OnIdSeriesAndNumberChanged onIdSeriesAndNumberChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = new l(eVar);
            lVar.f64906f = onIdSeriesAndNumberChanged;
            lVar.f64907g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfl1/a$l;", "<unused var>", "Lk10/c0;", "Lfl1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfl1/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<fl1.a.l, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64909f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, GF2Field.MASK, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f64909f;
            uq.b.e();
            if (this.f64908e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fl1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.m.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fl1.a.l lVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = new m(eVar);
            mVar.f64909f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, hl1.f fVar, ez.a aVar2, qk1.b bVar, final gl1.a aVar3) {
        this.mapper = fVar;
        this.currentTimeProvider = aVar2;
        this.validateChildDataUC = bVar;
        BeChildAndParentsData.ChildData childDataA = aVar3.a();
        kk1.a type = aVar3.getType();
        State.Field field = new State.Field(iy.c0.d(childDataA != null ? childDataA.getFirstName() : null), null, 2, null);
        State.Field field2 = new State.Field(iy.c0.d(childDataA != null ? childDataA.getSecondName() : null), null, 2, null);
        State.Field field3 = new State.Field(iy.c0.d(childDataA != null ? childDataA.getLastName() : null), null, 2, null);
        State.Field field4 = new State.Field(iy.c0.d(childDataA != null ? childDataA.getFamilyName() : null), null, 2, null);
        String birthPlace = childDataA != null ? childDataA.getBirthPlace() : null;
        State state = new State(type, field, field2, field3, field4, new State.Field(birthPlace == null ? "" : birthPlace, null, 2, null), new State.Field(childDataA != null ? childDataA.getBirthDate() : null, null, 2, null), new State.Field(iy.c0.d(childDataA != null ? childDataA.getIdSeriesAndNumber() : null), null, 2, null), null, 256, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: fl1.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f64850a, aVar3, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), t9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final r rVar, final gl1.a aVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: fl1.j
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9(this.f64842a, aVar, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(r rVar, gl1.a aVar, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(fl1.a.OnFirstNameChanged.class), oVar, eVar);
        zVar.v(q0.c(fl1.a.OnSecondNameChanged.class), oVar, new f(null));
        zVar.v(q0.c(fl1.a.OnLastNameChanged.class), oVar, new g(null));
        zVar.v(q0.c(fl1.a.OnFamilyNameChanged.class), oVar, new h(null));
        zVar.v(q0.c(fl1.a.OnBirthPlaceChanged.class), oVar, new i(null));
        zVar.x(q0.c(fl1.a.d.class), oVar, rVar.new j(null));
        zVar.v(q0.c(fl1.a.OnBirthDateChanged.class), oVar, new k(null));
        zVar.v(q0.c(fl1.a.OnIdSeriesAndNumberChanged.class), oVar, new l(null));
        zVar.v(q0.c(fl1.a.l.class), oVar, new m(null));
        zVar.x(q0.c(fl1.a.b.class), oVar, rVar.new b(null));
        zVar.x(q0.c(fl1.a.f.class), oVar, rVar.new c(null));
        zVar.v(q0.c(fl1.a.k.class), oVar, rVar.new d(aVar, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fl1.c.Data t9(State state) {
        return this.mapper.b(new hl1.f.Params(state, new er.l() { // from class: fl1.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.u9(this.f64844a, (iy.b0) obj);
            }
        }, new er.l() { // from class: fl1.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.v9(this.f64845a, (iy.b0) obj);
            }
        }, new er.l() { // from class: fl1.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.w9(this.f64846a, (iy.b0) obj);
            }
        }, new er.l() { // from class: fl1.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.x9(this.f64847a, (iy.b0) obj);
            }
        }, new er.l() { // from class: fl1.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f64848a, (String) obj);
            }
        }, b9(fl1.a.d.f64782a), new er.l() { // from class: fl1.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f64849a, (iy.b0) obj);
            }
        }, b9(fl1.a.l.f64794a), b9(fl1.a.b.f64779a), b9(fl1.a.f.f64784a), b9(fl1.a.k.f64793a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(r rVar, iy.b0 b0Var) {
        rVar.d9(new fl1.a.OnFirstNameChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(r rVar, iy.b0 b0Var) {
        rVar.d9(new fl1.a.OnSecondNameChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(r rVar, iy.b0 b0Var) {
        rVar.d9(new fl1.a.OnLastNameChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(r rVar, iy.b0 b0Var) {
        rVar.d9(new fl1.a.OnFamilyNameChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, String str) {
        rVar.d9(new fl1.a.OnBirthPlaceChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, iy.b0 b0Var) {
        rVar.d9(new fl1.a.OnIdSeriesAndNumberChanged(b0Var));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(gl1.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<fl1.a.InterfaceC1439a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, fl1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fl1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(fl1.a.InterfaceC1439a interfaceC1439a, tq.e<? super i0> eVar) {
        return super.F(interfaceC1439a, eVar);
    }
}

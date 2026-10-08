package n63;

import fr.q0;
import g63.SetupData;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010#\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Ln63/q;", "Ll00/g;", "Ln63/h;", "", "Ln63/i;", "Lo63/a;", "confirmationMapper", "Lyy/a;", "stateMachineFactory", "Ln63/g;", "setupData", "<init>", "(Lo63/a;Lyy/a;Ln63/g;)V", "state", "Ln63/i$a;", "k9", "(Ln63/h;)Ln63/i$a;", "b", "Lo63/a;", "c", "Ln63/h;", "initialState", "Lxw/b;", "Ln63/c;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, Object> implements i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o63.a confirmationMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<n63.c> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<i.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f133329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f133330b;

        /* JADX INFO: renamed from: n63.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3294a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f133331a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f133332b;

            /* JADX INFO: renamed from: n63.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3295a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f133333d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f133334e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f133335f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f133337h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f133338j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f133339k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f133340l;

                public C3295a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f133333d = obj;
                    this.f133334e |= PKIFailureInfo.systemUnavail;
                    return C3294a.this.F(null, this);
                }
            }

            public C3294a(mu.h hVar, q qVar) {
                this.f133331a = hVar;
                this.f133332b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3295a c3295a;
                if (eVar instanceof C3295a) {
                    c3295a = (C3295a) eVar;
                    int i15 = c3295a.f133334e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3295a.f133334e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3295a = new C3295a(eVar);
                    }
                } else {
                    c3295a = new C3295a(eVar);
                }
                Object obj2 = c3295a.f133333d;
                Object objE = uq.b.e();
                int i16 = c3295a.f133334e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f133331a;
                    i.Data dataK9 = this.f133332b.k9((State) obj);
                    c3295a.f133335f = vq.j.a(obj);
                    c3295a.f133337h = vq.j.a(c3295a);
                    c3295a.f133338j = vq.j.a(obj);
                    c3295a.f133339k = vq.j.a(hVar);
                    c3295a.f133340l = 0;
                    c3295a.f133334e = 1;
                    if (hVar.F(dataK9, c3295a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f133329a = gVar;
            this.f133330b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i.Data> hVar, tq.e eVar) {
            Object objA = this.f133329a.a(new C3294a(hVar, this.f133330b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln63/f;", "<unused var>", "Ln63/h;", "Loq/i0;", "<anonymous>", "(Ln63/f;Ln63/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133341e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f133341e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<n63.c> bVarY1 = q.this.Y1();
                n63.c.a aVar = n63.c.a.f133295a;
                this.f133341e = 1;
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
        public final Object w(f fVar, State state, tq.e<? super i0> eVar) {
            return q.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln63/a;", "<unused var>", "Ln63/h;", "state", "Loq/i0;", "<anonymous>", "(Ln63/a;Ln63/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<n63.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f133344f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n63.c phone;
            State state = (State) this.f133344f;
            Object objE = uq.b.e();
            int i15 = this.f133343e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<n63.c> bVarY1 = q.this.Y1();
                p63.a confirmationType = state.getConfirmationType();
                if (confirmationType instanceof p63.a.Email) {
                    phone = new Email(state.getIsAnyContactRegistered(), ((p63.a.Email) state.getConfirmationType()).getPreviousEmail());
                } else {
                    if (!(confirmationType instanceof p63.a.Phone)) {
                        throw new oq.p();
                    }
                    phone = new Phone(state.getIsAnyContactRegistered(), ((p63.a.Phone) state.getConfirmationType()).getPreviousPrefix(), ((p63.a.Phone) state.getConfirmationType()).getPreviousPhoneNumber());
                }
                this.f133344f = vq.j.a(state);
                this.f133343e = 1;
                if (bVarY1.F(phone, this) == objE) {
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
        public final Object w(n63.a aVar, State state, tq.e<? super i0> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f133344f = state;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln63/b;", "<unused var>", "Ln63/h;", "state", "Loq/i0;", "<anonymous>", "(Ln63/b;Ln63/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<n63.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f133347f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i63.b phone;
            State state = (State) this.f133347f;
            Object objE = uq.b.e();
            int i15 = this.f133346e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<n63.c> bVarY1 = q.this.Y1();
                i63.a aVar = i63.a.CONFIRM;
                p63.a confirmationType = state.getConfirmationType();
                if (confirmationType instanceof p63.a.Email) {
                    phone = new i63.b.a(((p63.a.Email) confirmationType).getEmail());
                } else {
                    if (!(confirmationType instanceof p63.a.Phone)) {
                        throw new oq.p();
                    }
                    p63.a.Phone phone2 = (p63.a.Phone) confirmationType;
                    phone = new i63.b.Phone(phone2.getPrefix(), phone2.getPhoneNumber());
                }
                n63.c.CodeConfirmation codeConfirmation = new n63.c.CodeConfirmation(new SetupData(true, aVar, phone));
                this.f133347f = vq.j.a(state);
                this.f133346e = 1;
                if (bVarY1.F(codeConfirmation, this) == objE) {
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
        public final Object w(n63.b bVar, State state, tq.e<? super i0> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f133347f = state;
            return dVar.J(i0.f148189a);
        }
    }

    public q(o63.a aVar, yy.a aVar2, SetupData setupData) {
        this.confirmationMapper = aVar;
        State state = new State(setupData.getType(), setupData.getIsAnyContactRegistered());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar2.a(state, new er.l() { // from class: n63.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.m9(this.f133323a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.Data k9(State state) {
        return this.confirmationMapper.b(new o63.a.Params(state, b9(f.f133305a), b9(n63.b.f133294a), b9(n63.a.f133293a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final q qVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: n63.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.n9(this.f133321a, (z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: n63.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.o9(this.f133322a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        zVar.x(q0.c(f.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(q qVar, z zVar) {
        c cVar = qVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(n63.a.class), oVar, cVar);
        zVar.x(q0.c(n63.b.class), oVar, qVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<n63.c> Y1() {
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
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}

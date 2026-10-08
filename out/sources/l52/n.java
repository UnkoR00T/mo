package l52;

import fr.q0;
import iy.b0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010$\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00109\u001a\b\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R&\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030:8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Ll52/n;", "Ll00/g;", "Ll52/b;", "Ll52/a;", "Ll52/c;", "", "Lyy/a;", "stateMachineFactory", "La42/b;", "isFirstNameValidUseCase", "La42/d;", "isLastNameValidUseCase", "Lj14/m;", "checkPeselNumberCorrectUseCase", "Lm52/a;", "mapper", "Lw52/f;", "stampDutyPaymentsPersonalDataContract", "<init>", "(Lyy/a;La42/b;La42/d;Lj14/m;Lm52/a;Lw52/f;)V", "", "u9", "(Lw52/f;)Ljava/lang/String;", "v9", "Lxw/g;", "w9", "(Lw52/f;)Liy/b0;", "state", "Ll52/c$a;", "y9", "(Ll52/b;)Ll52/c$a;", "Ly52/g$b;", "F9", "(Ll52/b;)Ly52/g$b;", "Lhz/g;", "", "x9", "(Lhz/g;)Z", "b", "La42/b;", "c", "La42/d;", "d", "Lj14/m;", "e", "Lm52/a;", "f", "Lw52/f;", "g", "Ll52/b;", "initialState", "Lxw/b;", "Ll52/a$e;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, l52.a> implements l52.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a42.b isFirstNameValidUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a42.d isLastNameValidUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j14.m checkPeselNumberCorrectUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m52.a mapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w52.f stampDutyPaymentsPersonalDataContract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l52.a.e> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, l52.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<l52.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<l52.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f116221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f116222b;

        /* JADX INFO: renamed from: l52.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2810a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f116223a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f116224b;

            /* JADX INFO: renamed from: l52.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2811a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f116225d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f116226e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f116227f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f116229h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f116230j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f116231k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f116232l;

                public C2811a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f116225d = obj;
                    this.f116226e |= PKIFailureInfo.systemUnavail;
                    return C2810a.this.F(null, this);
                }
            }

            public C2810a(mu.h hVar, n nVar) {
                this.f116223a = hVar;
                this.f116224b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2811a c2811a;
                if (eVar instanceof C2811a) {
                    c2811a = (C2811a) eVar;
                    int i15 = c2811a.f116226e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2811a.f116226e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2811a = new C2811a(eVar);
                    }
                } else {
                    c2811a = new C2811a(eVar);
                }
                Object obj2 = c2811a.f116225d;
                Object objE = uq.b.e();
                int i16 = c2811a.f116226e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f116223a;
                    l52.c.Data dataY9 = this.f116224b.y9((State) obj);
                    c2811a.f116227f = vq.j.a(obj);
                    c2811a.f116229h = vq.j.a(c2811a);
                    c2811a.f116230j = vq.j.a(obj);
                    c2811a.f116231k = vq.j.a(hVar);
                    c2811a.f116232l = 0;
                    c2811a.f116226e = 1;
                    if (hVar.F(dataY9, c2811a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f116221a = gVar;
            this.f116222b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super l52.c.Data> hVar, tq.e eVar) {
            Object objA = this.f116221a.a(new C2810a(hVar, this.f116222b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll52/a$c;", "action", "Lk10/c0;", "Ll52/b;", "state", "Lk10/l;", "<anonymous>", "(Ll52/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<l52.a.FirstNameChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116234f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f116235g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(l52.a.FirstNameChanged firstNameChanged, State state) {
            return State.b(state, firstNameChanged.getFirstName(), hz.b.C2039b.f86846c, null, null, null, null, 60, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final l52.a.FirstNameChanged firstNameChanged = (l52.a.FirstNameChanged) this.f116234f;
            c0 c0Var = (c0) this.f116235g;
            uq.b.e();
            if (this.f116233e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: l52.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.b.O(firstNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l52.a.FirstNameChanged firstNameChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f116234f = firstNameChanged;
            bVar.f116235g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll52/a$d;", "action", "Lk10/c0;", "Ll52/b;", "state", "Lk10/l;", "<anonymous>", "(Ll52/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<l52.a.LastNameChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f116238g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(l52.a.LastNameChanged lastNameChanged, State state) {
            return State.b(state, null, null, lastNameChanged.getLastName(), hz.b.C2039b.f86846c, null, null, 51, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final l52.a.LastNameChanged lastNameChanged = (l52.a.LastNameChanged) this.f116237f;
            c0 c0Var = (c0) this.f116238g;
            uq.b.e();
            if (this.f116236e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: l52.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.O(lastNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l52.a.LastNameChanged lastNameChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f116237f = lastNameChanged;
            cVar.f116238g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll52/a$g;", "action", "Lk10/c0;", "Ll52/b;", "state", "Lk10/l;", "<anonymous>", "(Ll52/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<l52.a.PeselChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f116241g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(l52.a.PeselChanged peselChanged, State state) {
            return State.b(state, null, null, null, null, xw.g.c(iy.c0.g(peselChanged.getPesel())), hz.b.C2039b.f86846c, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final l52.a.PeselChanged peselChanged = (l52.a.PeselChanged) this.f116240f;
            c0 c0Var = (c0) this.f116241g;
            uq.b.e();
            if (this.f116239e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: l52.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.d.O(peselChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l52.a.PeselChanged peselChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f116240f = peselChanged;
            dVar.f116241g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll52/a$h;", "action", "Ll52/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ll52/a$h;Ll52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<l52.a.SavePersonData, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116243f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l52.a.SavePersonData savePersonData = (l52.a.SavePersonData) this.f116243f;
            uq.b.e();
            if (this.f116242e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            n.this.stampDutyPaymentsPersonalDataContract.S5(savePersonData.getStampDutyPaymentsPersonData());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l52.a.SavePersonData savePersonData, State state, tq.e<? super i0> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f116243f = savePersonData;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll52/a$f;", "<unused var>", "Lk10/c0;", "Ll52/b;", "state", "Lk10/l;", "<anonymous>", "(Ll52/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<l52.a.f, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f116247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f116248h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f116249j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f116250k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f116251l;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.g gVar, hz.g gVar2, hz.g gVar3, State state) {
            return State.b(state, null, gVar.a(), null, gVar2.a(), null, gVar3.a(), 21, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0108, code lost:
        
            if (r8.F(r6, r13) == r1) goto L27;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: l52.n.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l52.a.f fVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar2 = n.this.new f(eVar);
            fVar2.f116251l = c0Var;
            return fVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll52/a$b;", "<unused var>", "Ll52/b;", "Loq/i0;", "<anonymous>", "(Ll52/a$b;Ll52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<l52.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116253e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f116253e;
            if (i15 == 0) {
                oq.u.b(obj);
                n nVar = n.this;
                l52.a.e.b bVar = l52.a.e.b.f116180a;
                this.f116253e = 1;
                if (nVar.F(bVar, this) == objE) {
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
        public final Object w(l52.a.b bVar, State state, tq.e<? super i0> eVar) {
            return n.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll52/a$a;", "<unused var>", "Ll52/b;", "state", "Loq/i0;", "<anonymous>", "(Ll52/a$a;Ll52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<l52.a.C2808a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116256f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f116256f;
            Object objE = uq.b.e();
            int i15 = this.f116255e;
            if (i15 == 0) {
                oq.u.b(obj);
                n.this.d9(new l52.a.SavePersonData(n.this.F9(state)));
                n nVar = n.this;
                l52.a.e.C2809a c2809a = l52.a.e.C2809a.f116179a;
                this.f116256f = vq.j.a(state);
                this.f116255e = 1;
                if (nVar.F(c2809a, this) == objE) {
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
        public final Object w(l52.a.C2808a c2808a, State state, tq.e<? super i0> eVar) {
            h hVar = n.this.new h(eVar);
            hVar.f116256f = state;
            return hVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, a42.b bVar, a42.d dVar, j14.m mVar, m52.a aVar2, w52.f fVar) {
        this.isFirstNameValidUseCase = bVar;
        this.isLastNameValidUseCase = dVar;
        this.checkPeselNumberCorrectUseCase = mVar;
        this.mapper = aVar2;
        this.stampDutyPaymentsPersonalDataContract = fVar;
        String strU9 = u9(fVar);
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        State state = new State(strU9, c2039b, v9(fVar), c2039b, w9(fVar), c2039b, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: l52.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.D9(this.f116211a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), y9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(n nVar, String str) {
        nVar.d9(new l52.a.LastNameChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(n nVar, String str) {
        nVar.d9(new l52.a.PeselChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: l52.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.E9(this.f116210a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(n nVar, z zVar) {
        b bVar = new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(l52.a.FirstNameChanged.class), oVar, bVar);
        zVar.v(q0.c(l52.a.LastNameChanged.class), oVar, new c(null));
        zVar.v(q0.c(l52.a.PeselChanged.class), oVar, new d(null));
        zVar.x(q0.c(l52.a.SavePersonData.class), oVar, nVar.new e(null));
        zVar.v(q0.c(l52.a.f.class), oVar, nVar.new f(null));
        zVar.x(q0.c(l52.a.b.class), oVar, nVar.new g(null));
        zVar.x(q0.c(l52.a.C2808a.class), oVar, nVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y52.g.OtherPersonData F9(State state) {
        return new y52.g.OtherPersonData(iy.c0.g(state.getFirstName()), iy.c0.g(state.getLastName()), state.getPesel(), null);
    }

    private final String u9(w52.f fVar) {
        y52.g gVarI;
        b0 firstName;
        String strE;
        return (!(fVar.i() instanceof y52.g.OtherPersonData) || (gVarI = fVar.i()) == null || (firstName = gVarI.getFirstName()) == null || (strE = iy.c0.e(firstName)) == null) ? "" : strE;
    }

    private final String v9(w52.f fVar) {
        y52.g gVarI;
        b0 lastName;
        String strE;
        return (fVar.i() == null || !(fVar.i() instanceof y52.g.OtherPersonData) || (gVarI = fVar.i()) == null || (lastName = gVarI.getLastName()) == null || (strE = iy.c0.e(lastName)) == null) ? "" : strE;
    }

    private final b0 w9(w52.f fVar) {
        y52.g gVarI;
        if ((fVar.i() instanceof y52.g.OtherPersonData) && (gVarI = this.stampDutyPaymentsPersonalDataContract.i()) != null) {
            return gVarI.getPesel();
        }
        return xw.g.INSTANCE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x9(hz.g gVar) {
        if (gVar instanceof hz.g.Invalid) {
            return false;
        }
        if (fr.t.c(gVar, hz.g.b.f86853b)) {
            return true;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l52.c.Data y9(State state) {
        return this.mapper.b(new m52.a.Params(state, new er.l() { // from class: l52.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.z9(this.f116207a, (String) obj);
            }
        }, new er.l() { // from class: l52.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.A9(this.f116208a, (String) obj);
            }
        }, new er.l() { // from class: l52.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.B9(this.f116209a, (String) obj);
            }
        }, b9(l52.a.f.f116182a), b9(l52.a.b.f116176a), b9(l52.a.C2808a.f116175a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(n nVar, String str) {
        nVar.d9(new l52.a.FirstNameChanged(str));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(w52.f fVar) {
        super.P5(fVar);
    }

    @Override // zx.b
    public xw.b<l52.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, l52.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<l52.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(l52.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }
}

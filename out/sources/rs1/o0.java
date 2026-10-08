package rs1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 *\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R&\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010>\u001a\b\u0012\u0004\u0012\u000209088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020 0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lrs1/o0;", "Ll00/g;", "Lrs1/i;", "", "Lrs1/j;", "Lyy/a;", "stateMachineFactory", "Lrs1/h0;", "mapper", "Lj14/a;", "checkEmailCorrectUC", "Lxy3/b;", "checkPasswordUC", "Lj14/p;", "checkPostalCorrectUC", "Lj14/n;", "checkPhoneNumberCorrectUC", "Lj14/m;", "checkPeselNumberCorrectUC", "<init>", "(Lyy/a;Lrs1/h0;Lj14/a;Lxy3/b;Lj14/p;Lj14/n;Lj14/m;)V", "Lrs1/a;", "action", "state", "q9", "(Lrs1/a;Lrs1/i;Ltq/e;)Ljava/lang/Object;", "Lrs1/h;", "input", "A9", "(Lrs1/h;Lrs1/i;Ltq/e;)Ljava/lang/Object;", "z9", "(Lrs1/i;Ltq/e;)Ljava/lang/Object;", "Lrs1/j$a;", "r9", "(Lrs1/i;)Lrs1/j$a;", "b", "Lrs1/h0;", "c", "Lj14/a;", "d", "Lxy3/b;", "e", "Lj14/p;", "f", "Lj14/n;", "g", "Lj14/m;", "h", "Lrs1/i;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lrs1/c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 extends l00.g<State, Object> implements rs1.j, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h0 mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xy3.b checkPasswordUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j14.p checkPostalCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j14.n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j14.m checkPeselNumberCorrectUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<rs1.c> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<rs1.j.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175817a;

        static {
            int[] iArr = new int[rs1.h.values().length];
            try {
                iArr[rs1.h.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rs1.h.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rs1.h.PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rs1.h.POST_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rs1.h.PHONE_COUNTRY_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rs1.h.PHONE_NUMBER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rs1.h.PESEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[rs1.h.DESCRIPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f175817a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<rs1.j.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f175818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f175819b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f175820a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0 f175821b;

            /* JADX INFO: renamed from: rs1.o0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4485a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f175822d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f175823e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f175824f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f175826h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f175827j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f175828k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f175829l;

                public C4485a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f175822d = obj;
                    this.f175823e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o0 o0Var) {
                this.f175820a = hVar;
                this.f175821b = o0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4485a c4485a;
                if (eVar instanceof C4485a) {
                    c4485a = (C4485a) eVar;
                    int i15 = c4485a.f175823e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4485a.f175823e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4485a = new C4485a(eVar);
                    }
                } else {
                    c4485a = new C4485a(eVar);
                }
                Object obj2 = c4485a.f175822d;
                Object objE = uq.b.e();
                int i16 = c4485a.f175823e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f175820a;
                    rs1.j.Data dataR9 = this.f175821b.r9((State) obj);
                    c4485a.f175824f = vq.j.a(obj);
                    c4485a.f175826h = vq.j.a(c4485a);
                    c4485a.f175827j = vq.j.a(obj);
                    c4485a.f175828k = vq.j.a(hVar);
                    c4485a.f175829l = 0;
                    c4485a.f175823e = 1;
                    if (hVar.F(dataR9, c4485a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, o0 o0Var) {
            this.f175818a = gVar;
            this.f175819b = o0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super rs1.j.Data> hVar, tq.e eVar) {
            Object objA = this.f175818a.a(new a(hVar, this.f175819b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrs1/c;", "action", "Lrs1/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lrs1/c;Lrs1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<rs1.c, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175831f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            rs1.c cVar = (rs1.c) this.f175831f;
            Object objE = uq.b.e();
            int i15 = this.f175830e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<rs1.c> bVarY1 = o0.this.Y1();
                this.f175831f = vq.j.a(cVar);
                this.f175830e = 1;
                if (bVarY1.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(rs1.c cVar, State state, tq.e<? super oq.i0> eVar) {
            c cVar2 = o0.this.new c(eVar);
            cVar2.f175831f = cVar;
            return cVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrs1/b;", "action", "Lk10/c0;", "Lrs1/i;", "state", "Lk10/l;", "<anonymous>", "(Lrs1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ClearValidation, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f175835g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ClearValidation clearValidation = (ClearValidation) this.f175834f;
            k10.c0 c0Var = (k10.c0) this.f175835g;
            uq.b.e();
            if (this.f175833e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final State stateF = ((State) c0Var.a()).f(clearValidation.getField(), hz.b.C2039b.f86846c);
            return c0Var.b(new er.l() { // from class: rs1.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.d.O(stateF, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ClearValidation clearValidation, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f175834f = clearValidation;
            dVar.f175835g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrs1/a;", "action", "Lk10/c0;", "Lrs1/i;", "state", "Lk10/l;", "<anonymous>", "(Lrs1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ChangeInput, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175837f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f175838g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ChangeInput changeInput = (ChangeInput) this.f175837f;
            k10.c0 c0Var = (k10.c0) this.f175838g;
            Object objE = uq.b.e();
            int i15 = this.f175836e;
            if (i15 == 0) {
                oq.u.b(obj);
                o0 o0Var = o0.this;
                State state = (State) c0Var.a();
                this.f175837f = vq.j.a(changeInput);
                this.f175838g = c0Var;
                this.f175836e = 1;
                obj = o0Var.q9(changeInput, state, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final State state2 = (State) obj;
            return c0Var.b(new er.l() { // from class: rs1.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.e.O(state2, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeInput changeInput, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = o0.this.new e(eVar);
            eVar2.f175837f = changeInput;
            eVar2.f175838g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrs1/e;", "action", "Lk10/c0;", "Lrs1/i;", "state", "Lk10/l;", "<anonymous>", "(Lrs1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ValidateField, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175840e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175841f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f175842g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ValidateField validateField = (ValidateField) this.f175841f;
            k10.c0 c0Var = (k10.c0) this.f175842g;
            Object objE = uq.b.e();
            int i15 = this.f175840e;
            if (i15 == 0) {
                oq.u.b(obj);
                o0 o0Var = o0.this;
                rs1.h field = validateField.getField();
                State state = (State) c0Var.a();
                this.f175841f = vq.j.a(validateField);
                this.f175842g = c0Var;
                this.f175840e = 1;
                obj = o0Var.A9(field, state, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final State state2 = (State) obj;
            return c0Var.b(new er.l() { // from class: rs1.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.f.O(state2, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ValidateField validateField, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = o0.this.new f(eVar);
            fVar.f175841f = validateField;
            fVar.f175842g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrs1/d;", "action", "Lk10/c0;", "Lrs1/i;", "state", "Lk10/l;", "<anonymous>", "(Lrs1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ValidateCharsLimitReached, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f175846g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hz.b invalid;
            ValidateCharsLimitReached validateCharsLimitReached = (ValidateCharsLimitReached) this.f175845f;
            k10.c0 c0Var = (k10.c0) this.f175846g;
            uq.b.e();
            if (this.f175844e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (validateCharsLimitReached.getData().getLimitReached()) {
                invalid = new hz.b.Invalid(mx.b.b("Field should have max " + validateCharsLimitReached.getData().getMaxCharacters() + " characters ", ""));
            } else {
                invalid = hz.b.d.f86848c;
            }
            final State stateF = ((State) c0Var.a()).f(validateCharsLimitReached.getData().getField(), invalid);
            return c0Var.b(new er.l() { // from class: rs1.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.g.O(stateF, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ValidateCharsLimitReached validateCharsLimitReached, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f175845f = validateCharsLimitReached;
            gVar.f175846g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrs1/f;", "<unused var>", "Lk10/c0;", "Lrs1/i;", "state", "Lk10/l;", "<anonymous>", "(Lrs1/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<rs1.f, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175848f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f175848f;
            Object objE = uq.b.e();
            int i15 = this.f175847e;
            if (i15 == 0) {
                oq.u.b(obj);
                o0 o0Var = o0.this;
                State state = (State) c0Var.a();
                this.f175848f = c0Var;
                this.f175847e = 1;
                obj = o0Var.z9(state, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final State state2 = (State) obj;
            return c0Var.b(new er.l() { // from class: rs1.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.h.O(state2, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(rs1.f fVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = o0.this.new h(eVar);
            hVar.f175848f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f175850d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f175851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f175852f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f175853g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f175854h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f175855j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f175856k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f175857l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f175858m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f175859n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f175860p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f175862r;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f175860p = obj;
            this.f175862r |= PKIFailureInfo.systemUnavail;
            return o0.this.z9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f175863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f175864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f175865f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f175866g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f175868j;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f175866g = obj;
            this.f175868j |= PKIFailureInfo.systemUnavail;
            return o0.this.A9(null, null, this);
        }
    }

    public o0(yy.a aVar, h0 h0Var, j14.a aVar2, xy3.b bVar, j14.p pVar, j14.n nVar, j14.m mVar) {
        this.mapper = h0Var;
        this.checkEmailCorrectUC = aVar2;
        this.checkPasswordUC = bVar;
        this.checkPostalCorrectUC = pVar;
        this.checkPhoneNumberCorrectUC = nVar;
        this.checkPeselNumberCorrectUC = mVar;
        State state = new State(null, null, null, 7, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: rs1.i0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.x9(this.f175776a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), r9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0123, code lost:
    
        if (r3 == r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0161, code lost:
    
        if (r3 == r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a1, code lost:
    
        if (r3 == r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0241, code lost:
    
        if (r4 == r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0243, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A9(rs1.h r18, rs1.State r19, tq.e<? super rs1.State> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.o0.A9(rs1.h, rs1.i, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q9(ChangeInput changeInput, State state, tq.e<? super State> eVar) {
        State stateG = state.g(changeInput.getField(), changeInput.getValue());
        switch (a.f175817a[changeInput.getField().ordinal()]) {
            case 1:
            case 2:
                return A9(changeInput.getField(), stateG, eVar);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return stateG.f(changeInput.getField(), hz.b.C2039b.f86846c);
            default:
                throw new oq.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rs1.j.Data r9(State state) {
        return this.mapper.b(new h0.Params(state, b9(rs1.c.a.f175742a), new er.p() { // from class: rs1.j0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return o0.s9(this.f175795a, (h) obj, (String) obj2);
            }
        }, new er.l() { // from class: rs1.k0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.t9(this.f175798a, (h) obj);
            }
        }, new er.l() { // from class: rs1.l0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.u9(this.f175800a, (h) obj);
            }
        }, b9(rs1.f.f175748a), new er.l() { // from class: rs1.m0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.v9(this.f175802a, (CharsLimitReachedData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s9(o0 o0Var, rs1.h hVar, String str) {
        o0Var.d9(new ChangeInput(str, hVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t9(o0 o0Var, rs1.h hVar) {
        o0Var.d9(new ClearValidation(hVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(o0 o0Var, rs1.h hVar) {
        o0Var.d9(new ValidateField(hVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v9(o0 o0Var, CharsLimitReachedData charsLimitReachedData) {
        o0Var.d9(new ValidateCharsLimitReached(charsLimitReachedData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(final o0 o0Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: rs1.n0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.y9(this.f175804a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(o0 o0Var, k10.z zVar) {
        c cVar = o0Var.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(rs1.c.class), oVar, cVar);
        zVar.v(fr.q0.c(ClearValidation.class), oVar, new d(null));
        zVar.v(fr.q0.c(ChangeInput.class), oVar, o0Var.new e(null));
        zVar.v(fr.q0.c(ValidateField.class), oVar, o0Var.new f(null));
        zVar.v(fr.q0.c(ValidateCharsLimitReached.class), oVar, new g(null));
        zVar.v(fr.q0.c(rs1.f.class), oVar, o0Var.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ae -> B:21:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object z9(rs1.State r13, tq.e<? super rs1.State> r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof rs1.o0.i
            if (r0 == 0) goto L13
            r0 = r14
            rs1.o0$i r0 = (rs1.o0.i) r0
            int r1 = r0.f175862r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175862r = r1
            goto L18
        L13:
            rs1.o0$i r0 = new rs1.o0$i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f175860p
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f175862r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 != r4) goto L4f
            int r13 = r0.f175858m
            java.lang.Object r2 = r0.f175857l
            rs1.i r2 = (rs1.State) r2
            java.lang.Object r2 = r0.f175856k
            rs1.h r2 = (rs1.h) r2
            java.lang.Object r2 = r0.f175854h
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.f175853g
            rs1.i r5 = (rs1.State) r5
            java.lang.Object r5 = r0.f175852f
            rs1.i r5 = (rs1.State) r5
            java.lang.Object r6 = r0.f175851e
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r7 = r0.f175850d
            rs1.i r7 = (rs1.State) r7
            oq.u.b(r14)
            r11 = r2
            r2 = r13
            r13 = r6
            r6 = r11
            r11 = r5
            r5 = r0
            r0 = r11
            goto Lb2
        L4f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L57:
            oq.u.b(r14)
            wq.a r14 = rs1.h.e()
            java.util.Iterator r2 = r14.iterator()
            r7 = r14
            r5 = r0
            r6 = r2
            r2 = r3
            r14 = r13
            r0 = r14
        L68:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lb9
            java.lang.Object r8 = r6.next()
            r9 = r8
            rs1.h r9 = (rs1.h) r9
            java.lang.Object r10 = vq.j.a(r14)
            r5.f175850d = r10
            java.lang.Object r10 = vq.j.a(r7)
            r5.f175851e = r10
            java.lang.Object r10 = vq.j.a(r0)
            r5.f175852f = r10
            java.lang.Object r10 = vq.j.a(r13)
            r5.f175853g = r10
            r5.f175854h = r6
            java.lang.Object r8 = vq.j.a(r8)
            r5.f175855j = r8
            java.lang.Object r8 = vq.j.a(r9)
            r5.f175856k = r8
            java.lang.Object r8 = vq.j.a(r13)
            r5.f175857l = r8
            r5.f175858m = r2
            r5.f175859n = r3
            r5.f175862r = r4
            java.lang.Object r13 = r12.A9(r9, r13, r5)
            if (r13 != r1) goto Lae
            return r1
        Lae:
            r11 = r14
            r14 = r13
            r13 = r7
            r7 = r11
        Lb2:
            rs1.i r14 = (rs1.State) r14
            r11 = r7
            r7 = r13
            r13 = r14
            r14 = r11
            goto L68
        Lb9:
            rs1.i r13 = r13.h()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.o0.z9(rs1.i, tq.e):java.lang.Object");
    }

    @Override // zx.b
    public xw.b<rs1.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<rs1.j.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }
}

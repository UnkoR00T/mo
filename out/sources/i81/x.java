package i81;

import fr.q0;
import i61.EnterChildValidatedData;
import java.time.LocalDate;
import k81.FieldItem;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J-\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010+\u001a\u00020(*\u00020(2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR \u0010J\u001a\b\u0012\u0004\u0012\u00020E0D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR&\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030K8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006V"}, d2 = {"Li81/x;", "Ll00/g;", "Li81/b;", "Li81/a;", "Li81/c;", "", "Lyy/a;", "stateMachineFactory", "Lj81/c;", "mapper", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "Ll61/s;", "isNameValidUC", "Ll61/q;", "isLastNameValidUC", "Lj14/m;", "checkPeselNumberCorrectUC", "Ll61/e;", "checkIsPlaceOfBirthCorrectUC", "Lg14/a;", "getInfoFromPeselUC", "Ll61/d;", "checkIsDateOfBirthValidUC", "Lk81/a;", "setupData", "<init>", "(Lyy/a;Lj81/c;Lez/e;Lez/c;Ll61/s;Ll61/q;Lj14/m;Ll61/e;Lg14/a;Ll61/d;Lk81/a;)V", "state", "Li81/c$a;", "D9", "(Li81/b;)Li81/c$a;", "T", "Lk81/b;", "Lhz/b;", "validationState", "M9", "(Lk81/b;Lhz/b;)Lk81/b;", "Liy/b0;", "", "isRequired", "Q9", "(Liy/b0;Z)Liy/b0;", "b", "Lj81/c;", "c", "Lez/e;", "d", "Lez/c;", "e", "Ll61/s;", "f", "Ll61/q;", "g", "Lj14/m;", "h", "Ll61/e;", "j", "Lg14/a;", "k", "Ll61/d;", "l", "Lk81/a;", "m", "Li81/b;", "initialState", "Lxw/b;", "Li81/a$a;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<State, i81.a> implements i81.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j81.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l61.s isNameValidUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l61.q isLastNameValidUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j14.m checkPeselNumberCorrectUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l61.e checkIsPlaceOfBirthCorrectUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g14.a getInfoFromPeselUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l61.d checkIsDateOfBirthValidUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k81.a setupData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i81.a.InterfaceC2135a> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, i81.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<i81.c.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<xw.g, oq.i0> {
        a() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(xw.g gVar) {
            c(gVar.getValue());
            return oq.i0.f148189a;
        }

        public final void c(iy.b0 b0Var) {
            x.this.d9(new i81.a.OnPeselChanged(b0Var, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<i81.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f90047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f90048b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f90049a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f90050b;

            /* JADX INFO: renamed from: i81.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2137a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f90051d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f90052e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f90053f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f90055h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f90056j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f90057k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f90058l;

                public C2137a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f90051d = obj;
                    this.f90052e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f90049a = hVar;
                this.f90050b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2137a c2137a;
                if (eVar instanceof C2137a) {
                    c2137a = (C2137a) eVar;
                    int i15 = c2137a.f90052e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2137a.f90052e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2137a = new C2137a(eVar);
                    }
                } else {
                    c2137a = new C2137a(eVar);
                }
                Object obj2 = c2137a.f90051d;
                Object objE = uq.b.e();
                int i16 = c2137a.f90052e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f90049a;
                    i81.c.Data dataD9 = this.f90050b.D9((State) obj);
                    c2137a.f90053f = vq.j.a(obj);
                    c2137a.f90055h = vq.j.a(c2137a);
                    c2137a.f90056j = vq.j.a(obj);
                    c2137a.f90057k = vq.j.a(hVar);
                    c2137a.f90058l = 0;
                    c2137a.f90052e = 1;
                    if (hVar.F(dataD9, c2137a) == objE) {
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

        public b(mu.g gVar, x xVar) {
            this.f90047a = gVar;
            this.f90048b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i81.c.Data> hVar, tq.e eVar) {
            Object objA = this.f90047a.a(new a(hVar, this.f90048b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$i;", "action", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<i81.a.OnNoNameSwitchChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90060f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90061g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i81.a.OnNoNameSwitchChanged onNoNameSwitchChanged, State state) {
            return State.b(state, null, null, null, null, null, null, null, onNoNameSwitchChanged.getChecked(), false, null, false, null, false, 8063, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i81.a.OnNoNameSwitchChanged onNoNameSwitchChanged = (i81.a.OnNoNameSwitchChanged) this.f90060f;
            k10.c0 c0Var = (k10.c0) this.f90061g;
            uq.b.e();
            if (this.f90059e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i81.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.c.O(onNoNameSwitchChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.OnNoNameSwitchChanged onNoNameSwitchChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f90060f = onNoNameSwitchChanged;
            cVar.f90061g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$h;", "action", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<i81.a.OnNoLastNameSwitchChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90064g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i81.a.OnNoLastNameSwitchChanged onNoLastNameSwitchChanged, State state) {
            return State.b(state, null, null, null, null, null, null, null, false, onNoLastNameSwitchChanged.getChecked(), null, false, null, false, 7935, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i81.a.OnNoLastNameSwitchChanged onNoLastNameSwitchChanged = (i81.a.OnNoLastNameSwitchChanged) this.f90063f;
            k10.c0 c0Var = (k10.c0) this.f90064g;
            uq.b.e();
            if (this.f90062e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i81.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.d.O(onNoLastNameSwitchChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.OnNoLastNameSwitchChanged onNoLastNameSwitchChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f90063f = onNoLastNameSwitchChanged;
            dVar.f90064g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$c;", "action", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<i81.a.OnBirthDateChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90066f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90067g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i81.a.OnBirthDateChanged onBirthDateChanged, State state) {
            return State.b(state, null, null, null, null, null, new FieldItem(hz.b.C2039b.f86846c, onBirthDateChanged.getBirthDate()), null, false, false, null, false, null, false, 8159, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i81.a.OnBirthDateChanged onBirthDateChanged = (i81.a.OnBirthDateChanged) this.f90066f;
            k10.c0 c0Var = (k10.c0) this.f90067g;
            uq.b.e();
            if (this.f90065e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i81.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.e.O(onBirthDateChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.OnBirthDateChanged onBirthDateChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f90066f = onBirthDateChanged;
            eVar2.f90067g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li81/a$o;", "<unused var>", "Li81/b;", "Loq/i0;", "<anonymous>", "(Li81/a$o;Li81/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<i81.a.o, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f90068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f90069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f90070g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(x xVar, LocalDate localDate) {
            xVar.d9(new i81.a.OnBirthDateChanged(iy.c0.g(xVar.dateFormatter.d(new fz.b.LocalDate(localDate), fz.c.DOTTED))));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f90070g;
            if (i15 == 0) {
                oq.u.b(obj);
                LocalDate localDateNow = LocalDate.now();
                LocalDate localDateMinusYears = localDateNow.minusYears(18L);
                xw.b<i81.a.InterfaceC2135a> bVarY1 = x.this.Y1();
                final x xVar = x.this;
                i81.a.InterfaceC2135a.ToDatePicker toDatePicker = new i81.a.InterfaceC2135a.ToDatePicker(new uw.j.Single(null, localDateNow, new er.l() { // from class: i81.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.f.O(xVar, (LocalDate) obj2);
                    }
                }, localDateMinusYears, localDateNow, 1, null));
                this.f90068e = vq.j.a(localDateNow);
                this.f90069f = vq.j.a(localDateMinusYears);
                this.f90070g = 1;
                if (bVarY1.F(toDatePicker, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.o oVar, State state, tq.e<? super oq.i0> eVar) {
            return x.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$e;", "action", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<i81.a.OnCitizenshipCheckBoxChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90073f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90074g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i81.a.OnCitizenshipCheckBoxChanged onCitizenshipCheckBoxChanged, State state) {
            return State.b(state, null, null, null, null, null, null, null, false, false, null, false, new FieldItem(hz.b.C2039b.f86846c, Boolean.valueOf(onCitizenshipCheckBoxChanged.getChecked())), false, 6143, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i81.a.OnCitizenshipCheckBoxChanged onCitizenshipCheckBoxChanged = (i81.a.OnCitizenshipCheckBoxChanged) this.f90073f;
            k10.c0 c0Var = (k10.c0) this.f90074g;
            uq.b.e();
            if (this.f90072e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i81.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.g.O(onCitizenshipCheckBoxChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.OnCitizenshipCheckBoxChanged onCitizenshipCheckBoxChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f90073f = onCitizenshipCheckBoxChanged;
            gVar.f90074g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li81/a$n;", "<unused var>", "Li81/b;", "state", "Loq/i0;", "<anonymous>", "(Li81/a$n;Li81/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<i81.a.n, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90076f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iy.b0 b0VarD;
            String strE;
            LocalDate localDateO;
            State state = (State) this.f90076f;
            uq.b.e();
            if (this.f90075e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            FieldItem<iy.b0> fieldItemC = state.c();
            fz.b.LocalDate localDate = null;
            if (fieldItemC != null && (b0VarD = fieldItemC.d()) != null && (strE = iy.c0.e(b0VarD)) != null) {
                if (strE.length() <= 0) {
                    strE = null;
                }
                if (strE != null && (localDateO = x.this.dateConverter.o(strE, fz.c.DOTTED)) != null) {
                    localDate = new fz.b.LocalDate(localDateO);
                }
            }
            fz.b.LocalDate localDate2 = localDate;
            x.this.setupData.h2(new EnterChildValidatedData(cl0.j0.MANUAL, iy.c0.c(x.this.Q9(state.g().d(), !state.getNoNameSwitchChecked())), iy.c0.c(x.this.Q9(state.n().d(), !state.getNoNameSwitchChecked())), iy.c0.c(x.this.Q9(state.k().d(), !state.getNoNameSwitchChecked())), iy.c0.c(x.this.Q9(state.h().d(), !state.getNoLastNameSwitchChecked())), xw.g.c(state.l().d().getValue()), localDate2, state.d().d(), null), new i61.n(x.this.Q9(state.g().d(), !state.getNoNameSwitchChecked()), x.this.Q9(state.n().d(), !state.getNoNameSwitchChecked()), x.this.Q9(state.k().d(), !state.getNoNameSwitchChecked()), x.this.Q9(state.h().d(), !state.getNoLastNameSwitchChecked()), xw.g.c(state.l().d().getValue()), localDate2, state.d().d(), state.getNoNameSwitchChecked(), state.getNoLastNameSwitchChecked(), state.e().d().booleanValue(), null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.n nVar, State state, tq.e<? super oq.i0> eVar) {
            h hVar = x.this.new h(eVar);
            hVar.f90076f = state;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$l;", "<unused var>", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<i81.a.l, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90079f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, null, false, false, null, false, null, false, 4095, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f90079f;
            uq.b.e();
            if (this.f90078e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i81.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.i.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.l lVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f90079f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$b;", "<unused var>", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<i81.a.b, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f90080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f90081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f90082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f90083h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f90084j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f90085k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f90086l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f90087m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f90088n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f90089p;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.b bVar, hz.b bVar2, hz.b bVar3, hz.b bVar4, hz.b bVar5, hz.b bVar6, hz.b bVar7, hz.b bVar8, x xVar, State state) {
            FieldItem fieldItemM9;
            boolean z15 = bVar.a() && bVar2.a() && bVar3.a() && bVar4.a() && bVar5.a() && bVar6.a() && bVar7.a() && !bVar8.a();
            FieldItem fieldItemM10 = xVar.M9(state.g(), bVar);
            FieldItem fieldItemM11 = xVar.M9(state.n(), bVar2);
            FieldItem fieldItemM12 = xVar.M9(state.k(), bVar3);
            FieldItem fieldItemM13 = xVar.M9(state.h(), bVar4);
            FieldItem fieldItemM14 = xVar.M9(state.l(), bVar5);
            FieldItem fieldItemM15 = xVar.M9(state.d(), bVar6);
            FieldItem<iy.b0> fieldItemC = state.c();
            return State.b(state, fieldItemM10, fieldItemM11, fieldItemM12, fieldItemM13, fieldItemM14, (fieldItemC == null || (fieldItemM9 = xVar.M9(fieldItemC, bVar7)) == null) ? new FieldItem(bVar7, iy.b0.INSTANCE.a()) : fieldItemM9, fieldItemM15, false, false, null, false, xVar.M9(state.e(), bVar8), z15, 1920, null);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x014a  */
        /* JADX WARN: Code duplicated, block: B:29:0x019b  */
        /* JADX WARN: Code duplicated, block: B:32:0x020d  */
        /* JADX WARN: Code duplicated, block: B:33:0x0214  */
        /* JADX WARN: Code duplicated, block: B:36:0x0236  */
        /* JADX WARN: Code duplicated, block: B:38:0x023b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x023d  */
        /* JADX WARN: Code duplicated, block: B:42:0x0249  */
        /* JADX WARN: Code duplicated, block: B:63:0x02d0  */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x02ba, code lost:
        
            if (r3.F(r4, r20) == r2) goto L58;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 726
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i81.x.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.b bVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = x.this.new j(eVar);
            jVar.f90089p = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li81/a$a$b;", "<unused var>", "Li81/b;", "Loq/i0;", "<anonymous>", "(Li81/a$a$b;Li81/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<i81.a.InterfaceC2135a.b, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90091e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f90091e;
            if (i15 == 0) {
                oq.u.b(obj);
                x.this.d9(i81.a.n.f89953a);
                xw.b<i81.a.InterfaceC2135a> bVarY1 = x.this.Y1();
                i81.a.InterfaceC2135a.b bVar = i81.a.InterfaceC2135a.b.f89931a;
                this.f90091e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(i81.a.InterfaceC2135a.b bVar, State state, tq.e<? super oq.i0> eVar) {
            return x.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li81/a$a$a;", "<unused var>", "Li81/b;", "Loq/i0;", "<anonymous>", "(Li81/a$a$a;Li81/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<i81.a.InterfaceC2135a.C2136a, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90093e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f90093e;
            if (i15 == 0) {
                oq.u.b(obj);
                x.this.d9(i81.a.n.f89953a);
                xw.b<i81.a.InterfaceC2135a> bVarY1 = x.this.Y1();
                i81.a.InterfaceC2135a.C2136a c2136a = i81.a.InterfaceC2135a.C2136a.f89930a;
                this.f90093e = 1;
                if (bVarY1.F(c2136a, this) == objE) {
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
        public final Object w(i81.a.InterfaceC2135a.C2136a c2136a, State state, tq.e<? super oq.i0> eVar) {
            return x.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$f;", "action", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<i81.a.OnFirstNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90097g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i81.a.OnFirstNameChanged onFirstNameChanged, State state) {
            return State.b(state, new FieldItem(hz.b.C2039b.f86846c, onFirstNameChanged.getFirstName()), null, null, null, null, null, null, false, false, null, false, null, false, 8190, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i81.a.OnFirstNameChanged onFirstNameChanged = (i81.a.OnFirstNameChanged) this.f90096f;
            k10.c0 c0Var = (k10.c0) this.f90097g;
            uq.b.e();
            if (this.f90095e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i81.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.m.O(onFirstNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.OnFirstNameChanged onFirstNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = new m(eVar);
            mVar.f90096f = onFirstNameChanged;
            mVar.f90097g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$m;", "action", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<i81.a.OnSecondNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90100g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i81.a.OnSecondNameChanged onSecondNameChanged, State state) {
            return State.b(state, null, new FieldItem(hz.b.C2039b.f86846c, onSecondNameChanged.getSecondName()), null, null, null, null, null, false, false, null, false, null, false, 8189, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i81.a.OnSecondNameChanged onSecondNameChanged = (i81.a.OnSecondNameChanged) this.f90099f;
            k10.c0 c0Var = (k10.c0) this.f90100g;
            uq.b.e();
            if (this.f90098e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i81.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.n.O(onSecondNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.OnSecondNameChanged onSecondNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = new n(eVar);
            nVar.f90099f = onSecondNameChanged;
            nVar.f90100g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$j;", "action", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<i81.a.OnOtherNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90102f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90103g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i81.a.OnOtherNameChanged onOtherNameChanged, State state) {
            return State.b(state, null, null, new FieldItem(hz.b.C2039b.f86846c, onOtherNameChanged.getOtherName()), null, null, null, null, false, false, null, false, null, false, 8187, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i81.a.OnOtherNameChanged onOtherNameChanged = (i81.a.OnOtherNameChanged) this.f90102f;
            k10.c0 c0Var = (k10.c0) this.f90103g;
            uq.b.e();
            if (this.f90101e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i81.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.o.O(onOtherNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.OnOtherNameChanged onOtherNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = new o(eVar);
            oVar.f90102f = onOtherNameChanged;
            oVar.f90103g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$g;", "action", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<i81.a.OnLastNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90105f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90106g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i81.a.OnLastNameChanged onLastNameChanged, State state) {
            return State.b(state, null, null, null, new FieldItem(hz.b.C2039b.f86846c, onLastNameChanged.getLastName()), null, null, null, false, false, null, false, null, false, 8183, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i81.a.OnLastNameChanged onLastNameChanged = (i81.a.OnLastNameChanged) this.f90105f;
            k10.c0 c0Var = (k10.c0) this.f90106g;
            uq.b.e();
            if (this.f90104e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i81.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.p.O(onLastNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.OnLastNameChanged onLastNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            p pVar = new p(eVar);
            pVar.f90105f = onLastNameChanged;
            pVar.f90106g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$d;", "action", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<i81.a.OnBirthPlaceChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90109g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i81.a.OnBirthPlaceChanged onBirthPlaceChanged, State state) {
            return State.b(state, null, null, null, null, null, null, new FieldItem(hz.b.C2039b.f86846c, onBirthPlaceChanged.getBirthPlace()), false, false, null, false, null, false, 8127, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i81.a.OnBirthPlaceChanged onBirthPlaceChanged = (i81.a.OnBirthPlaceChanged) this.f90108f;
            k10.c0 c0Var = (k10.c0) this.f90109g;
            uq.b.e();
            if (this.f90107e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: i81.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.q.O(onBirthPlaceChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.OnBirthPlaceChanged onBirthPlaceChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            q qVar = new q(eVar);
            qVar.f90108f = onBirthPlaceChanged;
            qVar.f90109g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li81/a$k;", "action", "Lk10/c0;", "Li81/b;", "state", "Lk10/l;", "<anonymous>", "(Li81/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<i81.a.OnPeselChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90112g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(x xVar, fz.b.LocalDate localDate, i81.a.OnPeselChanged onPeselChanged, State state) {
            return State.b(state, null, null, null, null, new FieldItem(hz.b.C2039b.f86846c, xw.g.b(onPeselChanged.getPesel())), new FieldItem(null, iy.c0.g(xVar.dateFormatter.d(new fz.b.LocalDate(localDate.getDate()), fz.c.DOTTED)), 1, null), null, false, false, null, false, null, false, 7119, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(i81.a.OnPeselChanged onPeselChanged, State state) {
            iy.b0 pesel = onPeselChanged.getPesel();
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            return State.b(state, null, null, null, null, new FieldItem(c2039b, xw.g.b(pesel)), new FieldItem(c2039b, iy.b0.INSTANCE.a()), null, false, false, null, true, null, false, 7119, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i81.a.OnPeselChanged onPeselChanged = (i81.a.OnPeselChanged) this.f90111f;
            k10.c0 c0Var = (k10.c0) this.f90112g;
            uq.b.e();
            if (this.f90110e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final fz.b.LocalDate localDate = null;
            g14.a.b bVarA = x.this.getInfoFromPeselUC.a(new g14.a.Params(onPeselChanged.getPesel(), null));
            if (bVarA instanceof g14.a.b.Success) {
                localDate = new fz.b.LocalDate(((g14.a.b.Success) bVarA).getBirthDate());
            } else if (!fr.t.c(bVarA, g14.a.b.C1568a.f69766a) && !fr.t.c(bVarA, g14.a.b.C1569b.f69767a)) {
                throw new oq.p();
            }
            if (localDate != null) {
                final x xVar = x.this;
                k10.l lVarB = c0Var.b(new er.l() { // from class: i81.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.r.V(xVar, localDate, onPeselChanged, (State) obj2);
                    }
                });
                if (lVarB != null) {
                    return lVarB;
                }
            }
            return c0Var.b(new er.l() { // from class: i81.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.r.X(onPeselChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(i81.a.OnPeselChanged onPeselChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            r rVar = x.this.new r(eVar);
            rVar.f90111f = onPeselChanged;
            rVar.f90112g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    public x(yy.a aVar, j81.c cVar, ez.e eVar, ez.c cVar2, l61.s sVar, l61.q qVar, j14.m mVar, l61.e eVar2, g14.a aVar2, l61.d dVar, k81.a aVar3) {
        iy.b0 pesel;
        String strE;
        iy.b0 birthPlace;
        fz.b.LocalDate birthDate;
        iy.b0 pesel2;
        iy.b0 lastName;
        iy.b0 otherName;
        iy.b0 secondName;
        iy.b0 firstName;
        this.mapper = cVar;
        this.dateFormatter = eVar;
        this.dateConverter = cVar2;
        this.isNameValidUC = sVar;
        this.isLastNameValidUC = qVar;
        this.checkPeselNumberCorrectUC = mVar;
        this.checkIsPlaceOfBirthCorrectUC = eVar2;
        this.getInfoFromPeselUC = aVar2;
        this.checkIsDateOfBirthValidUC = dVar;
        this.setupData = aVar3;
        k81.a.EnterChildSetupData enterChildSetupDataE0 = aVar3.e0();
        i61.n enterChildFormData = enterChildSetupDataE0.getEnterChildFormData();
        String strE2 = (enterChildFormData == null || (firstName = enterChildFormData.getFirstName()) == null) ? null : iy.c0.e(firstName);
        FieldItem fieldItem = new FieldItem(null, iy.c0.g(strE2 == null ? "" : strE2), 1, null);
        String strE3 = (enterChildFormData == null || (secondName = enterChildFormData.getSecondName()) == null) ? null : iy.c0.e(secondName);
        FieldItem fieldItem2 = new FieldItem(null, iy.c0.g(strE3 == null ? "" : strE3), 1, null);
        String strE4 = (enterChildFormData == null || (otherName = enterChildFormData.getOtherName()) == null) ? null : iy.c0.e(otherName);
        FieldItem fieldItem3 = new FieldItem(null, iy.c0.g(strE4 == null ? "" : strE4), 1, null);
        String strE5 = (enterChildFormData == null || (lastName = enterChildFormData.getLastName()) == null) ? null : iy.c0.e(lastName);
        FieldItem fieldItem4 = new FieldItem(null, iy.c0.g(strE5 == null ? "" : strE5), 1, null);
        FieldItem fieldItem5 = new FieldItem(null, xw.g.b((enterChildFormData == null || (pesel2 = enterChildFormData.getPesel()) == null) ? xw.g.INSTANCE.a() : pesel2), 1, null);
        FieldItem fieldItem6 = (enterChildFormData == null || (birthDate = enterChildFormData.getBirthDate()) == null) ? null : new FieldItem(null, iy.c0.g(eVar.d(new fz.b.LocalDate(birthDate.getDate()), fz.c.DOTTED)), 1, null);
        String strE6 = (enterChildFormData == null || (birthPlace = enterChildFormData.getBirthPlace()) == null) ? null : iy.c0.e(birthPlace);
        FieldItem fieldItem7 = new FieldItem(null, iy.c0.g(strE6 == null ? "" : strE6), 1, null);
        boolean noNameSwitchChecked = enterChildFormData != null ? enterChildFormData.getNoNameSwitchChecked() : false;
        boolean noLastNameSwitchChecked = enterChildFormData != null ? enterChildFormData.getNoLastNameSwitchChecked() : false;
        i61.t whoAgrees = enterChildSetupDataE0.getWhoAgrees();
        State state = new State(fieldItem, fieldItem2, fieldItem3, fieldItem4, fieldItem5, fieldItem6, fieldItem7, noNameSwitchChecked, noLastNameSwitchChecked, whoAgrees == null ? i61.t.PARENT : whoAgrees, enterChildFormData == null || (pesel = enterChildFormData.getPesel()) == null || (strE = iy.c0.e(pesel)) == null || strE.length() == 0, new FieldItem(null, Boolean.valueOf(enterChildFormData != null ? enterChildFormData.getCitizenshipCheckBoxChecked() : false), 1, null), false);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: i81.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.O9(this.f90031a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), D9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i81.c.Data D9(State state) {
        return this.mapper.b(new j81.c.Params(state, b9(i81.a.InterfaceC2135a.C2136a.f89930a), b9(i81.a.InterfaceC2135a.b.f89931a), b9(i81.a.b.f89934a), new er.l() { // from class: i81.n
            @Override // er.l
            public final Object b(Object obj) {
                return x.E9(this.f90020a, (String) obj);
            }
        }, new er.l() { // from class: i81.o
            @Override // er.l
            public final Object b(Object obj) {
                return x.F9(this.f90022a, (String) obj);
            }
        }, new er.l() { // from class: i81.p
            @Override // er.l
            public final Object b(Object obj) {
                return x.G9(this.f90024a, (String) obj);
            }
        }, new er.l() { // from class: i81.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.H9(this.f90025a, (String) obj);
            }
        }, new a(), new er.l() { // from class: i81.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.I9(this.f90026a, (String) obj);
            }
        }, new er.l() { // from class: i81.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.J9(this.f90027a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: i81.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.K9(this.f90028a, ((Boolean) obj).booleanValue());
            }
        }, b9(i81.a.o.f89954a), new er.l() { // from class: i81.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.L9(this.f90029a, ((Boolean) obj).booleanValue());
            }
        }, b9(i81.a.l.f89950a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(x xVar, String str) {
        xVar.d9(new i81.a.OnFirstNameChanged(iy.c0.g(str)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(x xVar, String str) {
        xVar.d9(new i81.a.OnSecondNameChanged(iy.c0.g(str)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(x xVar, String str) {
        xVar.d9(new i81.a.OnOtherNameChanged(iy.c0.g(str)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(x xVar, String str) {
        xVar.d9(new i81.a.OnLastNameChanged(iy.c0.g(str)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(x xVar, String str) {
        xVar.d9(new i81.a.OnBirthPlaceChanged(iy.c0.g(str)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(x xVar, boolean z15) {
        xVar.d9(new i81.a.OnNoNameSwitchChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(x xVar, boolean z15) {
        xVar.d9(new i81.a.OnNoLastNameSwitchChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(x xVar, boolean z15) {
        xVar.d9(new i81.a.OnCitizenshipCheckBoxChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> FieldItem<T> M9(FieldItem<T> fieldItem, hz.b bVar) {
        return FieldItem.b(fieldItem, bVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: i81.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.P9(this.f90030a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(x xVar, k10.z zVar) {
        j jVar = xVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(i81.a.b.class), oVar, jVar);
        zVar.x(q0.c(i81.a.InterfaceC2135a.b.class), oVar, xVar.new k(null));
        zVar.x(q0.c(i81.a.InterfaceC2135a.C2136a.class), oVar, xVar.new l(null));
        zVar.v(q0.c(i81.a.OnFirstNameChanged.class), oVar, new m(null));
        zVar.v(q0.c(i81.a.OnSecondNameChanged.class), oVar, new n(null));
        zVar.v(q0.c(i81.a.OnOtherNameChanged.class), oVar, new o(null));
        zVar.v(q0.c(i81.a.OnLastNameChanged.class), oVar, new p(null));
        zVar.v(q0.c(i81.a.OnBirthPlaceChanged.class), oVar, new q(null));
        zVar.v(q0.c(i81.a.OnPeselChanged.class), oVar, xVar.new r(null));
        zVar.v(q0.c(i81.a.OnNoNameSwitchChanged.class), oVar, new c(null));
        zVar.v(q0.c(i81.a.OnNoLastNameSwitchChanged.class), oVar, new d(null));
        zVar.v(q0.c(i81.a.OnBirthDateChanged.class), oVar, new e(null));
        zVar.x(q0.c(i81.a.o.class), oVar, xVar.new f(null));
        zVar.v(q0.c(i81.a.OnCitizenshipCheckBoxChanged.class), oVar, new g(null));
        zVar.x(q0.c(i81.a.n.class), oVar, xVar.new h(null));
        zVar.v(q0.c(i81.a.l.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final iy.b0 Q9(iy.b0 b0Var, boolean z15) {
        return z15 ? b0Var : iy.b0.INSTANCE.a();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: N9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(k81.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<i81.a.InterfaceC2135a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, i81.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i81.c.Data> getState() {
        return this.state;
    }
}

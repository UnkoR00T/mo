package a73;

import fr.q0;
import jb4.PayloadErrorData;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B[\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010(\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020&H\u0082@¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u0004\u0018\u00010-*\u00020&H\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R,\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR \u0010K\u001a\b\u0012\u0004\u0012\u00020F0E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR&\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0L8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bQ\u0010C\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"La73/x;", "Ll00/g;", "La73/j;", "", "La73/k;", "Lb73/d;", "addPhoneNumberMapper", "Lib4/c;", "genericDomainErrorMapper", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "Lj14/n;", "checkPhoneNumberCorrectUC", "Lyy/a;", "stateMachineFactory", "Lfj0/d;", "createPhoneContactDetailUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Ld74/b;", "getWKTokenForMIDUC", "La73/i;", "setupData", "<init>", "(Lb73/d;Lib4/c;La14/w;Li70/e;Lj14/n;Lyy/a;Lfj0/d;Lac4/a;Ld74/b;La73/i;)V", "", "url", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "B9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "state", "La73/k$a;", "w9", "(La73/j;)La73/k$a;", "Ldx/b;", "", "v9", "(Ldx/b;)Z", "domainError", "t9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Ljb4/f;", "s9", "(Ldx/b;)Ljb4/f;", "b", "Lb73/d;", "c", "Lib4/c;", "d", "La14/w;", "e", "Li70/e;", "f", "Lj14/n;", "g", "La73/j;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "La73/c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<State, Object> implements k, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b73.d addPhoneNumberMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j14.n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a73.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<k.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f4162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f4163e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f4165g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f4163e = obj;
            this.f4165g |= PKIFailureInfo.systemUnavail;
            return x.this.B9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<k.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f4166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f4167b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f4168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f4169b;

            /* JADX INFO: renamed from: a73.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0077a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f4170d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f4171e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f4172f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f4174h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f4175j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f4176k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f4177l;

                public C0077a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f4170d = obj;
                    this.f4171e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f4168a = hVar;
                this.f4169b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0077a c0077a;
                if (eVar instanceof C0077a) {
                    c0077a = (C0077a) eVar;
                    int i15 = c0077a.f4171e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0077a.f4171e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0077a = new C0077a(eVar);
                    }
                } else {
                    c0077a = new C0077a(eVar);
                }
                Object obj2 = c0077a.f4170d;
                Object objE = uq.b.e();
                int i16 = c0077a.f4171e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f4168a;
                    k.Data dataW9 = this.f4169b.w9((State) obj);
                    c0077a.f4172f = vq.j.a(obj);
                    c0077a.f4174h = vq.j.a(c0077a);
                    c0077a.f4175j = vq.j.a(obj);
                    c0077a.f4176k = vq.j.a(hVar);
                    c0077a.f4177l = 0;
                    c0077a.f4171e = 1;
                    if (hVar.F(dataW9, c0077a) == objE) {
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
            this.f4166a = gVar;
            this.f4167b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super k.Data> hVar, tq.e eVar) {
            Object objA = this.f4166a.a(new a(hVar, this.f4167b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La73/f;", "action", "Lk10/c0;", "La73/j;", "state", "Lk10/l;", "<anonymous>", "(La73/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnPrefixChange, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4179f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f4180g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnPrefixChange onPrefixChange, State state) {
            iy.b0 prefix = onPrefixChange.getPrefix();
            hz.b.d dVar = hz.b.d.f86848c;
            return State.b(state, dVar, dVar, false, prefix, null, null, null, false, false, false, null, false, 4084, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPrefixChange onPrefixChange = (OnPrefixChange) this.f4179f;
            k10.c0 c0Var = (k10.c0) this.f4180g;
            uq.b.e();
            if (this.f4178e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a73.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.c.O(onPrefixChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPrefixChange onPrefixChange, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f4179f = onPrefixChange;
            cVar.f4180g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La73/e;", "action", "Lk10/c0;", "La73/j;", "state", "Lk10/l;", "<anonymous>", "(La73/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnPhoneNumberChange, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4181e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4182f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f4183g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnPhoneNumberChange onPhoneNumberChange, State state) {
            iy.b0 number = onPhoneNumberChange.getNumber();
            hz.b.d dVar = hz.b.d.f86848c;
            return State.b(state, dVar, dVar, false, null, number, null, null, false, false, false, null, false, 4076, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPhoneNumberChange onPhoneNumberChange = (OnPhoneNumberChange) this.f4182f;
            k10.c0 c0Var = (k10.c0) this.f4183g;
            uq.b.e();
            if (this.f4181e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a73.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.d.O(onPhoneNumberChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPhoneNumberChange onPhoneNumberChange, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f4182f = onPhoneNumberChange;
            dVar.f4183g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La73/b;", "action", "Lk10/c0;", "La73/j;", "state", "Lk10/l;", "<anonymous>", "(La73/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<CheckGdprCheckbox, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4185f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f4186g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(CheckGdprCheckbox checkGdprCheckbox, State state) {
            return State.b(state, null, null, false, null, null, null, null, checkGdprCheckbox.getGdprChecked(), false, false, null, false, 3455, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final CheckGdprCheckbox checkGdprCheckbox = (CheckGdprCheckbox) this.f4185f;
            k10.c0 c0Var = (k10.c0) this.f4186g;
            uq.b.e();
            if (this.f4184e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a73.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.e.O(checkGdprCheckbox, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(CheckGdprCheckbox checkGdprCheckbox, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f4185f = checkGdprCheckbox;
            eVar2.f4186g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La73/g;", "action", "Lk10/c0;", "La73/j;", "state", "Lk10/l;", "<anonymous>", "(La73/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a73.g, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4188f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, false, null, null, null, null, false, false, false, null, false, 3071, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f4188f;
            uq.b.e();
            if (this.f4187e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a73.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.f.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a73.g gVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f4188f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La73/d;", "<unused var>", "Lk10/c0;", "La73/j;", "state", "Lk10/l;", "<anonymous>", "(La73/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a73.d, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f4189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f4190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f4191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f4192h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f4193j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f4194k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ac4.a f4196m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ d74.b f4197n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ fj0.d f4198p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "La73/j;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f4199e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f4200f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f4201g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4202h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f4203j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ d74.b f4204k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ k10.c0<State> f4205l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ fj0.d f4206m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ x f4207n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d74.b bVar, k10.c0<State> c0Var, fj0.d dVar, x xVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f4204k = bVar;
                this.f4205l = c0Var;
                this.f4206m = dVar;
                this.f4207n = xVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(State state) {
                return State.b(state, null, null, false, null, null, null, null, false, false, false, null, false, 2047, null);
            }

            /* JADX WARN: Code duplicated, block: B:30:0x00dc  */
            /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
            /* JADX WARN: Code duplicated, block: B:35:0x010a  */
            /* JADX WARN: Code duplicated, block: B:38:0x0123  */
            /* JADX WARN: Code duplicated, block: B:40:0x0127  */
            /* JADX WARN: Code duplicated, block: B:45:0x0185  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
            
                if (r2 == r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
            
                if (r4.F(r6, r20) == r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0120, code lost:
            
                if (r6.t9(r3, r20) == r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0176, code lost:
            
                if (r5.F(r6, r20) == r1) goto L42;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r21) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 401
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a73.x.g.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f4204k, this.f4205l, this.f4206m, this.f4207n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ac4.a aVar, d74.b bVar, fj0.d dVar, tq.e<? super g> eVar) {
            super(3, eVar);
            this.f4196m = aVar;
            this.f4197n = bVar;
            this.f4198p = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(k10.c0 c0Var, boolean z15, boolean z16, hz.b bVar, hz.b bVar2, State state) {
            return State.b(state, bVar, bVar2, false, null, null, null, null, ((State) c0Var.a()).getIsGdprCheckboxChecked(), false, !((State) c0Var.a()).getIsGdprCheckboxChecked(), (z15 && z16) ? i0.STATEMENT : i0.PHONE, false, 2428, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, null, false, null, null, null, null, false, false, false, null, true, 2047, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00fd, code lost:
        
            if (r13 == r0) goto L33;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a73.x.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(a73.d dVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = x.this.new g(this.f4196m, this.f4197n, this.f4198p, eVar);
            gVar.f4194k = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La73/a;", "<unused var>", "La73/j;", "Loq/i0;", "<anonymous>", "(La73/a;La73/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a73.a, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4208e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f4208e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a73.c> bVarY1 = x.this.Y1();
                a73.c.a aVar = a73.c.a.f4070a;
                this.f4208e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(a73.a aVar, State state, tq.e<? super oq.i0> eVar) {
            return x.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La73/h;", "action", "La73/j;", "<unused var>", "Loq/i0;", "<anonymous>", "(La73/h;La73/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<OpenGdprRegulationInWeb, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4210e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4211f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenGdprRegulationInWeb openGdprRegulationInWeb = (OpenGdprRegulationInWeb) this.f4211f;
            Object objE = uq.b.e();
            int i15 = this.f4210e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                String url = openGdprRegulationInWeb.getUrl();
                this.f4211f = vq.j.a(openGdprRegulationInWeb);
                this.f4210e = 1;
                if (xVar.B9(url, this) == objE) {
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
        public final Object w(OpenGdprRegulationInWeb openGdprRegulationInWeb, State state, tq.e<? super oq.i0> eVar) {
            i iVar = x.this.new i(eVar);
            iVar.f4211f = openGdprRegulationInWeb;
            return iVar.J(oq.i0.f148189a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042  */
    public x(b73.d dVar, ib4.c cVar, a14.w wVar, i70.e eVar, j14.n nVar, yy.a aVar, final fj0.d dVar2, final ac4.a aVar2, final d74.b bVar, SetupData setupData) {
        iy.b0 b0VarG;
        String strE;
        this.addPhoneNumberMapper = dVar;
        this.genericDomainErrorMapper = cVar;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.checkPhoneNumberCorrectUC = nVar;
        boolean isGdprNeeded = setupData.getIsGdprNeeded();
        iy.b0 previousPrefix = setupData.getPreviousPrefix();
        if (previousPrefix == null || (strE = iy.c0.e(previousPrefix)) == null) {
            b0VarG = null;
        } else {
            String str = '+' + strE;
            if (str != null) {
                b0VarG = iy.c0.g(str);
            } else {
                b0VarG = null;
            }
        }
        State state = new State(null, null, false, null, null, b0VarG, setupData.getPreviousPhoneNumber(), false, isGdprNeeded, false, null, false, 3743, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: a73.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.D9(this.f4149a, aVar2, bVar, dVar2, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), w9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(x xVar, String str) {
        xVar.d9(new OpenGdprRegulationInWeb(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B9(String str, tq.e<? super dx.i<dx.b.Business, oq.i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f4165g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f4165g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f4163e;
        Object objE = uq.b.e();
        int i16 = aVar.f4165g;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.w wVar = this.openUrlIntentUseCase;
            a14.w.Params params = new a14.w.Params(str, false, 2, null);
            aVar.f4162d = vq.j.a(str);
            aVar.f4165g = 1;
            objC = wVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            this.globalSnackBarManager.y(new p50.a.Default(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, 6, null));
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(final x xVar, final ac4.a aVar, final d74.b bVar, final fj0.d dVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: a73.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.E9(this.f4140a, aVar, bVar, dVar, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(x xVar, ac4.a aVar, d74.b bVar, fj0.d dVar, k10.z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnPrefixChange.class), oVar, cVar);
        zVar.v(q0.c(OnPhoneNumberChange.class), oVar, new d(null));
        zVar.v(q0.c(CheckGdprCheckbox.class), oVar, new e(null));
        zVar.v(q0.c(a73.g.class), oVar, new f(null));
        zVar.v(q0.c(a73.d.class), oVar, xVar.new g(aVar, bVar, dVar, null));
        zVar.x(q0.c(a73.a.class), oVar, xVar.new h(null));
        zVar.x(q0.c(OpenGdprRegulationInWeb.class), oVar, xVar.new i(null));
        return oq.i0.f148189a;
    }

    private final PayloadErrorData s9(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t9(dx.b bVar, tq.e<? super oq.i0> eVar) {
        Object objF = Y1().F(new a73.c.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: a73.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.u9(this.f4148a, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(x xVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            xVar.d9(a73.d.f4081a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v9(dx.b bVar) {
        PayloadErrorData payloadErrorDataS9 = s9(bVar);
        return fr.t.c(payloadErrorDataS9 != null ? payloadErrorDataS9.getCode() : null, "EDITION_ATTEMPTS_LIMIT_EXCEED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k.Data w9(State state) {
        return this.addPhoneNumberMapper.b(new b73.d.Params(state, b9(a73.a.f4067a), new er.l() { // from class: a73.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.x9(this.f4144a, (iy.b0) obj);
            }
        }, new er.l() { // from class: a73.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.y9(this.f4145a, (iy.b0) obj);
            }
        }, new er.l() { // from class: a73.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.z9(this.f4146a, ((Boolean) obj).booleanValue());
            }
        }, b9(a73.g.f4086a), b9(a73.d.f4081a), new er.l() { // from class: a73.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.A9(this.f4147a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(x xVar, iy.b0 b0Var) {
        xVar.d9(new OnPrefixChange(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(x xVar, iy.b0 b0Var) {
        xVar.d9(new OnPhoneNumberChange(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(x xVar, boolean z15) {
        xVar.d9(new CheckGdprCheckbox(z15));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<a73.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<k.Data> getState() {
        return this.state;
    }
}

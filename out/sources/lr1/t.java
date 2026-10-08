package lr1;

import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0011\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Llr1/t;", "Ll00/g;", "Llr1/b;", "Llr1/a;", "Llr1/c;", "", "Lyy/a;", "stateMachineFactory", "Llr1/f;", "mapper", "Llr1/d0;", "verifyKeyguardRsaUseCase", "Llr1/c0;", "verifyKeyguardAesUseCase", "<init>", "(Lyy/a;Llr1/f;Llr1/d0;Llr1/c0;)V", "Lk10/c0;", "state", "Lk10/l;", "E9", "(Llr1/t;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "C9", "Llr1/f$a;", "t9", "(Llr1/b;)Llr1/f$a;", "b", "Llr1/f;", "c", "Llr1/d0;", "d", "Llr1/c0;", "e", "Llr1/b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Llr1/a$d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Llr1/c$a;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<State, lr1.a> implements lr1.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lr1.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d0 verifyKeyguardRsaUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c0 verifyKeyguardAesUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, lr1.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<lr1.a.d> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<lr1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<lr1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f119899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f119900b;

        /* JADX INFO: renamed from: lr1.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2920a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f119901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f119902b;

            /* JADX INFO: renamed from: lr1.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2921a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f119903d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f119904e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f119905f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f119907h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f119908j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f119909k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f119910l;

                public C2921a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f119903d = obj;
                    this.f119904e |= PKIFailureInfo.systemUnavail;
                    return C2920a.this.F(null, this);
                }
            }

            public C2920a(mu.h hVar, t tVar) {
                this.f119901a = hVar;
                this.f119902b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2921a c2921a;
                if (eVar instanceof C2921a) {
                    c2921a = (C2921a) eVar;
                    int i15 = c2921a.f119904e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2921a.f119904e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2921a = new C2921a(eVar);
                    }
                } else {
                    c2921a = new C2921a(eVar);
                }
                Object obj2 = c2921a.f119903d;
                Object objE = uq.b.e();
                int i16 = c2921a.f119904e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f119901a;
                    lr1.c.Data dataB = this.f119902b.mapper.b(this.f119902b.t9((State) obj));
                    c2921a.f119905f = vq.j.a(obj);
                    c2921a.f119907h = vq.j.a(c2921a);
                    c2921a.f119908j = vq.j.a(obj);
                    c2921a.f119909k = vq.j.a(hVar);
                    c2921a.f119910l = 0;
                    c2921a.f119904e = 1;
                    if (hVar.F(dataB, c2921a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f119899a = gVar;
            this.f119900b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super lr1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f119899a.a(new C2920a(hVar, this.f119900b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llr1/a$d$a;", "action", "Llr1/b;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Llr1/a$d$a;Llr1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<lr1.a.d.C2919a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119912f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lr1.a.d.C2919a c2919a = (lr1.a.d.C2919a) this.f119912f;
            Object objE = uq.b.e();
            int i15 = this.f119911e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<lr1.a.d> bVarY1 = t.this.Y1();
                this.f119912f = vq.j.a(c2919a);
                this.f119911e = 1;
                if (bVarY1.F(c2919a, this) == objE) {
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
        public final Object w(lr1.a.d.C2919a c2919a, State state, tq.e<? super i0> eVar) {
            b bVar = t.this.new b(eVar);
            bVar.f119912f = c2919a;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llr1/a$e;", "action", "Lk10/c0;", "Llr1/b;", "state", "Lk10/l;", "<anonymous>", "(Llr1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<lr1.a.SecretInputChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f119916g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, lr1.a.SecretInputChanged secretInputChanged, State state) {
            return State.b((State) c0Var.a(), secretInputChanged.getValue(), null, 0, null, null, false, false, 126, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lr1.a.SecretInputChanged secretInputChanged = (lr1.a.SecretInputChanged) this.f119915f;
            final k10.c0 c0Var = (k10.c0) this.f119916g;
            uq.b.e();
            if (this.f119914e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: lr1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.c.O(c0Var, secretInputChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lr1.a.SecretInputChanged secretInputChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f119915f = secretInputChanged;
            cVar.f119916g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llr1/a$a;", "action", "Lk10/c0;", "Llr1/b;", "state", "Lk10/l;", "<anonymous>", "(Llr1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<lr1.a.AliasInputChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119918f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f119919g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, lr1.a.AliasInputChanged aliasInputChanged, State state) {
            return State.b((State) c0Var.a(), null, aliasInputChanged.getValue(), 0, null, null, false, false, 125, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lr1.a.AliasInputChanged aliasInputChanged = (lr1.a.AliasInputChanged) this.f119918f;
            final k10.c0 c0Var = (k10.c0) this.f119919g;
            uq.b.e();
            if (this.f119917e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: lr1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O(c0Var, aliasInputChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lr1.a.AliasInputChanged aliasInputChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f119918f = aliasInputChanged;
            dVar.f119919g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llr1/a$g;", "action", "Lk10/c0;", "Llr1/b;", "state", "Lk10/l;", "<anonymous>", "(Llr1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<lr1.a.TimeoutInputChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f119922g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, lr1.a.TimeoutInputChanged timeoutInputChanged, State state) {
            return State.b((State) c0Var.a(), null, null, timeoutInputChanged.getValue(), null, null, false, false, 123, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lr1.a.TimeoutInputChanged timeoutInputChanged = (lr1.a.TimeoutInputChanged) this.f119921f;
            final k10.c0 c0Var = (k10.c0) this.f119922g;
            uq.b.e();
            if (this.f119920e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: lr1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(c0Var, timeoutInputChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lr1.a.TimeoutInputChanged timeoutInputChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f119921f = timeoutInputChanged;
            eVar2.f119922g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llr1/a$h;", "action", "Lk10/c0;", "Llr1/b;", "state", "Lk10/l;", "<anonymous>", "(Llr1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<lr1.a.UseBiometricChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119924f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f119925g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, lr1.a.UseBiometricChanged useBiometricChanged, State state) {
            return State.b((State) c0Var.a(), null, null, 0, null, null, useBiometricChanged.getUseBiometric(), false, 95, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lr1.a.UseBiometricChanged useBiometricChanged = (lr1.a.UseBiometricChanged) this.f119924f;
            final k10.c0 c0Var = (k10.c0) this.f119925g;
            uq.b.e();
            if (this.f119923e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: lr1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.f.O(c0Var, useBiometricChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lr1.a.UseBiometricChanged useBiometricChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f119924f = useBiometricChanged;
            fVar.f119925g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llr1/a$f;", "action", "Lk10/c0;", "Llr1/b;", "state", "Lk10/l;", "<anonymous>", "(Llr1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<lr1.a.SkipKeyCreationChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119927f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f119928g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, lr1.a.SkipKeyCreationChanged skipKeyCreationChanged, State state) {
            return State.b((State) c0Var.a(), null, null, 0, null, null, false, skipKeyCreationChanged.getSkip(), 63, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lr1.a.SkipKeyCreationChanged skipKeyCreationChanged = (lr1.a.SkipKeyCreationChanged) this.f119927f;
            final k10.c0 c0Var = (k10.c0) this.f119928g;
            uq.b.e();
            if (this.f119926e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: lr1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.O(c0Var, skipKeyCreationChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lr1.a.SkipKeyCreationChanged skipKeyCreationChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f119927f = skipKeyCreationChanged;
            gVar.f119928g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llr1/a$c;", "action", "Lk10/c0;", "Llr1/b;", "state", "Lk10/l;", "<anonymous>", "(Llr1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<lr1.a.c, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119930f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f119930f;
            Object objE = uq.b.e();
            int i15 = this.f119929e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            t tVar = t.this;
            this.f119930f = vq.j.a(c0Var);
            this.f119929e = 1;
            Object objE9 = tVar.E9(tVar, c0Var, this);
            return objE9 == objE ? objE : objE9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lr1.a.c cVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = t.this.new h(eVar);
            hVar.f119930f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llr1/a$b;", "action", "Lk10/c0;", "Llr1/b;", "state", "Lk10/l;", "<anonymous>", "(Llr1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<lr1.a.b, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119933f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f119933f;
            Object objE = uq.b.e();
            int i15 = this.f119932e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            t tVar = t.this;
            this.f119933f = vq.j.a(c0Var);
            this.f119932e = 1;
            Object objC9 = tVar.C9(tVar, c0Var, this);
            return objC9 == objE ? objE : objC9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lr1.a.b bVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = t.this.new i(eVar);
            iVar.f119933f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f119935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f119936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119937f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f119939h;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f119937f = obj;
            this.f119939h |= PKIFailureInfo.systemUnavail;
            return t.this.C9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f119940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f119941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119942f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f119944h;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f119942f = obj;
            this.f119944h |= PKIFailureInfo.systemUnavail;
            return t.this.E9(null, null, this);
        }
    }

    public t(yy.a aVar, lr1.f fVar, d0 d0Var, c0 c0Var) {
        this.mapper = fVar;
        this.verifyKeyguardRsaUseCase = d0Var;
        this.verifyKeyguardAesUseCase = c0Var;
        iy.b0 b0VarA = iy.b0.INSTANCE.a();
        iy.a0.Companion companion = iy.a0.INSTANCE;
        State state = new State(b0VarA, "testKeyAlias", 1, companion.a(), companion.a(), false, false);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: lr1.k
            @Override // er.l
            public final Object b(Object obj) {
                return t.A9(this.f119883a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), fVar.b(t9(state)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: lr1.l
            @Override // er.l
            public final Object b(Object obj) {
                return t.B9(this.f119884a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lr1.a.d.C2919a.class), oVar, bVar);
        zVar.v(q0.c(lr1.a.SecretInputChanged.class), oVar, new c(null));
        zVar.v(q0.c(lr1.a.AliasInputChanged.class), oVar, new d(null));
        zVar.v(q0.c(lr1.a.TimeoutInputChanged.class), oVar, new e(null));
        zVar.v(q0.c(lr1.a.UseBiometricChanged.class), oVar, new f(null));
        zVar.v(q0.c(lr1.a.SkipKeyCreationChanged.class), oVar, new g(null));
        zVar.v(q0.c(lr1.a.c.class), oVar, tVar.new h(null));
        zVar.v(q0.c(lr1.a.b.class), oVar, tVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C9(t tVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        j jVar;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f119939h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f119939h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object objJ = jVar.f119937f;
        Object objE = uq.b.e();
        int i16 = jVar.f119939h;
        if (i16 == 0) {
            oq.u.b(objJ);
            c0 c0Var2 = tVar.verifyKeyguardAesUseCase;
            c0.Params params = new c0.Params(c0Var.a().getSecret(), c0Var.a().getAlias(), c0Var.a().getTimeout(), c0Var.a().getUseBiometric(), c0Var.a().getSkipKeyCreation());
            jVar.f119935d = vq.j.a(tVar);
            jVar.f119936e = c0Var;
            jVar.f119939h = 1;
            objJ = c0Var2.j(params, jVar);
            if (objJ == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) jVar.f119936e;
            oq.u.b(objJ);
        }
        dx.i iVar = (dx.i) objJ;
        if (!(iVar instanceof dx.i.Left)) {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final c0.Result result = (c0.Result) ((dx.i.Right) iVar).b();
            return c0Var.b(new er.l() { // from class: lr1.r
                @Override // er.l
                public final Object b(Object obj) {
                    return t.D9(result, (State) obj);
                }
            });
        }
        dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
        px.f.f163100a.b("AES Keyguard test error: " + bVar, px.c.a(this));
        return c0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State D9(c0.Result result, State state) {
        return State.b(state, null, null, 0, result.getEncryptedData(), result.getDecryptedData(), false, false, 103, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E9(t tVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f119944h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f119944h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objH = kVar.f119942f;
        Object objE = uq.b.e();
        int i16 = kVar.f119944h;
        if (i16 == 0) {
            oq.u.b(objH);
            d0 d0Var = tVar.verifyKeyguardRsaUseCase;
            d0.Params params = new d0.Params(c0Var.a().getSecret(), c0Var.a().getAlias(), c0Var.a().getTimeout(), c0Var.a().getUseBiometric(), c0Var.a().getSkipKeyCreation());
            kVar.f119940d = vq.j.a(tVar);
            kVar.f119941e = c0Var;
            kVar.f119944h = 1;
            objH = d0Var.h(params, kVar);
            if (objH == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) kVar.f119941e;
            oq.u.b(objH);
        }
        dx.i iVar = (dx.i) objH;
        if (!(iVar instanceof dx.i.Left)) {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final d0.Result result = (d0.Result) ((dx.i.Right) iVar).b();
            return c0Var.b(new er.l() { // from class: lr1.s
                @Override // er.l
                public final Object b(Object obj) {
                    return t.F9(result, (State) obj);
                }
            });
        }
        dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
        px.f.f163100a.b("RSA Keyguard test error: " + bVar, px.c.a(this));
        return c0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State F9(d0.Result result, State state) {
        return State.b(state, null, null, 0, result.getEncryptedData(), result.getDecryptedData(), false, false, 103, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lr1.f.Params t9(State state) {
        return new lr1.f.Params(state, b9(lr1.a.d.C2919a.f119716a), new er.l() { // from class: lr1.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.u9(this.f119885a, (iy.b0) obj);
            }
        }, new er.l() { // from class: lr1.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.v9(this.f119886a, (String) obj);
            }
        }, new er.l() { // from class: lr1.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.w9(this.f119887a, ((Integer) obj).intValue());
            }
        }, b9(lr1.a.c.f119715a), b9(lr1.a.b.f119714a), new er.l() { // from class: lr1.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.x9(this.f119888a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: lr1.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.y9(this.f119889a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(t tVar, iy.b0 b0Var) {
        tVar.d9(new lr1.a.SecretInputChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(t tVar, String str) {
        tVar.d9(new lr1.a.AliasInputChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(t tVar, int i15) {
        tVar.d9(new lr1.a.TimeoutInputChanged(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(t tVar, boolean z15) {
        tVar.d9(new lr1.a.UseBiometricChanged(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(t tVar, boolean z15) {
        tVar.d9(new lr1.a.SkipKeyCreationChanged(z15));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<lr1.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, lr1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<lr1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}

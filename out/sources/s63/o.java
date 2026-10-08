package s63;

import fr.q0;
import iy.b0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R,\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003028\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0A8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u00108\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Ls63/o;", "Ll00/g;", "Ls63/c;", "Ls63/a;", "Ls63/d;", "", "Lt63/c;", "changeEmailScreenMapper", "Ll63/b;", "contactDetailsNavigationDialogMapper", "Lib4/c;", "genericDomainErrorMapper", "Lj14/a;", "checkEmailCorrectUC", "Lfj0/h;", "updateEmailContactDetailUseCase", "Lfj0/e;", "deleteEmailContactDetailUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Ld74/b;", "getWKTokenForMIDUC", "Lyy/a;", "stateMachineFactory", "Ls63/b;", "setupData", "<init>", "(Lt63/c;Ll63/b;Lib4/c;Lj14/a;Lfj0/h;Lfj0/e;Lac4/a;Ld74/b;Lyy/a;Ls63/b;)V", "state", "Ls63/d$a;", "t9", "(Ls63/c;)Ls63/d$a;", "Ldx/b;", "error", "Liy/b0;", "email", "Ljb4/b;", "q9", "(Ldx/b;Liy/b0;)Ljb4/b;", "b", "Lt63/c;", "c", "Ll63/b;", "d", "Lib4/c;", "e", "Lj14/a;", "f", "Ls63/c;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Ls63/a$e;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, s63.a> implements s63.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t63.c changeEmailScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l63.b contactDetailsNavigationDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, s63.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<s63.a.e> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<s63.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<s63.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f178398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f178399b;

        /* JADX INFO: renamed from: s63.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4573a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f178400a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f178401b;

            /* JADX INFO: renamed from: s63.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4574a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f178402d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f178403e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f178404f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f178406h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f178407j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f178408k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f178409l;

                public C4574a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f178402d = obj;
                    this.f178403e |= PKIFailureInfo.systemUnavail;
                    return C4573a.this.F(null, this);
                }
            }

            public C4573a(mu.h hVar, o oVar) {
                this.f178400a = hVar;
                this.f178401b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4574a c4574a;
                if (eVar instanceof C4574a) {
                    c4574a = (C4574a) eVar;
                    int i15 = c4574a.f178403e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4574a.f178403e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4574a = new C4574a(eVar);
                    }
                } else {
                    c4574a = new C4574a(eVar);
                }
                Object obj2 = c4574a.f178402d;
                Object objE = uq.b.e();
                int i16 = c4574a.f178403e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f178400a;
                    s63.d.Data dataT9 = this.f178401b.t9((State) obj);
                    c4574a.f178404f = vq.j.a(obj);
                    c4574a.f178406h = vq.j.a(c4574a);
                    c4574a.f178407j = vq.j.a(obj);
                    c4574a.f178408k = vq.j.a(hVar);
                    c4574a.f178409l = 0;
                    c4574a.f178403e = 1;
                    if (hVar.F(dataT9, c4574a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f178398a = gVar;
            this.f178399b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super s63.d.Data> hVar, tq.e eVar) {
            Object objA = this.f178398a.a(new C4573a(hVar, this.f178399b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls63/a$f;", "<unused var>", "Ls63/c;", "Loq/i0;", "<anonymous>", "(Ls63/a$f;Ls63/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<s63.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178410e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178410e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s63.a.e> bVarY1 = o.this.Y1();
                s63.a.e.C4571a c4571a = s63.a.e.C4571a.f178337a;
                this.f178410e = 1;
                if (bVarY1.F(c4571a, this) == objE) {
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
        public final Object w(s63.a.f fVar, State state, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls63/a$b;", "action", "Lk10/c0;", "Ls63/c;", "state", "Lk10/l;", "<anonymous>", "(Ls63/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<s63.a.ChangeEmailInputChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f178414g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(s63.a.ChangeEmailInputChange changeEmailInputChange, State state) {
            return State.b(state, hz.b.d.f86848c, changeEmailInputChange.getEmail(), null, false, false, false, 60, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s63.a.ChangeEmailInputChange changeEmailInputChange = (s63.a.ChangeEmailInputChange) this.f178413f;
            c0 c0Var = (c0) this.f178414g;
            uq.b.e();
            if (this.f178412e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: s63.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.c.O(changeEmailInputChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s63.a.ChangeEmailInputChange changeEmailInputChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f178413f = changeEmailInputChange;
            cVar.f178414g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls63/a$g;", "action", "Lk10/c0;", "Ls63/c;", "state", "Lk10/l;", "<anonymous>", "(Ls63/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<s63.a.g, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178416f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, false, false, false, 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f178416f;
            uq.b.e();
            if (this.f178415e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: s63.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.d.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s63.a.g gVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f178416f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls63/a$a;", "action", "Lk10/c0;", "Ls63/c;", "state", "Lk10/l;", "<anonymous>", "(Ls63/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<s63.a.ChangeEmail, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f178417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f178418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f178419g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f178420h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ ac4.a f178422k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ d74.b f178423l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ fj0.h f178424m;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ls63/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f178425e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f178426f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f178427g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f178428h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f178429j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ d74.b f178430k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ c0<State> f178431l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ fj0.h f178432m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ s63.a.ChangeEmail f178433n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ o f178434p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d74.b bVar, c0<State> c0Var, fj0.h hVar, s63.a.ChangeEmail changeEmail, o oVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f178430k = bVar;
                this.f178431l = c0Var;
                this.f178432m = hVar;
                this.f178433n = changeEmail;
                this.f178434p = oVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(State state) {
                return State.b(state, null, null, null, false, false, false, 47, null);
            }

            /* JADX WARN: Code duplicated, block: B:29:0x009e  */
            /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
            /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
            /* JADX WARN: Code duplicated, block: B:39:0x0110  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
            
                if (r12 == r0) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
            
                if (r5.F(r7, r11) == r0) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0101, code lost:
            
                if (r1.F(r5, r11) == r0) goto L36;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: s63.o.e.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f178430k, this.f178431l, this.f178432m, this.f178433n, this.f178434p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ac4.a aVar, d74.b bVar, fj0.h hVar, tq.e<? super e> eVar) {
            super(3, eVar);
            this.f178422k = aVar;
            this.f178423l = bVar;
            this.f178424m = hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(hz.b bVar, State state) {
            return State.b(state, bVar, null, null, false, false, true, 30, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, null, null, false, true, false, 47, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
        
            if (r0 == r11) goto L23;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r19) throws java.lang.Throwable {
            /*
                r18 = this;
                r3 = r18
                java.lang.Object r0 = r3.f178419g
                r8 = r0
                s63.a$a r8 = (s63.a.ChangeEmail) r8
                java.lang.Object r0 = r3.f178420h
                r6 = r0
                k10.c0 r6 = (k10.c0) r6
                java.lang.Object r11 = uq.b.e()
                int r0 = r3.f178418f
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L33
                if (r0 == r2) goto L2d
                if (r0 != r1) goto L25
                java.lang.Object r0 = r3.f178417e
                hz.b r0 = (hz.b) r0
                oq.u.b(r19)
                r0 = r19
                goto Lb4
            L25:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L2d:
                oq.u.b(r19)
                r0 = r19
                goto L58
            L33:
                oq.u.b(r19)
                s63.o r0 = s63.o.this
                j14.a r0 = s63.o.n9(r0)
                j14.a$a r12 = new j14.a$a
                iy.b0 r13 = r8.getEmail()
                r16 = 6
                r17 = 0
                r14 = 0
                r15 = 0
                r12.<init>(r13, r14, r15, r16, r17)
                r3.f178419g = r8
                r3.f178420h = r6
                r3.f178418f = r2
                java.lang.Object r0 = r0.c(r12, r3)
                if (r0 != r11) goto L58
                goto Lb3
            L58:
                hz.b$a r2 = hz.b.INSTANCE
                hz.g r0 = (hz.g) r0
                hz.b r0 = r2.a(r0)
                boolean r2 = r0.a()
                if (r2 != 0) goto L70
                s63.r r1 = new s63.r
                r1.<init>()
                k10.l r0 = r6.b(r1)
                return r0
            L70:
                java.lang.Object r2 = r6.a()
                s63.c r2 = (s63.State) r2
                boolean r2 = r2.getIsEmailSameAsPrevious()
                if (r2 == 0) goto L86
                s63.s r0 = new s63.s
                r0.<init>()
                k10.l r0 = r6.b(r0)
                return r0
            L86:
                r2 = r0
                ac4.a r0 = r3.f178422k
                s63.o$e$a r4 = new s63.o$e$a
                d74.b r5 = r3.f178423l
                fj0.h r7 = r3.f178424m
                s63.o r9 = s63.o.this
                r10 = 0
                r4.<init>(r5, r6, r7, r8, r9, r10)
                java.lang.Object r5 = vq.j.a(r8)
                r3.f178419g = r5
                java.lang.Object r5 = vq.j.a(r6)
                r3.f178420h = r5
                java.lang.Object r2 = vq.j.a(r2)
                r3.f178417e = r2
                r3.f178418f = r1
                r1 = 0
                r2 = r4
                r4 = 1
                r5 = 0
                java.lang.Object r0 = ac4.a.a(r0, r1, r2, r3, r4, r5)
                if (r0 != r11) goto Lb4
            Lb3:
                return r11
            Lb4:
                k10.l r0 = (k10.l) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s63.o.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(s63.a.ChangeEmail changeEmail, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = o.this.new e(this.f178422k, this.f178423l, this.f178424m, eVar);
            eVar2.f178419g = changeEmail;
            eVar2.f178420h = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls63/a$d;", "<unused var>", "Ls63/c;", "Loq/i0;", "<anonymous>", "(Ls63/a$d;Ls63/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<s63.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178435e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178435e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s63.a.e> bVarY1 = o.this.Y1();
                s63.a.e.ShowNavigationDialog showNavigationDialog = new s63.a.e.ShowNavigationDialog(o.this.contactDetailsNavigationDialogMapper.b(new l63.b.Params(m63.a.DELETE_EMAIL, o.this.b9(s63.a.c.f178335a), null, 4, null)));
                this.f178435e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
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
        public final Object w(s63.a.d dVar, State state, tq.e<? super i0> eVar) {
            return o.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls63/a$c;", "<unused var>", "Lk10/c0;", "Ls63/c;", "state", "Lk10/l;", "<anonymous>", "(Ls63/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<s63.a.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ac4.a f178439g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d74.b f178440h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ fj0.e f178441j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ o f178442k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ls63/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f178443e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f178444f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f178445g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f178446h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f178447j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f178448k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ d74.b f178449l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ fj0.e f178450m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ o f178451n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ c0<State> f178452p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d74.b bVar, fj0.e eVar, o oVar, c0<State> c0Var, tq.e<? super a> eVar2) {
                super(1, eVar2);
                this.f178449l = bVar;
                this.f178450m = eVar;
                this.f178451n = oVar;
                this.f178452p = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:34:0x00df  */
            /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
            /* JADX WARN: Code duplicated, block: B:39:0x010d  */
            /* JADX WARN: Code duplicated, block: B:42:0x0113  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
            
                if (r11 == r0) goto L38;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 287
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: s63.o.g.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f178449l, this.f178450m, this.f178451n, this.f178452p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ac4.a aVar, d74.b bVar, fj0.e eVar, o oVar, tq.e<? super g> eVar2) {
            super(3, eVar2);
            this.f178439g = aVar;
            this.f178440h = bVar;
            this.f178441j = eVar;
            this.f178442k = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f178438f;
            Object objE = uq.b.e();
            int i15 = this.f178437e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = this.f178439g;
            a aVar2 = new a(this.f178440h, this.f178441j, this.f178442k, c0Var, null);
            this.f178438f = vq.j.a(c0Var);
            this.f178437e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s63.a.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(this.f178439g, this.f178440h, this.f178441j, this.f178442k, eVar);
            gVar.f178438f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public o(t63.c cVar, l63.b bVar, ib4.c cVar2, j14.a aVar, final fj0.h hVar, final fj0.e eVar, final ac4.a aVar2, final d74.b bVar2, yy.a aVar3, SetupData setupData) {
        this.changeEmailScreenMapper = cVar;
        this.contactDetailsNavigationDialogMapper = bVar;
        this.genericDomainErrorMapper = cVar2;
        this.checkEmailCorrectUC = aVar;
        State state = new State(null, setupData.getEmail(), setupData.getEmail(), false, false, false, 57, null);
        this.initialState = state;
        this.stateMachine = aVar3.a(state, new er.l() { // from class: s63.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.x9(this.f178385a, aVar2, bVar2, hVar, eVar, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), t9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b q9(dx.b error, final b0 email) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: s63.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(email, this, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    static /* synthetic */ jb4.b r9(o oVar, dx.b bVar, b0 b0Var, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            b0Var = null;
        }
        return oVar.q9(bVar, b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(b0 b0Var, o oVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            if (b0Var != null) {
                oVar.d9(new s63.a.ChangeEmail(b0Var));
            } else {
                oVar.d9(s63.a.d.f178336a);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s63.d.Data t9(State state) {
        t63.c cVar = this.changeEmailScreenMapper;
        er.a<i0> aVarB9 = b9(s63.a.f.f178344a);
        er.a<i0> aVarB10 = b9(s63.a.d.f178336a);
        return cVar.b(new t63.c.Params(state, aVarB9, new er.l() { // from class: s63.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.u9(this.f178376a, (b0) obj);
            }
        }, b9(s63.a.g.f178345a), new er.l() { // from class: s63.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f178377a, (b0) obj);
            }
        }, aVarB10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(o oVar, b0 b0Var) {
        oVar.d9(new s63.a.ChangeEmailInputChange(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(o oVar, b0 b0Var) {
        oVar.d9(new s63.a.ChangeEmail(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final o oVar, final ac4.a aVar, final d74.b bVar, final fj0.h hVar, final fj0.e eVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: s63.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.y9(this.f178378a, aVar, bVar, hVar, eVar, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(o oVar, ac4.a aVar, d74.b bVar, fj0.h hVar, fj0.e eVar, z zVar) {
        b bVar2 = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(s63.a.f.class), oVar2, bVar2);
        zVar.v(q0.c(s63.a.ChangeEmailInputChange.class), oVar2, new c(null));
        zVar.v(q0.c(s63.a.g.class), oVar2, new d(null));
        zVar.v(q0.c(s63.a.ChangeEmail.class), oVar2, oVar.new e(aVar, bVar, hVar, null));
        zVar.x(q0.c(s63.a.d.class), oVar2, oVar.new f(null));
        zVar.v(q0.c(s63.a.c.class), oVar2, new g(aVar, bVar, eVar, oVar, null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<s63.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, s63.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<s63.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}

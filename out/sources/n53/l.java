package n53;

import fr.q0;
import iy.b0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p53.RepeatNewPinNavResultData;
import p53.RepeatNewPinScreenData;
import w53.BiometricLoginNavResultData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J7\u0010(\u001a\u00020 2(\u0010'\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00190%0$\u0012\u0006\u0012\u0004\u0018\u00010\u00050#¢\u0006\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006I"}, d2 = {"Ln53/l;", "Ll00/g;", "Ln53/b;", "Ln53/a;", "Ln53/c;", "", "Lyy/a;", "stateMachineFactory", "Lo53/b;", "mapper", "Lmx/c;", "labelProvider", "Lg04/d;", "changeBiometricPinUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lg73/d;", "settingsNavigationDialogMapper", "<init>", "(Lyy/a;Lo53/b;Lmx/c;Lg04/d;Lib4/c;Lg73/d;)V", "state", "Lp53/d;", "u9", "(Ln53/b;)Lp53/d;", "Lk10/c0;", "Liy/b0;", "pinValue", "Lk10/l;", "B9", "(Lk10/c0;Liy/b0;)Lk10/l;", "Lp53/a;", "data", "Loq/i0;", "w9", "(Lp53/a;)V", "Lkotlin/Function1;", "Ltq/e;", "Ldx/i;", "Ldx/b;", "getPassword", "x9", "(Ler/l;)V", "b", "Lo53/b;", "c", "Lmx/c;", "d", "Lg04/d;", "e", "Lib4/c;", "f", "Lg73/d;", "g", "Ln53/b;", "initialState", "Lxw/b;", "Ln53/a$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, n53.a> implements n53.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o53.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g04.d changeBiometricPinUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g73.d settingsNavigationDialogMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<n53.a.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<State, n53.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<RepeatNewPinScreenData> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super dx.i<? extends dx.b, b0>>, Object> f132277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l f132278g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.l<? super tq.e<? super dx.i<? extends dx.b, b0>>, ? extends Object> lVar, l lVar2, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f132277f = lVar;
            this.f132278g = lVar2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132276e;
            if (i15 == 0) {
                u.b(obj);
                er.l<tq.e<? super dx.i<? extends dx.b, b0>>, Object> lVar = this.f132277f;
                this.f132276e = 1;
                obj = lVar.b(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            l lVar2 = this.f132278g;
            if (iVar instanceof dx.i.Left) {
                lVar2.d9(new n53.a.OnError((dx.b) ((dx.i.Left) iVar).b()));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                lVar2.d9(new n53.a.SetupPassword((b0) ((dx.i.Right) iVar).b()));
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new a(this.f132277f, this.f132278g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<RepeatNewPinScreenData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f132279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f132280b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f132281a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f132282b;

            /* JADX INFO: renamed from: n53.l$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3285a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f132283d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f132284e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f132285f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f132287h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f132288j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f132289k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f132290l;

                public C3285a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f132283d = obj;
                    this.f132284e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, l lVar) {
                this.f132281a = hVar;
                this.f132282b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3285a c3285a;
                if (eVar instanceof C3285a) {
                    c3285a = (C3285a) eVar;
                    int i15 = c3285a.f132284e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3285a.f132284e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3285a = new C3285a(eVar);
                    }
                } else {
                    c3285a = new C3285a(eVar);
                }
                Object obj2 = c3285a.f132283d;
                Object objE = uq.b.e();
                int i16 = c3285a.f132284e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f132281a;
                    RepeatNewPinScreenData repeatNewPinScreenDataU9 = this.f132282b.u9((State) obj);
                    c3285a.f132285f = vq.j.a(obj);
                    c3285a.f132287h = vq.j.a(c3285a);
                    c3285a.f132288j = vq.j.a(obj);
                    c3285a.f132289k = vq.j.a(hVar);
                    c3285a.f132290l = 0;
                    c3285a.f132284e = 1;
                    if (hVar.F(repeatNewPinScreenDataU9, c3285a) == objE) {
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

        public b(mu.g gVar, l lVar) {
            this.f132279a = gVar;
            this.f132280b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super RepeatNewPinScreenData> hVar, tq.e eVar) {
            Object objA = this.f132279a.a(new a(hVar, this.f132280b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln53/a$e;", "action", "Ln53/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln53/a$e;Ln53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<n53.a.OnError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f132291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f132292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f132293g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f132294h;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(l lVar, ib4.c.b bVar) {
            lVar.d9(new n53.a.CloseWithSnackBarInfo(lVar.labelProvider.c(c53.a.f23739x)));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n53.a.OnError onError = (n53.a.OnError) this.f132294h;
            Object objE = uq.b.e();
            int i15 = this.f132293g;
            if (i15 == 0) {
                u.b(obj);
                ib4.c cVar = l.this.genericDomainErrorMapper;
                dx.b domainError = onError.getDomainError();
                final l lVar = l.this;
                jb4.b bVarB = cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: n53.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l.c.O(lVar, (ib4.c.b) obj2);
                    }
                }, 2, null));
                l lVar2 = l.this;
                jb4.b bVar = bVarB;
                n53.a.c.OnError onError2 = new n53.a.c.OnError(bVar);
                this.f132294h = vq.j.a(onError);
                this.f132291e = vq.j.a(bVar);
                this.f132292f = 0;
                this.f132293g = 1;
                if (lVar2.F(onError2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n53.a.OnError onError, State state, tq.e<? super i0> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f132294h = onError;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln53/a$h;", "action", "Lk10/c0;", "Ln53/b;", "state", "Lk10/l;", "<anonymous>", "(Ln53/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<n53.a.SetupNewPin, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132298g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(n53.a.SetupNewPin setupNewPin, State state) {
            return State.b(state, null, setupNewPin.getNewPin(), null, null, false, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final n53.a.SetupNewPin setupNewPin = (n53.a.SetupNewPin) this.f132297f;
            c0 c0Var = (c0) this.f132298g;
            uq.b.e();
            if (this.f132296e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: n53.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.d.O(setupNewPin, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n53.a.SetupNewPin setupNewPin, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f132297f = setupNewPin;
            dVar.f132298g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln53/a$i;", "action", "Lk10/c0;", "Ln53/b;", "state", "Lk10/l;", "<anonymous>", "(Ln53/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<n53.a.SetupPassword, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132300f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132301g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(n53.a.SetupPassword setupPassword, State state) {
            return State.b(state, setupPassword.getPassword(), null, null, null, false, 30, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final n53.a.SetupPassword setupPassword = (n53.a.SetupPassword) this.f132300f;
            c0 c0Var = (c0) this.f132301g;
            uq.b.e();
            if (this.f132299e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: n53.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.e.O(setupPassword, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n53.a.SetupPassword setupPassword, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f132300f = setupPassword;
            eVar2.f132301g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln53/a$a;", "<unused var>", "Ln53/b;", "Loq/i0;", "<anonymous>", "(Ln53/a$a;Ln53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<n53.a.C3282a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132302e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132302e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                n53.a.c.b bVar = n53.a.c.b.f132236a;
                this.f132302e = 1;
                if (lVar.F(bVar, this) == objE) {
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
        public final Object w(n53.a.C3282a c3282a, State state, tq.e<? super i0> eVar) {
            return l.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln53/a$d;", "<unused var>", "Ln53/b;", "Loq/i0;", "<anonymous>", "(Ln53/a$d;Ln53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<n53.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132304e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132304e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                n53.a.c.C3283a c3283a = n53.a.c.C3283a.f132235a;
                this.f132304e = 1;
                if (lVar.F(c3283a, this) == objE) {
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
        public final Object w(n53.a.d dVar, State state, tq.e<? super i0> eVar) {
            return l.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln53/a$f;", "action", "Lk10/c0;", "Ln53/b;", "state", "Lk10/l;", "<anonymous>", "(Ln53/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<n53.a.OnPinChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132308g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(n53.a.OnPinChanged onPinChanged, State state) {
            return State.b(state, null, null, onPinChanged.getPinValue(), hz.b.C2039b.f86846c, false, 19, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final n53.a.OnPinChanged onPinChanged = (n53.a.OnPinChanged) this.f132307f;
            c0 c0Var = (c0) this.f132308g;
            uq.b.e();
            if (this.f132306e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return onPinChanged.getPinValue().getData().length < 4 ? c0Var.b(new er.l() { // from class: n53.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.h.O(onPinChanged, (State) obj2);
                }
            }) : l.this.B9(c0Var, onPinChanged.getPinValue());
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n53.a.OnPinChanged onPinChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = l.this.new h(eVar);
            hVar.f132307f = onPinChanged;
            hVar.f132308g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln53/a$g;", "<unused var>", "Ln53/b;", "state", "Loq/i0;", "<anonymous>", "(Ln53/a$g;Ln53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<n53.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132311f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f132311f;
            Object objE = uq.b.e();
            int i15 = this.f132310e;
            if (i15 == 0) {
                u.b(obj);
                g04.d dVar = l.this.changeBiometricPinUseCase;
                g04.d.Params params = new g04.d.Params(state.getNewPin(), state.getPassword());
                this.f132311f = vq.j.a(state);
                this.f132310e = 1;
                obj = dVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            l lVar = l.this;
            if (iVar instanceof dx.i.Left) {
                lVar.d9(new n53.a.OnError((dx.b) ((dx.i.Left) iVar).b()));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                e04.a aVar = (e04.a) ((dx.i.Right) iVar).b();
                if (aVar instanceof e04.a.AuthenticationSucceed) {
                    lVar.d9(new n53.a.CloseWithSnackBarInfo(lVar.labelProvider.c(c53.a.f23719p1)));
                } else if (fr.t.c(aVar, e04.a.C1055a.f46678a)) {
                    lVar.d9(new n53.a.CloseWithSnackBarInfo(lVar.labelProvider.c(c53.a.f23739x)));
                } else if (fr.t.c(aVar, e04.a.d.f46681a)) {
                    lVar.d9(n53.a.j.f132250a);
                } else {
                    if (!(aVar instanceof e04.a.Error)) {
                        throw new oq.p();
                    }
                    lVar.d9(new n53.a.OnError(((e04.a.Error) aVar).getErrorType()));
                }
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n53.a.g gVar, State state, tq.e<? super i0> eVar) {
            i iVar = l.this.new i(eVar);
            iVar.f132311f = state;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln53/a$b;", "action", "Ln53/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln53/a$b;Ln53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<n53.a.CloseWithSnackBarInfo, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132314f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n53.a.CloseWithSnackBarInfo closeWithSnackBarInfo = (n53.a.CloseWithSnackBarInfo) this.f132314f;
            Object objE = uq.b.e();
            int i15 = this.f132313e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                n53.a.c.CloseWithSnackBarInfo closeWithSnackBarInfo2 = new n53.a.c.CloseWithSnackBarInfo(new BiometricLoginNavResultData(closeWithSnackBarInfo.getInfo()));
                this.f132314f = vq.j.a(closeWithSnackBarInfo);
                this.f132313e = 1;
                if (lVar.F(closeWithSnackBarInfo2, this) == objE) {
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
        public final Object w(n53.a.CloseWithSnackBarInfo closeWithSnackBarInfo, State state, tq.e<? super i0> eVar) {
            j jVar = l.this.new j(eVar);
            jVar.f132314f = closeWithSnackBarInfo;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln53/a$k;", "<unused var>", "Ln53/b;", "Loq/i0;", "<anonymous>", "(Ln53/a$k;Ln53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<n53.a.k, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132316e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132316e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                n53.a.c.ShowNavigationDialog showNavigationDialog = new n53.a.c.ShowNavigationDialog(l.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(l.this.b9(n53.a.C3282a.f132233a), null, 2, null))));
                this.f132316e = 1;
                if (lVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(n53.a.k kVar, State state, tq.e<? super i0> eVar) {
            return l.this.new k(eVar).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: n53.l$l, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln53/a$j;", "<unused var>", "Ln53/b;", "Loq/i0;", "<anonymous>", "(Ln53/a$j;Ln53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C3286l extends vq.k implements er.q<n53.a.j, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132318e;

        C3286l(tq.e<? super C3286l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132318e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                n53.a.c.ShowNavigationDialog showNavigationDialog = new n53.a.c.ShowNavigationDialog(l.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(l.this.b9(n53.a.C3282a.f132233a), l.this.b9(n53.a.g.f132245a)))));
                this.f132318e = 1;
                if (lVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(n53.a.j jVar, State state, tq.e<? super i0> eVar) {
            return l.this.new C3286l(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, o53.b bVar, mx.c cVar, g04.d dVar, ib4.c cVar2, g73.d dVar2) {
        this.mapper = bVar;
        this.labelProvider = cVar;
        this.changeBiometricPinUseCase = dVar;
        this.genericDomainErrorMapper = cVar2;
        this.settingsNavigationDialogMapper = dVar2;
        State state = new State(null, null, null, null, false, 31, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: n53.g
            @Override // er.l
            public final Object b(Object obj) {
                return l.z9(this.f132262a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), u9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(l lVar, z zVar) {
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(n53.a.SetupNewPin.class), oVar, dVar);
        zVar.v(q0.c(n53.a.SetupPassword.class), oVar, new e(null));
        zVar.x(q0.c(n53.a.C3282a.class), oVar, lVar.new f(null));
        zVar.x(q0.c(n53.a.d.class), oVar, lVar.new g(null));
        zVar.v(q0.c(n53.a.OnPinChanged.class), oVar, lVar.new h(null));
        zVar.x(q0.c(n53.a.g.class), oVar, lVar.new i(null));
        zVar.x(q0.c(n53.a.CloseWithSnackBarInfo.class), oVar, lVar.new j(null));
        zVar.x(q0.c(n53.a.k.class), oVar, lVar.new k(null));
        zVar.x(q0.c(n53.a.j.class), oVar, lVar.new C3286l(null));
        zVar.x(q0.c(n53.a.OnError.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<State> B9(c0<State> state, final b0 pinValue) {
        if (!state.a().getNewPin().c(pinValue)) {
            return state.b(new er.l() { // from class: n53.k
                @Override // er.l
                public final Object b(Object obj) {
                    return l.D9(this.f132266a, (State) obj);
                }
            });
        }
        d9(n53.a.g.f132245a);
        return state.b(new er.l() { // from class: n53.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.C9(pinValue, (State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State C9(b0 b0Var, State state) {
        return State.b(state, null, null, b0Var, null, false, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State D9(l lVar, State state) {
        return State.b(state, null, null, b0.INSTANCE.a(), new hz.b.Invalid(lVar.labelProvider.c(c53.a.f23722q1)), false, 19, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RepeatNewPinScreenData u9(State state) {
        return this.mapper.b(new o53.b.Params(state, b9(n53.a.k.f132251a), b9(n53.a.d.f132241a), new er.l() { // from class: n53.h
            @Override // er.l
            public final Object b(Object obj) {
                return l.v9(this.f132263a, (b0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(l lVar, b0 b0Var) {
        lVar.d9(new n53.a.OnPinChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: n53.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.A9(this.f132264a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<n53.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, n53.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<RepeatNewPinScreenData> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(n53.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    public final void w9(RepeatNewPinNavResultData data) {
        d9(new n53.a.SetupNewPin(data.getNewPinValue()));
    }

    public final void x9(er.l<? super tq.e<? super dx.i<? extends dx.b, b0>>, ? extends Object> getPassword) {
        i00.a.a(this, new a(getPassword, this, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}

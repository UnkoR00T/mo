package g53;

import er.q;
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
import p53.RepeatNewPinScreenData;
import w53.BiometricLoginNavResultData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003038\u0014X\u0094\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010?\u001a\b\u0012\u0004\u0012\u00020:098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lg53/k;", "Ll00/g;", "Lg53/b;", "Lg53/a;", "Lg53/c;", "", "Lyy/a;", "stateMachineFactory", "Lh53/b;", "mapper", "Lg04/b;", "authenticateWithBiometricUseCase", "Lg04/j;", "getBiometricEncryptedCredentialUseCase", "Lg04/h;", "compareWithBiometricPinUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lmx/c;", "labelProvider", "Lg73/d;", "settingsNavigationDialogMapper", "<init>", "(Lyy/a;Lh53/b;Lg04/b;Lg04/j;Lg04/h;Lib4/c;Lmx/c;Lg73/d;)V", "state", "Lp53/d;", "u9", "(Lg53/b;)Lp53/d;", "Lk10/c0;", "Liy/b0;", "pinValue", "Lk10/l;", "z9", "(Lk10/c0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "b", "Lh53/b;", "c", "Lg04/b;", "d", "Lg04/j;", "e", "Lg04/h;", "f", "Lib4/c;", "g", "Lmx/c;", "h", "Lg73/d;", "j", "Lg53/b;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lg53/a$d;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, g53.a> implements g53.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h53.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g04.b authenticateWithBiometricUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g04.j getBiometricEncryptedCredentialUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g04.h compareWithBiometricPinUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g73.d settingsNavigationDialogMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t<State, g53.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<g53.a.d> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<RepeatNewPinScreenData> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<RepeatNewPinScreenData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f70765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f70766b;

        /* JADX INFO: renamed from: g53.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1602a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f70767a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f70768b;

            /* JADX INFO: renamed from: g53.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1603a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f70769d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f70770e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f70771f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f70773h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f70774j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f70775k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f70776l;

                public C1603a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f70769d = obj;
                    this.f70770e |= PKIFailureInfo.systemUnavail;
                    return C1602a.this.F(null, this);
                }
            }

            public C1602a(mu.h hVar, k kVar) {
                this.f70767a = hVar;
                this.f70768b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1603a c1603a;
                if (eVar instanceof C1603a) {
                    c1603a = (C1603a) eVar;
                    int i15 = c1603a.f70770e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1603a.f70770e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1603a = new C1603a(eVar);
                    }
                } else {
                    c1603a = new C1603a(eVar);
                }
                Object obj2 = c1603a.f70769d;
                Object objE = uq.b.e();
                int i16 = c1603a.f70770e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f70767a;
                    RepeatNewPinScreenData repeatNewPinScreenDataU9 = this.f70768b.u9((State) obj);
                    c1603a.f70771f = vq.j.a(obj);
                    c1603a.f70773h = vq.j.a(c1603a);
                    c1603a.f70774j = vq.j.a(obj);
                    c1603a.f70775k = vq.j.a(hVar);
                    c1603a.f70776l = 0;
                    c1603a.f70770e = 1;
                    if (hVar.F(repeatNewPinScreenDataU9, c1603a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f70765a = gVar;
            this.f70766b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super RepeatNewPinScreenData> hVar, tq.e eVar) {
            Object objA = this.f70765a.a(new C1602a(hVar, this.f70766b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg53/a$e;", "action", "Lg53/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lg53/a$e;Lg53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<g53.a.NavigateToNewPinScreen, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f70778f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g53.a.NavigateToNewPinScreen navigateToNewPinScreen = (g53.a.NavigateToNewPinScreen) this.f70778f;
            Object objE = uq.b.e();
            int i15 = this.f70777e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                g53.a.d.NavigateToNewPinScreen navigateToNewPinScreen2 = new g53.a.d.NavigateToNewPinScreen(navigateToNewPinScreen.getDecryptedPassword());
                this.f70778f = vq.j.a(navigateToNewPinScreen);
                this.f70777e = 1;
                if (kVar.F(navigateToNewPinScreen2, this) == objE) {
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
        public final Object w(g53.a.NavigateToNewPinScreen navigateToNewPinScreen, State state, tq.e<? super i0> eVar) {
            b bVar = k.this.new b(eVar);
            bVar.f70778f = navigateToNewPinScreen;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg53/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lg53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70780e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f70780e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            k.this.d9(g53.a.c.f70724a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((c) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return k.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg53/a$h;", "action", "Lk10/c0;", "Lg53/b;", "state", "Lk10/l;", "<anonymous>", "(Lg53/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<g53.a.Setup, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f70783f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f70784g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(g53.a.Setup setup, State state) {
            return new State(setup.getBiometricResult(), true, null, null, 12, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final g53.a.Setup setup = (g53.a.Setup) this.f70783f;
            c0 c0Var = (c0) this.f70784g;
            uq.b.e();
            if (this.f70782e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: g53.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.d.O(setup, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g53.a.Setup setup, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f70783f = setup;
            dVar.f70784g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg53/a$c;", "<unused var>", "Lg53/b;", "Loq/i0;", "<anonymous>", "(Lg53/a$c;Lg53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<g53.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f70785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f70786f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            if (r12 == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r11.f70786f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r11.f70785e
                iy.a0 r0 = (iy.a0) r0
                oq.u.b(r12)
                goto L5b
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                oq.u.b(r12)
                goto L36
            L22:
                oq.u.b(r12)
                g53.k r12 = g53.k.this
                g04.j r12 = g53.k.o9(r12)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r11.f70786f = r3
                java.lang.Object r12 = r12.c(r1, r11)
                if (r12 != r0) goto L36
                goto L5a
            L36:
                r4 = r12
                iy.a0 r4 = (iy.a0) r4
                g53.k r12 = g53.k.this
                g04.b r12 = g53.k.m9(r12)
                g04.b$b$a r3 = new g04.b$b$a
                g04.b$a r5 = g04.b.a.CHECK
                r9 = 28
                r10 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                java.lang.Object r1 = vq.j.a(r4)
                r11.f70785e = r1
                r11.f70786f = r2
                java.lang.Object r12 = r12.c(r3, r11)
                if (r12 != r0) goto L5b
            L5a:
                return r0
            L5b:
                g53.k r0 = g53.k.this
                e04.a r12 = (e04.a) r12
                boolean r1 = r12 instanceof e04.a.AuthenticationSucceed
                if (r1 == 0) goto L72
                g53.a$h r1 = new g53.a$h
                e04.a$b r12 = (e04.a.AuthenticationSucceed) r12
                iy.a0 r12 = r12.getResultData()
                r1.<init>(r12)
                g53.k.l9(r0, r1)
                goto La0
            L72:
                e04.a$d r1 = e04.a.d.f46681a
                boolean r1 = fr.t.c(r12, r1)
                if (r1 == 0) goto L80
                g53.a$i r12 = g53.a.i.f70739a
                g53.k.l9(r0, r12)
                goto La0
            L80:
                e04.a$a r1 = e04.a.C1055a.f46678a
                boolean r1 = fr.t.c(r12, r1)
                if (r1 == 0) goto L8e
                g53.a$b r12 = g53.a.b.f70723a
                g53.k.l9(r0, r12)
                goto La0
            L8e:
                boolean r1 = r12 instanceof e04.a.Error
                if (r1 == 0) goto La3
                g53.a$f r1 = new g53.a$f
                e04.a$c r12 = (e04.a.Error) r12
                dx.b r12 = r12.getErrorType()
                r1.<init>(r12)
                g53.k.l9(r0, r1)
            La0:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            La3:
                oq.p r12 = new oq.p
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: g53.k.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(g53.a.c cVar, State state, tq.e<? super i0> eVar) {
            return k.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg53/a$j;", "<unused var>", "Lg53/b;", "Loq/i0;", "<anonymous>", "(Lg53/a$j;Lg53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<g53.a.j, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70788e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f70788e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                g53.a.d.ShowNavigationDialog showNavigationDialog = new g53.a.d.ShowNavigationDialog(k.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(k.this.b9(g53.a.C1599a.f70722a), null, 2, null))));
                this.f70788e = 1;
                if (kVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(g53.a.j jVar, State state, tq.e<? super i0> eVar) {
            return k.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg53/a$i;", "<unused var>", "Lg53/b;", "Loq/i0;", "<anonymous>", "(Lg53/a$i;Lg53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<g53.a.i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70790e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f70790e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                g53.a.d.ShowNavigationDialog showNavigationDialog = new g53.a.d.ShowNavigationDialog(k.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(k.this.b9(g53.a.C1599a.f70722a), k.this.b9(g53.a.c.f70724a)))));
                this.f70790e = 1;
                if (kVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(g53.a.i iVar, State state, tq.e<? super i0> eVar) {
            return k.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg53/a$b;", "<unused var>", "Lg53/b;", "Loq/i0;", "<anonymous>", "(Lg53/a$b;Lg53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements q<g53.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70792e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f70792e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                g53.a.d.CloseWithSnackBarInfo closeWithSnackBarInfo = new g53.a.d.CloseWithSnackBarInfo(new BiometricLoginNavResultData(k.this.labelProvider.c(c53.a.f23739x)));
                this.f70792e = 1;
                if (kVar.F(closeWithSnackBarInfo, this) == objE) {
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
        public final Object w(g53.a.b bVar, State state, tq.e<? super i0> eVar) {
            return k.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg53/a$a;", "<unused var>", "Lg53/b;", "Loq/i0;", "<anonymous>", "(Lg53/a$a;Lg53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements q<g53.a.C1599a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70794e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f70794e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                g53.a.d.C1600a c1600a = g53.a.d.C1600a.f70725a;
                this.f70794e = 1;
                if (kVar.F(c1600a, this) == objE) {
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
        public final Object w(g53.a.C1599a c1599a, State state, tq.e<? super i0> eVar) {
            return k.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg53/a$f;", "action", "Lg53/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lg53/a$f;Lg53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements q<g53.a.OnError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f70796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f70797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f70798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f70799h;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g53.a.OnError onError = (g53.a.OnError) this.f70799h;
            Object objE = uq.b.e();
            int i15 = this.f70798g;
            if (i15 == 0) {
                u.b(obj);
                jb4.b bVarB = k.this.genericDomainErrorMapper.b(ib4.c.Params.INSTANCE.b(onError.getDomainError()));
                k kVar = k.this;
                jb4.b bVar = bVarB;
                g53.a.d.OnError onError2 = new g53.a.d.OnError(bVar);
                this.f70799h = vq.j.a(onError);
                this.f70796e = vq.j.a(bVar);
                this.f70797f = 0;
                this.f70798g = 1;
                if (kVar.F(onError2, this) == objE) {
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
        public final Object w(g53.a.OnError onError, State state, tq.e<? super i0> eVar) {
            j jVar = k.this.new j(eVar);
            jVar.f70799h = onError;
            return jVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: g53.k$k, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg53/a$g;", "action", "Lk10/c0;", "Lg53/b;", "state", "Lk10/l;", "<anonymous>", "(Lg53/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C1604k extends vq.k implements q<g53.a.OnPinChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f70802f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f70803g;

        C1604k(tq.e<? super C1604k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(g53.a.OnPinChanged onPinChanged, State state) {
            return State.b(state, null, false, onPinChanged.getPinValue(), hz.b.C2039b.f86846c, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final g53.a.OnPinChanged onPinChanged = (g53.a.OnPinChanged) this.f70802f;
            c0 c0Var = (c0) this.f70803g;
            Object objE = uq.b.e();
            int i15 = this.f70801e;
            if (i15 == 0) {
                u.b(obj);
                if (onPinChanged.getPinValue().getData().length < 4) {
                    return c0Var.b(new er.l() { // from class: g53.m
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return k.C1604k.O(onPinChanged, (State) obj2);
                        }
                    });
                }
                k kVar = k.this;
                b0 pinValue = onPinChanged.getPinValue();
                this.f70802f = vq.j.a(onPinChanged);
                this.f70803g = vq.j.a(c0Var);
                this.f70801e = 1;
                obj = kVar.z9(c0Var, pinValue, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return (k10.l) obj;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g53.a.OnPinChanged onPinChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            C1604k c1604k = k.this.new C1604k(eVar);
            c1604k.f70802f = onPinChanged;
            c1604k.f70803g = c0Var;
            return c1604k.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f70805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f70806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f70807f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f70809h;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f70807f = obj;
            this.f70809h |= PKIFailureInfo.systemUnavail;
            return k.this.z9(null, null, this);
        }
    }

    public k(yy.a aVar, h53.b bVar, g04.b bVar2, g04.j jVar, g04.h hVar, ib4.c cVar, mx.c cVar2, g73.d dVar) {
        this.mapper = bVar;
        this.authenticateWithBiometricUseCase = bVar2;
        this.getBiometricEncryptedCredentialUseCase = jVar;
        this.compareWithBiometricPinUseCase = hVar;
        this.genericDomainErrorMapper = cVar;
        this.labelProvider = cVar2;
        this.settingsNavigationDialogMapper = dVar;
        State state = new State(null, false, null, null, 15, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: g53.g
            @Override // er.l
            public final Object b(Object obj) {
                return k.x9(this.f70750a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), u9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State A9(k kVar, State state) {
        return State.b(state, null, false, b0.INSTANCE.a(), new hz.b.Invalid(kVar.labelProvider.c(c53.a.f23687f)), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RepeatNewPinScreenData u9(State state) {
        return this.mapper.b(new h53.b.Params(state, b9(g53.a.j.f70740a), new er.l() { // from class: g53.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.v9(this.f70752a, (b0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(k kVar, b0 b0Var) {
        kVar.d9(new g53.a.OnPinChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: g53.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.y9(this.f70751a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(k kVar, z zVar) {
        zVar.C(kVar.new c(null));
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(g53.a.Setup.class), oVar, dVar);
        zVar.x(q0.c(g53.a.c.class), oVar, kVar.new e(null));
        zVar.x(q0.c(g53.a.j.class), oVar, kVar.new f(null));
        zVar.x(q0.c(g53.a.i.class), oVar, kVar.new g(null));
        zVar.x(q0.c(g53.a.b.class), oVar, kVar.new h(null));
        zVar.x(q0.c(g53.a.C1599a.class), oVar, kVar.new i(null));
        zVar.x(q0.c(g53.a.OnError.class), oVar, kVar.new j(null));
        zVar.v(q0.c(g53.a.OnPinChanged.class), oVar, kVar.new C1604k(null));
        zVar.x(q0.c(g53.a.NavigateToNewPinScreen.class), oVar, kVar.new b(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z9(c0<State> c0Var, b0 b0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        l lVar;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i15 = lVar.f70809h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f70809h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        Object objC = lVar.f70807f;
        Object objE = uq.b.e();
        int i16 = lVar.f70809h;
        if (i16 == 0) {
            u.b(objC);
            g04.h hVar = this.compareWithBiometricPinUseCase;
            g04.h.Params params = new g04.h.Params(c0Var.a().getBiometricResult(), b0Var);
            lVar.f70805d = c0Var;
            lVar.f70806e = vq.j.a(b0Var);
            lVar.f70809h = 1;
            objC = hVar.c(params, lVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) lVar.f70805d;
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            d9(new g53.a.OnError((dx.b) ((dx.i.Left) iVar).b()));
            return c0Var.c();
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        g04.n nVar = (g04.n) ((dx.i.Right) iVar).b();
        if (nVar instanceof g04.n.Correct) {
            d9(new g53.a.NavigateToNewPinScreen(((g04.n.Correct) nVar).getDecryptedPassword()));
            return c0Var.c();
        }
        if (fr.t.c(nVar, g04.n.b.f69227a)) {
            return c0Var.b(new er.l() { // from class: g53.j
                @Override // er.l
                public final Object b(Object obj) {
                    return k.A9(this.f70753a, (State) obj);
                }
            });
        }
        throw new oq.p();
    }

    @Override // zx.b
    public xw.b<g53.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, g53.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<RepeatNewPinScreenData> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(g53.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}

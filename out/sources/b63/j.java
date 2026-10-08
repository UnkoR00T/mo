package b63;

import d63.SelectLoginMethodScreenData;
import er.q;
import f00.j0;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001FBK\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u0010:\u001a\b\u0012\u0004\u0012\u000205048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030;8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lb63/j;", "Ll00/g;", "Lb63/b;", "Lb63/a;", "Li70/e;", "Lb63/c;", "", "Lyy/a;", "stateMachineFactory", "Lc63/a;", "mapper", "Lg73/d;", "settingsNavigationDialogMapper", "Lib4/c;", "genericDomainErrorMapper", "globalSnackBarManager", "Lmx/c;", "labelProvider", "Lg04/a;", "activateBiometricUseCase", "Lb63/j$a$a;", "setupData", "<init>", "(Lyy/a;Lc63/a;Lg73/d;Lib4/c;Li70/e;Lmx/c;Lg04/a;Lb63/j$a$a;)V", "state", "Ld63/c;", "q9", "(Lb63/b;)Ld63/c;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lc63/a;", "c", "Lg73/d;", "d", "Lib4/c;", "e", "Li70/e;", "f", "Lmx/c;", "g", "Lg04/a;", "h", "Lb63/j$a$a;", "j", "Lb63/b;", "initialState", "Lxw/b;", "Lb63/a$d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<State, b63.a> implements i70.e, b63.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c63.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g73.d settingsNavigationDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g04.a activateBiometricUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<b63.a.d> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final t<State, b63.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<SelectLoginMethodScreenData> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lb63/j$a;", "Lf00/j0;", "Lb63/j$a$a;", "Lb63/j;", "a", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<SetupData, j> {

        /* JADX INFO: renamed from: b63.j$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lb63/j$a$a;", "", "Liy/b0;", "password", "pin", "<init>", "(Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f16917c = b0.f97726c;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 password;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 pin;

            public SetupData(b0 b0Var, b0 b0Var2) {
                this.password = b0Var;
                this.pin = b0Var2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b0 getPassword() {
                return this.password;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final b0 getPin() {
                return this.pin;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetupData)) {
                    return false;
                }
                SetupData setupData = (SetupData) other;
                return fr.t.c(this.password, setupData.password) && fr.t.c(this.pin, setupData.pin);
            }

            public int hashCode() {
                return (this.password.hashCode() * 31) + this.pin.hashCode();
            }

            public String toString() {
                return "SetupData(password=" + this.password + ", pin=" + this.pin + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<SelectLoginMethodScreenData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f16920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f16921b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f16922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f16923b;

            /* JADX INFO: renamed from: b63.j$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0417a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f16924d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f16925e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f16926f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f16928h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f16929j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f16930k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f16931l;

                public C0417a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f16924d = obj;
                    this.f16925e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, j jVar) {
                this.f16922a = hVar;
                this.f16923b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0417a c0417a;
                if (eVar instanceof C0417a) {
                    c0417a = (C0417a) eVar;
                    int i15 = c0417a.f16925e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0417a.f16925e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0417a = new C0417a(eVar);
                    }
                } else {
                    c0417a = new C0417a(eVar);
                }
                Object obj2 = c0417a.f16924d;
                Object objE = uq.b.e();
                int i16 = c0417a.f16925e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f16922a;
                    SelectLoginMethodScreenData selectLoginMethodScreenDataQ9 = this.f16923b.q9((State) obj);
                    c0417a.f16926f = vq.j.a(obj);
                    c0417a.f16928h = vq.j.a(c0417a);
                    c0417a.f16929j = vq.j.a(obj);
                    c0417a.f16930k = vq.j.a(hVar);
                    c0417a.f16931l = 0;
                    c0417a.f16925e = 1;
                    if (hVar.F(selectLoginMethodScreenDataQ9, c0417a) == objE) {
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

        public b(mu.g gVar, j jVar) {
            this.f16920a = gVar;
            this.f16921b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super SelectLoginMethodScreenData> hVar, tq.e eVar) {
            Object objA = this.f16920a.a(new a(hVar, this.f16921b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb63/a$c;", "<unused var>", "Lb63/b;", "Loq/i0;", "<anonymous>", "(Lb63/a$c;Lb63/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<b63.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16932e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f16932e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<b63.a.d> bVarY1 = j.this.Y1();
                b63.a.d.C0414a c0414a = b63.a.d.C0414a.f16885a;
                this.f16932e = 1;
                if (bVarY1.F(c0414a, this) == objE) {
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
        public final Object w(b63.a.c cVar, State state, tq.e<? super i0> eVar) {
            return j.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lb63/a$b;", "<unused var>", "Lk10/c0;", "Lb63/b;", "state", "Lk10/l;", "<anonymous>", "(Lb63/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<b63.a.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16935f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, d63.d.BIOMETRIC_WITHOUT_PIN, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f16935f;
            uq.b.e();
            if (this.f16934e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: b63.k
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.d.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(b63.a.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f16935f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lb63/a$a;", "<unused var>", "Lk10/c0;", "Lb63/b;", "state", "Lk10/l;", "<anonymous>", "(Lb63/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<b63.a.C0413a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16937f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, d63.d.BIOMETRIC_WITH_PIN, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f16937f;
            uq.b.e();
            if (this.f16936e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: b63.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.e.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(b63.a.C0413a c0413a, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f16937f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb63/a$i;", "<unused var>", "Lb63/b;", "Loq/i0;", "<anonymous>", "(Lb63/a$i;Lb63/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<b63.a.i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16938e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f16938e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                b63.a.d.ShowNavigationDialog showNavigationDialog = new b63.a.d.ShowNavigationDialog(j.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(j.this.b9(b63.a.c.f16884a), null, 2, null))));
                this.f16938e = 1;
                if (jVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(b63.a.i iVar, State state, tq.e<? super i0> eVar) {
            return j.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb63/a$f;", "<unused var>", "Lb63/b;", "state", "Loq/i0;", "<anonymous>", "(Lb63/a$f;Lb63/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<b63.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16941f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16943a;

            static {
                int[] iArr = new int[d63.d.values().length];
                try {
                    iArr[d63.d.BIOMETRIC_WITHOUT_PIN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d63.d.BIOMETRIC_WITH_PIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f16943a = iArr;
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        
            if (r9 == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        
            if (r9 == r1) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b63.j.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b63.a.f fVar, State state, tq.e<? super i0> eVar) {
            g gVar = j.this.new g(eVar);
            gVar.f16941f = state;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb63/a$g;", "action", "Lb63/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb63/a$g;Lb63/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements q<b63.a.OnError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f16944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f16945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f16946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f16947h;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(j jVar, ib4.c.b bVar) {
            jVar.d9(b63.a.c.f16884a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b63.a.OnError onError = (b63.a.OnError) this.f16947h;
            Object objE = uq.b.e();
            int i15 = this.f16946g;
            if (i15 == 0) {
                u.b(obj);
                ib4.c cVar = j.this.genericDomainErrorMapper;
                dx.b domainError = onError.getDomainError();
                final j jVar = j.this;
                jb4.b bVarB = cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: b63.m
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j.h.O(jVar, (ib4.c.b) obj2);
                    }
                }, 2, null));
                j jVar2 = j.this;
                jb4.b bVar = bVarB;
                b63.a.d.OnError onError2 = new b63.a.d.OnError(bVar);
                this.f16947h = vq.j.a(onError);
                this.f16944e = vq.j.a(bVar);
                this.f16945f = 0;
                this.f16946g = 1;
                if (jVar2.F(onError2, this) == objE) {
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
        public final Object w(b63.a.OnError onError, State state, tq.e<? super i0> eVar) {
            h hVar = j.this.new h(eVar);
            hVar.f16947h = onError;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb63/a$h;", "<unused var>", "Lb63/b;", "Loq/i0;", "<anonymous>", "(Lb63/a$h;Lb63/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements q<b63.a.h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16949e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f16949e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                b63.a.d.ShowNavigationDialog showNavigationDialog = new b63.a.d.ShowNavigationDialog(j.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(j.this.b9(b63.a.c.f16884a), j.this.b9(b63.a.f.f16891a)))));
                this.f16949e = 1;
                if (jVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(b63.a.h hVar, State state, tq.e<? super i0> eVar) {
            return j.this.new i(eVar).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: b63.j$j, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb63/a$e;", "<unused var>", "Lb63/b;", "Loq/i0;", "<anonymous>", "(Lb63/a$e;Lb63/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C0418j extends vq.k implements q<b63.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16951e;

        C0418j(tq.e<? super C0418j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f16951e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                b63.a.d.b bVar = b63.a.d.b.f16886a;
                this.f16951e = 1;
                if (jVar.F(bVar, this) == objE) {
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
        public final Object w(b63.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return j.this.new C0418j(eVar2).J(i0.f148189a);
        }
    }

    public j(yy.a aVar, c63.a aVar2, g73.d dVar, ib4.c cVar, i70.e eVar, mx.c cVar2, g04.a aVar3, a.SetupData setupData) {
        this.mapper = aVar2;
        this.settingsNavigationDialogMapper = dVar;
        this.genericDomainErrorMapper = cVar;
        this.globalSnackBarManager = eVar;
        this.labelProvider = cVar2;
        this.activateBiometricUseCase = aVar3;
        this.setupData = setupData;
        State state = new State(setupData.getPassword(), setupData.getPin(), null, 4, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: b63.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.s9(this.f16905a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), q9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectLoginMethodScreenData q9(State state) {
        return this.mapper.b(new c63.a.Params(state, b9(b63.a.i.f16894a), b9(b63.a.b.f16883a), b9(b63.a.C0413a.f16882a), b9(b63.a.f.f16891a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final j jVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: b63.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.t9(this.f16904a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(j jVar, z zVar) {
        c cVar = jVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(b63.a.c.class), oVar, cVar);
        zVar.v(q0.c(b63.a.b.class), oVar, new d(null));
        zVar.v(q0.c(b63.a.C0413a.class), oVar, new e(null));
        zVar.x(q0.c(b63.a.i.class), oVar, jVar.new f(null));
        zVar.x(q0.c(b63.a.f.class), oVar, jVar.new g(null));
        zVar.x(q0.c(b63.a.OnError.class), oVar, jVar.new h(null));
        zVar.x(q0.c(b63.a.h.class), oVar, jVar.new i(null));
        zVar.x(q0.c(b63.a.e.class), oVar, jVar.new C0418j(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<b63.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, b63.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<SelectLoginMethodScreenData> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(b63.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SelectLoginMethodScreenData selectLoginMethodScreenData) {
        super.P5(selectLoginMethodScreenData);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}

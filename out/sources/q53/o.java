package q53;

import fr.q0;
import iy.b0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import s53.ConfirmPasswordNavResultData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BI\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010J\u001a\b\u0012\u0004\u0012\u00020E0D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lq53/o;", "Ll00/g;", "Lq53/b;", "Lq53/a;", "Lq53/c;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lv64/j;", "compareWithCurrentPasswordUseCase", "Lg04/i;", "deactivateBiometricUseCase", "Lr53/c;", "confirmPasswordMapper", "Lib4/c;", "genericDomainErrorMapper", "Lg73/d;", "settingsNavigationDialogMapper", "globalSnackBarManager", "<init>", "(Lyy/a;Lmx/c;Lv64/j;Lg04/i;Lr53/c;Lib4/c;Lg73/d;Li70/e;)V", "state", "Lq53/c$a$a;", "w9", "(Lq53/b;)Lq53/c$a$a;", "Ldx/b;", "domainError", "Lq53/a$c$a;", "u9", "(Ldx/b;)Lq53/a$c$a;", "Ls53/a;", "data", "Loq/i0;", "z9", "(Ls53/a;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lmx/c;", "c", "Lv64/j;", "d", "Lg04/i;", "e", "Lr53/c;", "f", "Lib4/c;", "g", "Lg73/d;", "h", "Li70/e;", "Lq53/b$a;", "j", "Lq53/b$a;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lq53/a$c;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lq53/c$a;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<q53.b, q53.a> implements q53.c, zx.b, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v64.j compareWithCurrentPasswordUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g04.i deactivateBiometricUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r53.c confirmPasswordMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g73.d settingsNavigationDialogMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final q53.b.Initialized initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<q53.b, q53.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<q53.a.c> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<q53.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<q53.c.a.Initialized> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f164923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f164924b;

        /* JADX INFO: renamed from: q53.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4103a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f164925a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f164926b;

            /* JADX INFO: renamed from: q53.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4104a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f164927d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f164928e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f164929f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f164931h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f164932j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f164933k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f164934l;

                public C4104a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f164927d = obj;
                    this.f164928e |= PKIFailureInfo.systemUnavail;
                    return C4103a.this.F(null, this);
                }
            }

            public C4103a(mu.h hVar, o oVar) {
                this.f164925a = hVar;
                this.f164926b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4104a c4104a;
                if (eVar instanceof C4104a) {
                    c4104a = (C4104a) eVar;
                    int i15 = c4104a.f164928e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4104a.f164928e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4104a = new C4104a(eVar);
                    }
                } else {
                    c4104a = new C4104a(eVar);
                }
                Object obj2 = c4104a.f164927d;
                Object objE = uq.b.e();
                int i16 = c4104a.f164928e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f164925a;
                    q53.c.a.Initialized initializedW9 = this.f164926b.w9((q53.b) obj);
                    c4104a.f164929f = vq.j.a(obj);
                    c4104a.f164931h = vq.j.a(c4104a);
                    c4104a.f164932j = vq.j.a(obj);
                    c4104a.f164933k = vq.j.a(hVar);
                    c4104a.f164934l = 0;
                    c4104a.f164928e = 1;
                    if (hVar.F(initializedW9, c4104a) == objE) {
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
            this.f164923a = gVar;
            this.f164924b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super q53.c.a.Initialized> hVar, tq.e eVar) {
            Object objA = this.f164923a.a(new C4103a(hVar, this.f164924b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq53/a$d;", "action", "Lq53/b$a;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lq53/a$d;Lq53/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<q53.a.d, q53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164935e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f164935e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                q53.a.c.ShowNavigationDialog showNavigationDialog = new q53.a.c.ShowNavigationDialog(o.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(o.this.b9(q53.a.e.f164887a), null, 2, null))));
                this.f164935e = 1;
                if (oVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(q53.a.d dVar, q53.b.Initialized initialized, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq53/a$e;", "<unused var>", "Lq53/b$a;", "Loq/i0;", "<anonymous>", "(Lq53/a$e;Lq53/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<q53.a.e, q53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164937e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f164937e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                q53.a.c.e eVar = q53.a.c.e.f164885a;
                this.f164937e = 1;
                if (oVar.F(eVar, this) == objE) {
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
        public final Object w(q53.a.e eVar, q53.b.Initialized initialized, tq.e<? super i0> eVar2) {
            return o.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq53/a$b;", "action", "Lk10/c0;", "Lq53/b$a;", "state", "Lk10/l;", "Lq53/b;", "<anonymous>", "(Lq53/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<q53.a.LoadResources, c0<q53.b.Initialized>, tq.e<? super k10.l<? extends q53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164939e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164940f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f164941g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q53.b.Initialized O(q53.a.LoadResources loadResources, q53.b.Initialized initialized) {
            return q53.b.Initialized.b(initialized, null, loadResources.getScreenType(), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final q53.a.LoadResources loadResources = (q53.a.LoadResources) this.f164940f;
            c0 c0Var = (c0) this.f164941g;
            uq.b.e();
            if (this.f164939e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: q53.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.d.O(loadResources, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q53.a.LoadResources loadResources, c0<q53.b.Initialized> c0Var, tq.e<? super k10.l<? extends q53.b>> eVar) {
            d dVar = new d(eVar);
            dVar.f164940f = loadResources;
            dVar.f164941g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq53/a$f;", "action", "Lk10/c0;", "Lq53/b$a;", "state", "Lk10/l;", "Lq53/b;", "<anonymous>", "(Lq53/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<q53.a.ValidPassword, c0<q53.b.Initialized>, tq.e<? super k10.l<? extends q53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164943f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f164944g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q53.b.Initialized O(q53.a.ValidPassword validPassword, q53.b.Initialized initialized) {
            return q53.b.Initialized.b(initialized, validPassword.getPassword(), null, hz.b.C2039b.f86846c, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final q53.a.ValidPassword validPassword = (q53.a.ValidPassword) this.f164943f;
            c0 c0Var = (c0) this.f164944g;
            uq.b.e();
            if (this.f164942e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: q53.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.e.O(validPassword, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q53.a.ValidPassword validPassword, c0<q53.b.Initialized> c0Var, tq.e<? super k10.l<? extends q53.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f164943f = validPassword;
            eVar2.f164944g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq53/a$a;", "action", "Lk10/c0;", "Lq53/b$a;", "state", "Lk10/l;", "Lq53/b;", "<anonymous>", "(Lq53/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<q53.a.CheckPassword, c0<q53.b.Initialized>, tq.e<? super k10.l<? extends q53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f164945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f164946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f164947g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f164948h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f164949j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f164950k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f164951l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f164952m;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q53.b.Initialized V(o oVar, q53.b.Initialized initialized) {
            return q53.b.Initialized.b(initialized, null, null, new hz.b.Invalid(oVar.confirmPasswordMapper.f()), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q53.b.Initialized X(o oVar, q53.b.Initialized initialized) {
            return q53.b.Initialized.b(initialized, null, null, new hz.b.Invalid(oVar.confirmPasswordMapper.h()), 3, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0126, code lost:
        
            if (r8.F(r10, r16) == r3) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x015a, code lost:
        
            if (r4.F(r6, r16) == r3) goto L42;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 384
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q53.o.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(q53.a.CheckPassword checkPassword, c0<q53.b.Initialized> c0Var, tq.e<? super k10.l<? extends q53.b>> eVar) {
            f fVar = o.this.new f(eVar);
            fVar.f164951l = checkPassword;
            fVar.f164952m = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, mx.c cVar, v64.j jVar, g04.i iVar, r53.c cVar2, ib4.c cVar3, g73.d dVar, i70.e eVar) {
        this.labelProvider = cVar;
        this.compareWithCurrentPasswordUseCase = jVar;
        this.deactivateBiometricUseCase = iVar;
        this.confirmPasswordMapper = cVar2;
        this.genericDomainErrorMapper = cVar3;
        this.settingsNavigationDialogMapper = dVar;
        this.globalSnackBarManager = eVar;
        q53.b.Initialized initialized = new q53.b.Initialized(b0.INSTANCE.a(), s53.b.a.f178174a, hz.b.C2039b.f86846c);
        this.initialState = initialized;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: q53.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.A9(this.f164907a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), w9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final o oVar, k10.v vVar) {
        vVar.c(q0.c(q53.b.Initialized.class), new er.l() { // from class: q53.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.B9(this.f164908a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(q53.a.d.class), oVar2, bVar);
        zVar.x(q0.c(q53.a.e.class), oVar2, oVar.new c(null));
        zVar.v(q0.c(q53.a.LoadResources.class), oVar2, new d(null));
        zVar.v(q0.c(q53.a.ValidPassword.class), oVar2, new e(null));
        zVar.v(q0.c(q53.a.CheckPassword.class), oVar2, oVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q53.a.c.Error u9(dx.b domainError) {
        return new q53.a.c.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: q53.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f164911a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(o oVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Close) {
            oVar.d9(q53.a.e.f164887a);
        } else if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                oVar.d9(q53.a.e.f164887a);
            } else if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q53.c.a.Initialized w9(q53.b state) {
        return this.confirmPasswordMapper.b(new r53.c.Params(state, b9(q53.a.d.f164886a), new er.l() { // from class: q53.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.x9(this.f164909a, (b0) obj);
            }
        }, new er.l() { // from class: q53.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.y9(this.f164910a, (s53.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(o oVar, b0 b0Var) {
        oVar.d9(new q53.a.ValidPassword(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(o oVar, s53.b bVar) {
        oVar.d9(new q53.a.CheckPassword(bVar));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<q53.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<q53.b, q53.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<q53.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(q53.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public void P5(ConfirmPasswordNavResultData data) {
        d9(new q53.a.LoadResources(data.getScreenType()));
    }
}

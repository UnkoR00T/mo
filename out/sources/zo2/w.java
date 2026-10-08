package zo2;

import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B[\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010I\u001a\b\u0012\u0004\u0012\u00020D0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0J8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bK\u0010L\u0012\u0004\bO\u0010&\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lzo2/w;", "Ll00/g;", "Lzo2/e;", "Lzo2/c;", "Lzo2/f;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lap2/c;", "screenMapper", "Lb14/b;", "getAppVersionUC", "La14/w;", "openUrlIntentUseCase", "Lqo2/a;", "getVerificationUrlUseCase", "globalSnackBarManager", "Lac4/e;", "getPartOfTheDayUC", "Lqo2/b;", "isActivationByJuniorActive", "Lap2/b;", "dialogMapper", "Lzo2/d;", "dialogProperties", "<init>", "(Lyy/a;Lap2/c;Lb14/b;La14/w;Lqo2/a;Li70/e;Lac4/e;Lqo2/b;Lap2/b;Lzo2/d;)V", "state", "Lzo2/f$a;", "x9", "(Lzo2/e;)Lzo2/f$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lap2/c;", "c", "Lb14/b;", "d", "La14/w;", "e", "Lqo2/a;", "f", "Li70/e;", "g", "Lac4/e;", "h", "Lqo2/b;", "j", "Lap2/b;", "k", "Lzo2/d;", "Lzo2/e$a;", "l", "Lzo2/e$a;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lzo2/c$h;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<zo2.e, zo2.c> implements zo2.f, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ap2.c screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b14.b getAppVersionUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final qo2.a getVerificationUrlUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.e getPartOfTheDayUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final qo2.b isActivationByJuniorActive;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ap2.b dialogMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SetupData dialogProperties;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final zo2.e.a initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<zo2.e, zo2.c> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<zo2.c.h> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<zo2.f.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<zo2.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f235859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f235860b;

        /* JADX INFO: renamed from: zo2.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6373a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f235861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f235862b;

            /* JADX INFO: renamed from: zo2.w$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6374a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f235863d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f235864e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f235865f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f235867h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f235868j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f235869k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f235870l;

                public C6374a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f235863d = obj;
                    this.f235864e |= PKIFailureInfo.systemUnavail;
                    return C6373a.this.F(null, this);
                }
            }

            public C6373a(mu.h hVar, w wVar) {
                this.f235861a = hVar;
                this.f235862b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6374a c6374a;
                if (eVar instanceof C6374a) {
                    c6374a = (C6374a) eVar;
                    int i15 = c6374a.f235864e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6374a.f235864e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6374a = new C6374a(eVar);
                    }
                } else {
                    c6374a = new C6374a(eVar);
                }
                Object obj2 = c6374a.f235863d;
                Object objE = uq.b.e();
                int i16 = c6374a.f235864e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f235861a;
                    zo2.f.a aVarX9 = this.f235862b.x9((zo2.e) obj);
                    c6374a.f235865f = vq.j.a(obj);
                    c6374a.f235867h = vq.j.a(c6374a);
                    c6374a.f235868j = vq.j.a(obj);
                    c6374a.f235869k = vq.j.a(hVar);
                    c6374a.f235870l = 0;
                    c6374a.f235864e = 1;
                    if (hVar.F(aVarX9, c6374a) == objE) {
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

        public a(mu.g gVar, w wVar) {
            this.f235859a = gVar;
            this.f235860b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super zo2.f.a> hVar, tq.e eVar) {
            Object objA = this.f235859a.a(new C6373a(hVar, this.f235860b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzo2/c$b;", "<unused var>", "Lzo2/e;", "Loq/i0;", "<anonymous>", "(Lzo2/c$b;Lzo2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<zo2.c.b, zo2.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235871e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235871e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                zo2.c.h.a aVar = zo2.c.h.a.f235790a;
                this.f235871e = 1;
                if (wVar.F(aVar, this) == objE) {
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
        public final Object w(zo2.c.b bVar, zo2.e eVar, tq.e<? super i0> eVar2) {
            return w.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzo2/c$c;", "<unused var>", "Lk10/c0;", "Lzo2/e$a;", "state", "Lk10/l;", "Lzo2/e;", "<anonymous>", "(Lzo2/c$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<zo2.c.C6370c, k10.c0<zo2.e.a>, tq.e<? super k10.l<? extends zo2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f235874f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zo2.e.OnboardingWithMJuniorIntegration O(String str, w wVar, zo2.e.a aVar) {
            return new zo2.e.OnboardingWithMJuniorIntegration(str, wVar.getPartOfTheDayUC.a(gz.b.a.C1792a.f78542a), false, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f235874f;
            uq.b.e();
            if (this.f235873e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String strA = w.this.getAppVersionUC.a(gz.b.a.C1792a.f78542a);
            final w wVar = w.this;
            return c0Var.d(new er.l() { // from class: zo2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.c.O(strA, wVar, (e.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zo2.c.C6370c c6370c, k10.c0<zo2.e.a> c0Var, tq.e<? super k10.l<? extends zo2.e>> eVar) {
            c cVar = w.this.new c(eVar);
            cVar.f235874f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzo2/c$g;", "<unused var>", "Lzo2/e$c;", "Loq/i0;", "<anonymous>", "(Lzo2/c$g;Lzo2/e$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<zo2.c.g, zo2.e.Onboarding, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235876e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235876e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = w.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(w.this.getVerificationUrlUseCase.a(gz.b.a.C1792a.f78542a), false, 2, null);
                this.f235876e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            w wVar2 = w.this;
            if (iVar instanceof dx.i.Left) {
                wVar2.globalSnackBarManager.y(new p50.a.Default(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, 6, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zo2.c.g gVar, zo2.e.Onboarding onboarding, tq.e<? super i0> eVar) {
            return w.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzo2/c$d;", "<unused var>", "Lzo2/e$c;", "Loq/i0;", "<anonymous>", "(Lzo2/c$d;Lzo2/e$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<zo2.c.d, zo2.e.Onboarding, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235878e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235878e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                zo2.c.h.b bVar = zo2.c.h.b.f235791a;
                this.f235878e = 1;
                if (wVar.F(bVar, this) == objE) {
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
        public final Object w(zo2.c.d dVar, zo2.e.Onboarding onboarding, tq.e<? super i0> eVar) {
            return w.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lzo2/e$d;", "state", "Lk10/l;", "Lzo2/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<zo2.e.OnboardingWithMJuniorIntegration>, tq.e<? super k10.l<? extends zo2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235880e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f235881f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zo2.e.OnboardingWithMJuniorIntegration O(boolean z15, zo2.e.OnboardingWithMJuniorIntegration onboardingWithMJuniorIntegration) {
            return zo2.e.OnboardingWithMJuniorIntegration.b(onboardingWithMJuniorIntegration, null, null, z15, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f235881f;
            Object objE = uq.b.e();
            int i15 = this.f235880e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (w.this.dialogProperties.getShowDialog()) {
                    w.this.d9(zo2.c.i.f235794a);
                }
                qo2.b bVar = w.this.isActivationByJuniorActive;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f235881f = c0Var;
                this.f235880e = 1;
                obj = bVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            return c0Var.b(new er.l() { // from class: zo2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.f.O(zBooleanValue, (e.OnboardingWithMJuniorIntegration) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<zo2.e.OnboardingWithMJuniorIntegration> c0Var, tq.e<? super k10.l<? extends zo2.e>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = w.this.new f(eVar);
            fVar.f235881f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzo2/c$i;", "<unused var>", "Lzo2/e$d;", "state", "Loq/i0;", "<anonymous>", "(Lzo2/c$i;Lzo2/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<zo2.c.i, zo2.e.OnboardingWithMJuniorIntegration, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235883e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235883e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                zo2.c.h.ShowDialog showDialog = new zo2.c.h.ShowDialog(w.this.dialogMapper.b(i0.f148189a));
                this.f235883e = 1;
                if (wVar.F(showDialog, this) == objE) {
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
        public final Object w(zo2.c.i iVar, zo2.e.OnboardingWithMJuniorIntegration onboardingWithMJuniorIntegration, tq.e<? super i0> eVar) {
            return w.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzo2/c$d;", "<unused var>", "Lzo2/e$d;", "Loq/i0;", "<anonymous>", "(Lzo2/c$d;Lzo2/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<zo2.c.d, zo2.e.OnboardingWithMJuniorIntegration, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235885e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235885e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                zo2.c.h.b bVar = zo2.c.h.b.f235791a;
                this.f235885e = 1;
                if (wVar.F(bVar, this) == objE) {
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
        public final Object w(zo2.c.d dVar, zo2.e.OnboardingWithMJuniorIntegration onboardingWithMJuniorIntegration, tq.e<? super i0> eVar) {
            return w.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzo2/c$e;", "<unused var>", "Lzo2/e$d;", "state", "Loq/i0;", "<anonymous>", "(Lzo2/c$e;Lzo2/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<zo2.c.e, zo2.e.OnboardingWithMJuniorIntegration, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f235888f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zo2.e.OnboardingWithMJuniorIntegration onboardingWithMJuniorIntegration = (zo2.e.OnboardingWithMJuniorIntegration) this.f235888f;
            Object objE = uq.b.e();
            int i15 = this.f235887e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (onboardingWithMJuniorIntegration.getMJuniorActive()) {
                    w wVar = w.this;
                    zo2.c.h.C6371c c6371c = zo2.c.h.C6371c.f235792a;
                    this.f235888f = vq.j.a(onboardingWithMJuniorIntegration);
                    this.f235887e = 1;
                    if (wVar.F(c6371c, this) == objE) {
                        return objE;
                    }
                } else {
                    w.this.d9(zo2.c.f.f235788a);
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
        public final Object w(zo2.c.e eVar, zo2.e.OnboardingWithMJuniorIntegration onboardingWithMJuniorIntegration, tq.e<? super i0> eVar2) {
            i iVar = w.this.new i(eVar2);
            iVar.f235888f = onboardingWithMJuniorIntegration;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzo2/c$f;", "<unused var>", "Lk10/c0;", "Lzo2/e$d;", "state", "Lk10/l;", "Lzo2/e;", "<anonymous>", "(Lzo2/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<zo2.c.f, k10.c0<zo2.e.OnboardingWithMJuniorIntegration>, tq.e<? super k10.l<? extends zo2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235890e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f235891f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zo2.e.b O(zo2.e.OnboardingWithMJuniorIntegration onboardingWithMJuniorIntegration) {
            return zo2.e.b.f235799a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f235891f;
            uq.b.e();
            if (this.f235890e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zo2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.j.O((e.OnboardingWithMJuniorIntegration) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zo2.c.f fVar, k10.c0<zo2.e.OnboardingWithMJuniorIntegration> c0Var, tq.e<? super k10.l<? extends zo2.e>> eVar) {
            j jVar = new j(eVar);
            jVar.f235891f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzo2/c$a;", "<unused var>", "Lk10/c0;", "Lzo2/e$b;", "state", "Lk10/l;", "Lzo2/e;", "<anonymous>", "(Lzo2/c$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<zo2.c.a, k10.c0<zo2.e.b>, tq.e<? super k10.l<? extends zo2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235892e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f235893f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zo2.e.OnboardingWithMJuniorIntegration O(String str, w wVar, zo2.e.b bVar) {
            return new zo2.e.OnboardingWithMJuniorIntegration(str, wVar.getPartOfTheDayUC.a(gz.b.a.C1792a.f78542a), false, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f235893f;
            uq.b.e();
            if (this.f235892e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String strA = w.this.getAppVersionUC.a(gz.b.a.C1792a.f78542a);
            final w wVar = w.this;
            return c0Var.d(new er.l() { // from class: zo2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.k.O(strA, wVar, (e.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zo2.c.a aVar, k10.c0<zo2.e.b> c0Var, tq.e<? super k10.l<? extends zo2.e>> eVar) {
            k kVar = w.this.new k(eVar);
            kVar.f235893f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, ap2.c cVar, b14.b bVar, a14.w wVar, qo2.a aVar2, i70.e eVar, ac4.e eVar2, qo2.b bVar2, ap2.b bVar3, SetupData setupData) {
        this.screenMapper = cVar;
        this.getAppVersionUC = bVar;
        this.openUrlIntentUseCase = wVar;
        this.getVerificationUrlUseCase = aVar2;
        this.globalSnackBarManager = eVar;
        this.getPartOfTheDayUC = eVar2;
        this.isActivationByJuniorActive = bVar2;
        this.dialogMapper = bVar3;
        this.dialogProperties = setupData;
        zo2.e.a aVar3 = zo2.e.a.f235798a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: zo2.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.z9(this.f235845a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), x9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(w wVar, k10.z zVar) {
        b bVar = wVar.new b(null);
        zVar.x(q0.c(zo2.c.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(w wVar, k10.z zVar) {
        c cVar = wVar.new c(null);
        zVar.v(q0.c(zo2.c.C6370c.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(w wVar, k10.z zVar) {
        d dVar = wVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(zo2.c.g.class), oVar, dVar);
        zVar.x(q0.c(zo2.c.d.class), oVar, wVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(w wVar, k10.z zVar) {
        zVar.A(wVar.new f(null));
        g gVar = wVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(zo2.c.i.class), oVar, gVar);
        zVar.x(q0.c(zo2.c.d.class), oVar, wVar.new h(null));
        zVar.x(q0.c(zo2.c.e.class), oVar, wVar.new i(null));
        zVar.v(q0.c(zo2.c.f.class), oVar, new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(w wVar, k10.z zVar) {
        k kVar = wVar.new k(null);
        zVar.v(q0.c(zo2.c.a.class), k10.o.CANCEL_PREVIOUS, kVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zo2.f.a x9(zo2.e state) {
        return this.screenMapper.b(new ap2.c.Params(state, b9(zo2.c.C6370c.f235785a), b9(zo2.c.b.f235784a), b9(zo2.c.d.f235786a), b9(zo2.c.g.f235789a), b9(zo2.c.e.f235787a), b9(zo2.c.a.f235783a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(zo2.e.class), new er.l() { // from class: zo2.q
            @Override // er.l
            public final Object b(Object obj) {
                return w.A9(this.f235840a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(zo2.e.a.class), new er.l() { // from class: zo2.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.B9(this.f235841a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(zo2.e.Onboarding.class), new er.l() { // from class: zo2.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.C9(this.f235842a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(zo2.e.OnboardingWithMJuniorIntegration.class), new er.l() { // from class: zo2.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.D9(this.f235843a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(zo2.e.b.class), new er.l() { // from class: zo2.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.E9(this.f235844a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<zo2.c.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<zo2.e, zo2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<zo2.f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(zo2.c.h hVar, tq.e<? super i0> eVar) {
        return super.F(hVar, eVar);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}

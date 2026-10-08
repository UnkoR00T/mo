package bz3;

import java.util.Map;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import wy3.SetPasswordSetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ~2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u007fBk\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010&\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0$H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\"*\u00020\"H\u0002¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\"*\u00020\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0$H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020-H\u0002¢\u0006\u0004\b0\u0010/J\u0017\u00103\u001a\u00020-2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020<H\u0002¢\u0006\u0004\b?\u0010>J\u0010\u0010A\u001a\u00020@H\u0082@¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\b\u0012\u0004\u0012\u00020@0CH\u0002¢\u0006\u0004\bD\u0010EJ\u0013\u0010G\u001a\u00020F*\u00020\u0002H\u0002¢\u0006\u0004\bG\u0010HJ\u0018\u0010K\u001a\u00020@2\u0006\u0010J\u001a\u00020IH\u0096\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020@H\u0096\u0001¢\u0006\u0004\bM\u0010NR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020@0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR&\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030m8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR \u0010w\u001a\b\u0012\u0004\u0012\u00020s0i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010k\u001a\u0004\bu\u0010vR \u0010}\u001a\b\u0012\u0004\u0012\u00020F0x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|¨\u0006\u0080\u0001"}, d2 = {"Lbz3/c0;", "Ll00/g;", "Lbz3/h;", "", "Lvy3/b;", "Lbz3/i;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lcz3/i;", "screenMapper", "globalSnackBarManager", "Lxy3/b;", "validatePasswordUC", "Laz3/d;", "verifyRepeatedPasswordUC", "Lyw/b;", "accessibilityTalkBackManager", "Lib4/c;", "errorMapper", "Laz3/a;", "readAccessibilityMessageUC", "La14/l;", "getImeVisibleStateUseCase", "Lxy3/a;", "setPasswordUC", "Lwy3/c;", "setupData", "<init>", "(Lyy/a;Lmx/c;Lcz3/i;Li70/e;Lxy3/b;Laz3/d;Lyw/b;Lib4/c;Laz3/a;La14/l;Lxy3/a;Lwy3/c;)V", "", "hasLostFocus", "Lhz/b;", "currentValidityState", "Lkotlin/Function0;", "invalidState", "F9", "(ZLhz/b;Ler/a;)Lhz/b;", "W9", "(Lhz/b;)Lhz/b;", "otherState", "ca", "(Lhz/b;Ler/a;)Lhz/b;", "Lhz/b$c;", "N9", "()Lhz/b$c;", "L9", "", "messageResId", "I9", "(I)Lhz/b$c;", "Ldx/b;", "domainError", "Ljb4/b;", "O9", "(Ldx/b;)Ljb4/b;", "Q9", "()Ljb4/b;", "", "K9", "()Ljava/lang/String;", "M9", "Loq/i0;", "G9", "(Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "J9", "()Lmu/g;", "Lbz3/i$a;", "R9", "(Lbz3/h;)Lbz3/i$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lmx/c;", "c", "Lcz3/i;", "d", "Li70/e;", "e", "Lxy3/b;", "f", "Laz3/d;", "g", "Lyw/b;", "h", "Lib4/c;", "j", "Laz3/a;", "k", "La14/l;", "l", "Lxy3/a;", "m", "Lwy3/c;", "Lbz3/h$a;", "n", "Lbz3/h$a;", "initialState", "Lxw/b;", "p", "Lxw/b;", "inactivityTimer", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lvy3/b$a;", "r", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "t", "a", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 extends l00.g<bz3.h, Object> implements vy3.b, bz3.i, i70.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f22044v = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cz3.i screenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xy3.b validatePasswordUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final az3.d verifyRepeatedPasswordUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final az3.a readAccessibilityMessageUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.l getImeVisibleStateUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xy3.a setPasswordUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final SetPasswordSetupData setupData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final bz3.h.Default initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<oq.i0> inactivityTimer;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<bz3.h, Object> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<vy3.b.a> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<bz3.i.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22061e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ hz.b.Invalid f22063g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(hz.b.Invalid invalid, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f22063g = invalid;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f22061e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c0.this.accessibilityTalkBackManager.a(this.f22063g.getMessage().getText());
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return c0.this.new b(this.f22063g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<bz3.i.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f22064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f22065b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f22066a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f22067b;

            /* JADX INFO: renamed from: bz3.c0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0583a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f22068d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f22069e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f22070f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f22072h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f22073j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f22074k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f22075l;

                public C0583a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f22068d = obj;
                    this.f22069e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, c0 c0Var) {
                this.f22066a = hVar;
                this.f22067b = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0583a c0583a;
                if (eVar instanceof C0583a) {
                    c0583a = (C0583a) eVar;
                    int i15 = c0583a.f22069e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0583a.f22069e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0583a = new C0583a(eVar);
                    }
                } else {
                    c0583a = new C0583a(eVar);
                }
                Object obj2 = c0583a.f22068d;
                Object objE = uq.b.e();
                int i16 = c0583a.f22069e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f22066a;
                    bz3.i.Data aVarR9 = this.f22067b.R9((bz3.h) obj);
                    c0583a.f22070f = vq.j.a(obj);
                    c0583a.f22072h = vq.j.a(c0583a);
                    c0583a.f22073j = vq.j.a(obj);
                    c0583a.f22074k = vq.j.a(hVar);
                    c0583a.f22075l = 0;
                    c0583a.f22069e = 1;
                    if (hVar.F(aVarR9, c0583a) == objE) {
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

        public c(mu.g gVar, c0 c0Var) {
            this.f22064a = gVar;
            this.f22065b = c0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super bz3.i.Data> hVar, tq.e eVar) {
            Object objA = this.f22064a.a(new a(hVar, this.f22065b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbz3/a;", "<unused var>", "Lbz3/h;", "Loq/i0;", "<anonymous>", "(Lbz3/a;Lbz3/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<a, bz3.h, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22076e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22076e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                vy3.b.a.C5487a c5487a = vy3.b.a.C5487a.f208709a;
                this.f22076e = 1;
                if (c0Var.F(c5487a, this) == objE) {
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
        public final Object w(a aVar, bz3.h hVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbz3/b;", "<unused var>", "Lbz3/h;", "Loq/i0;", "<anonymous>", "(Lbz3/b;Lbz3/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<bz3.b, bz3.h, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22078e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22078e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                vy3.b.a.C5488b c5488b = vy3.b.a.C5488b.f208710a;
                this.f22078e = 1;
                if (c0Var.F(c5488b, this) == objE) {
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
        public final Object w(bz3.b bVar, bz3.h hVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbz3/c;", "action", "Lk10/c0;", "Lbz3/h;", "state", "Lk10/l;", "<anonymous>", "(Lbz3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<bz3.c, k10.c0<bz3.h>, tq.e<? super k10.l<? extends bz3.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f22081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f22082g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bz3.h X(bz3.c cVar, boolean z15, bz3.h hVar, final c0 c0Var, boolean z16, bz3.h hVar2) {
            if (cVar.getIsFocused() && z15) {
                return new bz3.h.PasswordInputFocused(hVar.getPassword(), hVar.getRepeatPassword(), hVar.f(), c0Var.W9(hVar.getPasswordState()), hVar.getRepeatedPasswordState(), hVar.getImeVisible());
            }
            return (cVar.getIsFocused() && z16) ? new bz3.h.RepeatPasswordInputFocused(hVar.getPassword(), hVar.getRepeatPassword(), hVar.f(), hVar.getPasswordState(), c0Var.W9(hVar.getRepeatedPasswordState()), hVar.getImeVisible()) : new bz3.h.Default(hVar.getPassword(), hVar.getRepeatPassword(), hVar.f(), c0Var.F9(z15, hVar.getPasswordState(), new er.a() { // from class: bz3.e0
                @Override // er.a
                public final Object a() {
                    return c0.f.Y(c0Var);
                }
            }), c0Var.F9(z16, hVar.getRepeatedPasswordState(), new er.a() { // from class: bz3.f0
                @Override // er.a
                public final Object a() {
                    return c0.f.Z(c0Var);
                }
            }), hVar.getImeVisible());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hz.b Y(c0 c0Var) {
            return c0Var.N9();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hz.b Z(c0 c0Var) {
            return c0Var.L9();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final bz3.c cVar = (bz3.c) this.f22081f;
            k10.c0 c0Var = (k10.c0) this.f22082g;
            uq.b.e();
            if (this.f22080e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final bz3.h hVar = (bz3.h) c0Var.a();
            final boolean z15 = cVar instanceof bz3.c.Password;
            final boolean z16 = cVar instanceof bz3.c.RepeatPassword;
            final c0 c0Var2 = c0.this;
            return c0Var.d(new er.l() { // from class: bz3.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.f.X(cVar, z15, hVar, c0Var2, z16, (h) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(bz3.c cVar, k10.c0<bz3.h> c0Var, tq.e<? super k10.l<? extends bz3.h>> eVar) {
            f fVar = c0.this.new f(eVar);
            fVar.f22081f = cVar;
            fVar.f22082g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbz3/g;", "<unused var>", "Lk10/c0;", "Lbz3/h;", "state", "Lk10/l;", "<anonymous>", "(Lbz3/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<bz3.g, k10.c0<bz3.h>, tq.e<? super k10.l<? extends bz3.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f22085f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f22086g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f22087h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f22088j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final /* synthetic */ class a extends fr.q implements er.a<hz.b.Invalid> {
            a(Object obj) {
                super(0, obj, c0.class, "getRequirementsErrorState", "getRequirementsErrorState()Lpl/gov/coi/common/domain/validators/ValidationState$Invalid;", 0);
            }

            @Override // er.a
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public final hz.b.Invalid a() {
                return ((c0) this.f66391b).N9();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final /* synthetic */ class b extends fr.q implements er.a<hz.b.Invalid> {
            b(Object obj) {
                super(0, obj, c0.class, "getRepeatedPasswordErrorState", "getRepeatedPasswordErrorState()Lpl/gov/coi/common/domain/validators/ValidationState$Invalid;", 0);
            }

            @Override // er.a
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public final hz.b.Invalid a() {
                return ((c0) this.f66391b).L9();
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bz3.h.Default V(hz.b bVar, bz3.h hVar) {
            return new bz3.h.Default(hVar.getPassword(), hVar.getRepeatPassword(), hVar.f(), bVar, hVar.getRepeatedPasswordState(), hVar.getImeVisible());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bz3.h.Default X(hz.b bVar, hz.b bVar2, bz3.h hVar) {
            return new bz3.h.Default(hVar.getPassword(), hVar.getRepeatPassword(), hVar.f(), bVar, bVar2, hVar.getImeVisible());
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f4, code lost:
        
            if (r5.F(r6, r10) == r1) goto L26;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bz3.c0.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(bz3.g gVar, k10.c0<bz3.h> c0Var, tq.e<? super k10.l<? extends bz3.h>> eVar) {
            g gVar2 = c0.this.new g(eVar);
            gVar2.f22088j = c0Var;
            return gVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loq/i0;", "<unused var>", "Lk10/c0;", "Lbz3/h$b;", "state", "Lk10/l;", "Lbz3/h;", "<anonymous>", "(VLpl/gov/coi/common/statemachine/State;)Lpl/gov/coi/common/statemachine/ChangedState;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<oq.i0, k10.c0<bz3.h.PasswordInputFocused>, tq.e<? super k10.l<? extends bz3.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f22091f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bz3.h.PasswordInputFocused O(c0 c0Var, bz3.h.PasswordInputFocused passwordInputFocused) {
            return bz3.h.PasswordInputFocused.h(passwordInputFocused, null, null, null, c0Var.N9(), null, false, 55, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f22091f;
            uq.b.e();
            if (this.f22090e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (wy3.b.a(((bz3.h.PasswordInputFocused) c0Var.a()).f())) {
                return c0Var.c();
            }
            final c0 c0Var2 = c0.this;
            return c0Var.b(new er.l() { // from class: bz3.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.h.O(c0Var2, (h.PasswordInputFocused) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(oq.i0 i0Var, k10.c0<bz3.h.PasswordInputFocused> c0Var, tq.e<? super k10.l<? extends bz3.h>> eVar) {
            h hVar = c0.this.new h(eVar);
            hVar.f22091f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "imeVisible", "Lk10/c0;", "Lbz3/h$b;", "state", "Lk10/l;", "Lbz3/h;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<Boolean, k10.c0<bz3.h.PasswordInputFocused>, tq.e<? super k10.l<? extends bz3.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f22094f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f22095g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bz3.h.PasswordInputFocused O(boolean z15, bz3.h.PasswordInputFocused passwordInputFocused) {
            return bz3.h.PasswordInputFocused.h(passwordInputFocused, null, null, null, null, null, z15, 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f22094f;
            k10.c0 c0Var = (k10.c0) this.f22095g;
            uq.b.e();
            if (this.f22093e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: bz3.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.i.O(z15, (h.PasswordInputFocused) obj2);
                }
            });
        }

        public final Object N(boolean z15, k10.c0<bz3.h.PasswordInputFocused> c0Var, tq.e<? super k10.l<? extends bz3.h>> eVar) {
            i iVar = new i(eVar);
            iVar.f22094f = z15;
            iVar.f22095g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, k10.c0<bz3.h.PasswordInputFocused> c0Var, tq.e<? super k10.l<? extends bz3.h>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbz3/h$b;", "it", "Loq/i0;", "<anonymous>", "(Lbz3/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<bz3.h.PasswordInputFocused, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22096e;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22096e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                this.f22096e = 1;
                if (c0Var.G9(this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(bz3.h.PasswordInputFocused passwordInputFocused, tq.e<? super oq.i0> eVar) {
            return ((j) v(passwordInputFocused, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return c0.this.new j(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbz3/d;", "action", "Lk10/c0;", "Lbz3/h$b;", "state", "Lk10/l;", "Lbz3/h;", "<anonymous>", "(Lbz3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<OnPasswordChanged, k10.c0<bz3.h.PasswordInputFocused>, tq.e<? super k10.l<? extends bz3.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f22099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f22100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f22101h;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bz3.h.PasswordInputFocused O(OnPasswordChanged onPasswordChanged, Map map, bz3.h.PasswordInputFocused passwordInputFocused) {
            return bz3.h.PasswordInputFocused.h(passwordInputFocused, onPasswordChanged.getPassword(), iy.b0.INSTANCE.a(), map, wy3.b.a(map) ? hz.b.d.f86848c : hz.b.C2039b.f86846c, hz.b.C2039b.f86846c, false, 32, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Map map;
            final OnPasswordChanged onPasswordChanged = (OnPasswordChanged) this.f22100g;
            k10.c0 c0Var = (k10.c0) this.f22101h;
            Object objE = uq.b.e();
            int i15 = this.f22099f;
            if (i15 != 0) {
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) this.f22098e;
                    oq.u.b(obj);
                }
                return c0Var.b(new er.l() { // from class: bz3.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.k.O(onPasswordChanged, map, (h.PasswordInputFocused) obj2);
                    }
                });
            }
            oq.u.b(obj);
            xy3.b bVar = c0.this.validatePasswordUC;
            xy3.b.Params params = new xy3.b.Params(onPasswordChanged.getPassword(), c0.this.K9());
            this.f22100g = onPasswordChanged;
            this.f22101h = c0Var;
            this.f22099f = 1;
            obj = bVar.c(params, this);
            if (obj != objE) {
            }
            return objE;
            Map map2 = (Map) obj;
            c0 c0Var2 = c0.this;
            this.f22100g = onPasswordChanged;
            this.f22101h = c0Var;
            this.f22098e = map2;
            this.f22099f = 2;
            if (c0Var2.G9(this) != objE) {
                map = map2;
                return c0Var.b(new er.l() { // from class: bz3.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.k.O(onPasswordChanged, map, (h.PasswordInputFocused) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPasswordChanged onPasswordChanged, k10.c0<bz3.h.PasswordInputFocused> c0Var, tq.e<? super k10.l<? extends bz3.h>> eVar) {
            k kVar = c0.this.new k(eVar);
            kVar.f22100g = onPasswordChanged;
            kVar.f22101h = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loq/i0;", "<unused var>", "Lk10/c0;", "Lbz3/h$c;", "state", "Lk10/l;", "Lbz3/h;", "<anonymous>", "(VLpl/gov/coi/common/statemachine/State;)Lpl/gov/coi/common/statemachine/ChangedState;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<oq.i0, k10.c0<bz3.h.RepeatPasswordInputFocused>, tq.e<? super k10.l<? extends bz3.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f22104f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bz3.h.RepeatPasswordInputFocused O(c0 c0Var, bz3.h.RepeatPasswordInputFocused repeatPasswordInputFocused) {
            return bz3.h.RepeatPasswordInputFocused.h(repeatPasswordInputFocused, null, null, null, null, c0Var.L9(), false, 47, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f22104f;
            uq.b.e();
            if (this.f22103e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((bz3.h.RepeatPasswordInputFocused) c0Var.a()).getRepeatedPasswordState().a()) {
                return c0Var.c();
            }
            final c0 c0Var2 = c0.this;
            return c0Var.b(new er.l() { // from class: bz3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.l.O(c0Var2, (h.RepeatPasswordInputFocused) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(oq.i0 i0Var, k10.c0<bz3.h.RepeatPasswordInputFocused> c0Var, tq.e<? super k10.l<? extends bz3.h>> eVar) {
            l lVar = c0.this.new l(eVar);
            lVar.f22104f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "imeVisible", "Lk10/c0;", "Lbz3/h$c;", "state", "Lk10/l;", "Lbz3/h;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<Boolean, k10.c0<bz3.h.RepeatPasswordInputFocused>, tq.e<? super k10.l<? extends bz3.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f22107f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f22108g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bz3.h.RepeatPasswordInputFocused O(boolean z15, bz3.h.RepeatPasswordInputFocused repeatPasswordInputFocused) {
            return bz3.h.RepeatPasswordInputFocused.h(repeatPasswordInputFocused, null, null, null, null, null, z15, 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f22107f;
            k10.c0 c0Var = (k10.c0) this.f22108g;
            uq.b.e();
            if (this.f22106e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: bz3.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.m.O(z15, (h.RepeatPasswordInputFocused) obj2);
                }
            });
        }

        public final Object N(boolean z15, k10.c0<bz3.h.RepeatPasswordInputFocused> c0Var, tq.e<? super k10.l<? extends bz3.h>> eVar) {
            m mVar = new m(eVar);
            mVar.f22107f = z15;
            mVar.f22108g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, k10.c0<bz3.h.RepeatPasswordInputFocused> c0Var, tq.e<? super k10.l<? extends bz3.h>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbz3/h$c;", "it", "Loq/i0;", "<anonymous>", "(Lbz3/h$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<bz3.h.RepeatPasswordInputFocused, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22109e;

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22109e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                this.f22109e = 1;
                if (c0Var.G9(this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(bz3.h.RepeatPasswordInputFocused repeatPasswordInputFocused, tq.e<? super oq.i0> eVar) {
            return ((n) v(repeatPasswordInputFocused, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return c0.this.new n(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbz3/e;", "action", "Lk10/c0;", "Lbz3/h$c;", "state", "Lk10/l;", "Lbz3/h;", "<anonymous>", "(Lbz3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<OnRepeatedPasswordChanged, k10.c0<bz3.h.RepeatPasswordInputFocused>, tq.e<? super k10.l<? extends bz3.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f22112f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f22113g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bz3.h.RepeatPasswordInputFocused O(OnRepeatedPasswordChanged onRepeatedPasswordChanged, boolean z15, bz3.h.RepeatPasswordInputFocused repeatPasswordInputFocused) {
            return bz3.h.RepeatPasswordInputFocused.h(repeatPasswordInputFocused, null, onRepeatedPasswordChanged.getRepeatedPassword(), null, null, z15 ? hz.b.d.f86848c : hz.b.C2039b.f86846c, false, 45, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        
            if (r8 == r2) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f22112f
                bz3.e r0 = (bz3.OnRepeatedPasswordChanged) r0
                java.lang.Object r1 = r7.f22113g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r7.f22111e
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L26
                if (r3 == r5) goto L22
                if (r3 != r4) goto L1a
                oq.u.b(r8)
                goto L5e
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                oq.u.b(r8)
                goto L38
            L26:
                oq.u.b(r8)
                bz3.c0 r8 = bz3.c0.this
                r7.f22112f = r0
                r7.f22113g = r1
                r7.f22111e = r5
                java.lang.Object r8 = bz3.c0.q9(r8, r7)
                if (r8 != r2) goto L38
                goto L5d
            L38:
                bz3.c0 r8 = bz3.c0.this
                az3.d r8 = bz3.c0.A9(r8)
                az3.d$a r3 = new az3.d$a
                java.lang.Object r5 = r1.a()
                bz3.h$c r5 = (bz3.h.RepeatPasswordInputFocused) r5
                iy.b0 r5 = r5.getPassword()
                iy.b0 r6 = r0.getRepeatedPassword()
                r3.<init>(r5, r6)
                r7.f22112f = r0
                r7.f22113g = r1
                r7.f22111e = r4
                java.lang.Object r8 = r8.d(r3, r7)
                if (r8 != r2) goto L5e
            L5d:
                return r2
            L5e:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                bz3.n0 r2 = new bz3.n0
                r2.<init>()
                k10.l r8 = r1.b(r2)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: bz3.c0.o.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnRepeatedPasswordChanged onRepeatedPasswordChanged, k10.c0<bz3.h.RepeatPasswordInputFocused> c0Var, tq.e<? super k10.l<? extends bz3.h>> eVar) {
            o oVar = c0.this.new o(eVar);
            oVar.f22112f = onRepeatedPasswordChanged;
            oVar.f22113g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbz3/f;", "<unused var>", "Lbz3/h$c;", "Loq/i0;", "<anonymous>", "(Lbz3/f;Lbz3/h$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<bz3.f, bz3.h.RepeatPasswordInputFocused, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22115e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22115e;
            if (i15 == 0) {
                oq.u.b(obj);
                az3.a aVar = c0.this.readAccessibilityMessageUC;
                az3.a.Params params = new az3.a.Params(c0.this.M9());
                this.f22115e = 1;
                if (aVar.d(params, this) == objE) {
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
        public final Object w(bz3.f fVar, bz3.h.RepeatPasswordInputFocused repeatPasswordInputFocused, tq.e<? super oq.i0> eVar) {
            return c0.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    public c0(yy.a aVar, mx.c cVar, cz3.i iVar, i70.e eVar, xy3.b bVar, az3.d dVar, yw.b bVar2, ib4.c cVar2, az3.a aVar2, a14.l lVar, xy3.a aVar3, SetPasswordSetupData setPasswordSetupData) {
        this.labelProvider = cVar;
        this.screenMapper = iVar;
        this.globalSnackBarManager = eVar;
        this.validatePasswordUC = bVar;
        this.verifyRepeatedPasswordUC = dVar;
        this.accessibilityTalkBackManager = bVar2;
        this.errorMapper = cVar2;
        this.readAccessibilityMessageUC = aVar2;
        this.getImeVisibleStateUseCase = lVar;
        this.setPasswordUC = aVar3;
        this.setupData = setPasswordSetupData;
        iy.b0.Companion companion = iy.b0.INSTANCE;
        iy.b0 b0VarA = companion.a();
        iy.b0 b0VarA2 = companion.a();
        wy3.a aVar4 = wy3.a.MIN_LENGTH;
        Boolean bool = Boolean.FALSE;
        bz3.h.Default r15 = new bz3.h.Default(b0VarA, b0VarA2, v0.l(oq.y.a(aVar4, bool), oq.y.a(wy3.a.LOWER_CASE, bool), oq.y.a(wy3.a.UPPER_CASE, bool), oq.y.a(wy3.a.NUMBER, bool), oq.y.a(wy3.a.SPECIAL_MARK, bool)), null, null, false, 24, null);
        this.initialState = r15;
        this.inactivityTimer = new xw.b<>();
        this.stateMachine = aVar.a(r15, new er.l() { // from class: bz3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Y9(this.f22039a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), R9(r15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b F9(boolean hasLostFocus, hz.b currentValidityState, er.a<? extends hz.b> invalidState) {
        return (!hasLostFocus || currentValidityState.a()) ? currentValidityState : invalidState.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G9(tq.e<? super oq.i0> eVar) {
        xw.b<oq.i0> bVar = this.inactivityTimer;
        oq.i0 i0Var = oq.i0.f148189a;
        Object objF = bVar.F(i0Var, eVar);
        return objF == uq.b.e() ? objF : i0Var;
    }

    private final hz.b.Invalid I9(int messageResId) {
        hz.b.Invalid invalid = new hz.b.Invalid(this.labelProvider.c(messageResId));
        i00.a.a(this, new b(invalid, null));
        return invalid;
    }

    private final mu.g<oq.i0> J9() {
        return mu.i.o(this.inactivityTimer, 15000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String K9() {
        return this.labelProvider.c(uy3.a.f202337g).getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b.Invalid L9() {
        return I9(uy3.a.f202332b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String M9() {
        return this.labelProvider.c(uy3.a.f202338h).getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b.Invalid N9() {
        return I9(uy3.a.f202336f);
    }

    private final jb4.b O9(dx.b domainError) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: bz3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.P9((ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(ib4.c.b bVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b Q9() {
        return O9(new dx.b.Generic(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bz3.i.Data R9(bz3.h hVar) {
        cz3.i iVar = this.screenMapper;
        Label topMenuTitle = this.setupData.getTopMenuTitle();
        Label headerTitle = this.setupData.getHeaderTitle();
        Label headerMessage = this.setupData.getHeaderMessage();
        Label inputPasswordTitle = this.setupData.getInputPasswordTitle();
        Label inputRepeatPasswordTitle = this.setupData.getInputRepeatPasswordTitle();
        boolean backButtonVisible = this.setupData.getBackButtonVisible();
        boolean closeButtonVisible = this.setupData.getCloseButtonVisible();
        er.a<oq.i0> aVarB9 = b9(bz3.g.f22129a);
        er.a<oq.i0> aVarB10 = b9(bz3.b.f22038a);
        return iVar.b(new cz3.i.Params(hVar, topMenuTitle, headerTitle, headerMessage, inputPasswordTitle, inputRepeatPasswordTitle, backButtonVisible, closeButtonVisible, new er.l() { // from class: bz3.t
            @Override // er.l
            public final Object b(Object obj) {
                return c0.S9(this.f22207a, (iy.b0) obj);
            }
        }, new er.l() { // from class: bz3.u
            @Override // er.l
            public final Object b(Object obj) {
                return c0.T9(this.f22208a, (iy.b0) obj);
            }
        }, new er.l() { // from class: bz3.v
            @Override // er.l
            public final Object b(Object obj) {
                return c0.U9(this.f22209a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: bz3.w
            @Override // er.l
            public final Object b(Object obj) {
                return c0.V9(this.f22210a, ((Boolean) obj).booleanValue());
            }
        }, b9(a.f22037a), aVarB10, aVarB9, b9(bz3.f.f22127a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(c0 c0Var, iy.b0 b0Var) {
        c0Var.d9(new OnPasswordChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(c0 c0Var, iy.b0 b0Var) {
        c0Var.d9(new OnRepeatedPasswordChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(c0 c0Var, boolean z15) {
        c0Var.d9(new bz3.c.Password(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(c0 c0Var, boolean z15) {
        c0Var.d9(new bz3.c.RepeatPassword(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b W9(hz.b bVar) {
        return bVar.a() ? bVar : hz.b.C2039b.f86846c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(final c0 c0Var, k10.v vVar) {
        vVar.c(fr.q0.c(bz3.h.class), new er.l() { // from class: bz3.x
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Z9(this.f22211a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(bz3.h.PasswordInputFocused.class), new er.l() { // from class: bz3.y
            @Override // er.l
            public final Object b(Object obj) {
                return c0.aa(this.f22212a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(bz3.h.RepeatPasswordInputFocused.class), new er.l() { // from class: bz3.z
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ba(this.f22213a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(c0 c0Var, k10.z zVar) {
        d dVar = c0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.class), oVar, dVar);
        zVar.x(fr.q0.c(bz3.b.class), oVar, c0Var.new e(null));
        zVar.v(fr.q0.c(bz3.c.class), oVar, c0Var.new f(null));
        zVar.v(fr.q0.c(bz3.g.class), oVar, c0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(c0 c0Var, k10.z zVar) {
        k10.k.m(zVar, c0Var.J9(), null, c0Var.new h(null), 2, null);
        k10.k.m(zVar, (mu.g) c0Var.getImeVisibleStateUseCase.a(gz.b.a.C1792a.f78542a), null, new i(null), 2, null);
        zVar.C(c0Var.new j(null));
        k kVar = c0Var.new k(null);
        zVar.v(fr.q0.c(OnPasswordChanged.class), k10.o.CANCEL_PREVIOUS, kVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(c0 c0Var, k10.z zVar) {
        k10.k.m(zVar, c0Var.J9(), null, c0Var.new l(null), 2, null);
        k10.k.m(zVar, (mu.g) c0Var.getImeVisibleStateUseCase.a(gz.b.a.C1792a.f78542a), null, new m(null), 2, null);
        zVar.C(c0Var.new n(null));
        o oVar = c0Var.new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(OnRepeatedPasswordChanged.class), oVar2, oVar);
        zVar.x(fr.q0.c(bz3.f.class), oVar2, c0Var.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b ca(hz.b bVar, er.a<? extends hz.b> aVar) {
        return bVar.a() ? bVar : aVar.a();
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(vy3.b.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: X9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetPasswordSetupData setPasswordSetupData) {
        super.P5(setPasswordSetupData);
    }

    @Override // zx.b
    public xw.b<vy3.b.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<bz3.h, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<bz3.i.Data> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}

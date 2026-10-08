package wd0;

import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BQ\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003098\u0014X\u0094\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lwd0/u;", "Ll00/g;", "Lwd0/g;", "Lwd0/f;", "Lwd0/h;", "", "Lyy/a;", "stateMachineFactory", "Lxd0/d;", "mapper", "Lib4/c;", "errorMapper", "Lhb4/d;", "errorVMSFactory", "Lqg0/f;", "isUserPinValidUC", "Lqg0/a;", "changeUserPinUC", "Lqd0/a;", "validateChangePinUC", "Lqd0/b;", "validateRepeatedPinUC", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lyy/a;Lxd0/d;Lib4/c;Lhb4/d;Lqg0/f;Lqg0/a;Lqd0/a;Lqd0/b;Lac4/a;)V", "state", "Lwd0/h$a;", "C9", "(Lwd0/g;)Lwd0/h$a;", "b", "Lxd0/d;", "c", "Lib4/c;", "d", "Lhb4/d;", "e", "Lqg0/f;", "f", "Lqg0/a;", "g", "Lqd0/a;", "h", "Lqd0/b;", "j", "Lac4/a;", "Lwd0/g$d;", "k", "Lwd0/g$d;", "initialState", "Lxw/b;", "Lwd0/f$c;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<wd0.g, wd0.f> implements wd0.h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xd0.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final qg0.f isUserPinValidUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final qg0.a changeUserPinUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final qd0.a validateChangePinUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final qd0.b validateRepeatedPinUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final wd0.g.ConfirmCurrentPin initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wd0.f.c> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<wd0.g, wd0.f> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<wd0.h.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<wd0.h.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f212311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f212312b;

        /* JADX INFO: renamed from: wd0.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5595a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f212313a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f212314b;

            /* JADX INFO: renamed from: wd0.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5596a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f212315d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f212316e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f212317f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f212319h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f212320j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f212321k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f212322l;

                public C5596a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f212315d = obj;
                    this.f212316e |= PKIFailureInfo.systemUnavail;
                    return C5595a.this.F(null, this);
                }
            }

            public C5595a(mu.h hVar, u uVar) {
                this.f212313a = hVar;
                this.f212314b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5596a c5596a;
                if (eVar instanceof C5596a) {
                    c5596a = (C5596a) eVar;
                    int i15 = c5596a.f212316e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5596a.f212316e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5596a = new C5596a(eVar);
                    }
                } else {
                    c5596a = new C5596a(eVar);
                }
                Object obj2 = c5596a.f212315d;
                Object objE = uq.b.e();
                int i16 = c5596a.f212316e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f212313a;
                    wd0.h.a aVarC9 = this.f212314b.C9((wd0.g) obj);
                    c5596a.f212317f = vq.j.a(obj);
                    c5596a.f212319h = vq.j.a(c5596a);
                    c5596a.f212320j = vq.j.a(obj);
                    c5596a.f212321k = vq.j.a(hVar);
                    c5596a.f212322l = 0;
                    c5596a.f212316e = 1;
                    if (hVar.F(aVarC9, c5596a) == objE) {
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

        public a(mu.g gVar, u uVar) {
            this.f212311a = gVar;
            this.f212312b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super wd0.h.a> hVar, tq.e eVar) {
            Object objA = this.f212311a.a(new C5595a(hVar, this.f212312b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwd0/f$a;", "<unused var>", "Lwd0/g$d;", "Loq/i0;", "<anonymous>", "(Lwd0/f$a;Lwd0/g$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<wd0.f.a, wd0.g.ConfirmCurrentPin, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212323e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212323e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wd0.f.c> bVarY1 = u.this.Y1();
                wd0.f.c.a aVar = wd0.f.c.a.f212241a;
                this.f212323e = 1;
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
        public final Object w(wd0.f.a aVar, wd0.g.ConfirmCurrentPin confirmCurrentPin, tq.e<? super oq.i0> eVar) {
            return u.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwd0/f$e;", "action", "Lk10/c0;", "Lwd0/g$d;", "state", "Lk10/l;", "Lwd0/g;", "<anonymous>", "(Lwd0/f$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<wd0.f.OnCurrentPinChanged, k10.c0<wd0.g.ConfirmCurrentPin>, tq.e<? super k10.l<? extends wd0.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212326f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f212327g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.ConfirmCurrentPin V(wd0.f.OnCurrentPinChanged onCurrentPinChanged, wd0.g.ConfirmCurrentPin confirmCurrentPin) {
            return confirmCurrentPin.b(new wd0.g.StateData(hz.b.C2039b.f86846c, onCurrentPinChanged.getPinValue(), null, null, 12, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.CheckCurrentPin X(wd0.f.OnCurrentPinChanged onCurrentPinChanged, wd0.g.ConfirmCurrentPin confirmCurrentPin) {
            return new wd0.g.CheckCurrentPin(new wd0.g.StateData(null, onCurrentPinChanged.getPinValue(), null, null, 13, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wd0.f.OnCurrentPinChanged onCurrentPinChanged = (wd0.f.OnCurrentPinChanged) this.f212326f;
            k10.c0 c0Var = (k10.c0) this.f212327g;
            uq.b.e();
            if (this.f212325e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return onCurrentPinChanged.getPinValue().getData().length < 6 ? c0Var.b(new er.l() { // from class: wd0.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.c.V(onCurrentPinChanged, (g.ConfirmCurrentPin) obj2);
                }
            }) : c0Var.d(new er.l() { // from class: wd0.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.c.X(onCurrentPinChanged, (g.ConfirmCurrentPin) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(wd0.f.OnCurrentPinChanged onCurrentPinChanged, k10.c0<wd0.g.ConfirmCurrentPin> c0Var, tq.e<? super k10.l<? extends wd0.g>> eVar) {
            c cVar = new c(eVar);
            cVar.f212326f = onCurrentPinChanged;
            cVar.f212327g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lwd0/g$b;", "state", "Lk10/l;", "Lwd0/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<wd0.g.CheckCurrentPin>, tq.e<? super k10.l<? extends wd0.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212329f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lwd0/g;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends wd0.g>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f212331e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f212332f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<wd0.g.CheckCurrentPin> f212333g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, k10.c0<wd0.g.CheckCurrentPin> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f212332f = uVar;
                this.f212333g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wd0.g.NewPin X(k10.c0 c0Var, wd0.g.CheckCurrentPin checkCurrentPin) {
                return new wd0.g.NewPin(((wd0.g.CheckCurrentPin) c0Var.a()).getData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wd0.g.ConfirmCurrentPin Y(u uVar, wd0.g.CheckCurrentPin checkCurrentPin) {
                return new wd0.g.ConfirmCurrentPin(new wd0.g.StateData(new hz.b.Invalid(uVar.mapper.r()), null, null, null, 14, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f212331e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    qg0.f fVar = this.f212332f.isUserPinValidUC;
                    qg0.f.Params params = new qg0.f.Params(this.f212333g.a().getData().getCurrentPin());
                    this.f212331e = 1;
                    obj = fVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    final k10.c0<wd0.g.CheckCurrentPin> c0Var = this.f212333g;
                    return c0Var.d(new er.l() { // from class: wd0.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.d.a.X(c0Var, (g.CheckCurrentPin) obj2);
                        }
                    });
                }
                k10.c0<wd0.g.CheckCurrentPin> c0Var2 = this.f212333g;
                final u uVar = this.f212332f;
                return c0Var2.d(new er.l() { // from class: wd0.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.d.a.Y(uVar, (g.CheckCurrentPin) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f212332f, this.f212333g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends wd0.g>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f212329f;
            Object objE = uq.b.e();
            int i15 = this.f212328e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.callActionWithLoaderUseCase;
            a aVar2 = new a(u.this, c0Var, null);
            this.f212329f = vq.j.a(c0Var);
            this.f212328e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<wd0.g.CheckCurrentPin> c0Var, tq.e<? super k10.l<? extends wd0.g>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = u.this.new d(eVar);
            dVar.f212329f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwd0/f$a;", "<unused var>", "Lwd0/g$g;", "Loq/i0;", "<anonymous>", "(Lwd0/f$a;Lwd0/g$g;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<wd0.f.a, wd0.g.NewPin, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212334e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212334e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wd0.f.c> bVarY1 = u.this.Y1();
                wd0.f.c.a aVar = wd0.f.c.a.f212241a;
                this.f212334e = 1;
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
        public final Object w(wd0.f.a aVar, wd0.g.NewPin newPin, tq.e<? super oq.i0> eVar) {
            return u.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwd0/f$f;", "action", "Lk10/c0;", "Lwd0/g$g;", "state", "Lk10/l;", "Lwd0/g;", "<anonymous>", "(Lwd0/f$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<wd0.f.OnNewPinChanged, k10.c0<wd0.g.NewPin>, tq.e<? super k10.l<? extends wd0.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212337f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f212338g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.NewPin V(k10.c0 c0Var, wd0.f.OnNewPinChanged onNewPinChanged, wd0.g.NewPin newPin) {
            return newPin.b(wd0.g.StateData.b(((wd0.g.NewPin) c0Var.a()).getData(), hz.b.C2039b.f86846c, null, onNewPinChanged.getPinValue(), null, 10, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.CheckNewPin X(k10.c0 c0Var, wd0.f.OnNewPinChanged onNewPinChanged, wd0.g.NewPin newPin) {
            return new wd0.g.CheckNewPin(wd0.g.StateData.b(((wd0.g.NewPin) c0Var.a()).getData(), null, null, onNewPinChanged.getPinValue(), null, 11, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wd0.f.OnNewPinChanged onNewPinChanged = (wd0.f.OnNewPinChanged) this.f212337f;
            final k10.c0 c0Var = (k10.c0) this.f212338g;
            uq.b.e();
            if (this.f212336e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return onNewPinChanged.getPinValue().getData().length < 6 ? c0Var.b(new er.l() { // from class: wd0.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.V(c0Var, onNewPinChanged, (g.NewPin) obj2);
                }
            }) : c0Var.d(new er.l() { // from class: wd0.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.X(c0Var, onNewPinChanged, (g.NewPin) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(wd0.f.OnNewPinChanged onNewPinChanged, k10.c0<wd0.g.NewPin> c0Var, tq.e<? super k10.l<? extends wd0.g>> eVar) {
            f fVar = new f(eVar);
            fVar.f212337f = onNewPinChanged;
            fVar.f212338g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lwd0/g$c;", "state", "Lk10/l;", "Lwd0/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<wd0.g.CheckNewPin>, tq.e<? super k10.l<? extends wd0.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212340f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.NewPin V(k10.c0 c0Var, hz.g gVar, wd0.g.CheckNewPin checkNewPin) {
            return new wd0.g.NewPin(wd0.g.StateData.b(((wd0.g.CheckNewPin) c0Var.a()).getData(), hz.b.INSTANCE.a(gVar), null, iy.b0.INSTANCE.a(), null, 10, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.ConfirmNewPin X(k10.c0 c0Var, wd0.g.CheckNewPin checkNewPin) {
            return new wd0.g.ConfirmNewPin(((wd0.g.CheckNewPin) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f212340f;
            Object objE = uq.b.e();
            int i15 = this.f212339e;
            if (i15 == 0) {
                oq.u.b(obj);
                qd0.a aVar = u.this.validateChangePinUC;
                qd0.a.Params params = new qd0.a.Params(((wd0.g.CheckNewPin) c0Var.a()).getData().getNewPin(), ((wd0.g.CheckNewPin) c0Var.a()).getData().getCurrentPin());
                this.f212340f = c0Var;
                this.f212339e = 1;
                obj = aVar.e(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final hz.g gVar = (hz.g) obj;
            if (gVar instanceof hz.g.Invalid) {
                return c0Var.d(new er.l() { // from class: wd0.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.g.V(c0Var, gVar, (g.CheckNewPin) obj2);
                    }
                });
            }
            if (fr.t.c(gVar, hz.g.b.f86853b)) {
                return c0Var.d(new er.l() { // from class: wd0.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.g.X(c0Var, (g.CheckNewPin) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<wd0.g.CheckNewPin> c0Var, tq.e<? super k10.l<? extends wd0.g>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = u.this.new g(eVar);
            gVar.f212340f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwd0/f$a;", "<unused var>", "Lk10/c0;", "Lwd0/g$e;", "state", "Lk10/l;", "Lwd0/g;", "<anonymous>", "(Lwd0/f$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<wd0.f.a, k10.c0<wd0.g.ConfirmNewPin>, tq.e<? super k10.l<? extends wd0.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212343f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.NewPin O(k10.c0 c0Var, wd0.g.ConfirmNewPin confirmNewPin) {
            return new wd0.g.NewPin(wd0.g.StateData.b(((wd0.g.ConfirmNewPin) c0Var.a()).getData(), null, null, iy.b0.INSTANCE.a(), null, 11, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f212343f;
            uq.b.e();
            if (this.f212342e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: wd0.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O(c0Var, (g.ConfirmNewPin) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wd0.f.a aVar, k10.c0<wd0.g.ConfirmNewPin> c0Var, tq.e<? super k10.l<? extends wd0.g>> eVar) {
            h hVar = new h(eVar);
            hVar.f212343f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwd0/f$d;", "action", "Lk10/c0;", "Lwd0/g$e;", "state", "Lk10/l;", "Lwd0/g;", "<anonymous>", "(Lwd0/f$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<wd0.f.OnConfirmNewPinChanged, k10.c0<wd0.g.ConfirmNewPin>, tq.e<? super k10.l<? extends wd0.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f212346g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.ConfirmNewPin V(k10.c0 c0Var, wd0.f.OnConfirmNewPinChanged onConfirmNewPinChanged, wd0.g.ConfirmNewPin confirmNewPin) {
            return confirmNewPin.b(wd0.g.StateData.b(((wd0.g.ConfirmNewPin) c0Var.a()).getData(), hz.b.C2039b.f86846c, null, null, onConfirmNewPinChanged.getPinValue(), 6, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.CheckConfirmedNewPin X(k10.c0 c0Var, wd0.f.OnConfirmNewPinChanged onConfirmNewPinChanged, wd0.g.ConfirmNewPin confirmNewPin) {
            return new wd0.g.CheckConfirmedNewPin(wd0.g.StateData.b(((wd0.g.ConfirmNewPin) c0Var.a()).getData(), null, null, null, onConfirmNewPinChanged.getPinValue(), 7, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wd0.f.OnConfirmNewPinChanged onConfirmNewPinChanged = (wd0.f.OnConfirmNewPinChanged) this.f212345f;
            final k10.c0 c0Var = (k10.c0) this.f212346g;
            uq.b.e();
            if (this.f212344e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return onConfirmNewPinChanged.getPinValue().getData().length < 6 ? c0Var.b(new er.l() { // from class: wd0.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.i.V(c0Var, onConfirmNewPinChanged, (g.ConfirmNewPin) obj2);
                }
            }) : c0Var.d(new er.l() { // from class: wd0.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.i.X(c0Var, onConfirmNewPinChanged, (g.ConfirmNewPin) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(wd0.f.OnConfirmNewPinChanged onConfirmNewPinChanged, k10.c0<wd0.g.ConfirmNewPin> c0Var, tq.e<? super k10.l<? extends wd0.g>> eVar) {
            i iVar = new i(eVar);
            iVar.f212345f = onConfirmNewPinChanged;
            iVar.f212346g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lwd0/g$a;", "state", "Lk10/l;", "Lwd0/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<wd0.g.CheckConfirmedNewPin>, tq.e<? super k10.l<? extends wd0.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212348f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.ConfirmNewPin V(k10.c0 c0Var, hz.g gVar, wd0.g.CheckConfirmedNewPin checkConfirmedNewPin) {
            return new wd0.g.ConfirmNewPin(wd0.g.StateData.b(((wd0.g.CheckConfirmedNewPin) c0Var.a()).getData(), hz.b.INSTANCE.a(gVar), null, null, iy.b0.INSTANCE.a(), 6, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.SetNewPin X(k10.c0 c0Var, wd0.g.CheckConfirmedNewPin checkConfirmedNewPin) {
            return new wd0.g.SetNewPin(wd0.g.StateData.b(((wd0.g.CheckConfirmedNewPin) c0Var.a()).getData(), null, null, null, null, 15, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f212348f;
            Object objE = uq.b.e();
            int i15 = this.f212347e;
            if (i15 == 0) {
                oq.u.b(obj);
                qd0.b bVar = u.this.validateRepeatedPinUC;
                qd0.b.Params params = new qd0.b.Params(((wd0.g.CheckConfirmedNewPin) c0Var.a()).getData().getNewPin(), ((wd0.g.CheckConfirmedNewPin) c0Var.a()).getData().getRepeatedNewPin());
                this.f212348f = c0Var;
                this.f212347e = 1;
                obj = bVar.e(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final hz.g gVar = (hz.g) obj;
            if (gVar instanceof hz.g.Invalid) {
                return c0Var.d(new er.l() { // from class: wd0.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.j.V(c0Var, gVar, (g.CheckConfirmedNewPin) obj2);
                    }
                });
            }
            if (fr.t.c(gVar, hz.g.b.f86853b)) {
                return c0Var.d(new er.l() { // from class: wd0.h0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.j.X(c0Var, (g.CheckConfirmedNewPin) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<wd0.g.CheckConfirmedNewPin> c0Var, tq.e<? super k10.l<? extends wd0.g>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = u.this.new j(eVar);
            jVar.f212348f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lwd0/g$h;", "state", "Lk10/l;", "Lwd0/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<wd0.g.SetNewPin>, tq.e<? super k10.l<? extends wd0.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212351f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lwd0/g;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends wd0.g>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f212353e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f212354f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f212355g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f212356h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f212357j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f212358k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ u f212359l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<wd0.g.SetNewPin> f212360m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, k10.c0<wd0.g.SetNewPin> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f212359l = uVar;
                this.f212360m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wd0.g.Error X(final u uVar, dx.b bVar, k10.c0 c0Var, wd0.g.SetNewPin setNewPin) {
                return new wd0.g.Error(((wd0.g.SetNewPin) c0Var.a()).getData(), uVar.errorVMSFactory.a(uVar.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: wd0.j0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.k.a.Y(uVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Y(u uVar, ib4.c.b bVar) {
                if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary)) {
                    uVar.d9(wd0.f.a.f212239a);
                } else if (bVar instanceof ib4.c.b.a.Primary) {
                    uVar.d9(wd0.f.b.f212240a);
                } else if (!(bVar instanceof ib4.c.b.AbstractC2161b)) {
                    throw new oq.p();
                }
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<wd0.g.SetNewPin> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f212358k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    qg0.a aVar = this.f212359l.changeUserPinUC;
                    qg0.a.Params params = new qg0.a.Params(this.f212360m.a().getData().getCurrentPin(), this.f212360m.a().getData().getNewPin());
                    this.f212358k = 1;
                    obj = aVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f212354f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<wd0.g.SetNewPin> c0Var2 = this.f212360m;
                final u uVar = this.f212359l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: wd0.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.k.a.X(uVar, bVar, c0Var2, (g.SetNewPin) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                xw.b<wd0.f.c> bVarY1 = uVar.Y1();
                wd0.f.c.CloseWithDialog closeWithDialog = new wd0.f.c.CloseWithDialog(uVar.mapper.m());
                this.f212353e = vq.j.a(iVar);
                this.f212354f = c0Var2;
                this.f212355g = vq.j.a(i0Var);
                this.f212356h = 0;
                this.f212357j = 0;
                this.f212358k = 2;
                if (bVarY1.F(closeWithDialog, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f212359l, this.f212360m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends wd0.g>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f212351f;
            Object objE = uq.b.e();
            int i15 = this.f212350e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.callActionWithLoaderUseCase;
            a aVar2 = new a(u.this, c0Var, null);
            this.f212351f = vq.j.a(c0Var);
            this.f212350e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<wd0.g.SetNewPin> c0Var, tq.e<? super k10.l<? extends wd0.g>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f212351f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwd0/f$b;", "<unused var>", "Lk10/c0;", "Lwd0/g$f;", "state", "Lk10/l;", "Lwd0/g;", "<anonymous>", "(Lwd0/f$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<wd0.f.b, k10.c0<wd0.g.Error>, tq.e<? super k10.l<? extends wd0.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212362f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd0.g.ConfirmCurrentPin O(wd0.g.Error error) {
            return new wd0.g.ConfirmCurrentPin(new wd0.g.StateData(null, null, null, null, 15, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f212362f;
            uq.b.e();
            if (this.f212361e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: wd0.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.l.O((g.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wd0.f.b bVar, k10.c0<wd0.g.Error> c0Var, tq.e<? super k10.l<? extends wd0.g>> eVar) {
            l lVar = new l(eVar);
            lVar.f212362f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwd0/f$a;", "<unused var>", "Lwd0/g$f;", "Loq/i0;", "<anonymous>", "(Lwd0/f$a;Lwd0/g$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<wd0.f.a, wd0.g.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212363e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212363e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wd0.f.c> bVarY1 = u.this.Y1();
                wd0.f.c.a aVar = wd0.f.c.a.f212241a;
                this.f212363e = 1;
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
        public final Object w(wd0.f.a aVar, wd0.g.Error error, tq.e<? super oq.i0> eVar) {
            return u.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    public u(yy.a aVar, xd0.d dVar, ib4.c cVar, hb4.d dVar2, qg0.f fVar, qg0.a aVar2, qd0.a aVar3, qd0.b bVar, ac4.a aVar4) {
        this.mapper = dVar;
        this.errorMapper = cVar;
        this.errorVMSFactory = dVar2;
        this.isUserPinValidUC = fVar;
        this.changeUserPinUC = aVar2;
        this.validateChangePinUC = aVar3;
        this.validateRepeatedPinUC = bVar;
        this.callActionWithLoaderUseCase = aVar4;
        wd0.g.ConfirmCurrentPin confirmCurrentPin = new wd0.g.ConfirmCurrentPin(new wd0.g.StateData(null, null, null, null, 15, null));
        this.initialState = confirmCurrentPin;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(confirmCurrentPin, new er.l() { // from class: wd0.i
            @Override // er.l
            public final Object b(Object obj) {
                return u.H9(this.f212282a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), C9(confirmCurrentPin));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wd0.h.a C9(wd0.g state) {
        return this.mapper.b(new xd0.d.Params(state, new er.l() { // from class: wd0.l
            @Override // er.l
            public final Object b(Object obj) {
                return u.D9(this.f212289a, (iy.b0) obj);
            }
        }, new er.l() { // from class: wd0.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.E9(this.f212290a, (iy.b0) obj);
            }
        }, new er.l() { // from class: wd0.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.F9(this.f212292a, (iy.b0) obj);
            }
        }, b9(wd0.f.a.f212239a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(u uVar, iy.b0 b0Var) {
        uVar.d9(new wd0.f.OnCurrentPinChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(u uVar, iy.b0 b0Var) {
        uVar.d9(new wd0.f.OnNewPinChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(u uVar, iy.b0 b0Var) {
        uVar.d9(new wd0.f.OnConfirmNewPinChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(wd0.g.ConfirmCurrentPin.class), new er.l() { // from class: wd0.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.I9(this.f212294a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(wd0.g.CheckCurrentPin.class), new er.l() { // from class: wd0.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.J9(this.f212295a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(wd0.g.NewPin.class), new er.l() { // from class: wd0.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.K9(this.f212296a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(wd0.g.CheckNewPin.class), new er.l() { // from class: wd0.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f212297a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(wd0.g.ConfirmNewPin.class), new er.l() { // from class: wd0.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.M9((k10.z) obj);
            }
        });
        vVar.c(q0.c(wd0.g.CheckConfirmedNewPin.class), new er.l() { // from class: wd0.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.N9(this.f212298a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(wd0.g.SetNewPin.class), new er.l() { // from class: wd0.j
            @Override // er.l
            public final Object b(Object obj) {
                return u.O9(this.f212286a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(wd0.g.Error.class), new er.l() { // from class: wd0.k
            @Override // er.l
            public final Object b(Object obj) {
                return u.P9(this.f212288a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(wd0.f.a.class), oVar, bVar);
        zVar.v(q0.c(wd0.f.OnCurrentPinChanged.class), oVar, new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(u uVar, k10.z zVar) {
        zVar.A(uVar.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(u uVar, k10.z zVar) {
        e eVar = uVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(wd0.f.a.class), oVar, eVar);
        zVar.v(q0.c(wd0.f.OnNewPinChanged.class), oVar, new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(u uVar, k10.z zVar) {
        zVar.A(uVar.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(k10.z zVar) {
        h hVar = new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(wd0.f.a.class), oVar, hVar);
        zVar.v(q0.c(wd0.f.OnConfirmNewPinChanged.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(u uVar, k10.z zVar) {
        zVar.A(uVar.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(u uVar, k10.z zVar) {
        zVar.A(uVar.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(u uVar, k10.z zVar) {
        l lVar = new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(wd0.f.b.class), oVar, lVar);
        zVar.x(q0.c(wd0.f.a.class), oVar, uVar.new m(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<wd0.f.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<wd0.g, wd0.f> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<wd0.h.a> getState() {
        return this.state;
    }
}

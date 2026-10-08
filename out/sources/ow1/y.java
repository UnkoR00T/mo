package ow1;

import jb4.ErrorActionData;
import lw1.j0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Low1/y;", "Lxw/f;", "Low1/y$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "errorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "params", "O", "(Low1/y$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y implements xw.f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: ow1.y$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b(\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b)\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b\u001b\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b*\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b+\u0010'¨\u0006,"}, d2 = {"Low1/y$a;", "", "Lpw1/b;", "errorType", "Lyw1/a;", "certificateType", "", "resetPinAvailable", "Lkotlin/Function0;", "Loq/i0;", "goToCanScreenAction", "goToPinScreenAction", "goToResetPinAction", "cancelAction", "onFinishAction", "onRetryAction", "<init>", "(Lpw1/b;Lyw1/a;ZLer/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lpw1/b;", "c", "()Lpw1/b;", "b", "Lyw1/a;", "()Lyw1/a;", "Z", "i", "()Z", "d", "Ler/a;", "()Ler/a;", "e", "f", "g", "h", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final pw1.b errorType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final yw1.a certificateType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean resetPinAvailable;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToCanScreenAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToPinScreenAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToResetPinAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> cancelAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFinishAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRetryAction;

        public Params(pw1.b bVar, yw1.a aVar, boolean z15, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7) {
            this.errorType = bVar;
            this.certificateType = aVar;
            this.resetPinAvailable = z15;
            this.goToCanScreenAction = aVar2;
            this.goToPinScreenAction = aVar3;
            this.goToResetPinAction = aVar4;
            this.cancelAction = aVar5;
            this.onFinishAction = aVar6;
            this.onRetryAction = aVar7;
        }

        public final er.a<i0> a() {
            return this.cancelAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final yw1.a getCertificateType() {
            return this.certificateType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final pw1.b getErrorType() {
            return this.errorType;
        }

        public final er.a<i0> d() {
            return this.goToCanScreenAction;
        }

        public final er.a<i0> e() {
            return this.goToPinScreenAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.errorType, params.errorType) && this.certificateType == params.certificateType && this.resetPinAvailable == params.resetPinAvailable && fr.t.c(this.goToCanScreenAction, params.goToCanScreenAction) && fr.t.c(this.goToPinScreenAction, params.goToPinScreenAction) && fr.t.c(this.goToResetPinAction, params.goToResetPinAction) && fr.t.c(this.cancelAction, params.cancelAction) && fr.t.c(this.onFinishAction, params.onFinishAction) && fr.t.c(this.onRetryAction, params.onRetryAction);
        }

        public final er.a<i0> f() {
            return this.goToResetPinAction;
        }

        public final er.a<i0> g() {
            return this.onFinishAction;
        }

        public final er.a<i0> h() {
            return this.onRetryAction;
        }

        public int hashCode() {
            return (((((((((((((((this.errorType.hashCode() * 31) + this.certificateType.hashCode()) * 31) + Boolean.hashCode(this.resetPinAvailable)) * 31) + this.goToCanScreenAction.hashCode()) * 31) + this.goToPinScreenAction.hashCode()) * 31) + this.goToResetPinAction.hashCode()) * 31) + this.cancelAction.hashCode()) * 31) + this.onFinishAction.hashCode()) * 31) + this.onRetryAction.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getResetPinAvailable() {
            return this.resetPinAvailable;
        }

        public String toString() {
            return "Params(errorType=" + this.errorType + ", certificateType=" + this.certificateType + ", resetPinAvailable=" + this.resetPinAvailable + ", goToCanScreenAction=" + this.goToCanScreenAction + ", goToPinScreenAction=" + this.goToPinScreenAction + ", goToResetPinAction=" + this.goToResetPinAction + ", cancelAction=" + this.cancelAction + ", onFinishAction=" + this.onFinishAction + ", onRetryAction=" + this.onRetryAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150325a;

        static {
            int[] iArr = new int[yw1.a.values().length];
            try {
                iArr[yw1.a.AUTHENTICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yw1.a.AUTHORIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f150325a = iArr;
        }
    }

    public y(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.errorMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(Params params) {
        params.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c0(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f0(Params params, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a)) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                params.h().a();
            } else {
                if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                params.a().a();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(Params params) {
        params.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i0(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(Params params) {
        params.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l0(Params params) {
        params.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(Params params) {
        params.g().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i25;
        pw1.b errorType = params.getErrorType();
        if (errorType == pw1.b.EnumC4031b.GENERIC_ERROR) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120735i), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.a
                @Override // er.a
                public final Object a() {
                    return y.P(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.c
                @Override // er.a
                public final Object a() {
                    return y.Q(params);
                }
            }), 54, null);
        }
        if (errorType == pw1.b.EnumC4031b.WRONG_CAN) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120724f3), null, null, new ErrorActionData(this.labelProvider.c(j0.f120796v), new er.a() { // from class: ow1.h
                @Override // er.a
                public final Object a() {
                    return y.b0(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.i
                @Override // er.a
                public final Object a() {
                    return y.g0(params);
                }
            }), 54, null);
        }
        if (errorType == pw1.b.EnumC4031b.WRONG_PIN_2_TRIES_LEFT) {
            return new jb4.b.Failure(this.labelProvider.c(j0.F), this.labelProvider.c(j0.E), null, new ErrorActionData(this.labelProvider.c(j0.f120796v), new er.a() { // from class: ow1.j
                @Override // er.a
                public final Object a() {
                    return y.h0(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.k
                @Override // er.a
                public final Object a() {
                    return y.i0(params);
                }
            }), 52, null);
        }
        if (errorType == pw1.b.EnumC4031b.WRONG_PIN_1_TRY_LEFT) {
            return new jb4.b.Failure(this.labelProvider.c(j0.F), this.labelProvider.c(j0.D), null, new ErrorActionData(this.labelProvider.c(j0.f120796v), new er.a() { // from class: ow1.m
                @Override // er.a
                public final Object a() {
                    return y.j0(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.n
                @Override // er.a
                public final Object a() {
                    return y.k0(params);
                }
            }), 52, null);
        }
        if (errorType == pw1.b.EnumC4031b.PIN_BLOCKED) {
            boolean resetPinAvailable = params.getResetPinAvailable();
            if (resetPinAvailable) {
                mx.c cVar = this.labelProvider;
                int i26 = b.f150325a[params.getCertificateType().ordinal()];
                if (i26 == 1) {
                    i25 = j0.D1;
                } else {
                    if (i26 != 2) {
                        throw new oq.p();
                    }
                    i25 = j0.M1;
                }
                return new jb4.b.Failure(cVar.c(i25), this.labelProvider.c(j0.O1), null, new ErrorActionData(this.labelProvider.c(j0.N1), new er.a() { // from class: ow1.o
                    @Override // er.a
                    public final Object a() {
                        return y.l0(params);
                    }
                }), new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.p
                    @Override // er.a
                    public final Object a() {
                        return y.m0(params);
                    }
                }), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.l
                    @Override // er.a
                    public final Object a() {
                        return y.R(params);
                    }
                }), 36, null);
            }
            if (resetPinAvailable) {
                throw new oq.p();
            }
            mx.c cVar2 = this.labelProvider;
            int i27 = b.f150325a[params.getCertificateType().ordinal()];
            if (i27 == 1) {
                i19 = j0.D1;
            } else {
                if (i27 != 2) {
                    throw new oq.p();
                }
                i19 = j0.M1;
            }
            return new jb4.b.Failure(cVar2.c(i19), this.labelProvider.c(j0.P1), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.q
                @Override // er.a
                public final Object a() {
                    return y.S(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.r
                @Override // er.a
                public final Object a() {
                    return y.T(params);
                }
            }), 52, null);
        }
        if (errorType == pw1.b.EnumC4031b.CERTIFICATE_INACTIVE) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120759m3), this.labelProvider.c(j0.f120754l3), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.s
                @Override // er.a
                public final Object a() {
                    return y.U(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.t
                @Override // er.a
                public final Object a() {
                    return y.V(params);
                }
            }), 52, null);
        }
        if (errorType == pw1.b.EnumC4031b.CERTIFICATE_MISSING) {
            mx.c cVar3 = this.labelProvider;
            yw1.a certificateType = params.getCertificateType();
            int[] iArr = b.f150325a;
            int i28 = iArr[certificateType.ordinal()];
            if (i28 == 1) {
                i17 = j0.f120811y2;
            } else {
                if (i28 != 2) {
                    throw new oq.p();
                }
                i17 = j0.f120769o3;
            }
            Label labelC = cVar3.c(i17);
            mx.c cVar4 = this.labelProvider;
            int i29 = iArr[params.getCertificateType().ordinal()];
            if (i29 == 1) {
                i18 = j0.f120807x2;
            } else {
                if (i29 != 2) {
                    throw new oq.p();
                }
                i18 = j0.f120764n3;
            }
            return new jb4.b.Failure(labelC, cVar4.c(i18), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.u
                @Override // er.a
                public final Object a() {
                    return y.W(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.v
                @Override // er.a
                public final Object a() {
                    return y.X(params);
                }
            }), 52, null);
        }
        if (errorType != pw1.b.EnumC4031b.DATA_MISSING) {
            if (errorType == pw1.b.EnumC4031b.TECHNICAL_ERROR) {
                return new jb4.b.Failure(this.labelProvider.c(j0.f120735i), null, null, new ErrorActionData(this.labelProvider.c(j0.f120788t), new er.a() { // from class: ow1.b
                    @Override // er.a
                    public final Object a() {
                        return y.a0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.d
                    @Override // er.a
                    public final Object a() {
                        return y.c0(params);
                    }
                }), 54, null);
            }
            if (errorType == pw1.b.EnumC4031b.DATA_INCONSISTENCY) {
                return new jb4.b.Warning(this.labelProvider.c(j0.f120809y0), this.labelProvider.c(j0.f120801w0), null, new ErrorActionData(this.labelProvider.c(j0.f120788t), new er.a() { // from class: ow1.e
                    @Override // er.a
                    public final Object a() {
                        return y.d0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.f
                    @Override // er.a
                    public final Object a() {
                        return y.e0(params);
                    }
                }), 52, null);
            }
            if (errorType instanceof pw1.b.GenericError) {
                return this.errorMapper.b(new ib4.c.Params(((pw1.b.GenericError) errorType).getDomainError(), false, new er.l() { // from class: ow1.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return y.f0(params, (ib4.c.b) obj);
                    }
                }, 2, null));
            }
            throw new oq.p();
        }
        mx.c cVar5 = this.labelProvider;
        yw1.a certificateType2 = params.getCertificateType();
        int[] iArr2 = b.f150325a;
        int i35 = iArr2[certificateType2.ordinal()];
        if (i35 == 1) {
            i15 = j0.f120811y2;
        } else {
            if (i35 != 2) {
                throw new oq.p();
            }
            i15 = j0.f120769o3;
        }
        Label labelC2 = cVar5.c(i15);
        mx.c cVar6 = this.labelProvider;
        int i36 = iArr2[params.getCertificateType().ordinal()];
        if (i36 == 1) {
            i16 = j0.f120807x2;
        } else {
            if (i36 != 2) {
                throw new oq.p();
            }
            i16 = j0.f120764n3;
        }
        return new jb4.b.Failure(labelC2, cVar6.c(i16), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.w
            @Override // er.a
            public final Object a() {
                return y.Y(params);
            }
        }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: ow1.x
            @Override // er.a
            public final Object a() {
                return y.Z(params);
            }
        }), 52, null);
    }
}

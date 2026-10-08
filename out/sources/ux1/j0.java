package ux1;

import jb4.ErrorActionData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lux1/j0;", "Lxw/f;", "Lux1/j0$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "V", "(Lux1/j0$a;)Ljb4/b;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 implements xw.f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ux1.j0$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0019\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lux1/j0$a;", "", "Ltx1/a;", "errorType", "Lkotlin/Function0;", "Loq/i0;", "goToWelcomePageAction", "goToCanScreenAction", "goToPinScreenAction", "goToResetPinAction", "goToAddFileAction", "endProcessAction", "reportErrorAction", "<init>", "(Ltx1/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltx1/a;", "b", "()Ltx1/a;", "Ler/a;", "g", "()Ler/a;", "c", "d", "e", "f", "h", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final tx1.a errorType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> goToWelcomePageAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> goToCanScreenAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> goToPinScreenAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> goToResetPinAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> goToAddFileAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> endProcessAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> reportErrorAction;

        public Params(tx1.a aVar, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3, er.a<oq.i0> aVar4, er.a<oq.i0> aVar5, er.a<oq.i0> aVar6, er.a<oq.i0> aVar7, er.a<oq.i0> aVar8) {
            this.errorType = aVar;
            this.goToWelcomePageAction = aVar2;
            this.goToCanScreenAction = aVar3;
            this.goToPinScreenAction = aVar4;
            this.goToResetPinAction = aVar5;
            this.goToAddFileAction = aVar6;
            this.endProcessAction = aVar7;
            this.reportErrorAction = aVar8;
        }

        public final er.a<oq.i0> a() {
            return this.endProcessAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final tx1.a getErrorType() {
            return this.errorType;
        }

        public final er.a<oq.i0> c() {
            return this.goToAddFileAction;
        }

        public final er.a<oq.i0> d() {
            return this.goToCanScreenAction;
        }

        public final er.a<oq.i0> e() {
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
            return this.errorType == params.errorType && fr.t.c(this.goToWelcomePageAction, params.goToWelcomePageAction) && fr.t.c(this.goToCanScreenAction, params.goToCanScreenAction) && fr.t.c(this.goToPinScreenAction, params.goToPinScreenAction) && fr.t.c(this.goToResetPinAction, params.goToResetPinAction) && fr.t.c(this.goToAddFileAction, params.goToAddFileAction) && fr.t.c(this.endProcessAction, params.endProcessAction) && fr.t.c(this.reportErrorAction, params.reportErrorAction);
        }

        public final er.a<oq.i0> f() {
            return this.goToResetPinAction;
        }

        public final er.a<oq.i0> g() {
            return this.goToWelcomePageAction;
        }

        public final er.a<oq.i0> h() {
            return this.reportErrorAction;
        }

        public int hashCode() {
            return (((((((((((((this.errorType.hashCode() * 31) + this.goToWelcomePageAction.hashCode()) * 31) + this.goToCanScreenAction.hashCode()) * 31) + this.goToPinScreenAction.hashCode()) * 31) + this.goToResetPinAction.hashCode()) * 31) + this.goToAddFileAction.hashCode()) * 31) + this.endProcessAction.hashCode()) * 31) + this.reportErrorAction.hashCode();
        }

        public String toString() {
            return "Params(errorType=" + this.errorType + ", goToWelcomePageAction=" + this.goToWelcomePageAction + ", goToCanScreenAction=" + this.goToCanScreenAction + ", goToPinScreenAction=" + this.goToPinScreenAction + ", goToResetPinAction=" + this.goToResetPinAction + ", goToAddFileAction=" + this.goToAddFileAction + ", endProcessAction=" + this.endProcessAction + ", reportErrorAction=" + this.reportErrorAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202115a;

        static {
            int[] iArr = new int[tx1.a.values().length];
            try {
                iArr[tx1.a.GENERIC_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tx1.a.WRONG_CAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[tx1.a.WRONG_PIN_2_TRIES_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[tx1.a.WRONG_PIN_1_TRY_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[tx1.a.PIN_BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[tx1.a.CERTIFICATE_MISSING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[tx1.a.CERTIFICATE_INACTIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[tx1.a.DATA_MISSING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[tx1.a.DATA_INCONSISTENCY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[tx1.a.OCSP_STATUS_REVOKED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[tx1.a.OCSP_STATUS_INVALID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[tx1.a.MISSING_STORAGE_PERMISSION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[tx1.a.TECHNICAL_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[tx1.a.NO_SPACE_ON_DEVICE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[tx1.a.ENCRYPTED_FILE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f202115a = iArr;
        }
    }

    public j0(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(Params params) {
        params.g().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(Params params) {
        params.h().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(Params params) {
        params.d().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(Params params) {
        params.g().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(Params params) {
        params.g().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(Params params) {
        params.g().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s0(Params params) {
        params.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t0(Params params) {
        params.g().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v0(Params params) {
        params.e().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x0(Params params) {
        params.e().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y0(Params params) {
        params.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z0(Params params) {
        params.f().a();
        return oq.i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        switch (b.f202115a[params.getErrorType().ordinal()]) {
            case 1:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.f120735i), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.e
                    @Override // er.a
                    public final Object a() {
                        return j0.W(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.g
                    @Override // er.a
                    public final Object a() {
                        return j0.X(params);
                    }
                }), 54, null);
            case 2:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.A), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120796v), new er.a() { // from class: ux1.s
                    @Override // er.a
                    public final Object a() {
                        return j0.i0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.u
                    @Override // er.a
                    public final Object a() {
                        return j0.t0(params);
                    }
                }), 54, null);
            case 3:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.F), this.labelProvider.c(lw1.j0.E), null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120796v), new er.a() { // from class: ux1.v
                    @Override // er.a
                    public final Object a() {
                        return j0.v0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.w
                    @Override // er.a
                    public final Object a() {
                        return j0.w0(params);
                    }
                }), 52, null);
            case 4:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.F), this.labelProvider.c(lw1.j0.D), null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120796v), new er.a() { // from class: ux1.x
                    @Override // er.a
                    public final Object a() {
                        return j0.x0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.y
                    @Override // er.a
                    public final Object a() {
                        return j0.y0(params);
                    }
                }), 52, null);
            case 5:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.H), this.labelProvider.c(lw1.j0.G), null, new ErrorActionData(this.labelProvider.c(lw1.j0.N1), new er.a() { // from class: ux1.z
                    @Override // er.a
                    public final Object a() {
                        return j0.z0(params);
                    }
                }), new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.b0
                    @Override // er.a
                    public final Object a() {
                        return j0.A0(params);
                    }
                }), null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.p
                    @Override // er.a
                    public final Object a() {
                        return j0.Y(params);
                    }
                }), 36, null);
            case 6:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.L), this.labelProvider.c(lw1.j0.K), null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.a0
                    @Override // er.a
                    public final Object a() {
                        return j0.Z(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.c0
                    @Override // er.a
                    public final Object a() {
                        return j0.a0(params);
                    }
                }), 52, null);
            case 7:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.J), this.labelProvider.c(lw1.j0.I), null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.d0
                    @Override // er.a
                    public final Object a() {
                        return j0.b0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.e0
                    @Override // er.a
                    public final Object a() {
                        return j0.c0(params);
                    }
                }), 52, null);
            case 8:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.L), this.labelProvider.c(lw1.j0.K), null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.f0
                    @Override // er.a
                    public final Object a() {
                        return j0.d0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.g0
                    @Override // er.a
                    public final Object a() {
                        return j0.e0(params);
                    }
                }), 52, null);
            case 9:
                return new jb4.b.Warning(this.labelProvider.c(lw1.j0.f120809y0), this.labelProvider.c(lw1.j0.f120801w0), null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120788t), new er.a() { // from class: ux1.h0
                    @Override // er.a
                    public final Object a() {
                        return j0.f0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.i0
                    @Override // er.a
                    public final Object a() {
                        return j0.g0(params);
                    }
                }), 52, null);
            case 10:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.X0), this.labelProvider.c(lw1.j0.W0), null, new ErrorActionData(this.labelProvider.c(lw1.j0.V0), new er.a() { // from class: ux1.f
                    @Override // er.a
                    public final Object a() {
                        return j0.h0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.h
                    @Override // er.a
                    public final Object a() {
                        return j0.j0(params);
                    }
                }), 52, null);
            case 11:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.U0), this.labelProvider.c(lw1.j0.T0), null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.i
                    @Override // er.a
                    public final Object a() {
                        return j0.k0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.j
                    @Override // er.a
                    public final Object a() {
                        return j0.l0(params);
                    }
                }), 52, null);
            case 12:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.D0), this.labelProvider.c(lw1.j0.C0), null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120788t), new er.a() { // from class: ux1.k
                    @Override // er.a
                    public final Object a() {
                        return j0.m0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.l
                    @Override // er.a
                    public final Object a() {
                        return j0.n0(params);
                    }
                }), 52, null);
            case 13:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.f120735i), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.m
                    @Override // er.a
                    public final Object a() {
                        return j0.o0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.n
                    @Override // er.a
                    public final Object a() {
                        return j0.p0(params);
                    }
                }), 54, null);
            case 14:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.f120735i), this.labelProvider.c(lw1.j0.E0), null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.o
                    @Override // er.a
                    public final Object a() {
                        return j0.q0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.q
                    @Override // er.a
                    public final Object a() {
                        return j0.r0(params);
                    }
                }), 52, null);
            case 15:
                return new jb4.b.Failure(this.labelProvider.c(lw1.j0.O), null, this.labelProvider.c(lw1.j0.N), new ErrorActionData(this.labelProvider.c(lw1.j0.f120788t), new er.a() { // from class: ux1.r
                    @Override // er.a
                    public final Object a() {
                        return j0.s0(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(lw1.j0.f120725g), new er.a() { // from class: ux1.t
                    @Override // er.a
                    public final Object a() {
                        return j0.u0(params);
                    }
                }), 50, null);
            default:
                throw new oq.p();
        }
    }
}

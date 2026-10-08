package nb4;

import h30.ButtonData;
import i50.BaseScaffoldData;
import jb4.ErrorActionData;
import mx.Label;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnb4/q0;", "Lxw/f;", "Lnb4/q0$a;", "Lnb4/m;", "Lcx/a;", "eventThrottler", "<init>", "(Lcx/a;)V", "params", "O", "(Lnb4/q0$a;)Lnb4/m;", "a", "Lcx/a;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 implements xw.f<Params, m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cx.a eventThrottler;

    /* JADX INFO: renamed from: nb4.q0$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnb4/q0$a;", "", "Ljb4/b;", "errorData", "<init>", "(Ljb4/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljb4/b;", "()Ljb4/b;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final jb4.b errorData;

        public Params(jb4.b bVar) {
            this.errorData = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jb4.b getErrorData() {
            return this.errorData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.errorData, ((Params) other).errorData);
        }

        public int hashCode() {
            return this.errorData.hashCode();
        }

        public String toString() {
            return "Params(errorData=" + this.errorData + ')';
        }
    }

    public q0(cx.a aVar) {
        this.eventThrottler = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(q0 q0Var, final jb4.b bVar) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.o0
            @Override // er.a
            public final Object a() {
                return q0.Q(bVar);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(jb4.b bVar) {
        ((jb4.b.Failure) bVar).getCloseButton().c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(q0 q0Var, final jb4.b bVar) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.s
            @Override // er.a
            public final Object a() {
                return q0.S(bVar);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(jb4.b bVar) {
        ((jb4.b.Failure) bVar).getPrimaryButton().c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(q0 q0Var, final ErrorActionData errorActionData) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.k0
            @Override // er.a
            public final Object a() {
                return q0.U(errorActionData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(ErrorActionData errorActionData) {
        errorActionData.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(q0 q0Var, final ErrorActionData errorActionData) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.d0
            @Override // er.a
            public final Object a() {
                return q0.W(errorActionData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(ErrorActionData errorActionData) {
        errorActionData.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(q0 q0Var, final ErrorActionData errorActionData) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.i0
            @Override // er.a
            public final Object a() {
                return q0.Y(errorActionData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(ErrorActionData errorActionData) {
        errorActionData.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(q0 q0Var, final ErrorActionData errorActionData) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.m0
            @Override // er.a
            public final Object a() {
                return q0.a0(errorActionData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(ErrorActionData errorActionData) {
        errorActionData.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(q0 q0Var, final jb4.b bVar) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.t
            @Override // er.a
            public final Object a() {
                return q0.c0(bVar);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(jb4.b bVar) {
        ((jb4.b.Info) bVar).getCloseButton().c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(q0 q0Var, final jb4.b bVar) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.u
            @Override // er.a
            public final Object a() {
                return q0.e0(bVar);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(jb4.b bVar) {
        ((jb4.b.Info) bVar).getPrimaryButton().c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(q0 q0Var, final ErrorActionData errorActionData) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.n0
            @Override // er.a
            public final Object a() {
                return q0.g0(errorActionData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(ErrorActionData errorActionData) {
        errorActionData.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(q0 q0Var, final ErrorActionData errorActionData) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.l0
            @Override // er.a
            public final Object a() {
                return q0.i0(errorActionData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(ErrorActionData errorActionData) {
        errorActionData.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(q0 q0Var, final jb4.b bVar) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.j0
            @Override // er.a
            public final Object a() {
                return q0.k0(bVar);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(jb4.b bVar) {
        ((jb4.b.Warning) bVar).getCloseButton().c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(q0 q0Var, final jb4.b bVar) {
        cx.a.a(q0Var.eventThrottler, 0L, new er.a() { // from class: nb4.p0
            @Override // er.a
            public final Object a() {
                return q0.m0(bVar);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(jb4.b bVar) {
        ((jb4.b.Warning) bVar).getPrimaryButton().c().a();
        return oq.i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public m b(Params params) {
        ButtonData buttonData;
        ButtonData buttonData2;
        ButtonData buttonData3;
        final jb4.b errorData = params.getErrorData();
        ButtonData buttonData4 = null;
        if (errorData instanceof jb4.b.Failure) {
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), new er.a() { // from class: nb4.v
                @Override // er.a
                public final Object a() {
                    return q0.P(this.f133903a, errorData);
                }
            }), null, null, null, null, 30, null), null, null, null, null, 61, null);
            q40.j.b.a aVar = q40.j.b.a.f164684d;
            jb4.b.Failure failure = (jb4.b.Failure) errorData;
            Label title = failure.getTitle();
            Label message = failure.getMessage();
            Label secondMessage = failure.getSecondMessage();
            ButtonData buttonData5 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(failure.getPrimaryButton().getLabel(), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: nb4.y
                @Override // er.a
                public final Object a() {
                    return q0.R(this.f133909a, errorData);
                }
            }, 35, null);
            final ErrorActionData secondaryButton = failure.getSecondaryButton();
            if (secondaryButton != null) {
                buttonData3 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(secondaryButton.getLabel(), null, 2, null), new k30.d.Secondary(null, 1, null), null, new er.a() { // from class: nb4.z
                    @Override // er.a
                    public final Object a() {
                        return q0.X(this.f133911a, secondaryButton);
                    }
                }, 35, null);
            } else {
                buttonData3 = null;
            }
            final ErrorActionData tertiaryButton = failure.getTertiaryButton();
            if (tertiaryButton != null) {
                buttonData4 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(tertiaryButton.getLabel(), null, 2, null), k30.d.c.f107775a, null, new er.a() { // from class: nb4.a0
                    @Override // er.a
                    public final Object a() {
                        return q0.Z(this.f133841a, tertiaryButton);
                    }
                }, 35, null);
            }
            return new m.Initialized(baseScaffoldData, new IconPageData(aVar, title, message, secondMessage, null, new IconPageBottomContentData(buttonData5, buttonData3, buttonData4), true));
        }
        if (errorData instanceof jb4.b.Info) {
            BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), new er.a() { // from class: nb4.b0
                @Override // er.a
                public final Object a() {
                    return q0.b0(this.f133845a, errorData);
                }
            }), null, null, null, null, 30, null), null, null, null, null, 61, null);
            q40.j.b.C4090b c4090b = q40.j.b.C4090b.f164686d;
            jb4.b.Info info = (jb4.b.Info) errorData;
            Label title2 = info.getTitle();
            Label message2 = info.getMessage();
            Label secondMessage2 = info.getSecondMessage();
            ButtonData buttonData6 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(info.getPrimaryButton().getLabel(), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: nb4.c0
                @Override // er.a
                public final Object a() {
                    return q0.d0(this.f133848a, errorData);
                }
            }, 35, null);
            final ErrorActionData secondaryButton2 = info.getSecondaryButton();
            if (secondaryButton2 != null) {
                buttonData2 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(secondaryButton2.getLabel(), null, 2, null), new k30.d.Secondary(null, 1, null), null, new er.a() { // from class: nb4.e0
                    @Override // er.a
                    public final Object a() {
                        return q0.f0(this.f133853a, secondaryButton2);
                    }
                }, 35, null);
            } else {
                buttonData2 = null;
            }
            final ErrorActionData tertiaryButton2 = info.getTertiaryButton();
            if (tertiaryButton2 != null) {
                buttonData4 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(tertiaryButton2.getLabel(), null, 2, null), k30.d.c.f107775a, null, new er.a() { // from class: nb4.f0
                    @Override // er.a
                    public final Object a() {
                        return q0.h0(this.f133856a, tertiaryButton2);
                    }
                }, 35, null);
            }
            return new m.Initialized(baseScaffoldData2, new IconPageData(c4090b, title2, message2, secondMessage2, null, new IconPageBottomContentData(buttonData6, buttonData2, buttonData4), true));
        }
        if (!(errorData instanceof jb4.b.Warning)) {
            if (fr.t.c(errorData, jb4.b.a.f101356a)) {
                return m.a.f133885a;
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData3 = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), new er.a() { // from class: nb4.g0
            @Override // er.a
            public final Object a() {
                return q0.j0(this.f133858a, errorData);
            }
        }), null, null, null, null, 30, null), null, null, null, null, 61, null);
        q40.j.b.d dVar = q40.j.b.d.f164690d;
        jb4.b.Warning warning = (jb4.b.Warning) errorData;
        Label title3 = warning.getTitle();
        Label message3 = warning.getMessage();
        Label secondMessage3 = warning.getSecondMessage();
        ButtonData buttonData7 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(warning.getPrimaryButton().getLabel(), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: nb4.h0
            @Override // er.a
            public final Object a() {
                return q0.l0(this.f133860a, errorData);
            }
        }, 35, null);
        final ErrorActionData secondaryButton3 = warning.getSecondaryButton();
        if (secondaryButton3 != null) {
            buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(secondaryButton3.getLabel(), null, 2, null), new k30.d.Secondary(null, 1, null), null, new er.a() { // from class: nb4.w
                @Override // er.a
                public final Object a() {
                    return q0.T(this.f133905a, secondaryButton3);
                }
            }, 35, null);
        } else {
            buttonData = null;
        }
        final ErrorActionData tertiaryButton3 = warning.getTertiaryButton();
        if (tertiaryButton3 != null) {
            buttonData4 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(tertiaryButton3.getLabel(), null, 2, null), k30.d.c.f107775a, null, new er.a() { // from class: nb4.x
                @Override // er.a
                public final Object a() {
                    return q0.V(this.f133907a, tertiaryButton3);
                }
            }, 35, null);
        }
        return new m.Initialized(baseScaffoldData3, new IconPageData(dVar, title3, message3, secondMessage3, null, new IconPageBottomContentData(buttonData7, buttonData, buttonData4), true));
    }
}

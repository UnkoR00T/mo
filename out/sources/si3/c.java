package si3;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import ri3.d;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsi3/c;", "Lxw/f;", "Lsi3/c$a;", "Lri3/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lsi3/c$a;)Lri3/d$a;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: si3.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006 "}, d2 = {"Lsi3/c$a;", "", "Lri3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onGoToCompleteData", "Lkotlin/Function1;", "", "onCallInsurer", "onClose", "<init>", "(Lri3/c;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lri3/c;", "d", "()Lri3/c;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/l;", "()Ler/l;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ri3.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToCompleteData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onCallInsurer;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ri3.c cVar, er.a<i0> aVar, l<? super String, i0> lVar, er.a<i0> aVar2) {
            this.state = cVar;
            this.onGoToCompleteData = aVar;
            this.onCallInsurer = lVar;
            this.onClose = aVar2;
        }

        public final l<String, i0> a() {
            return this.onCallInsurer;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onGoToCompleteData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ri3.c getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onGoToCompleteData, params.onGoToCompleteData) && t.c(this.onCallInsurer, params.onCallInsurer) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onGoToCompleteData.hashCode()) * 31) + this.onCallInsurer.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onGoToCompleteData=" + this.onGoToCompleteData + ", onCallInsurer=" + this.onCallInsurer + ", onClose=" + this.onClose + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, String str) {
        params.a().b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0128  */
    /* JADX WARN: Code duplicated, block: B:33:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0134  */
    /* JADX WARN: Code duplicated, block: B:36:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0141  */
    /* JADX WARN: Code duplicated, block: B:39:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x014e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0157  */
    /* JADX WARN: Code duplicated, block: B:43:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x015f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0178  */
    /* JADX WARN: Code duplicated, block: B:48:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0193  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ba  */
    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        ButtonData buttonData;
        final Params params2;
        ButtonData buttonData2;
        IconPageBottomContentData iconPageBottomContentData;
        IconPageBottomContentData iconPageBottomContentData2;
        Label labelC;
        Label labelE;
        Label labelC2;
        ri3.c state = params.getState();
        if (!(state instanceof ri3.c.Display)) {
            if (state instanceof ri3.c.Error) {
                return new d.a.Error(((ri3.c.Error) params.getState()).getErrorVMS());
            }
            throw new p();
        }
        boolean z15 = ((ri3.c.Display) params.getState()).getInsurerData().getFillFormClaimUrl() != null;
        boolean z16 = ((ri3.c.Display) params.getState()).getInsurerData().getPhoneNumber() != null;
        if (((ri3.c.Display) params.getState()).getInsurerData().getFillFormClaimUrl() != null) {
            buttonData = new ButtonData("GoToCompleteDataButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.B1), null, 2, null), k30.d.a.f107773a, k30.b.c.f107768a, params.c(), 2, null);
        } else {
            buttonData = null;
        }
        final String phoneNumber = ((ri3.c.Display) params.getState()).getInsurerData().getPhoneNumber();
        if (phoneNumber != null) {
            params2 = params;
            buttonData2 = new ButtonData("CallInsurerButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.A1), null, 2, null), k30.d.a.f107773a, k30.b.c.f107768a, new er.a() { // from class: si3.a
                @Override // er.a
                public final Object a() {
                    return c.h(params2, phoneNumber);
                }
            }, 2, null);
        } else {
            params2 = params;
            buttonData2 = null;
        }
        if (buttonData == null || buttonData2 == null) {
            if (buttonData != null) {
                iconPageBottomContentData2 = new IconPageBottomContentData(buttonData, null, null, 6, null);
            } else {
                iconPageBottomContentData = buttonData2 != null ? new IconPageBottomContentData(buttonData2, null, null, 6, null) : null;
            }
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(null, null, null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params2.b(), 6, null)), null, 23, null), null, null, null, null, 61, null);
            j.b.c cVar = j.b.c.f164688d;
            if (z15) {
                labelC = this.labelProvider.c(md3.b.I1);
            } else {
                if (!z15) {
                    throw new p();
                }
                labelC = this.labelProvider.c(md3.b.H1);
            }
            Label label = labelC;
            if (z15) {
                if (!z16) {
                    labelE = this.labelProvider.c(md3.b.D1);
                } else {
                    if (z16) {
                        throw new p();
                    }
                    labelE = this.labelProvider.c(md3.b.C1);
                }
            } else {
                if (!z15) {
                    throw new p();
                }
                labelE = this.labelProvider.e(md3.b.G1, ((ri3.c.Display) params2.getState()).getProviderName());
            }
            Label label2 = labelE;
            if (z15) {
                labelC2 = this.labelProvider.e(md3.b.E1, ((ri3.c.Display) params2.getState()).getProviderName());
            } else {
                if (!z15) {
                    throw new p();
                }
                labelC2 = this.labelProvider.c(md3.b.F1);
            }
            return new d.a.Display(baseScaffoldData, new IconPageData(cVar, label, label2, labelC2, null, iconPageBottomContentData, true), new er.a() { // from class: si3.b
                @Override // er.a
                public final Object a() {
                    return c.i();
                }
            });
        }
        iconPageBottomContentData2 = new IconPageBottomContentData(buttonData, ButtonData.b(buttonData2, null, null, null, null, new k30.d.Secondary(null, 1, null), null, null, 111, null), null, 4, null);
        iconPageBottomContentData = iconPageBottomContentData2;
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new i.Small(null, null, null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params2.b(), 6, null)), null, 23, null), null, null, null, null, 61, null);
        j.b.c cVar2 = j.b.c.f164688d;
        if (z15) {
            labelC = this.labelProvider.c(md3.b.I1);
        } else {
            if (!z15) {
                throw new p();
            }
            labelC = this.labelProvider.c(md3.b.H1);
        }
        Label label3 = labelC;
        if (z15) {
            if (!z16) {
                labelE = this.labelProvider.c(md3.b.D1);
            } else {
                if (z16) {
                    throw new p();
                }
                labelE = this.labelProvider.c(md3.b.C1);
            }
        } else {
            if (!z15) {
                throw new p();
            }
            labelE = this.labelProvider.e(md3.b.G1, ((ri3.c.Display) params2.getState()).getProviderName());
        }
        Label label4 = labelE;
        if (z15) {
            labelC2 = this.labelProvider.e(md3.b.E1, ((ri3.c.Display) params2.getState()).getProviderName());
        } else {
            if (!z15) {
                throw new p();
            }
            labelC2 = this.labelProvider.c(md3.b.F1);
        }
        return new d.a.Display(baseScaffoldData2, new IconPageData(cVar2, label3, label4, labelC2, null, iconPageBottomContentData, true), new er.a() { // from class: si3.b
            @Override // er.a
            public final Object a() {
                return c.i();
            }
        });
    }
}

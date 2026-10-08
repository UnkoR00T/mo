package o63;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import k30.d;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.b;
import n63.State;
import n63.i;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lo63/a;", "Lxw/f;", "Lo63/a$a;", "Ln63/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lo63/a$a;)Ln63/i$a;", "a", "Lmx/c;", "Lp63/a;", "", "c", "(Lp63/a;)I", "infoLabelResId", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, i.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: o63.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo63/a$a;", "", "Ln63/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "nextAction", "changeContactAction", "<init>", "(Ln63/h;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln63/h;", "d", "()Ln63/h;", "b", "Ler/a;", "()Ler/a;", "c", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> changeContactAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.backAction = aVar;
            this.nextAction = aVar2;
            this.changeContactAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.changeContactAction;
        }

        public final er.a<i0> c() {
            return this.nextAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.nextAction, params.nextAction) && t.c(this.changeContactAction, params.changeContactAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.changeContactAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", nextAction=" + this.nextAction + ", changeContactAction=" + this.changeContactAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final int c(p63.a aVar) {
        if (aVar instanceof p63.a.Email) {
            return c53.a.f23684e;
        }
        if (aVar instanceof p63.a.Phone) {
            return c53.a.f23702k;
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006c  */
    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public i.Data b(Params params) {
        Label labelC;
        Label labelC2;
        int i15;
        int i16;
        int i17;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(c53.a.X), null, null, null, 28, null), null, null, null, null, 61, null);
        b0 previousContact = params.getState().getConfirmationType().getPreviousContact();
        if (previousContact != null) {
            c cVar = this.labelProvider;
            p63.a confirmationType = params.getState().getConfirmationType();
            if (confirmationType instanceof p63.a.Email) {
                i17 = c53.a.X0;
            } else {
                if (!(confirmationType instanceof p63.a.Phone)) {
                    throw new p();
                }
                i17 = c53.a.Z0;
            }
            labelC = cVar.e(i17, c0.e(previousContact));
            if (labelC == null) {
                labelC = this.labelProvider.c(c53.a.W0);
            }
        } else {
            labelC = this.labelProvider.c(c53.a.W0);
        }
        Label label = labelC;
        if (params.getState().getConfirmationType().getPreviousContact() != null) {
            p63.a confirmationType2 = params.getState().getConfirmationType();
            if (confirmationType2 instanceof p63.a.Email) {
                i16 = c53.a.Y0;
            } else {
                if (!(confirmationType2 instanceof p63.a.Phone)) {
                    throw new p();
                }
                i16 = c53.a.f23674a1;
            }
            labelC2 = this.labelProvider.c(i16);
        } else {
            labelC2 = null;
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(c(params.getState().getConfirmationType())), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.b(c0.e(params.getState().getConfirmationType().getContact()), "confirmationTypeContact"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        Label label2 = labelC2;
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(c53.a.f23699j), null, 2, null), d.a.f107773a, null, params.c(), 35, null);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        d.Secondary secondary = new d.Secondary(null, 1, null);
        p63.a confirmationType3 = params.getState().getConfirmationType();
        if (confirmationType3 instanceof p63.a.Email) {
            i15 = c53.a.U0;
        } else {
            if (!(confirmationType3 instanceof p63.a.Phone)) {
                throw new p();
            }
            i15 = c53.a.V0;
        }
        return new i.Data(baseScaffoldData, label, label2, defaultSingleCardData, buttonData, new ButtonData(null, null, large, new k30.c.WithText(this.labelProvider.c(i15), null, 2, null), secondary, null, params.b(), 35, null));
    }
}

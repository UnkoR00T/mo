package zx1;

import cx1.NfcScreenModel;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import lw1.j0;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import yx1.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\" B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\u00020\f*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lzx1/e;", "Lxw/f;", "Lzx1/e$b;", "Lyx1/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", "title", "description", "progress", "Lcx1/a;", "c", "(Lzx1/e$b;Lmx/a;Lmx/a;Lmx/a;)Lcx1/a;", "params", "", "Lyx1/g$a$d;", "l", "(Lzx1/e$b;Ljava/lang/String;)Lyx1/g$a$d;", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "Li50/a;", "f", "(Lmx/a;Ler/a;)Li50/a;", "Lcy/c;", "q", "(Lcy/c;)Lmx/a;", "m", "i", "(Lzx1/e$b;)Lyx1/g$a;", "a", "Lmx/c;", "b", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, g.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f238290c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: zx1.e$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzx1/e$b;", "", "Lyx1/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClose", "<init>", "(Lyx1/f;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyx1/f;", "c", "()Lyx1/f;", "b", "Ler/a;", "()Ler/a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f238292d = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final yx1.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public Params(yx1.f fVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = fVar;
            this.onBack = aVar;
            this.onClose = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final yx1.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final NfcScreenModel c(Params params, Label label, Label label2, Label label3) {
        return new NfcScreenModel(h(this, null, params.b(), 1, null), label, label2, label3, params.a(), params.getState().getFormData().getAreAnimationsEnabled());
    }

    static /* synthetic */ NfcScreenModel e(e eVar, Params params, Label label, Label label2, Label label3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = eVar.labelProvider.c(j0.f120797v0);
        }
        if ((i15 & 2) != 0) {
            label2 = eVar.labelProvider.c(j0.f120793u0);
        }
        if ((i15 & 4) != 0) {
            label3 = null;
        }
        return eVar.c(params, label, label2, label3);
    }

    private final BaseScaffoldData f(Label title, er.a<i0> onCloseAction) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onCloseAction), title, null, null, null, 28, null), null, null, null, null, 61, null);
    }

    static /* synthetic */ BaseScaffoldData h(e eVar, Label label, er.a aVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = Label.INSTANCE.c();
        }
        return eVar.f(label, aVar);
    }

    private final g.a.NfcScanning l(Params params, String progress) {
        return new g.a.NfcScanning(c(params, this.labelProvider.c(j0.f120798v1), this.labelProvider.c(j0.P), mx.b.b(progress, "ActivationProcessProgress")));
    }

    private final Label m(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(j0.B) : this.labelProvider.c(j0.f120780r);
        }
        if ((cVar instanceof cy.c.Started) || (cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Finished)) {
            return this.labelProvider.c(j0.P);
        }
        throw new p();
    }

    private final Label q(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(j0.C) : this.labelProvider.c(j0.f120735i);
        }
        if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Finished) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
            return this.labelProvider.c(j0.Q);
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        yx1.f state = params.getState();
        if ((state instanceof yx1.f.Initial) || (state instanceof yx1.f.CheckNfc)) {
            return new g.a.NfcInfo(e(this, params, null, null, null, 7, null));
        }
        if (state instanceof yx1.f.ReadCert) {
            cy.c lastReadingData = ((yx1.f.ReadCert) state).getLastReadingData();
            return ((lastReadingData instanceof cy.c.Started) || lastReadingData == null) ? new g.a.NfcInfo(e(this, params, null, null, null, 7, null)) : new g.a.NfcScanning(e(this, params, q(lastReadingData), m(lastReadingData), null, 4, null));
        }
        if (state instanceof yx1.f.ReadPesel) {
            return l(params, "20 %");
        }
        if (state instanceof yx1.f.InitAuthentication) {
            return l(params, "30 %");
        }
        if (state instanceof yx1.f.SignWithIdCard) {
            cy.c lastReadingData2 = ((yx1.f.SignWithIdCard) state).getLastReadingData();
            if ((lastReadingData2 instanceof cy.c.Started) || lastReadingData2 == null) {
                return new g.a.NfcInfo(e(this, params, null, null, null, 7, null));
            }
            return ((lastReadingData2 instanceof cy.c.Info) || (lastReadingData2 instanceof cy.c.Progress)) ? l(params, "40 %") : new g.a.NfcScanning(e(this, params, q(lastReadingData2), m(lastReadingData2), null, 4, null));
        }
        if (state instanceof yx1.f.CreateJWSEToken) {
            return l(params, "60 %");
        }
        if (state instanceof yx1.f.GenerateActivationChallenge) {
            return l(params, "80 %");
        }
        if (state instanceof yx1.f.ChallengeGeneratedSuccessfully) {
            return l(params, "100 %");
        }
        if (state instanceof yx1.f.Error) {
            return new g.a.Error(((yx1.f.Error) state).getErrorVMS());
        }
        if (!(state instanceof yx1.f.CustomBusinessError)) {
            throw new p();
        }
        yx1.f.CustomBusinessError customBusinessError = (yx1.f.CustomBusinessError) state;
        return new g.a.CustomBusinessError(f(this.labelProvider.c(j0.f120802w1), params.b()), new IconPageData(new j.a(jz.a.f106770f2), customBusinessError.getError().getTitle(), customBusinessError.getError().getMessage(), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(customBusinessError.getError().getPrimaryActionLabel(), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), null, null, 6, null), false, 72, null));
    }
}

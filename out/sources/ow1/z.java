package ow1;

import cx1.NfcScreenModel;
import h30.ButtonData;
import i50.BaseScaffoldData;
import lw1.j0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Low1/z;", "Lxw/f;", "Low1/z$a;", "Lnw1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", "title", "description", "Lcx1/a;", "c", "(Low1/z$a;Lmx/a;Lmx/a;)Lcx1/a;", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "Li50/a;", "f", "(Ler/a;)Li50/a;", "Lcy/c;", "l", "(Lcy/c;)Lmx/a;", "i", "q", "m", "params", "h", "(Low1/z$a;)Lnw1/c$a;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements xw.f<Params, nw1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ow1.z$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001c¨\u0006 "}, d2 = {"Low1/z$a;", "", "Lnw1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onCloseWithDialogAction", "onFinishAction", "onCloseAction", "<init>", "(Lnw1/b;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnw1/b;", "d", "()Lnw1/b;", "b", "Ler/a;", "()Ler/a;", "c", "e", "getOnCloseAction", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nw1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseWithDialogAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFinishAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public Params(nw1.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onBackAction = aVar;
            this.onCloseWithDialogAction = aVar2;
            this.onFinishAction = aVar3;
            this.onCloseAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseWithDialogAction;
        }

        public final er.a<i0> c() {
            return this.onFinishAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final nw1.b getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackAction, params.onBackAction) && fr.t.c(this.onCloseWithDialogAction, params.onCloseWithDialogAction) && fr.t.c(this.onFinishAction, params.onFinishAction) && fr.t.c(this.onCloseAction, params.onCloseAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseWithDialogAction.hashCode()) * 31) + this.onFinishAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onCloseWithDialogAction=" + this.onCloseWithDialogAction + ", onFinishAction=" + this.onFinishAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150332a;

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
            f150332a = iArr;
        }
    }

    public z(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final NfcScreenModel c(Params params, Label label, Label label2) {
        return new NfcScreenModel(f(params.b()), label, label2, null, params.a(), params.getState().getAreAnimationsEnabled(), 8, null);
    }

    static /* synthetic */ NfcScreenModel e(z zVar, Params params, Label label, Label label2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = zVar.labelProvider.c(j0.f120797v0);
        }
        if ((i15 & 2) != 0) {
            label2 = zVar.labelProvider.c(j0.f120793u0);
        }
        return zVar.c(params, label, label2);
    }

    private final BaseScaffoldData f(er.a<i0> onCloseAction) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onCloseAction), null, null, null, null, 30, null), null, null, null, null, 61, null);
    }

    private final Label i(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(j0.B) : this.labelProvider.c(j0.f120780r);
        }
        if (!(cVar instanceof cy.c.Progress)) {
            if ((cVar instanceof cy.c.Started) || (cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Finished)) {
                return this.labelProvider.c(j0.P);
            }
            throw new oq.p();
        }
        return this.labelProvider.c(j0.P).o(mx.b.b('\n' + ((cy.c.Progress) cVar).getProgress() + " %", "progress"));
    }

    private final Label l(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(j0.C) : this.labelProvider.c(j0.f120735i);
        }
        if ((cVar instanceof cy.c.Started) || (cVar instanceof cy.c.Info)) {
            return this.labelProvider.c(j0.Q);
        }
        if ((cVar instanceof cy.c.Finished) || (cVar instanceof cy.c.Progress)) {
            return this.labelProvider.c(j0.L0);
        }
        throw new oq.p();
    }

    private final Label m(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(j0.B) : this.labelProvider.c(j0.f120780r);
        }
        if (!(cVar instanceof cy.c.Progress)) {
            if ((cVar instanceof cy.c.Started) || (cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Finished)) {
                return this.labelProvider.c(j0.P);
            }
            throw new oq.p();
        }
        return this.labelProvider.c(j0.P).o(mx.b.b('\n' + ((cy.c.Progress) cVar).getProgress() + " %", "progress"));
    }

    private final Label q(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(j0.C) : this.labelProvider.c(j0.f120735i);
        }
        if ((cVar instanceof cy.c.Started) || (cVar instanceof cy.c.Info)) {
            return this.labelProvider.c(j0.Q);
        }
        if ((cVar instanceof cy.c.Finished) || (cVar instanceof cy.c.Progress)) {
            return this.labelProvider.c(j0.f120774p3);
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public nw1.c.a b(Params params) {
        int i15;
        nw1.b state = params.getState();
        if ((state instanceof nw1.b.Initial) || (state instanceof nw1.b.a.CheckNfc)) {
            return new nw1.c.a.NfcInfo(e(this, params, null, null, 3, null));
        }
        if (state instanceof nw1.b.a.ReadCert) {
            cy.c lastReadingData = ((nw1.b.a.ReadCert) state).getLastReadingData();
            return ((lastReadingData instanceof cy.c.Started) || lastReadingData == null) ? new nw1.c.a.NfcInfo(e(this, params, null, null, 3, null)) : new nw1.c.a.NfcScanning(c(params, l(lastReadingData), i(lastReadingData)));
        }
        if (state instanceof nw1.b.a.CompareCertData) {
            return new nw1.c.a.NfcScanning(c(params, this.labelProvider.c(j0.f120779q3), this.labelProvider.c(j0.Y0)));
        }
        if (state instanceof nw1.b.a.ChangePin) {
            cy.c lastReadingData2 = ((nw1.b.a.ChangePin) state).getLastReadingData();
            return ((lastReadingData2 instanceof cy.c.Started) || lastReadingData2 == null) ? new nw1.c.a.NfcInfo(e(this, params, null, null, 3, null)) : new nw1.c.a.NfcScanning(c(params, q(lastReadingData2), m(lastReadingData2)));
        }
        if (!(state instanceof nw1.b.a.Successful)) {
            if (state instanceof nw1.b.a.Error) {
                return new nw1.c.a.Error(((nw1.b.a.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldDataF = f(params.c());
        q40.j.b.c cVar = q40.j.b.c.f164688d;
        mx.c cVar2 = this.labelProvider;
        int i16 = b.f150332a[((nw1.b.a.Successful) state).getFormData().getCertificateType().ordinal()];
        if (i16 == 1) {
            i15 = j0.K2;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            i15 = j0.M2;
        }
        return new nw1.c.a.ChangePinSuccessful(baseScaffoldDataF, new IconPageData(cVar, cVar2.c(i15), null, null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j0.f120725g), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), null, null, 6, null), true, 12, null), params.c());
    }
}

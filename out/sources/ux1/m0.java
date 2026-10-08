package ux1;

import cx1.NfcScreenModel;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lux1/m0;", "Lxw/f;", "Lux1/m0$a;", "Lsx1/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", "title", "description", "Lcx1/a;", "f", "(Lux1/m0$a;Lmx/a;Lmx/a;)Lcx1/a;", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "Li50/a;", "l", "(Ler/a;)Li50/a;", "Lcy/c;", "s", "(Lcy/c;)Lmx/a;", "r", "v", "u", "params", "m", "(Lux1/m0$a;)Lsx1/e$a;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 implements xw.f<Params, sx1.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ux1.m0$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lux1/m0$a;", "", "Lsx1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onInterruptProcess", "onBack", "onClose", "onOpen", "onShare", "<init>", "(Lsx1/d;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsx1/d;", "f", "()Lsx1/d;", "b", "Ler/a;", "c", "()Ler/a;", "d", "e", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sx1.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onInterruptProcess;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onClose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onOpen;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onShare;

        public Params(sx1.d dVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3, er.a<oq.i0> aVar4, er.a<oq.i0> aVar5) {
            this.state = dVar;
            this.onInterruptProcess = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
            this.onOpen = aVar4;
            this.onShare = aVar5;
        }

        public final er.a<oq.i0> a() {
            return this.onBack;
        }

        public final er.a<oq.i0> b() {
            return this.onClose;
        }

        public final er.a<oq.i0> c() {
            return this.onInterruptProcess;
        }

        public final er.a<oq.i0> d() {
            return this.onOpen;
        }

        public final er.a<oq.i0> e() {
            return this.onShare;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onInterruptProcess, params.onInterruptProcess) && fr.t.c(this.onBack, params.onBack) && fr.t.c(this.onClose, params.onClose) && fr.t.c(this.onOpen, params.onOpen) && fr.t.c(this.onShare, params.onShare);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final sx1.d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onInterruptProcess.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onOpen.hashCode()) * 31) + this.onShare.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onInterruptProcess=" + this.onInterruptProcess + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onOpen=" + this.onOpen + ", onShare=" + this.onShare + ')';
        }
    }

    public m0(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final NfcScreenModel f(final Params params, Label label, Label label2) {
        return new NfcScreenModel(l(new er.a() { // from class: ux1.k0
            @Override // er.a
            public final Object a() {
                return m0.i(params);
            }
        }), label, label2, null, params.a(), params.getState().getFormData().getAreAnimationsEnabled(), 8, null);
    }

    static /* synthetic */ NfcScreenModel h(m0 m0Var, Params params, Label label, Label label2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = m0Var.labelProvider.c(lw1.j0.N0);
        }
        return m0Var.f(params, label, label2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(Params params) {
        params.c().a();
        return oq.i0.f148189a;
    }

    private final BaseScaffoldData l(er.a<oq.i0> onCloseAction) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onCloseAction), null, null, null, null, 30, null), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(Params params) {
        params.b().a();
        return oq.i0.f148189a;
    }

    private final Label r(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(lw1.j0.B) : this.labelProvider.c(lw1.j0.f120780r);
        }
        if (!(cVar instanceof cy.c.Progress)) {
            if (cVar instanceof cy.c.Info) {
                return this.labelProvider.c(lw1.j0.P);
            }
            if ((cVar instanceof cy.c.Finished) || (cVar instanceof cy.c.Started)) {
                return Label.INSTANCE.c();
            }
            throw new oq.p();
        }
        StringBuilder sb5 = new StringBuilder();
        cy.c.Progress progress = (cy.c.Progress) cVar;
        sb5.append(progress.getProgress());
        sb5.append(" %");
        return mx.b.b(sb5.toString(), "progress_" + progress.getProgress());
    }

    private final Label s(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(lw1.j0.C) : this.labelProvider.c(lw1.j0.f120735i);
        }
        if (cVar instanceof cy.c.Info) {
            return this.labelProvider.c(lw1.j0.Q);
        }
        if ((cVar instanceof cy.c.Finished) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
            return this.labelProvider.c(lw1.j0.L0);
        }
        throw new oq.p();
    }

    private final Label u(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(lw1.j0.B) : this.labelProvider.c(lw1.j0.f120780r);
        }
        if ((cVar instanceof cy.c.Finished) || (cVar instanceof cy.c.Info)) {
            return Label.INSTANCE.c();
        }
        if (!(cVar instanceof cy.c.Progress)) {
            if (cVar instanceof cy.c.Started) {
                return this.labelProvider.c(lw1.j0.B);
            }
            throw new oq.p();
        }
        StringBuilder sb5 = new StringBuilder();
        cy.c.Progress progress = (cy.c.Progress) cVar;
        sb5.append(progress.getProgress());
        sb5.append(" %");
        return mx.b.b(sb5.toString(), "progress_" + progress.getProgress());
    }

    private final Label v(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(lw1.j0.C) : this.labelProvider.c(lw1.j0.f120735i);
        }
        if ((cVar instanceof cy.c.Finished) || (cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
            return this.labelProvider.c(lw1.j0.N0);
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public sx1.e.a b(final Params params) {
        sx1.d state = params.getState();
        if ((state instanceof sx1.d.CheckNfc) || (state instanceof sx1.d.PreSetup)) {
            return new sx1.e.a.NfcInfo(f(params, this.labelProvider.c(lw1.j0.f120797v0), this.labelProvider.c(lw1.j0.f120793u0)));
        }
        if (state instanceof sx1.d.ReadCert) {
            cy.c lastReadingData = ((sx1.d.ReadCert) state).getLastReadingData();
            return ((lastReadingData instanceof cy.c.Started) || lastReadingData == null) ? new sx1.e.a.NfcInfo(f(params, this.labelProvider.c(lw1.j0.f120797v0), this.labelProvider.c(lw1.j0.f120793u0))) : new sx1.e.a.NfcScanning(f(params, s(lastReadingData), r(lastReadingData)));
        }
        if (state instanceof sx1.d.SignWithIdCard) {
            cy.c lastReadingData2 = ((sx1.d.SignWithIdCard) state).getLastReadingData();
            return lastReadingData2 == null ? new sx1.e.a.NfcScanning(h(this, params, null, Label.INSTANCE.c(), 1, null)) : new sx1.e.a.NfcScanning(f(params, v(lastReadingData2), u(lastReadingData2)));
        }
        if (state instanceof sx1.d.PrepareSign) {
            return new sx1.e.a.NfcScanning(h(this, params, null, this.labelProvider.c(lw1.j0.F0), 1, null));
        }
        if (state instanceof sx1.d.FinishSigning) {
            return new sx1.e.a.NfcScanning(h(this, params, null, this.labelProvider.c(lw1.j0.f120789t0), 1, null));
        }
        if (state instanceof sx1.d.SignSuccess) {
            return new sx1.e.a.SuccessData(l(new er.a() { // from class: ux1.l0
                @Override // er.a
                public final Object a() {
                    return m0.q(params);
                }
            }), new IconPageData(q40.j.b.c.f164688d, this.labelProvider.c(lw1.j0.R0), this.labelProvider.c(lw1.j0.O0), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(lw1.j0.P0), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(lw1.j0.Q0), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.e(), 35, null), null, 4, null), true, 8, null), params.b());
        }
        if (state instanceof sx1.d.SavingFile) {
            return new sx1.e.a.NfcScanning(h(this, params, null, this.labelProvider.c(lw1.j0.M0), 1, null));
        }
        if (state instanceof sx1.d.MissingStoragePermission) {
            return new sx1.e.a.NfcScanning(h(this, params, null, Label.INSTANCE.c(), 1, null));
        }
        if (!(state instanceof sx1.d.VerifyCert) && !(state instanceof sx1.d.CompareCertData)) {
            if (state instanceof sx1.d.SaveUserActivity) {
                return new sx1.e.a.NfcScanning(h(this, params, null, Label.INSTANCE.c(), 1, null));
            }
            if (state instanceof sx1.d.Error) {
                return new sx1.e.a.Error(((sx1.d.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        return new sx1.e.a.NfcScanning(h(this, params, null, this.labelProvider.c(lw1.j0.Y0), 1, null));
    }
}

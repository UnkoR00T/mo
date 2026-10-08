package hy1;

import cx1.NfcScreenModel;
import fr.t;
import gy1.d;
import i50.BaseScaffoldData;
import lw1.j0;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lhy1/a;", "Lxw/f;", "Lhy1/a$a;", "Lgy1/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", "title", "description", "Lcx1/a;", "c", "(Lhy1/a$a;Lmx/a;Lmx/a;)Lcx1/a;", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "Li50/a;", "f", "(Lmx/a;Ler/a;)Li50/a;", "Lcy/c;", "m", "(Lcy/c;)Lmx/a;", "l", "params", "i", "(Lhy1/a$a;)Lgy1/d$a;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: hy1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhy1/a$a;", "", "Lgy1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "onBackAction", "<init>", "(Lgy1/c;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgy1/c;", "c", "()Lgy1/c;", "b", "Ler/a;", "()Ler/a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final gy1.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(gy1.c cVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = cVar;
            this.onCloseAction = aVar;
            this.onBackAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final gy1.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseAction=" + this.onCloseAction + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final NfcScreenModel c(Params params, Label label, Label label2) {
        return new NfcScreenModel(h(this, null, params.b(), 1, null), label, label2, null, params.a(), params.getState().getAreAnimationsEnabled(), 8, null);
    }

    static /* synthetic */ NfcScreenModel e(a aVar, Params params, Label label, Label label2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = aVar.labelProvider.c(j0.f120797v0);
        }
        if ((i15 & 2) != 0) {
            label2 = aVar.labelProvider.c(j0.f120793u0);
        }
        return aVar.c(params, label, label2);
    }

    private final BaseScaffoldData f(Label title, er.a<i0> onCloseAction) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onCloseAction), title, null, null, null, 28, null), null, null, null, null, 61, null);
    }

    static /* synthetic */ BaseScaffoldData h(a aVar, Label label, er.a aVar2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = Label.INSTANCE.c();
        }
        return aVar.f(label, aVar2);
    }

    private final Label l(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(j0.B) : this.labelProvider.c(j0.f120780r);
        }
        if ((cVar instanceof cy.c.Started) || (cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Finished)) {
            return this.labelProvider.c(j0.P);
        }
        throw new p();
    }

    private final Label m(cy.c cVar) {
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
    public d.a b(Params params) {
        gy1.c state = params.getState();
        if ((state instanceof gy1.c.Init) || (state instanceof gy1.c.b.CheckNfc) || (state instanceof gy1.c.b.Success)) {
            return new d.a.NfcInfo(e(this, params, null, null, 3, null));
        }
        if ((state instanceof gy1.c.b.ReadAuthenticationCert) || (state instanceof gy1.c.b.ReadAuthorizationCert) || (state instanceof gy1.c.b.ReadPresenceCert)) {
            cy.c lastReadingData = ((gy1.c.InterfaceC1782c) state).getLastReadingData();
            return ((lastReadingData instanceof cy.c.Started) || lastReadingData == null) ? new d.a.NfcInfo(e(this, params, null, null, 3, null)) : new d.a.NfcScanning(c(params, m(lastReadingData), l(lastReadingData)));
        }
        if (state instanceof gy1.c.b.Error) {
            return new d.a.Error(((gy1.c.b.Error) state).getErrorVMS());
        }
        throw new p();
    }
}

package fy1;

import ey1.State;
import ey1.e;
import fr.t;
import i50.BaseScaffoldData;
import lw1.j0;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.b;
import n50.w0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import r50.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lfy1/a;", "Lxw/f;", "Lfy1/a$a;", "Ley1/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lgy1/a;", "certStatus", "Lr50/a$b;", "c", "(Lgy1/a;)Lr50/a$b;", "", "attemptCounter", "", "f", "(I)Z", "params", "e", "(Lfy1/a$a;)Ley1/e$a;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: fy1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lfy1/a$a;", "", "Ley1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "goToInfoPage", "<init>", "(Ley1/d;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ley1/d;", "c", "()Ley1/d;", "b", "Ler/a;", "()Ler/a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToInfoPage;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onBackAction = aVar;
            this.goToInfoPage = aVar2;
        }

        public final er.a<i0> a() {
            return this.goToInfoPage;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.goToInfoPage, params.goToInfoPage);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.goToInfoPage.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", goToInfoPage=" + this.goToInfoPage + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final r50.a.WithIcon c(gy1.a certStatus) {
        if (!(certStatus instanceof gy1.a.CertificateData)) {
            if (certStatus instanceof gy1.a.Error) {
                return new r50.a.WithIcon(null, this.labelProvider.c(j0.f120698a2), null, 0, false, g.NEGATIVE, 29, null);
            }
            if (!t.c(certStatus, gy1.a.c.f78260a)) {
                throw new p();
            }
            return new r50.a.WithIcon(null, this.labelProvider.c(j0.Z1), null, 0, false, g.MINUS, 29, null);
        }
        gy1.a.CertificateData certificateData = (gy1.a.CertificateData) certStatus;
        if (certificateData.getCertificateIsActivated() && f(certificateData.getCertificatePinCounter())) {
            return new r50.a.WithIcon(null, this.labelProvider.c(j0.W1), null, 0, false, g.POSITIVE, 29, null);
        }
        if (certificateData.getCertificateIsActivated() && !f(certificateData.getCertificatePinCounter())) {
            return new r50.a.WithIcon(null, this.labelProvider.c(j0.X1), null, 0, false, g.NEGATIVE, 29, null);
        }
        if (certificateData.getCertificateIsActivated()) {
            return new r50.a.WithIcon(null, this.labelProvider.c(j0.Z1), null, 0, false, g.MINUS, 29, null);
        }
        return new r50.a.WithIcon(null, this.labelProvider.c(j0.Y1), null, 0, false, g.MINUS, 29, null);
    }

    private final boolean f(int attemptCounter) {
        return 1 <= attemptCounter && attemptCounter < 4;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        r50.a.WithIcon withIconC;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(j0.f120703b2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, null, null, params.a(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        gy1.a presenceCert = params.getState().getELayerData().getPresenceCert();
        if (presenceCert instanceof gy1.a.CertificateData) {
            withIconC = new r50.a.WithIcon(null, this.labelProvider.c(j0.W1), null, 0, false, g.POSITIVE, 29, null);
        } else {
            withIconC = c(presenceCert);
        }
        return new e.Data(baseScaffoldData, new DefaultSingleCardData(null, null, false, null, null, false, null, new w0.StatusBadge(withIconC), new BodySection(null, new b.Title(new SingleCardLabel(this.labelProvider.c(j0.V1), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(j0.U1), null, null, 0, 0, null, 62, null), 1, null), null, null, null, 3711, null), new DefaultSingleCardData(null, null, false, null, null, false, null, new w0.StatusBadge(c(params.getState().getELayerData().getAuthenticationCert())), new BodySection(null, new b.Title(new SingleCardLabel(this.labelProvider.c(j0.R1), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(j0.Q1), null, null, 0, 0, null, 62, null), 1, null), null, null, null, 3711, null), new DefaultSingleCardData(null, null, false, null, null, false, null, new w0.StatusBadge(c(params.getState().getELayerData().getAuthorizationCert())), new BodySection(null, new b.Title(new SingleCardLabel(this.labelProvider.c(j0.T1), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(j0.S1), null, null, 0, 0, null, 62, null), 1, null), null, null, null, 3711, null), params.b());
    }
}

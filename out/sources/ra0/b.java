package ra0;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import i70.n;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import oq.r;
import p071kotlin.Metadata;
import pb4.e;
import qa0.State;
import qa0.c;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lra0/b;", "Lxw/f;", "Lra0/b$a;", "Lqa0/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "l", "(Lra0/b$a;)Lqa0/c$a;", "Lpb4/e;", "biometricStatus", "Lp50/a;", "h", "(Lpb4/e;)Lp50/a;", "Lkotlin/Function0;", "Loq/i0;", "onClose", "onDeactivateBiometrics", "Lcb4/d;", "i", "(Ler/a;Ler/a;)Lcb4/d;", "onActivateSystemBiometrics", "e", "Ldx/b;", "domainError", "f", "(Ldx/b;Ler/a;)Lcb4/d;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ra0.b$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u0018\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b \u0010#¨\u0006$"}, d2 = {"Lra0/b$a;", "", "Lqa0/b;", "state", "Li70/n;", "snackBarManagerStateHolder", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "activateBiometricsAction", "deactivateBiometricsAction", "hideSnackBarAction", "<init>", "(Lqa0/b;Li70/n;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqa0/b;", "f", "()Lqa0/b;", "b", "Li70/n;", "e", "()Li70/n;", "c", "Ler/a;", "d", "()Ler/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final n snackBarManagerStateHolder;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> activateBiometricsAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deactivateBiometricsAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideSnackBarAction;

        public Params(State state, n nVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.snackBarManagerStateHolder = nVar;
            this.onBackAction = aVar;
            this.activateBiometricsAction = aVar2;
            this.deactivateBiometricsAction = aVar3;
            this.hideSnackBarAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.activateBiometricsAction;
        }

        public final er.a<i0> b() {
            return this.deactivateBiometricsAction;
        }

        public final er.a<i0> c() {
            return this.hideSnackBarAction;
        }

        public final er.a<i0> d() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final n getSnackBarManagerStateHolder() {
            return this.snackBarManagerStateHolder;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.snackBarManagerStateHolder, params.snackBarManagerStateHolder) && t.c(this.onBackAction, params.onBackAction) && t.c(this.activateBiometricsAction, params.activateBiometricsAction) && t.c(this.deactivateBiometricsAction, params.deactivateBiometricsAction) && t.c(this.hideSnackBarAction, params.hideSnackBarAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.snackBarManagerStateHolder.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.activateBiometricsAction.hashCode()) * 31) + this.deactivateBiometricsAction.hashCode()) * 31) + this.hideSnackBarAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", snackBarManagerStateHolder=" + this.snackBarManagerStateHolder + ", onBackAction=" + this.onBackAction + ", activateBiometricsAction=" + this.activateBiometricsAction + ", deactivateBiometricsAction=" + this.deactivateBiometricsAction + ", hideSnackBarAction=" + this.hideSnackBarAction + ')';
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, boolean z15) {
        (z15 ? params.a() : params.b()).a();
        return i0.f148189a;
    }

    public final DialogData e(er.a<i0> onClose, er.a<i0> onActivateSystemBiometrics) {
        return new DialogData(h.b.f24985a, this.labelProvider.c(ia0.a.P), this.labelProvider.c(ia0.a.O), new DialogButtonTextData(this.labelProvider.c(ia0.a.f90618f), null, onClose, 2, null), new DialogButtonTextData(this.labelProvider.c(ia0.a.f90622h), null, onActivateSystemBiometrics, 2, null), null, null, 96, null);
    }

    public final DialogData f(dx.b domainError, er.a<i0> onClose) {
        r rVar;
        if (domainError instanceof dx.b.InterfaceC1027b.a.c) {
            rVar = new r(this.labelProvider.c(ia0.a.V), this.labelProvider.c(ia0.a.U));
        } else if (domainError instanceof dx.b.j.c) {
            rVar = new r(this.labelProvider.c(ia0.a.Y), this.labelProvider.c(ia0.a.X));
        } else {
            rVar = t.c(domainError, dx.c.f45092a) ? new r(this.labelProvider.c(ia0.a.T), this.labelProvider.c(ia0.a.W)) : new r(this.labelProvider.c(ia0.a.T), this.labelProvider.c(ia0.a.W));
        }
        return new DialogData(h.b.f24985a, (Label) rVar.a(), (Label) rVar.b(), new DialogButtonTextData(this.labelProvider.c(ia0.a.f90618f), null, onClose, 2, null), null, null, null, 112, null);
    }

    public final p50.a h(e biometricStatus) {
        Label labelC;
        if (t.c(biometricStatus, e.b.f154093a)) {
            labelC = this.labelProvider.c(ia0.a.R);
        } else {
            if (!(biometricStatus instanceof e.a)) {
                throw new p();
            }
            labelC = this.labelProvider.c(ia0.a.Q);
        }
        return new p50.a.Default(labelC, false, null, 6, null);
    }

    public final DialogData i(er.a<i0> onClose, er.a<i0> onDeactivateBiometrics) {
        Label labelC = this.labelProvider.c(ia0.a.S);
        DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(this.labelProvider.c(ia0.a.f90612c), null, onClose, 2, null);
        return new DialogData(h.b.f24985a, labelC, null, new DialogButtonTextData(this.labelProvider.c(ia0.a.f90632m), null, onDeactivateBiometrics, 2, null), dialogButtonTextData, null, null, 100, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c.Data b(final Params params) {
        Label labelC;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(ia0.a.Z), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarD = params.d();
        n snackBarManagerStateHolder = params.getSnackBarManagerStateHolder();
        er.a<i0> aVarC = params.c();
        cb4.i dialogVMSAdapter = params.getState().getDialogVMSAdapter();
        n50.b.Title title = new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ia0.a.Z), null, null, 0, 0, null, 62, null));
        e biometricStatus = params.getState().getBiometricStatus();
        e.b bVar = e.b.f154093a;
        if (t.c(biometricStatus, bVar)) {
            labelC = this.labelProvider.c(ia0.a.f90609a0);
        } else {
            if (!(biometricStatus instanceof e.a)) {
                throw new p();
            }
            labelC = this.labelProvider.c(ia0.a.f90611b0);
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("biometricCard", null, false, null, null, false, null, null, new BodySection(null, title, new SingleCardLabel(labelC, null, null, 0, 0, null, 62, null), 1, null), null, new x0.Switch(new s50.a.C4550a(null, t.c(params.getState().getBiometricStatus(), bVar), false, new l() { // from class: ra0.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.m(params, ((Boolean) obj).booleanValue());
            }
        }, null, null, null, false, 245, null)), null, 2814, null);
        if ((params.getState().getBiometricStatus() instanceof e.a.System) && (((e.a.System) params.getState().getBiometricStatus()).getDomainError() instanceof dx.b.InterfaceC1027b.a.C1029b)) {
            defaultSingleCardData = null;
        }
        return new c.Data(baseScaffoldData, aVarD, defaultSingleCardData, dialogVMSAdapter, snackBarManagerStateHolder, aVarC);
    }
}

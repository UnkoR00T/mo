package gh2;

import d70.QrScannerBottomSheetData;
import e70.CameraPermissionNotGrantedData;
import er.l;
import f70.QrScannerData;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i20.ScannerViewData;
import i50.BaseScaffoldData;
import l3.o;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p079n1.k3;
import p079n1.l3;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0097\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgh2/f;", "Lxw/f;", "Lgh2/f$a;", "Lfh2/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lg30/v;", "x", "(Z)Lg30/v;", "v", "(Lg30/v;)Z", "params", "l", "(Lgh2/f$a;)Lfh2/e$a;", "a", "Lmx/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, fh2.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gh2.f$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b!\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b%\u0010 R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u0019\u0010 R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001d\u0010 ¨\u0006&"}, d2 = {"Lgh2/f$a;", "", "Lfh2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onEnterCodeClicked", "Lkotlin/Function1;", "", "showCodeBottomSheet", "", "onCodeChange", "onConfirmCode", "goToLocationSettings", "onBackAction", "<init>", "(Lfh2/d;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfh2/d;", "g", "()Lfh2/d;", "b", "Ler/a;", "e", "()Ler/a;", "c", "Ler/l;", "f", "()Ler/l;", "d", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final fh2.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEnterCodeClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> showCodeBottomSheet;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onCodeChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirmCode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToLocationSettings;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(fh2.d dVar, er.a<i0> aVar, l<? super Boolean, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = dVar;
            this.onEnterCodeClicked = aVar;
            this.showCodeBottomSheet = lVar;
            this.onCodeChange = lVar2;
            this.onConfirmCode = aVar2;
            this.goToLocationSettings = aVar3;
            this.onBackAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.goToLocationSettings;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final l<String, i0> c() {
            return this.onCodeChange;
        }

        public final er.a<i0> d() {
            return this.onConfirmCode;
        }

        public final er.a<i0> e() {
            return this.onEnterCodeClicked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onEnterCodeClicked, params.onEnterCodeClicked) && t.c(this.showCodeBottomSheet, params.showCodeBottomSheet) && t.c(this.onCodeChange, params.onCodeChange) && t.c(this.onConfirmCode, params.onConfirmCode) && t.c(this.goToLocationSettings, params.goToLocationSettings) && t.c(this.onBackAction, params.onBackAction);
        }

        public final l<Boolean, i0> f() {
            return this.showCodeBottomSheet;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final fh2.d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onEnterCodeClicked.hashCode()) * 31) + this.showCodeBottomSheet.hashCode()) * 31) + this.onCodeChange.hashCode()) * 31) + this.onConfirmCode.hashCode()) * 31) + this.goToLocationSettings.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onEnterCodeClicked=" + this.onEnterCodeClicked + ", showCodeBottomSheet=" + this.showCodeBottomSheet + ", onCodeChange=" + this.onCodeChange + ", onConfirmCode=" + this.onConfirmCode + ", goToLocationSettings=" + this.goToLocationSettings + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73021a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f73021a = iArr;
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, f fVar, v vVar) {
        params.f().b(Boolean.valueOf(fVar.v(vVar)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.f().b(Boolean.FALSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 r(final Params params, final o oVar) {
        return new l3(new l() { // from class: gh2.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.s(oVar, params, (k3) obj);
            }
        }, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(o oVar, Params params, k3 k3Var) {
        o.g(oVar, false, 1, null);
        params.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, d60.c cVar) {
        cVar.g();
        params.d().a();
        return i0.f148189a;
    }

    private final boolean v(v vVar) {
        int i15 = b.f73021a[vVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return true;
        }
        if (i15 == 3) {
            return false;
        }
        throw new p();
    }

    private final v x(boolean z15) {
        if (z15) {
            return v.EXPANDED;
        }
        if (z15) {
            throw new p();
        }
        return v.HIDDEN;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public fh2.e.a b(final Params params) {
        ScannerViewData.a aVar;
        fh2.d state = params.getState();
        if (state instanceof fh2.d.Error) {
            return new fh2.e.a.Error(((fh2.d.Error) state).getAdapter());
        }
        if (!(state instanceof fh2.d.a)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(xf2.a.f218397s).n("LandRegistryScannerQrCodeTitle"), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(xf2.a.f218396r1);
        fh2.d.a aVar2 = (fh2.d.a) state;
        boolean showCodeBottomSheetDialog = aVar2.getData().getShowCodeBottomSheetDialog();
        fh2.d.a.Scanner scanner = state instanceof fh2.d.a.Scanner ? (fh2.d.a.Scanner) state : null;
        boolean z15 = false;
        fh2.e.a.BottomSheetDialog bottomSheetDialog = new fh2.e.a.BottomSheetDialog(showCodeBottomSheetDialog, scanner != null ? scanner.c() : false);
        ScannerViewData.b bVar = ScannerViewData.b.FILL_CENTER;
        u04.c cameraPermission = aVar2.getData().getCameraPermission();
        u04.c.a aVar3 = u04.c.a.f194071a;
        boolean zC = t.c(cameraPermission, aVar3);
        if (zC) {
            aVar = ScannerViewData.a.SQUARE;
        } else {
            if (zC) {
                throw new p();
            }
            aVar = ScannerViewData.a.NONE;
        }
        QrScannerData qrScannerData = new QrScannerData(null, new ScannerViewData(bVar, aVar), 1, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(xf2.a.T1), null, 2, null), new k30.d.Secondary(null, 1, null), aVar2.getData().getShowCodeBottomSheetDialog() ? k30.b.C2562b.f107767a : k30.b.c.f107768a, params.e(), 3, null);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(x(((fh2.d.a) params.getState()).getData().getShowCodeBottomSheetDialog()), true, new l() { // from class: gh2.a
            @Override // er.l
            public final Object b(Object obj) {
                return f.m(params, this, (v) obj);
            }
        }), this.labelProvider.c(xf2.a.f218399s1), new er.a() { // from class: gh2.b
            @Override // er.a
            public final Object a() {
                return f.q(params);
            }
        }, null, 8, null);
        QrScannerBottomSheetData qrScannerBottomSheetData = new QrScannerBottomSheetData(aVar2.getData().getShowCodeBottomSheetDialog(), this.labelProvider.c(xf2.a.U1), mx.b.b(aVar2.getData().getCode(), "code"), hz.b.d.f86848c, new v50.c.Text(null, Label.INSTANCE.c(), null, mx.b.b(aVar2.getData().getCode(), "codeValue"), aVar2.getData().getCodeValidationState(), null, null, params.c(), null, false, 0, new l() { // from class: gh2.c
            @Override // er.l
            public final Object b(Object obj) {
                return f.r(params, (o) obj);
            }
        }, false, null, true, null, this.labelProvider.c(xf2.a.S1), null, null, null, 964453, null), this.labelProvider.c(xf2.a.f218388p), true);
        l<Boolean, i0> lVarF = params.f();
        u04.c cameraPermission2 = aVar2.getData().getCameraPermission();
        if (t.c(cameraPermission2, aVar3)) {
            z15 = true;
        } else if (!(cameraPermission2 instanceof u04.c.b)) {
            throw new p();
        }
        return new fh2.e.a.ScannerQrCode(baseScaffoldData, labelC, qrScannerData, buttonData, bottomSheetDialog, lVarF, qrScannerBottomSheetData, modalBottomSheetData, new l() { // from class: gh2.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.u(params, (d60.c) obj);
            }
        }, z15, new CameraPermissionNotGrantedData(this.labelProvider.c(xf2.a.O1), this.labelProvider.c(xf2.a.N1), this.labelProvider.c(xf2.a.Q1), params.a()), aVar2.getData().getConnector());
    }
}

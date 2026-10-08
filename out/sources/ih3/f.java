package ih3;

import androidx.compose.ui.graphics.Color;
import d70.QrScannerBottomSheetData;
import e70.CameraPermissionNotGrantedData;
import er.l;
import er.p;
import f70.QrScannerData;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i20.ScannerViewData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import l3.o;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p079n1.k3;
import p079n1.l3;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0097\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lih3/f;", "Lxw/f;", "Lih3/f$a;", "Lgh3/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lg30/v;", "x", "(Z)Lg30/v;", "v", "(Lg30/v;)Z", "params", "l", "(Lih3/f$a;)Lgh3/e$a;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, gh3.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ih3.f$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b#\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b'\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b\u001b\u0010\"R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b)\u0010\"R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u001f\u0010\"R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b(\u0010\"¨\u0006*"}, d2 = {"Lih3/f$a;", "", "Lgh3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onEnterCodeClicked", "Lkotlin/Function1;", "", "showCodeBottomSheet", "", "onCodeChange", "onConfirmCode", "goToLocationSettings", "onLinkClicked", "onBackAction", "onExitAction", "<init>", "(Lgh3/c;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgh3/c;", "i", "()Lgh3/c;", "b", "Ler/a;", "e", "()Ler/a;", "c", "Ler/l;", "h", "()Ler/l;", "d", "f", "g", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final gh3.c state;

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
        private final er.a<i0> onLinkClicked;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(gh3.c cVar, er.a<i0> aVar, l<? super Boolean, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = cVar;
            this.onEnterCodeClicked = aVar;
            this.showCodeBottomSheet = lVar;
            this.onCodeChange = lVar2;
            this.onConfirmCode = aVar2;
            this.goToLocationSettings = aVar3;
            this.onLinkClicked = aVar4;
            this.onBackAction = aVar5;
            this.onExitAction = aVar6;
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
            return t.c(this.state, params.state) && t.c(this.onEnterCodeClicked, params.onEnterCodeClicked) && t.c(this.showCodeBottomSheet, params.showCodeBottomSheet) && t.c(this.onCodeChange, params.onCodeChange) && t.c(this.onConfirmCode, params.onConfirmCode) && t.c(this.goToLocationSettings, params.goToLocationSettings) && t.c(this.onLinkClicked, params.onLinkClicked) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onExitAction, params.onExitAction);
        }

        public final er.a<i0> f() {
            return this.onExitAction;
        }

        public final er.a<i0> g() {
            return this.onLinkClicked;
        }

        public final l<Boolean, i0> h() {
            return this.showCodeBottomSheet;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onEnterCodeClicked.hashCode()) * 31) + this.showCodeBottomSheet.hashCode()) * 31) + this.onCodeChange.hashCode()) * 31) + this.onConfirmCode.hashCode()) * 31) + this.goToLocationSettings.hashCode()) * 31) + this.onLinkClicked.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final gh3.c getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onEnterCodeClicked=" + this.onEnterCodeClicked + ", showCodeBottomSheet=" + this.showCodeBottomSheet + ", onCodeChange=" + this.onCodeChange + ", onConfirmCode=" + this.onConfirmCode + ", goToLocationSettings=" + this.goToLocationSettings + ", onLinkClicked=" + this.onLinkClicked + ", onBackAction=" + this.onBackAction + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92350a;

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
            f92350a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f92351a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1568965241);
            if (p076m2.t.k()) {
                p076m2.t.o(1568965241, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionscannerqr.mapper.VehicleCollisionScannerQrScreenMapper.invoke.<anonymous> (VehicleCollisionScannerQrScreenMapper.kt:68)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, f fVar, v vVar) {
        params.h().b(Boolean.valueOf(fVar.v(vVar)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.h().b(Boolean.FALSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 r(final Params params, final o oVar) {
        return new l3(new l() { // from class: ih3.a
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
        int i15 = b.f92350a[vVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return true;
        }
        if (i15 == 3) {
            return false;
        }
        throw new oq.p();
    }

    private final v x(boolean z15) {
        if (z15) {
            return v.EXPANDED;
        }
        if (z15) {
            throw new oq.p();
        }
        return v.HIDDEN;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public gh3.e.a b(final Params params) {
        ScannerViewData.a aVar;
        boolean z15;
        gh3.c state = params.getState();
        if (state instanceof gh3.c.Error) {
            return new gh3.e.a.Error(((gh3.c.Error) state).getAdapter());
        }
        if (!(state instanceof gh3.c.a)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(md3.b.f125847v3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, c.f92351a, null, params.f(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(md3.b.f125778m6);
        Label labelC2 = this.labelProvider.c(md3.b.f125802p6);
        ButtonTextData buttonTextData = new ButtonTextData(null, this.labelProvider.c(md3.b.f125770l6), null, null, params.g(), 13, null);
        gh3.c.a aVar2 = (gh3.c.a) state;
        boolean showCodeBottomSheetDialog = aVar2.getData().getShowCodeBottomSheetDialog();
        gh3.c.a.Scanner scanner = state instanceof gh3.c.a.Scanner ? (gh3.c.a.Scanner) state : null;
        gh3.e.a.BottomSheetDialog bottomSheetDialog = new gh3.e.a.BottomSheetDialog(showCodeBottomSheetDialog, scanner != null ? scanner.c() : false);
        ScannerViewData.b bVar = ScannerViewData.b.FILL_CENTER;
        u04.c cameraPermission = aVar2.getData().getCameraPermission();
        u04.c.a aVar3 = u04.c.a.f194071a;
        boolean zC = t.c(cameraPermission, aVar3);
        if (zC) {
            aVar = ScannerViewData.a.SQUARE;
        } else {
            if (zC) {
                throw new oq.p();
            }
            aVar = ScannerViewData.a.NONE;
        }
        QrScannerData qrScannerData = new QrScannerData(null, new ScannerViewData(bVar, aVar), 1, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.f125746i6), null, 2, null), k30.d.a.f107773a, aVar2.getData().getShowCodeBottomSheetDialog() ? k30.b.C2562b.f107767a : k30.b.c.f107768a, params.e(), 3, null);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(x(((gh3.c.a) params.getState()).getData().getShowCodeBottomSheetDialog()), true, new l() { // from class: ih3.b
            @Override // er.l
            public final Object b(Object obj) {
                return f.m(params, this, (v) obj);
            }
        }), this.labelProvider.c(md3.b.f125728g4), new er.a() { // from class: ih3.c
            @Override // er.a
            public final Object a() {
                return f.q(params);
            }
        }, null, 8, null);
        QrScannerBottomSheetData qrScannerBottomSheetData = new QrScannerBottomSheetData(aVar2.getData().getShowCodeBottomSheetDialog(), this.labelProvider.c(md3.b.f125720f4), mx.b.b(aVar2.getData().getCode(), "code"), hz.b.d.f86848c, new v50.c.Number(null, Label.INSTANCE.c(), null, mx.b.b(aVar2.getData().getCode(), "codeValue"), aVar2.getData().getCodeValidationState(), null, null, params.c(), null, false, 0, new l() { // from class: ih3.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.r(params, (o) obj);
            }
        }, false, null, true, null, this.labelProvider.c(md3.b.f125728g4), null, null, false, 964453, null), this.labelProvider.c(md3.b.K), true);
        l<Boolean, i0> lVarH = params.h();
        u04.c cameraPermission2 = aVar2.getData().getCameraPermission();
        if (t.c(cameraPermission2, aVar3)) {
            z15 = true;
        } else {
            if (!(cameraPermission2 instanceof u04.c.b)) {
                throw new oq.p();
            }
            z15 = false;
        }
        return new gh3.e.a.ScannerQrCode(baseScaffoldData, labelC, labelC2, buttonTextData, qrScannerData, buttonData, bottomSheetDialog, lVarH, qrScannerBottomSheetData, modalBottomSheetData, new l() { // from class: ih3.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.u(params, (d60.c) obj);
            }
        }, z15, new CameraPermissionNotGrantedData(this.labelProvider.c(md3.b.f125868y0), this.labelProvider.c(md3.b.f125860x0), this.labelProvider.c(md3.b.A0), params.a()), aVar2.getData().getConnector());
    }
}

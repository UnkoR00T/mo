package jz2;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljz2/g;", "Lxw/f;", "Ljz2/g$a;", "Liz2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lg30/v;", "u", "(Z)Lg30/v;", "s", "(Lg30/v;)Z", "params", "i", "(Ljz2/g$a;)Liz2/c$a;", "a", "Lmx/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, iz2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: jz2.g$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b!\u0010'R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b(\u0010'R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b,\u0010'¨\u0006/"}, d2 = {"Ljz2/g$a;", "", "Liz2/b;", "state", "Lsz/d;", "connector", "Lkotlin/Function0;", "Loq/i0;", "onEnterCodeClicked", "Lkotlin/Function1;", "", "showCodeBottomSheet", "", "onCodeChange", "onConfirmCode", "goToSettings", "onAlertClose", "onBackAction", "onCloseAction", "<init>", "(Liz2/b;Lsz/d;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liz2/b;", "j", "()Liz2/b;", "b", "Lsz/d;", "()Lsz/d;", "c", "Ler/a;", "h", "()Ler/a;", "d", "Ler/l;", "i", "()Ler/l;", "e", "f", "g", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iz2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final sz.d connector;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEnterCodeClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> showCodeBottomSheet;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onCodeChange;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirmCode;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToSettings;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAlertClose;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(iz2.b bVar, sz.d dVar, er.a<i0> aVar, l<? super Boolean, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = bVar;
            this.connector = dVar;
            this.onEnterCodeClicked = aVar;
            this.showCodeBottomSheet = lVar;
            this.onCodeChange = lVar2;
            this.onConfirmCode = aVar2;
            this.goToSettings = aVar3;
            this.onAlertClose = aVar4;
            this.onBackAction = aVar5;
            this.onCloseAction = aVar6;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final sz.d getConnector() {
            return this.connector;
        }

        public final er.a<i0> b() {
            return this.goToSettings;
        }

        public final er.a<i0> c() {
            return this.onAlertClose;
        }

        public final er.a<i0> d() {
            return this.onBackAction;
        }

        public final er.a<i0> e() {
            return this.onCloseAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.connector, params.connector) && t.c(this.onEnterCodeClicked, params.onEnterCodeClicked) && t.c(this.showCodeBottomSheet, params.showCodeBottomSheet) && t.c(this.onCodeChange, params.onCodeChange) && t.c(this.onConfirmCode, params.onConfirmCode) && t.c(this.goToSettings, params.goToSettings) && t.c(this.onAlertClose, params.onAlertClose) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public final l<String, i0> f() {
            return this.onCodeChange;
        }

        public final er.a<i0> g() {
            return this.onConfirmCode;
        }

        public final er.a<i0> h() {
            return this.onEnterCodeClicked;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.connector.hashCode()) * 31) + this.onEnterCodeClicked.hashCode()) * 31) + this.showCodeBottomSheet.hashCode()) * 31) + this.onCodeChange.hashCode()) * 31) + this.onConfirmCode.hashCode()) * 31) + this.goToSettings.hashCode()) * 31) + this.onAlertClose.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public final l<Boolean, i0> i() {
            return this.showCodeBottomSheet;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final iz2.b getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", connector=" + this.connector + ", onEnterCodeClicked=" + this.onEnterCodeClicked + ", showCodeBottomSheet=" + this.showCodeBottomSheet + ", onCodeChange=" + this.onCodeChange + ", onConfirmCode=" + this.onConfirmCode + ", goToSettings=" + this.goToSettings + ", onAlertClose=" + this.onAlertClose + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107009a;

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
            f107009a = iArr;
        }
    }

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, g gVar, v vVar) {
        params.i().b(Boolean.valueOf(gVar.s(vVar)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.i().b(Boolean.FALSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 q(final Params params, final o oVar) {
        return new l3(new l() { // from class: jz2.c
            @Override // er.l
            public final Object b(Object obj) {
                return g.r(oVar, params, (k3) obj);
            }
        }, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(o oVar, Params params, k3 k3Var) {
        o.g(oVar, false, 1, null);
        params.g().a();
        return i0.f148189a;
    }

    private final boolean s(v vVar) {
        int i15 = b.f107009a[vVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return true;
        }
        if (i15 == 3) {
            return false;
        }
        throw new p();
    }

    private final v u(boolean z15) {
        if (z15) {
            return v.EXPANDED;
        }
        if (z15) {
            throw new p();
        }
        return v.HIDDEN;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public iz2.c.a b(final Params params) {
        ScannerViewData.a aVar;
        iz2.b state = params.getState();
        if (!(state instanceof iz2.b.ScannerQrCode)) {
            if (state instanceof iz2.b.Error) {
                return new iz2.c.a.Error(((iz2.b.Error) state).getErrorVMS());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.e()), this.labelProvider.c(uy2.b.f202298j), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(uy2.b.f202302l);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(u(((iz2.b.ScannerQrCode) params.getState()).getData().getShowCodeBottomSheetDialog()), true, new l() { // from class: jz2.d
            @Override // er.l
            public final Object b(Object obj) {
                return g.l(params, this, (v) obj);
            }
        }), this.labelProvider.c(uy2.b.f202325w0), new er.a() { // from class: jz2.e
            @Override // er.a
            public final Object a() {
                return g.m(params);
            }
        }, null, 8, null);
        c30.b.e eVar = new c30.b.e(null, null, null, this.labelProvider.c(uy2.b.f202300k), params.c(), null, null, 103, null);
        iz2.b.ScannerQrCode scannerQrCode = (iz2.b.ScannerQrCode) state;
        if (!scannerQrCode.getData().getIsAlertVisible()) {
            eVar = null;
        }
        ScannerViewData.b bVar = ScannerViewData.b.FILL_CENTER;
        boolean isCameraPermissionGranted = scannerQrCode.getData().getIsCameraPermissionGranted();
        if (isCameraPermissionGranted) {
            aVar = ScannerViewData.a.SQUARE;
        } else {
            if (isCameraPermissionGranted) {
                throw new p();
            }
            aVar = ScannerViewData.a.NONE;
        }
        return new iz2.c.a.Scanner(baseScaffoldData, labelC, new QrScannerData(eVar, new ScannerViewData(bVar, aVar)), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(uy2.b.f202327x0), null, 2, null), new k30.d.Secondary(null, 1, null), scannerQrCode.getData().getShowCodeBottomSheetDialog() ? k30.b.C2562b.f107767a : k30.b.c.f107768a, params.h(), 3, null), modalBottomSheetData, params.i(), new QrScannerBottomSheetData(scannerQrCode.getData().getShowCodeBottomSheetDialog(), Label.INSTANCE.c(), mx.b.b(scannerQrCode.getData().getEnteredCode(), "code"), scannerQrCode.getData().getCodeValidationState(), new v50.c.Text(null, this.labelProvider.c(uy2.b.f202329y0), null, mx.b.b(scannerQrCode.getData().getEnteredCode(), "codeValue"), scannerQrCode.getData().getCodeValidationState(), null, null, params.f(), null, false, 0, new l() { // from class: jz2.f
            @Override // er.l
            public final Object b(Object obj) {
                return g.q(params, (o) obj);
            }
        }, false, null, true, null, null, null, null, null, 1029989, null), this.labelProvider.c(uy2.b.f202294h), false), params.g(), scannerQrCode.getData().getIsCameraPermissionGranted(), new CameraPermissionNotGrantedData(this.labelProvider.c(uy2.b.E), this.labelProvider.c(uy2.b.D), this.labelProvider.c(uy2.b.F), params.b()), params.getConnector(), params.d());
    }
}

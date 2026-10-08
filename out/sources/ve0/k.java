package ve0;

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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lve0/k;", "Lxw/f;", "Lve0/k$a;", "Lue0/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lg30/v;", "x", "(Z)Lg30/v;", "v", "(Lg30/v;)Z", "params", "l", "(Lve0/k$a;)Lue0/c$a;", "a", "Lmx/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements xw.f<Params, ue0.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ve0.k$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b+\u0010*R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b,\u0010&R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b \u0010&R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010&R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b#\u0010&¨\u0006-"}, d2 = {"Lve0/k$a;", "", "Lue0/b;", "state", "Lsz/d;", "connector", "Lkotlin/Function0;", "Loq/i0;", "onEnterCodeClicked", "Lkotlin/Function1;", "", "showCodeBottomSheet", "", "onCodeChange", "onConfirmCode", "goToSettings", "onBack", "onAlertClose", "<init>", "(Lue0/b;Lsz/d;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lue0/b;", "i", "()Lue0/b;", "b", "Lsz/d;", "()Lsz/d;", "c", "Ler/a;", "g", "()Ler/a;", "d", "Ler/l;", "h", "()Ler/l;", "e", "f", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ue0.b state;

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
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAlertClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ue0.b bVar, sz.d dVar, er.a<i0> aVar, l<? super Boolean, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = bVar;
            this.connector = dVar;
            this.onEnterCodeClicked = aVar;
            this.showCodeBottomSheet = lVar;
            this.onCodeChange = lVar2;
            this.onConfirmCode = aVar2;
            this.goToSettings = aVar3;
            this.onBack = aVar4;
            this.onAlertClose = aVar5;
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
            return this.onBack;
        }

        public final l<String, i0> e() {
            return this.onCodeChange;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.connector, params.connector) && t.c(this.onEnterCodeClicked, params.onEnterCodeClicked) && t.c(this.showCodeBottomSheet, params.showCodeBottomSheet) && t.c(this.onCodeChange, params.onCodeChange) && t.c(this.onConfirmCode, params.onConfirmCode) && t.c(this.goToSettings, params.goToSettings) && t.c(this.onBack, params.onBack) && t.c(this.onAlertClose, params.onAlertClose);
        }

        public final er.a<i0> f() {
            return this.onConfirmCode;
        }

        public final er.a<i0> g() {
            return this.onEnterCodeClicked;
        }

        public final l<Boolean, i0> h() {
            return this.showCodeBottomSheet;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.connector.hashCode()) * 31) + this.onEnterCodeClicked.hashCode()) * 31) + this.showCodeBottomSheet.hashCode()) * 31) + this.onCodeChange.hashCode()) * 31) + this.onConfirmCode.hashCode()) * 31) + this.goToSettings.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onAlertClose.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ue0.b getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", connector=" + this.connector + ", onEnterCodeClicked=" + this.onEnterCodeClicked + ", showCodeBottomSheet=" + this.showCodeBottomSheet + ", onCodeChange=" + this.onCodeChange + ", onConfirmCode=" + this.onConfirmCode + ", goToSettings=" + this.goToSettings + ", onBack=" + this.onBack + ", onAlertClose=" + this.onAlertClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f206324a;

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
            f206324a = iArr;
        }
    }

    public k(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, k kVar, v vVar) {
        params.h().b(Boolean.valueOf(kVar.v(vVar)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.h().b(Boolean.FALSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 r(final Params params, final o oVar) {
        return new l3(new l() { // from class: ve0.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.s(oVar, params, (k3) obj);
            }
        }, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(o oVar, Params params, k3 k3Var) {
        o.g(oVar, false, 1, null);
        params.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u() {
        return i0.f148189a;
    }

    private final boolean v(v vVar) {
        int i15 = b.f206324a[vVar.ordinal()];
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
    public ue0.c.a b(final Params params) {
        ScannerViewData.a aVar;
        ue0.b state = params.getState();
        if (!(state instanceof ue0.b.ScannerQrCode) && !(state instanceof ue0.b.GetVerificationCertificate) && !(state instanceof ue0.b.GetVerificationSessionByCode) && !(state instanceof ue0.b.FetchQrCodeData)) {
            if (state instanceof ue0.b.Error) {
                return new ue0.c.a.Error(((ue0.b.Error) state).getErrorVMS());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(oe0.a.f145037r), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(oe0.a.f145038s);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(x(params.getState().getData().getShowCodeBottomSheetDialog()), true, new l() { // from class: ve0.f
            @Override // er.l
            public final Object b(Object obj) {
                return k.m(params, this, (v) obj);
            }
        }), this.labelProvider.c(oe0.a.f145034o), new er.a() { // from class: ve0.g
            @Override // er.a
            public final Object a() {
                return k.q(params);
            }
        }, null, 8, null);
        boolean showCodeBottomSheetDialog = state.getData().getShowCodeBottomSheetDialog();
        c30.b.e eVar = new c30.b.e(null, null, null, this.labelProvider.c(oe0.a.f145027h), params.c(), null, null, 103, null);
        if (!state.getData().getIsAlertVisible()) {
            eVar = null;
        }
        ScannerViewData.b bVar = ScannerViewData.b.FILL_CENTER;
        boolean isCameraPermissionGranted = state.getData().getIsCameraPermissionGranted();
        if (isCameraPermissionGranted) {
            aVar = ScannerViewData.a.SQUARE;
        } else {
            if (isCameraPermissionGranted) {
                throw new p();
            }
            aVar = ScannerViewData.a.NONE;
        }
        return new ue0.c.a.Scanner(baseScaffoldData, labelC, modalBottomSheetData, new QrScannerData(eVar, new ScannerViewData(bVar, aVar)), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(oe0.a.f145036q), null, 2, null), k30.d.a.f107773a, state.getData().getShowCodeBottomSheetDialog() ? k30.b.C2562b.f107767a : k30.b.c.f107768a, params.g(), 3, null), showCodeBottomSheetDialog, params.h(), new QrScannerBottomSheetData(state.getData().getShowCodeBottomSheetDialog(), Label.INSTANCE.c(), mx.b.b(state.getData().getEnteredCode(), "code"), state.getData().getCodeValidationState(), new v50.c.Text(null, this.labelProvider.c(oe0.a.f145035p), null, mx.b.b(state.getData().getEnteredCode(), "codeValue"), state.getData().getCodeValidationState(), null, null, params.e(), null, false, 0, new l() { // from class: ve0.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.r(params, (o) obj);
            }
        }, false, null, true, null, null, null, null, null, 1029989, null), this.labelProvider.c(oe0.a.f145025f), false), params.f(), state.getData().getIsCameraPermissionGranted(), new CameraPermissionNotGrantedData(this.labelProvider.c(oe0.a.J), this.labelProvider.c(oe0.a.I), this.labelProvider.c(oe0.a.K), params.b()), params.getConnector(), new er.a() { // from class: ve0.i
            @Override // er.a
            public final Object a() {
                return k.u();
            }
        });
    }
}

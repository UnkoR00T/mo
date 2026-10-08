package y90;

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
import iy.b0;
import iy.c0;
import l3.o;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p079n1.k3;
import p079n1.l3;
import x40.LinkData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ly90/j;", "Lxw/f;", "Ly90/j$a;", "Lx90/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lg30/v;", "E", "(Z)Lg30/v;", "z", "(Lg30/v;)Z", "params", "m", "(Ly90/j$a;)Lx90/c$a;", "a", "Lmx/c;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, x90.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: y90.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b#\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b'\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b\u001b\u0010\"R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b(\u0010&R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001f\u0010\"¨\u0006)"}, d2 = {"Ly90/j$a;", "", "Lx90/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onEnterCodeClicked", "Lkotlin/Function1;", "", "showCodeBottomSheet", "Liy/b0;", "onCodeChange", "onConfirmCode", "goToSettings", "", "onLinkClicked", "onClose", "<init>", "(Lx90/b;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lx90/b;", "h", "()Lx90/b;", "b", "Ler/a;", "e", "()Ler/a;", "c", "Ler/l;", "g", "()Ler/l;", "d", "f", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final x90.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEnterCodeClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> showCodeBottomSheet;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onCodeChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirmCode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToSettings;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLinkClicked;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(x90.b bVar, er.a<i0> aVar, l<? super Boolean, i0> lVar, l<? super b0, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onEnterCodeClicked = aVar;
            this.showCodeBottomSheet = lVar;
            this.onCodeChange = lVar2;
            this.onConfirmCode = aVar2;
            this.goToSettings = aVar3;
            this.onLinkClicked = lVar3;
            this.onClose = aVar4;
        }

        public final er.a<i0> a() {
            return this.goToSettings;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final l<b0, i0> c() {
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
            return t.c(this.state, params.state) && t.c(this.onEnterCodeClicked, params.onEnterCodeClicked) && t.c(this.showCodeBottomSheet, params.showCodeBottomSheet) && t.c(this.onCodeChange, params.onCodeChange) && t.c(this.onConfirmCode, params.onConfirmCode) && t.c(this.goToSettings, params.goToSettings) && t.c(this.onLinkClicked, params.onLinkClicked) && t.c(this.onClose, params.onClose);
        }

        public final l<String, i0> f() {
            return this.onLinkClicked;
        }

        public final l<Boolean, i0> g() {
            return this.showCodeBottomSheet;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final x90.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onEnterCodeClicked.hashCode()) * 31) + this.showCodeBottomSheet.hashCode()) * 31) + this.onCodeChange.hashCode()) * 31) + this.onConfirmCode.hashCode()) * 31) + this.goToSettings.hashCode()) * 31) + this.onLinkClicked.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onEnterCodeClicked=" + this.onEnterCodeClicked + ", showCodeBottomSheet=" + this.showCodeBottomSheet + ", onCodeChange=" + this.onCodeChange + ", onConfirmCode=" + this.onConfirmCode + ", goToSettings=" + this.goToSettings + ", onLinkClicked=" + this.onLinkClicked + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f225600a;

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
            f225600a = iArr;
        }
    }

    public j(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final v E(boolean z15) {
        if (z15) {
            return v.EXPANDED;
        }
        if (z15) {
            throw new p();
        }
        return v.HIDDEN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, j jVar, v vVar) {
        params.g().b(Boolean.valueOf(jVar.z(vVar)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.g().b(Boolean.FALSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, String str) {
        params.c().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 u(final Params params, final o oVar) {
        return new l3(new l() { // from class: y90.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.v(oVar, params, (k3) obj);
            }
        }, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(o oVar, Params params, k3 k3Var) {
        o.g(oVar, false, 1, null);
        params.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x() {
        return i0.f148189a;
    }

    private final boolean z(v vVar) {
        int i15 = b.f225600a[vVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return true;
        }
        if (i15 == 3) {
            return false;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public x90.c.a b(final Params params) {
        ScannerViewData.a aVar;
        x90.b state = params.getState();
        if (!(state instanceof x90.b.ScannerQrCode)) {
            if (state instanceof x90.b.Error) {
                return new x90.c.a.Error(((x90.b.Error) state).getErrorVMS());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(r90.a.B), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(r90.a.f172444x);
        x90.b.ScannerQrCode scannerQrCode = (x90.b.ScannerQrCode) state;
        LinkData linkData = new LinkData(null, this.labelProvider.c(r90.a.A), scannerQrCode.getZpeUrl(), LinkData.EnumC5775a.WEBSITE, false, params.f(), 17, null);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(E(((x90.b.ScannerQrCode) params.getState()).getShowCodeBottomSheetDialog()), true, new l() { // from class: y90.d
            @Override // er.l
            public final Object b(Object obj) {
                return j.q(params, this, (v) obj);
            }
        }), this.labelProvider.c(r90.a.f172443w), new er.a() { // from class: y90.e
            @Override // er.a
            public final Object a() {
                return j.r(params);
            }
        }, null, 8, null);
        boolean showCodeBottomSheetDialog = scannerQrCode.getShowCodeBottomSheetDialog();
        ScannerViewData.b bVar = ScannerViewData.b.FILL_CENTER;
        boolean isCameraPermissionGranted = scannerQrCode.getIsCameraPermissionGranted();
        if (isCameraPermissionGranted) {
            aVar = ScannerViewData.a.SQUARE;
        } else {
            if (isCameraPermissionGranted) {
                throw new p();
            }
            aVar = ScannerViewData.a.NONE;
        }
        return new x90.c.a.Scanner(baseScaffoldData, labelC, linkData, new QrScannerData(null, new ScannerViewData(bVar, aVar), 1, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(r90.a.f172446z), null, 2, null), k30.d.a.f107773a, scannerQrCode.getShowCodeBottomSheetDialog() ? k30.b.C2562b.f107767a : k30.b.c.f107768a, params.e(), 3, null), showCodeBottomSheetDialog, modalBottomSheetData, params.g(), new QrScannerBottomSheetData(scannerQrCode.getShowCodeBottomSheetDialog(), Label.INSTANCE.c(), mx.b.b(c0.e(scannerQrCode.getCode()), "code"), scannerQrCode.getCodeValidationState(), new v50.c.Text(null, this.labelProvider.c(r90.a.f172445y), null, mx.b.b(c0.e(scannerQrCode.getCode()), "codeValue"), scannerQrCode.getCodeValidationState(), null, null, new l() { // from class: y90.f
            @Override // er.l
            public final Object b(Object obj) {
                return j.s(params, (String) obj);
            }
        }, null, false, 0, new l() { // from class: y90.g
            @Override // er.l
            public final Object b(Object obj) {
                return j.u(params, (o) obj);
            }
        }, false, null, true, null, null, null, null, null, 1029989, null), this.labelProvider.c(r90.a.f172430j), false), params.d(), scannerQrCode.getIsCameraPermissionGranted(), new CameraPermissionNotGrantedData(this.labelProvider.c(r90.a.E), this.labelProvider.c(r90.a.D), this.labelProvider.c(r90.a.F), params.a()), scannerQrCode.getConnector(), new er.a() { // from class: y90.h
            @Override // er.a
            public final Object a() {
                return j.x();
            }
        });
    }
}

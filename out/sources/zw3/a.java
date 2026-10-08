package zw3;

import cw3.IdentityPhotoData;
import e70.CameraPermissionNotGrantedData;
import er.l;
import fr.t;
import fx.Rectangle;
import h30.ButtonData;
import i20.ScannerViewData;
import i50.BaseScaffoldData;
import jw3.MaskDefinition;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import sz.d;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import yw3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lzw3/a;", "Lxw/f;", "Lzw3/a$a;", "Lyw3/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lzw3/a$a;)Lyw3/f$a;", "a", "Lmx/c;", "Lcw3/a$a;", "", "c", "(Lcw3/a$a;)I", "alertBodyResId", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, yw3.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: zw3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b&\u0010)R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b\u001e\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b\"\u0010/R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b0\u0010)¨\u00061"}, d2 = {"Lzw3/a$a;", "", "Lyw3/e;", "state", "Lkotlin/Function1;", "Lfx/e;", "Loq/i0;", "onContainerChanged", "Lkotlin/Function0;", "onTakePhotoAction", "onCloseClick", "goToSettings", "onBack", "Lsz/d;", "connector", "Lyw3/a;", "faceValidationVMS", "switchCameraAction", "<init>", "(Lyw3/e;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Lsz/d;Lyw3/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyw3/e;", "h", "()Lyw3/e;", "b", "Ler/l;", "f", "()Ler/l;", "c", "Ler/a;", "g", "()Ler/a;", "d", "e", "Lsz/d;", "()Lsz/d;", "Lyw3/a;", "()Lyw3/a;", "i", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Rectangle, i0> onContainerChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTakePhotoAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToSettings;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final d connector;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final yw3.a faceValidationVMS;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> switchCameraAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(e eVar, l<? super Rectangle, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, d dVar, yw3.a aVar5, er.a<i0> aVar6) {
            this.state = eVar;
            this.onContainerChanged = lVar;
            this.onTakePhotoAction = aVar;
            this.onCloseClick = aVar2;
            this.goToSettings = aVar3;
            this.onBack = aVar4;
            this.connector = dVar;
            this.faceValidationVMS = aVar5;
            this.switchCameraAction = aVar6;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getConnector() {
            return this.connector;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final yw3.a getFaceValidationVMS() {
            return this.faceValidationVMS;
        }

        public final er.a<i0> c() {
            return this.goToSettings;
        }

        public final er.a<i0> d() {
            return this.onBack;
        }

        public final er.a<i0> e() {
            return this.onCloseClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onContainerChanged, params.onContainerChanged) && t.c(this.onTakePhotoAction, params.onTakePhotoAction) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.goToSettings, params.goToSettings) && t.c(this.onBack, params.onBack) && t.c(this.connector, params.connector) && t.c(this.faceValidationVMS, params.faceValidationVMS) && t.c(this.switchCameraAction, params.switchCameraAction);
        }

        public final l<Rectangle, i0> f() {
            return this.onContainerChanged;
        }

        public final er.a<i0> g() {
            return this.onTakePhotoAction;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final e getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onContainerChanged.hashCode()) * 31) + this.onTakePhotoAction.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.goToSettings.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.connector.hashCode()) * 31) + this.faceValidationVMS.hashCode()) * 31) + this.switchCameraAction.hashCode();
        }

        public final er.a<i0> i() {
            return this.switchCameraAction;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onContainerChanged=" + this.onContainerChanged + ", onTakePhotoAction=" + this.onTakePhotoAction + ", onCloseClick=" + this.onCloseClick + ", goToSettings=" + this.goToSettings + ", onBack=" + this.onBack + ", connector=" + this.connector + ", faceValidationVMS=" + this.faceValidationVMS + ", switchCameraAction=" + this.switchCameraAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f238231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f238232b;

        static {
            int[] iArr = new int[jw3.c.values().length];
            try {
                iArr[jw3.c.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jw3.c.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f238231a = iArr;
            int[] iArr2 = new int[sx.d.values().length];
            try {
                iArr2[sx.d.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[sx.d.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f238232b = iArr2;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final int c(IdentityPhotoData.AbstractC0815a abstractC0815a) {
        if (t.c(abstractC0815a, IdentityPhotoData.AbstractC0815a.C0816a.f38347a) || t.c(abstractC0815a, IdentityPhotoData.AbstractC0815a.d.f38356a)) {
            return bw3.a.E;
        }
        if (t.c(abstractC0815a, IdentityPhotoData.AbstractC0815a.b.f38350a)) {
            return bw3.a.F;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public yw3.f.Data b(Params params) {
        ScannerViewData.b bVar;
        k30.b bVar2;
        ButtonData buttonData;
        int i15;
        e state = params.getState();
        e.Camera camera = state instanceof e.Camera ? (e.Camera) state : null;
        MaskDefinition maskDefinition = camera != null ? camera.getMaskDefinition() : null;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(bw3.a.G), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.e(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        c30.b.c cVar = new c30.b.c(null, null, null, this.labelProvider.c(c(params.getState().getMaskType())), null, null, null, 119, null);
        int i16 = b.f238231a[params.getState().getScaleType().ordinal()];
        if (i16 == 1) {
            bVar = ScannerViewData.b.FILL_CENTER;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            bVar = ScannerViewData.b.FIT_CENTER;
        }
        ScannerViewData scannerViewData = new ScannerViewData(bVar, null, 2, null);
        l<Rectangle, i0> lVarF = params.f();
        er.a<i0> aVarE = params.e();
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.a aVar = k30.d.a.f107773a;
        boolean isCameraPermissionGranted = params.getState().getIsCameraPermissionGranted();
        if (isCameraPermissionGranted) {
            bVar2 = k30.b.c.f107768a;
        } else {
            if (isCameraPermissionGranted) {
                throw new p();
            }
            bVar2 = k30.b.C2562b.f107767a;
        }
        ButtonData buttonData2 = new ButtonData(null, null, large, new k30.c.WithText(this.labelProvider.c(bw3.a.f21870g), null, 2, null), aVar, bVar2, params.g(), 3, null);
        d connector = params.getConnector();
        yw3.a faceValidationVMS = params.getFaceValidationVMS();
        boolean isCameraPermissionGranted2 = params.getState().getIsCameraPermissionGranted();
        CameraPermissionNotGrantedData cameraPermissionNotGrantedData = new CameraPermissionNotGrantedData(this.labelProvider.c(bw3.a.f21901v0), this.labelProvider.c(bw3.a.f21897t0), this.labelProvider.c(bw3.a.f21899u0), params.c());
        e state2 = params.getState();
        e.Camera camera2 = state2 instanceof e.Camera ? (e.Camera) state2 : null;
        if (camera2 != null) {
            k30.a.b bVar3 = k30.a.b.f107765a;
            int i17 = jz.a.f106735b;
            c cVar2 = this.labelProvider;
            int i18 = b.f238232b[camera2.getLensSide().ordinal()];
            if (i18 == 1) {
                i15 = bw3.a.f21888p;
            } else {
                if (i18 != 2) {
                    throw new p();
                }
                i15 = bw3.a.f21890q;
            }
            buttonData = new ButtonData(null, null, bVar3, new k30.c.WithIcon(i17, cVar2.c(i15)), aVar, null, params.i(), 35, null);
        } else {
            buttonData = null;
        }
        return new yw3.f.Data(faceValidationVMS, lVarF, scannerViewData, maskDefinition, baseScaffoldData, cVar, aVarE, buttonData2, connector, isCameraPermissionGranted2, cameraPermissionNotGrantedData, buttonData);
    }
}

package g83;

import e70.CameraPermissionNotGrantedData;
import f70.QrScannerData;
import f83.State;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import h83.BottomSheetContentData;
import h83.FrameData;
import i50.BaseScaffoldData;
import iy.c0;
import mx.Label;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg83/q;", "Lxw/f;", "Lg83/q$a;", "Lf83/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "i", "(Lg83/q$a;)Lf83/c$a;", "a", "Lmx/c;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements xw.f<Params, f83.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g83.q$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lg83/q$a;", "", "Lf83/b;", "state", "Lg83/q$a$a;", "actionsHandler", "<init>", "(Lf83/b;Lg83/q$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf83/b;", "b", "()Lf83/b;", "Lg83/q$a$a;", "()Lg83/q$a$a;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ActionsHandler actionsHandler;

        /* JADX INFO: renamed from: g83.q$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010\u001a¨\u0006!"}, d2 = {"Lg83/q$a$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackPressed", "onConfirmButtonClick", "Lkotlin/Function1;", "", "onChangeBottomSheetVisibility", "", "onInputCodeChanged", "onAlertClose", "onNoCameraPermissions", "<init>", "(Ler/a;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "b", "()Ler/a;", "d", "c", "Ler/l;", "()Ler/l;", "e", "f", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActionsHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackPressed;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onConfirmButtonClick;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<Boolean, i0> onChangeBottomSheetVisibility;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<String, i0> onInputCodeChanged;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onAlertClose;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onNoCameraPermissions;

            /* JADX WARN: Multi-variable type inference failed */
            public ActionsHandler(er.a<i0> aVar, er.a<i0> aVar2, er.l<? super Boolean, i0> lVar, er.l<? super String, i0> lVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
                this.onBackPressed = aVar;
                this.onConfirmButtonClick = aVar2;
                this.onChangeBottomSheetVisibility = lVar;
                this.onInputCodeChanged = lVar2;
                this.onAlertClose = aVar3;
                this.onNoCameraPermissions = aVar4;
            }

            public final er.a<i0> a() {
                return this.onAlertClose;
            }

            public final er.a<i0> b() {
                return this.onBackPressed;
            }

            public final er.l<Boolean, i0> c() {
                return this.onChangeBottomSheetVisibility;
            }

            public final er.a<i0> d() {
                return this.onConfirmButtonClick;
            }

            public final er.l<String, i0> e() {
                return this.onInputCodeChanged;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionsHandler)) {
                    return false;
                }
                ActionsHandler actionsHandler = (ActionsHandler) other;
                return t.c(this.onBackPressed, actionsHandler.onBackPressed) && t.c(this.onConfirmButtonClick, actionsHandler.onConfirmButtonClick) && t.c(this.onChangeBottomSheetVisibility, actionsHandler.onChangeBottomSheetVisibility) && t.c(this.onInputCodeChanged, actionsHandler.onInputCodeChanged) && t.c(this.onAlertClose, actionsHandler.onAlertClose) && t.c(this.onNoCameraPermissions, actionsHandler.onNoCameraPermissions);
            }

            public final er.a<i0> f() {
                return this.onNoCameraPermissions;
            }

            public int hashCode() {
                return (((((((((this.onBackPressed.hashCode() * 31) + this.onConfirmButtonClick.hashCode()) * 31) + this.onChangeBottomSheetVisibility.hashCode()) * 31) + this.onInputCodeChanged.hashCode()) * 31) + this.onAlertClose.hashCode()) * 31) + this.onNoCameraPermissions.hashCode();
            }

            public String toString() {
                return "ActionsHandler(onBackPressed=" + this.onBackPressed + ", onConfirmButtonClick=" + this.onConfirmButtonClick + ", onChangeBottomSheetVisibility=" + this.onChangeBottomSheetVisibility + ", onInputCodeChanged=" + this.onInputCodeChanged + ", onAlertClose=" + this.onAlertClose + ", onNoCameraPermissions=" + this.onNoCameraPermissions + ')';
            }
        }

        public Params(State state, ActionsHandler actionsHandler) {
            this.state = state;
            this.actionsHandler = actionsHandler;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActionsHandler getActionsHandler() {
            return this.actionsHandler;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.actionsHandler, params.actionsHandler);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.actionsHandler.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", actionsHandler=" + this.actionsHandler + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71261a;

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
            f71261a = iArr;
        }
    }

    public q(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.getActionsHandler().c().b(Boolean.FALSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, v vVar) {
        int i15 = b.f71261a[vVar.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new oq.p();
            }
            params.getActionsHandler().c().b(Boolean.FALSE);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.getActionsHandler().c().b(Boolean.FALSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.getActionsHandler().c().b(Boolean.TRUE);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f83.c.Data b(final Params params) {
        ButtonData buttonData;
        params.getState();
        FrameData frameData = null;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.getActionsHandler().b()), this.labelProvider.c(n73.a.R), null, null, null, 28, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: g83.m
            @Override // er.a
            public final Object a() {
                return q.l(params);
            }
        })), null, null, 53, null);
        QrScannerData qrScannerData = new QrScannerData((params.getState().getIsCameraPermissionGranted() && params.getState().getIsAlertVisible()) ? new c30.b.e(null, null, null, this.labelProvider.c(n73.a.f133456f), params.getActionsHandler().a(), null, null, 103, null) : null, null, 2, null);
        er.a<i0> aVarD = params.getActionsHandler().d();
        er.l<Boolean, i0> lVarC = params.getActionsHandler().c();
        sz.d connector = params.getState().getConnector();
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(params.getState().getIsBottomSheetVisible() ? v.EXPANDED : v.HIDDEN, false, new er.l() { // from class: g83.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.m(params, (v) obj);
            }
        }, 2, null), this.labelProvider.c(n73.a.Q), new er.a() { // from class: g83.o
            @Override // er.a
            public final Object a() {
                return q.q(params);
            }
        }, null, 8, null);
        boolean isBottomSheetVisible = params.getState().getIsBottomSheetVisible();
        BottomSheetContentData bottomSheetContentData = new BottomSheetContentData(this.labelProvider.c(n73.a.P), isBottomSheetVisible, mx.b.b(c0.e(params.getState().getQrCode()), "qrCode"), params.getState().getCodeValidationState(), new v50.c.Text(null, null, null, mx.b.b(c0.e(params.getState().getQrCode()), "qrCodeValue"), params.getState().getCodeValidationState(), null, null, params.getActionsHandler().e(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048423, null), this.labelProvider.c(n73.a.f133454e));
        if (params.getState().getIsBottomSheetVisible()) {
            buttonData = null;
        } else {
            buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(n73.a.O), null, 2, null), new k30.d.Secondary(null, 1, null), null, new er.a() { // from class: g83.p
                @Override // er.a
                public final Object a() {
                    return q.r(params);
                }
            }, 35, null);
        }
        CameraPermissionNotGrantedData cameraPermissionNotGrantedData = params.getState().getIsCameraPermissionGranted() ? null : new CameraPermissionNotGrantedData(this.labelProvider.c(n73.a.f133468m), this.labelProvider.c(n73.a.f133467l), this.labelProvider.c(n73.a.f133469n), params.getActionsHandler().f());
        if (!params.getState().getIsBottomSheetVisible() && params.getState().getIsCameraPermissionGranted()) {
            frameData = new FrameData(c20.b.f22719t0, Label.INSTANCE.c());
        }
        return new f83.c.Data(baseScaffoldData, this.labelProvider.c(n73.a.f133458g), qrScannerData, modalBottomSheetData, bottomSheetContentData, connector, buttonData, cameraPermissionNotGrantedData, frameData, aVarD, lVarC);
    }
}

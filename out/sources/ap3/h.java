package ap3;

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
import mx.Label;
import oq.i0;
import oq.p;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0097\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lap3/h;", "Lxw/f;", "Lap3/h$a;", "Lzo3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Lzo3/b$b;", "state", "Lzo3/c$a$b$a;", "l", "(Lap3/h$a;Lzo3/b$b;)Lzo3/c$a$b$a;", "r", "(Lap3/h$a;)Lzo3/c$a;", "a", "Lmx/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, zo3.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ap3.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b\u001f\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b(\u0010\"R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b\u001b\u0010'¨\u0006)"}, d2 = {"Lap3/h$a;", "", "Lzo3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onQuestionMarkClick", "onConfirmCode", "Lkotlin/Function1;", "", "onCodeChange", "onAlertClose", "onGoToCameraPermissionSettings", "Lg30/v;", "bottomSheetVisibilityChange", "<init>", "(Lzo3/b;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzo3/b;", "h", "()Lzo3/b;", "b", "Ler/a;", "c", "()Ler/a;", "g", "d", "e", "Ler/l;", "()Ler/l;", "f", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final zo3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onQuestionMarkClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirmCode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onCodeChange;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAlertClose;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToCameraPermissionSettings;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> bottomSheetVisibilityChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(zo3.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar, er.a<i0> aVar4, er.a<i0> aVar5, l<? super v, i0> lVar2) {
            this.state = bVar;
            this.onBackClick = aVar;
            this.onQuestionMarkClick = aVar2;
            this.onConfirmCode = aVar3;
            this.onCodeChange = lVar;
            this.onAlertClose = aVar4;
            this.onGoToCameraPermissionSettings = aVar5;
            this.bottomSheetVisibilityChange = lVar2;
        }

        public final l<v, i0> a() {
            return this.bottomSheetVisibilityChange;
        }

        public final er.a<i0> b() {
            return this.onAlertClose;
        }

        public final er.a<i0> c() {
            return this.onBackClick;
        }

        public final l<String, i0> d() {
            return this.onCodeChange;
        }

        public final er.a<i0> e() {
            return this.onConfirmCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onQuestionMarkClick, params.onQuestionMarkClick) && t.c(this.onConfirmCode, params.onConfirmCode) && t.c(this.onCodeChange, params.onCodeChange) && t.c(this.onAlertClose, params.onAlertClose) && t.c(this.onGoToCameraPermissionSettings, params.onGoToCameraPermissionSettings) && t.c(this.bottomSheetVisibilityChange, params.bottomSheetVisibilityChange);
        }

        public final er.a<i0> f() {
            return this.onGoToCameraPermissionSettings;
        }

        public final er.a<i0> g() {
            return this.onQuestionMarkClick;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final zo3.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onQuestionMarkClick.hashCode()) * 31) + this.onConfirmCode.hashCode()) * 31) + this.onCodeChange.hashCode()) * 31) + this.onAlertClose.hashCode()) * 31) + this.onGoToCameraPermissionSettings.hashCode()) * 31) + this.bottomSheetVisibilityChange.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onQuestionMarkClick=" + this.onQuestionMarkClick + ", onConfirmCode=" + this.onConfirmCode + ", onCodeChange=" + this.onCodeChange + ", onAlertClose=" + this.onAlertClose + ", onGoToCameraPermissionSettings=" + this.onGoToCameraPermissionSettings + ", bottomSheetVisibilityChange=" + this.bottomSheetVisibilityChange + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14019a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.HALF_EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14019a = iArr;
        }
    }

    public h(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final zo3.c.a.Initialized.BottomSheetContentData l(final Params params, zo3.b.Initialized state) {
        return new zo3.c.a.Initialized.BottomSheetContentData(new ModalBottomSheetData(new ModalSheetState(state.getBottomSheetVisibilityValue(), true, new l() { // from class: ap3.c
            @Override // er.l
            public final Object b(Object obj) {
                return h.m(params, (v) obj);
            }
        }), this.labelProvider.c(un3.b.N2), new er.a() { // from class: ap3.d
            @Override // er.a
            public final Object a() {
                return h.q(params);
            }
        }, null, 8, null), this.labelProvider.c(un3.b.P2), new v50.c.Text(null, null, null, mx.b.b(state.getCode(), "code"), state.getCodeValidationState(), null, null, params.d(), null, false, 0, null, false, null, true, null, this.labelProvider.c(un3.b.P2), null, null, null, 966503, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(un3.b.f199446l), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, v vVar) {
        params.a().b(vVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.a().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.a().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.a().b(v.EXPANDED);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.a().b(v.HIDDEN);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public zo3.c.a b(final Params params) {
        k30.b bVar;
        zo3.b state = params.getState();
        if (state instanceof zo3.b.a) {
            return zo3.c.a.C6379a.f235934a;
        }
        if (!(state instanceof zo3.b.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(un3.b.M2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, null, null, params.g(), 6, null)), null, 20, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: ap3.e
            @Override // er.a
            public final Object a() {
                return h.s(params);
            }
        })), null, null, 53, null);
        Label labelC = this.labelProvider.c(un3.b.f199461o);
        c30.b.e eVar = new c30.b.e(null, null, null, this.labelProvider.c(un3.b.f199456n), params.b(), null, null, 103, null);
        if (!((zo3.b.Initialized) params.getState()).getIsAlertVisible()) {
            eVar = null;
        }
        QrScannerData qrScannerData = new QrScannerData(eVar, new ScannerViewData(null, ((zo3.b.Initialized) params.getState()).getIsCameraPermissionGranted() ? ScannerViewData.a.SQUARE : ScannerViewData.a.NONE, 1, null));
        int i15 = b.f14019a[((zo3.b.Initialized) params.getState()).getBottomSheetVisibilityValue().ordinal()];
        if (i15 == 1 || i15 == 2) {
            bVar = k30.b.C2562b.f107767a;
        } else {
            if (i15 != 3) {
                throw new p();
            }
            bVar = k30.b.c.f107768a;
        }
        return new zo3.c.a.Initialized(baseScaffoldData, labelC, qrScannerData, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(un3.b.O2), null, 2, null), new k30.d.Secondary(null, 1, null), bVar, new er.a() { // from class: ap3.f
            @Override // er.a
            public final Object a() {
                return h.u(params);
            }
        }, 3, null), params.c(), new er.a() { // from class: ap3.g
            @Override // er.a
            public final Object a() {
                return h.v(params);
            }
        }, ((zo3.b.Initialized) params.getState()).getIsCameraPermissionGranted(), new CameraPermissionNotGrantedData(this.labelProvider.c(un3.b.U), this.labelProvider.c(un3.b.T), this.labelProvider.c(un3.b.V), params.f()), ((zo3.b.Initialized) params.getState()).getConnector(), l(params, (zo3.b.Initialized) params.getState()));
    }
}

package v53;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.k;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: renamed from: v53.e, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u0001%BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001e\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b%\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b(\u0010-R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105¨\u00069"}, d2 = {"Lv53/e;", "Lx60/d;", "Lv53/f;", "screenType", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Lv50/c$e;", "pinInputData", "", "shouldFocusWithKeyboard", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClicked", "Lmx/a;", "successMessageLabel", "failureMessageLabel", "<init>", "(Lv53/f;Li50/a;Lo40/a;Lv50/c$e;ZLer/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lv53/f;", "getScreenType", "()Lv53/f;", "b", "Li50/a;", "()Li50/a;", "c", "Lo40/a;", "()Lo40/a;", "d", "Lv50/c$e;", "()Lv50/c$e;", "e", "Z", "()Z", "f", "Ler/a;", "j", "()Ler/a;", "g", "Lmx/a;", "getSuccessMessageLabel", "()Lmx/a;", "h", "getFailureMessageLabel", "i", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoginWithPinScreenData implements x60.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f204063j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final LoginWithPinScreenData f204064k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final f screenType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData baseScaffoldData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final o40.a headerData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final v50.c.Pin pinInputData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldFocusWithKeyboard;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onCloseButtonClicked;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label successMessageLabel;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label failureMessageLabel;

    /* JADX INFO: renamed from: v53.e$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f204073a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1777343231);
            if (t.k()) {
                t.o(1777343231, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.loginwithpin.model.LoginWithPinScreenData.Companion.EMPTY.<anonymous> (LoginWithPinScreenData.kt:26)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jC;
        }
    }

    /* JADX INFO: renamed from: v53.e$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f204074a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1350073502);
            if (t.k()) {
                t.o(1350073502, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.loginwithpin.model.LoginWithPinScreenData.Companion.EMPTY.<anonymous> (LoginWithPinScreenData.kt:27)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    /* JADX INFO: renamed from: v53.e$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv53/e$c;", "", "<init>", "()V", "Lv53/e;", "EMPTY", "Lv53/e;", "a", "()Lv53/e;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final LoginWithPinScreenData a() {
            return LoginWithPinScreenData.f204064k;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        f.b bVar = f.b.f204076a;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106790i, a.f204073a, b.f204074a, new Label("", ""), null, null, 32, null);
        Label.Companion companion = Label.INSTANCE;
        boolean z15 = false;
        f204064k = new LoginWithPinScreenData(bVar, baseScaffoldData, icon, new v50.c.Pin(null, null, companion.c(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, new l() { // from class: v53.c
            @Override // er.l
            public final Object b(Object obj) {
                return LoginWithPinScreenData.g((String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 0, null, 262075, null), z15, new er.a() { // from class: v53.d
            @Override // er.a
            public final Object a() {
                return LoginWithPinScreenData.h();
            }
        }, companion.c(), companion.c(), 16, 0 == true ? 1 : 0);
    }

    public LoginWithPinScreenData(f fVar, BaseScaffoldData baseScaffoldData, o40.a aVar, v50.c.Pin pin, boolean z15, er.a<i0> aVar2, Label label, Label label2) {
        this.screenType = fVar;
        this.baseScaffoldData = baseScaffoldData;
        this.headerData = aVar;
        this.pinInputData = pin;
        this.shouldFocusWithKeyboard = z15;
        this.onCloseButtonClicked = aVar2;
        this.successMessageLabel = label;
        this.failureMessageLabel = label2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(String str) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    @Override // x60.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public o40.a getHeaderData() {
        return this.headerData;
    }

    @Override // x60.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public BaseScaffoldData getBaseScaffoldData() {
        return this.baseScaffoldData;
    }

    @Override // x60.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public v50.c.Pin getPinInputData() {
        return this.pinInputData;
    }

    @Override // x60.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getShouldFocusWithKeyboard() {
        return this.shouldFocusWithKeyboard;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginWithPinScreenData)) {
            return false;
        }
        LoginWithPinScreenData loginWithPinScreenData = (LoginWithPinScreenData) other;
        return fr.t.c(this.screenType, loginWithPinScreenData.screenType) && fr.t.c(this.baseScaffoldData, loginWithPinScreenData.baseScaffoldData) && fr.t.c(this.headerData, loginWithPinScreenData.headerData) && fr.t.c(this.pinInputData, loginWithPinScreenData.pinInputData) && this.shouldFocusWithKeyboard == loginWithPinScreenData.shouldFocusWithKeyboard && fr.t.c(this.onCloseButtonClicked, loginWithPinScreenData.onCloseButtonClicked) && fr.t.c(this.successMessageLabel, loginWithPinScreenData.successMessageLabel) && fr.t.c(this.failureMessageLabel, loginWithPinScreenData.failureMessageLabel);
    }

    public int hashCode() {
        return (((((((((((((this.screenType.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.headerData.hashCode()) * 31) + this.pinInputData.hashCode()) * 31) + Boolean.hashCode(this.shouldFocusWithKeyboard)) * 31) + this.onCloseButtonClicked.hashCode()) * 31) + this.successMessageLabel.hashCode()) * 31) + this.failureMessageLabel.hashCode();
    }

    public er.a<i0> j() {
        return this.onCloseButtonClicked;
    }

    public String toString() {
        return "LoginWithPinScreenData(screenType=" + this.screenType + ", baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", pinInputData=" + this.pinInputData + ", shouldFocusWithKeyboard=" + this.shouldFocusWithKeyboard + ", onCloseButtonClicked=" + this.onCloseButtonClicked + ", successMessageLabel=" + this.successMessageLabel + ", failureMessageLabel=" + this.failureMessageLabel + ')';
    }

    public /* synthetic */ LoginWithPinScreenData(f fVar, BaseScaffoldData baseScaffoldData, o40.a aVar, v50.c.Pin pin, boolean z15, er.a aVar2, Label label, Label label2, int i15, k kVar) {
        this(fVar, baseScaffoldData, aVar, pin, (i15 & 16) != 0 ? true : z15, aVar2, label, label2);
    }
}

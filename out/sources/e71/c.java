package e71;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Le71/c;", "Ll00/e;", "Le71/c$a;", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Le71/c$a;", "", "b", "c", "a", "Le71/c$a$a;", "Le71/c$a$b;", "Le71/c$a$c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: e71.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Le71/c$a$a;", "Le71/c$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Le71/c$a$b;", "Le71/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f47944a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 396254005;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: e71.c$a$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b*\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b#\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b.\u00105R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b6\u0010)R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b8\u0010:\u001a\u0004\b3\u0010;R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b<\u00109¨\u0006@"}, d2 = {"Le71/c$a$c;", "Le71/c$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "headerLabel", "Ln30/b;", "childData", "Lv50/c;", "birthDateInputData", "Lc30/b;", "alertData", "Lh30/a;", "buttonData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "citizenshipTitle", "Lw30/a;", "citizenshipCheckBox", "", "scrollToCitizenshipCheckBox", "onScrolledToCitizenshipCheckBox", "<init>", "(Li50/a;Lmx/a;Ln30/b;Lv50/c;Lc30/b;Lh30/a;Ler/a;Lmx/a;Lw30/a;ZLer/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "h", "()Lmx/a;", "c", "Ln30/b;", "e", "()Ln30/b;", "d", "Lv50/c;", "()Lv50/c;", "Lc30/b;", "()Lc30/b;", "f", "Lh30/a;", "()Lh30/a;", "g", "Ler/a;", "i", "()Ler/a;", "Lw30/a;", "()Lw30/a;", "j", "Z", "k", "()Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f47945l = ((CheckBoxSingleData.f210090f | c30.b.f22944i) | v50.c.f203957t) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerLabel;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData childData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c birthDateInputData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label citizenshipTitle;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxSingleData citizenshipCheckBox;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean scrollToCitizenshipCheckBox;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onScrolledToCitizenshipCheckBox;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, CardListData cardListData, v50.c cVar, c30.b bVar, ButtonData buttonData, er.a<i0> aVar, Label label2, CheckBoxSingleData checkBoxSingleData, boolean z15, er.a<i0> aVar2) {
                this.baseScaffoldData = baseScaffoldData;
                this.headerLabel = label;
                this.childData = cardListData;
                this.birthDateInputData = cVar;
                this.alertData = bVar;
                this.buttonData = buttonData;
                this.onBackClick = aVar;
                this.citizenshipTitle = label2;
                this.citizenshipCheckBox = checkBoxSingleData;
                this.scrollToCitizenshipCheckBox = z15;
                this.onScrolledToCitizenshipCheckBox = aVar2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final v50.c getBirthDateInputData() {
                return this.birthDateInputData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final CardListData getChildData() {
                return this.childData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.headerLabel, initialized.headerLabel) && fr.t.c(this.childData, initialized.childData) && fr.t.c(this.birthDateInputData, initialized.birthDateInputData) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.buttonData, initialized.buttonData) && fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.citizenshipTitle, initialized.citizenshipTitle) && fr.t.c(this.citizenshipCheckBox, initialized.citizenshipCheckBox) && this.scrollToCitizenshipCheckBox == initialized.scrollToCitizenshipCheckBox && fr.t.c(this.onScrolledToCitizenshipCheckBox, initialized.onScrolledToCitizenshipCheckBox);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final CheckBoxSingleData getCitizenshipCheckBox() {
                return this.citizenshipCheckBox;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getCitizenshipTitle() {
                return this.citizenshipTitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getHeaderLabel() {
                return this.headerLabel;
            }

            public int hashCode() {
                int iHashCode = ((((this.baseScaffoldData.hashCode() * 31) + this.headerLabel.hashCode()) * 31) + this.childData.hashCode()) * 31;
                v50.c cVar = this.birthDateInputData;
                return ((((((((((((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.alertData.hashCode()) * 31) + this.buttonData.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.citizenshipTitle.hashCode()) * 31) + this.citizenshipCheckBox.hashCode()) * 31) + Boolean.hashCode(this.scrollToCitizenshipCheckBox)) * 31) + this.onScrolledToCitizenshipCheckBox.hashCode();
            }

            public final er.a<i0> i() {
                return this.onBackClick;
            }

            public final er.a<i0> j() {
                return this.onScrolledToCitizenshipCheckBox;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getScrollToCitizenshipCheckBox() {
                return this.scrollToCitizenshipCheckBox;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", headerLabel=" + this.headerLabel + ", childData=" + this.childData + ", birthDateInputData=" + this.birthDateInputData + ", alertData=" + this.alertData + ", buttonData=" + this.buttonData + ", onBackClick=" + this.onBackClick + ", citizenshipTitle=" + this.citizenshipTitle + ", citizenshipCheckBox=" + this.citizenshipCheckBox + ", scrollToCitizenshipCheckBox=" + this.scrollToCitizenshipCheckBox + ", onScrolledToCitizenshipCheckBox=" + this.onScrolledToCitizenshipCheckBox + ')';
            }
        }
    }
}

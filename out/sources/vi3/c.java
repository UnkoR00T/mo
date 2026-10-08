package vi3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lvi3/c;", "Ll00/e;", "Lvi3/c$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lvi3/c$a;", "", "a", "b", "Lvi3/c$a$a;", "Lvi3/c$a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: vi3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvi3/c$a$a;", "Lvi3/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5420a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5420a f207007a = new C5420a();

            private C5420a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5420a);
            }

            public int hashCode() {
                return -678373330;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: vi3.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b+\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b%\u00102R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b!\u00105R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b#\u00106\u001a\u0004\b3\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\b)\u00109¨\u0006:"}, d2 = {"Lvi3/c$a$b;", "Lvi3/c$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "insuranceTitle", "statementTitle", "Lj40/a;", "insuranceProviderDropDownButtonData", "Lv50/c$g;", "insuranceNumberInputData", "Lw30/a;", "checkBoxData", "Lh30/a;", "bottomButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Ln50/k;", "deleteCard", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lj40/a;Lv50/c$g;Lw30/a;Lh30/a;Ler/a;Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "h", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "i", "d", "Lj40/a;", "e", "()Lj40/a;", "Lv50/c$g;", "()Lv50/c$g;", "Lw30/a;", "()Lw30/a;", "g", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "Ln50/k;", "()Ln50/k;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label insuranceTitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label statementTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final DropDownButtonData insuranceProviderDropDownButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c.Text insuranceNumberInputData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxSingleData checkBoxData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData bottomButtonData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k deleteCard;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, Label label2, DropDownButtonData dropDownButtonData, v50.c.Text text, CheckBoxSingleData checkBoxSingleData, ButtonData buttonData, er.a<i0> aVar, n50.k kVar) {
                this.scaffoldData = baseScaffoldData;
                this.insuranceTitle = label;
                this.statementTitle = label2;
                this.insuranceProviderDropDownButtonData = dropDownButtonData;
                this.insuranceNumberInputData = text;
                this.checkBoxData = checkBoxSingleData;
                this.bottomButtonData = buttonData;
                this.onBackAction = aVar;
                this.deleteCard = kVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getBottomButtonData() {
                return this.bottomButtonData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CheckBoxSingleData getCheckBoxData() {
                return this.checkBoxData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final n50.k getDeleteCard() {
                return this.deleteCard;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final v50.c.Text getInsuranceNumberInputData() {
                return this.insuranceNumberInputData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final DropDownButtonData getInsuranceProviderDropDownButtonData() {
                return this.insuranceProviderDropDownButtonData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.insuranceTitle, initialized.insuranceTitle) && fr.t.c(this.statementTitle, initialized.statementTitle) && fr.t.c(this.insuranceProviderDropDownButtonData, initialized.insuranceProviderDropDownButtonData) && fr.t.c(this.insuranceNumberInputData, initialized.insuranceNumberInputData) && fr.t.c(this.checkBoxData, initialized.checkBoxData) && fr.t.c(this.bottomButtonData, initialized.bottomButtonData) && fr.t.c(this.onBackAction, initialized.onBackAction) && fr.t.c(this.deleteCard, initialized.deleteCard);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getInsuranceTitle() {
                return this.insuranceTitle;
            }

            public final er.a<i0> g() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((this.scaffoldData.hashCode() * 31) + this.insuranceTitle.hashCode()) * 31) + this.statementTitle.hashCode()) * 31) + this.insuranceProviderDropDownButtonData.hashCode()) * 31) + this.insuranceNumberInputData.hashCode()) * 31) + this.checkBoxData.hashCode()) * 31) + this.bottomButtonData.hashCode()) * 31) + this.onBackAction.hashCode()) * 31;
                n50.k kVar = this.deleteCard;
                return iHashCode + (kVar == null ? 0 : kVar.hashCode());
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getStatementTitle() {
                return this.statementTitle;
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", insuranceTitle=" + this.insuranceTitle + ", statementTitle=" + this.statementTitle + ", insuranceProviderDropDownButtonData=" + this.insuranceProviderDropDownButtonData + ", insuranceNumberInputData=" + this.insuranceNumberInputData + ", checkBoxData=" + this.checkBoxData + ", bottomButtonData=" + this.bottomButtonData + ", onBackAction=" + this.onBackAction + ", deleteCard=" + this.deleteCard + ')';
            }
        }
    }
}

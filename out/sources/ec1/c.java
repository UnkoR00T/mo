package ec1;

import h30.ButtonData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lec1/c;", "Ll00/e;", "Lec1/c$a;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: ec1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b!\u0010*R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b+\u00108R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b3\u00106¨\u00069"}, d2 = {"Lec1/c$a;", "", "Lmx/a;", "namesSectionTitle", "", "Lec1/f;", "nameFields", "launchDateSectionTitle", "Lec1/d;", "launchDateInputData", "numberOfEmployeesSectionTitle", "Lec1/e;", "numberOfEmployeesInputData", "Lec1/d0;", "scrollToField", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToField", "Lh30/a;", "nextButton", "onBackAction", "<init>", "(Lmx/a;Ljava/util/List;Lmx/a;Lec1/d;Lmx/a;Lec1/e;Lec1/d0;Ler/a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lec1/d;", "()Lec1/d;", "e", "g", "f", "Lec1/e;", "()Lec1/e;", "Lec1/d0;", "j", "()Lec1/d0;", "h", "Ler/a;", "i", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label namesSectionTitle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<TextArea> nameFields;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label launchDateSectionTitle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date launchDateInputData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label numberOfEmployeesSectionTitle;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Number numberOfEmployeesInputData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final d0 scrollToField;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButton;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Data(Label label, List<TextArea> list, Label label2, Date date, Label label3, Number number, d0 d0Var, er.a<i0> aVar, ButtonData buttonData, er.a<i0> aVar2) {
            this.namesSectionTitle = label;
            this.nameFields = list;
            this.launchDateSectionTitle = label2;
            this.launchDateInputData = date;
            this.numberOfEmployeesSectionTitle = label3;
            this.numberOfEmployeesInputData = number;
            this.scrollToField = d0Var;
            this.onScrolledToField = aVar;
            this.nextButton = buttonData;
            this.onBackAction = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Date getLaunchDateInputData() {
            return this.launchDateInputData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getLaunchDateSectionTitle() {
            return this.launchDateSectionTitle;
        }

        public final List<TextArea> c() {
            return this.nameFields;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getNamesSectionTitle() {
            return this.namesSectionTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ButtonData getNextButton() {
            return this.nextButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.namesSectionTitle, data.namesSectionTitle) && fr.t.c(this.nameFields, data.nameFields) && fr.t.c(this.launchDateSectionTitle, data.launchDateSectionTitle) && fr.t.c(this.launchDateInputData, data.launchDateInputData) && fr.t.c(this.numberOfEmployeesSectionTitle, data.numberOfEmployeesSectionTitle) && fr.t.c(this.numberOfEmployeesInputData, data.numberOfEmployeesInputData) && this.scrollToField == data.scrollToField && fr.t.c(this.onScrolledToField, data.onScrolledToField) && fr.t.c(this.nextButton, data.nextButton) && fr.t.c(this.onBackAction, data.onBackAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Number getNumberOfEmployeesInputData() {
            return this.numberOfEmployeesInputData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getNumberOfEmployeesSectionTitle() {
            return this.numberOfEmployeesSectionTitle;
        }

        public final er.a<i0> h() {
            return this.onBackAction;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.namesSectionTitle.hashCode() * 31) + this.nameFields.hashCode()) * 31) + this.launchDateSectionTitle.hashCode()) * 31) + this.launchDateInputData.hashCode()) * 31) + this.numberOfEmployeesSectionTitle.hashCode()) * 31) + this.numberOfEmployeesInputData.hashCode()) * 31;
            d0 d0Var = this.scrollToField;
            return ((((((iHashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31) + this.onScrolledToField.hashCode()) * 31) + this.nextButton.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public final er.a<i0> i() {
            return this.onScrolledToField;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final d0 getScrollToField() {
            return this.scrollToField;
        }

        public String toString() {
            return "Data(namesSectionTitle=" + this.namesSectionTitle + ", nameFields=" + this.nameFields + ", launchDateSectionTitle=" + this.launchDateSectionTitle + ", launchDateInputData=" + this.launchDateInputData + ", numberOfEmployeesSectionTitle=" + this.numberOfEmployeesSectionTitle + ", numberOfEmployeesInputData=" + this.numberOfEmployeesInputData + ", scrollToField=" + this.scrollToField + ", onScrolledToField=" + this.onScrolledToField + ", nextButton=" + this.nextButton + ", onBackAction=" + this.onBackAction + ')';
        }
    }
}

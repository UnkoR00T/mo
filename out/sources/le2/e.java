package le2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t50.TextAreaData;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lle2/e;", "Ll00/e;", "Lle2/e$a;", "a", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: le2.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b)\u0010/R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b1\u00102R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b-\u00102R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b8\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b4\u0010,R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b3\u0010<R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\b=\u0010BR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b1\u0010A\u001a\u0004\b:\u0010B¨\u0006C"}, d2 = {"Lle2/e$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "detailsSectionTitle", "Lv40/a;", "dateIncidentInputData", "Loq/r;", "Lle2/a;", "timeIncidentInputData", "Lt50/d;", "descriptionTextAreaData", "locationSectionTitle", "Ln50/k;", "locationSingleCard", "locationError", "Lh30/a;", "nextButtonData", "Lcb4/i;", "dialogVMSAdapter", "scrollToField", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToField", "onBackClick", "<init>", "(Li50/a;Lmx/a;Lv40/a;Loq/r;Loq/r;Lmx/a;Loq/r;Lmx/a;Lh30/a;Lcb4/i;Lle2/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "Lv40/a;", "()Lv40/a;", "Loq/r;", "m", "()Loq/r;", "e", "f", "g", "h", "i", "Lh30/a;", "()Lh30/a;", "j", "Lcb4/i;", "()Lcb4/i;", "k", "Lle2/a;", "l", "()Lle2/a;", "Ler/a;", "()Ler/a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label detailsSectionTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputDateTimeData dateIncidentInputData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<a, InputDateTimeData> timeIncidentInputData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<a, TextAreaData> descriptionTextAreaData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label locationSectionTitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<a, n50.k> locationSingleCard;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label locationError;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final a scrollToField;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, Label label, InputDateTimeData inputDateTimeData, oq.r<? extends a, InputDateTimeData> rVar, oq.r<? extends a, TextAreaData> rVar2, Label label2, oq.r<? extends a, ? extends n50.k> rVar3, Label label3, ButtonData buttonData, cb4.i iVar, a aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.baseScaffoldData = baseScaffoldData;
            this.detailsSectionTitle = label;
            this.dateIncidentInputData = inputDateTimeData;
            this.timeIncidentInputData = rVar;
            this.descriptionTextAreaData = rVar2;
            this.locationSectionTitle = label2;
            this.locationSingleCard = rVar3;
            this.locationError = label3;
            this.nextButtonData = buttonData;
            this.dialogVMSAdapter = iVar;
            this.scrollToField = aVar;
            this.onScrolledToField = aVar2;
            this.onBackClick = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InputDateTimeData getDateIncidentInputData() {
            return this.dateIncidentInputData;
        }

        public final oq.r<a, TextAreaData> c() {
            return this.descriptionTextAreaData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getDetailsSectionTitle() {
            return this.detailsSectionTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.detailsSectionTitle, data.detailsSectionTitle) && fr.t.c(this.dateIncidentInputData, data.dateIncidentInputData) && fr.t.c(this.timeIncidentInputData, data.timeIncidentInputData) && fr.t.c(this.descriptionTextAreaData, data.descriptionTextAreaData) && fr.t.c(this.locationSectionTitle, data.locationSectionTitle) && fr.t.c(this.locationSingleCard, data.locationSingleCard) && fr.t.c(this.locationError, data.locationError) && fr.t.c(this.nextButtonData, data.nextButtonData) && fr.t.c(this.dialogVMSAdapter, data.dialogVMSAdapter) && this.scrollToField == data.scrollToField && fr.t.c(this.onScrolledToField, data.onScrolledToField) && fr.t.c(this.onBackClick, data.onBackClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getLocationError() {
            return this.locationError;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getLocationSectionTitle() {
            return this.locationSectionTitle;
        }

        public final oq.r<a, n50.k> h() {
            return this.locationSingleCard;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.baseScaffoldData.hashCode() * 31) + this.detailsSectionTitle.hashCode()) * 31) + this.dateIncidentInputData.hashCode()) * 31) + this.timeIncidentInputData.hashCode()) * 31) + this.descriptionTextAreaData.hashCode()) * 31) + this.locationSectionTitle.hashCode()) * 31) + this.locationSingleCard.hashCode()) * 31;
            Label label = this.locationError;
            int iHashCode2 = (((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.nextButtonData.hashCode()) * 31;
            cb4.i iVar = this.dialogVMSAdapter;
            int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            a aVar = this.scrollToField;
            return ((((iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.onScrolledToField.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        public final er.a<i0> j() {
            return this.onBackClick;
        }

        public final er.a<i0> k() {
            return this.onScrolledToField;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final a getScrollToField() {
            return this.scrollToField;
        }

        public final oq.r<a, InputDateTimeData> m() {
            return this.timeIncidentInputData;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", detailsSectionTitle=" + this.detailsSectionTitle + ", dateIncidentInputData=" + this.dateIncidentInputData + ", timeIncidentInputData=" + this.timeIncidentInputData + ", descriptionTextAreaData=" + this.descriptionTextAreaData + ", locationSectionTitle=" + this.locationSectionTitle + ", locationSingleCard=" + this.locationSingleCard + ", locationError=" + this.locationError + ", nextButtonData=" + this.nextButtonData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ", scrollToField=" + this.scrollToField + ", onScrolledToField=" + this.onScrolledToField + ", onBackClick=" + this.onBackClick + ')';
        }
    }
}

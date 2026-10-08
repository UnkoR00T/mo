package az0;

import b30.AccordionData;
import bz0.PointInfoData;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Laz0/c;", "Ll00/e;", "Laz0/c$a;", "Li70/n;", "a", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Laz0/c$a;", "", "a", "b", "Laz0/c$a$a;", "Laz0/c$a$b;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: az0.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laz0/c$a$a;", "Laz0/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0359a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0359a f15278a = new C0359a();

            private C0359a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0359a);
            }

            public int hashCode() {
                return 1335738493;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: az0.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b4\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b(\u0010/R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b2\u0010;\u001a\u0004\b0\u0010<R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b.\u0010A\u001a\u0004\b,\u0010BR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b?\u0010C\u001a\u0004\b=\u0010D¨\u0006E"}, d2 = {"Laz0/c$a$b;", "Laz0/c$a;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lmx/a;", "timeStampLabel", "Lbz0/a;", "pointInfoData", "measurementDetailsLabel", "Ln30/b;", "measurementDetailsCardListData", "Lb30/a;", "otherAccordionData", "closePointsLabel", "", "Ln50/k;", "listOfClosePoints", "", "isFavourite", "deleteButtonCardData", "Lh30/a;", "saveButtonData", "<init>", "(Li50/a;Ler/a;Lmx/a;Lbz0/a;Lmx/a;Ln30/b;Lb30/a;Lmx/a;Ljava/util/List;ZLn50/k;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ler/a;", "g", "()Ler/a;", "c", "Lmx/a;", "k", "()Lmx/a;", "d", "Lbz0/a;", "i", "()Lbz0/a;", "e", "f", "Ln30/b;", "()Ln30/b;", "Lb30/a;", "h", "()Lb30/a;", "Ljava/util/List;", "()Ljava/util/List;", "j", "Z", "l", "()Z", "Ln50/k;", "()Ln50/k;", "Lh30/a;", "()Lh30/a;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label timeStampLabel;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final PointInfoData pointInfoData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label measurementDetailsLabel;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData measurementDetailsCardListData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData otherAccordionData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label closePointsLabel;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n50.k> listOfClosePoints;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFavourite;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k deleteButtonCardData;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData saveButtonData;

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, Label label, PointInfoData pointInfoData, Label label2, CardListData cardListData, AccordionData accordionData, Label label3, List<? extends n50.k> list, boolean z15, n50.k kVar, ButtonData buttonData) {
                this.baseScaffoldData = baseScaffoldData;
                this.onBack = aVar;
                this.timeStampLabel = label;
                this.pointInfoData = pointInfoData;
                this.measurementDetailsLabel = label2;
                this.measurementDetailsCardListData = cardListData;
                this.otherAccordionData = accordionData;
                this.closePointsLabel = label3;
                this.listOfClosePoints = list;
                this.isFavourite = z15;
                this.deleteButtonCardData = kVar;
                this.saveButtonData = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getClosePointsLabel() {
                return this.closePointsLabel;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final n50.k getDeleteButtonCardData() {
                return this.deleteButtonCardData;
            }

            public final List<n50.k> d() {
                return this.listOfClosePoints;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final CardListData getMeasurementDetailsCardListData() {
                return this.measurementDetailsCardListData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return t.c(this.baseScaffoldData, initialized.baseScaffoldData) && t.c(this.onBack, initialized.onBack) && t.c(this.timeStampLabel, initialized.timeStampLabel) && t.c(this.pointInfoData, initialized.pointInfoData) && t.c(this.measurementDetailsLabel, initialized.measurementDetailsLabel) && t.c(this.measurementDetailsCardListData, initialized.measurementDetailsCardListData) && t.c(this.otherAccordionData, initialized.otherAccordionData) && t.c(this.closePointsLabel, initialized.closePointsLabel) && t.c(this.listOfClosePoints, initialized.listOfClosePoints) && this.isFavourite == initialized.isFavourite && t.c(this.deleteButtonCardData, initialized.deleteButtonCardData) && t.c(this.saveButtonData, initialized.saveButtonData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getMeasurementDetailsLabel() {
                return this.measurementDetailsLabel;
            }

            public final er.a<i0> g() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final AccordionData getOtherAccordionData() {
                return this.otherAccordionData;
            }

            public int hashCode() {
                int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.onBack.hashCode()) * 31;
                Label label = this.timeStampLabel;
                return ((((((((((((((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.pointInfoData.hashCode()) * 31) + this.measurementDetailsLabel.hashCode()) * 31) + this.measurementDetailsCardListData.hashCode()) * 31) + this.otherAccordionData.hashCode()) * 31) + this.closePointsLabel.hashCode()) * 31) + this.listOfClosePoints.hashCode()) * 31) + Boolean.hashCode(this.isFavourite)) * 31) + this.deleteButtonCardData.hashCode()) * 31) + this.saveButtonData.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final PointInfoData getPointInfoData() {
                return this.pointInfoData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final ButtonData getSaveButtonData() {
                return this.saveButtonData;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Label getTimeStampLabel() {
                return this.timeStampLabel;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final boolean getIsFavourite() {
                return this.isFavourite;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", onBack=" + this.onBack + ", timeStampLabel=" + this.timeStampLabel + ", pointInfoData=" + this.pointInfoData + ", measurementDetailsLabel=" + this.measurementDetailsLabel + ", measurementDetailsCardListData=" + this.measurementDetailsCardListData + ", otherAccordionData=" + this.otherAccordionData + ", closePointsLabel=" + this.closePointsLabel + ", listOfClosePoints=" + this.listOfClosePoints + ", isFavourite=" + this.isFavourite + ", deleteButtonCardData=" + this.deleteButtonCardData + ", saveButtonData=" + this.saveButtonData + ')';
            }
        }
    }
}

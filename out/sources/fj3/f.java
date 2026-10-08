package fj3;

import b30.AccordionData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lfj3/f;", "Ll00/e;", "Lfj3/f$a;", "a", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: fj3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u0018B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b \u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, d2 = {"Lfj3/f$a;", "", "Li50/a;", "scaffoldData", "Lfj3/f$a$b;", "technicalData", "Lfj3/f$a$a;", "odometerData", "Lmx/a;", "riskLabel", "Ln30/b;", "abroadDataList", "<init>", "(Li50/a;Lfj3/f$a$b;Lfj3/f$a$a;Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lfj3/f$a$b;", "e", "()Lfj3/f$a$b;", "c", "Lfj3/f$a$a;", "()Lfj3/f$a$a;", "Lmx/a;", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f64287f = AccordionData.f16343b | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ScreenTechnicalData technicalData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ScreenOdometerData odometerData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label riskLabel;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData abroadDataList;

        /* JADX INFO: renamed from: fj3.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lfj3/f$a$a;", "", "Lb30/a;", "odometerAccordionData", "", "isOdometerDataExpanded", "<init>", "(Lb30/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lb30/a;", "()Lb30/a;", "b", "Z", "()Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ScreenOdometerData {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f64293c = AccordionData.f16343b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData odometerAccordionData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isOdometerDataExpanded;

            public ScreenOdometerData(AccordionData accordionData, boolean z15) {
                this.odometerAccordionData = accordionData;
                this.isOdometerDataExpanded = z15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AccordionData getOdometerAccordionData() {
                return this.odometerAccordionData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getIsOdometerDataExpanded() {
                return this.isOdometerDataExpanded;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScreenOdometerData)) {
                    return false;
                }
                ScreenOdometerData screenOdometerData = (ScreenOdometerData) other;
                return fr.t.c(this.odometerAccordionData, screenOdometerData.odometerAccordionData) && this.isOdometerDataExpanded == screenOdometerData.isOdometerDataExpanded;
            }

            public int hashCode() {
                AccordionData accordionData = this.odometerAccordionData;
                return ((accordionData == null ? 0 : accordionData.hashCode()) * 31) + Boolean.hashCode(this.isOdometerDataExpanded);
            }

            public String toString() {
                return "ScreenOdometerData(odometerAccordionData=" + this.odometerAccordionData + ", isOdometerDataExpanded=" + this.isOdometerDataExpanded + ')';
            }
        }

        /* JADX INFO: renamed from: fj3.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfj3/f$a$b;", "", "Ln30/b;", "mainTechnicalData", "Lb30/a;", "additionalAccordionData", "<init>", "(Ln30/b;Lb30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "b", "()Ln30/b;", "Lb30/a;", "()Lb30/a;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ScreenTechnicalData {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f64296c = AccordionData.f16343b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData mainTechnicalData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData additionalAccordionData;

            public ScreenTechnicalData(CardListData cardListData, AccordionData accordionData) {
                this.mainTechnicalData = cardListData;
                this.additionalAccordionData = accordionData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AccordionData getAdditionalAccordionData() {
                return this.additionalAccordionData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CardListData getMainTechnicalData() {
                return this.mainTechnicalData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScreenTechnicalData)) {
                    return false;
                }
                ScreenTechnicalData screenTechnicalData = (ScreenTechnicalData) other;
                return fr.t.c(this.mainTechnicalData, screenTechnicalData.mainTechnicalData) && fr.t.c(this.additionalAccordionData, screenTechnicalData.additionalAccordionData);
            }

            public int hashCode() {
                return (this.mainTechnicalData.hashCode() * 31) + this.additionalAccordionData.hashCode();
            }

            public String toString() {
                return "ScreenTechnicalData(mainTechnicalData=" + this.mainTechnicalData + ", additionalAccordionData=" + this.additionalAccordionData + ')';
            }
        }

        public Data(BaseScaffoldData baseScaffoldData, ScreenTechnicalData screenTechnicalData, ScreenOdometerData screenOdometerData, Label label, CardListData cardListData) {
            this.scaffoldData = baseScaffoldData;
            this.technicalData = screenTechnicalData;
            this.odometerData = screenOdometerData;
            this.riskLabel = label;
            this.abroadDataList = cardListData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getAbroadDataList() {
            return this.abroadDataList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ScreenOdometerData getOdometerData() {
            return this.odometerData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getRiskLabel() {
            return this.riskLabel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ScreenTechnicalData getTechnicalData() {
            return this.technicalData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.technicalData, data.technicalData) && fr.t.c(this.odometerData, data.odometerData) && fr.t.c(this.riskLabel, data.riskLabel) && fr.t.c(this.abroadDataList, data.abroadDataList);
        }

        public int hashCode() {
            int iHashCode = this.scaffoldData.hashCode() * 31;
            ScreenTechnicalData screenTechnicalData = this.technicalData;
            return ((((((iHashCode + (screenTechnicalData == null ? 0 : screenTechnicalData.hashCode())) * 31) + this.odometerData.hashCode()) * 31) + this.riskLabel.hashCode()) * 31) + this.abroadDataList.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", technicalData=" + this.technicalData + ", odometerData=" + this.odometerData + ", riskLabel=" + this.riskLabel + ", abroadDataList=" + this.abroadDataList + ')';
        }
    }
}

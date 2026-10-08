package xj3;

import b30.AccordionData;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lxj3/d;", "Ll00/e;", "Lxj3/d$a;", "a", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: xj3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b*\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b&\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b9\u00108\u001a\u0004\b\"\u0010:R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b,\u0010;\u001a\u0004\b.\u0010<¨\u0006="}, d2 = {"Lxj3/d$a;", "", "Li50/a;", "scaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lc30/b$b;", "vehicleStolenAlert", "temporarilyWithdrawnFromCirculationAlert", "Ln30/b;", "mainDataDetails", "Lb30/a;", "technicalAccordionData", "documentsAccordionData", "Lmx/a;", "additionalInformationTitle", "Ln50/g;", "timelineSingleCardData", "abroadSingleCardData", "Lc30/b$c;", "infoAboutAlert", "<init>", "(Li50/a;Ler/a;Lc30/b$b;Lc30/b$b;Ln30/b;Lb30/a;Lb30/a;Lmx/a;Ln50/g;Ln50/g;Lc30/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Ler/a;", "f", "()Ler/a;", "c", "Lc30/b$b;", "k", "()Lc30/b$b;", "d", "i", "e", "Ln30/b;", "()Ln30/b;", "Lb30/a;", "h", "()Lb30/a;", "Lmx/a;", "()Lmx/a;", "Ln50/g;", "j", "()Ln50/g;", "Lc30/b$c;", "()Lc30/b$c;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f219150l;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b.C0606b vehicleStolenAlert;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b.C0606b temporarilyWithdrawnFromCirculationAlert;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData mainDataDetails;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final AccordionData technicalAccordionData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final AccordionData documentsAccordionData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label additionalInformationTitle;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultSingleCardData timelineSingleCardData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultSingleCardData abroadSingleCardData;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b.c infoAboutAlert;

        static {
            int i15 = AccordionData.f16343b;
            int i16 = c30.b.C0606b.f22956j;
            f219150l = i15 | i16 | i16 | BaseScaffoldData.f89350g;
        }

        public Data(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, c30.b.C0606b c0606b, c30.b.C0606b c0606b2, CardListData cardListData, AccordionData accordionData, AccordionData accordionData2, Label label, DefaultSingleCardData defaultSingleCardData, DefaultSingleCardData defaultSingleCardData2, c30.b.c cVar) {
            this.scaffoldData = baseScaffoldData;
            this.onBackAction = aVar;
            this.vehicleStolenAlert = c0606b;
            this.temporarilyWithdrawnFromCirculationAlert = c0606b2;
            this.mainDataDetails = cardListData;
            this.technicalAccordionData = accordionData;
            this.documentsAccordionData = accordionData2;
            this.additionalInformationTitle = label;
            this.timelineSingleCardData = defaultSingleCardData;
            this.abroadSingleCardData = defaultSingleCardData2;
            this.infoAboutAlert = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DefaultSingleCardData getAbroadSingleCardData() {
            return this.abroadSingleCardData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getAdditionalInformationTitle() {
            return this.additionalInformationTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AccordionData getDocumentsAccordionData() {
            return this.documentsAccordionData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c30.b.c getInfoAboutAlert() {
            return this.infoAboutAlert;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final CardListData getMainDataDetails() {
            return this.mainDataDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.onBackAction, data.onBackAction) && t.c(this.vehicleStolenAlert, data.vehicleStolenAlert) && t.c(this.temporarilyWithdrawnFromCirculationAlert, data.temporarilyWithdrawnFromCirculationAlert) && t.c(this.mainDataDetails, data.mainDataDetails) && t.c(this.technicalAccordionData, data.technicalAccordionData) && t.c(this.documentsAccordionData, data.documentsAccordionData) && t.c(this.additionalInformationTitle, data.additionalInformationTitle) && t.c(this.timelineSingleCardData, data.timelineSingleCardData) && t.c(this.abroadSingleCardData, data.abroadSingleCardData) && t.c(this.infoAboutAlert, data.infoAboutAlert);
        }

        public final er.a<i0> f() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final AccordionData getTechnicalAccordionData() {
            return this.technicalAccordionData;
        }

        public int hashCode() {
            int iHashCode = ((this.scaffoldData.hashCode() * 31) + this.onBackAction.hashCode()) * 31;
            c30.b.C0606b c0606b = this.vehicleStolenAlert;
            int iHashCode2 = (iHashCode + (c0606b == null ? 0 : c0606b.hashCode())) * 31;
            c30.b.C0606b c0606b2 = this.temporarilyWithdrawnFromCirculationAlert;
            return ((((((((((((((iHashCode2 + (c0606b2 != null ? c0606b2.hashCode() : 0)) * 31) + this.mainDataDetails.hashCode()) * 31) + this.technicalAccordionData.hashCode()) * 31) + this.documentsAccordionData.hashCode()) * 31) + this.additionalInformationTitle.hashCode()) * 31) + this.timelineSingleCardData.hashCode()) * 31) + this.abroadSingleCardData.hashCode()) * 31) + this.infoAboutAlert.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final c30.b.C0606b getTemporarilyWithdrawnFromCirculationAlert() {
            return this.temporarilyWithdrawnFromCirculationAlert;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final DefaultSingleCardData getTimelineSingleCardData() {
            return this.timelineSingleCardData;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final c30.b.C0606b getVehicleStolenAlert() {
            return this.vehicleStolenAlert;
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", onBackAction=" + this.onBackAction + ", vehicleStolenAlert=" + this.vehicleStolenAlert + ", temporarilyWithdrawnFromCirculationAlert=" + this.temporarilyWithdrawnFromCirculationAlert + ", mainDataDetails=" + this.mainDataDetails + ", technicalAccordionData=" + this.technicalAccordionData + ", documentsAccordionData=" + this.documentsAccordionData + ", additionalInformationTitle=" + this.additionalInformationTitle + ", timelineSingleCardData=" + this.timelineSingleCardData + ", abroadSingleCardData=" + this.abroadSingleCardData + ", infoAboutAlert=" + this.infoAboutAlert + ')';
        }
    }
}

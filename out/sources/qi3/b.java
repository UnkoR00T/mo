package qi3;

import fr.t;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lqi3/b;", "", "b", "a", "Lqi3/b$a;", "Lqi3/b$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: qi3.b$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lqi3/b$a;", "Lqi3/b;", "Lmx/a;", "listTitle", "listDescription", "Ln30/b;", "allInsurersCardList", "<init>", "(Lmx/a;Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ln30/b;", "()Ln30/b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllInsurers implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label listTitle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label listDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData allInsurersCardList;

        public AllInsurers(Label label, Label label2, CardListData cardListData) {
            this.listTitle = label;
            this.listDescription = label2;
            this.allInsurersCardList = cardListData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getAllInsurersCardList() {
            return this.allInsurersCardList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getListDescription() {
            return this.listDescription;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getListTitle() {
            return this.listTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AllInsurers)) {
                return false;
            }
            AllInsurers allInsurers = (AllInsurers) other;
            return t.c(this.listTitle, allInsurers.listTitle) && t.c(this.listDescription, allInsurers.listDescription) && t.c(this.allInsurersCardList, allInsurers.allInsurersCardList);
        }

        public int hashCode() {
            return (((this.listTitle.hashCode() * 31) + this.listDescription.hashCode()) * 31) + this.allInsurersCardList.hashCode();
        }

        public String toString() {
            return "AllInsurers(listTitle=" + this.listTitle + ", listDescription=" + this.listDescription + ", allInsurersCardList=" + this.allInsurersCardList + ')';
        }
    }

    /* JADX INFO: renamed from: qi3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lqi3/b$b;", "Lqi3/b;", "Lqi3/a;", "perpetratorInsurerDetails", "victimInsurerDetails", "<init>", "(Lqi3/a;Lqi3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqi3/a;", "()Lqi3/a;", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvolvedPartiesInsurers implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AutomaticReportInsurerDetailsSectionData perpetratorInsurerDetails;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AutomaticReportInsurerDetailsSectionData victimInsurerDetails;

        public InvolvedPartiesInsurers(AutomaticReportInsurerDetailsSectionData automaticReportInsurerDetailsSectionData, AutomaticReportInsurerDetailsSectionData automaticReportInsurerDetailsSectionData2) {
            this.perpetratorInsurerDetails = automaticReportInsurerDetailsSectionData;
            this.victimInsurerDetails = automaticReportInsurerDetailsSectionData2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AutomaticReportInsurerDetailsSectionData getPerpetratorInsurerDetails() {
            return this.perpetratorInsurerDetails;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AutomaticReportInsurerDetailsSectionData getVictimInsurerDetails() {
            return this.victimInsurerDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvolvedPartiesInsurers)) {
                return false;
            }
            InvolvedPartiesInsurers involvedPartiesInsurers = (InvolvedPartiesInsurers) other;
            return t.c(this.perpetratorInsurerDetails, involvedPartiesInsurers.perpetratorInsurerDetails) && t.c(this.victimInsurerDetails, involvedPartiesInsurers.victimInsurerDetails);
        }

        public int hashCode() {
            int iHashCode = this.perpetratorInsurerDetails.hashCode() * 31;
            AutomaticReportInsurerDetailsSectionData automaticReportInsurerDetailsSectionData = this.victimInsurerDetails;
            return iHashCode + (automaticReportInsurerDetailsSectionData == null ? 0 : automaticReportInsurerDetailsSectionData.hashCode());
        }

        public String toString() {
            return "InvolvedPartiesInsurers(perpetratorInsurerDetails=" + this.perpetratorInsurerDetails + ", victimInsurerDetails=" + this.victimInsurerDetails + ')';
        }
    }
}

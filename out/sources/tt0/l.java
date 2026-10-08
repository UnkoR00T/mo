package tt0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000f\"R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0001\u0002%&¨\u0006'À\u0006\u0003"}, d2 = {"Ltt0/l;", "", "Ltt0/k;", "i", "()Ltt0/k;", "applicant", "", "getDescription", "()Ljava/lang/String;", "description", "", "Ltt0/c;", "d", "()Ljava/util/List;", "historyActions", "a", "initiativeNumber", "g", "interventionCategoryName", "e", "interventionTypeName", "Ltt0/d;", "c", "()Ltt0/d;", "processingStatus", "Ltt0/n;", "h", "()Ltt0/n;", "attachments", "Lfz/b$f;", "f", "()Lfz/b$f;", "occurrenceDateTime", "Ltt0/p;", "b", "()Ltt0/p;", "otherIntervention", "Ltt0/l$a;", "Ltt0/l$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: tt0.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001cR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b%\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u001cR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u000e\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b,\u0010<R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b7\u0010?R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b2\u0010BR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b)\u0010E¨\u0006F"}, d2 = {"Ltt0/l$a;", "Ltt0/l;", "Ltt0/k;", "applicant", "", "description", "", "Ltt0/c;", "historyActions", "initiativeNumber", "interventionCategory", "interventionCategoryName", "Ltt0/e;", "interventionType", "interventionTypeName", "Ltt0/o;", "objectDetails", "Ltt0/d;", "processingStatus", "Ltt0/n;", "attachments", "Lfz/b$f;", "occurrenceDateTime", "Ltt0/p;", "otherIntervention", "<init>", "(Ltt0/k;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltt0/e;Ljava/lang/String;Ltt0/o;Ltt0/d;Ltt0/n;Lfz/b$f;Ltt0/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltt0/k;", "i", "()Ltt0/k;", "b", "Ljava/lang/String;", "getDescription", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "getInterventionCategory", "f", "g", "Ltt0/e;", "getInterventionType", "()Ltt0/e;", "h", "Ltt0/o;", "j", "()Ltt0/o;", "Ltt0/d;", "()Ltt0/d;", "k", "Ltt0/n;", "()Ltt0/n;", "l", "Lfz/b$f;", "()Lfz/b$f;", "m", "Ltt0/p;", "()Ltt0/p;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Location implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportedInterventionApplicant applicant;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEInterventionHistoryActionDetail> historyActions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String initiativeNumber;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String interventionCategory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String interventionCategoryName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final e interventionType;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String interventionTypeName;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportedObjectInterventionDetails objectDetails;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final d processingStatus;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportedObjectInterventionAttachments attachments;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.OffsetDateTime occurrenceDateTime;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportedOtherIntervention otherIntervention;

        public Location(BEReportedInterventionApplicant bEReportedInterventionApplicant, String str, List<BEInterventionHistoryActionDetail> list, String str2, String str3, String str4, e eVar, String str5, BEReportedObjectInterventionDetails bEReportedObjectInterventionDetails, d dVar, BEReportedObjectInterventionAttachments bEReportedObjectInterventionAttachments, fz.b.OffsetDateTime offsetDateTime, BEReportedOtherIntervention bEReportedOtherIntervention) {
            this.applicant = bEReportedInterventionApplicant;
            this.description = str;
            this.historyActions = list;
            this.initiativeNumber = str2;
            this.interventionCategory = str3;
            this.interventionCategoryName = str4;
            this.interventionType = eVar;
            this.interventionTypeName = str5;
            this.objectDetails = bEReportedObjectInterventionDetails;
            this.processingStatus = dVar;
            this.attachments = bEReportedObjectInterventionAttachments;
            this.occurrenceDateTime = offsetDateTime;
            this.otherIntervention = bEReportedOtherIntervention;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getInitiativeNumber() {
            return this.initiativeNumber;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: b, reason: from getter */
        public BEReportedOtherIntervention getOtherIntervention() {
            return this.otherIntervention;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: c, reason: from getter */
        public d getProcessingStatus() {
            return this.processingStatus;
        }

        @Override // tt0.l
        public List<BEInterventionHistoryActionDetail> d() {
            return this.historyActions;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getInterventionTypeName() {
            return this.interventionTypeName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Location)) {
                return false;
            }
            Location location = (Location) other;
            return fr.t.c(this.applicant, location.applicant) && fr.t.c(this.description, location.description) && fr.t.c(this.historyActions, location.historyActions) && fr.t.c(this.initiativeNumber, location.initiativeNumber) && fr.t.c(this.interventionCategory, location.interventionCategory) && fr.t.c(this.interventionCategoryName, location.interventionCategoryName) && this.interventionType == location.interventionType && fr.t.c(this.interventionTypeName, location.interventionTypeName) && fr.t.c(this.objectDetails, location.objectDetails) && this.processingStatus == location.processingStatus && fr.t.c(this.attachments, location.attachments) && fr.t.c(this.occurrenceDateTime, location.occurrenceDateTime) && fr.t.c(this.otherIntervention, location.otherIntervention);
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: f, reason: from getter */
        public fz.b.OffsetDateTime getOccurrenceDateTime() {
            return this.occurrenceDateTime;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getInterventionCategoryName() {
            return this.interventionCategoryName;
        }

        @Override // tt0.l
        public String getDescription() {
            return this.description;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: h, reason: from getter */
        public BEReportedObjectInterventionAttachments getAttachments() {
            return this.attachments;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((this.applicant.hashCode() * 31) + this.description.hashCode()) * 31) + this.historyActions.hashCode()) * 31) + this.initiativeNumber.hashCode()) * 31) + this.interventionCategory.hashCode()) * 31) + this.interventionCategoryName.hashCode()) * 31) + this.interventionType.hashCode()) * 31) + this.interventionTypeName.hashCode()) * 31) + this.objectDetails.hashCode()) * 31) + this.processingStatus.hashCode()) * 31) + this.attachments.hashCode()) * 31;
            fz.b.OffsetDateTime offsetDateTime = this.occurrenceDateTime;
            int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
            BEReportedOtherIntervention bEReportedOtherIntervention = this.otherIntervention;
            return iHashCode2 + (bEReportedOtherIntervention != null ? bEReportedOtherIntervention.hashCode() : 0);
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: i, reason: from getter */
        public BEReportedInterventionApplicant getApplicant() {
            return this.applicant;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final BEReportedObjectInterventionDetails getObjectDetails() {
            return this.objectDetails;
        }

        public String toString() {
            return "Location(applicant=" + this.applicant + ", description=" + this.description + ", historyActions=" + this.historyActions + ", initiativeNumber=" + this.initiativeNumber + ", interventionCategory=" + this.interventionCategory + ", interventionCategoryName=" + this.interventionCategoryName + ", interventionType=" + this.interventionType + ", interventionTypeName=" + this.interventionTypeName + ", objectDetails=" + this.objectDetails + ", processingStatus=" + this.processingStatus + ", attachments=" + this.attachments + ", occurrenceDateTime=" + this.occurrenceDateTime + ", otherIntervention=" + this.otherIntervention + ")";
        }
    }

    /* JADX INFO: renamed from: tt0.l$b, reason: from toString */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010 R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b)\u0010 R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u0010 R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u0010 R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000e\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b4\u0010 R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010<\u001a\u0004\b0\u0010=R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b@\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b;\u0010GR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bC\u0010B\u001a\u0004\b>\u0010DR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b6\u0010JR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b-\u0010MR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bN\u0010.\u001a\u0004\bE\u0010 ¨\u0006O"}, d2 = {"Ltt0/l$b;", "Ltt0/l;", "Ltt0/k;", "applicant", "", "description", "", "Ltt0/c;", "historyActions", "initiativeNumber", "interventionCategory", "interventionCategoryName", "Ltt0/e;", "interventionType", "interventionTypeName", "Ltt0/d;", "processingStatus", "Ltt0/r;", "productData", "Ltt0/q;", "sellerData", "Ltt0/n;", "attachments", "manufacturerData", "Lfz/b$f;", "occurrenceDateTime", "Ltt0/p;", "otherIntervention", "productUrl", "<init>", "(Ltt0/k;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltt0/e;Ljava/lang/String;Ltt0/d;Ltt0/r;Ltt0/q;Ltt0/n;Ltt0/q;Lfz/b$f;Ltt0/p;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltt0/k;", "i", "()Ltt0/k;", "b", "Ljava/lang/String;", "getDescription", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "getInterventionCategory", "f", "g", "Ltt0/e;", "getInterventionType", "()Ltt0/e;", "h", "Ltt0/d;", "()Ltt0/d;", "j", "Ltt0/r;", "k", "()Ltt0/r;", "Ltt0/q;", "m", "()Ltt0/q;", "l", "Ltt0/n;", "()Ltt0/n;", "n", "Lfz/b$f;", "()Lfz/b$f;", "o", "Ltt0/p;", "()Ltt0/p;", "p", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Product implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportedInterventionApplicant applicant;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEInterventionHistoryActionDetail> historyActions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String initiativeNumber;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String interventionCategory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String interventionCategoryName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final e interventionType;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String interventionTypeName;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final d processingStatus;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportedProductInterventionProductData productData;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportedProductInterventionBusiness sellerData;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportedObjectInterventionAttachments attachments;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportedProductInterventionBusiness manufacturerData;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.OffsetDateTime occurrenceDateTime;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportedOtherIntervention otherIntervention;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productUrl;

        public Product(BEReportedInterventionApplicant bEReportedInterventionApplicant, String str, List<BEInterventionHistoryActionDetail> list, String str2, String str3, String str4, e eVar, String str5, d dVar, BEReportedProductInterventionProductData bEReportedProductInterventionProductData, BEReportedProductInterventionBusiness bEReportedProductInterventionBusiness, BEReportedObjectInterventionAttachments bEReportedObjectInterventionAttachments, BEReportedProductInterventionBusiness bEReportedProductInterventionBusiness2, fz.b.OffsetDateTime offsetDateTime, BEReportedOtherIntervention bEReportedOtherIntervention, String str6) {
            this.applicant = bEReportedInterventionApplicant;
            this.description = str;
            this.historyActions = list;
            this.initiativeNumber = str2;
            this.interventionCategory = str3;
            this.interventionCategoryName = str4;
            this.interventionType = eVar;
            this.interventionTypeName = str5;
            this.processingStatus = dVar;
            this.productData = bEReportedProductInterventionProductData;
            this.sellerData = bEReportedProductInterventionBusiness;
            this.attachments = bEReportedObjectInterventionAttachments;
            this.manufacturerData = bEReportedProductInterventionBusiness2;
            this.occurrenceDateTime = offsetDateTime;
            this.otherIntervention = bEReportedOtherIntervention;
            this.productUrl = str6;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getInitiativeNumber() {
            return this.initiativeNumber;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: b, reason: from getter */
        public BEReportedOtherIntervention getOtherIntervention() {
            return this.otherIntervention;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: c, reason: from getter */
        public d getProcessingStatus() {
            return this.processingStatus;
        }

        @Override // tt0.l
        public List<BEInterventionHistoryActionDetail> d() {
            return this.historyActions;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getInterventionTypeName() {
            return this.interventionTypeName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return fr.t.c(this.applicant, product.applicant) && fr.t.c(this.description, product.description) && fr.t.c(this.historyActions, product.historyActions) && fr.t.c(this.initiativeNumber, product.initiativeNumber) && fr.t.c(this.interventionCategory, product.interventionCategory) && fr.t.c(this.interventionCategoryName, product.interventionCategoryName) && this.interventionType == product.interventionType && fr.t.c(this.interventionTypeName, product.interventionTypeName) && this.processingStatus == product.processingStatus && fr.t.c(this.productData, product.productData) && fr.t.c(this.sellerData, product.sellerData) && fr.t.c(this.attachments, product.attachments) && fr.t.c(this.manufacturerData, product.manufacturerData) && fr.t.c(this.occurrenceDateTime, product.occurrenceDateTime) && fr.t.c(this.otherIntervention, product.otherIntervention) && fr.t.c(this.productUrl, product.productUrl);
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: f, reason: from getter */
        public fz.b.OffsetDateTime getOccurrenceDateTime() {
            return this.occurrenceDateTime;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getInterventionCategoryName() {
            return this.interventionCategoryName;
        }

        @Override // tt0.l
        public String getDescription() {
            return this.description;
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: h, reason: from getter */
        public BEReportedObjectInterventionAttachments getAttachments() {
            return this.attachments;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((this.applicant.hashCode() * 31) + this.description.hashCode()) * 31) + this.historyActions.hashCode()) * 31) + this.initiativeNumber.hashCode()) * 31) + this.interventionCategory.hashCode()) * 31) + this.interventionCategoryName.hashCode()) * 31) + this.interventionType.hashCode()) * 31) + this.interventionTypeName.hashCode()) * 31) + this.processingStatus.hashCode()) * 31) + this.productData.hashCode()) * 31;
            BEReportedProductInterventionBusiness bEReportedProductInterventionBusiness = this.sellerData;
            int iHashCode2 = (((iHashCode + (bEReportedProductInterventionBusiness == null ? 0 : bEReportedProductInterventionBusiness.hashCode())) * 31) + this.attachments.hashCode()) * 31;
            BEReportedProductInterventionBusiness bEReportedProductInterventionBusiness2 = this.manufacturerData;
            int iHashCode3 = (iHashCode2 + (bEReportedProductInterventionBusiness2 == null ? 0 : bEReportedProductInterventionBusiness2.hashCode())) * 31;
            fz.b.OffsetDateTime offsetDateTime = this.occurrenceDateTime;
            int iHashCode4 = (iHashCode3 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
            BEReportedOtherIntervention bEReportedOtherIntervention = this.otherIntervention;
            int iHashCode5 = (iHashCode4 + (bEReportedOtherIntervention == null ? 0 : bEReportedOtherIntervention.hashCode())) * 31;
            String str = this.productUrl;
            return iHashCode5 + (str != null ? str.hashCode() : 0);
        }

        @Override // tt0.l
        /* JADX INFO: renamed from: i, reason: from getter */
        public BEReportedInterventionApplicant getApplicant() {
            return this.applicant;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final BEReportedProductInterventionBusiness getManufacturerData() {
            return this.manufacturerData;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final BEReportedProductInterventionProductData getProductData() {
            return this.productData;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getProductUrl() {
            return this.productUrl;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final BEReportedProductInterventionBusiness getSellerData() {
            return this.sellerData;
        }

        public String toString() {
            return "Product(applicant=" + this.applicant + ", description=" + this.description + ", historyActions=" + this.historyActions + ", initiativeNumber=" + this.initiativeNumber + ", interventionCategory=" + this.interventionCategory + ", interventionCategoryName=" + this.interventionCategoryName + ", interventionType=" + this.interventionType + ", interventionTypeName=" + this.interventionTypeName + ", processingStatus=" + this.processingStatus + ", productData=" + this.productData + ", sellerData=" + this.sellerData + ", attachments=" + this.attachments + ", manufacturerData=" + this.manufacturerData + ", occurrenceDateTime=" + this.occurrenceDateTime + ", otherIntervention=" + this.otherIntervention + ", productUrl=" + this.productUrl + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    String getInitiativeNumber();

    /* JADX INFO: renamed from: b */
    BEReportedOtherIntervention getOtherIntervention();

    /* JADX INFO: renamed from: c */
    d getProcessingStatus();

    List<BEInterventionHistoryActionDetail> d();

    /* JADX INFO: renamed from: e */
    String getInterventionTypeName();

    /* JADX INFO: renamed from: f */
    fz.b.OffsetDateTime getOccurrenceDateTime();

    /* JADX INFO: renamed from: g */
    String getInterventionCategoryName();

    String getDescription();

    /* JADX INFO: renamed from: h */
    BEReportedObjectInterventionAttachments getAttachments();

    /* JADX INFO: renamed from: i */
    BEReportedInterventionApplicant getApplicant();
}

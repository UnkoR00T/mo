package sv0;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lsv0/g;", "", "Lsv0/y;", "e", "()Lsv0/y;", "processId", "Lsv0/s0;", "b", "()Lsv0/s0;", "collisionStatus", "", "a", "()Ljava/lang/Integer;", "workingCopyValidityDaysLeft", "Lsv0/g$a;", "Lsv0/g$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: sv0.g$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b$\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, d2 = {"Lsv0/g$a;", "Lsv0/g;", "Lsv0/y;", "processId", "Lsv0/s0;", "collisionStatus", "", "localizationDescription", "Lvy/c;", "coordinates", "statementNumber", "", "workingCopyValidityDaysLeft", "<init>", "(Lsv0/y;Lsv0/s0;Ljava/lang/String;Lvy/c;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "e", "()Lsv0/y;", "b", "Lsv0/s0;", "()Lsv0/s0;", "c", "Ljava/lang/String;", "d", "Lvy/c;", "()Lvy/c;", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Grouped implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s0 collisionStatus;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String localizationDescription;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Coordinates coordinates;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String statementNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer workingCopyValidityDaysLeft;

        public Grouped(ProcessId processId, s0 s0Var, String str, Coordinates coordinates, String str2, Integer num) {
            this.processId = processId;
            this.collisionStatus = s0Var;
            this.localizationDescription = str;
            this.coordinates = coordinates;
            this.statementNumber = str2;
            this.workingCopyValidityDaysLeft = num;
        }

        @Override // sv0.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Integer getWorkingCopyValidityDaysLeft() {
            return this.workingCopyValidityDaysLeft;
        }

        @Override // sv0.g
        /* JADX INFO: renamed from: b, reason: from getter */
        public s0 getCollisionStatus() {
            return this.collisionStatus;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLocalizationDescription() {
            return this.localizationDescription;
        }

        @Override // sv0.g
        /* JADX INFO: renamed from: e, reason: from getter */
        public ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Grouped)) {
                return false;
            }
            Grouped grouped = (Grouped) other;
            return fr.t.c(this.processId, grouped.processId) && this.collisionStatus == grouped.collisionStatus && fr.t.c(this.localizationDescription, grouped.localizationDescription) && fr.t.c(this.coordinates, grouped.coordinates) && fr.t.c(this.statementNumber, grouped.statementNumber) && fr.t.c(this.workingCopyValidityDaysLeft, grouped.workingCopyValidityDaysLeft);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getStatementNumber() {
            return this.statementNumber;
        }

        public int hashCode() {
            int iHashCode = ((((((this.processId.hashCode() * 31) + this.collisionStatus.hashCode()) * 31) + this.localizationDescription.hashCode()) * 31) + this.coordinates.hashCode()) * 31;
            String str = this.statementNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.workingCopyValidityDaysLeft;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Grouped(processId=" + this.processId + ", collisionStatus=" + this.collisionStatus + ", localizationDescription=" + this.localizationDescription + ", coordinates=" + this.coordinates + ", statementNumber=" + this.statementNumber + ", workingCopyValidityDaysLeft=" + this.workingCopyValidityDaysLeft + ")";
        }
    }

    /* JADX INFO: renamed from: sv0.g$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006#"}, d2 = {"Lsv0/g$b;", "Lsv0/g;", "Lsv0/y;", "processId", "Lsv0/s0;", "collisionStatus", "Lsv0/o;", "author", "", "workingCopyValidityDaysLeft", "<init>", "(Lsv0/y;Lsv0/s0;Lsv0/o;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "e", "()Lsv0/y;", "b", "Lsv0/s0;", "()Lsv0/s0;", "c", "Lsv0/o;", "()Lsv0/o;", "d", "I", "()Ljava/lang/Integer;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Started implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s0 collisionStatus;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final o author;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int workingCopyValidityDaysLeft;

        public Started(ProcessId processId, s0 s0Var, o oVar, int i15) {
            this.processId = processId;
            this.collisionStatus = s0Var;
            this.author = oVar;
            this.workingCopyValidityDaysLeft = i15;
        }

        @Override // sv0.g
        /* JADX INFO: renamed from: a */
        public Integer getWorkingCopyValidityDaysLeft() {
            return Integer.valueOf(this.workingCopyValidityDaysLeft);
        }

        @Override // sv0.g
        /* JADX INFO: renamed from: b, reason: from getter */
        public s0 getCollisionStatus() {
            return this.collisionStatus;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final o getAuthor() {
            return this.author;
        }

        @Override // sv0.g
        /* JADX INFO: renamed from: e, reason: from getter */
        public ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Started)) {
                return false;
            }
            Started started = (Started) other;
            return fr.t.c(this.processId, started.processId) && this.collisionStatus == started.collisionStatus && this.author == started.author && this.workingCopyValidityDaysLeft == started.workingCopyValidityDaysLeft;
        }

        public int hashCode() {
            return (((((this.processId.hashCode() * 31) + this.collisionStatus.hashCode()) * 31) + this.author.hashCode()) * 31) + Integer.hashCode(this.workingCopyValidityDaysLeft);
        }

        public String toString() {
            return "Started(processId=" + this.processId + ", collisionStatus=" + this.collisionStatus + ", author=" + this.author + ", workingCopyValidityDaysLeft=" + this.workingCopyValidityDaysLeft + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    Integer getWorkingCopyValidityDaysLeft();

    /* JADX INFO: renamed from: b */
    s0 getCollisionStatus();

    /* JADX INFO: renamed from: e */
    ProcessId getProcessId();
}

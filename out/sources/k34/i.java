package k34;

import er0.BEDocumentStatus;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\u0006\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lk34/i;", "", "Lrq0/b;", "documentType", "<init>", "(Lrq0/b;)V", "a", "Lrq0/b;", "getDocumentType", "()Lrq0/b;", "c", "d", "b", "e", "Lk34/i$a;", "Lk34/i$b;", "Lk34/i$c;", "Lk34/i$d;", "Lk34/i$e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: k34.i$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lk34/i$a;", "Lk34/i;", "Lrq0/b;", "documentType", "", "documentIID", "Lfz/b$c;", "expirationDate", "", "saveNewDocument", "<init>", "(Lrq0/b;Ljava/lang/String;Lfz/b$c;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b;", "()Lrq0/b;", "c", "Ljava/lang/String;", "a", "d", "Lfz/b$c;", "()Lfz/b$c;", "e", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Added extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentIID;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate expirationDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean saveNewDocument;

        public Added(rq0.b bVar, String str, fz.b.LocalDate localDate, boolean z15) {
            super(bVar, null);
            this.documentType = bVar;
            this.documentIID = str;
            this.expirationDate = localDate;
            this.saveNewDocument = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentIID() {
            return this.documentIID;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public rq0.b getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final fz.b.LocalDate getExpirationDate() {
            return this.expirationDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getSaveNewDocument() {
            return this.saveNewDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Added)) {
                return false;
            }
            Added added = (Added) other;
            return fr.t.c(this.documentType, added.documentType) && fr.t.c(this.documentIID, added.documentIID) && fr.t.c(this.expirationDate, added.expirationDate) && this.saveNewDocument == added.saveNewDocument;
        }

        public int hashCode() {
            int iHashCode = this.documentType.hashCode() * 31;
            String str = this.documentIID;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            fz.b.LocalDate localDate = this.expirationDate;
            return ((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31) + Boolean.hashCode(this.saveNewDocument);
        }

        public String toString() {
            return "Added(documentType=" + this.documentType + ", documentIID=" + this.documentIID + ", expirationDate=" + this.expirationDate + ", saveNewDocument=" + this.saveNewDocument + ")";
        }
    }

    /* JADX INFO: renamed from: k34.i$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lk34/i$b;", "Lk34/i;", "Lrq0/b;", "documentType", "", "Ler0/c;", "statuses", "<init>", "(Lrq0/b;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b;", "a", "()Lrq0/b;", "c", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContainerStatus extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEDocumentStatus> statuses;

        public ContainerStatus(rq0.b bVar, List<BEDocumentStatus> list) {
            super(bVar, null);
            this.documentType = bVar;
            this.statuses = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public rq0.b getDocumentType() {
            return this.documentType;
        }

        public final List<BEDocumentStatus> b() {
            return this.statuses;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContainerStatus)) {
                return false;
            }
            ContainerStatus containerStatus = (ContainerStatus) other;
            return fr.t.c(this.documentType, containerStatus.documentType) && fr.t.c(this.statuses, containerStatus.statuses);
        }

        public int hashCode() {
            return (this.documentType.hashCode() * 31) + this.statuses.hashCode();
        }

        public String toString() {
            return "ContainerStatus(documentType=" + this.documentType + ", statuses=" + this.statuses + ")";
        }
    }

    /* JADX INFO: renamed from: k34.i$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lk34/i$c;", "Lk34/i;", "Lrq0/b;", "documentType", "<init>", "(Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b;", "a", "()Lrq0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeletedByType extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        public DeletedByType(rq0.b bVar) {
            super(bVar, null);
            this.documentType = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public rq0.b getDocumentType() {
            return this.documentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeletedByType) && fr.t.c(this.documentType, ((DeletedByType) other).documentType);
        }

        public int hashCode() {
            return this.documentType.hashCode();
        }

        public String toString() {
            return "DeletedByType(documentType=" + this.documentType + ")";
        }
    }

    /* JADX INFO: renamed from: k34.i$d, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lk34/i$d;", "Lk34/i;", "Lrq0/b;", "documentType", "", "documentIID", "<init>", "(Lrq0/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b;", "()Lrq0/b;", "c", "Ljava/lang/String;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeletedSingleById extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentIID;

        public DeletedSingleById(rq0.b bVar, String str) {
            super(bVar, null);
            this.documentType = bVar;
            this.documentIID = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentIID() {
            return this.documentIID;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public rq0.b getDocumentType() {
            return this.documentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeletedSingleById)) {
                return false;
            }
            DeletedSingleById deletedSingleById = (DeletedSingleById) other;
            return fr.t.c(this.documentType, deletedSingleById.documentType) && fr.t.c(this.documentIID, deletedSingleById.documentIID);
        }

        public int hashCode() {
            return (this.documentType.hashCode() * 31) + this.documentIID.hashCode();
        }

        public String toString() {
            return "DeletedSingleById(documentType=" + this.documentType + ", documentIID=" + this.documentIID + ")";
        }
    }

    /* JADX INFO: renamed from: k34.i$e, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lk34/i$e;", "Lk34/i;", "Lrq0/b;", "documentType", "", "documentIID", "<init>", "(Lrq0/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b;", "()Lrq0/b;", "c", "Ljava/lang/String;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequireUpdate extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentIID;

        public RequireUpdate(rq0.b bVar, String str) {
            super(bVar, null);
            this.documentType = bVar;
            this.documentIID = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentIID() {
            return this.documentIID;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public rq0.b getDocumentType() {
            return this.documentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequireUpdate)) {
                return false;
            }
            RequireUpdate requireUpdate = (RequireUpdate) other;
            return fr.t.c(this.documentType, requireUpdate.documentType) && fr.t.c(this.documentIID, requireUpdate.documentIID);
        }

        public int hashCode() {
            int iHashCode = this.documentType.hashCode() * 31;
            String str = this.documentIID;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "RequireUpdate(documentType=" + this.documentType + ", documentIID=" + this.documentIID + ")";
        }
    }

    public /* synthetic */ i(rq0.b bVar, fr.k kVar) {
        this(bVar);
    }

    private i(rq0.b bVar) {
        this.documentType = bVar;
    }
}

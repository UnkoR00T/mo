package k34;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\t\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lk34/o;", "", "Lrq0/b;", "documentType", "<init>", "(Lrq0/b;)V", "a", "Lrq0/b;", "()Lrq0/b;", "c", "b", "Lk34/o$a;", "Lk34/o$b;", "Lk34/o$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: k34.o$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lk34/o$a;", "Lk34/o;", "Lrq0/b;", "documentType", "<init>", "(Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b;", "a", "()Lrq0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentAdded extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        public DocumentAdded(rq0.b bVar) {
            super(bVar, null);
            this.documentType = bVar;
        }

        @Override // k34.o
        /* JADX INFO: renamed from: a, reason: from getter */
        public rq0.b getDocumentType() {
            return this.documentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DocumentAdded) && fr.t.c(this.documentType, ((DocumentAdded) other).documentType);
        }

        public int hashCode() {
            return this.documentType.hashCode();
        }

        public String toString() {
            return "DocumentAdded(documentType=" + this.documentType + ")";
        }
    }

    /* JADX INFO: renamed from: k34.o$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lk34/o$b;", "Lk34/o;", "Lrq0/b;", "documentType", "<init>", "(Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b;", "a", "()Lrq0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentRemoved extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        public DocumentRemoved(rq0.b bVar) {
            super(bVar, null);
            this.documentType = bVar;
        }

        @Override // k34.o
        /* JADX INFO: renamed from: a, reason: from getter */
        public rq0.b getDocumentType() {
            return this.documentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DocumentRemoved) && fr.t.c(this.documentType, ((DocumentRemoved) other).documentType);
        }

        public int hashCode() {
            return this.documentType.hashCode();
        }

        public String toString() {
            return "DocumentRemoved(documentType=" + this.documentType + ")";
        }
    }

    /* JADX INFO: renamed from: k34.o$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lk34/o$c;", "Lk34/o;", "Lrq0/b;", "documentType", "<init>", "(Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b;", "a", "()Lrq0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatusChange extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        public StatusChange(rq0.b bVar) {
            super(bVar, null);
            this.documentType = bVar;
        }

        @Override // k34.o
        /* JADX INFO: renamed from: a, reason: from getter */
        public rq0.b getDocumentType() {
            return this.documentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusChange) && fr.t.c(this.documentType, ((StatusChange) other).documentType);
        }

        public int hashCode() {
            return this.documentType.hashCode();
        }

        public String toString() {
            return "StatusChange(documentType=" + this.documentType + ")";
        }
    }

    public /* synthetic */ o(rq0.b bVar, fr.k kVar) {
        this(bVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public rq0.b getDocumentType() {
        return this.documentType;
    }

    private o(rq0.b bVar) {
        this.documentType = bVar;
    }
}

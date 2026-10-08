package sv0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lsv0/n;", "", "a", "b", "d", "e", "c", "Lsv0/n$a;", "Lsv0/n$b;", "Lsv0/n$c;", "Lsv0/n$d;", "Lsv0/n$e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n {

    /* JADX INFO: renamed from: sv0.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsv0/n$a;", "Lsv0/n;", "Lsv0/y;", "processId", "<init>", "(Lsv0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "()Lsv0/y;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmedByAll implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        public ConfirmedByAll(ProcessId processId) {
            this.processId = processId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfirmedByAll) && fr.t.c(this.processId, ((ConfirmedByAll) other).processId);
        }

        public int hashCode() {
            return this.processId.hashCode();
        }

        public String toString() {
            return "ConfirmedByAll(processId=" + this.processId + ")";
        }
    }

    /* JADX INFO: renamed from: sv0.n$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsv0/n$b;", "Lsv0/n;", "Lsv0/y;", "processId", "<init>", "(Lsv0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "getProcessId", "()Lsv0/y;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmedByMe implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        public ConfirmedByMe(ProcessId processId) {
            this.processId = processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfirmedByMe) && fr.t.c(this.processId, ((ConfirmedByMe) other).processId);
        }

        public int hashCode() {
            return this.processId.hashCode();
        }

        public String toString() {
            return "ConfirmedByMe(processId=" + this.processId + ")";
        }
    }

    /* JADX INFO: renamed from: sv0.n$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsv0/n$c;", "Lsv0/n;", "Lsv0/y;", "processId", "Ldx/b;", "error", "<init>", "(Lsv0/y;Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "b", "()Lsv0/y;", "Ldx/b;", "()Ldx/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b error;

        public Error(ProcessId processId, dx.b bVar) {
            this.processId = processId;
            this.error = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.processId, error.processId) && fr.t.c(this.error, error.error);
        }

        public int hashCode() {
            return (this.processId.hashCode() * 31) + this.error.hashCode();
        }

        public String toString() {
            return "Error(processId=" + this.processId + ", error=" + this.error + ")";
        }
    }

    /* JADX INFO: renamed from: sv0.n$d, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsv0/n$d;", "Lsv0/n;", "Lsv0/y;", "processId", "Lsv0/a0;", "rejectedReason", "<init>", "(Lsv0/y;Lsv0/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "()Lsv0/y;", "b", "Lsv0/a0;", "()Lsv0/a0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RejectedByMe implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final a0 rejectedReason;

        public RejectedByMe(ProcessId processId, a0 a0Var) {
            this.processId = processId;
            this.rejectedReason = a0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public ProcessId getProcessId() {
            return this.processId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a0 getRejectedReason() {
            return this.rejectedReason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RejectedByMe)) {
                return false;
            }
            RejectedByMe rejectedByMe = (RejectedByMe) other;
            return fr.t.c(this.processId, rejectedByMe.processId) && this.rejectedReason == rejectedByMe.rejectedReason;
        }

        public int hashCode() {
            return (this.processId.hashCode() * 31) + this.rejectedReason.hashCode();
        }

        public String toString() {
            return "RejectedByMe(processId=" + this.processId + ", rejectedReason=" + this.rejectedReason + ")";
        }
    }

    /* JADX INFO: renamed from: sv0.n$e, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsv0/n$e;", "Lsv0/n;", "Lsv0/y;", "processId", "Lsv0/a0;", "rejectedReason", "<init>", "(Lsv0/y;Lsv0/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "()Lsv0/y;", "b", "Lsv0/a0;", "()Lsv0/a0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RejectedByOtherSide implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final a0 rejectedReason;

        public RejectedByOtherSide(ProcessId processId, a0 a0Var) {
            this.processId = processId;
            this.rejectedReason = a0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public ProcessId getProcessId() {
            return this.processId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a0 getRejectedReason() {
            return this.rejectedReason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RejectedByOtherSide)) {
                return false;
            }
            RejectedByOtherSide rejectedByOtherSide = (RejectedByOtherSide) other;
            return fr.t.c(this.processId, rejectedByOtherSide.processId) && this.rejectedReason == rejectedByOtherSide.rejectedReason;
        }

        public int hashCode() {
            return (this.processId.hashCode() * 31) + this.rejectedReason.hashCode();
        }

        public String toString() {
            return "RejectedByOtherSide(processId=" + this.processId + ", rejectedReason=" + this.rejectedReason + ")";
        }
    }
}

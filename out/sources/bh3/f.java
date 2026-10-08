package bh3;

import p071kotlin.Metadata;
import sv0.ProcessId;
import sv0.StatementReady;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lbh3/f;", "", "Lsv0/y;", "e", "()Lsv0/y;", "processId", "b", "a", "Lbh3/f$a;", "Lbh3/f$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: bh3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lbh3/f$a;", "Lbh3/f;", "Lsv0/y;", "processId", "<init>", "(Lsv0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "e", "()Lsv0/y;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FromExpiredTokenError implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        public FromExpiredTokenError(ProcessId processId) {
            this.processId = processId;
        }

        @Override // bh3.f
        /* JADX INFO: renamed from: e, reason: from getter */
        public ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FromExpiredTokenError) && fr.t.c(this.processId, ((FromExpiredTokenError) other).processId);
        }

        public int hashCode() {
            return this.processId.hashCode();
        }

        public String toString() {
            return "FromExpiredTokenError(processId=" + this.processId + ')';
        }
    }

    /* JADX INFO: renamed from: bh3.f$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lbh3/f$b;", "Lbh3/f;", "Lsv0/y;", "processId", "Lsv0/g0;", "statementReady", "<init>", "(Lsv0/y;Lsv0/g0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "e", "()Lsv0/y;", "b", "Lsv0/g0;", "()Lsv0/g0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FromStatus implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatementReady statementReady;

        public FromStatus(ProcessId processId, StatementReady statementReady) {
            this.processId = processId;
            this.statementReady = statementReady;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StatementReady getStatementReady() {
            return this.statementReady;
        }

        @Override // bh3.f
        /* JADX INFO: renamed from: e, reason: from getter */
        public ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FromStatus)) {
                return false;
            }
            FromStatus fromStatus = (FromStatus) other;
            return fr.t.c(this.processId, fromStatus.processId) && fr.t.c(this.statementReady, fromStatus.statementReady);
        }

        public int hashCode() {
            return (this.processId.hashCode() * 31) + this.statementReady.hashCode();
        }

        public String toString() {
            return "FromStatus(processId=" + this.processId + ", statementReady=" + this.statementReady + ')';
        }
    }

    /* JADX INFO: renamed from: e */
    ProcessId getProcessId();
}

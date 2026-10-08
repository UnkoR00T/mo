package aw0;

import p071kotlin.Metadata;
import sv0.ProcessId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Law0/y;", "", "Law0/y$a;", "Lsv0/e;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface y extends gz.b {

    /* JADX INFO: renamed from: aw0.y$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Law0/y$a;", "Lgz/b$a;", "Liy/b0;", "registrationNumber", "vin", "Lsv0/y;", "processId", "<init>", "(Liy/b0;Liy/b0;Lsv0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "c", "Lsv0/y;", "()Lsv0/y;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 registrationNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 vin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        public Params(iy.b0 b0Var, iy.b0 b0Var2, ProcessId processId) {
            this.registrationNumber = b0Var;
            this.vin = b0Var2;
            this.processId = processId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ProcessId getProcessId() {
            return this.processId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final iy.b0 getRegistrationNumber() {
            return this.registrationNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final iy.b0 getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.registrationNumber, params.registrationNumber) && fr.t.c(this.vin, params.vin) && fr.t.c(this.processId, params.processId);
        }

        public int hashCode() {
            return (((this.registrationNumber.hashCode() * 31) + this.vin.hashCode()) * 31) + this.processId.hashCode();
        }

        public String toString() {
            return "Params(registrationNumber=" + this.registrationNumber + ", vin=" + this.vin + ", processId=" + this.processId + ")";
        }
    }
}

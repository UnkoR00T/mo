package eo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Leo0/k;", "", "Leo0/k$a;", "access", "<init>", "(Leo0/k$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/k$a;", "()Leo0/k$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CentralTokens {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Access access;

    /* JADX INFO: renamed from: eo0.k$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Leo0/k$a;", "", "", "value", "", "expirationTimeInSeconds", "<init>", "(Ljava/lang/String;J)V", "a", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "J", "()J", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Access {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long expirationTimeInSeconds;

        public Access(String str, long j15) {
            this.value = str;
            this.expirationTimeInSeconds = j15;
        }

        public final String a() {
            return "Bearer " + this.value;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getExpirationTimeInSeconds() {
            return this.expirationTimeInSeconds;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Access)) {
                return false;
            }
            Access access = (Access) other;
            return fr.t.c(this.value, access.value) && this.expirationTimeInSeconds == access.expirationTimeInSeconds;
        }

        public int hashCode() {
            return (this.value.hashCode() * 31) + Long.hashCode(this.expirationTimeInSeconds);
        }

        public String toString() {
            return "Access(value=" + this.value + ", expirationTimeInSeconds=" + this.expirationTimeInSeconds + ")";
        }
    }

    public CentralTokens(Access access) {
        this.access = access;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Access getAccess() {
        return this.access;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CentralTokens) && fr.t.c(this.access, ((CentralTokens) other).access);
    }

    public int hashCode() {
        return this.access.hashCode();
    }

    public String toString() {
        return "CentralTokens(access=" + this.access + ")";
    }
}

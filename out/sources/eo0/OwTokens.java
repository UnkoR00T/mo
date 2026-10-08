package eo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.i0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0014\u0018\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Leo0/i0;", "", "Leo0/i0$c;", "refresh", "Leo0/i0$a;", "access", "<init>", "(Leo0/i0$c;Leo0/i0$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/i0$c;", "b", "()Leo0/i0$c;", "Leo0/i0$a;", "()Leo0/i0$a;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OwTokens {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Refresh refresh;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Access access;

    /* JADX INFO: renamed from: eo0.i0$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Leo0/i0$a;", "Leo0/i0$b;", "", "value", "", "expirationTime", "<init>", "(Ljava/lang/String;J)V", "b", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "J", "()J", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Access implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long expirationTime;

        public Access(String str, long j15) {
            this.value = str;
            this.expirationTime = j15;
        }

        @Override // eo0.OwTokens.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getExpirationTime() {
            return this.expirationTime;
        }

        public final String b() {
            return "Bearer " + getValue();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getValue() {
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
            return fr.t.c(this.value, access.value) && this.expirationTime == access.expirationTime;
        }

        public int hashCode() {
            return (this.value.hashCode() * 31) + Long.hashCode(this.expirationTime);
        }

        public String toString() {
            return "Access(value=" + this.value + ", expirationTime=" + this.expirationTime + ")";
        }
    }

    /* JADX INFO: renamed from: eo0.i0$b */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Leo0/i0$b;", "", "", "a", "()J", "expirationTime", "Leo0/i0$a;", "Leo0/i0$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        long getExpirationTime();
    }

    /* JADX INFO: renamed from: eo0.i0$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Leo0/i0$c;", "Leo0/i0$b;", "", "value", "", "expirationTime", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Refresh implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long expirationTime;

        public Refresh(String str, long j15) {
            this.value = str;
            this.expirationTime = j15;
        }

        @Override // eo0.OwTokens.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getExpirationTime() {
            return this.expirationTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Refresh)) {
                return false;
            }
            Refresh refresh = (Refresh) other;
            return fr.t.c(this.value, refresh.value) && this.expirationTime == refresh.expirationTime;
        }

        public int hashCode() {
            return (this.value.hashCode() * 31) + Long.hashCode(this.expirationTime);
        }

        public String toString() {
            return "Refresh(value=" + this.value + ", expirationTime=" + this.expirationTime + ")";
        }
    }

    public OwTokens(Refresh refresh, Access access) {
        this.refresh = refresh;
        this.access = access;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Access getAccess() {
        return this.access;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Refresh getRefresh() {
        return this.refresh;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwTokens)) {
            return false;
        }
        OwTokens owTokens = (OwTokens) other;
        return fr.t.c(this.refresh, owTokens.refresh) && fr.t.c(this.access, owTokens.access);
    }

    public int hashCode() {
        return (this.refresh.hashCode() * 31) + this.access.hashCode();
    }

    public String toString() {
        return "OwTokens(refresh=" + this.refresh + ", access=" + this.access + ")";
    }
}

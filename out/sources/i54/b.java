package i54;

import fr.t;
import java.time.Instant;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Li54/b;", "", "Ljava/time/Instant;", "a", "()Ljava/time/Instant;", "expiration", "c", "b", "Li54/b$a;", "Li54/b$b;", "Li54/b$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: i54.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Li54/b$a;", "Li54/b;", "", "value", "Ljava/time/Instant;", "expiration", "<init>", "(Ljava/lang/String;Ljava/time/Instant;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/Instant;", "()Ljava/time/Instant;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Access implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Instant expiration;

        public Access(String str, Instant instant) {
            this.value = str;
            this.expiration = instant;
        }

        @Override // i54.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Instant getExpiration() {
            return this.expiration;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return t.c(this.value, access.value) && t.c(this.expiration, access.expiration);
        }

        public int hashCode() {
            return (this.value.hashCode() * 31) + this.expiration.hashCode();
        }

        public String toString() {
            return "Access(value=" + this.value + ", expiration=" + this.expiration + ")";
        }
    }

    /* JADX INFO: renamed from: i54.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Li54/b$b;", "Li54/b;", "", "value", "Ljava/time/Instant;", "expiration", "<init>", "(Ljava/lang/String;Ljava/time/Instant;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/Instant;", "()Ljava/time/Instant;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CentralAccess implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Instant expiration;

        public CentralAccess(String str, Instant instant) {
            this.value = str;
            this.expiration = instant;
        }

        @Override // i54.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Instant getExpiration() {
            return this.expiration;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CentralAccess)) {
                return false;
            }
            CentralAccess centralAccess = (CentralAccess) other;
            return t.c(this.value, centralAccess.value) && t.c(this.expiration, centralAccess.expiration);
        }

        public int hashCode() {
            return (this.value.hashCode() * 31) + this.expiration.hashCode();
        }

        public String toString() {
            return "CentralAccess(value=" + this.value + ", expiration=" + this.expiration + ")";
        }
    }

    /* JADX INFO: renamed from: i54.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Li54/b$c;", "Li54/b;", "", "refreshOwTokenUrl", "value", "Ljava/time/Instant;", "expiration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/time/Instant;", "()Ljava/time/Instant;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Refresh implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String refreshOwTokenUrl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Instant expiration;

        public Refresh(String str, String str2, Instant instant) {
            this.refreshOwTokenUrl = str;
            this.value = str2;
            this.expiration = instant;
        }

        @Override // i54.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Instant getExpiration() {
            return this.expiration;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRefreshOwTokenUrl() {
            return this.refreshOwTokenUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.refreshOwTokenUrl, refresh.refreshOwTokenUrl) && t.c(this.value, refresh.value) && t.c(this.expiration, refresh.expiration);
        }

        public int hashCode() {
            return (((this.refreshOwTokenUrl.hashCode() * 31) + this.value.hashCode()) * 31) + this.expiration.hashCode();
        }

        public String toString() {
            return "Refresh(refreshOwTokenUrl=" + this.refreshOwTokenUrl + ", value=" + this.value + ", expiration=" + this.expiration + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    Instant getExpiration();
}

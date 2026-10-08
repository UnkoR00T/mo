package kr0;

import fr.t;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lkr0/d;", "", "Lkr0/d$a;", "Ler0/b;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends gz.b {

    /* JADX INFO: renamed from: kr0.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lkr0/d$a;", "Lgz/b$a;", "", "", "documentIds", "serialNumbers", "vehicleIds", "", "hasVehiclesWithoutId", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "c", "d", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> documentIds;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> serialNumbers;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> vehicleIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasVehiclesWithoutId;

        public Params(Set<String> set, Set<String> set2, Set<String> set3, boolean z15) {
            this.documentIds = set;
            this.serialNumbers = set2;
            this.vehicleIds = set3;
            this.hasVehiclesWithoutId = z15;
        }

        public final Set<String> a() {
            return this.documentIds;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasVehiclesWithoutId() {
            return this.hasVehiclesWithoutId;
        }

        public final Set<String> c() {
            return this.serialNumbers;
        }

        public final Set<String> d() {
            return this.vehicleIds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.documentIds, params.documentIds) && t.c(this.serialNumbers, params.serialNumbers) && t.c(this.vehicleIds, params.vehicleIds) && this.hasVehiclesWithoutId == params.hasVehiclesWithoutId;
        }

        public int hashCode() {
            return (((((this.documentIds.hashCode() * 31) + this.serialNumbers.hashCode()) * 31) + this.vehicleIds.hashCode()) * 31) + Boolean.hashCode(this.hasVehiclesWithoutId);
        }

        public String toString() {
            return "Params(documentIds=" + this.documentIds + ", serialNumbers=" + this.serialNumbers + ", vehicleIds=" + this.vehicleIds + ", hasVehiclesWithoutId=" + this.hasVehiclesWithoutId + ")";
        }
    }
}

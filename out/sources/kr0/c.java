package kr0;

import er0.BEDocumentStatus;
import fr.t;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lkr0/c;", "", "Lkr0/c$a;", "Lkr0/c$b;", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends gz.b {

    /* JADX INFO: renamed from: kr0.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, d2 = {"Lkr0/c$a;", "Lgz/b$a;", "", "Lrq0/b;", "", "", "documentIds", "serialNumbers", "", "vehicleIds", "", "hasVehiclesWithoutId", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "c", "Ljava/util/Set;", "d", "()Ljava/util/Set;", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<rq0.b, List<String>> documentIds;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<rq0.b, String> serialNumbers;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> vehicleIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasVehiclesWithoutId;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(Map<rq0.b, ? extends List<String>> map, Map<rq0.b, String> map2, Set<String> set, boolean z15) {
            this.documentIds = map;
            this.serialNumbers = map2;
            this.vehicleIds = set;
            this.hasVehiclesWithoutId = z15;
        }

        public final Map<rq0.b, List<String>> a() {
            return this.documentIds;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasVehiclesWithoutId() {
            return this.hasVehiclesWithoutId;
        }

        public final Map<rq0.b, String> c() {
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

    /* JADX INFO: renamed from: kr0.c$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkr0/c$b;", "", "", "updateVehicleCardsRequired", "", "Lrq0/b;", "", "Ler0/c;", "documentsStatuses", "<init>", "(ZLjava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/util/Map;", "()Ljava/util/Map;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean updateVehicleCardsRequired;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<rq0.b, List<BEDocumentStatus>> documentsStatuses;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(boolean z15, Map<rq0.b, ? extends List<BEDocumentStatus>> map) {
            this.updateVehicleCardsRequired = z15;
            this.documentsStatuses = map;
        }

        public final Map<rq0.b, List<BEDocumentStatus>> a() {
            return this.documentsStatuses;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getUpdateVehicleCardsRequired() {
            return this.updateVehicleCardsRequired;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.updateVehicleCardsRequired == result.updateVehicleCardsRequired && t.c(this.documentsStatuses, result.documentsStatuses);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.updateVehicleCardsRequired) * 31) + this.documentsStatuses.hashCode();
        }

        public String toString() {
            return "Result(updateVehicleCardsRequired=" + this.updateVehicleCardsRequired + ", documentsStatuses=" + this.documentsStatuses + ")";
        }
    }
}

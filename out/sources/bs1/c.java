package bs1;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import vy.Address;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lbs1/c;", "Ll00/e;", "Lbs1/c$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: bs1.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lbs1/c$a;", "", "Lv50/c;", "search", "distance", "", "Lvy/a;", "list", "<init>", "(Lv50/c;Lv50/c;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv50/c;", "c", "()Lv50/c;", "b", "Ljava/util/List;", "()Ljava/util/List;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c search;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c distance;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Address> list;

        public Data(v50.c cVar, v50.c cVar2, List<Address> list) {
            this.search = cVar;
            this.distance = cVar2;
            this.list = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final v50.c getDistance() {
            return this.distance;
        }

        public final List<Address> b() {
            return this.list;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final v50.c getSearch() {
            return this.search;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.search, data.search) && t.c(this.distance, data.distance) && t.c(this.list, data.list);
        }

        public int hashCode() {
            return (((this.search.hashCode() * 31) + this.distance.hashCode()) * 31) + this.list.hashCode();
        }

        public String toString() {
            return "Data(search=" + this.search + ", distance=" + this.distance + ", list=" + this.list + ')';
        }
    }
}

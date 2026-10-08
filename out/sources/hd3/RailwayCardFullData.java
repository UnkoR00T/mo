package hd3;

import fr.t;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hd3.f, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lhd3/f;", "", "", "parentId", "", "Lhd3/e;", "documentsData", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/util/Map;)Lhd3/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RailwayCardFullData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, RailwayCardData> documentsData;

    public RailwayCardFullData(String str, Map<String, RailwayCardData> map) {
        this.parentId = str;
        this.documentsData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RailwayCardFullData b(RailwayCardFullData railwayCardFullData, String str, Map map, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = railwayCardFullData.parentId;
        }
        if ((i15 & 2) != 0) {
            map = railwayCardFullData.documentsData;
        }
        return railwayCardFullData.a(str, map);
    }

    public final RailwayCardFullData a(String parentId, Map<String, RailwayCardData> documentsData) {
        return new RailwayCardFullData(parentId, documentsData);
    }

    public final Map<String, RailwayCardData> c() {
        return this.documentsData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayCardFullData)) {
            return false;
        }
        RailwayCardFullData railwayCardFullData = (RailwayCardFullData) other;
        return t.c(this.parentId, railwayCardFullData.parentId) && t.c(this.documentsData, railwayCardFullData.documentsData);
    }

    public int hashCode() {
        String str = this.parentId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.documentsData.hashCode();
    }

    public String toString() {
        return "RailwayCardFullData(parentId=" + this.parentId + ", documentsData=" + this.documentsData + ')';
    }
}

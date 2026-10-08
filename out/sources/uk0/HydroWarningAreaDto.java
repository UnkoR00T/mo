package uk0;

import fr.k;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: uk0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Luk0/a;", "", "", "level", "", "Luk0/d;", "multipolygons", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/util/List;", "()Ljava/util/List;", "disasteralertservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HydroWarningAreaDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("level")
    private final Integer level;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("multipolygons")
    private final List<HydroWarningMultiPolygonDto> multipolygons;

    /* JADX WARN: Multi-variable type inference failed */
    public HydroWarningAreaDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    public final List<HydroWarningMultiPolygonDto> b() {
        return this.multipolygons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HydroWarningAreaDto)) {
            return false;
        }
        HydroWarningAreaDto hydroWarningAreaDto = (HydroWarningAreaDto) other;
        return t.c(this.level, hydroWarningAreaDto.level) && t.c(this.multipolygons, hydroWarningAreaDto.multipolygons);
    }

    public int hashCode() {
        Integer num = this.level;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<HydroWarningMultiPolygonDto> list = this.multipolygons;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "HydroWarningAreaDto(level=" + this.level + ", multipolygons=" + this.multipolygons + ')';
    }

    public HydroWarningAreaDto(Integer num, List<HydroWarningMultiPolygonDto> list) {
        this.level = num;
        this.multipolygons = list;
    }

    public /* synthetic */ HydroWarningAreaDto(Integer num, List list, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : num, (i15 & 2) != 0 ? null : list);
    }
}

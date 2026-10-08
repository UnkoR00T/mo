package or0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: or0.s, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lor0/s;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lor0/s0;", "a", "Ljava/util/List;", "()Ljava/util/List;", "descriptions", "b", "titles", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentMaintenanceBreakDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("descriptions")
    private final List<LabelDto> descriptions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("titles")
    private final List<LabelDto> titles;

    public final List<LabelDto> a() {
        return this.descriptions;
    }

    public final List<LabelDto> b() {
        return this.titles;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentMaintenanceBreakDtoDto)) {
            return false;
        }
        DocumentMaintenanceBreakDtoDto documentMaintenanceBreakDtoDto = (DocumentMaintenanceBreakDtoDto) other;
        return fr.t.c(this.descriptions, documentMaintenanceBreakDtoDto.descriptions) && fr.t.c(this.titles, documentMaintenanceBreakDtoDto.titles);
    }

    public int hashCode() {
        return (this.descriptions.hashCode() * 31) + this.titles.hashCode();
    }

    public String toString() {
        return "DocumentMaintenanceBreakDtoDto(descriptions=" + this.descriptions + ", titles=" + this.titles + ')';
    }
}

package oh0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oh0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Loh0/i;", "", "", "", "points", "widgetPointId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getWidgetPointId", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SaveFavouritePointsRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("points")
    private final List<String> points;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("widgetPointId")
    private final String widgetPointId;

    public SaveFavouritePointsRequest(List<String> list, String str) {
        this.points = list;
        this.widgetPointId = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveFavouritePointsRequest)) {
            return false;
        }
        SaveFavouritePointsRequest saveFavouritePointsRequest = (SaveFavouritePointsRequest) other;
        return t.c(this.points, saveFavouritePointsRequest.points) && t.c(this.widgetPointId, saveFavouritePointsRequest.widgetPointId);
    }

    public int hashCode() {
        int iHashCode = this.points.hashCode() * 31;
        String str = this.widgetPointId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SaveFavouritePointsRequest(points=" + this.points + ", widgetPointId=" + this.widgetPointId + ')';
    }

    public /* synthetic */ SaveFavouritePointsRequest(List list, String str, int i15, fr.k kVar) {
        this(list, (i15 & 2) != 0 ? null : str);
    }
}

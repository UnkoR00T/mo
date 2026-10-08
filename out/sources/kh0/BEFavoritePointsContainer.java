package kh0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: kh0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001e"}, d2 = {"Lkh0/h;", "", "", "Lkh0/g;", "favoritePointsList", "", "widgetPointId", "", "favouritePointsLimitReached", "Lkh0/a;", "smogRateDictionaries", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "d", "c", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEFavoritePointsContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEFavoriteMeasurementPoint> favoritePointsList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String widgetPointId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean favouritePointsLimitReached;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEAirQualityRateDictionary> smogRateDictionaries;

    public BEFavoritePointsContainer(List<BEFavoriteMeasurementPoint> list, String str, boolean z15, List<BEAirQualityRateDictionary> list2) {
        this.favoritePointsList = list;
        this.widgetPointId = str;
        this.favouritePointsLimitReached = z15;
        this.smogRateDictionaries = list2;
    }

    public final List<BEFavoriteMeasurementPoint> a() {
        return this.favoritePointsList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFavouritePointsLimitReached() {
        return this.favouritePointsLimitReached;
    }

    public final List<BEAirQualityRateDictionary> c() {
        return this.smogRateDictionaries;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getWidgetPointId() {
        return this.widgetPointId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEFavoritePointsContainer)) {
            return false;
        }
        BEFavoritePointsContainer bEFavoritePointsContainer = (BEFavoritePointsContainer) other;
        return t.c(this.favoritePointsList, bEFavoritePointsContainer.favoritePointsList) && t.c(this.widgetPointId, bEFavoritePointsContainer.widgetPointId) && this.favouritePointsLimitReached == bEFavoritePointsContainer.favouritePointsLimitReached && t.c(this.smogRateDictionaries, bEFavoritePointsContainer.smogRateDictionaries);
    }

    public int hashCode() {
        int iHashCode = this.favoritePointsList.hashCode() * 31;
        String str = this.widgetPointId;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.favouritePointsLimitReached)) * 31) + this.smogRateDictionaries.hashCode();
    }

    public String toString() {
        return "BEFavoritePointsContainer(favoritePointsList=" + this.favoritePointsList + ", widgetPointId=" + this.widgetPointId + ", favouritePointsLimitReached=" + this.favouritePointsLimitReached + ", smogRateDictionaries=" + this.smogRateDictionaries + ")";
    }
}

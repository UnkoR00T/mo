package et0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: et0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Let0/h;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Let0/g;", "a", "Let0/g;", "()Let0/g;", "placeDetails", "places_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceDetailsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("placeDetails")
    private final PlaceDetailsDto placeDetails;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PlaceDetailsDto getPlaceDetails() {
        return this.placeDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlaceDetailsResponse) && t.c(this.placeDetails, ((PlaceDetailsResponse) other).placeDetails);
    }

    public int hashCode() {
        return this.placeDetails.hashCode();
    }

    public String toString() {
        return "PlaceDetailsResponse(placeDetails=" + this.placeDetails + ')';
    }
}

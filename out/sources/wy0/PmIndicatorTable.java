package wy0;

import fr.t;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wy0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lwy0/d;", "", "Lmx/a;", "ratingHeaderLabel", "airQualityHeaderLabel", "", "Lwy0/a;", "listOfRatings", "<init>", "(Lmx/a;Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PmIndicatorTable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label ratingHeaderLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label airQualityHeaderLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AirQualityRating> listOfRatings;

    public PmIndicatorTable(Label label, Label label2, List<AirQualityRating> list) {
        this.ratingHeaderLabel = label;
        this.airQualityHeaderLabel = label2;
        this.listOfRatings = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getAirQualityHeaderLabel() {
        return this.airQualityHeaderLabel;
    }

    public final List<AirQualityRating> b() {
        return this.listOfRatings;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getRatingHeaderLabel() {
        return this.ratingHeaderLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PmIndicatorTable)) {
            return false;
        }
        PmIndicatorTable pmIndicatorTable = (PmIndicatorTable) other;
        return t.c(this.ratingHeaderLabel, pmIndicatorTable.ratingHeaderLabel) && t.c(this.airQualityHeaderLabel, pmIndicatorTable.airQualityHeaderLabel) && t.c(this.listOfRatings, pmIndicatorTable.listOfRatings);
    }

    public int hashCode() {
        return (((this.ratingHeaderLabel.hashCode() * 31) + this.airQualityHeaderLabel.hashCode()) * 31) + this.listOfRatings.hashCode();
    }

    public String toString() {
        return "PmIndicatorTable(ratingHeaderLabel=" + this.ratingHeaderLabel + ", airQualityHeaderLabel=" + this.airQualityHeaderLabel + ", listOfRatings=" + this.listOfRatings + ')';
    }
}

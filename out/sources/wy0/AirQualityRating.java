package wy0;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wy0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwy0/a;", "", "Ld40/b;", "iconData", "Lmx/a;", "ratingLabel", "airQualityLabel", "<init>", "(Ld40/b;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld40/b;", "b", "()Ld40/b;", "Lmx/a;", "c", "()Lmx/a;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirQualityRating {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f215881d = d40.b.f39676g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d40.b iconData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label ratingLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label airQualityLabel;

    public AirQualityRating(d40.b bVar, Label label, Label label2) {
        this.iconData = bVar;
        this.ratingLabel = label;
        this.airQualityLabel = label2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getAirQualityLabel() {
        return this.airQualityLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d40.b getIconData() {
        return this.iconData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getRatingLabel() {
        return this.ratingLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirQualityRating)) {
            return false;
        }
        AirQualityRating airQualityRating = (AirQualityRating) other;
        return t.c(this.iconData, airQualityRating.iconData) && t.c(this.ratingLabel, airQualityRating.ratingLabel) && t.c(this.airQualityLabel, airQualityRating.airQualityLabel);
    }

    public int hashCode() {
        return (((this.iconData.hashCode() * 31) + this.ratingLabel.hashCode()) * 31) + this.airQualityLabel.hashCode();
    }

    public String toString() {
        return "AirQualityRating(iconData=" + this.iconData + ", ratingLabel=" + this.ratingLabel + ", airQualityLabel=" + this.airQualityLabel + ')';
    }
}

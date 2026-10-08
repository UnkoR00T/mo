package cs3;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cs3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcs3/a;", "", "", "isVisible", "Lmx/a;", "day", "date", "freeTermsNumber", "<init>", "(ZLmx/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Lmx/a;", "()Lmx/a;", "c", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CarouselSegmentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVisible;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label day;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label date;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label freeTermsNumber;

    public CarouselSegmentData(boolean z15, Label label, Label label2, Label label3) {
        this.isVisible = z15;
        this.day = label;
        this.date = label2;
        this.freeTermsNumber = label3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getFreeTermsNumber() {
        return this.freeTermsNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselSegmentData)) {
            return false;
        }
        CarouselSegmentData carouselSegmentData = (CarouselSegmentData) other;
        return this.isVisible == carouselSegmentData.isVisible && t.c(this.day, carouselSegmentData.day) && t.c(this.date, carouselSegmentData.date) && t.c(this.freeTermsNumber, carouselSegmentData.freeTermsNumber);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isVisible) * 31) + this.day.hashCode()) * 31) + this.date.hashCode()) * 31) + this.freeTermsNumber.hashCode();
    }

    public String toString() {
        return "CarouselSegmentData(isVisible=" + this.isVisible + ", day=" + this.day + ", date=" + this.date + ", freeTermsNumber=" + this.freeTermsNumber + ')';
    }
}

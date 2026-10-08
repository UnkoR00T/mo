package ry;

import fr.t;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ry.m, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lry/m;", "", "Ljava/util/Date;", "start", "consumptionEnd", "originationEnd", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "getStart", "()Ljava/util/Date;", "b", "getConsumptionEnd", "c", "getOriginationEnd", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KeyValidity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date consumptionEnd;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date originationEnd;

    public KeyValidity(Date date, Date date2, Date date3) {
        this.start = date;
        this.consumptionEnd = date2;
        this.originationEnd = date3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyValidity)) {
            return false;
        }
        KeyValidity keyValidity = (KeyValidity) other;
        return t.c(this.start, keyValidity.start) && t.c(this.consumptionEnd, keyValidity.consumptionEnd) && t.c(this.originationEnd, keyValidity.originationEnd);
    }

    public int hashCode() {
        Date date = this.start;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.consumptionEnd;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.originationEnd;
        return iHashCode2 + (date3 != null ? date3.hashCode() : 0);
    }

    public String toString() {
        return "KeyValidity(start=" + this.start + ", consumptionEnd=" + this.consumptionEnd + ", originationEnd=" + this.originationEnd + ")";
    }
}

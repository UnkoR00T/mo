package zi0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zi0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lzi0/b;", "", "", "Lzi0/a;", "addressPoints", "", "exactMatch", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InternetAddressPoints {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<InternetAddressPoint> addressPoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean exactMatch;

    public InternetAddressPoints(List<InternetAddressPoint> list, boolean z15) {
        this.addressPoints = list;
        this.exactMatch = z15;
    }

    public final List<InternetAddressPoint> a() {
        return this.addressPoints;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getExactMatch() {
        return this.exactMatch;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetAddressPoints)) {
            return false;
        }
        InternetAddressPoints internetAddressPoints = (InternetAddressPoints) other;
        return t.c(this.addressPoints, internetAddressPoints.addressPoints) && this.exactMatch == internetAddressPoints.exactMatch;
    }

    public int hashCode() {
        return (this.addressPoints.hashCode() * 31) + Boolean.hashCode(this.exactMatch);
    }

    public String toString() {
        return "InternetAddressPoints(addressPoints=" + this.addressPoints + ", exactMatch=" + this.exactMatch + ")";
    }
}

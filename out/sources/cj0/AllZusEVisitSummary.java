package cj0;

import fr.t;
import iy.b0;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: renamed from: cj0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lcj0/c;", "", "Liy/b0;", "defaultPostcode", "", "bookingAvailable", "", "Ljava/time/LocalDate;", "", "Lcj0/j;", "booked", "finished", "<init>", "(Liy/b0;ZLjava/util/Map;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "Z", "()Z", "Ljava/util/Map;", "()Ljava/util/Map;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AllZusEVisitSummary {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 defaultPostcode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean bookingAvailable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<LocalDate, List<ZusEVisitGroupSummary>> booked;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<LocalDate, List<ZusEVisitGroupSummary>> finished;

    public AllZusEVisitSummary() {
        this(null, false, null, null, 15, null);
    }

    public final Map<LocalDate, List<ZusEVisitGroupSummary>> a() {
        return this.booked;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getBookingAvailable() {
        return this.bookingAvailable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getDefaultPostcode() {
        return this.defaultPostcode;
    }

    public final Map<LocalDate, List<ZusEVisitGroupSummary>> d() {
        return this.finished;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllZusEVisitSummary)) {
            return false;
        }
        AllZusEVisitSummary allZusEVisitSummary = (AllZusEVisitSummary) other;
        return t.c(this.defaultPostcode, allZusEVisitSummary.defaultPostcode) && this.bookingAvailable == allZusEVisitSummary.bookingAvailable && t.c(this.booked, allZusEVisitSummary.booked) && t.c(this.finished, allZusEVisitSummary.finished);
    }

    public int hashCode() {
        b0 b0Var = this.defaultPostcode;
        return ((((((b0Var == null ? 0 : b0Var.hashCode()) * 31) + Boolean.hashCode(this.bookingAvailable)) * 31) + this.booked.hashCode()) * 31) + this.finished.hashCode();
    }

    public String toString() {
        return "AllZusEVisitSummary(defaultPostcode=" + this.defaultPostcode + ", bookingAvailable=" + this.bookingAvailable + ", booked=" + this.booked + ", finished=" + this.finished + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AllZusEVisitSummary(b0 b0Var, boolean z15, Map<LocalDate, ? extends List<ZusEVisitGroupSummary>> map, Map<LocalDate, ? extends List<ZusEVisitGroupSummary>> map2) {
        this.defaultPostcode = b0Var;
        this.bookingAvailable = z15;
        this.booked = map;
        this.finished = map2;
    }

    public /* synthetic */ AllZusEVisitSummary(b0 b0Var, boolean z15, Map map, Map map2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : b0Var, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? v0.i() : map, (i15 & 8) != 0 ? v0.i() : map2);
    }
}

package nj0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u001b"}, d2 = {"Lnj0/c;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lnj0/t0;", "a", "Ljava/util/List;", "()Ljava/util/List;", "booked", "b", "Z", "()Z", "bookingAvailable", "c", "d", "finished", "Ljava/lang/String;", "defaultPostcode", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AllZusEVisitSummaryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("booked")
    private final List<ZusEVisitGroupSummaryDto> booked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("bookingAvailable")
    private final boolean bookingAvailable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("finished")
    private final List<ZusEVisitGroupSummaryDto> finished;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("defaultPostcode")
    private final String defaultPostcode;

    public final List<ZusEVisitGroupSummaryDto> a() {
        return this.booked;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getBookingAvailable() {
        return this.bookingAvailable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDefaultPostcode() {
        return this.defaultPostcode;
    }

    public final List<ZusEVisitGroupSummaryDto> d() {
        return this.finished;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllZusEVisitSummaryDto)) {
            return false;
        }
        AllZusEVisitSummaryDto allZusEVisitSummaryDto = (AllZusEVisitSummaryDto) other;
        return fr.t.c(this.booked, allZusEVisitSummaryDto.booked) && this.bookingAvailable == allZusEVisitSummaryDto.bookingAvailable && fr.t.c(this.finished, allZusEVisitSummaryDto.finished) && fr.t.c(this.defaultPostcode, allZusEVisitSummaryDto.defaultPostcode);
    }

    public int hashCode() {
        int iHashCode = ((((this.booked.hashCode() * 31) + Boolean.hashCode(this.bookingAvailable)) * 31) + this.finished.hashCode()) * 31;
        String str = this.defaultPostcode;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AllZusEVisitSummaryDto(booked=" + this.booked + ", bookingAvailable=" + this.bookingAvailable + ", finished=" + this.finished + ", defaultPostcode=" + this.defaultPostcode + ')';
    }
}

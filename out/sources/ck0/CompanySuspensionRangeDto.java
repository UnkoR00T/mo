package ck0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.z0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lck0/z0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "max", "b", "min", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public final /* data */ class CompanySuspensionRangeDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("max")
    private final LocalDate max;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("min")
    private final LocalDate min;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getMin() {
        return this.min;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanySuspensionRangeDto)) {
            return false;
        }
        CompanySuspensionRangeDto companySuspensionRangeDto = (CompanySuspensionRangeDto) other;
        return fr.t.c(this.max, companySuspensionRangeDto.max) && fr.t.c(this.min, companySuspensionRangeDto.min);
    }

    public int hashCode() {
        return (this.max.hashCode() * 31) + this.min.hashCode();
    }

    public String toString() {
        return "CompanySuspensionRangeDto(max=" + this.max + ", min=" + this.min + ')';
    }
}

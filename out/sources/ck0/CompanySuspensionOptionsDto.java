package ck0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.y0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001bR\"\u0010!\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u001b¨\u0006\""}, d2 = {"Lck0/y0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "actionBlocked", "Lck0/x0;", "b", "Lck0/x0;", "()Lck0/x0;", "availableAction", "c", "I", "d", "minSuspensionDays", "Lck0/z0;", "Lck0/z0;", "()Lck0/z0;", "getEndRange$annotations", "()V", "endRange", "e", "getStartRange$annotations", "startRange", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanySuspensionOptionsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("actionBlocked")
    private final boolean actionBlocked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("availableAction")
    private final x0 availableAction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("minSuspensionDays")
    private final int minSuspensionDays;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("endRange")
    private final CompanySuspensionRangeDto endRange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("startRange")
    private final CompanySuspensionRangeDto startRange;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getActionBlocked() {
        return this.actionBlocked;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final x0 getAvailableAction() {
        return this.availableAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CompanySuspensionRangeDto getEndRange() {
        return this.endRange;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMinSuspensionDays() {
        return this.minSuspensionDays;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final CompanySuspensionRangeDto getStartRange() {
        return this.startRange;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanySuspensionOptionsDto)) {
            return false;
        }
        CompanySuspensionOptionsDto companySuspensionOptionsDto = (CompanySuspensionOptionsDto) other;
        return this.actionBlocked == companySuspensionOptionsDto.actionBlocked && this.availableAction == companySuspensionOptionsDto.availableAction && this.minSuspensionDays == companySuspensionOptionsDto.minSuspensionDays && fr.t.c(this.endRange, companySuspensionOptionsDto.endRange) && fr.t.c(this.startRange, companySuspensionOptionsDto.startRange);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.actionBlocked) * 31) + this.availableAction.hashCode()) * 31) + Integer.hashCode(this.minSuspensionDays)) * 31;
        CompanySuspensionRangeDto companySuspensionRangeDto = this.endRange;
        int iHashCode2 = (iHashCode + (companySuspensionRangeDto == null ? 0 : companySuspensionRangeDto.hashCode())) * 31;
        CompanySuspensionRangeDto companySuspensionRangeDto2 = this.startRange;
        return iHashCode2 + (companySuspensionRangeDto2 != null ? companySuspensionRangeDto2.hashCode() : 0);
    }

    public String toString() {
        return "CompanySuspensionOptionsDto(actionBlocked=" + this.actionBlocked + ", availableAction=" + this.availableAction + ", minSuspensionDays=" + this.minSuspensionDays + ", endRange=" + this.endRange + ", startRange=" + this.startRange + ')';
    }
}

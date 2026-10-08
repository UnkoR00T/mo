package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.w1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgm0/w1;", "", "Lgm0/q;", "banksRestrictions", "Lgm0/u2;", "mobywatelRestriction", "<init>", "(Lgm0/q;Lgm0/u2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/q;", "()Lgm0/q;", "b", "Lgm0/u2;", "()Lgm0/u2;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentRestrictionsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("banksRestrictions")
    private final BanksRestrictionDto banksRestrictions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mobywatelRestriction")
    private final MObywatelRestrictionDto mobywatelRestriction;

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentRestrictionsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BanksRestrictionDto getBanksRestrictions() {
        return this.banksRestrictions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final MObywatelRestrictionDto getMobywatelRestriction() {
        return this.mobywatelRestriction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentRestrictionsDto)) {
            return false;
        }
        DocumentRestrictionsDto documentRestrictionsDto = (DocumentRestrictionsDto) other;
        return fr.t.c(this.banksRestrictions, documentRestrictionsDto.banksRestrictions) && fr.t.c(this.mobywatelRestriction, documentRestrictionsDto.mobywatelRestriction);
    }

    public int hashCode() {
        BanksRestrictionDto banksRestrictionDto = this.banksRestrictions;
        int iHashCode = (banksRestrictionDto == null ? 0 : banksRestrictionDto.hashCode()) * 31;
        MObywatelRestrictionDto mObywatelRestrictionDto = this.mobywatelRestriction;
        return iHashCode + (mObywatelRestrictionDto != null ? mObywatelRestrictionDto.hashCode() : 0);
    }

    public String toString() {
        return "DocumentRestrictionsDto(banksRestrictions=" + this.banksRestrictions + ", mobywatelRestriction=" + this.mobywatelRestriction + ')';
    }

    public DocumentRestrictionsDto(BanksRestrictionDto banksRestrictionDto, MObywatelRestrictionDto mObywatelRestrictionDto) {
        this.banksRestrictions = banksRestrictionDto;
        this.mobywatelRestriction = mObywatelRestrictionDto;
    }

    public /* synthetic */ DocumentRestrictionsDto(BanksRestrictionDto banksRestrictionDto, MObywatelRestrictionDto mObywatelRestrictionDto, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : banksRestrictionDto, (i15 & 2) != 0 ? null : mObywatelRestrictionDto);
    }
}

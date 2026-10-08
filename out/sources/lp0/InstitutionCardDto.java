package lp0;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.x, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u000f¨\u0006 "}, d2 = {"Llp0/x;", "", "", "scope", "institutionId", "cardId", "", "id", "name", "url", "purpose", "purposeName", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "c", "d", "Ljava/lang/String;", "e", "f", "h", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstitutionCardDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("scope")
    private final int scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionId")
    private final int institutionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cardId")
    private final int cardId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("url")
    private final String url;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("purpose")
    private final String purpose;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("purposeName")
    private final String purposeName;

    public InstitutionCardDto() {
        this(0, 0, 0, null, null, null, null, null, GF2Field.MASK, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPurpose() {
        return this.purpose;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionCardDto)) {
            return false;
        }
        InstitutionCardDto institutionCardDto = (InstitutionCardDto) other;
        return this.scope == institutionCardDto.scope && this.institutionId == institutionCardDto.institutionId && this.cardId == institutionCardDto.cardId && fr.t.c(this.id, institutionCardDto.id) && fr.t.c(this.name, institutionCardDto.name) && fr.t.c(this.url, institutionCardDto.url) && fr.t.c(this.purpose, institutionCardDto.purpose) && fr.t.c(this.purposeName, institutionCardDto.purposeName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPurposeName() {
        return this.purposeName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.scope) * 31) + Integer.hashCode(this.institutionId)) * 31) + Integer.hashCode(this.cardId)) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.purpose;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.purposeName;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "InstitutionCardDto(scope=" + this.scope + ", institutionId=" + this.institutionId + ", cardId=" + this.cardId + ", id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", purpose=" + this.purpose + ", purposeName=" + this.purposeName + ')';
    }

    public InstitutionCardDto(int i15, int i16, int i17, String str, String str2, String str3, String str4, String str5) {
        this.scope = i15;
        this.institutionId = i16;
        this.cardId = i17;
        this.id = str;
        this.name = str2;
        this.url = str3;
        this.purpose = str4;
        this.purposeName = str5;
    }

    public /* synthetic */ InstitutionCardDto(int i15, int i16, int i17, String str, String str2, String str3, String str4, String str5, int i18, fr.k kVar) {
        this((i18 & 1) != 0 ? 0 : i15, (i18 & 2) != 0 ? 0 : i16, (i18 & 4) != 0 ? 0 : i17, (i18 & 8) != 0 ? null : str, (i18 & 16) != 0 ? null : str2, (i18 & 32) != 0 ? null : str3, (i18 & 64) != 0 ? null : str4, (i18 & 128) != 0 ? null : str5);
    }
}

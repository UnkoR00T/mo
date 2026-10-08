package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Ljo0/j;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "accepted", "Ljo0/i;", "b", "Ljo0/i;", "()Ljo0/i;", "agreementsContent", "Ljo0/d2;", "c", "Ljo0/d2;", "()Ljo0/d2;", "welcomeText", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AgreementsResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("accepted")
    private final boolean accepted;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("agreementsContent")
    private final AgreementsContentDtoDto agreementsContent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("welcomeText")
    private final WelcomeTextDtoDto welcomeText;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAccepted() {
        return this.accepted;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AgreementsContentDtoDto getAgreementsContent() {
        return this.agreementsContent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final WelcomeTextDtoDto getWelcomeText() {
        return this.welcomeText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementsResponseDto)) {
            return false;
        }
        AgreementsResponseDto agreementsResponseDto = (AgreementsResponseDto) other;
        return this.accepted == agreementsResponseDto.accepted && fr.t.c(this.agreementsContent, agreementsResponseDto.agreementsContent) && fr.t.c(this.welcomeText, agreementsResponseDto.welcomeText);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.accepted) * 31;
        AgreementsContentDtoDto agreementsContentDtoDto = this.agreementsContent;
        int iHashCode2 = (iHashCode + (agreementsContentDtoDto == null ? 0 : agreementsContentDtoDto.hashCode())) * 31;
        WelcomeTextDtoDto welcomeTextDtoDto = this.welcomeText;
        return iHashCode2 + (welcomeTextDtoDto != null ? welcomeTextDtoDto.hashCode() : 0);
    }

    public String toString() {
        return "AgreementsResponseDto(accepted=" + this.accepted + ", agreementsContent=" + this.agreementsContent + ", welcomeText=" + this.welcomeText + ')';
    }
}

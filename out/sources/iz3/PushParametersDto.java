package iz3;

import fr.k;
import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: iz3.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0011R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001e\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b#\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b&\u0010.¨\u0006/"}, d2 = {"Liz3/e;", "", "", "authorizationId", "Ljava/time/OffsetDateTime;", "expirationDateTime", "Liz3/a;", "externalQualifiedSignatureAuthorization", "Liz3/c;", "payment", "Liz3/g;", "travelAdvisory", "Liz3/h;", "trustedProfileAuthorization", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Liz3/a;Liz3/c;Liz3/g;Liz3/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAuthorizationId", "getAuthorizationId$annotations", "()V", "b", "Ljava/time/OffsetDateTime;", "getExpirationDateTime", "()Ljava/time/OffsetDateTime;", "getExpirationDateTime$annotations", "c", "Liz3/a;", "()Liz3/a;", "d", "Liz3/c;", "()Liz3/c;", "e", "Liz3/g;", "()Liz3/g;", "f", "Liz3/h;", "()Liz3/h;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushParametersDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("authorizationId")
    private final String authorizationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("expirationDateTime")
    private final OffsetDateTime expirationDateTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("externalQualifiedSignatureAuthorization")
    private final ExternalQualifiedSignatureAuthorizationParametersDto externalQualifiedSignatureAuthorization;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("payment")
    private final PaymentParametersDto payment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("travelAdvisory")
    private final TravelAdvisoryParametersDto travelAdvisory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("trustedProfileAuthorization")
    private final TrustedProfileAuthorizationParametersDto trustedProfileAuthorization;

    public PushParametersDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ExternalQualifiedSignatureAuthorizationParametersDto getExternalQualifiedSignatureAuthorization() {
        return this.externalQualifiedSignatureAuthorization;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PaymentParametersDto getPayment() {
        return this.payment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TravelAdvisoryParametersDto getTravelAdvisory() {
        return this.travelAdvisory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TrustedProfileAuthorizationParametersDto getTrustedProfileAuthorization() {
        return this.trustedProfileAuthorization;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushParametersDto)) {
            return false;
        }
        PushParametersDto pushParametersDto = (PushParametersDto) other;
        return t.c(this.authorizationId, pushParametersDto.authorizationId) && t.c(this.expirationDateTime, pushParametersDto.expirationDateTime) && t.c(this.externalQualifiedSignatureAuthorization, pushParametersDto.externalQualifiedSignatureAuthorization) && t.c(this.payment, pushParametersDto.payment) && t.c(this.travelAdvisory, pushParametersDto.travelAdvisory) && t.c(this.trustedProfileAuthorization, pushParametersDto.trustedProfileAuthorization);
    }

    public int hashCode() {
        String str = this.authorizationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.expirationDateTime;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        ExternalQualifiedSignatureAuthorizationParametersDto externalQualifiedSignatureAuthorizationParametersDto = this.externalQualifiedSignatureAuthorization;
        int iHashCode3 = (iHashCode2 + (externalQualifiedSignatureAuthorizationParametersDto == null ? 0 : externalQualifiedSignatureAuthorizationParametersDto.hashCode())) * 31;
        PaymentParametersDto paymentParametersDto = this.payment;
        int iHashCode4 = (iHashCode3 + (paymentParametersDto == null ? 0 : paymentParametersDto.hashCode())) * 31;
        TravelAdvisoryParametersDto travelAdvisoryParametersDto = this.travelAdvisory;
        int iHashCode5 = (iHashCode4 + (travelAdvisoryParametersDto == null ? 0 : travelAdvisoryParametersDto.hashCode())) * 31;
        TrustedProfileAuthorizationParametersDto trustedProfileAuthorizationParametersDto = this.trustedProfileAuthorization;
        return iHashCode5 + (trustedProfileAuthorizationParametersDto != null ? trustedProfileAuthorizationParametersDto.hashCode() : 0);
    }

    public String toString() {
        return "PushParametersDto(authorizationId=" + this.authorizationId + ", expirationDateTime=" + this.expirationDateTime + ", externalQualifiedSignatureAuthorization=" + this.externalQualifiedSignatureAuthorization + ", payment=" + this.payment + ", travelAdvisory=" + this.travelAdvisory + ", trustedProfileAuthorization=" + this.trustedProfileAuthorization + ')';
    }

    public PushParametersDto(String str, OffsetDateTime offsetDateTime, ExternalQualifiedSignatureAuthorizationParametersDto externalQualifiedSignatureAuthorizationParametersDto, PaymentParametersDto paymentParametersDto, TravelAdvisoryParametersDto travelAdvisoryParametersDto, TrustedProfileAuthorizationParametersDto trustedProfileAuthorizationParametersDto) {
        this.authorizationId = str;
        this.expirationDateTime = offsetDateTime;
        this.externalQualifiedSignatureAuthorization = externalQualifiedSignatureAuthorizationParametersDto;
        this.payment = paymentParametersDto;
        this.travelAdvisory = travelAdvisoryParametersDto;
        this.trustedProfileAuthorization = trustedProfileAuthorizationParametersDto;
    }

    public /* synthetic */ PushParametersDto(String str, OffsetDateTime offsetDateTime, ExternalQualifiedSignatureAuthorizationParametersDto externalQualifiedSignatureAuthorizationParametersDto, PaymentParametersDto paymentParametersDto, TravelAdvisoryParametersDto travelAdvisoryParametersDto, TrustedProfileAuthorizationParametersDto trustedProfileAuthorizationParametersDto, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : offsetDateTime, (i15 & 4) != 0 ? null : externalQualifiedSignatureAuthorizationParametersDto, (i15 & 8) != 0 ? null : paymentParametersDto, (i15 & 16) != 0 ? null : travelAdvisoryParametersDto, (i15 & 32) != 0 ? null : trustedProfileAuthorizationParametersDto);
    }
}

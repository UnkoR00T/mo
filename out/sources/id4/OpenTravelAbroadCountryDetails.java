package id4;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: id4.i3, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\n¨\u0006\u0017"}, d2 = {"Lid4/i3;", "", "", "messageId", "", "messageDisplayed", "countryIso", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenTravelAbroadCountryDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String messageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean messageDisplayed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryIso;

    public OpenTravelAbroadCountryDetails(String str, boolean z15, String str2) {
        this.messageId = str;
        this.messageDisplayed = z15;
        this.countryIso = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryIso() {
        return this.countryIso;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getMessageDisplayed() {
        return this.messageDisplayed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenTravelAbroadCountryDetails)) {
            return false;
        }
        OpenTravelAbroadCountryDetails openTravelAbroadCountryDetails = (OpenTravelAbroadCountryDetails) other;
        return fr.t.c(this.messageId, openTravelAbroadCountryDetails.messageId) && this.messageDisplayed == openTravelAbroadCountryDetails.messageDisplayed && fr.t.c(this.countryIso, openTravelAbroadCountryDetails.countryIso);
    }

    public int hashCode() {
        String str = this.messageId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.messageDisplayed)) * 31) + this.countryIso.hashCode();
    }

    public String toString() {
        return "OpenTravelAbroadCountryDetails(messageId=" + this.messageId + ", messageDisplayed=" + this.messageDisplayed + ", countryIso=" + this.countryIso + ')';
    }
}

package s93;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s93.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Ls93/a;", "", "", "countryIso", "messageId", "", "messageDisplayed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ToCountryDetails implements gx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryIso;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String messageId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean messageDisplayed;

    public ToCountryDetails(String str, String str2, boolean z15) {
        this.countryIso = str;
        this.messageId = str2;
        this.messageDisplayed = z15;
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
        if (!(other instanceof ToCountryDetails)) {
            return false;
        }
        ToCountryDetails toCountryDetails = (ToCountryDetails) other;
        return t.c(this.countryIso, toCountryDetails.countryIso) && t.c(this.messageId, toCountryDetails.messageId) && this.messageDisplayed == toCountryDetails.messageDisplayed;
    }

    public int hashCode() {
        int iHashCode = this.countryIso.hashCode() * 31;
        String str = this.messageId;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.messageDisplayed);
    }

    public String toString() {
        return "ToCountryDetails(countryIso=" + this.countryIso + ", messageId=" + this.messageId + ", messageDisplayed=" + this.messageDisplayed + ")";
    }
}

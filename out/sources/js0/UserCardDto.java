package js0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.f1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006!"}, d2 = {"Ljs0/f1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "active", "Ljava/time/LocalDate;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "activeUntil", "c", "Ljava/lang/String;", "d", "cardNumberMasked", "e", "cardTokenId", "f", "tokenNumber", "Ljs0/f1$a;", "Ljs0/f1$a;", "()Ljs0/f1$a;", "cardBrand", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserCardDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("active")
    private final boolean active;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("activeUntil")
    private final LocalDate activeUntil;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cardNumberMasked")
    private final String cardNumberMasked;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cardTokenId")
    private final String cardTokenId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("tokenNumber")
    private final String tokenNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cardBrand")
    private final a cardBrand;

    /* JADX INFO: renamed from: js0.f1$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Ljs0/f1$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        VIS("VIS"),
        MCI("MCI"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f104940f = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getActiveUntil() {
        return this.activeUntil;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getCardBrand() {
        return this.cardBrand;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCardNumberMasked() {
        return this.cardNumberMasked;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCardTokenId() {
        return this.cardTokenId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCardDto)) {
            return false;
        }
        UserCardDto userCardDto = (UserCardDto) other;
        return this.active == userCardDto.active && fr.t.c(this.activeUntil, userCardDto.activeUntil) && fr.t.c(this.cardNumberMasked, userCardDto.cardNumberMasked) && fr.t.c(this.cardTokenId, userCardDto.cardTokenId) && fr.t.c(this.tokenNumber, userCardDto.tokenNumber) && this.cardBrand == userCardDto.cardBrand;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTokenNumber() {
        return this.tokenNumber;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.active) * 31) + this.activeUntil.hashCode()) * 31) + this.cardNumberMasked.hashCode()) * 31) + this.cardTokenId.hashCode()) * 31) + this.tokenNumber.hashCode()) * 31;
        a aVar = this.cardBrand;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "UserCardDto(active=" + this.active + ", activeUntil=" + this.activeUntil + ", cardNumberMasked=" + this.cardNumberMasked + ", cardTokenId=" + this.cardTokenId + ", tokenNumber=" + this.tokenNumber + ", cardBrand=" + this.cardBrand + ')';
    }
}

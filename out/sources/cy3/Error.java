package cy3;

import dy3.PaymentCardRequiredData;
import java.util.List;
import p071kotlin.Metadata;
import vr0.BECardToken;
import vr0.BEUserCard;

/* JADX INFO: renamed from: cy3.g, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b%\u0010*R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b!\u0010,¨\u0006-"}, d2 = {"Lcy3/g;", "", "Lvr0/i;", "cardToken", "", "saveCard", "Ldy3/c;", "paymentCardRequiredData", "Ldy3/a;", "returnResult", "Lhb4/c;", "errorVMS", "", "Lvr0/p;", "userCards", "<init>", "(Lvr0/i;ZLdy3/c;Ldy3/a;Lhb4/c;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lvr0/i;", "b", "()Lvr0/i;", "Z", "g", "()Z", "c", "Ldy3/c;", "e", "()Ldy3/c;", "d", "Ldy3/a;", "f", "()Ldy3/a;", "Lhb4/c;", "()Lhb4/c;", "Ljava/util/List;", "()Ljava/util/List;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BECardToken cardToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean saveCard;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentCardRequiredData paymentCardRequiredData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final dy3.a returnResult;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c errorVMS;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEUserCard> userCards;

    public Error(BECardToken bECardToken, boolean z15, PaymentCardRequiredData paymentCardRequiredData, dy3.a aVar, hb4.c cVar, List<BEUserCard> list) {
        this.cardToken = bECardToken;
        this.saveCard = z15;
        this.paymentCardRequiredData = paymentCardRequiredData;
        this.returnResult = aVar;
        this.errorVMS = cVar;
        this.userCards = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BECardToken getCardToken() {
        return this.cardToken;
    }

    @Override // cy3.f.a
    public List<BEUserCard> c() {
        return this.userCards;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hb4.c getErrorVMS() {
        return this.errorVMS;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final PaymentCardRequiredData getPaymentCardRequiredData() {
        return this.paymentCardRequiredData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.cardToken, error.cardToken) && this.saveCard == error.saveCard && fr.t.c(this.paymentCardRequiredData, error.paymentCardRequiredData) && this.returnResult == error.returnResult && fr.t.c(this.errorVMS, error.errorVMS) && fr.t.c(this.userCards, error.userCards);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final dy3.a getReturnResult() {
        return this.returnResult;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getSaveCard() {
        return this.saveCard;
    }

    public int hashCode() {
        BECardToken bECardToken = this.cardToken;
        int iHashCode = (((((bECardToken == null ? 0 : bECardToken.hashCode()) * 31) + Boolean.hashCode(this.saveCard)) * 31) + this.paymentCardRequiredData.hashCode()) * 31;
        dy3.a aVar = this.returnResult;
        return ((((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.errorVMS.hashCode()) * 31) + this.userCards.hashCode();
    }

    public String toString() {
        return "Error(cardToken=" + this.cardToken + ", saveCard=" + this.saveCard + ", paymentCardRequiredData=" + this.paymentCardRequiredData + ", returnResult=" + this.returnResult + ", errorVMS=" + this.errorVMS + ", userCards=" + this.userCards + ')';
    }
}

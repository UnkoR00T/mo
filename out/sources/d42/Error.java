package d42;

import e42.PaymentCardRequiredData;
import java.util.List;
import p071kotlin.Metadata;
import vr0.BECardToken;
import vr0.BEUserCard;

/* JADX INFO: renamed from: d42.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b$\u0010/R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b \u00101¨\u00062"}, d2 = {"Ld42/g;", "", "Lvr0/i;", "cardToken", "", "saveCard", "Le42/b;", "paymentCardRequiredData", "Lu42/a;", "returnResult", "Lhb4/c;", "errorVMS", "", "Lvr0/p;", "userCards", "Lcb4/i;", "dialog", "<init>", "(Lvr0/i;ZLe42/b;Lu42/a;Lhb4/c;Ljava/util/List;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lvr0/i;", "d", "()Lvr0/i;", "b", "Z", "h", "()Z", "c", "Le42/b;", "f", "()Le42/b;", "Lu42/a;", "g", "()Lu42/a;", "e", "Lhb4/c;", "()Lhb4/c;", "Ljava/util/List;", "()Ljava/util/List;", "Lcb4/i;", "()Lcb4/i;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BECardToken cardToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean saveCard;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentCardRequiredData paymentCardRequiredData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final u42.a returnResult;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c errorVMS;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEUserCard> userCards;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final cb4.i dialog;

    public Error(BECardToken bECardToken, boolean z15, PaymentCardRequiredData paymentCardRequiredData, u42.a aVar, hb4.c cVar, List<BEUserCard> list, cb4.i iVar) {
        this.cardToken = bECardToken;
        this.saveCard = z15;
        this.paymentCardRequiredData = paymentCardRequiredData;
        this.returnResult = aVar;
        this.errorVMS = cVar;
        this.userCards = list;
        this.dialog = iVar;
    }

    @Override // d42.f.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public cb4.i getDialog() {
        return this.dialog;
    }

    @Override // d42.f.a
    public List<BEUserCard> c() {
        return this.userCards;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BECardToken getCardToken() {
        return this.cardToken;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hb4.c getErrorVMS() {
        return this.errorVMS;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.cardToken, error.cardToken) && this.saveCard == error.saveCard && fr.t.c(this.paymentCardRequiredData, error.paymentCardRequiredData) && this.returnResult == error.returnResult && fr.t.c(this.errorVMS, error.errorVMS) && fr.t.c(this.userCards, error.userCards) && fr.t.c(this.dialog, error.dialog);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final PaymentCardRequiredData getPaymentCardRequiredData() {
        return this.paymentCardRequiredData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final u42.a getReturnResult() {
        return this.returnResult;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSaveCard() {
        return this.saveCard;
    }

    public int hashCode() {
        BECardToken bECardToken = this.cardToken;
        int iHashCode = (((((bECardToken == null ? 0 : bECardToken.hashCode()) * 31) + Boolean.hashCode(this.saveCard)) * 31) + this.paymentCardRequiredData.hashCode()) * 31;
        u42.a aVar = this.returnResult;
        int iHashCode2 = (((((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.errorVMS.hashCode()) * 31) + this.userCards.hashCode()) * 31;
        cb4.i iVar = this.dialog;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public String toString() {
        return "Error(cardToken=" + this.cardToken + ", saveCard=" + this.saveCard + ", paymentCardRequiredData=" + this.paymentCardRequiredData + ", returnResult=" + this.returnResult + ", errorVMS=" + this.errorVMS + ", userCards=" + this.userCards + ", dialog=" + this.dialog + ')';
    }

    public /* synthetic */ Error(BECardToken bECardToken, boolean z15, PaymentCardRequiredData paymentCardRequiredData, u42.a aVar, hb4.c cVar, List list, cb4.i iVar, int i15, fr.k kVar) {
        this(bECardToken, z15, paymentCardRequiredData, aVar, cVar, list, (i15 & 64) != 0 ? null : iVar);
    }
}

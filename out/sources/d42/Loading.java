package d42;

import e42.PaymentCardRequiredData;
import java.util.List;
import p071kotlin.Metadata;
import vr0.BECardToken;
import vr0.BEUserCard;

/* JADX INFO: renamed from: d42.h, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b\"\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b\u001e\u0010,¨\u0006-"}, d2 = {"Ld42/h;", "", "Lvr0/i;", "cardToken", "", "saveCard", "Le42/b;", "paymentCardRequiredData", "Lu42/a;", "returnResult", "", "Lvr0/p;", "userCards", "Lcb4/i;", "dialog", "<init>", "(Lvr0/i;ZLe42/b;Lu42/a;Ljava/util/List;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lvr0/i;", "d", "()Lvr0/i;", "b", "Z", "g", "()Z", "c", "Le42/b;", "e", "()Le42/b;", "Lu42/a;", "f", "()Lu42/a;", "Ljava/util/List;", "()Ljava/util/List;", "Lcb4/i;", "()Lcb4/i;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Loading implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BECardToken cardToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean saveCard;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentCardRequiredData paymentCardRequiredData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final u42.a returnResult;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEUserCard> userCards;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final cb4.i dialog;

    public Loading(BECardToken bECardToken, boolean z15, PaymentCardRequiredData paymentCardRequiredData, u42.a aVar, List<BEUserCard> list, cb4.i iVar) {
        this.cardToken = bECardToken;
        this.saveCard = z15;
        this.paymentCardRequiredData = paymentCardRequiredData;
        this.returnResult = aVar;
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
    public final PaymentCardRequiredData getPaymentCardRequiredData() {
        return this.paymentCardRequiredData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Loading)) {
            return false;
        }
        Loading loading = (Loading) other;
        return fr.t.c(this.cardToken, loading.cardToken) && this.saveCard == loading.saveCard && fr.t.c(this.paymentCardRequiredData, loading.paymentCardRequiredData) && this.returnResult == loading.returnResult && fr.t.c(this.userCards, loading.userCards) && fr.t.c(this.dialog, loading.dialog);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final u42.a getReturnResult() {
        return this.returnResult;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getSaveCard() {
        return this.saveCard;
    }

    public int hashCode() {
        BECardToken bECardToken = this.cardToken;
        int iHashCode = (((((bECardToken == null ? 0 : bECardToken.hashCode()) * 31) + Boolean.hashCode(this.saveCard)) * 31) + this.paymentCardRequiredData.hashCode()) * 31;
        u42.a aVar = this.returnResult;
        int iHashCode2 = (((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.userCards.hashCode()) * 31;
        cb4.i iVar = this.dialog;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public String toString() {
        return "Loading(cardToken=" + this.cardToken + ", saveCard=" + this.saveCard + ", paymentCardRequiredData=" + this.paymentCardRequiredData + ", returnResult=" + this.returnResult + ", userCards=" + this.userCards + ", dialog=" + this.dialog + ')';
    }

    public /* synthetic */ Loading(BECardToken bECardToken, boolean z15, PaymentCardRequiredData paymentCardRequiredData, u42.a aVar, List list, cb4.i iVar, int i15, fr.k kVar) {
        this(bECardToken, z15, paymentCardRequiredData, aVar, list, (i15 & 32) != 0 ? null : iVar);
    }
}

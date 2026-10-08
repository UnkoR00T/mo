package n42;

import p071kotlin.Metadata;
import yr0.BEPaymentDetails;

/* JADX INFO: renamed from: n42.i, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b \u0010#¨\u0006$"}, d2 = {"Ln42/i;", "", "Lyr0/e;", "item", "", "paymentProcessSucceed", "", "paymentId", "refreshScreen", "Lcb4/i;", "dialog", "<init>", "(Lyr0/e;ZLjava/lang/String;ZLcb4/i;)V", "b", "(Lyr0/e;ZLjava/lang/String;ZLcb4/i;)Ln42/i;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lyr0/e;", "getItem", "()Lyr0/e;", "Z", "()Z", "c", "Ljava/lang/String;", "e", "d", "f", "Lcb4/i;", "()Lcb4/i;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Displayed implements q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPaymentDetails item;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean paymentProcessSucceed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean refreshScreen;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final cb4.i dialog;

    public Displayed(BEPaymentDetails bEPaymentDetails, boolean z15, String str, boolean z16, cb4.i iVar) {
        this.item = bEPaymentDetails;
        this.paymentProcessSucceed = z15;
        this.paymentId = str;
        this.refreshScreen = z16;
        this.dialog = iVar;
    }

    public static /* synthetic */ Displayed c(Displayed displayed, BEPaymentDetails bEPaymentDetails, boolean z15, String str, boolean z16, cb4.i iVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bEPaymentDetails = displayed.item;
        }
        if ((i15 & 2) != 0) {
            z15 = displayed.paymentProcessSucceed;
        }
        if ((i15 & 4) != 0) {
            str = displayed.paymentId;
        }
        if ((i15 & 8) != 0) {
            z16 = displayed.refreshScreen;
        }
        if ((i15 & 16) != 0) {
            iVar = displayed.dialog;
        }
        cb4.i iVar2 = iVar;
        String str2 = str;
        return displayed.b(bEPaymentDetails, z15, str2, z16, iVar2);
    }

    @Override // n42.q.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getPaymentProcessSucceed() {
        return this.paymentProcessSucceed;
    }

    public final Displayed b(BEPaymentDetails item, boolean paymentProcessSucceed, String paymentId, boolean refreshScreen, cb4.i dialog) {
        return new Displayed(item, paymentProcessSucceed, paymentId, refreshScreen, dialog);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final cb4.i getDialog() {
        return this.dialog;
    }

    @Override // n42.q
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getPaymentId() {
        return this.paymentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Displayed)) {
            return false;
        }
        Displayed displayed = (Displayed) other;
        return fr.t.c(this.item, displayed.item) && this.paymentProcessSucceed == displayed.paymentProcessSucceed && fr.t.c(this.paymentId, displayed.paymentId) && this.refreshScreen == displayed.refreshScreen && fr.t.c(this.dialog, displayed.dialog);
    }

    @Override // n42.q
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getRefreshScreen() {
        return this.refreshScreen;
    }

    @Override // n42.q.a
    public BEPaymentDetails getItem() {
        return this.item;
    }

    public int hashCode() {
        int iHashCode = ((((((this.item.hashCode() * 31) + Boolean.hashCode(this.paymentProcessSucceed)) * 31) + this.paymentId.hashCode()) * 31) + Boolean.hashCode(this.refreshScreen)) * 31;
        cb4.i iVar = this.dialog;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public String toString() {
        return "Displayed(item=" + this.item + ", paymentProcessSucceed=" + this.paymentProcessSucceed + ", paymentId=" + this.paymentId + ", refreshScreen=" + this.refreshScreen + ", dialog=" + this.dialog + ')';
    }

    public /* synthetic */ Displayed(BEPaymentDetails bEPaymentDetails, boolean z15, String str, boolean z16, cb4.i iVar, int i15, fr.k kVar) {
        this(bEPaymentDetails, z15, str, z16, (i15 & 16) != 0 ? null : iVar);
    }
}

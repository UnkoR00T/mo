package z52;

import h30.ButtonData;
import i50.BaseScaffoldData;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lz52/d;", "Ll00/e;", "Lz52/d$a;", "Li70/n;", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lz52/d$a;", "", "a", "b", "Lz52/d$a$a;", "Lz52/d$a$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: z52.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lz52/d$a$a;", "Lz52/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C6262a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C6262a f232957a = new C6262a();

            private C6262a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C6262a);
            }

            public int hashCode() {
                return -1987551964;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: z52.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b\u001a\u0010(¨\u0006)"}, d2 = {"Lz52/d$a$b;", "Lz52/d$a;", "Ln30/b;", "transactionDetails", "Lh30/a;", "getConfirmationButtonData", "Lkotlin/Function0;", "Loq/i0;", "hideSnackBar", "Li50/a;", "scaffoldData", "Lcb4/i;", "dialogVMS", "<init>", "(Ln30/b;Lh30/a;Ler/a;Li50/a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "e", "()Ln30/b;", "b", "Lh30/a;", "()Lh30/a;", "c", "Ler/a;", "()Ler/a;", "d", "Li50/a;", "()Li50/a;", "Lcb4/i;", "()Lcb4/i;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData transactionDetails;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData getConfirmationButtonData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> hideSnackBar;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            public Initialized(CardListData cardListData, ButtonData buttonData, er.a<i0> aVar, BaseScaffoldData baseScaffoldData, cb4.i iVar) {
                this.transactionDetails = cardListData;
                this.getConfirmationButtonData = buttonData;
                this.hideSnackBar = aVar;
                this.scaffoldData = baseScaffoldData;
                this.dialogVMS = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final cb4.i getDialogVMS() {
                return this.dialogVMS;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonData getGetConfirmationButtonData() {
                return this.getConfirmationButtonData;
            }

            public final er.a<i0> c() {
                return this.hideSnackBar;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final CardListData getTransactionDetails() {
                return this.transactionDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.transactionDetails, initialized.transactionDetails) && fr.t.c(this.getConfirmationButtonData, initialized.getConfirmationButtonData) && fr.t.c(this.hideSnackBar, initialized.hideSnackBar) && fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.dialogVMS, initialized.dialogVMS);
            }

            public int hashCode() {
                int iHashCode = this.transactionDetails.hashCode() * 31;
                ButtonData buttonData = this.getConfirmationButtonData;
                int iHashCode2 = (((((iHashCode + (buttonData == null ? 0 : buttonData.hashCode())) * 31) + this.hideSnackBar.hashCode()) * 31) + this.scaffoldData.hashCode()) * 31;
                cb4.i iVar = this.dialogVMS;
                return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
            }

            public String toString() {
                return "Initialized(transactionDetails=" + this.transactionDetails + ", getConfirmationButtonData=" + this.getConfirmationButtonData + ", hideSnackBar=" + this.hideSnackBar + ", scaffoldData=" + this.scaffoldData + ", dialogVMS=" + this.dialogVMS + ')';
            }
        }
    }
}

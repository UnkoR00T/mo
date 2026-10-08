package n42;

import androidx.compose.ui.graphics.Color;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import n30.CardListData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\bJ\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Ln42/r;", "Ll00/e;", "Ln42/r$a;", "Li70/n;", "Loq/i0;", "close", "()V", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface r extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ln42/r$a;", "", "b", "c", "a", "Ln42/r$a$a;", "Ln42/r$a$b;", "Ln42/r$a$c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: n42.r$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln42/r$a$a;", "Ln42/r$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln42/r$a$b;", "Ln42/r$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f131515a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1609237418;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: n42.r$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b%\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b(\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b.\u00104R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b,\u00107R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b5\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b-\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b<\u0010>\u001a\u0004\b8\u0010?R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\b2\u0010?R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b/\u0010C¨\u0006D"}, d2 = {"Ln42/r$a$c;", "Ln42/r$a;", "", "paymentId", "Lyr0/m;", "paymentStatus", "paymentTitle", "additionalTitle", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "additionalTitleColor", "Ln30/b;", "contentData", "", "Lh30/a;", "buttonsData", "Loq/i0;", "onSnackBarHidden", "Ln50/g;", "transactionsData", "Li50/a;", "parentScaffoldData", "innerScaffoldData", "Lcb4/i;", "dialogVMS", "<init>", "(Ljava/lang/String;Lyr0/m;Ljava/lang/String;Ljava/lang/String;Ler/p;Ln30/b;Ljava/util/List;Ler/a;Ln50/g;Li50/a;Li50/a;Lcb4/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPaymentId", "b", "Lyr0/m;", "getPaymentStatus", "()Lyr0/m;", "c", "i", "d", "e", "Ler/p;", "()Ler/p;", "f", "Ln30/b;", "()Ln30/b;", "g", "Ljava/util/List;", "()Ljava/util/List;", "h", "Ler/a;", "()Ler/a;", "Ln50/g;", "j", "()Ln50/g;", "Li50/a;", "()Li50/a;", "k", "l", "Lcb4/i;", "()Lcb4/i;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String paymentId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final yr0.m paymentStatus;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String paymentTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String additionalTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.p<p076m2.r, Integer, Color> additionalTitleColor;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData contentData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ButtonData> buttonsData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onSnackBarHidden;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final DefaultSingleCardData transactionsData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData parentScaffoldData;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData innerScaffoldData;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(String str, yr0.m mVar, String str2, String str3, er.p<? super p076m2.r, ? super Integer, Color> pVar, CardListData cardListData, List<ButtonData> list, er.a<oq.i0> aVar, DefaultSingleCardData defaultSingleCardData, BaseScaffoldData baseScaffoldData, BaseScaffoldData baseScaffoldData2, cb4.i iVar) {
                this.paymentId = str;
                this.paymentStatus = mVar;
                this.paymentTitle = str2;
                this.additionalTitle = str3;
                this.additionalTitleColor = pVar;
                this.contentData = cardListData;
                this.buttonsData = list;
                this.onSnackBarHidden = aVar;
                this.transactionsData = defaultSingleCardData;
                this.parentScaffoldData = baseScaffoldData;
                this.innerScaffoldData = baseScaffoldData2;
                this.dialogVMS = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAdditionalTitle() {
                return this.additionalTitle;
            }

            public final er.p<p076m2.r, Integer, Color> b() {
                return this.additionalTitleColor;
            }

            public final List<ButtonData> c() {
                return this.buttonsData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final CardListData getContentData() {
                return this.contentData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final cb4.i getDialogVMS() {
                return this.dialogVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.paymentId, initialized.paymentId) && this.paymentStatus == initialized.paymentStatus && fr.t.c(this.paymentTitle, initialized.paymentTitle) && fr.t.c(this.additionalTitle, initialized.additionalTitle) && fr.t.c(this.additionalTitleColor, initialized.additionalTitleColor) && fr.t.c(this.contentData, initialized.contentData) && fr.t.c(this.buttonsData, initialized.buttonsData) && fr.t.c(this.onSnackBarHidden, initialized.onSnackBarHidden) && fr.t.c(this.transactionsData, initialized.transactionsData) && fr.t.c(this.parentScaffoldData, initialized.parentScaffoldData) && fr.t.c(this.innerScaffoldData, initialized.innerScaffoldData) && fr.t.c(this.dialogVMS, initialized.dialogVMS);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getInnerScaffoldData() {
                return this.innerScaffoldData;
            }

            public final er.a<oq.i0> g() {
                return this.onSnackBarHidden;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final BaseScaffoldData getParentScaffoldData() {
                return this.parentScaffoldData;
            }

            public int hashCode() {
                int iHashCode = ((((this.paymentId.hashCode() * 31) + this.paymentStatus.hashCode()) * 31) + this.paymentTitle.hashCode()) * 31;
                String str = this.additionalTitle;
                int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.additionalTitleColor.hashCode()) * 31) + this.contentData.hashCode()) * 31) + this.buttonsData.hashCode()) * 31) + this.onSnackBarHidden.hashCode()) * 31;
                DefaultSingleCardData defaultSingleCardData = this.transactionsData;
                int iHashCode3 = (((((iHashCode2 + (defaultSingleCardData == null ? 0 : defaultSingleCardData.hashCode())) * 31) + this.parentScaffoldData.hashCode()) * 31) + this.innerScaffoldData.hashCode()) * 31;
                cb4.i iVar = this.dialogVMS;
                return iHashCode3 + (iVar != null ? iVar.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getPaymentTitle() {
                return this.paymentTitle;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final DefaultSingleCardData getTransactionsData() {
                return this.transactionsData;
            }

            public String toString() {
                return "Initialized(paymentId=" + this.paymentId + ", paymentStatus=" + this.paymentStatus + ", paymentTitle=" + this.paymentTitle + ", additionalTitle=" + this.additionalTitle + ", additionalTitleColor=" + this.additionalTitleColor + ", contentData=" + this.contentData + ", buttonsData=" + this.buttonsData + ", onSnackBarHidden=" + this.onSnackBarHidden + ", transactionsData=" + this.transactionsData + ", parentScaffoldData=" + this.parentScaffoldData + ", innerScaffoldData=" + this.innerScaffoldData + ", dialogVMS=" + this.dialogVMS + ')';
            }
        }
    }

    oz.j a();

    void close();
}

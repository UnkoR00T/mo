package te1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lte1/r;", "Ll00/e;", "Lte1/r$a;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface r extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lte1/r$a;", "", "a", "b", "Lte1/r$a$a;", "Lte1/r$a$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: te1.r$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b\u001e\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b \u0010/\u001a\u0004\b&\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b\"\u00102¨\u00063"}, d2 = {"Lte1/r$a$a;", "Lte1/r$a;", "Li50/a;", "scaffoldData", "Lh30/a;", "nextButton", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lj50/e;", "searchBarData", "Ln30/b;", "cardListData", "Lk40/a;", "emptyStateData", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Li50/a;Lh30/a;Ler/a;Lj50/e;Ln30/b;Lk40/a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Lh30/a;", "d", "()Lh30/a;", "c", "Ler/a;", "e", "()Ler/a;", "Lj50/e;", "g", "()Lj50/e;", "Ln30/b;", "()Ln30/b;", "Lk40/a;", "()Lk40/a;", "Lcb4/i;", "()Lcb4/i;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final SearchBarData searchBarData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData cardListData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData emptyStateData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            public Initialized(BaseScaffoldData baseScaffoldData, ButtonData buttonData, er.a<oq.i0> aVar, SearchBarData searchBarData, CardListData cardListData, EmptyStateData emptyStateData, cb4.i iVar) {
                this.scaffoldData = baseScaffoldData;
                this.nextButton = buttonData;
                this.onBackAction = aVar;
                this.searchBarData = searchBarData;
                this.cardListData = cardListData;
                this.emptyStateData = emptyStateData;
                this.dialogVMSAdapter = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CardListData getCardListData() {
                return this.cardListData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final EmptyStateData getEmptyStateData() {
                return this.emptyStateData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public final er.a<oq.i0> e() {
                return this.onBackAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.nextButton, initialized.nextButton) && fr.t.c(this.onBackAction, initialized.onBackAction) && fr.t.c(this.searchBarData, initialized.searchBarData) && fr.t.c(this.cardListData, initialized.cardListData) && fr.t.c(this.emptyStateData, initialized.emptyStateData) && fr.t.c(this.dialogVMSAdapter, initialized.dialogVMSAdapter);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final SearchBarData getSearchBarData() {
                return this.searchBarData;
            }

            public int hashCode() {
                int iHashCode = ((((((((((this.scaffoldData.hashCode() * 31) + this.nextButton.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.searchBarData.hashCode()) * 31) + this.cardListData.hashCode()) * 31) + this.emptyStateData.hashCode()) * 31;
                cb4.i iVar = this.dialogVMSAdapter;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", nextButton=" + this.nextButton + ", onBackAction=" + this.onBackAction + ", searchBarData=" + this.searchBarData + ", cardListData=" + this.cardListData + ", emptyStateData=" + this.emptyStateData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: te1.r$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lte1/r$a$b;", "Lte1/r$a;", "Li50/a;", "scaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lmx/a;", "description", "<init>", "(Li50/a;Ler/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Ler/a;", "()Ler/a;", "Lmx/a;", "()Lmx/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MoreInfo implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f189905d = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            public MoreInfo(BaseScaffoldData baseScaffoldData, er.a<oq.i0> aVar, Label label) {
                this.scaffoldData = baseScaffoldData;
                this.onBackAction = aVar;
                this.description = label;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            public final er.a<oq.i0> b() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MoreInfo)) {
                    return false;
                }
                MoreInfo moreInfo = (MoreInfo) other;
                return fr.t.c(this.scaffoldData, moreInfo.scaffoldData) && fr.t.c(this.onBackAction, moreInfo.onBackAction) && fr.t.c(this.description, moreInfo.description);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.description.hashCode();
            }

            public String toString() {
                return "MoreInfo(scaffoldData=" + this.scaffoldData + ", onBackAction=" + this.onBackAction + ", description=" + this.description + ')';
            }
        }
    }
}

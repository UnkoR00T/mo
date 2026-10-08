package xe2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lxe2/d;", "Ll00/e;", "Lxe2/d$a;", "a", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lxe2/d$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBackClick", "b", "Lxe2/d$a$a;", "Lxe2/d$a$b;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: xe2.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lxe2/d$a$a;", "Lxe2/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lhb4/c;", "error", "<init>", "(Ler/a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Lhb4/c;", "()Lhb4/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c error;

            public Error(er.a<i0> aVar, hb4.c cVar) {
                this.onBackClick = aVar;
                this.error = cVar;
            }

            @Override // xe2.d.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.onBackClick, error.onBackClick) && fr.t.c(this.error, error.error);
            }

            public int hashCode() {
                return (this.onBackClick.hashCode() * 31) + this.error.hashCode();
            }

            public String toString() {
                return "Error(onBackClick=" + this.onBackClick + ", error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: xe2.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b'\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b/\u00104R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b \u00106¨\u00067"}, d2 = {"Lxe2/d$a$b;", "Lxe2/d$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "detailsSectionTitle", "Ln30/b;", "detailsCardListData", "contactDetailsSectionTitle", "Ln50/k;", "contactDetailsCardData", "Lh30/a;", "nextButtonData", "Lcb4/i;", "dialogVMSAdapter", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ln30/b;Lmx/a;Ln50/k;Lh30/a;Lcb4/i;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "i", "()Lmx/a;", "c", "f", "d", "Ln30/b;", "e", "()Ln30/b;", "Ln50/k;", "()Ln50/k;", "g", "Lh30/a;", "h", "()Lh30/a;", "Lcb4/i;", "()Lcb4/i;", "Ler/a;", "()Ler/a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label detailsSectionTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData detailsCardListData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label contactDetailsSectionTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k contactDetailsCardData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, Label label2, CardListData cardListData, Label label3, n50.k kVar, ButtonData buttonData, cb4.i iVar, er.a<i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.title = label;
                this.detailsSectionTitle = label2;
                this.detailsCardListData = cardListData;
                this.contactDetailsSectionTitle = label3;
                this.contactDetailsCardData = kVar;
                this.nextButtonData = buttonData;
                this.dialogVMSAdapter = iVar;
                this.onBackClick = aVar;
            }

            @Override // xe2.d.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final n50.k getContactDetailsCardData() {
                return this.contactDetailsCardData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getContactDetailsSectionTitle() {
                return this.contactDetailsSectionTitle;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final CardListData getDetailsCardListData() {
                return this.detailsCardListData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.detailsSectionTitle, initialized.detailsSectionTitle) && fr.t.c(this.detailsCardListData, initialized.detailsCardListData) && fr.t.c(this.contactDetailsSectionTitle, initialized.contactDetailsSectionTitle) && fr.t.c(this.contactDetailsCardData, initialized.contactDetailsCardData) && fr.t.c(this.nextButtonData, initialized.nextButtonData) && fr.t.c(this.dialogVMSAdapter, initialized.dialogVMSAdapter) && fr.t.c(this.onBackClick, initialized.onBackClick);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getDetailsSectionTitle() {
                return this.detailsSectionTitle;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.detailsSectionTitle.hashCode()) * 31) + this.detailsCardListData.hashCode()) * 31) + this.contactDetailsSectionTitle.hashCode()) * 31) + this.contactDetailsCardData.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31;
                cb4.i iVar = this.dialogVMSAdapter;
                return ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.onBackClick.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", detailsSectionTitle=" + this.detailsSectionTitle + ", detailsCardListData=" + this.detailsCardListData + ", contactDetailsSectionTitle=" + this.contactDetailsSectionTitle + ", contactDetailsCardData=" + this.contactDetailsCardData + ", nextButtonData=" + this.nextButtonData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ", onBackClick=" + this.onBackClick + ')';
            }
        }

        er.a<i0> a();
    }
}

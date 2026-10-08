package bh2;

import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lbh2/d;", "Ll00/e;", "Lbh2/d$a;", "a", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lbh2/d$a;", "", "a", "b", "Lbh2/d$a$a;", "Lbh2/d$a$b;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: bh2.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b-\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b#\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b&\u00103¨\u00064"}, d2 = {"Lbh2/d$a$a;", "Lbh2/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "baseScaffoldData", "Lmx/a;", "screenTitle", "Ln30/b;", "documentCards", "Ln50/k;", "downloadDocumentCard", "downloadConfirmationCard", "checkChangesCard", "verificationCard", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Ler/a;Li50/a;Lmx/a;Ln30/b;Ln50/k;Ln50/k;Ln50/k;Ln50/k;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "g", "()Ler/a;", "b", "Li50/a;", "()Li50/a;", "c", "Lmx/a;", "h", "()Lmx/a;", "d", "Ln30/b;", "()Ln30/b;", "e", "Ln50/k;", "f", "()Ln50/k;", "i", "Lcb4/i;", "()Lcb4/i;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Content implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label screenTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData documentCards;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k downloadDocumentCard;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k downloadConfirmationCard;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k checkChangesCard;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k verificationCard;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            public Content(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, Label label, CardListData cardListData, n50.k kVar, n50.k kVar2, n50.k kVar3, n50.k kVar4, cb4.i iVar) {
                this.onBack = aVar;
                this.baseScaffoldData = baseScaffoldData;
                this.screenTitle = label;
                this.documentCards = cardListData;
                this.downloadDocumentCard = kVar;
                this.downloadConfirmationCard = kVar2;
                this.checkChangesCard = kVar3;
                this.verificationCard = kVar4;
                this.dialogVMSAdapter = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final n50.k getCheckChangesCard() {
                return this.checkChangesCard;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final CardListData getDocumentCards() {
                return this.documentCards;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final n50.k getDownloadConfirmationCard() {
                return this.downloadConfirmationCard;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return fr.t.c(this.onBack, content.onBack) && fr.t.c(this.baseScaffoldData, content.baseScaffoldData) && fr.t.c(this.screenTitle, content.screenTitle) && fr.t.c(this.documentCards, content.documentCards) && fr.t.c(this.downloadDocumentCard, content.downloadDocumentCard) && fr.t.c(this.downloadConfirmationCard, content.downloadConfirmationCard) && fr.t.c(this.checkChangesCard, content.checkChangesCard) && fr.t.c(this.verificationCard, content.verificationCard) && fr.t.c(this.dialogVMSAdapter, content.dialogVMSAdapter);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final n50.k getDownloadDocumentCard() {
                return this.downloadDocumentCard;
            }

            public final er.a<i0> g() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getScreenTitle() {
                return this.screenTitle;
            }

            public int hashCode() {
                int iHashCode = ((((((this.onBack.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.screenTitle.hashCode()) * 31) + this.documentCards.hashCode()) * 31;
                n50.k kVar = this.downloadDocumentCard;
                int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
                n50.k kVar2 = this.downloadConfirmationCard;
                int iHashCode3 = (iHashCode2 + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
                n50.k kVar3 = this.checkChangesCard;
                int iHashCode4 = (iHashCode3 + (kVar3 == null ? 0 : kVar3.hashCode())) * 31;
                n50.k kVar4 = this.verificationCard;
                int iHashCode5 = (iHashCode4 + (kVar4 == null ? 0 : kVar4.hashCode())) * 31;
                cb4.i iVar = this.dialogVMSAdapter;
                return iHashCode5 + (iVar != null ? iVar.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final n50.k getVerificationCard() {
                return this.verificationCard;
            }

            public String toString() {
                return "Content(onBack=" + this.onBack + ", baseScaffoldData=" + this.baseScaffoldData + ", screenTitle=" + this.screenTitle + ", documentCards=" + this.documentCards + ", downloadDocumentCard=" + this.downloadDocumentCard + ", downloadConfirmationCard=" + this.downloadConfirmationCard + ", checkChangesCard=" + this.checkChangesCard + ", verificationCard=" + this.verificationCard + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: bh2.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbh2/d$a$b;", "Lbh2/d$a;", "Lhb4/c;", "error", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c error;

            public Error(hb4.c cVar) {
                this.error = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ')';
            }
        }
    }
}

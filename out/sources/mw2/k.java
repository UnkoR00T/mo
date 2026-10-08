package mw2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lmw2/k;", "Ll00/e;", "Lmw2/k$a;", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lmw2/k$a;", "", "a", "b", "Lmw2/k$a$a;", "Lmw2/k$a$b;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: mw2.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmw2/k$a$a;", "Lmw2/k$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C3195a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3195a f128839a = new C3195a();

            private C3195a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C3195a);
            }

            public int hashCode() {
                return 421609925;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: mw2.k$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010\"R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b*\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b'\u0010-¨\u0006."}, d2 = {"Lmw2/k$a$b;", "Lmw2/k$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "header", "Lc30/b$e;", "alertData", "mainDataSectionTitle", "Ln30/b;", "mainDataCardListData", "parentsDataSectionTitle", "parentsDataCardListData", "Lh30/a;", "nextButton", "<init>", "(Li50/a;Lmx/a;Lc30/b$e;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "h", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "c", "Lc30/b$e;", "()Lc30/b$e;", "d", "e", "Ln30/b;", "()Ln30/b;", "f", "g", "Lh30/a;", "()Lh30/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f128840i = c30.b.e.f22961j | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label header;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b.e alertData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label mainDataSectionTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData mainDataCardListData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label parentsDataSectionTitle;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData parentsDataCardListData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, c30.b.e eVar, Label label2, CardListData cardListData, Label label3, CardListData cardListData2, ButtonData buttonData) {
                this.scaffoldData = baseScaffoldData;
                this.header = label;
                this.alertData = eVar;
                this.mainDataSectionTitle = label2;
                this.mainDataCardListData = cardListData;
                this.parentsDataSectionTitle = label3;
                this.parentsDataCardListData = cardListData2;
                this.nextButton = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b.e getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getHeader() {
                return this.header;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CardListData getMainDataCardListData() {
                return this.mainDataCardListData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getMainDataSectionTitle() {
                return this.mainDataSectionTitle;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.header, initialized.header) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.mainDataSectionTitle, initialized.mainDataSectionTitle) && fr.t.c(this.mainDataCardListData, initialized.mainDataCardListData) && fr.t.c(this.parentsDataSectionTitle, initialized.parentsDataSectionTitle) && fr.t.c(this.parentsDataCardListData, initialized.parentsDataCardListData) && fr.t.c(this.nextButton, initialized.nextButton);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final CardListData getParentsDataCardListData() {
                return this.parentsDataCardListData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getParentsDataSectionTitle() {
                return this.parentsDataSectionTitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public int hashCode() {
                int iHashCode = ((this.scaffoldData.hashCode() * 31) + this.header.hashCode()) * 31;
                c30.b.e eVar = this.alertData;
                return ((((((((((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.mainDataSectionTitle.hashCode()) * 31) + this.mainDataCardListData.hashCode()) * 31) + this.parentsDataSectionTitle.hashCode()) * 31) + this.parentsDataCardListData.hashCode()) * 31) + this.nextButton.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", header=" + this.header + ", alertData=" + this.alertData + ", mainDataSectionTitle=" + this.mainDataSectionTitle + ", mainDataCardListData=" + this.mainDataCardListData + ", parentsDataSectionTitle=" + this.parentsDataSectionTitle + ", parentsDataCardListData=" + this.parentsDataCardListData + ", nextButton=" + this.nextButton + ')';
            }
        }
    }
}

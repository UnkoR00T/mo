package m72;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lm72/f;", "Ll00/e;", "Lm72/f$a;", "a", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lm72/f$a;", "", "a", "b", "Lm72/f$a$a;", "Lm72/f$a$b;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: m72.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm72/f$a$a;", "Lm72/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C3041a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3041a f124067a = new C3041a();

            private C3041a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C3041a);
            }

            public int hashCode() {
                return 174950549;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: m72.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"Lm72/f$a$b;", "Lm72/f$a;", "Lmx/a;", "alertDescription", "validityPeriodSectionTitle", "Ln30/b;", "validityPeriodCardListData", "infoSectionTitle", "infoSectionCardListData", "commentPeriodSectionTitle", "commentPeriodSectionDescription", "Li50/a;", "scaffoldData", "<init>", "(Lmx/a;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Lmx/a;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "h", "c", "Ln30/b;", "g", "()Ln30/b;", "d", "e", "f", "Li50/a;", "()Li50/a;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f124068i = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label alertDescription;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label validityPeriodSectionTitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData validityPeriodCardListData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label infoSectionTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData infoSectionCardListData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label commentPeriodSectionTitle;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label commentPeriodSectionDescription;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public Initialized(Label label, Label label2, CardListData cardListData, Label label3, CardListData cardListData2, Label label4, Label label5, BaseScaffoldData baseScaffoldData) {
                this.alertDescription = label;
                this.validityPeriodSectionTitle = label2;
                this.validityPeriodCardListData = cardListData;
                this.infoSectionTitle = label3;
                this.infoSectionCardListData = cardListData2;
                this.commentPeriodSectionTitle = label4;
                this.commentPeriodSectionDescription = label5;
                this.scaffoldData = baseScaffoldData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getAlertDescription() {
                return this.alertDescription;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getCommentPeriodSectionDescription() {
                return this.commentPeriodSectionDescription;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getCommentPeriodSectionTitle() {
                return this.commentPeriodSectionTitle;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final CardListData getInfoSectionCardListData() {
                return this.infoSectionCardListData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getInfoSectionTitle() {
                return this.infoSectionTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return t.c(this.alertDescription, initialized.alertDescription) && t.c(this.validityPeriodSectionTitle, initialized.validityPeriodSectionTitle) && t.c(this.validityPeriodCardListData, initialized.validityPeriodCardListData) && t.c(this.infoSectionTitle, initialized.infoSectionTitle) && t.c(this.infoSectionCardListData, initialized.infoSectionCardListData) && t.c(this.commentPeriodSectionTitle, initialized.commentPeriodSectionTitle) && t.c(this.commentPeriodSectionDescription, initialized.commentPeriodSectionDescription) && t.c(this.scaffoldData, initialized.scaffoldData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final CardListData getValidityPeriodCardListData() {
                return this.validityPeriodCardListData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getValidityPeriodSectionTitle() {
                return this.validityPeriodSectionTitle;
            }

            public int hashCode() {
                return (((((((((((((this.alertDescription.hashCode() * 31) + this.validityPeriodSectionTitle.hashCode()) * 31) + this.validityPeriodCardListData.hashCode()) * 31) + this.infoSectionTitle.hashCode()) * 31) + this.infoSectionCardListData.hashCode()) * 31) + this.commentPeriodSectionTitle.hashCode()) * 31) + this.commentPeriodSectionDescription.hashCode()) * 31) + this.scaffoldData.hashCode();
            }

            public String toString() {
                return "Initialized(alertDescription=" + this.alertDescription + ", validityPeriodSectionTitle=" + this.validityPeriodSectionTitle + ", validityPeriodCardListData=" + this.validityPeriodCardListData + ", infoSectionTitle=" + this.infoSectionTitle + ", infoSectionCardListData=" + this.infoSectionCardListData + ", commentPeriodSectionTitle=" + this.commentPeriodSectionTitle + ", commentPeriodSectionDescription=" + this.commentPeriodSectionDescription + ", scaffoldData=" + this.scaffoldData + ')';
            }
        }
    }
}

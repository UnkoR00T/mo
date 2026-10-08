package qp3;

import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import x40.LinkData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lqp3/c;", "Ll00/e;", "Lqp3/c$a;", "a", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lqp3/c$a;", "", "a", "b", "Lqp3/c$a$a;", "Lqp3/c$a$b;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: qp3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqp3/c$a$a;", "Lqp3/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4240a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4240a f167942a = new C4240a();

            private C4240a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4240a);
            }

            public int hashCode() {
                return 1245479880;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: qp3.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b\u001f\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u001b\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b'\u0010*¨\u0006+"}, d2 = {"Lqp3/c$a$b;", "Lqp3/c$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "infoTitle", "", "infoItems", "headerDescription", "currentRoundsTitle", "currentRoundsDescription", "goToWebsiteDescription", "Lx40/a;", "goToWebsiteLinkData", "<init>", "(Li50/a;Lmx/a;Ljava/util/List;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lx40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "h", "()Li50/a;", "b", "Lmx/a;", "g", "()Lmx/a;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "e", "Lx40/a;", "()Lx40/a;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label infoTitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Label> infoItems;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerDescription;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label currentRoundsTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label currentRoundsDescription;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label goToWebsiteDescription;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final LinkData goToWebsiteLinkData;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, List<Label> list, Label label2, Label label3, Label label4, Label label5, LinkData linkData) {
                this.scaffoldData = baseScaffoldData;
                this.infoTitle = label;
                this.infoItems = list;
                this.headerDescription = label2;
                this.currentRoundsTitle = label3;
                this.currentRoundsDescription = label4;
                this.goToWebsiteDescription = label5;
                this.goToWebsiteLinkData = linkData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getCurrentRoundsDescription() {
                return this.currentRoundsDescription;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getCurrentRoundsTitle() {
                return this.currentRoundsTitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getGoToWebsiteDescription() {
                return this.goToWebsiteDescription;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final LinkData getGoToWebsiteLinkData() {
                return this.goToWebsiteLinkData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getHeaderDescription() {
                return this.headerDescription;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return t.c(this.scaffoldData, initialized.scaffoldData) && t.c(this.infoTitle, initialized.infoTitle) && t.c(this.infoItems, initialized.infoItems) && t.c(this.headerDescription, initialized.headerDescription) && t.c(this.currentRoundsTitle, initialized.currentRoundsTitle) && t.c(this.currentRoundsDescription, initialized.currentRoundsDescription) && t.c(this.goToWebsiteDescription, initialized.goToWebsiteDescription) && t.c(this.goToWebsiteLinkData, initialized.goToWebsiteLinkData);
            }

            public final List<Label> f() {
                return this.infoItems;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getInfoTitle() {
                return this.infoTitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.scaffoldData.hashCode() * 31) + this.infoTitle.hashCode()) * 31) + this.infoItems.hashCode()) * 31) + this.headerDescription.hashCode()) * 31) + this.currentRoundsTitle.hashCode()) * 31;
                Label label = this.currentRoundsDescription;
                return ((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.goToWebsiteDescription.hashCode()) * 31) + this.goToWebsiteLinkData.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", infoTitle=" + this.infoTitle + ", infoItems=" + this.infoItems + ", headerDescription=" + this.headerDescription + ", currentRoundsTitle=" + this.currentRoundsTitle + ", currentRoundsDescription=" + this.currentRoundsDescription + ", goToWebsiteDescription=" + this.goToWebsiteDescription + ", goToWebsiteLinkData=" + this.goToWebsiteLinkData + ')';
            }
        }
    }
}

package eq3;

import b30.AccordionData;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import x40.LinkData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Leq3/c;", "Ll00/e;", "Leq3/c$a;", "a", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Leq3/c$a;", "", "a", "b", "Leq3/c$a$a;", "Leq3/c$a$b;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: eq3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Leq3/c$a$a;", "Leq3/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1246a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1246a f52822a = new C1246a();

            private C1246a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1246a);
            }

            public int hashCode() {
                return 1067489641;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: eq3.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b'\u0010*R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b/\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b3\u0010*R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b4\u0010*R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b.\u00106¨\u00067"}, d2 = {"Leq3/c$a$b;", "Leq3/c$a;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lmx/a;", "headerTitle", "headerDescription", "currentRoundsTitle", "currentRoundsDescription", "voteIdeaRoundsAccordionTitle", "Lb30/a;", "voteIdeaAccordionData", "whatNextTitle", "whatNextDescription", "goToWebsiteDescription", "Lx40/a;", "goToWebsiteLinkData", "<init>", "(Li50/a;Ler/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lb30/a;Lmx/a;Lmx/a;Lmx/a;Lx40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ler/a;", "()Ler/a;", "c", "Lmx/a;", "h", "()Lmx/a;", "d", "g", "e", "f", "j", "Lb30/a;", "i", "()Lb30/a;", "l", "k", "Lx40/a;", "()Lx40/a;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f52823m = (LinkData.f216731g | AccordionData.f16343b) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerDescription;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label currentRoundsTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label currentRoundsDescription;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label voteIdeaRoundsAccordionTitle;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData voteIdeaAccordionData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label whatNextTitle;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label whatNextDescription;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label goToWebsiteDescription;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final LinkData goToWebsiteLinkData;

            public Initialized(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, Label label, Label label2, Label label3, Label label4, Label label5, AccordionData accordionData, Label label6, Label label7, Label label8, LinkData linkData) {
                this.baseScaffoldData = baseScaffoldData;
                this.closeAction = aVar;
                this.headerTitle = label;
                this.headerDescription = label2;
                this.currentRoundsTitle = label3;
                this.currentRoundsDescription = label4;
                this.voteIdeaRoundsAccordionTitle = label5;
                this.voteIdeaAccordionData = accordionData;
                this.whatNextTitle = label6;
                this.whatNextDescription = label7;
                this.goToWebsiteDescription = label8;
                this.goToWebsiteLinkData = linkData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final er.a<i0> b() {
                return this.closeAction;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getCurrentRoundsDescription() {
                return this.currentRoundsDescription;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getCurrentRoundsTitle() {
                return this.currentRoundsTitle;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getGoToWebsiteDescription() {
                return this.goToWebsiteDescription;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return t.c(this.baseScaffoldData, initialized.baseScaffoldData) && t.c(this.closeAction, initialized.closeAction) && t.c(this.headerTitle, initialized.headerTitle) && t.c(this.headerDescription, initialized.headerDescription) && t.c(this.currentRoundsTitle, initialized.currentRoundsTitle) && t.c(this.currentRoundsDescription, initialized.currentRoundsDescription) && t.c(this.voteIdeaRoundsAccordionTitle, initialized.voteIdeaRoundsAccordionTitle) && t.c(this.voteIdeaAccordionData, initialized.voteIdeaAccordionData) && t.c(this.whatNextTitle, initialized.whatNextTitle) && t.c(this.whatNextDescription, initialized.whatNextDescription) && t.c(this.goToWebsiteDescription, initialized.goToWebsiteDescription) && t.c(this.goToWebsiteLinkData, initialized.goToWebsiteLinkData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final LinkData getGoToWebsiteLinkData() {
                return this.goToWebsiteLinkData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getHeaderDescription() {
                return this.headerDescription;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getHeaderTitle() {
                return this.headerTitle;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.baseScaffoldData.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.headerTitle.hashCode()) * 31) + this.headerDescription.hashCode()) * 31) + this.currentRoundsTitle.hashCode()) * 31;
                Label label = this.currentRoundsDescription;
                int iHashCode2 = (((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.voteIdeaRoundsAccordionTitle.hashCode()) * 31;
                AccordionData accordionData = this.voteIdeaAccordionData;
                return ((((((((iHashCode2 + (accordionData != null ? accordionData.hashCode() : 0)) * 31) + this.whatNextTitle.hashCode()) * 31) + this.whatNextDescription.hashCode()) * 31) + this.goToWebsiteDescription.hashCode()) * 31) + this.goToWebsiteLinkData.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final AccordionData getVoteIdeaAccordionData() {
                return this.voteIdeaAccordionData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getVoteIdeaRoundsAccordionTitle() {
                return this.voteIdeaRoundsAccordionTitle;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Label getWhatNextDescription() {
                return this.whatNextDescription;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getWhatNextTitle() {
                return this.whatNextTitle;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", closeAction=" + this.closeAction + ", headerTitle=" + this.headerTitle + ", headerDescription=" + this.headerDescription + ", currentRoundsTitle=" + this.currentRoundsTitle + ", currentRoundsDescription=" + this.currentRoundsDescription + ", voteIdeaRoundsAccordionTitle=" + this.voteIdeaRoundsAccordionTitle + ", voteIdeaAccordionData=" + this.voteIdeaAccordionData + ", whatNextTitle=" + this.whatNextTitle + ", whatNextDescription=" + this.whatNextDescription + ", goToWebsiteDescription=" + this.goToWebsiteDescription + ", goToWebsiteLinkData=" + this.goToWebsiteLinkData + ')';
            }
        }
    }
}

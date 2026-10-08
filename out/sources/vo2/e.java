package vo2;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lvo2/e;", "Ll00/e;", "Lvo2/e$a;", "a", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: vo2.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b#\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.¨\u0006/"}, d2 = {"Lvo2/e$a;", "", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Lt40/b;", "bulletList", "Lmx/a;", "footerTitle", "footerMessage", "Lh30/a;", "nextButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBackPressed", "<init>", "(Li50/a;Lo40/a;Lt40/b;Lmx/a;Lmx/a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lo40/a;", "e", "()Lo40/a;", "c", "Lt40/b;", "()Lt40/b;", "d", "Lmx/a;", "()Lmx/a;", "f", "Lh30/a;", "()Lh30/a;", "g", "Ler/a;", "()Ler/a;", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o40.a headerData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData bulletList;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label footerTitle;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label footerMessage;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        public Data(BaseScaffoldData baseScaffoldData, o40.a aVar, InfoRowListData infoRowListData, Label label, Label label2, ButtonData buttonData, er.a<i0> aVar2) {
            this.baseScaffoldData = baseScaffoldData;
            this.headerData = aVar;
            this.bulletList = infoRowListData;
            this.footerTitle = label;
            this.footerMessage = label2;
            this.nextButtonData = buttonData;
            this.onBackPressed = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InfoRowListData getBulletList() {
            return this.bulletList;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getFooterMessage() {
            return this.footerMessage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getFooterTitle() {
            return this.footerTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final o40.a getHeaderData() {
            return this.headerData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.headerData, data.headerData) && t.c(this.bulletList, data.bulletList) && t.c(this.footerTitle, data.footerTitle) && t.c(this.footerMessage, data.footerMessage) && t.c(this.nextButtonData, data.nextButtonData) && t.c(this.onBackPressed, data.onBackPressed);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        public final er.a<i0> g() {
            return this.onBackPressed;
        }

        public int hashCode() {
            return (((((((((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.bulletList.hashCode()) * 31) + this.footerTitle.hashCode()) * 31) + this.footerMessage.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.onBackPressed.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", bulletList=" + this.bulletList + ", footerTitle=" + this.footerTitle + ", footerMessage=" + this.footerMessage + ", nextButtonData=" + this.nextButtonData + ", onBackPressed=" + this.onBackPressed + ')';
        }
    }
}

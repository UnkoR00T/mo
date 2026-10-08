package j52;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lj52/e;", "Ll00/e;", "Lj52/e$a;", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: j52.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b#\u0010'¨\u0006("}, d2 = {"Lj52/e$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "sectionTitle", "Lt40/b;", "descriptionBulletsData", "Lh30/a;", "nextButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lmx/a;Lt40/b;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "e", "()Lmx/a;", "c", "Lt40/b;", "()Lt40/b;", "d", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f99534f = InfoRowListData.f187643b | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label sectionTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData descriptionBulletsData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        public Data(BaseScaffoldData baseScaffoldData, Label label, InfoRowListData infoRowListData, ButtonData buttonData, er.a<i0> aVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.sectionTitle = label;
            this.descriptionBulletsData = infoRowListData;
            this.nextButtonData = buttonData;
            this.onBackClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InfoRowListData getDescriptionBulletsData() {
            return this.descriptionBulletsData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        public final er.a<i0> d() {
            return this.onBackClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getSectionTitle() {
            return this.sectionTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.sectionTitle, data.sectionTitle) && t.c(this.descriptionBulletsData, data.descriptionBulletsData) && t.c(this.nextButtonData, data.nextButtonData) && t.c(this.onBackClick, data.onBackClick);
        }

        public int hashCode() {
            return (((((((this.baseScaffoldData.hashCode() * 31) + this.sectionTitle.hashCode()) * 31) + this.descriptionBulletsData.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", sectionTitle=" + this.sectionTitle + ", descriptionBulletsData=" + this.descriptionBulletsData + ", nextButtonData=" + this.nextButtonData + ", onBackClick=" + this.onBackClick + ')';
        }
    }
}

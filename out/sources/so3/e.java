package so3;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lso3/e;", "Ll00/e;", "Lso3/e$a;", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: so3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b\u001c\u0010'¨\u0006("}, d2 = {"Lso3/e$a;", "", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lo40/a;", "headerData", "Lt40/b;", "infoRowListData", "Lh30/a;", "buttonDescriptionData", "<init>", "(Li50/a;Ler/a;Lo40/a;Lt40/b;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ler/a;", "e", "()Ler/a;", "c", "Lo40/a;", "()Lo40/a;", "d", "Lt40/b;", "()Lt40/b;", "Lh30/a;", "()Lh30/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final o40.a headerData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData infoRowListData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonDescriptionData;

        public Data(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, o40.a aVar2, InfoRowListData infoRowListData, ButtonData buttonData) {
            this.baseScaffoldData = baseScaffoldData;
            this.onBackClick = aVar;
            this.headerData = aVar2;
            this.infoRowListData = infoRowListData;
            this.buttonDescriptionData = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ButtonData getButtonDescriptionData() {
            return this.buttonDescriptionData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final o40.a getHeaderData() {
            return this.headerData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InfoRowListData getInfoRowListData() {
            return this.infoRowListData;
        }

        public final er.a<i0> e() {
            return this.onBackClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.onBackClick, data.onBackClick) && t.c(this.headerData, data.headerData) && t.c(this.infoRowListData, data.infoRowListData) && t.c(this.buttonDescriptionData, data.buttonDescriptionData);
        }

        public int hashCode() {
            int iHashCode = ((((((this.baseScaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.headerData.hashCode()) * 31) + this.infoRowListData.hashCode()) * 31;
            ButtonData buttonData = this.buttonDescriptionData;
            return iHashCode + (buttonData == null ? 0 : buttonData.hashCode());
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", onBackClick=" + this.onBackClick + ", headerData=" + this.headerData + ", infoRowListData=" + this.infoRowListData + ", buttonDescriptionData=" + this.buttonDescriptionData + ')';
        }
    }
}

package ti3;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lti3/d;", "Ll00/e;", "Lti3/d$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: ti3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u0019\u0010#R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001d\u0010(¨\u0006)"}, d2 = {"Lti3/d$a;", "", "Li50/a;", "scaffoldData", "Lkotlin/Function0;", "Loq/i0;", "close", "Lmx/a;", "title", "description", "stepsTitle", "Lt40/b;", "infoRowList", "<init>", "(Li50/a;Ler/a;Lmx/a;Lmx/a;Lmx/a;Lt40/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Ler/a;", "getClose", "()Ler/a;", "Lmx/a;", "getTitle", "()Lmx/a;", "d", "e", "f", "Lt40/b;", "()Lt40/b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f190447g = InfoRowListData.f187643b | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> close;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label stepsTitle;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData infoRowList;

        public Data(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, Label label, Label label2, Label label3, InfoRowListData infoRowListData) {
            this.scaffoldData = baseScaffoldData;
            this.close = aVar;
            this.title = label;
            this.description = label2;
            this.stepsTitle = label3;
            this.infoRowList = infoRowListData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InfoRowListData getInfoRowList() {
            return this.infoRowList;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getStepsTitle() {
            return this.stepsTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.close, data.close) && t.c(this.title, data.title) && t.c(this.description, data.description) && t.c(this.stepsTitle, data.stepsTitle) && t.c(this.infoRowList, data.infoRowList);
        }

        public int hashCode() {
            return (((((((((this.scaffoldData.hashCode() * 31) + this.close.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.stepsTitle.hashCode()) * 31) + this.infoRowList.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", close=" + this.close + ", title=" + this.title + ", description=" + this.description + ", stepsTitle=" + this.stepsTitle + ", infoRowList=" + this.infoRowList + ')';
        }
    }
}

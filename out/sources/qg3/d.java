package qg3;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lqg3/d;", "Ll00/e;", "Lqg3/d$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: qg3.d$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\"R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006#"}, d2 = {"Lqg3/d$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "subTitle", "description", "stepsTitle", "Lt40/b;", "infoRowList", "footer", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Lt40/b;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "e", "Lt40/b;", "()Lt40/b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f166393g = InfoRowListData.f187643b | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label subTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label stepsTitle;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData infoRowList;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label footer;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, InfoRowListData infoRowListData, Label label4) {
            this.scaffoldData = baseScaffoldData;
            this.subTitle = label;
            this.description = label2;
            this.stepsTitle = label3;
            this.infoRowList = infoRowListData;
            this.footer = label4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getFooter() {
            return this.footer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InfoRowListData getInfoRowList() {
            return this.infoRowList;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.subTitle, data.subTitle) && t.c(this.description, data.description) && t.c(this.stepsTitle, data.stepsTitle) && t.c(this.infoRowList, data.infoRowList) && t.c(this.footer, data.footer);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getSubTitle() {
            return this.subTitle;
        }

        public int hashCode() {
            return (((((((((this.scaffoldData.hashCode() * 31) + this.subTitle.hashCode()) * 31) + this.description.hashCode()) * 31) + this.stepsTitle.hashCode()) * 31) + this.infoRowList.hashCode()) * 31) + this.footer.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", subTitle=" + this.subTitle + ", description=" + this.description + ", stepsTitle=" + this.stepsTitle + ", infoRowList=" + this.infoRowList + ", footer=" + this.footer + ')';
        }
    }
}

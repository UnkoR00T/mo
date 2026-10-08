package te3;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lte3/c;", "Ll00/e;", "Lte3/c$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: te3.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u0018\u0010#R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b \u0010#¨\u0006%"}, d2 = {"Lte3/c$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "personalSubtitle", "Ln30/b;", "personalDetails", "addressSubtitle", "addressDetails", "drivingCategoriesSubtitle", "drivingCategoriesDetails", "<init>", "(Li50/a;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "Ln30/b;", "e", "()Ln30/b;", "d", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f189993h = BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label personalSubtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData personalDetails;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label addressSubtitle;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData addressDetails;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label drivingCategoriesSubtitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData drivingCategoriesDetails;

        public Data(BaseScaffoldData baseScaffoldData, Label label, CardListData cardListData, Label label2, CardListData cardListData2, Label label3, CardListData cardListData3) {
            this.scaffoldData = baseScaffoldData;
            this.personalSubtitle = label;
            this.personalDetails = cardListData;
            this.addressSubtitle = label2;
            this.addressDetails = cardListData2;
            this.drivingCategoriesSubtitle = label3;
            this.drivingCategoriesDetails = cardListData3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getAddressDetails() {
            return this.addressDetails;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getAddressSubtitle() {
            return this.addressSubtitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CardListData getDrivingCategoriesDetails() {
            return this.drivingCategoriesDetails;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getDrivingCategoriesSubtitle() {
            return this.drivingCategoriesSubtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final CardListData getPersonalDetails() {
            return this.personalDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.personalSubtitle, data.personalSubtitle) && t.c(this.personalDetails, data.personalDetails) && t.c(this.addressSubtitle, data.addressSubtitle) && t.c(this.addressDetails, data.addressDetails) && t.c(this.drivingCategoriesSubtitle, data.drivingCategoriesSubtitle) && t.c(this.drivingCategoriesDetails, data.drivingCategoriesDetails);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getPersonalSubtitle() {
            return this.personalSubtitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public int hashCode() {
            return (((((((((((this.scaffoldData.hashCode() * 31) + this.personalSubtitle.hashCode()) * 31) + this.personalDetails.hashCode()) * 31) + this.addressSubtitle.hashCode()) * 31) + this.addressDetails.hashCode()) * 31) + this.drivingCategoriesSubtitle.hashCode()) * 31) + this.drivingCategoriesDetails.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", personalSubtitle=" + this.personalSubtitle + ", personalDetails=" + this.personalDetails + ", addressSubtitle=" + this.addressSubtitle + ", addressDetails=" + this.addressDetails + ", drivingCategoriesSubtitle=" + this.drivingCategoriesSubtitle + ", drivingCategoriesDetails=" + this.drivingCategoriesDetails + ')';
        }
    }
}

package xa0;

import fr.t;
import i50.BaseScaffoldData;
import n30.CardListData;
import p071kotlin.Metadata;
import za0.SchoolInfoSectionData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lxa0/c;", "Ll00/e;", "Lxa0/c$a;", "a", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: xa0.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lxa0/c$a;", "", "Li50/a;", "scaffoldData", "Ln30/b;", "schoolList", "Lza0/a;", "schoolInfoSection", "<init>", "(Li50/a;Ln30/b;Lza0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ln30/b;", "c", "()Ln30/b;", "Lza0/a;", "()Lza0/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f217741d = BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData schoolList;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final SchoolInfoSectionData schoolInfoSection;

        public Data(BaseScaffoldData baseScaffoldData, CardListData cardListData, SchoolInfoSectionData schoolInfoSectionData) {
            this.scaffoldData = baseScaffoldData;
            this.schoolList = cardListData;
            this.schoolInfoSection = schoolInfoSectionData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SchoolInfoSectionData getSchoolInfoSection() {
            return this.schoolInfoSection;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CardListData getSchoolList() {
            return this.schoolList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.schoolList, data.schoolList) && t.c(this.schoolInfoSection, data.schoolInfoSection);
        }

        public int hashCode() {
            int iHashCode = ((this.scaffoldData.hashCode() * 31) + this.schoolList.hashCode()) * 31;
            SchoolInfoSectionData schoolInfoSectionData = this.schoolInfoSection;
            return iHashCode + (schoolInfoSectionData == null ? 0 : schoolInfoSectionData.hashCode());
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", schoolList=" + this.schoolList + ", schoolInfoSection=" + this.schoolInfoSection + ')';
        }
    }
}

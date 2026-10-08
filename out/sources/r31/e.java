package r31;

import i50.BaseScaffoldData;
import j50.SearchBarData;
import oq.i0;
import p071kotlin.Metadata;
import t31.SearchScreenModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lr31/e;", "Ll00/e;", "Lr31/e$a;", "a", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: r31.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, d2 = {"Lr31/e$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "baseScaffoldData", "Lt31/b;", "searchScreenModel", "Lj50/e;", "searchBarData", "<init>", "(Ler/a;Li50/a;Lt31/b;Lj50/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "b", "()Ler/a;", "Li50/a;", "()Li50/a;", "c", "Lt31/b;", "d", "()Lt31/b;", "Lj50/e;", "()Lj50/e;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchScreenModel searchScreenModel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchBarData searchBarData;

        public Data(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, SearchScreenModel searchScreenModel, SearchBarData searchBarData) {
            this.onBack = aVar;
            this.baseScaffoldData = baseScaffoldData;
            this.searchScreenModel = searchScreenModel;
            this.searchBarData = searchBarData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final SearchBarData getSearchBarData() {
            return this.searchBarData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final SearchScreenModel getSearchScreenModel() {
            return this.searchScreenModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.onBack, data.onBack) && fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.searchScreenModel, data.searchScreenModel) && fr.t.c(this.searchBarData, data.searchBarData);
        }

        public int hashCode() {
            return (((((this.onBack.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.searchScreenModel.hashCode()) * 31) + this.searchBarData.hashCode();
        }

        public String toString() {
            return "Data(onBack=" + this.onBack + ", baseScaffoldData=" + this.baseScaffoldData + ", searchScreenModel=" + this.searchScreenModel + ", searchBarData=" + this.searchBarData + ')';
        }
    }
}

package h52;

import g52.StampDutyEmptySectionData;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import ja.n0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lh52/h;", "Ll00/e;", "Lh52/h$a;", "Lmu/g;", "Lja/n0;", "Ln50/k;", "y8", "()Lmu/g;", "institutionsPagingData", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends l00.e<Data> {

    /* JADX INFO: renamed from: h52.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJV\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b'\u0010,¨\u0006-"}, d2 = {"Lh52/h$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "titleLabel", "descriptionLabel", "Lg52/a;", "stampDutyEmptySectionData", "Lj50/e;", "searchBarData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lg52/a;Lj50/e;Ler/a;)V", "a", "(Li50/a;Lmx/a;Lmx/a;Lg52/a;Lj50/e;Ler/a;)Lh52/h$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li50/a;", "c", "()Li50/a;", "b", "Lmx/a;", "h", "()Lmx/a;", "d", "Lg52/a;", "g", "()Lg52/a;", "e", "Lj50/e;", "f", "()Lj50/e;", "Ler/a;", "()Ler/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f81051g = BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label titleLabel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label descriptionLabel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final StampDutyEmptySectionData stampDutyEmptySectionData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchBarData searchBarData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, StampDutyEmptySectionData stampDutyEmptySectionData, SearchBarData searchBarData, er.a<i0> aVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.titleLabel = label;
            this.descriptionLabel = label2;
            this.stampDutyEmptySectionData = stampDutyEmptySectionData;
            this.searchBarData = searchBarData;
            this.onBackClick = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data b(Data data, BaseScaffoldData baseScaffoldData, Label label, Label label2, StampDutyEmptySectionData stampDutyEmptySectionData, SearchBarData searchBarData, er.a aVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                baseScaffoldData = data.baseScaffoldData;
            }
            if ((i15 & 2) != 0) {
                label = data.titleLabel;
            }
            if ((i15 & 4) != 0) {
                label2 = data.descriptionLabel;
            }
            if ((i15 & 8) != 0) {
                stampDutyEmptySectionData = data.stampDutyEmptySectionData;
            }
            if ((i15 & 16) != 0) {
                searchBarData = data.searchBarData;
            }
            if ((i15 & 32) != 0) {
                aVar = data.onBackClick;
            }
            SearchBarData searchBarData2 = searchBarData;
            er.a aVar2 = aVar;
            return data.a(baseScaffoldData, label, label2, stampDutyEmptySectionData, searchBarData2, aVar2);
        }

        public final Data a(BaseScaffoldData baseScaffoldData, Label titleLabel, Label descriptionLabel, StampDutyEmptySectionData stampDutyEmptySectionData, SearchBarData searchBarData, er.a<i0> onBackClick) {
            return new Data(baseScaffoldData, titleLabel, descriptionLabel, stampDutyEmptySectionData, searchBarData, onBackClick);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getDescriptionLabel() {
            return this.descriptionLabel;
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
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.titleLabel, data.titleLabel) && fr.t.c(this.descriptionLabel, data.descriptionLabel) && fr.t.c(this.stampDutyEmptySectionData, data.stampDutyEmptySectionData) && fr.t.c(this.searchBarData, data.searchBarData) && fr.t.c(this.onBackClick, data.onBackClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final SearchBarData getSearchBarData() {
            return this.searchBarData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final StampDutyEmptySectionData getStampDutyEmptySectionData() {
            return this.stampDutyEmptySectionData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Label getTitleLabel() {
            return this.titleLabel;
        }

        public int hashCode() {
            int iHashCode = this.baseScaffoldData.hashCode() * 31;
            Label label = this.titleLabel;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            Label label2 = this.descriptionLabel;
            return ((((((iHashCode2 + (label2 != null ? label2.hashCode() : 0)) * 31) + this.stampDutyEmptySectionData.hashCode()) * 31) + this.searchBarData.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", titleLabel=" + this.titleLabel + ", descriptionLabel=" + this.descriptionLabel + ", stampDutyEmptySectionData=" + this.stampDutyEmptySectionData + ", searchBarData=" + this.searchBarData + ", onBackClick=" + this.onBackClick + ')';
        }
    }

    mu.g<n0<n50.k>> y8();
}

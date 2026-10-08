package a32;

import c32.DescriptionSectionData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j50.SearchBarData;
import oq.i0;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"La32/c;", "Ll00/e;", "La32/c$a;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: a32.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001c\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b \u0010'¨\u0006("}, d2 = {"La32/c$a;", "", "Li50/a;", "baseScaffoldData", "Lj50/e;", "searchState", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "Lc32/a;", CMSAttributeTableGenerator.CONTENT_TYPE, "Lc32/b;", "descriptionSectionData", "<init>", "(Li50/a;Lj50/e;Ler/a;Lc32/a;Lc32/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lj50/e;", "e", "()Lj50/e;", "c", "Ler/a;", "d", "()Ler/a;", "Lc32/a;", "()Lc32/a;", "Lc32/b;", "()Lc32/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f2407f = ButtonTextData.f99099f | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchBarData searchState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final c32.a contentType;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final DescriptionSectionData descriptionSectionData;

        public Data(BaseScaffoldData baseScaffoldData, SearchBarData searchBarData, er.a<i0> aVar, c32.a aVar2, DescriptionSectionData descriptionSectionData) {
            this.baseScaffoldData = baseScaffoldData;
            this.searchState = searchBarData;
            this.onCloseClick = aVar;
            this.contentType = aVar2;
            this.descriptionSectionData = descriptionSectionData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c32.a getContentType() {
            return this.contentType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DescriptionSectionData getDescriptionSectionData() {
            return this.descriptionSectionData;
        }

        public final er.a<i0> d() {
            return this.onCloseClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final SearchBarData getSearchState() {
            return this.searchState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.searchState, data.searchState) && fr.t.c(this.onCloseClick, data.onCloseClick) && fr.t.c(this.contentType, data.contentType) && fr.t.c(this.descriptionSectionData, data.descriptionSectionData);
        }

        public int hashCode() {
            return (((((((this.baseScaffoldData.hashCode() * 31) + this.searchState.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.descriptionSectionData.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", searchState=" + this.searchState + ", onCloseClick=" + this.onCloseClick + ", contentType=" + this.contentType + ", descriptionSectionData=" + this.descriptionSectionData + ')';
        }
    }
}

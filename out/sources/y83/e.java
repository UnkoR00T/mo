package y83;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import t40.InfoRowListData;
import x40.LinkData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ly83/e;", "Ll00/e;", "Ly83/e$a;", "a", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: y83.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Ly83/e$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "header", "Lt40/b;", "infoRowList", "Lx40/a;", "linkButton", "<init>", "(Li50/a;Lmx/a;Lt40/b;Lx40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "c", "Lt40/b;", "()Lt40/b;", "d", "Lx40/a;", "()Lx40/a;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f225323e = (LinkData.f216731g | InfoRowListData.f187643b) | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label header;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData infoRowList;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LinkData linkButton;

        public Data(BaseScaffoldData baseScaffoldData, Label label, InfoRowListData infoRowListData, LinkData linkData) {
            this.baseScaffoldData = baseScaffoldData;
            this.header = label;
            this.infoRowList = infoRowListData;
            this.linkButton = linkData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InfoRowListData getInfoRowList() {
            return this.infoRowList;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LinkData getLinkButton() {
            return this.linkButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.header, data.header) && t.c(this.infoRowList, data.infoRowList) && t.c(this.linkButton, data.linkButton);
        }

        public int hashCode() {
            int iHashCode = this.baseScaffoldData.hashCode() * 31;
            Label label = this.header;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            InfoRowListData infoRowListData = this.infoRowList;
            int iHashCode3 = (iHashCode2 + (infoRowListData == null ? 0 : infoRowListData.hashCode())) * 31;
            LinkData linkData = this.linkButton;
            return iHashCode3 + (linkData != null ? linkData.hashCode() : 0);
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", header=" + this.header + ", infoRowList=" + this.infoRowList + ", linkButton=" + this.linkButton + ')';
        }
    }
}

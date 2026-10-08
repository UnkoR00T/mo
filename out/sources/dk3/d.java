package dk3;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ldk3/d;", "Ll00/e;", "Ldk3/d$a;", "a", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: dk3.d$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Ldk3/d$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "description", "Lt40/b;", "bullets", "bottomSectionHeader", "bottomSectionText", "<init>", "(Li50/a;Lmx/a;Lt40/b;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "Lt40/b;", "()Lt40/b;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f43341f = InfoRowListData.f187643b | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData bullets;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label bottomSectionHeader;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label bottomSectionText;

        public Data(BaseScaffoldData baseScaffoldData, Label label, InfoRowListData infoRowListData, Label label2, Label label3) {
            this.scaffoldData = baseScaffoldData;
            this.description = label;
            this.bullets = infoRowListData;
            this.bottomSectionHeader = label2;
            this.bottomSectionText = label3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getBottomSectionHeader() {
            return this.bottomSectionHeader;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getBottomSectionText() {
            return this.bottomSectionText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InfoRowListData getBullets() {
            return this.bullets;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.description, data.description) && t.c(this.bullets, data.bullets) && t.c(this.bottomSectionHeader, data.bottomSectionHeader) && t.c(this.bottomSectionText, data.bottomSectionText);
        }

        public int hashCode() {
            return (((((((this.scaffoldData.hashCode() * 31) + this.description.hashCode()) * 31) + this.bullets.hashCode()) * 31) + this.bottomSectionHeader.hashCode()) * 31) + this.bottomSectionText.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", description=" + this.description + ", bullets=" + this.bullets + ", bottomSectionHeader=" + this.bottomSectionHeader + ", bottomSectionText=" + this.bottomSectionText + ')';
        }
    }
}

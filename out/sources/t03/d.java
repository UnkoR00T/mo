package t03;

import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lt03/d;", "Ll00/e;", "Lt03/d$a;", "a", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: t03.d$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001a\u0010#R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, d2 = {"Lt03/d$a;", "", "Li50/a;", "baseScaffoldData", "", "Lmx/a;", "paragraphs", "Lt40/b;", "bullets", "bottomSectionHeader", "bottomSectionText", "<init>", "(Li50/a;Ljava/util/List;Lt40/b;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Lt40/b;", "d", "()Lt40/b;", "Lmx/a;", "()Lmx/a;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Label> paragraphs;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData bullets;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label bottomSectionHeader;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label bottomSectionText;

        public Data(BaseScaffoldData baseScaffoldData, List<Label> list, InfoRowListData infoRowListData, Label label, Label label2) {
            this.baseScaffoldData = baseScaffoldData;
            this.paragraphs = list;
            this.bullets = infoRowListData;
            this.bottomSectionHeader = label;
            this.bottomSectionText = label2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getBottomSectionHeader() {
            return this.bottomSectionHeader;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getBottomSectionText() {
            return this.bottomSectionText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InfoRowListData getBullets() {
            return this.bullets;
        }

        public final List<Label> e() {
            return this.paragraphs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.paragraphs, data.paragraphs) && t.c(this.bullets, data.bullets) && t.c(this.bottomSectionHeader, data.bottomSectionHeader) && t.c(this.bottomSectionText, data.bottomSectionText);
        }

        public int hashCode() {
            return (((((((this.baseScaffoldData.hashCode() * 31) + this.paragraphs.hashCode()) * 31) + this.bullets.hashCode()) * 31) + this.bottomSectionHeader.hashCode()) * 31) + this.bottomSectionText.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", paragraphs=" + this.paragraphs + ", bullets=" + this.bullets + ", bottomSectionHeader=" + this.bottomSectionHeader + ", bottomSectionText=" + this.bottomSectionText + ')';
        }
    }
}

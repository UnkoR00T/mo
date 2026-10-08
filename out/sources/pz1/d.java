package pz1;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import t40.InfoRowListData;
import x40.LinkData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lpz1/d;", "Ll00/e;", "Lpz1/d$a;", "a", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: pz1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006$"}, d2 = {"Lpz1/d$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "Lt40/b;", "bullets", "moreInfoLabel", "Lx40/a;", "moreInfoLinkData", "<init>", "(Li50/a;Lmx/a;Lt40/b;Lmx/a;Lx40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lmx/a;", "e", "()Lmx/a;", "c", "Lt40/b;", "()Lt40/b;", "Lx40/a;", "()Lx40/a;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f163303f = (LinkData.f216731g | InfoRowListData.f187643b) | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData bullets;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label moreInfoLabel;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final LinkData moreInfoLinkData;

        public Data(BaseScaffoldData baseScaffoldData, Label label, InfoRowListData infoRowListData, Label label2, LinkData linkData) {
            this.scaffoldData = baseScaffoldData;
            this.title = label;
            this.bullets = infoRowListData;
            this.moreInfoLabel = label2;
            this.moreInfoLinkData = linkData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InfoRowListData getBullets() {
            return this.bullets;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getMoreInfoLabel() {
            return this.moreInfoLabel;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LinkData getMoreInfoLinkData() {
            return this.moreInfoLinkData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.title, data.title) && t.c(this.bullets, data.bullets) && t.c(this.moreInfoLabel, data.moreInfoLabel) && t.c(this.moreInfoLinkData, data.moreInfoLinkData);
        }

        public int hashCode() {
            return (((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.bullets.hashCode()) * 31) + this.moreInfoLabel.hashCode()) * 31) + this.moreInfoLinkData.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", bullets=" + this.bullets + ", moreInfoLabel=" + this.moreInfoLabel + ", moreInfoLinkData=" + this.moreInfoLinkData + ')';
        }
    }
}

package aj1;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Laj1/e;", "Ll00/e;", "Laj1/e$a;", "a", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: aj1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001b\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001f\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b'\u0010+¨\u0006,"}, d2 = {"Laj1/e$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "header", "description", "Lt40/b;", "infoRowList", "formLinkDescription", "Lx40/a;", "formLinkData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lt40/b;Lmx/a;Lx40/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "Lt40/b;", "e", "()Lt40/b;", "f", "Lx40/a;", "()Lx40/a;", "Ler/a;", "()Ler/a;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f6693h = (LinkData.f216731g | InfoRowListData.f187643b) | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label header;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData infoRowList;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label formLinkDescription;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final LinkData formLinkData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, InfoRowListData infoRowListData, Label label3, LinkData linkData, er.a<i0> aVar) {
            this.scaffoldData = baseScaffoldData;
            this.header = label;
            this.description = label2;
            this.infoRowList = infoRowListData;
            this.formLinkDescription = label3;
            this.formLinkData = linkData;
            this.onBackClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LinkData getFormLinkData() {
            return this.formLinkData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getFormLinkDescription() {
            return this.formLinkDescription;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InfoRowListData getInfoRowList() {
            return this.infoRowList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.header, data.header) && t.c(this.description, data.description) && t.c(this.infoRowList, data.infoRowList) && t.c(this.formLinkDescription, data.formLinkDescription) && t.c(this.formLinkData, data.formLinkData) && t.c(this.onBackClick, data.onBackClick);
        }

        public final er.a<i0> f() {
            return this.onBackClick;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public int hashCode() {
            return (((((((((((this.scaffoldData.hashCode() * 31) + this.header.hashCode()) * 31) + this.description.hashCode()) * 31) + this.infoRowList.hashCode()) * 31) + this.formLinkDescription.hashCode()) * 31) + this.formLinkData.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", header=" + this.header + ", description=" + this.description + ", infoRowList=" + this.infoRowList + ", formLinkDescription=" + this.formLinkDescription + ", formLinkData=" + this.formLinkData + ", onBackClick=" + this.onBackClick + ')';
        }
    }
}

package cb3;

import android.text.Spanned;
import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcb3/f;", "Ll00/e;", "Lcb3/f$a;", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: cb3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u001b\u0010%R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b&\u0010(R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b\u001f\u0010*¨\u0006+"}, d2 = {"Lcb3/f$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "Landroid/text/Spanned;", "summary", "content", "", "Lcb3/f$a$a;", "sections", "Lkotlin/Function1;", "", "Loq/i0;", "onUrlClick", "<init>", "(Li50/a;Lmx/a;Landroid/text/Spanned;Landroid/text/Spanned;Ljava/util/List;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "Landroid/text/Spanned;", "e", "()Landroid/text/Spanned;", "d", "Ljava/util/List;", "()Ljava/util/List;", "Ler/l;", "()Ler/l;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Spanned summary;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Spanned content;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Section> sections;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onUrlClick;

        /* JADX INFO: renamed from: cb3.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcb3/f$a$a;", "", "Lmx/a;", "title", "Landroid/text/Spanned;", "description", "<init>", "(Lmx/a;Landroid/text/Spanned;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Landroid/text/Spanned;", "()Landroid/text/Spanned;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Section {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Spanned description;

            public Section(Label label, Spanned spanned) {
                this.title = label;
                this.description = spanned;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Spanned getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Section)) {
                    return false;
                }
                Section section = (Section) other;
                return t.c(this.title, section.title) && t.c(this.description, section.description);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.description.hashCode();
            }

            public String toString() {
                return "Section(title=" + this.title + ", description=" + ((Object) this.description) + ')';
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, Label label, Spanned spanned, Spanned spanned2, List<Section> list, er.l<? super String, i0> lVar) {
            this.scaffoldData = baseScaffoldData;
            this.title = label;
            this.summary = spanned;
            this.content = spanned2;
            this.sections = list;
            this.onUrlClick = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Spanned getContent() {
            return this.content;
        }

        public final er.l<String, i0> b() {
            return this.onUrlClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public final List<Section> d() {
            return this.sections;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Spanned getSummary() {
            return this.summary;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.title, data.title) && t.c(this.summary, data.summary) && t.c(this.content, data.content) && t.c(this.sections, data.sections) && t.c(this.onUrlClick, data.onUrlClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.content.hashCode()) * 31;
            List<Section> list = this.sections;
            return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.onUrlClick.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", summary=" + ((Object) this.summary) + ", content=" + ((Object) this.content) + ", sections=" + this.sections + ", onUrlClick=" + this.onUrlClick + ')';
        }
    }
}

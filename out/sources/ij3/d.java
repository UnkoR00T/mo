package ij3;

import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lij3/d;", "Ll00/e;", "Lij3/d$a;", "a", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: ij3.d$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lij3/d$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "description", "", "Lij3/d$a$a;", "sections", "summary", "<init>", "(Li50/a;Lmx/a;Ljava/util/List;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "()Lmx/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Section> sections;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label summary;

        /* JADX INFO: renamed from: ij3.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lij3/d$a$a;", "", "Lmx/a;", "header", "", "paragraphs", "<init>", "(Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Section {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label header;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Label> paragraphs;

            public Section(Label label, List<Label> list) {
                this.header = label;
                this.paragraphs = list;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getHeader() {
                return this.header;
            }

            public final List<Label> b() {
                return this.paragraphs;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Section)) {
                    return false;
                }
                Section section = (Section) other;
                return t.c(this.header, section.header) && t.c(this.paragraphs, section.paragraphs);
            }

            public int hashCode() {
                return (this.header.hashCode() * 31) + this.paragraphs.hashCode();
            }

            public String toString() {
                return "Section(header=" + this.header + ", paragraphs=" + this.paragraphs + ')';
            }
        }

        public Data(BaseScaffoldData baseScaffoldData, Label label, List<Section> list, Label label2) {
            this.scaffoldData = baseScaffoldData;
            this.description = label;
            this.sections = list;
            this.summary = label2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public final List<Section> c() {
            return this.sections;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getSummary() {
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
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.description, data.description) && t.c(this.sections, data.sections) && t.c(this.summary, data.summary);
        }

        public int hashCode() {
            return (((((this.scaffoldData.hashCode() * 31) + this.description.hashCode()) * 31) + this.sections.hashCode()) * 31) + this.summary.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", description=" + this.description + ", sections=" + this.sections + ", summary=" + this.summary + ')';
        }
    }
}

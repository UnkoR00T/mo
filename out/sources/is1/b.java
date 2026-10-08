package is1;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lis1/b;", "Ll00/e;", "Lis1/b$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends l00.e<Data> {

    /* JADX INFO: renamed from: is1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lis1/b$a;", "", "Lmx/a;", "firstLabel", "second1Label", "second2Label", "<init>", "(Lmx/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "c", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label firstLabel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label second1Label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label second2Label;

        public Data(Label label, Label label2, Label label3) {
            this.firstLabel = label;
            this.second1Label = label2;
            this.second2Label = label3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getFirstLabel() {
            return this.firstLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getSecond1Label() {
            return this.second1Label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getSecond2Label() {
            return this.second2Label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.firstLabel, data.firstLabel) && t.c(this.second1Label, data.second1Label) && t.c(this.second2Label, data.second2Label);
        }

        public int hashCode() {
            return (((this.firstLabel.hashCode() * 31) + this.second1Label.hashCode()) * 31) + this.second2Label.hashCode();
        }

        public String toString() {
            return "Data(firstLabel=" + this.firstLabel + ", second1Label=" + this.second1Label + ", second2Label=" + this.second2Label + ')';
        }
    }
}

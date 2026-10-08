package hf3;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhf3/d;", "Ll00/e;", "Lhf3/d$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: hf3.d$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"Lhf3/d$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "Ln50/k;", "victimSingleCardData", "perpetratorSingleCardData", "<init>", "(Li50/a;Lmx/a;Ln50/k;Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "c", "()Lmx/a;", "Ln50/k;", "d", "()Ln50/k;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final n50.k victimSingleCardData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final n50.k perpetratorSingleCardData;

        public Data(BaseScaffoldData baseScaffoldData, Label label, n50.k kVar, n50.k kVar2) {
            this.baseScaffoldData = baseScaffoldData;
            this.title = label;
            this.victimSingleCardData = kVar;
            this.perpetratorSingleCardData = kVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n50.k getPerpetratorSingleCardData() {
            return this.perpetratorSingleCardData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final n50.k getVictimSingleCardData() {
            return this.victimSingleCardData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.title, data.title) && t.c(this.victimSingleCardData, data.victimSingleCardData) && t.c(this.perpetratorSingleCardData, data.perpetratorSingleCardData);
        }

        public int hashCode() {
            return (((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.victimSingleCardData.hashCode()) * 31) + this.perpetratorSingleCardData.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", victimSingleCardData=" + this.victimSingleCardData + ", perpetratorSingleCardData=" + this.perpetratorSingleCardData + ')';
        }
    }
}

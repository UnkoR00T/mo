package ds1;

import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lds1/g;", "Ll00/e;", "Lds1/g$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<Data> {

    /* JADX INFO: renamed from: ds1.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006\""}, d2 = {"Lds1/g$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onSetVersionOverride", "onClearVersionOverride", "Lmx/a;", "currentAppVersion", "Lv50/c$g;", "inputData", "<init>", "(Ler/a;Ler/a;Ler/a;Lmx/a;Lv50/c$g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "c", "()Ler/a;", "b", "e", "d", "Lmx/a;", "()Lmx/a;", "Lv50/c$g;", "()Lv50/c$g;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f44299f = v50.c.Text.P;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSetVersionOverride;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClearVersionOverride;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label currentAppVersion;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text inputData;

        public Data(er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, Label label, v50.c.Text text) {
            this.onBack = aVar;
            this.onSetVersionOverride = aVar2;
            this.onClearVersionOverride = aVar3;
            this.currentAppVersion = label;
            this.inputData = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final v50.c.Text getInputData() {
            return this.inputData;
        }

        public final er.a<i0> c() {
            return this.onBack;
        }

        public final er.a<i0> d() {
            return this.onClearVersionOverride;
        }

        public final er.a<i0> e() {
            return this.onSetVersionOverride;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.onBack, data.onBack) && fr.t.c(this.onSetVersionOverride, data.onSetVersionOverride) && fr.t.c(this.onClearVersionOverride, data.onClearVersionOverride) && fr.t.c(this.currentAppVersion, data.currentAppVersion) && fr.t.c(this.inputData, data.inputData);
        }

        public int hashCode() {
            return (((((((this.onBack.hashCode() * 31) + this.onSetVersionOverride.hashCode()) * 31) + this.onClearVersionOverride.hashCode()) * 31) + this.currentAppVersion.hashCode()) * 31) + this.inputData.hashCode();
        }

        public String toString() {
            return "Data(onBack=" + this.onBack + ", onSetVersionOverride=" + this.onSetVersionOverride + ", onClearVersionOverride=" + this.onClearVersionOverride + ", currentAppVersion=" + this.currentAppVersion + ", inputData=" + this.inputData + ')';
        }
    }
}

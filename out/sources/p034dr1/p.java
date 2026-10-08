package p034dr1;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import l00.e;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ldr1/p;", "Ll00/e;", "Ldr1/p$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p extends e<Data> {

    /* JADX INFO: renamed from: dr1.p$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Ldr1/p$a;", "", "Li50/a;", "scaffoldData", "Lh30/a;", "smallButtonData", "mediumButtonData", "largeButtonData", "<init>", "(Li50/a;Lh30/a;Lh30/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lh30/a;", "d", "()Lh30/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f44235e = BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData smallButtonData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData mediumButtonData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData largeButtonData;

        public Data(BaseScaffoldData baseScaffoldData, ButtonData buttonData, ButtonData buttonData2, ButtonData buttonData3) {
            this.scaffoldData = baseScaffoldData;
            this.smallButtonData = buttonData;
            this.mediumButtonData = buttonData2;
            this.largeButtonData = buttonData3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getLargeButtonData() {
            return this.largeButtonData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ButtonData getMediumButtonData() {
            return this.mediumButtonData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getSmallButtonData() {
            return this.smallButtonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.smallButtonData, data.smallButtonData) && t.c(this.mediumButtonData, data.mediumButtonData) && t.c(this.largeButtonData, data.largeButtonData);
        }

        public int hashCode() {
            return (((((this.scaffoldData.hashCode() * 31) + this.smallButtonData.hashCode()) * 31) + this.mediumButtonData.hashCode()) * 31) + this.largeButtonData.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", smallButtonData=" + this.smallButtonData + ", mediumButtonData=" + this.mediumButtonData + ", largeButtonData=" + this.largeButtonData + ')';
        }
    }
}

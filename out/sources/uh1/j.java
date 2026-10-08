package uh1;

import f30.BottomNavigationData;
import i50.BaseScaffoldData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u0005¨\u0006\fÀ\u0006\u0003"}, d2 = {"Luh1/j;", "Ll00/e;", "Luh1/j$a;", "Loq/i0;", "n", "()V", "Luh1/g;", "dashboardTab", "c1", "(Luh1/g;)V", "U6", "a", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends l00.e<Data> {

    /* JADX INFO: renamed from: uh1.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Luh1/j$a;", "", "Li50/a;", "baseScaffoldData", "Lf30/a;", "bottomNavigationData", "", "isImeVisible", "<init>", "(Li50/a;Lf30/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lf30/a;", "()Lf30/a;", "c", "Z", "()Z", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f198444d = BottomNavigationData.f58833c | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BottomNavigationData bottomNavigationData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isImeVisible;

        public Data(BaseScaffoldData baseScaffoldData, BottomNavigationData bottomNavigationData, boolean z15) {
            this.baseScaffoldData = baseScaffoldData;
            this.bottomNavigationData = bottomNavigationData;
            this.isImeVisible = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BottomNavigationData getBottomNavigationData() {
            return this.bottomNavigationData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsImeVisible() {
            return this.isImeVisible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.bottomNavigationData, data.bottomNavigationData) && this.isImeVisible == data.isImeVisible;
        }

        public int hashCode() {
            return (((this.baseScaffoldData.hashCode() * 31) + this.bottomNavigationData.hashCode()) * 31) + Boolean.hashCode(this.isImeVisible);
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", bottomNavigationData=" + this.bottomNavigationData + ", isImeVisible=" + this.isImeVisible + ')';
        }
    }

    void U6();

    void c1(g dashboardTab);

    void n();
}

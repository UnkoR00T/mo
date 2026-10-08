package sr1;

import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsr1/c;", "Ll00/e;", "Lsr1/c$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lsr1/c$a;", "", "a", "b", "Lsr1/c$a$a;", "Lsr1/c$a$b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: sr1.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsr1/c$a$a;", "Lsr1/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4728a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4728a f183725a = new C4728a();

            private C4728a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4728a);
            }

            public int hashCode() {
                return 1968830521;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: sr1.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b$\u0010*¨\u0006+"}, d2 = {"Lsr1/c$a$b;", "Lsr1/c$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "lastRefreshTimeLabel", "", "Ln50/k;", "elementsCardListData", "", "isRefreshing", "Lkotlin/Function0;", "Loq/i0;", "onRefresh", "onBack", "<init>", "(Li50/a;Lmx/a;Ljava/util/List;ZLer/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "c", "()Lmx/a;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Z", "f", "()Z", "e", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label lastRefreshTimeLabel;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n50.k> elementsCardListData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isRefreshing;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onRefresh;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(BaseScaffoldData baseScaffoldData, Label label, List<? extends n50.k> list, boolean z15, er.a<i0> aVar, er.a<i0> aVar2) {
                this.baseScaffoldData = baseScaffoldData;
                this.lastRefreshTimeLabel = label;
                this.elementsCardListData = list;
                this.isRefreshing = z15;
                this.onRefresh = aVar;
                this.onBack = aVar2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final List<n50.k> b() {
                return this.elementsCardListData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getLastRefreshTimeLabel() {
                return this.lastRefreshTimeLabel;
            }

            public final er.a<i0> d() {
                return this.onBack;
            }

            public final er.a<i0> e() {
                return this.onRefresh;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.lastRefreshTimeLabel, initialized.lastRefreshTimeLabel) && fr.t.c(this.elementsCardListData, initialized.elementsCardListData) && this.isRefreshing == initialized.isRefreshing && fr.t.c(this.onRefresh, initialized.onRefresh) && fr.t.c(this.onBack, initialized.onBack);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final boolean getIsRefreshing() {
                return this.isRefreshing;
            }

            public int hashCode() {
                return (((((((((this.baseScaffoldData.hashCode() * 31) + this.lastRefreshTimeLabel.hashCode()) * 31) + this.elementsCardListData.hashCode()) * 31) + Boolean.hashCode(this.isRefreshing)) * 31) + this.onRefresh.hashCode()) * 31) + this.onBack.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", lastRefreshTimeLabel=" + this.lastRefreshTimeLabel + ", elementsCardListData=" + this.elementsCardListData + ", isRefreshing=" + this.isRefreshing + ", onRefresh=" + this.onRefresh + ", onBack=" + this.onBack + ')';
            }
        }
    }
}

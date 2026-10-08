package sy0;

import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n50.DefaultSingleCardData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsy0/e;", "Ll00/e;", "Lsy0/e$a;", "a", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lsy0/e$a;", "", "b", "a", "Lsy0/e$a$a;", "Lsy0/e$a$b;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: sy0.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsy0/e$a$a;", "Lsy0/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4795a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4795a f185588a = new C4795a();

            private C4795a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4795a);
            }

            public int hashCode() {
                return -30816771;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: sy0.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R)\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006*"}, d2 = {"Lsy0/e$a$b;", "Lsy0/e$a;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lmx/a;", "headerLabel", "", "Ln50/g;", "pointsCardDataList", "Lkotlin/Function2;", "", "reorderFavoritePointsList", "<init>", "(Li50/a;Ler/a;Lmx/a;Ljava/util/List;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ler/a;", "()Ler/a;", "c", "Lmx/a;", "()Lmx/a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "Ler/p;", "()Ler/p;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerLabel;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<DefaultSingleCardData> pointsCardDataList;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.p<Integer, Integer, i0> reorderFavoritePointsList;

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, Label label, List<DefaultSingleCardData> list, er.p<? super Integer, ? super Integer, i0> pVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.closeAction = aVar;
                this.headerLabel = label;
                this.pointsCardDataList = list;
                this.reorderFavoritePointsList = pVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final er.a<i0> b() {
                return this.closeAction;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getHeaderLabel() {
                return this.headerLabel;
            }

            public final List<DefaultSingleCardData> d() {
                return this.pointsCardDataList;
            }

            public final er.p<Integer, Integer, i0> e() {
                return this.reorderFavoritePointsList;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.closeAction, initialized.closeAction) && fr.t.c(this.headerLabel, initialized.headerLabel) && fr.t.c(this.pointsCardDataList, initialized.pointsCardDataList) && fr.t.c(this.reorderFavoritePointsList, initialized.reorderFavoritePointsList);
            }

            public int hashCode() {
                return (((((((this.baseScaffoldData.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.headerLabel.hashCode()) * 31) + this.pointsCardDataList.hashCode()) * 31) + this.reorderFavoritePointsList.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", closeAction=" + this.closeAction + ", headerLabel=" + this.headerLabel + ", pointsCardDataList=" + this.pointsCardDataList + ", reorderFavoritePointsList=" + this.reorderFavoritePointsList + ')';
            }
        }
    }
}

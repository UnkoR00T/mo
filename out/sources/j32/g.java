package j32;

import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import x40.LinkData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lj32/g;", "Ll00/e;", "Lj32/g$a;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lj32/g$a;", "", "a", "b", "Lj32/g$a$a;", "Lj32/g$a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: j32.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj32/g$a$a;", "Lj32/g$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C2328a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2328a f99256a = new C2328a();

            private C2328a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2328a);
            }

            public int hashCode() {
                return 1439289848;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: j32.g$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010 ¨\u0006*"}, d2 = {"Lj32/g$a$b;", "Lj32/g$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "names", "Ln30/b;", "edorInfoCardList", "Ln50/k;", "epuapItem", "Lx40/a;", "linkData", "bottomLabel", "<init>", "(Li50/a;Lmx/a;Ln30/b;Ln50/k;Lx40/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "Ln30/b;", "()Ln30/b;", "d", "Ln50/k;", "()Ln50/k;", "e", "Lx40/a;", "()Lx40/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label names;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData edorInfoCardList;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k epuapItem;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final LinkData linkData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label bottomLabel;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, CardListData cardListData, n50.k kVar, LinkData linkData, Label label2) {
                this.baseScaffoldData = baseScaffoldData;
                this.names = label;
                this.edorInfoCardList = cardListData;
                this.epuapItem = kVar;
                this.linkData = linkData;
                this.bottomLabel = label2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getBottomLabel() {
                return this.bottomLabel;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CardListData getEdorInfoCardList() {
                return this.edorInfoCardList;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final n50.k getEpuapItem() {
                return this.epuapItem;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final LinkData getLinkData() {
                return this.linkData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.names, initialized.names) && fr.t.c(this.edorInfoCardList, initialized.edorInfoCardList) && fr.t.c(this.epuapItem, initialized.epuapItem) && fr.t.c(this.linkData, initialized.linkData) && fr.t.c(this.bottomLabel, initialized.bottomLabel);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getNames() {
                return this.names;
            }

            public int hashCode() {
                int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.names.hashCode()) * 31;
                CardListData cardListData = this.edorInfoCardList;
                return ((((((iHashCode + (cardListData == null ? 0 : cardListData.hashCode())) * 31) + this.epuapItem.hashCode()) * 31) + this.linkData.hashCode()) * 31) + this.bottomLabel.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", names=" + this.names + ", edorInfoCardList=" + this.edorInfoCardList + ", epuapItem=" + this.epuapItem + ", linkData=" + this.linkData + ", bottomLabel=" + this.bottomLabel + ')';
            }
        }
    }
}

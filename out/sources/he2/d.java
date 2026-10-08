package he2;

import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhe2/d;", "Ll00/e;", "Lhe2/d$a;", "a", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: he2.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u001d\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b \u0010'¨\u0006("}, d2 = {"Lhe2/d$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "Ln30/b;", "categoriesCardListData", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Ler/a;Li50/a;Lmx/a;Ln30/b;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "d", "()Ler/a;", "b", "Li50/a;", "()Li50/a;", "c", "Lmx/a;", "e", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "Lcb4/i;", "()Lcb4/i;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData categoriesCardListData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        public Data(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, Label label, CardListData cardListData, cb4.i iVar) {
            this.onBackClick = aVar;
            this.baseScaffoldData = baseScaffoldData;
            this.title = label;
            this.categoriesCardListData = cardListData;
            this.dialogVMSAdapter = iVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CardListData getCategoriesCardListData() {
            return this.categoriesCardListData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        public final er.a<i0> d() {
            return this.onBackClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.onBackClick, data.onBackClick) && fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.title, data.title) && fr.t.c(this.categoriesCardListData, data.categoriesCardListData) && fr.t.c(this.dialogVMSAdapter, data.dialogVMSAdapter);
        }

        public int hashCode() {
            int iHashCode = ((((((this.onBackClick.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.title.hashCode()) * 31) + this.categoriesCardListData.hashCode()) * 31;
            cb4.i iVar = this.dialogVMSAdapter;
            return iHashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        public String toString() {
            return "Data(onBackClick=" + this.onBackClick + ", baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", categoriesCardListData=" + this.categoriesCardListData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
        }
    }
}

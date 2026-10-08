package y33;

import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ly33/c;", "Ll00/e;", "Ly33/c$a;", "a", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: y33.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001d\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"Ly33/c$a;", "", "Lcb4/i;", "dialogVMSAdapter", "Li50/a;", "baseScaffoldData", "Lmx/a;", "headline", "Ln30/b;", "cards", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Lcb4/i;Li50/a;Lmx/a;Ln30/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "c", "()Lcb4/i;", "b", "Li50/a;", "()Li50/a;", "Lmx/a;", "d", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "e", "Ler/a;", "()Ler/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label headline;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData cards;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Data(cb4.i iVar, BaseScaffoldData baseScaffoldData, Label label, CardListData cardListData, er.a<i0> aVar) {
            this.dialogVMSAdapter = iVar;
            this.baseScaffoldData = baseScaffoldData;
            this.headline = label;
            this.cards = cardListData;
            this.onBack = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CardListData getCards() {
            return this.cards;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getHeadline() {
            return this.headline;
        }

        public final er.a<i0> e() {
            return this.onBack;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.dialogVMSAdapter, data.dialogVMSAdapter) && fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.headline, data.headline) && fr.t.c(this.cards, data.cards) && fr.t.c(this.onBack, data.onBack);
        }

        public int hashCode() {
            cb4.i iVar = this.dialogVMSAdapter;
            return ((((((((iVar == null ? 0 : iVar.hashCode()) * 31) + this.baseScaffoldData.hashCode()) * 31) + this.headline.hashCode()) * 31) + this.cards.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Data(dialogVMSAdapter=" + this.dialogVMSAdapter + ", baseScaffoldData=" + this.baseScaffoldData + ", headline=" + this.headline + ", cards=" + this.cards + ", onBack=" + this.onBack + ')';
        }
    }
}

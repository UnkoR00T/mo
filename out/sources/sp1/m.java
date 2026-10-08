package sp1;

import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsp1/m;", "Ll00/e;", "Lsp1/m$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m extends l00.e<Data> {

    /* JADX INFO: renamed from: sp1.m$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lsp1/m$a;", "", "Ln30/b;", "radioButtonCardListDefault", "radioButtonCardListError", "checkboxCardListDefault", "checkboxCardListError", "Lkotlin/Function0;", "Loq/i0;", "onClose", "<init>", "(Ln30/b;Ln30/b;Ln30/b;Ln30/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "d", "()Ln30/b;", "b", "e", "c", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData radioButtonCardListDefault;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData radioButtonCardListError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData checkboxCardListDefault;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData checkboxCardListError;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public Data(CardListData cardListData, CardListData cardListData2, CardListData cardListData3, CardListData cardListData4, er.a<i0> aVar) {
            this.radioButtonCardListDefault = cardListData;
            this.radioButtonCardListError = cardListData2;
            this.checkboxCardListDefault = cardListData3;
            this.checkboxCardListError = cardListData4;
            this.onClose = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getCheckboxCardListDefault() {
            return this.checkboxCardListDefault;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CardListData getCheckboxCardListError() {
            return this.checkboxCardListError;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final CardListData getRadioButtonCardListDefault() {
            return this.radioButtonCardListDefault;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final CardListData getRadioButtonCardListError() {
            return this.radioButtonCardListError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.radioButtonCardListDefault, data.radioButtonCardListDefault) && fr.t.c(this.radioButtonCardListError, data.radioButtonCardListError) && fr.t.c(this.checkboxCardListDefault, data.checkboxCardListDefault) && fr.t.c(this.checkboxCardListError, data.checkboxCardListError) && fr.t.c(this.onClose, data.onClose);
        }

        public int hashCode() {
            return (((((((this.radioButtonCardListDefault.hashCode() * 31) + this.radioButtonCardListError.hashCode()) * 31) + this.checkboxCardListDefault.hashCode()) * 31) + this.checkboxCardListError.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Data(radioButtonCardListDefault=" + this.radioButtonCardListDefault + ", radioButtonCardListError=" + this.radioButtonCardListError + ", checkboxCardListDefault=" + this.checkboxCardListDefault + ", checkboxCardListError=" + this.checkboxCardListError + ", onClose=" + this.onClose + ')';
        }
    }
}

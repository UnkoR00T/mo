package pr1;

import android.text.Spanned;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lpr1/e;", "Ll00/e;", "Lpr1/e$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: pr1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001f\u0010%¨\u0006&"}, d2 = {"Lpr1/e$a;", "", "Lmx/a;", "title", "Lkotlin/Function0;", "Loq/i0;", "onBack", "", "inputContent", "Landroid/text/Spanned;", "text", "Lkotlin/Function1;", "onInputValueChanged", "<init>", "(Lmx/a;Ler/a;Ljava/lang/String;Landroid/text/Spanned;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "e", "()Lmx/a;", "b", "Ler/a;", "()Ler/a;", "c", "Ljava/lang/String;", "d", "Landroid/text/Spanned;", "()Landroid/text/Spanned;", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inputContent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Spanned text;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onInputValueChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(Label label, er.a<i0> aVar, String str, Spanned spanned, er.l<? super String, i0> lVar) {
            this.title = label;
            this.onBack = aVar;
            this.inputContent = str;
            this.text = spanned;
            this.onInputValueChanged = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInputContent() {
            return this.inputContent;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final er.l<String, i0> c() {
            return this.onInputValueChanged;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Spanned getText() {
            return this.text;
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
            return fr.t.c(this.title, data.title) && fr.t.c(this.onBack, data.onBack) && fr.t.c(this.inputContent, data.inputContent) && fr.t.c(this.text, data.text) && fr.t.c(this.onInputValueChanged, data.onInputValueChanged);
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.inputContent.hashCode()) * 31;
            Spanned spanned = this.text;
            return ((iHashCode + (spanned == null ? 0 : spanned.hashCode())) * 31) + this.onInputValueChanged.hashCode();
        }

        public String toString() {
            return "Data(title=" + this.title + ", onBack=" + this.onBack + ", inputContent=" + this.inputContent + ", text=" + ((Object) this.text) + ", onInputValueChanged=" + this.onInputValueChanged + ')';
        }
    }
}

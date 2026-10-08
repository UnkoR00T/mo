package pr1;

import android.text.Spanned;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pr1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpr1/d;", "", "", "inputContent", "Landroid/text/Spanned;", "text", "<init>", "(Ljava/lang/String;Landroid/text/Spanned;)V", "a", "(Ljava/lang/String;Landroid/text/Spanned;)Lpr1/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "Landroid/text/Spanned;", "c", "()Landroid/text/Spanned;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Data {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String inputContent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Spanned text;

    /* JADX WARN: Multi-variable type inference failed */
    public Data() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Data a(String inputContent, Spanned text) {
        return new Data(inputContent, text);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInputContent() {
        return this.inputContent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Spanned getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return fr.t.c(this.inputContent, data.inputContent) && fr.t.c(this.text, data.text);
    }

    public int hashCode() {
        int iHashCode = this.inputContent.hashCode() * 31;
        Spanned spanned = this.text;
        return iHashCode + (spanned == null ? 0 : spanned.hashCode());
    }

    public String toString() {
        return "Data(inputContent=" + this.inputContent + ", text=" + ((Object) this.text) + ')';
    }

    public Data(String str, Spanned spanned) {
        this.inputContent = str;
        this.text = spanned;
    }

    public /* synthetic */ Data(String str, Spanned spanned, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? null : spanned);
    }
}

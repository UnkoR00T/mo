package z1;

import android.view.textclassifier.TextClassification;
import p071kotlin.Metadata;
import q4.z3;

/* JADX INFO: renamed from: z1.v1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lz1/v1;", "", "", "text", "Lq4/z3;", "selection", "Landroid/view/textclassifier/TextClassification;", "textClassification", "<init>", "(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/CharSequence;", "b", "()Ljava/lang/CharSequence;", "J", "()J", "c", "Landroid/view/textclassifier/TextClassification;", "()Landroid/view/textclassifier/TextClassification;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class TextClassificationResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CharSequence text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long selection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextClassification textClassification;

    public /* synthetic */ TextClassificationResult(CharSequence charSequence, long j15, TextClassification textClassification, fr.k kVar) {
        this(charSequence, j15, textClassification);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextClassification getTextClassification() {
        return this.textClassification;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextClassificationResult)) {
            return false;
        }
        TextClassificationResult textClassificationResult = (TextClassificationResult) other;
        return fr.t.c(this.text, textClassificationResult.text) && z3.g(this.selection, textClassificationResult.selection) && fr.t.c(this.textClassification, textClassificationResult.textClassification);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + z3.o(this.selection)) * 31) + this.textClassification.hashCode();
    }

    public String toString() {
        return "TextClassificationResult(text=" + ((Object) this.text) + ", selection=" + ((Object) z3.q(this.selection)) + ", textClassification=" + this.textClassification + ')';
    }

    private TextClassificationResult(CharSequence charSequence, long j15, TextClassification textClassification) {
        this.text = charSequence;
        this.selection = j15;
        this.textClassification = textClassification;
    }
}

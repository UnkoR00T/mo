package z4;

import android.text.style.TtsSpan;
import oq.p;
import p071kotlin.Metadata;
import q4.VerbatimTtsAnnotation;
import q4.d4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq4/d4;", "Landroid/text/style/TtsSpan;", "a", "(Lq4/d4;)Landroid/text/style/TtsSpan;", "Lq4/f4;", "b", "(Lq4/f4;)Landroid/text/style/TtsSpan;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final TtsSpan a(d4 d4Var) {
        if (d4Var instanceof VerbatimTtsAnnotation) {
            return b((VerbatimTtsAnnotation) d4Var);
        }
        throw new p();
    }

    public static final TtsSpan b(VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
    }
}

package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f8767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextClassifier f8768b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    b0(TextView textView) {
        this.f8767a = (TextView) i6.i.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f8768b;
        return textClassifier == null ? a.a(this.f8767a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f8768b = textClassifier;
    }
}

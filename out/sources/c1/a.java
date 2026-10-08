package c1;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.b1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lc1/a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/a1;", "clipEntry", "Lq4/e;", "b", "(Landroidx/compose/ui/platform/a1;)Lq4/e;", "annotatedString", "c", "(Lq4/e;)Landroidx/compose/ui/platform/a1;", "Landroidx/compose/ui/platform/b1;", "clipboard", "", "a", "(Landroidx/compose/ui/platform/b1;)Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22514a = new a();

    private a() {
    }

    public static final boolean a(b1 clipboard) {
        ClipDescription primaryClipDescription = clipboard.c().getPrimaryClipDescription();
        return primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*");
    }

    public static final q4.e b(a1 clipEntry) {
        CharSequence text;
        ClipData.Item itemAt = clipEntry.getClipData().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return b.a(text);
    }

    public static final a1 c(q4.e annotatedString) {
        if (annotatedString == null) {
            return null;
        }
        return new a1(ClipData.newPlainText("plain text", b.b(annotatedString)));
    }
}

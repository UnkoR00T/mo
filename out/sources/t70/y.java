package t70;

import android.content.Context;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "id", "Landroid/content/Context;", "context", "", "a", "(Ljava/lang/Integer;Landroid/content/Context;)Ljava/lang/String;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y {
    public static final String a(Integer num, Context context) {
        if (num == null) {
            return "Undefined";
        }
        String strC = mx.b.c(context.getResources().getResourceEntryName(num.intValue()));
        return strC == null ? "Undefined" : strC;
    }
}

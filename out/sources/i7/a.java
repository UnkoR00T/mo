package i7;

import CON.p;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.p016lifecycle.w0;
import hq.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/lifecycle/w0$c;", "delegateFactory", "a", "(Landroid/content/Context;Landroidx/lifecycle/w0$c;)Landroidx/lifecycle/w0$c;", "hilt-lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final w0.c a(Context context, w0.c cVar) {
        while (context instanceof ContextWrapper) {
            if (context instanceof p) {
                return c.d((p) context, cVar);
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
    }
}

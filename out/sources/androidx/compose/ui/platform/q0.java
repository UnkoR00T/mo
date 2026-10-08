package androidx.compose.ui.platform;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import ob.WindowMetrics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/view/View;", "view", "Landroidx/compose/ui/platform/i1;", "a", "(Landroid/view/View;)Landroidx/compose/ui/platform/i1;", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Landroid/content/Context;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q0 {
    public static final i1 a(View view) {
        Context context = view.getContext();
        Context contextB = b(context);
        if (contextB == null) {
            Configuration configuration = context.getResources().getConfiguration();
            return i1.INSTANCE.a(c5.i.a(c5.h.n(configuration.screenWidthDp), c5.h.n(configuration.screenHeightDp)), c5.a.a(context));
        }
        WindowMetrics windowMetricsA = ob.x.INSTANCE.c().a(contextB);
        return i1.INSTANCE.b(c5.r.c((((long) windowMetricsA.a().width()) << 32) | (((long) windowMetricsA.a().height()) & BodyPartID.bodyIdMax)), c5.a.a(contextB));
    }

    private static final Context b(Context context) {
        while (context instanceof ContextWrapper) {
            if ((context instanceof Activity) || (context instanceof InputMethodService) || (context instanceof Application)) {
                return context;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                return null;
            }
            context = contextWrapper.getBaseContext();
        }
        return null;
    }
}

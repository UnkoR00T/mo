package o1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import er.l;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import q1.g;
import q4.z3;
import w0.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp1/a;", "Landroid/content/Context;", "context", "", "editable", "", "text", "Lq4/z3;", "selection", "Loq/i0;", "b", "(Lp1/a;Landroid/content/Context;ZLjava/lang/CharSequence;J)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final void b(p1.a aVar, Context context, final boolean z15, final CharSequence charSequence, final long j15) {
        if (!g0.isSmartSelectionEnabled || z3.h(j15) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List<ResolveInfo> listJ = c.f140263a.j(context2);
        if (listJ.isEmpty()) {
            return;
        }
        aVar.d();
        int size = listJ.size();
        int i15 = 0;
        while (i15 < size) {
            final ResolveInfo resolveInfo = listJ.get(i15);
            p1.c.b(aVar, new q1.a(i15), resolveInfo.loadLabel(packageManager).toString(), 0, new l() { // from class: o1.d
                @Override // er.l
                public final Object b(Object obj) {
                    return e.c(context2, resolveInfo, z15, charSequence, j15, (g) obj);
                }
            }, 4, null);
            i15++;
            context2 = context;
        }
        aVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(Context context, ResolveInfo resolveInfo, boolean z15, CharSequence charSequence, long j15, g gVar) {
        c.f140263a.e().C(context, resolveInfo, Boolean.valueOf(z15), charSequence, z3.b(j15));
        gVar.close();
        return i0.f148189a;
    }
}

package u5;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import s5.f;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static int a(Context context, String str) {
        return b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(Context context, String str, int i15, int i16, String str2) {
        if (context.checkPermission(str, i15, i16) == -1) {
            return -1;
        }
        String strC = f.c(str);
        if (strC == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i16);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i16 || !i6.c.a(context.getPackageName(), str2)) ? f.b(context, strC, str2) : f.a(context, i16, strC, str2)) == 0 ? 0 : -2;
    }

    public static int c(Context context, String str) {
        return b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}

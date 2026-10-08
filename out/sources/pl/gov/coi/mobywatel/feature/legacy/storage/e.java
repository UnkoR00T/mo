package pl.gov.coi.mobywatel.feature.legacy.storage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
public class e {
    public static boolean a(Context context) {
        return context.getSharedPreferences("mDoki_0.10", 0).getInt("CONTAINER_VERSION", 0) != 7;
    }

    public static void c(Context context) {
        d(context, 7);
    }

    public static void d(Context context, int i15) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mDoki_0.10", 0).edit();
        editorEdit.putInt("CONTAINER_VERSION", i15);
        editorEdit.apply();
    }

    private void f() throws uh2.a {
        throw new uh2.a(uh2.b.CONTAINER_NOT_FOUND, null, null);
    }

    public boolean b(Context context) {
        return context.getSharedPreferences("mDoki_0.10", 0).getInt("CONTAINER_VERSION", 0) == 0 || ContainerManagerNew.u().r() != null;
    }

    public void e(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mDoki_0.10", 0);
        while (a(context)) {
            switch (sharedPreferences.getInt("CONTAINER_VERSION", 0)) {
                case 0:
                    f();
                    d(context, 1);
                    break;
                case 1:
                    f();
                    d(context, 2);
                    break;
                case 2:
                    d(context, 3);
                    break;
                case 3:
                    f();
                    d(context, 4);
                    break;
                case 4:
                    d(context, 5);
                    break;
                case 5:
                    d(context, 6);
                    break;
                case 6:
                    d(context, 7);
                    break;
            }
        }
    }
}

package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.sentry.android.core.c2;
import io.sentry.instrumentation.file.l;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f12932a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final c f12933b = new b();

    class a implements c {
        a() {
        }

        @Override // androidx.profileinstaller.f.c
        public void a(int i15, Object obj) {
        }

        @Override // androidx.profileinstaller.f.c
        public void b(int i15, Object obj) {
        }
    }

    class b implements c {
        b() {
        }

        @Override // androidx.profileinstaller.f.c
        public void a(int i15, Object obj) {
            String str;
            switch (i15) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i15 == 6 || i15 == 7 || i15 == 8) {
                c2.f("ProfileInstaller", str, (Throwable) obj);
            }
        }

        @Override // androidx.profileinstaller.f.c
        public void b(int i15, Object obj) {
        }
    }

    public interface c {
        void a(int i15, Object obj);

        void b(int i15, Object obj);
    }

    static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    static void c(Context context, Executor executor, c cVar) {
        b(context.getFilesDir());
        f(executor, cVar, 11, null);
    }

    static boolean d(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(io.sentry.instrumentation.file.h.b.a(new FileInputStream(file2), file2));
            try {
                long j15 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z15 = j15 == packageInfo.lastUpdateTime;
                if (z15) {
                    cVar.a(2, null);
                }
                return z15;
            } catch (Throwable th4) {
                try {
                    dataInputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    static void e(PackageInfo packageInfo, File file) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(l.b.a(new FileOutputStream(file2), file2));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th4) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException unused) {
        }
    }

    static void f(Executor executor, final c cVar, final int i15, final Object obj) {
        executor.execute(new Runnable() { // from class: ma.c
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(i15, obj);
            }
        });
    }

    private static boolean g(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean zM = bVar.h().l().m();
        if (zM) {
            e(packageInfo, file);
        }
        return zM;
    }

    public static void h(Context context) {
        i(context, new ma.b(), f12932a);
    }

    public static void i(Context context, Executor executor, c cVar) {
        j(context, executor, cVar, false);
    }

    static void j(Context context, Executor executor, c cVar, boolean z15) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z16 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z15 && d(packageInfo, filesDir, cVar)) {
                context.getPackageName();
                h.c(context, false);
                return;
            }
            context.getPackageName();
            if (g(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z15) {
                z16 = true;
            }
            h.c(context, z16);
        } catch (PackageManager.NameNotFoundException e15) {
            cVar.a(7, e15);
            h.c(context, false);
        }
    }

    static void k(Context context, Executor executor, c cVar) {
        try {
            e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            f(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e15) {
            f(executor, cVar, 7, e15);
        }
    }
}

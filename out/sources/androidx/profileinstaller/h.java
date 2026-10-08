package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import io.sentry.instrumentation.file.l;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.f<c> f12936a = androidx.concurrent.futures.f.B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f12937b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f12938c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f12939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f12940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f12941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f12942d;

        b(int i15, int i16, long j15, long j16) {
            this.f12939a = i15;
            this.f12940b = i16;
            this.f12941c = j15;
            this.f12942d = j16;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th4) {
                try {
                    dataInputStream.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(l.b.a(new FileOutputStream(file), file));
            try {
                dataOutputStream.writeInt(this.f12939a);
                dataOutputStream.writeInt(this.f12940b);
                dataOutputStream.writeLong(this.f12941c);
                dataOutputStream.writeLong(this.f12942d);
                dataOutputStream.close();
            } catch (Throwable th4) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f12940b == bVar.f12940b && this.f12941c == bVar.f12941c && this.f12939a == bVar.f12939a && this.f12942d == bVar.f12942d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f12940b), Long.valueOf(this.f12941c), Integer.valueOf(this.f12939a), Long.valueOf(this.f12942d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f12943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f12944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f12945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f12946d;

        c(int i15, boolean z15, boolean z16, boolean z17) {
            this.f12943a = i15;
            this.f12945c = z16;
            this.f12944b = z15;
            this.f12946d = z17;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i15, boolean z15, boolean z16, boolean z17) {
        c cVar = new c(i15, z15, z16, z17);
        f12938c = cVar;
        f12936a.x(cVar);
        return f12938c;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    static c c(Context context, boolean z15) {
        int i15;
        boolean z16;
        int i16;
        File file;
        boolean z17;
        File file2;
        long length;
        boolean z18;
        File file3;
        b bVarA;
        b bVar;
        int i17;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        c cVar;
        if (!z15 && (cVar = f12938c) != null) {
            return cVar;
        }
        synchronized (f12937b) {
            if (z15) {
                i15 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                assetFileDescriptorOpenFd.close();
                i16 = Build.VERSION.SDK_INT;
                if (i16 >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    long jA = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        bVarA = b.a(file3);
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null) {
                        if (!z16) {
                            i15 = 327680;
                        } else if (z17) {
                            i15 = 1;
                        } else if (z18) {
                            i15 = 2;
                        }
                    } else if (!z16) {
                        i15 = 327680;
                    } else if (z17) {
                        i15 = 1;
                    } else if (z18) {
                        i15 = 2;
                    }
                    if (z15) {
                        i15 = 2;
                    }
                    if (bVarA != null) {
                        i15 = 3;
                    }
                    int i18 = i15;
                    bVar = new b(1, i18, jA, length);
                    if (bVarA != null) {
                        bVar.b(file3);
                    } else {
                        bVar.b(file3);
                    }
                    return b(i18, z17, z18, z16);
                }
                return b(PKIFailureInfo.transactionIdInUse, false, false, z16);
            }
            c cVar2 = f12938c;
            if (cVar2 != null) {
                return cVar2;
            }
            i15 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th4) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th4;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (IOException unused) {
                z16 = false;
            }
            i16 = Build.VERSION.SDK_INT;
            if (i16 >= 28 && i16 != 30) {
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z18 = false;
                } else {
                    z18 = true;
                }
                try {
                    long jA2 = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused2) {
                            return b(PKIFailureInfo.unsupportedVersion, z17, z18, z16);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null && bVarA.f12941c == jA2 && (i17 = bVarA.f12940b) != 2) {
                        i15 = i17;
                    } else if (!z16) {
                        i15 = 327680;
                    } else if (z17) {
                        i15 = 1;
                    } else if (z18) {
                        i15 = 2;
                    }
                    if (z15 && z18 && i15 != 1) {
                        i15 = 2;
                    }
                    if (bVarA != null && bVarA.f12940b == 2 && i15 == 1 && length3 < bVarA.f12942d) {
                        i15 = 3;
                    }
                    int i19 = i15;
                    bVar = new b(1, i19, jA2, length);
                    if (bVarA != null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused3) {
                            i19 = 196608;
                        }
                    }
                    return b(i19, z17, z18, z16);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return b(PKIFailureInfo.notAuthorized, z17, z18, z16);
                }
            }
            return b(PKIFailureInfo.transactionIdInUse, false, false, z16);
            throw th;
        }
    }
}

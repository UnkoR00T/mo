package gg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import io.sentry.android.core.c2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static k f72741b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f72742a;

    public k(Context context) {
        this.f72742a = context.getApplicationContext();
    }

    public static k a(Context context) {
        jg.s.l(context);
        synchronized (k.class) {
            try {
                if (f72741b == null) {
                    b0.a(context);
                    f72741b = new k(context);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f72741b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    static final boolean b(PackageInfo packageInfo, boolean z15) {
        xg.i iVarK;
        if (packageInfo == null) {
            return false;
        }
        if (z15 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z15 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            xg.i iVar = z15 ? a0.f72713c : a0.f72712b;
            int i15 = com.google.android.gms.common.util.a.f29051b;
            int i16 = Build.VERSION.SDK_INT;
            if (i16 < 28) {
                Signature[] signatureArr = packageInfo.signatures;
                byte[] byteArray = null;
                if (signatureArr != null && signatureArr.length == 1) {
                    byteArray = signatureArr[0].toByteArray();
                }
                iVarK = byteArray != null ? xg.i.n(byteArray) : xg.i.k();
            } else {
                xg.t.a(i16 >= 28);
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    iVarK = xg.i.k();
                } else {
                    int i17 = xg.i.f218456c;
                    xg.e eVar = new xg.e();
                    for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                        eVar.b(signature.toByteArray());
                    }
                    iVarK = eVar.c();
                }
            }
            if (iVarK.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            xg.i iVarI = iVarK.i();
            int size = iVarI.size();
            int i18 = 0;
            while (i18 < size) {
                byte[] bArr = (byte[]) iVarI.get(i18);
                xg.m mVarListIterator = iVar.listIterator(0);
                do {
                    int i19 = i18 + 1;
                    if (!mVarListIterator.hasNext()) {
                        i18 = i19;
                    }
                } while (!Arrays.equals(bArr, (byte[]) mVarListIterator.next()));
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return (z15 ? c(packageInfo, a0.f72711a) : c(packageInfo, a0.f72711a[0])) != null;
        }
    }

    private static x c(PackageInfo packageInfo, x... xVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                c2.g("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            y yVar = new y(packageInfo.signatures[0].toByteArray());
            for (int i15 = 0; i15 < xVarArr.length; i15++) {
                if (xVarArr[i15].equals(yVar)) {
                    return xVarArr[i15];
                }
            }
        }
        return null;
    }
}

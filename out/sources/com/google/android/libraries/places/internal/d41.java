package com.google.android.libraries.places.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public final class d41 {
    public static String a(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                return b(signature);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e15) {
            io.sentry.android.core.c2.f("CredentialsHelper", "Unable to get certificate fingerprint for package: ".concat(String.valueOf(str)), e15);
            return null;
        }
    }

    private static String b(Signature signature) {
        try {
            return bk.a.a().f(MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException e15) {
            io.sentry.android.core.c2.f("CredentialsHelper", "Unable to get certificate fingerprint.", e15);
            return null;
        }
    }
}

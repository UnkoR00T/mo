package nl;

import android.content.SharedPreferences;
import android.util.Base64;
import io.sentry.android.core.c2;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.json.JSONException;
import org.json.JSONObject;
import vk.e;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f137192c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f137193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f137194b;

    public b(e eVar) {
        this.f137193a = eVar.j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f137194b = b(eVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(e eVar) {
        String strD = eVar.m().d();
        if (strD != null) {
            return strD;
        }
        String strC = eVar.m().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & GF2Field.MASK);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            c2.g("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e15) {
            c2.g("ContentValues", "Invalid key stored " + e15);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f137193a) {
            string = this.f137193a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f137193a) {
            try {
                String string = this.f137193a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public String f() {
        synchronized (this.f137193a) {
            try {
                String strG = g();
                if (strG != null) {
                    return strG;
                }
                return h();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public String i() {
        synchronized (this.f137193a) {
            try {
                for (String str : f137192c) {
                    String string = this.f137193a.getString(a(this.f137194b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}

# Paczka 171 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `nl/b.java`, `nl/c.java`

## nl/b.java

```java
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

```

## nl/c.java

```java
package nl;

import io.sentry.android.core.c2;
import io.sentry.instrumentation.file.h;
import io.sentry.instrumentation.file.l;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import vk.e;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f137195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f137196b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(e eVar) {
        this.f137196b = eVar;
    }

    private File a() {
        if (this.f137195a == null) {
            synchronized (this) {
                try {
                    if (this.f137195a == null) {
                        String str = "PersistedInstallation." + this.f137196b.n() + ".json";
                        File file = new File(this.f137196b.j().getNoBackupFilesDir(), str);
                        this.f137195a = file;
                        if (file.exists()) {
                            return this.f137195a;
                        }
                        File file2 = new File(this.f137196b.j().getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo(this.f137195a)) {
                            c2.f("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.f137195a;
    }

    private JSONObject c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            File fileA = a();
            FileInputStream fileInputStreamA = h.b.a(new FileInputStream(fileA), fileA);
            while (true) {
                try {
                    int i15 = fileInputStreamA.read(bArr, 0, 16384);
                    if (i15 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStreamA.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i15);
                } catch (Throwable th4) {
                    try {
                        fileInputStreamA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public d b(d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f137196b.j().getFilesDir());
            FileOutputStream fileOutputStreamA = l.b.a(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
            fileOutputStreamA.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStreamA.close();
            if (!fileCreateTempFile.renameTo(a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return dVar;
    }

    public d d() {
        JSONObject jSONObjectC = c();
        String strOptString = jSONObjectC.optString("Fid", null);
        int iOptInt = jSONObjectC.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectC.optString("AuthToken", null);
        String strOptString3 = jSONObjectC.optString("RefreshToken", null);
        long jOptLong = jSONObjectC.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectC.optLong("ExpiresInSecs", 0L);
        return d.a().d(strOptString).g(a.values()[iOptInt]).b(strOptString2).f(strOptString3).h(jOptLong).c(jOptLong2).e(jSONObjectC.optString("FisError", null)).a();
    }
}

```

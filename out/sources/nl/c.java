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

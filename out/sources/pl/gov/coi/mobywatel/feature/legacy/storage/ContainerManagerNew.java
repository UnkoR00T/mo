package pl.gov.coi.mobywatel.feature.legacy.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.t;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class ContainerManagerNew {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.gson.f f158748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ContainerManagerNew f158749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ThreadPoolExecutor f158750h = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List<byte[]> f158751i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cj2.b f158754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bj2.a f158755d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f158752a = "file_container_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<d, byte[]> f158753b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, byte[]> f158756e = new ConcurrentHashMap();

    private static class ByteArrayToBase64TypeAdapter implements t<byte[]>, com.google.gson.k<byte[]> {
        @Override // com.google.gson.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] a(com.google.gson.l lVar, Type type, com.google.gson.j jVar) {
            return Base64.decode(lVar.i(), 2);
        }

        @Override // com.google.gson.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.google.gson.l b(byte[] bArr, Type type, s sVar) {
            return new r(Base64.encodeToString(bArr, 2));
        }

        private ByteArrayToBase64TypeAdapter() {
        }
    }

    private static class DateFormatAdapter implements com.google.gson.k<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SuppressLint({"SimpleDateFormat"})
        DateFormat f158757a;

        @Override // com.google.gson.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Date a(com.google.gson.l lVar, Type type, com.google.gson.j jVar) {
            try {
                return this.f158757a.parse(lVar.i());
            } catch (ParseException unused) {
                return null;
            }
        }

        private DateFormatAdapter() {
            this.f158757a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        }
    }

    static {
        f158748f = new com.google.gson.g().c().g(byte[].class, new ByteArrayToBase64TypeAdapter()).e(Date.class, new DateFormatAdapter()).h("yyyy-MM-dd HH:mm:ss Z").b();
        ArrayList arrayList = new ArrayList();
        f158751i = arrayList;
        arrayList.add(new byte[]{-73, 116, 33, -84, 127, -116, -18, -103});
        arrayList.add(new byte[]{45, 71, -116, 31, -98, 53, -65, 100});
        arrayList.add(new byte[]{-20, 118, 24, -15, 100, 63, -5, -87});
    }

    private ContainerManagerNew() {
    }

    private byte[] B(String str, boolean z15) throws uh2.a, InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z15) {
            while (!this.f158756e.containsKey(str)) {
                Thread.sleep(100L);
                if (System.currentTimeMillis() - jCurrentTimeMillis > 60000) {
                    throw new uh2.a(uh2.b.CONTAINER_CACHE_ALL_TIMEOUT);
                }
            }
        }
        if (this.f158756e.containsKey(str)) {
            return this.f158756e.get(str);
        }
        byte[] bArrE = sh2.a.g().e(str);
        this.f158756e.put(str, bArrE);
        return bArrE;
    }

    private <T> T C(Class<T> cls, d dVar, String str, boolean z15, SecretKeySpec secretKeySpec) throws Exception {
        try {
            return (T) f158748f.i(new String(D(dVar, str, z15, secretKeySpec)), cls);
        } catch (Exception e15) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new px.a.Class(this));
            sh2.a.i().T6("ReadContainerFile error", e15, arrayList);
            throw new Exception("Unable to load container " + cls.getSimpleName() + ":" + dVar);
        }
    }

    private byte[] D(d dVar, String str, boolean z15, SecretKeySpec secretKeySpec) throws Exception {
        try {
            return e(f(dVar, B(str, z15), secretKeySpec));
        } catch (Exception e15) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new px.a.Class(this));
            sh2.a.i().T6("ReadContainerFile error", e15, arrayList);
            throw new Exception("Unable to load fileName " + str + ":" + dVar);
        }
    }

    private void G(String str, byte[] bArr, boolean z15) {
        sh2.a.g().f(str, bArr);
        if (z15) {
            this.f158756e.put(str, bArr);
        }
    }

    private void I(cj2.c cVar, d dVar, String str) {
        J(f158748f.t(cVar).getBytes(), dVar, str, false, true);
    }

    private void J(final byte[] bArr, final d dVar, final String str, boolean z15, final boolean z16) {
        Future<?> futureSubmit = f158750h.submit(new Runnable() { // from class: pl.gov.coi.mobywatel.feature.legacy.storage.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f158758a.x(bArr, dVar, str, z16);
            }
        });
        if (z15) {
            return;
        }
        try {
            futureSubmit.get();
        } catch (InterruptedException | ExecutionException e15) {
            px.f.f163100a.d("ContainerManagerNew legacy error: writeContainerFile()", e15, px.c.a(this));
        }
    }

    private byte[] d(byte[] bArr) throws uh2.a {
        try {
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            byte[] bArr2 = new byte[1024];
            while (!deflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
            }
            byteArrayOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e15) {
            throw new uh2.a(uh2.b.CONTAINER_COMPRESSION, e15);
        }
    }

    private byte[] e(byte[] bArr) throws uh2.a {
        try {
            Inflater inflater = new Inflater();
            inflater.setInput(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            byte[] bArr2 = new byte[1024];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
            }
            byteArrayOutputStream.close();
            inflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e15) {
            throw new uh2.a(uh2.b.CONTAINER_DECOMPRESSION, e15);
        }
    }

    private byte[] f(d dVar, byte[] bArr, SecretKeySpec secretKeySpec) throws uh2.a {
        SecretKeySpec secretKeySpec2;
        try {
            if (secretKeySpec == null) {
                k.e().k();
                secretKeySpec2 = new SecretKeySpec(sh2.a.d().a(this.f158753b.get(dVar)), "AES");
            } else {
                secretKeySpec2 = new SecretKeySpec(secretKeySpec.getEncoded(), "AES");
            }
            return fi2.a.b(bArr, secretKeySpec2);
        } catch (ii2.e e15) {
            throw new uh2.a(uh2.b.CRYPTO_DECRYPT_CONTAINER, e15);
        } catch (InterruptedException e16) {
            e = e16;
            throw new uh2.a(uh2.b.CRYPTO_SECKEY_GEN_FAILED, e);
        } catch (ExecutionException e17) {
            e = e17;
            throw new uh2.a(uh2.b.CRYPTO_SECKEY_GEN_FAILED, e);
        }
    }

    private byte[] k(d dVar, byte[] bArr) throws uh2.a {
        try {
            k.e().k();
            return fi2.a.d(bArr, new SecretKeySpec(sh2.a.d().a(this.f158753b.get(dVar)), "AES"));
        } catch (ii2.e e15) {
            throw new uh2.a(uh2.b.CRYPTO_ENCRYPT_CONTAINER, e15);
        } catch (InterruptedException e16) {
            e = e16;
            throw new uh2.a(uh2.b.CRYPTO_SECKEY_GEN_FAILED, e);
        } catch (ExecutionException e17) {
            e = e17;
            throw new uh2.a(uh2.b.CRYPTO_SECKEY_GEN_FAILED, e);
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void l(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mDoki_0.10", 0).edit();
        editorEdit.putString("CONTAINER_USER_FILE", UUID.randomUUID().toString());
        editorEdit.putString("CONTAINER_PASS_FILE", UUID.randomUUID().toString());
        editorEdit.putString("CONTAINER_HISTORY_FILE", UUID.randomUUID().toString());
        editorEdit.commit();
    }

    public static void m(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mDoki_0.10", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (sharedPreferences.contains("NSalt1") && sharedPreferences.contains("NSalt2") && sharedPreferences.contains("NSalt3")) {
            return;
        }
        editorEdit.putString("NSalt1", Base64.encodeToString(sh2.d.a(), 2));
        editorEdit.putString("NSalt2", Base64.encodeToString(sh2.d.a(), 2));
        editorEdit.putString("NSalt3", Base64.encodeToString(sh2.d.a(), 2));
        editorEdit.apply();
    }

    @Deprecated
    private cj2.b p() {
        return q(null);
    }

    private String t(d dVar, int i15) {
        return p().k(i15).f(dVar);
    }

    public static synchronized ContainerManagerNew u() {
        try {
            if (f158749g == null) {
                f158749g = new ContainerManagerNew();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f158749g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(byte[] bArr, d dVar, String str, boolean z15) {
        try {
            G(str, k(dVar, d(bArr)), z15);
        } catch (IOException | uh2.a e15) {
            if (sh2.a.b().getDebug()) {
                px.f.f163100a.d("ContainerManagerNew legacy error: writeContainerFile()", e15, px.c.a(this));
            }
        }
    }

    private void y(SecretKeySpec secretKeySpec) {
        try {
            try {
                this.f158754c = (cj2.b) C(cj2.b.class, d.USER, "common_container", false, secretKeySpec);
            } catch (Exception e15) {
                e = e15;
                Exception exc = e;
                if (sh2.a.b().getDebug()) {
                    px.f.f163100a.d("ContainerManagerNew legacy error: loadCommonContainer()", exc, px.c.a(this));
                }
            }
        } catch (Exception e16) {
            e = e16;
        }
    }

    public <T> T A(Class<T> cls, int i15, d dVar, boolean z15) {
        return (T) C(cls, dVar, t(dVar, i15), z15, null);
    }

    public byte[] E(d dVar, String str) {
        return D(dVar, str, false, null);
    }

    public void F(cj2.c cVar) {
        if (cVar instanceof cj2.b) {
            this.f158754c = (cj2.b) cVar;
            I(cVar, d.USER, "common_container");
        } else if (cVar instanceof bj2.a) {
            this.f158755d = (bj2.a) cVar;
            I(cVar, d.HISTORY, "common_history_container");
        } else {
            I(cVar, cVar.b(), t(cVar.b(), cVar.a()));
        }
    }

    public void H(String str, d dVar, byte[] bArr) {
        J(bArr, dVar, str, false, false);
    }

    public void b() {
        this.f158754c = null;
        this.f158755d = null;
        this.f158756e.clear();
        this.f158753b.clear();
    }

    public void c() {
        this.f158754c = null;
    }

    public void g(Context context) {
        cj2.b bVarP = p();
        if (bVarP != null) {
            Iterator<Integer> it = bVarP.i().iterator();
            while (it.hasNext()) {
                j(it.next().intValue());
            }
        }
        oi2.b bVarG = sh2.a.g();
        if (bVarG.a("common_container")) {
            bVarG.d("common_container");
        }
        if (bVarG.a("common_history_container")) {
            bVarG.d("common_history_container");
        }
        bVarG.c("file_container_");
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mDoki_0.10", 0).edit();
        editorEdit.putBoolean("activated", false);
        editorEdit.apply();
        b();
    }

    public void h(String str) {
        oi2.b bVarG = sh2.a.g();
        if (str.startsWith("file_container_") && bVarG.a(str)) {
            bVarG.d(str);
        }
    }

    public void i(int i15) {
        j(i15);
        p().s(Integer.valueOf(i15));
    }

    public void j(int i15) {
        for (d dVar : d.values()) {
            String strT = t(dVar, i15);
            oi2.b bVarG = sh2.a.g();
            if (bVarG.a(strT)) {
                bVarG.d(strT);
            }
        }
    }

    public void n(Context context, jx.d dVar, byte[] bArr) throws uh2.a {
        o(context, dVar, bArr, true);
    }

    public void o(Context context, jx.d dVar, byte[] bArr, boolean z15) throws uh2.a {
        k.h(context, dVar);
        k.e().d(bArr);
        k kVarE = k.e();
        final Map<d, byte[]> map = this.f158753b;
        Objects.requireNonNull(map);
        kVarE.j(new k.b() { // from class: pl.gov.coi.mobywatel.feature.legacy.storage.b
            @Override // pl.gov.coi.mobywatel.feature.legacy.storage.k.b
            public final void a(HashMap map2) {
                map.putAll(map2);
            }
        });
        if (z15) {
            return;
        }
        try {
            k.e().k();
        } catch (InterruptedException | ExecutionException e15) {
            throw new uh2.a(uh2.b.CRYPTO_SECKEY_GEN_FAILED, e15);
        }
    }

    public cj2.b q(SecretKeySpec secretKeySpec) {
        if (this.f158754c == null) {
            y(secretKeySpec);
        }
        return this.f158754c;
    }

    public cj2.b r() {
        return q(null);
    }

    public bj2.a s() {
        ContainerManagerNew containerManagerNew;
        if (this.f158755d == null) {
            try {
                containerManagerNew = this;
                try {
                    containerManagerNew.f158755d = (bj2.a) containerManagerNew.C(bj2.a.class, d.HISTORY, "common_history_container", false, null);
                } catch (Exception e15) {
                    e = e15;
                    px.f.f163100a.d("ContainerManagerNew legacy error: getCommonHistoryContainer()", e, px.c.a(this));
                }
            } catch (Exception e16) {
                e = e16;
                containerManagerNew = this;
            }
        } else {
            containerManagerNew = this;
        }
        return containerManagerNew.f158755d;
    }

    public void v(Context context) {
        m(context);
        cj2.b bVar = new cj2.b();
        bj2.a aVar = new bj2.a();
        I(bVar, d.USER, "common_container");
        I(aVar, d.HISTORY, "common_history_container");
    }

    public int w(cj2.a aVar) {
        for (d dVar : d.values()) {
            aVar.a(UUID.randomUUID().toString());
        }
        return p().f(aVar);
    }

    public <T> T z(Class<T> cls, int i15, d dVar) {
        return (T) A(cls, i15, dVar, false);
    }
}

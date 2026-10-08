package pl.gov.coi.mobywatel.feature.legacy.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadPoolExecutor f158834e = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<byte[]> f158835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static k f158836g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jx.d f158837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f158838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f158839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future<?> f158840d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f158841a;

        static {
            int[] iArr = new int[d.values().length];
            f158841a = iArr;
            try {
                iArr[d.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f158841a[d.HISTORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f158841a[d.PASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface b {
        void a(HashMap<d, byte[]> map);
    }

    static {
        ArrayList arrayList = new ArrayList();
        f158835f = arrayList;
        arrayList.add(new byte[]{-73, 116, 33, -84, 127, -116, -18, -103});
        arrayList.add(new byte[]{45, 71, -116, 31, -98, 53, -65, 100});
        arrayList.add(new byte[]{-20, 118, 24, -15, 100, 63, -5, -87});
    }

    private k(Context context, jx.d dVar) {
        this.f158838b = context;
        this.f158837a = dVar;
    }

    public static byte[] b(String str) throws uh2.a {
        if (str.length() == 16) {
            return sh2.d.c(str);
        }
        if (str.length() >= 16 || str.isEmpty()) {
            if (str.length() > 16) {
                return sh2.d.c(str.substring(0, 16));
            }
            throw new uh2.a(uh2.b.XORED_ANDROID_ID_WRONG_LENGTH);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i15 = 0; i15 < 16 - str.length(); i15++) {
            spannableStringBuilder.append((CharSequence) com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1);
        }
        return sh2.d.c(((Object) spannableStringBuilder) + str);
    }

    public static byte[] c(String str, Context context) throws uh2.a {
        if (!sh2.d.b(context, "isContainerBuiltByImei", Boolean.TRUE)) {
            return b(str);
        }
        try {
            byte[] byteArray = new BigInteger("1" + str).toByteArray();
            byte[] bArr = new byte[8];
            for (int i15 = 0; i15 < byteArray.length && i15 < 8; i15++) {
                bArr[i15] = byteArray[i15];
            }
            int length = 8 - byteArray.length;
            for (int i16 = 1; i16 <= length; i16++) {
                bArr[8 - i16] = (byte) str.charAt(str.length() - i16);
            }
            return bArr;
        } catch (Exception e15) {
            px.f.f163100a.d("DeviceManager legacy error: convertDeviceId()", e15, Collections.EMPTY_LIST);
            throw new uh2.a(str == null ? uh2.b.IMEI_IS_NULL : uh2.b.DEVICE_GET_ID);
        }
    }

    public static k e() {
        return f158836g;
    }

    private byte[] f(Context context, d dVar) {
        ContainerManagerNew.m(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("mDoki_0.10", 0);
        int i15 = a.f158841a[dVar.ordinal()];
        if (i15 == 1) {
            return Base64.decode(sharedPreferences.getString("NSalt1", ""), 2);
        }
        if (i15 == 2) {
            return Base64.decode(sharedPreferences.getString("NSalt2", ""), 2);
        }
        if (i15 != 3) {
            return null;
        }
        return Base64.decode(sharedPreferences.getString("NSalt3", ""), 2);
    }

    public static k h(Context context, jx.d dVar) {
        k kVar = f158836g;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(context, dVar);
        f158836g = kVar2;
        return kVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(byte[] bArr) {
        String strB = this.f158837a.b();
        HashMap<d, byte[]> map = new HashMap<>();
        try {
            for (d dVar : d.values()) {
                map.put(dVar, sh2.a.d().a(g(bArr, strB, dVar).getEncoded()));
            }
        } catch (Exception e15) {
            if (sh2.a.b().getDebug()) {
                px.f.f163100a.d("SecretKeyGenerator legacy error: generate()", e15, px.c.a(this));
            }
        }
        this.f158839c.a(map);
    }

    public void d(final byte[] bArr) {
        Future<?> future = this.f158840d;
        if (future != null) {
            future.cancel(true);
        }
        this.f158840d = f158834e.submit(new Runnable() { // from class: pl.gov.coi.mobywatel.feature.legacy.storage.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f158832a.i(bArr);
            }
        });
    }

    public SecretKeySpec g(byte[] bArr, String str, d dVar) {
        char[] charArray = new String(bArr, StandardCharsets.UTF_8).toCharArray();
        byte[] bArr2 = f158835f.get(dVar.ordinal());
        byte[] bArrF = f(this.f158838b, dVar);
        Objects.requireNonNull(bArrF);
        return fi2.a.e(charArray, bArr2, bArrF, c(str, this.f158838b));
    }

    public void j(b bVar) {
        this.f158839c = bVar;
    }

    public void k() {
        this.f158840d.get();
    }
}

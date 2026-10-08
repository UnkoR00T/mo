package com.google.android.datatransport.cct;

import af.h;
import af.i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import bf.f;
import bf.g;
import bf.m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import ze.n;
import ze.o;
import ze.p;
import ze.q;
import ze.r;
import ze.s;
import ze.t;
import ze.u;
import ze.v;

/* JADX INFO: loaded from: classes3.dex */
final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dl.a f28866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f28867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f28868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final URL f28869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lf.a f28870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final lf.a f28871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f28872g;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final URL f28873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ze.m f28874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f28875c;

        a(URL url, ze.m mVar, String str) {
            this.f28873a = url;
            this.f28874b = mVar;
            this.f28875c = str;
        }

        a a(URL url) {
            return new a(url, this.f28874b, this.f28875c);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f28876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final URL f28877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f28878c;

        b(int i15, URL url, long j15) {
            this.f28876a = i15;
            this.f28877b = url;
            this.f28878c = j15;
        }
    }

    d(Context context, lf.a aVar, lf.a aVar2, int i15) {
        this.f28866a = ze.m.b();
        this.f28868c = context;
        this.f28867b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f28869d = n(com.google.android.datatransport.cct.a.f28857c);
        this.f28870e = aVar2;
        this.f28871f = aVar;
        this.f28872g = i15;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f28877b;
        if (url == null) {
            return null;
        }
        ef.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f28877b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        ef.a.e("CctTransportBackend", "Making request to: %s", aVar.f28873a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f28873a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f28872g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.2.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f28875c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f28866a.a(aVar.f28874b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    ef.a.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    ef.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    ef.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, t.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th4) {
                            if (inputStreamM != null) {
                                try {
                                    inputStreamM.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                } catch (Throwable th8) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
            } catch (Throwable th10) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th11) {
                        th10.addSuppressed(th11);
                    }
                }
                throw th10;
            }
        } catch (dl.b e15) {
            e = e15;
            ef.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e16) {
            e = e16;
            ef.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e17) {
            e = e17;
            ef.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e18) {
            e = e18;
            ef.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return u.b.UNKNOWN_MOBILE_SUBTYPE.e();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return u.b.COMBINED.e();
        }
        if (u.b.b(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? u.c.NONE.e() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e15) {
            ef.a.c("CctTransportBackend", "Unable to find version code for package", e15);
            return -1;
        }
    }

    private ze.m j(f fVar) {
        r.a aVarK;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strK = iVar.k();
            if (map.containsKey(strK)) {
                ((List) map.get(strK)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strK, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            s.a aVarB = s.a().f(v.DEFAULT).g(this.f28871f.a()).h(this.f28870e.a()).b(n.a().c(n.b.ANDROID_FIREBASE).b(ze.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                ye.c cVarB = hVarE.b();
                if (cVarB.equals(ye.c.b("proto"))) {
                    aVarK = r.k(hVarE.a());
                } else if (cVarB.equals(ye.c.b("json"))) {
                    aVarK = r.j(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    ef.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", cVarB);
                }
                aVarK.d(iVar3.f()).e(iVar3.l()).i(iVar3.h("tz-offset")).f(u.a().c(u.c.b(iVar3.g("net-type"))).b(u.b.b(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarK.c(iVar3.d());
                }
                if (iVar3.j() != null) {
                    aVarK.b(o.a().b(q.a().b(p.a().b(iVar3.j()).a()).a()).c(o.b.EVENT_OVERRIDE).a());
                }
                arrayList3.add(aVarK.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return ze.m.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    private static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e15) {
            throw new IllegalArgumentException("Invalid url: " + str, e15);
        }
    }

    @Override // bf.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f28867b.getActiveNetworkInfo();
        return iVar.m().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f28868c)).c("application_build", Integer.toString(i(this.f28868c))).d();
    }

    @Override // bf.m
    public g b(f fVar) {
        ze.m mVarJ = j(fVar);
        URL urlN = this.f28869d;
        String strD = null;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlN = n(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) ff.b.a(5, new a(urlN, mVarJ, strD), new ff.a() { // from class: com.google.android.datatransport.cct.b
                @Override // ff.a
                public final Object apply(Object obj) {
                    return this.f28865a.e((d.a) obj);
                }
            }, new ff.c() { // from class: com.google.android.datatransport.cct.c
                @Override // ff.c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i15 = bVar.f28876a;
            if (i15 == 200) {
                return g.e(bVar.f28878c);
            }
            if (i15 < 500 && i15 != 404) {
                return i15 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e15) {
            ef.a.c("CctTransportBackend", "Could not make request to the backend", e15);
            return g.f();
        }
    }

    d(Context context, lf.a aVar, lf.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}

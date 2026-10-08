package io.sentry;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Integer f94818i = Integer.valueOf(PKIFailureInfo.certRevoked);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Integer f94819j = 64;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final c f94820k = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f94821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f94822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Double f94823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Double f94824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f94825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f94826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f94827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final v0 f94828h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List<String> f94829a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-transaction", "sentry-sample_rate", "sentry-sample_rand", "sentry-sampled", "sentry-replay_id");
    }

    private static class c extends ThreadLocal<DecimalFormat> {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }
    }

    public d(v0 v0Var) {
        this(new ConcurrentHashMap(), null, null, null, true, false, v0Var);
    }

    private static Boolean A(b9 b9Var) {
        if (b9Var == null) {
            return null;
        }
        return b9Var.e();
    }

    private static Double O(String str) {
        if (str != null) {
            try {
                double d15 = Double.parseDouble(str);
                if (io.sentry.util.a0.h(Double.valueOf(d15), false)) {
                    return Double.valueOf(d15);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private static String a(String str) {
        return URLDecoder.decode(str, "UTF-8");
    }

    private String b(String str) {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    public static d e(i5 i5Var, String str, q7 q7Var) {
        d dVar = new d(q7Var.getLogger());
        n8 n8VarI = i5Var.C().i();
        dVar.J(n8VarI != null ? n8VarI.n().toString() : null);
        dVar.D(q7Var.retrieveParsedDsn().a());
        dVar.E(i5Var.J());
        dVar.C(i5Var.F());
        dVar.K(str);
        dVar.H(null);
        dVar.I(null);
        dVar.G(null);
        Object objC = i5Var.C().c("replay_id");
        if (objC != null && !objC.toString().equals(io.sentry.protocol.v.f95495b.toString())) {
            dVar.F(objC.toString());
            i5Var.C().m("replay_id");
        }
        dVar.d();
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    public static d f(String str, boolean z15, v0 v0Var) {
        boolean z16;
        Double dO;
        Double dO2;
        String strG;
        boolean z17;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        if (str != null) {
            try {
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                int i16 = 0;
                boolean z18 = false;
                dO = null;
                dO2 = null;
                while (i16 < length) {
                    try {
                        String str2 = strArrSplit[i16];
                        if (str2.trim().startsWith("sentry-")) {
                            try {
                                int iIndexOf = str2.indexOf("=");
                                String strTrim = str2.substring(i15, iIndexOf).trim();
                                String strA = a(strTrim);
                                String strA2 = a(str2.substring(iIndexOf + 1).trim());
                                if ("sentry-sample_rate".equals(strA)) {
                                    dO = O(strA2);
                                } else if ("sentry-sample_rand".equals(strA)) {
                                    dO2 = O(strA2);
                                } else {
                                    concurrentHashMap.put(strA, strA2);
                                }
                                if (!"sentry-sample_rand".equalsIgnoreCase(strTrim)) {
                                    z18 = true;
                                }
                            } catch (Throwable th4) {
                                v0Var.a(b7.ERROR, th4, "Unable to decode baggage key value pair %s", str2);
                            }
                        } else if (z15) {
                            arrayList.add(str2.trim());
                        }
                        i16++;
                        i15 = 0;
                    } catch (Throwable th5) {
                        th = th5;
                        z17 = z18;
                        v0Var.a(b7.ERROR, th, "Unable to decode baggage header %s", str);
                        z16 = z17;
                        if (arrayList.isEmpty()) {
                            strG = null;
                        } else {
                            strG = io.sentry.util.d0.g(",", arrayList);
                        }
                        return new d(concurrentHashMap, dO, dO2, strG, true, z16, v0Var);
                    }
                }
                z16 = z18;
            } catch (Throwable th6) {
                th = th6;
                z17 = false;
                dO = null;
                dO2 = null;
            }
        } else {
            z16 = false;
            dO = null;
            dO2 = null;
        }
        if (arrayList.isEmpty()) {
            strG = null;
        } else {
            strG = io.sentry.util.d0.g(",", arrayList);
        }
        return new d(concurrentHashMap, dO, dO2, strG, true, z16, v0Var);
    }

    public static d g(List<String> list, boolean z15, v0 v0Var) {
        return list != null ? f(io.sentry.util.d0.g(",", list), z15, v0Var) : f(null, z15, v0Var);
    }

    private static boolean u(io.sentry.protocol.f0 f0Var) {
        return (f0Var == null || io.sentry.protocol.f0.URL.equals(f0Var)) ? false : true;
    }

    private static Double x(b9 b9Var) {
        if (b9Var == null) {
            return null;
        }
        return b9Var.c();
    }

    private static Double y(b9 b9Var) {
        if (b9Var == null) {
            return null;
        }
        return b9Var.d();
    }

    private static String z(Double d15) {
        if (io.sentry.util.a0.h(d15, false)) {
            return f94820k.get().format(d15);
        }
        return null;
    }

    public void B(String str, String str2) {
        if (this.f94826f) {
            if (str2 == null) {
                this.f94821a.remove(str);
            } else {
                this.f94821a.put(str, str2);
            }
        }
    }

    public void C(String str) {
        B("sentry-environment", str);
    }

    public void D(String str) {
        B("sentry-public_key", str);
    }

    public void E(String str) {
        B("sentry-release", str);
    }

    public void F(String str) {
        B("sentry-replay_id", str);
    }

    public void G(Double d15) {
        if (v()) {
            this.f94824d = d15;
        }
    }

    public void H(Double d15) {
        if (v()) {
            this.f94823c = d15;
        }
    }

    public void I(String str) {
        B("sentry-sampled", str);
    }

    public void J(String str) {
        B("sentry-trace_id", str);
    }

    public void K(String str) {
        B("sentry-transaction", str);
    }

    public void L(b9 b9Var) {
        if (b9Var == null) {
            return;
        }
        I(io.sentry.util.d0.j(A(b9Var)));
        if (b9Var.c() != null) {
            G(x(b9Var));
        }
        if (b9Var.d() != null) {
            c(y(b9Var));
        }
    }

    public void M(a1 a1Var, q7 q7Var) {
        y3 y3VarN = a1Var.N();
        io.sentry.protocol.v vVarM = a1Var.M();
        J(y3VarN.e().toString());
        D(q7Var.retrieveParsedDsn().a());
        E(q7Var.getRelease());
        C(q7Var.getEnvironment());
        if (!io.sentry.protocol.v.f95495b.equals(vVarM)) {
            F(vVarM.toString());
        }
        K(null);
        H(null);
        I(null);
    }

    public void N(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, q7 q7Var, b9 b9Var, String str, io.sentry.protocol.f0 f0Var) {
        J(vVar.toString());
        D(q7Var.retrieveParsedDsn().a());
        E(q7Var.getRelease());
        C(q7Var.getEnvironment());
        if (!u(f0Var)) {
            str = null;
        }
        K(str);
        if (vVar2 != null && !io.sentry.protocol.v.f95495b.equals(vVar2)) {
            F(vVar2.toString());
        }
        H(y(b9Var));
        I(io.sentry.util.d0.j(A(b9Var)));
        G(x(b9Var));
    }

    public String P(String str) {
        String str2;
        int iE;
        StringBuilder sb5 = new StringBuilder();
        if (str == null || str.isEmpty()) {
            str2 = "";
            iE = 0;
        } else {
            sb5.append(str);
            iE = io.sentry.util.d0.e(str, ',') + 1;
            str2 = ",";
        }
        g1 g1VarA = this.f94822b.a();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(this.f94821a.keys()));
            if (g1VarA != null) {
                g1VarA.close();
            }
            treeSet.add("sentry-sample_rate");
            treeSet.add("sentry-sample_rand");
            for (String str3 : treeSet) {
                String strZ = "sentry-sample_rate".equals(str3) ? z(this.f94823c) : "sentry-sample_rand".equals(str3) ? z(this.f94824d) : this.f94821a.get(str3);
                if (strZ != null) {
                    Integer num = f94819j;
                    if (iE >= num.intValue()) {
                        this.f94828h.c(b7.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str3, num);
                    } else {
                        try {
                            String str4 = str2 + b(str3) + "=" + b(strZ);
                            int length = sb5.length() + str4.length();
                            Integer num2 = f94818i;
                            if (length > num2.intValue()) {
                                this.f94828h.c(b7.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str3, num2);
                            } else {
                                iE++;
                                sb5.append(str4);
                                str2 = ",";
                            }
                        } catch (Throwable th4) {
                            this.f94828h.a(b7.ERROR, th4, "Unable to encode baggage key value pair (key=%s,value=%s).", str3, strZ);
                        }
                    }
                }
            }
            return sb5.toString();
        } catch (Throwable th5) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    public z8 Q() {
        String strQ = q();
        String strL = l();
        String strJ = j();
        if (strQ == null || strJ == null) {
            return null;
        }
        io.sentry.protocol.v vVar = new io.sentry.protocol.v(strQ);
        io.sentry.protocol.v vVar2 = null;
        String strK = k();
        String strI = i();
        String strT = t();
        String strR = r();
        String strZ = z(n());
        String strO = o();
        if (strL != null) {
            vVar2 = new io.sentry.protocol.v(strL);
        }
        z8 z8Var = new z8(vVar, strJ, strK, strI, strT, strR, strZ, strO, vVar2, z(m()));
        z8Var.c(s());
        return z8Var;
    }

    public void c(Double d15) {
        this.f94823c = d15;
    }

    public void d() {
        this.f94826f = false;
    }

    public String h(String str) {
        if (str == null) {
            return null;
        }
        return this.f94821a.get(str);
    }

    public String i() {
        return h("sentry-environment");
    }

    public String j() {
        return h("sentry-public_key");
    }

    public String k() {
        return h("sentry-release");
    }

    public String l() {
        return h("sentry-replay_id");
    }

    public Double m() {
        return this.f94824d;
    }

    public Double n() {
        return this.f94823c;
    }

    public String o() {
        return h("sentry-sampled");
    }

    public String p() {
        return this.f94825e;
    }

    public String q() {
        return h("sentry-trace_id");
    }

    public String r() {
        return h("sentry-transaction");
    }

    public Map<String, Object> s() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        g1 g1VarA = this.f94822b.a();
        try {
            for (Map.Entry<String, String> entry : this.f94821a.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!b.f94829a.contains(key) && value != null) {
                    concurrentHashMap.put(key.replaceFirst("sentry-", ""), value);
                }
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
            return concurrentHashMap;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public String t() {
        return h("sentry-user_id");
    }

    public boolean v() {
        return this.f94826f;
    }

    public boolean w() {
        return this.f94827g;
    }

    public d(ConcurrentHashMap<String, String> concurrentHashMap, Double d15, Double d16, String str, boolean z15, boolean z16, v0 v0Var) {
        this.f94822b = new io.sentry.util.a();
        this.f94821a = concurrentHashMap;
        this.f94823c = d15;
        this.f94824d = d16;
        this.f94828h = v0Var;
        this.f94825e = str;
        this.f94826f = z15;
        this.f94827g = z16;
    }
}

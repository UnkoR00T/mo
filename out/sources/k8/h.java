package k8;

import ak.n0;
import ak.p0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.Primes;
import org.conscrypt.metrics.ConscryptStatsLog;
import w7.o0;
import w7.y;
import y7.x;
import zj.p;
import zj.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements d, x {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n0<Long> f109065r = n0.L(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n0<Long> f109066s = n0.L(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n0<Long> f109067t = n0.L(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final n0<Long> f109068u = n0.L(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n0<Long> f109069v = n0.L(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final n0<Long> f109070w = n0.L(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @SuppressLint({"NonFinalStaticField", "StaticFieldLeak"})
    private static h f109071x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f109072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0<Integer, Long> f109073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d.a.C2597a f109074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w7.h f109075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f109076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f109077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f109078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f109079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f109080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f109081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f109082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f109083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f109084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f109085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f109086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f109087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f109088q;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f109089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Integer, Long> f109090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f109091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private w7.h f109092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f109093e;

        public b(Context context) {
            this.f109089a = context == null ? null : context.getApplicationContext();
            this.f109091c = 2000;
            this.f109092d = w7.h.f210683a;
            this.f109093e = true;
            HashMap map = new HashMap(8);
            this.f109090b = map;
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
        }

        public h a() {
            return new h(this.f109089a, this.f109090b, this.f109091c, this.f109092d, this.f109093e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int[] i(String str) {
        str.getClass();
        byte b15 = -1;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    b15 = 0;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    b15 = 1;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    b15 = 2;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    b15 = 3;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    b15 = 4;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    b15 = 5;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    b15 = 6;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    b15 = 7;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    b15 = 8;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    b15 = 9;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    b15 = 10;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    b15 = 11;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    b15 = 12;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    b15 = 13;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    b15 = 14;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b15 = 15;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    b15 = 16;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    b15 = 17;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    b15 = 18;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    b15 = 19;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    b15 = 20;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    b15 = 21;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    b15 = 22;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    b15 = 23;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    b15 = 24;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    b15 = 25;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    b15 = 26;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    b15 = 27;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    b15 = 28;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    b15 = 29;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    b15 = 30;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    b15 = 31;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    b15 = 32;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    b15 = 33;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    b15 = 34;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    b15 = 35;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    b15 = 36;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    b15 = 37;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    b15 = 38;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    b15 = 39;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    b15 = 40;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    b15 = 41;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    b15 = 42;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    b15 = 43;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    b15 = 44;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    b15 = 45;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    b15 = 46;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    b15 = 47;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    b15 = 48;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    b15 = 49;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    b15 = 50;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    b15 = 51;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    b15 = 52;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    b15 = 53;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    b15 = 54;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    b15 = 55;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    b15 = 56;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    b15 = 57;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    b15 = 58;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    b15 = 59;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    b15 = 60;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    b15 = 61;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    b15 = 62;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    b15 = 63;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    b15 = 64;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    b15 = 65;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    b15 = 66;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    b15 = 67;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    b15 = 68;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    b15 = 69;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    b15 = 70;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    b15 = 71;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    b15 = 72;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    b15 = 73;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    b15 = 74;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    b15 = 75;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    b15 = 76;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    b15 = 77;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    b15 = 78;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    b15 = 79;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    b15 = 80;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    b15 = 81;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    b15 = 82;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    b15 = 83;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    b15 = 84;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    b15 = 85;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    b15 = 86;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    b15 = 87;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    b15 = 88;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    b15 = 89;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    b15 = 90;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    b15 = 91;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    b15 = 92;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    b15 = 93;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    b15 = 94;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    b15 = 95;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    b15 = 96;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    b15 = 97;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    b15 = 98;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    b15 = 99;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    b15 = 100;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    b15 = 101;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    b15 = 102;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    b15 = 103;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    b15 = 104;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    b15 = 105;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    b15 = 106;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    b15 = 107;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    b15 = 108;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    b15 = 109;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    b15 = 110;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    b15 = 111;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    b15 = 112;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    b15 = 113;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    b15 = 114;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    b15 = 115;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    b15 = 116;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    b15 = 117;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b15 = 118;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    b15 = 119;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b15 = 120;
                }
                break;
            case 2429:
                if (str.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37095v)) {
                    b15 = 121;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    b15 = 122;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    b15 = 123;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    b15 = 124;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    b15 = 125;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    b15 = 126;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    b15 = 127;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    b15 = 128;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    b15 = 129;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    b15 = 130;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    b15 = 131;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    b15 = 132;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    b15 = 133;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    b15 = 134;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    b15 = 135;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    b15 = 136;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    b15 = 137;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    b15 = 138;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    b15 = 139;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    b15 = 140;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    b15 = 141;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    b15 = 142;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    b15 = 143;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    b15 = 144;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    b15 = 145;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    b15 = 146;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    b15 = 147;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    b15 = 148;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    b15 = 149;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    b15 = 150;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    b15 = 151;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    b15 = 152;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    b15 = 153;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    b15 = 154;
                }
                break;
            case 2488:
                if (str.equals("NF")) {
                    b15 = 155;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    b15 = 156;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    b15 = 157;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    b15 = 158;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    b15 = 159;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    b15 = 160;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    b15 = 161;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    b15 = 162;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    b15 = 163;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    b15 = 164;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    b15 = 165;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    b15 = 166;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    b15 = 167;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    b15 = 168;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    b15 = 169;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    b15 = 170;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    b15 = 171;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    b15 = 172;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    b15 = 173;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    b15 = 174;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    b15 = 175;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    b15 = 176;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    b15 = 177;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    b15 = 178;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    b15 = 179;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    b15 = 180;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    b15 = 181;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    b15 = 182;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    b15 = 183;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    b15 = 184;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    b15 = 185;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    b15 = 186;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    b15 = 187;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    b15 = PSSSigner.TRAILER_IMPLICIT;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    b15 = 189;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    b15 = 190;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    b15 = 191;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    b15 = 192;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    b15 = 193;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    b15 = 194;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    b15 = 195;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    b15 = 196;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    b15 = 197;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    b15 = 198;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    b15 = 199;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    b15 = 200;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    b15 = 201;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    b15 = 202;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    b15 = 203;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    b15 = 204;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    b15 = 205;
                }
                break;
            case 2672:
                if (str.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.B)) {
                    b15 = 206;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    b15 = 207;
                }
                break;
            case 2676:
                if (str.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.A)) {
                    b15 = 208;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    b15 = 209;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    b15 = 210;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    b15 = 211;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    b15 = 212;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    b15 = 213;
                }
                break;
            case 2686:
                if (str.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37099z)) {
                    b15 = 214;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    b15 = 215;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    b15 = 216;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    b15 = 217;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    b15 = 218;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    b15 = 219;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    b15 = 220;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    b15 = 221;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    b15 = 222;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    b15 = 223;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    b15 = 224;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    b15 = 225;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    b15 = 226;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    b15 = 227;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    b15 = 228;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    b15 = 229;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    b15 = 230;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    b15 = 231;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    b15 = 232;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    b15 = 233;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    b15 = 234;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    b15 = 235;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    b15 = 236;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    b15 = 237;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    b15 = 238;
                }
                break;
        }
        switch (b15) {
            case 0:
            case 4:
            case 17:
            case 29:
            case 50:
            case 57:
            case 113:
            case 116:
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case 165:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case 8:
            case 63:
            case 162:
            case 186:
            case 190:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 2, 2, 1, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case 61:
            case 93:
            case 102:
            case CertificateBody.profileType /* 127 */:
            case 145:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 12:
                return new int[]{0, 3, 1, 1, 3, 0};
            case 13:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case 121:
            case 144:
            case 172:
            case 195:
            case BERTags.FLAGS /* 224 */:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 55:
            case 128:
            case 194:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 106:
            case 214:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case 187:
            case 203:
            case 206:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case 175:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 84:
            case 92:
            case 154:
            case 226:
            case 234:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
            case 177:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case BERTags.DATE /* 31 */:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 32:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 33:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 34:
                return new int[]{1, 2, 3, 3, 2, 2};
            case 35:
            case EACTags.CURRENCY_CODE /* 42 */:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 36:
            case 219:
                return new int[]{0, 2, 1, 2, 3, 3};
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case 137:
                return new int[]{3, 3, 2, 2, 2, 2};
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return new int[]{4, 2, 4, 2, 2, 2};
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
            case 62:
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 40:
                return new int[]{0, 1, 0, 0, 0, 2};
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case 208:
                return new int[]{0, 1, 2, 2, 2, 2};
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
            case 143:
                return new int[]{4, 3, 3, 4, 2, 2};
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return new int[]{2, 0, 1, 1, 3, 1};
            case 46:
                return new int[]{2, 3, 3, 2, 2, 2};
            case 47:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 48:
            case 111:
            case 161:
            case 210:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 49:
                return new int[]{2, 3, 0, 1, 2, 2};
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 53:
                return new int[]{0, 0, 2, 0, 1, 2};
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return new int[]{0, 1, 4, 2, 2, 1};
            case 56:
                return new int[]{0, 0, 2, 0, 0, 2};
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 209:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 60:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
                return new int[]{0, 0, 0, 0, 1, 0};
            case 65:
                return new int[]{4, 3, 4, 4, 4, 2};
            case 66:
                return new int[]{0, 0, 0, 1, 0, 2};
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return new int[]{3, 2, 2, 3, 2, 2};
            case EACTags.APPLICATION_IMAGE /* 68 */:
            case 155:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return new int[]{4, 2, 4, 0, 2, 2};
            case 70:
                return new int[]{0, 2, 2, 0, 2, 2};
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return new int[]{1, 1, 1, 1, 0, 2};
            case 72:
                return new int[]{3, 4, 0, 0, 2, 2};
            case 73:
                return new int[]{1, 1, 3, 2, 2, 2};
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return new int[]{2, 2, 0, 0, 2, 2};
            case EACTags.DEPRECATED /* 75 */:
                return new int[]{1, 1, 0, 2, 2, 2};
            case 76:
                return new int[]{3, 2, 3, 3, 2, 2};
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 78:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 79:
            case 97:
            case 104:
                return new int[]{0, 2, 0, 1, 2, 2};
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case EACTags.ANSWER_TO_RESET /* 81 */:
            case 199:
                return new int[]{4, 3, 2, 4, 2, 2};
            case EACTags.HISTORICAL_BYTES /* 82 */:
                return new int[]{3, 4, 4, 2, 2, 2};
            case 83:
                return new int[]{2, 1, 1, 3, 2, 2};
            case 85:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 86:
                return new int[]{2, 1, 2, 1, 2, 2};
            case 87:
                return new int[]{2, 2, 4, 3, 3, 2};
            case 88:
                return new int[]{4, 4, 1, 2, 2, 2};
            case 89:
                return new int[]{3, 1, 1, 3, 2, 2};
            case 90:
                return new int[]{0, 1, 0, 1, 1, 0};
            case 91:
            case 115:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 94:
                return new int[]{3, 1, 3, 3, 2, 4};
            case 95:
                return new int[]{1, 1, 1, 1, 1, 2};
            case 96:
                return new int[]{1, 2, 2, 3, 4, 2};
            case 98:
                return new int[]{1, 1, 3, 2, 2, 3};
            case 99:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 100:
                return new int[]{3, 2, 3, 2, 2, 2};
            case 101:
                return new int[]{4, 2, 3, 3, 4, 3};
            case 103:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 105:
                return new int[]{2, 4, 3, 1, 2, 2};
            case 107:
                return new int[]{0, 3, 2, 3, 4, 2};
            case 108:
                return new int[]{3, 2, 1, 1, 1, 2};
            case 109:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 110:
                return new int[]{1, 0, 4, 2, 2, 2};
            case 112:
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 114:
                return new int[]{0, 2, 2, 4, 4, 4};
            case 117:
                return new int[]{2, 1, 2, 2, 3, 2};
            case 118:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 119:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 120:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 122:
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case 124:
            case 168:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 125:
                return new int[]{0, 1, 0, 1, 0, 2};
            case 126:
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 133:
                return new int[]{1, 2, 2, 3, 2, 2};
            case 135:
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
            case 216:
            case 231:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
                return new int[]{0, 2, 4, 4, 3, 1};
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 146:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case 148:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 149:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case 151:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 152:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case 235:
                return new int[]{2, 3, 3, 4, 2, 2};
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 0, 4};
            case 159:
                return new int[]{0, 0, 3, 0, 0, 2};
            case 160:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 163:
                return new int[]{0, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 2, 4, 2};
            case 166:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 167:
                return new int[]{2, 2, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 1, 2, 3, 2, 1};
            case 170:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 171:
                return new int[]{1, 0, 2, 2, 4, 4};
            case 173:
                return new int[]{2, 0, 2, 1, 2, 0};
            case 174:
                return new int[]{3, 4, 1, 3, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 178:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 179:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case 181:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case 183:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 184:
                return new int[]{3, 1, 1, 2, 2, 0};
            case 185:
            case 238:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 189:
                return new int[]{2, 3, 3, 3, 1, 1};
            case 193:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 197:
                return new int[]{2, 2, 3, 4, 4, 2};
            case 198:
                return new int[]{2, 4, 4, 1, 2, 2};
            case DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE /* 200 */:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 205:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 207:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 212:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 215:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case 220:
                return new int[]{3, 3, 2, 3, 4, 2};
            case 221:
                return new int[]{2, 2, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 1, 1, 2, 1, 2};
            case 223:
                return new int[]{1, 2, 3, 4, 3, 2};
            case 227:
                return new int[]{2, 2, 1, 1, 2, 4};
            case 228:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 229:
                return new int[]{0, 0, 1, 2, 2, 2};
            case 233:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 236:
                return new int[]{2, 4, 2, 1, 1, 2};
            case 237:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long j(int i15) {
        Long lValueOf = this.f109073b.get(Integer.valueOf(i15));
        if (lValueOf == null) {
            lValueOf = this.f109073b.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            lValueOf = Long.valueOf(k(this.f109088q, i15));
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    private static long k(String str, int i15) {
        int[] iArrI = i(v.e(str));
        if (i15 != 2) {
            if (i15 == 3) {
                return f109066s.get(iArrI[1]).longValue();
            }
            if (i15 == 4) {
                return f109067t.get(iArrI[2]).longValue();
            }
            if (i15 == 5) {
                return f109068u.get(iArrI[3]).longValue();
            }
            if (i15 != 7) {
                if (i15 == 9) {
                    return f109070w.get(iArrI[5]).longValue();
                }
                if (i15 != 10) {
                    return 1000000L;
                }
                return f109069v.get(iArrI[4]).longValue();
            }
        }
        return f109065r.get(iArrI[0]).longValue();
    }

    public static synchronized h l(Context context) {
        try {
            if (f109071x == null) {
                f109071x = new b(context).a();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f109071x;
    }

    private static boolean m(y7.j jVar, boolean z15) {
        return z15 && !jVar.d(8);
    }

    private void n(int i15, long j15, long j16) {
        if (i15 == 0 && j15 == 0 && j16 == this.f109084m) {
            return;
        }
        this.f109084m = j16;
        this.f109074c.c(i15, j15, j16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(int i15) throws Throwable {
        Throwable th4;
        try {
            try {
                int i16 = this.f109085n;
                if (i16 != 0) {
                    try {
                        if (!this.f109076e) {
                            return;
                        }
                    } catch (Throwable th5) {
                        th4 = th5;
                    }
                }
                if (this.f109086o) {
                    i15 = this.f109087p;
                }
                if (i16 != i15 || this.f109088q == null) {
                    this.f109085n = i15;
                    if (i15 == 1 || i15 == 0 || i15 == 8) {
                        return;
                    }
                    if (this.f109088q == null) {
                        this.f109088q = o0.Q(this.f109072a);
                    }
                    this.f109083l = j(i15);
                    long jB = this.f109075d.b();
                    n(this.f109078g > 0 ? (int) (jB - this.f109079h) : 0, this.f109080i, this.f109083l);
                    this.f109079h = jB;
                    this.f109080i = 0L;
                    this.f109082k = 0L;
                    this.f109081j = 0L;
                    this.f109077f.g();
                    return;
                }
                return;
            } catch (Throwable th6) {
                th = th6;
                th4 = th;
            }
        } catch (Throwable th7) {
            th = th7;
            th4 = th;
        }
        throw th4;
    }

    @Override // k8.d
    public void a(d.a aVar) {
        this.f109074c.d(aVar);
    }

    @Override // y7.x
    public synchronized void b(y7.f fVar, y7.j jVar, boolean z15) {
        try {
            if (m(jVar, z15)) {
                if (this.f109078g == 0) {
                    this.f109079h = this.f109075d.b();
                }
                this.f109078g++;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #1 {all -> 0x0072, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0011, B:13:0x002e, B:23:0x0060, B:22:0x0055), top: B:38:0x0001 }] */
    @Override // y7.x
    public synchronized void c(y7.f fVar, y7.j jVar, boolean z15) throws Throwable {
        Throwable th4;
        h hVar;
        try {
            try {
                if (m(jVar, z15)) {
                    p.w(this.f109078g > 0);
                    long jB = this.f109075d.b();
                    int i15 = (int) (jB - this.f109079h);
                    this.f109081j += (long) i15;
                    long j15 = this.f109082k;
                    long j16 = this.f109080i;
                    this.f109082k = j15 + j16;
                    if (i15 > 0) {
                        this.f109077f.c((int) Math.sqrt(j16), (j16 * 8000.0f) / i15);
                        if (this.f109081j < 2000) {
                            try {
                                if (this.f109082k >= 524288) {
                                    this.f109083l = (long) this.f109077f.f(0.5f);
                                }
                            } catch (Throwable th5) {
                                th4 = th5;
                            }
                        } else {
                            this.f109083l = (long) this.f109077f.f(0.5f);
                        }
                        hVar = this;
                        hVar.n(i15, this.f109080i, this.f109083l);
                        hVar.f109079h = jB;
                        hVar.f109080i = 0L;
                    } else {
                        hVar = this;
                    }
                    hVar.f109078g--;
                    return;
                }
                return;
            } catch (Throwable th6) {
                th = th6;
                th4 = th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        throw th4;
    }

    @Override // k8.d
    public x d() {
        return this;
    }

    @Override // k8.d
    public void e(Handler handler, d.a aVar) {
        p.q(handler);
        p.q(aVar);
        this.f109074c.b(handler, aVar);
    }

    @Override // y7.x
    public synchronized void f(y7.f fVar, y7.j jVar, boolean z15, int i15) {
        if (m(jVar, z15)) {
            this.f109080i += (long) i15;
        }
    }

    @Override // y7.x
    public void g(y7.f fVar, y7.j jVar, boolean z15) {
    }

    private h(Context context, Map<Integer, Long> map, int i15, w7.h hVar, boolean z15) {
        this.f109072a = context == null ? null : context.getApplicationContext();
        this.f109073b = p0.d(map);
        this.f109074c = new d.a.C2597a();
        this.f109077f = new o(i15);
        this.f109075d = hVar;
        this.f109076e = z15;
        if (context == null) {
            this.f109085n = 0;
            this.f109083l = 1000000L;
            return;
        }
        y yVarE = y.e(context);
        int iG = yVarE.g();
        this.f109085n = iG;
        this.f109083l = j(iG);
        yVarE.k(new y.c() { // from class: k8.g
            @Override // w7.y.c
            public final void a(int i16) throws Throwable {
                this.f109064a.o(i16);
            }
        }, w7.a.a());
    }
}

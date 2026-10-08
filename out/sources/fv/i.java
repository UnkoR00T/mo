package fv;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.conscrypt.metrics.ConscryptStatsLog;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"Lfv/i;", "", "", "javaName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {
    public static final i A;
    public static final i A0;
    public static final i B;
    public static final i B0;
    public static final i C;
    public static final i C0;
    public static final i D;
    public static final i D0;
    public static final i E;
    public static final i E0;
    public static final i F;
    public static final i F0;
    public static final i G;
    public static final i G0;
    public static final i H;
    public static final i H0;
    public static final i I;
    public static final i I0;
    public static final i J;
    public static final i J0;
    public static final i K;
    public static final i K0;
    public static final i L;
    public static final i L0;
    public static final i M;
    public static final i M0;
    public static final i N;
    public static final i N0;
    public static final i O;
    public static final i O0;
    public static final i P;
    public static final i P0;
    public static final i Q;
    public static final i Q0;
    public static final i R;
    public static final i R0;
    public static final i S;
    public static final i S0;
    public static final i T;
    public static final i T0;
    public static final i U;
    public static final i U0;
    public static final i V;
    public static final i V0;
    public static final i W;
    public static final i W0;
    public static final i X;
    public static final i X0;
    public static final i Y;
    public static final i Y0;
    public static final i Z;
    public static final i Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final i f67370a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final i f67371a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final i f67373b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final i f67374b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator<String> f67375c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final i f67376c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final i f67377c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, i> f67378d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final i f67379d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final i f67380d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f67381e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final i f67382e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final i f67383e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f67384f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final i f67385f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final i f67386f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f67387g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final i f67388g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final i f67389g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f67390h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final i f67391h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final i f67392h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f67393i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final i f67394i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final i f67395i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i f67396j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final i f67397j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final i f67398j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i f67399k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final i f67400k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final i f67401k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i f67402l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final i f67403l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final i f67404l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i f67405m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final i f67406m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final i f67407m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f67408n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final i f67409n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final i f67410n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i f67411o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final i f67412o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final i f67413o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i f67414p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i f67415p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final i f67416p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i f67417q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final i f67418q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final i f67419q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i f67420r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final i f67421r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final i f67422r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i f67423s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final i f67424s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final i f67425s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i f67426t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final i f67427t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final i f67428u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final i f67429u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f67430v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final i f67431v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final i f67432w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final i f67433w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final i f67434x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final i f67435x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final i f67436y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final i f67437y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final i f67438z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final i f67439z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String javaName;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001f\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"fv/i$a", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "a", "b", "", "(Ljava/lang/String;Ljava/lang/String;)I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String a15, String b15) {
            int iMin = Math.min(a15.length(), b15.length());
            for (int i15 = 4; i15 < iMin; i15++) {
                char cCharAt = a15.charAt(i15);
                char cCharAt2 = b15.charAt(i15);
                if (cCharAt != cCharAt2) {
                    return fr.t.d(cCharAt, cCharAt2) < 0 ? -1 : 1;
                }
            }
            int length = a15.length();
            int length2 = b15.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: fv.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b{\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010%\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u0014\u0010'\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u0014\u0010(\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u0014\u0010*\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u0014\u0010+\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u0014\u0010,\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u0014\u0010-\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u0014\u0010.\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u0014\u0010/\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u0014\u00100\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u0014\u00101\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u0014\u00102\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u0014\u00103\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u0014\u00104\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0019R\u0014\u00105\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019R\u0014\u00106\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0019R\u0014\u00107\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0019R\u0014\u00108\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0019R\u0014\u00109\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0019R\u0014\u0010:\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0019R\u0014\u0010;\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0019R\u0014\u0010<\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0019R\u0014\u0010=\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0019R\u0014\u0010>\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0019R\u0014\u0010?\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0019R\u0014\u0010@\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0019R\u0014\u0010A\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0019R\u0014\u0010B\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0019R\u0014\u0010C\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0019R\u0014\u0010D\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0019R\u0014\u0010E\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0019R\u0014\u0010F\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0019R\u0014\u0010G\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0019R\u0014\u0010H\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0019R\u0014\u0010I\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0019R\u0014\u0010J\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0019R\u0014\u0010K\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0019R\u0014\u0010L\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0019R\u0014\u0010M\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0019R\u0014\u0010N\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0019R\u0014\u0010O\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0019R\u0014\u0010P\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0019R\u0014\u0010Q\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0019R\u0014\u0010R\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0019R\u0014\u0010S\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0019R\u0014\u0010T\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0019R\u0014\u0010U\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0019R\u0014\u0010V\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0019R\u0014\u0010W\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0019R\u0014\u0010X\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0019R\u0014\u0010Y\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0019R\u0014\u0010Z\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0019R\u0014\u0010[\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0019R\u0014\u0010\\\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0019R\u0014\u0010]\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0019R\u0014\u0010^\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0019R\u0014\u0010_\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0019R\u0014\u0010`\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0019R\u0014\u0010a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0019R\u0014\u0010b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0019R\u0014\u0010c\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0019R\u0014\u0010d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0019R\u0014\u0010e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010\u0019R\u0014\u0010f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0019R\u0014\u0010g\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0019R\u0014\u0010h\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0019R\u0014\u0010i\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0019R\u0014\u0010j\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0019R\u0014\u0010k\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0019R\u0014\u0010l\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0019R\u0014\u0010m\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010\u0019R\u0014\u0010n\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0019R\u0014\u0010o\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010\u0019R\u0014\u0010p\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0019R\u0014\u0010q\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0019R\u0014\u0010r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010\u0019R\u0014\u0010s\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0019R\u0014\u0010t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0019R\u0014\u0010u\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010\u0019R\u0014\u0010v\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0019R\u0014\u0010w\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0019R\u0014\u0010x\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0019R\u0014\u0010y\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010\u0019R\u0014\u0010z\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0019R\u0014\u0010{\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010\u0019R\u0014\u0010|\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0019R\u0014\u0010}\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010\u0019R\u0014\u0010~\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0019R\u0014\u0010\u007f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\u0019R\u0016\u0010\u0080\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0019R\u0016\u0010\u0081\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0019R\u0016\u0010\u0082\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0019R\u0016\u0010\u0083\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0019R\u0016\u0010\u0084\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0019R\u0016\u0010\u0085\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0019R\u0016\u0010\u0086\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0019R\u0016\u0010\u0087\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0019R\u0016\u0010\u0088\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0019R\u0016\u0010\u0089\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u0019R\u0016\u0010\u008a\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u0019R\u0016\u0010\u008b\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u0019R\u0016\u0010\u008c\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u0019R\u0016\u0010\u008d\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010\u0019R\u0016\u0010\u008e\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u0019R\u0016\u0010\u008f\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010\u0019¨\u0006\u0090\u0001"}, d2 = {"Lfv/i$b;", "", "<init>", "()V", "", "javaName", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "value", "Lfv/i;", "d", "(Ljava/lang/String;I)Lfv/i;", "b", "(Ljava/lang/String;)Lfv/i;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ORDER_BY_NAME", "Ljava/util/Comparator;", "c", "()Ljava/util/Comparator;", "", "INSTANCES", "Ljava/util/Map;", "TLS_AES_128_CCM_8_SHA256", "Lfv/i;", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i d(String javaName, int value) {
            i iVar = new i(javaName, null);
            i.f67378d.put(javaName, iVar);
            return iVar;
        }

        private final String e(String javaName) {
            if (fu.r.V(javaName, "TLS_", false, 2, null)) {
                return "SSL_" + javaName.substring(4);
            }
            if (!fu.r.V(javaName, "SSL_", false, 2, null)) {
                return javaName;
            }
            return "TLS_" + javaName.substring(4);
        }

        public final synchronized i b(String javaName) {
            i iVar;
            try {
                iVar = (i) i.f67378d.get(javaName);
                if (iVar == null) {
                    iVar = (i) i.f67378d.get(e(javaName));
                    if (iVar == null) {
                        iVar = new i(javaName, null);
                    }
                    i.f67378d.put(javaName, iVar);
                }
            } catch (Throwable th4) {
                throw th4;
            }
            return iVar;
        }

        public final Comparator<String> c() {
            return i.f67375c;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f67375c = new a();
        f67378d = new LinkedHashMap();
        f67381e = companion.d("SSL_RSA_WITH_NULL_MD5", 1);
        f67384f = companion.d("SSL_RSA_WITH_NULL_SHA", 2);
        f67387g = companion.d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        f67390h = companion.d("SSL_RSA_WITH_RC4_128_MD5", 4);
        f67393i = companion.d("SSL_RSA_WITH_RC4_128_SHA", 5);
        f67396j = companion.d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        f67399k = companion.d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f67402l = companion.d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        f67405m = companion.d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        f67408n = companion.d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        f67411o = companion.d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        f67414p = companion.d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        f67417q = companion.d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        f67420r = companion.d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        f67423s = companion.d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        f67426t = companion.d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        f67428u = companion.d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        f67430v = companion.d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        f67432w = companion.d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        f67434x = companion.d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        f67436y = companion.d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        f67438z = companion.d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        A = companion.d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        B = companion.d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        C = companion.d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        D = companion.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        E = companion.d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        F = companion.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        G = companion.d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        H = companion.d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        I = companion.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        J = companion.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        K = companion.d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        L = companion.d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        M = companion.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        N = companion.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        O = companion.d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        P = companion.d("TLS_RSA_WITH_NULL_SHA256", 59);
        Q = companion.d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        R = companion.d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        S = companion.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        T = companion.d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        U = companion.d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        V = companion.d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        W = companion.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        X = companion.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        Y = companion.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        Z = companion.d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        f67370a0 = companion.d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        f67373b0 = companion.d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        f67376c0 = companion.d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        f67379d0 = companion.d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        f67382e0 = companion.d("TLS_PSK_WITH_RC4_128_SHA", 138);
        f67385f0 = companion.d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        f67388g0 = companion.d("TLS_PSK_WITH_AES_128_CBC_SHA", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA);
        f67391h0 = companion.d("TLS_PSK_WITH_AES_256_CBC_SHA", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA);
        f67394i0 = companion.d("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f67397j0 = companion.d("TLS_RSA_WITH_AES_128_GCM_SHA256", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256);
        f67400k0 = companion.d("TLS_RSA_WITH_AES_256_GCM_SHA384", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384);
        f67403l0 = companion.d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        f67406m0 = companion.d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        f67409n0 = companion.d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        f67412o0 = companion.d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        f67415p0 = companion.d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        f67418q0 = companion.d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        f67421r0 = companion.d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", GF2Field.MASK);
        f67424s0 = companion.d("TLS_FALLBACK_SCSV", 22016);
        f67427t0 = companion.d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        f67429u0 = companion.d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        f67431v0 = companion.d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        f67433w0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        f67435x0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        f67437y0 = companion.d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        f67439z0 = companion.d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        A0 = companion.d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        B0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA);
        C0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA);
        D0 = companion.d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        E0 = companion.d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        F0 = companion.d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        G0 = companion.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        H0 = companion.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        I0 = companion.d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        J0 = companion.d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        K0 = companion.d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        L0 = companion.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA);
        M0 = companion.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA);
        N0 = companion.d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        O0 = companion.d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        P0 = companion.d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        Q0 = companion.d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        R0 = companion.d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        S0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        T0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        U0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        V0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        W0 = companion.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        X0 = companion.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        Y0 = companion.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        Z0 = companion.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f67371a1 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256);
        f67374b1 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384);
        f67377c1 = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        f67380d1 = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f67383e1 = companion.d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256);
        f67386f1 = companion.d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384);
        f67389g1 = companion.d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        f67392h1 = companion.d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        f67395i1 = companion.d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA);
        f67398j1 = companion.d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA);
        f67401k1 = companion.d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        f67404l1 = companion.d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256);
        f67407m1 = companion.d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        f67410n1 = companion.d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256);
        f67413o1 = companion.d("TLS_AES_128_GCM_SHA256", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_AES_128_GCM_SHA256);
        f67416p1 = companion.d("TLS_AES_256_GCM_SHA384", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_AES_256_GCM_SHA384);
        f67419q1 = companion.d("TLS_CHACHA20_POLY1305_SHA256", ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_CHACHA20_POLY1305_SHA256);
        f67422r1 = companion.d("TLS_AES_128_CCM_SHA256", 4868);
        f67425s1 = companion.d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public /* synthetic */ i(String str, fr.k kVar) {
        this(str);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    public String toString() {
        return this.javaName;
    }

    private i(String str) {
        this.javaName = str;
    }
}

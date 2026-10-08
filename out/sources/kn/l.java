package kn;

import org.bouncycastle.asn1.BERTags;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final l[] f111498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static l[] f111499j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f111500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f111501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f111502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f111503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f111504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f111505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f111506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f111507h;

    static {
        l[] lVarArr = {new l(false, 3, 5, 8, 8, 1), new l(false, 5, 7, 10, 10, 1), new l(true, 5, 7, 16, 6, 1), new l(false, 8, 10, 12, 12, 1), new l(true, 10, 11, 14, 6, 2), new l(false, 12, 12, 14, 14, 1), new l(true, 16, 14, 24, 10, 1), new l(false, 18, 14, 16, 16, 1), new l(false, 22, 18, 18, 18, 1), new l(true, 22, 18, 16, 10, 2), new l(false, 30, 20, 20, 20, 1), new l(true, 32, 24, 16, 14, 2), new l(false, 36, 24, 22, 22, 1), new l(false, 44, 28, 24, 24, 1), new l(true, 49, 28, 22, 14, 2), new l(false, 62, 36, 14, 14, 4), new l(false, 86, 42, 16, 16, 4), new l(false, 114, 48, 18, 18, 4), new l(false, 144, 56, 20, 20, 4), new l(false, 174, 68, 22, 22, 4), new l(false, 204, 84, 24, 24, 4, 102, 42), new l(false, 280, 112, 14, 14, 16, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA, 56), new l(false, 368, 144, 16, 16, 16, 92, 36), new l(false, 456, 192, 18, 18, 16, 114, 48), new l(false, 576, BERTags.FLAGS, 20, 20, 16, 144, 56), new l(false, 696, 272, 22, 22, 16, 174, 68), new l(false, 816, 336, 24, 24, 16, 136, 56), new l(false, 1050, 408, 18, 18, 36, 175, 68), new l(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f111498i = lVarArr;
        f111499j = lVarArr;
    }

    public l(boolean z15, int i15, int i16, int i17, int i18, int i19) {
        this(z15, i15, i16, i17, i18, i19, i15, i16);
    }

    private int e() {
        int i15 = this.f111505f;
        int i16 = 1;
        if (i15 != 1) {
            i16 = 2;
            if (i15 != 2 && i15 != 4) {
                if (i15 == 16) {
                    return 4;
                }
                if (i15 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i16;
    }

    private int k() {
        int i15 = this.f111505f;
        if (i15 == 1 || i15 == 2) {
            return 1;
        }
        if (i15 == 4) {
            return 2;
        }
        if (i15 == 16) {
            return 4;
        }
        if (i15 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public static l l(int i15, m mVar, en.b bVar, en.b bVar2, boolean z15) {
        for (l lVar : f111499j) {
            if (!(mVar == m.FORCE_SQUARE && lVar.f111500a) && ((mVar != m.FORCE_RECTANGLE || lVar.f111500a) && ((bVar == null || (lVar.j() >= bVar.b() && lVar.i() >= bVar.a())) && ((bVar2 == null || (lVar.j() <= bVar2.b() && lVar.i() <= bVar2.a())) && i15 <= lVar.f111501b)))) {
                return lVar;
            }
        }
        if (!z15) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i15);
    }

    public final int a() {
        return this.f111501b;
    }

    public int b(int i15) {
        return this.f111506g;
    }

    public final int c() {
        return this.f111502c;
    }

    public final int d(int i15) {
        return this.f111507h;
    }

    public int f() {
        return this.f111501b / this.f111506g;
    }

    public final int g() {
        return k() * this.f111504e;
    }

    public final int h() {
        return e() * this.f111503d;
    }

    public final int i() {
        return g() + (k() * 2);
    }

    public final int j() {
        return h() + (e() * 2);
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f111500a ? "Rectangular Symbol:" : "Square Symbol:");
        sb5.append(" data region ");
        sb5.append(this.f111503d);
        sb5.append('x');
        sb5.append(this.f111504e);
        sb5.append(", symbol size ");
        sb5.append(j());
        sb5.append('x');
        sb5.append(i());
        sb5.append(", symbol data size ");
        sb5.append(h());
        sb5.append('x');
        sb5.append(g());
        sb5.append(", codewords ");
        sb5.append(this.f111501b);
        sb5.append('+');
        sb5.append(this.f111502c);
        return sb5.toString();
    }

    l(boolean z15, int i15, int i16, int i17, int i18, int i19, int i25, int i26) {
        this.f111500a = z15;
        this.f111501b = i15;
        this.f111502c = i16;
        this.f111503d = i17;
        this.f111504e = i18;
        this.f111505f = i19;
        this.f111506g = i25;
        this.f111507h = i26;
    }
}

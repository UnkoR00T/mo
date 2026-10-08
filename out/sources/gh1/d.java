package gh1;

import androidx.compose.ui.graphics.Color;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import n3.o1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bM\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010 \u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010#\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013R\u001a\u0010&\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013R\u001a\u0010)\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013R\u001a\u0010+\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b!\u0010\u0013R\u001a\u0010.\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010\u0013R\u001a\u0010/\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b,\u0010\u0013R\u001a\u00102\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b1\u0010\u0013R\u001a\u00103\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001a\u00106\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010\u0011\u001a\u0004\b5\u0010\u0013R\u001a\u00109\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010\u0011\u001a\u0004\b8\u0010\u0013R\u001a\u0010<\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010\u0011\u001a\u0004\b;\u0010\u0013R\u001a\u0010=\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010\u0011\u001a\u0004\b$\u0010\u0013R\u001a\u0010>\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b'\u0010\u0013R\u001a\u0010@\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u0011\u001a\u0004\b?\u0010\u0013R\u001a\u0010B\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010\u0011\u001a\u0004\b4\u0010\u0013R\u001a\u0010D\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010\u0011\u001a\u0004\bC\u0010\u0013R\u001a\u0010E\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010H\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010\u0011\u001a\u0004\bG\u0010\u0013R\u001a\u0010J\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\bI\u0010\u0013R\u001a\u0010K\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u0011\u001a\u0004\b:\u0010\u0013R\u001a\u0010L\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b0\u0010\u0013R\u001a\u0010M\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010\u0011\u001a\u0004\b7\u0010\u0013R\u001a\u0010O\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010\u0011\u001a\u0004\bN\u0010\u0013R\u001a\u0010P\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\bA\u0010\u0013R\u001a\u0010Q\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010R\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\u0011\u001a\u0004\b*\u0010\u0013R\u001a\u0010T\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010\u0011\u001a\u0004\bS\u0010\u0013R\u001a\u0010U\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010W\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010\u0011\u001a\u0004\bF\u0010\u0013R\u001a\u0010Y\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0011\u001a\u0004\bX\u0010\u0013R\u001a\u0010[\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013¨\u0006\\"}, d2 = {"Lgh1/d;", "Lgh1/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/Color;", "b", "J", "A", "()J", "borderMdowod", "c", "y", "borderEmeryt", "d", ip.a.f96138c, "borderPrawoJazdy", "e", "n", "borderMpojazd", "f", "l", "borderKdr", "g", "getBorderSzkolna-0d7_KjU", "borderSzkolna", "h", "s", "borderStudencka", "i", "t", "borderAdwokacka", "j", "borderPoselska", "k", "z", "borderUut", "borderDiia", "m", "v", "borderPielegniarka", "borderPolozna", "o", "F", "borderLekarz", "p", "G", "borderDentysta", "q", "r", "borderRadcaPrawnegy", "borderNiepelnosprawny", "borderSenatorska", "C", "borderNauczyciela", "u", "borderGeneryczny", "w", "borderKomornik", "borderDoradcaPodatkowy", "x", "B", "borderBieglyRewident", i.f37087n, "borderDoktoranta", "borderFizjoterapeuta", "borderFarmaceuta", "airQualityBest80", "E", "airQualityGood80", "airQualityBad100", "airQualityBad300", "airQualityWorst200", "getBorderPatentStrzelecki-0d7_KjU", "borderPatentStrzelecki", "borderElectronicDiploma", "I", "borderDiagnosty", "a", "studentBackground", "K", "borderEmerytMswia", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d implements a {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final long borderDiagnosty;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final long studentBackground;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final long borderEmerytMswia;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f72954a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long borderMdowod = o1.d(4287414757L);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long borderEmeryt = o1.d(4290968575L);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long borderPrawoJazdy = o1.d(4292400383L);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final long borderMpojazd = o1.d(4294235574L);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final long borderKdr = o1.d(4290425063L);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final long borderSzkolna = o1.d(4292125865L);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final long borderStudencka = o1.d(4289315264L);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final long borderAdwokacka = o1.d(4290431170L);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final long borderPoselska = o1.d(4292134592L);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final long borderUut = o1.d(4290426847L);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final long borderDiia = o1.d(4291091422L);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final long borderPielegniarka = o1.d(4291284178L);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final long borderPolozna = o1.d(4291269022L);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final long borderLekarz = o1.d(4285323740L);

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final long borderDentysta = o1.d(4294432247L);

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final long borderRadcaPrawnegy = o1.d(4286422259L);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final long borderNiepelnosprawny = o1.d(4288469486L);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final long borderSenatorska = o1.d(4294234533L);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final long borderNauczyciela = o1.d(4288135908L);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final long borderGeneryczny = o1.d(4288389568L);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final long borderKomornik = o1.d(4290167760L);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final long borderDoradcaPodatkowy = o1.d(4291750399L);

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final long borderBieglyRewident = o1.d(4289905632L);

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final long borderDoktoranta = o1.d(4288402152L);

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final long borderFizjoterapeuta = o1.d(4289759429L);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final long borderFarmaceuta = o1.d(4287743923L);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final long airQualityBest80 = o1.d(4278251132L);

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final long airQualityGood80 = o1.d(4294940259L);

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final long airQualityBad100 = o1.d(4294920498L);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final long airQualityBad300 = o1.d(4289036662L);

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final long airQualityWorst200 = o1.d(4287005695L);

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final long borderPatentStrzelecki = o1.d(3271294924L);

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final long borderElectronicDiploma = o1.d(4290167760L);

    static {
        Color.Companion companion = Color.INSTANCE;
        borderDiagnosty = companion.g();
        studentBackground = o1.d(4278660411L);
        borderEmerytMswia = companion.g();
    }

    private d() {
    }

    @Override // gh1.a
    public long A() {
        return borderMdowod;
    }

    @Override // gh1.a
    public long B() {
        return borderBieglyRewident;
    }

    @Override // gh1.a
    public long C() {
        return borderNauczyciela;
    }

    @Override // gh1.a
    public long D() {
        return borderPrawoJazdy;
    }

    @Override // gh1.a
    public long E() {
        return airQualityGood80;
    }

    @Override // gh1.a
    public long F() {
        return borderLekarz;
    }

    @Override // gh1.a
    public long G() {
        return borderDentysta;
    }

    @Override // gh1.a
    public long H() {
        return borderDoktoranta;
    }

    @Override // gh1.a
    public long a() {
        return studentBackground;
    }

    @Override // gh1.a
    public long b() {
        return borderDoradcaPodatkowy;
    }

    @Override // gh1.a
    public long c() {
        return borderElectronicDiploma;
    }

    @Override // gh1.a
    public long d() {
        return borderEmerytMswia;
    }

    @Override // gh1.a
    public long e() {
        return airQualityBad300;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof d);
    }

    @Override // gh1.a
    public long f() {
        return borderPolozna;
    }

    @Override // gh1.a
    public long g() {
        return borderPoselska;
    }

    @Override // gh1.a
    public long h() {
        return borderNiepelnosprawny;
    }

    public int hashCode() {
        return -491292064;
    }

    @Override // gh1.a
    public long i() {
        return borderSenatorska;
    }

    @Override // gh1.a
    public long j() {
        return airQualityWorst200;
    }

    @Override // gh1.a
    public long k() {
        return borderDiia;
    }

    @Override // gh1.a
    public long l() {
        return borderKdr;
    }

    @Override // gh1.a
    public long m() {
        return borderFarmaceuta;
    }

    @Override // gh1.a
    public long n() {
        return borderMpojazd;
    }

    @Override // gh1.a
    public long o() {
        return borderGeneryczny;
    }

    @Override // gh1.a
    public long p() {
        return airQualityBest80;
    }

    @Override // gh1.a
    public long q() {
        return borderFizjoterapeuta;
    }

    @Override // gh1.a
    public long r() {
        return borderRadcaPrawnegy;
    }

    @Override // gh1.a
    public long s() {
        return borderStudencka;
    }

    @Override // gh1.a
    public long t() {
        return borderAdwokacka;
    }

    public String toString() {
        return "DashboardDarkSchemePreset";
    }

    @Override // gh1.a
    public long u() {
        return airQualityBad100;
    }

    @Override // gh1.a
    public long v() {
        return borderPielegniarka;
    }

    @Override // gh1.a
    public long w() {
        return borderKomornik;
    }

    @Override // gh1.a
    public long x() {
        return borderDiagnosty;
    }

    @Override // gh1.a
    public long y() {
        return borderEmeryt;
    }

    @Override // gh1.a
    public long z() {
        return borderUut;
    }
}

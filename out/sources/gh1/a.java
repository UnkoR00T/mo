package gh1;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\bF\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0004R\u0014\u0010+\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0004R\u0014\u0010-\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0004R\u0014\u0010/\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0004R\u0014\u00101\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0004R\u0014\u00103\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0004R\u0014\u00105\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0004R\u0014\u00107\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0004R\u0014\u00109\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0004R\u0014\u0010;\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0004R\u0014\u0010=\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0004R\u0014\u0010?\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0004R\u0014\u0010A\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0004R\u0014\u0010C\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0004R\u0014\u0010E\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0004R\u0014\u0010G\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0004¨\u0006HÀ\u0006\u0003"}, d2 = {"Lgh1/a;", "", "Landroidx/compose/ui/graphics/Color;", "A", "()J", "borderMdowod", "y", "borderEmeryt", ip.a.f96138c, "borderPrawoJazdy", "n", "borderMpojazd", "l", "borderKdr", "s", "borderStudencka", "t", "borderAdwokacka", "g", "borderPoselska", "z", "borderUut", "k", "borderDiia", "v", "borderPielegniarka", "f", "borderPolozna", "F", "borderLekarz", "G", "borderDentysta", "r", "borderRadcaPrawnegy", "h", "borderNiepelnosprawny", "i", "borderSenatorska", "C", "borderNauczyciela", "o", "borderGeneryczny", "w", "borderKomornik", "b", "borderDoradcaPodatkowy", "B", "borderBieglyRewident", i.f37087n, "borderDoktoranta", "q", "borderFizjoterapeuta", "m", "borderFarmaceuta", "p", "airQualityBest80", "E", "airQualityGood80", "u", "airQualityBad100", "e", "airQualityBad300", "j", "airQualityWorst200", "c", "borderElectronicDiploma", "x", "borderDiagnosty", "a", "studentBackground", "d", "borderEmerytMswia", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    long A();

    long B();

    long C();

    long D();

    long E();

    long F();

    long G();

    long H();

    long a();

    long b();

    long c();

    long d();

    long e();

    long f();

    long g();

    long h();

    long i();

    long j();

    long k();

    long l();

    long m();

    long n();

    long o();

    long p();

    long q();

    long r();

    long s();

    long t();

    long u();

    long v();

    long w();

    long x();

    long y();

    long z();
}

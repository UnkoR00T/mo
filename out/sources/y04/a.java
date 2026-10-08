package y04;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b \bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010!\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u0014\u0010#\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0016R\u0014\u0010%\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0016R\u0014\u0010'\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0016R\u0014\u0010)\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0014\u0010+\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0014\u0010-\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0016R\u0014\u0010/\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0016R\u0014\u00101\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0016R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00104R\u0014\u00109\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00104R\u0014\u0010;\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0016R\u0014\u0010=\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0016R\u0014\u0010?\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0016R\u0014\u0010A\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0016R\u0014\u0010C\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0016R\u0014\u0010E\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0016R\u0014\u0010G\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0016R\u0014\u0010I\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0016R\u0014\u0010K\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0016R\u0014\u0010M\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0016R\u0014\u0010O\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0016R\u0014\u0010Q\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0016¨\u0006RÀ\u0006\u0003"}, d2 = {"Ly04/a;", "", "", "A", "()Z", "debug", "q", "httpLoggingEnabled", "G", "remoteHttpLoggingEnabled", "l", "prodFeatureFlags", "I", "isAutomaticTest", "o", "isSecurityAudit", "s", "isInstitution", ip.a.f96138c, "googlePayTestEnv", "", "E", "()Ljava/lang/String;", "serverScheme", "u", "serverHost", "b", "wkDomain", "f", "certPin", "m", "certPinAlt", "F", "certPinExpired", "K", "coalProposalScheme", "t", "coalProposalHost", "j", "coalProposalContext", "r", "trustedDomains", "J", "trustedDomainPrefix", "z", "ctWhitelistDomains", "i", "pinningWhitelistDomains", "g", "verificationUrl", "", "d", "()I", "defaultImageQuality", "a", "thumbnailMaxSide", "c", "defaultImageMaxSide", "C", "prescriptionScheme", "y", "prescriptionHost", "B", "prescriptionContext", "k", "ipolakScheme", "e", "ipolakHost", "w", "ipolakContext", "n", "cityCardScheme", "x", "cityCardHost", "p", "cityCardContext", "v", "pkpScheme", "h", "pkpHost", i.f37087n, "pkpContext", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    boolean A();

    String B();

    String C();

    boolean D();

    String E();

    String F();

    boolean G();

    String H();

    boolean I();

    String J();

    String K();

    int a();

    String b();

    int c();

    int d();

    String e();

    String f();

    String g();

    String h();

    String i();

    String j();

    String k();

    boolean l();

    String m();

    String n();

    boolean o();

    String p();

    boolean q();

    String r();

    boolean s();

    String t();

    String u();

    String v();

    String w();

    String x();

    String y();

    String z();
}

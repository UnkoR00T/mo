package ix1;

import android.content.res.AssetManager;
import dx.i;
import fr.t;
import gp.f;
import hp.g;
import hp.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lp.a0;
import lp.r;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import tp.m;
import tp.o;
import tp.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010!\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J5\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160(2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020$H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J%\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00107¨\u00068"}, d2 = {"Lix1/b;", "", "Liy/a;", "base64Coder", "Landroid/content/res/AssetManager;", "assetManager", "<init>", "(Liy/a;Landroid/content/res/AssetManager;)V", "Lgp/c;", "doc", "Ltp/m;", "d", "(Lgp/c;)Ltp/m;", "Lhp/g;", "appearanceSpace", "", "pageRotation", "Ltp/q;", "a", "(Lhp/g;Lgp/c;I)Ltp/q;", "Ljava/time/Instant;", "signingTime", "", "citizenName", "Lgp/f;", "output", "Loq/i0;", "f", "(Ljava/time/Instant;Ljava/lang/String;Lgp/c;Lgp/f;)V", "Llp/r;", "fontRegular", "fontMedium", "date", "g", "(Lgp/f;Llp/r;Llp/r;Ljava/lang/String;Ljava/lang/String;)V", "textToSplit", "", "fontSize", "font", "width", "", "h", "(Ljava/lang/String;FLlp/r;F)Ljava/util/List;", "cs", "e", "(Lgp/c;Lgp/f;)V", "Lgp/e;", "page", "b", "(Lgp/e;)Lhp/g;", "sourceDocument", "Ljava/io/InputStream;", "c", "(Lgp/c;Ljava/time/Instant;Ljava/lang/String;)Ljava/io/InputStream;", "Liy/a;", "Landroid/content/res/AssetManager;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f97601d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final DateTimeFormatter f97602e = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AssetManager assetManager;

    public b(iy.a aVar, AssetManager assetManager) {
        this.base64Coder = aVar;
        this.assetManager = assetManager;
    }

    private final q a(g appearanceSpace, gp.c doc, int pageRotation) {
        wo.a aVar;
        wo.a aVar2;
        pp.a aVar3 = new pp.a(new h(doc));
        aVar3.k(new gp.h());
        boolean z15 = true;
        aVar3.i(1);
        if (pageRotation != 90 && pageRotation != 270) {
            z15 = false;
        }
        float fC = z15 ? appearanceSpace.c() : appearanceSpace.h();
        float fH = z15 ? appearanceSpace.h() : appearanceSpace.c();
        aVar3.h(new g(fC, fH));
        if (pageRotation != 90) {
            if (pageRotation == 180) {
                aVar2 = new wo.a(-1.0f, 0.0f, 0.0f, -1.0f, fC, fH);
            } else if (pageRotation != 270) {
                aVar = new wo.a();
            } else {
                aVar2 = new wo.a(0.0f, -1.0f, 1.0f, 0.0f, 0.0f, fC);
            }
            aVar = aVar2;
        } else {
            aVar = new wo.a(0.0f, 1.0f, -1.0f, 0.0f, fH, 0.0f);
        }
        aVar3.j(aVar);
        return new q(aVar3.D1());
    }

    private final m d(gp.c doc) {
        vp.d dVar = new vp.d(doc);
        doc.I().e(dVar);
        vp.q qVar = new vp.q(dVar);
        m mVar = qVar.k().get(0);
        dVar.j(true);
        dVar.i(true);
        dVar.D1().A2(true);
        dVar.f().add(qVar);
        return mVar;
    }

    private final void e(gp.c doc, f cs4) {
        Object objB;
        cs4.K();
        i iVarC = iy.a.c(this.base64Coder, "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", null, 2, null);
        if (iVarC instanceof i.Left) {
            objB = new byte[0];
        } else {
            if (!(iVarC instanceof i.Right)) {
                throw new p();
            }
            objB = ((i.Right) iVarC).b();
        }
        cs4.r(qp.d.e(doc, (byte[]) objB, "signature.png"), 0.0f, 56.0f, 44.0f, 44.0f);
        cs4.J();
    }

    private final void f(Instant signingTime, String citizenName, gp.c doc, f output) {
        a0 a0VarE = a0.E(doc, this.assetManager.open("roboto_medium.ttf"));
        a0 a0VarE2 = a0.E(doc, this.assetManager.open("roboto_regular.ttf"));
        e(doc, output);
        g(output, a0VarE2, a0VarE, citizenName, signingTime.atZone(ZoneId.systemDefault()).format(f97602e));
    }

    private final void g(f output, r fontRegular, r fontMedium, String citizenName, String date) {
        List<String> listH = h(citizenName, 12.0f, fontMedium, 156.0f);
        output.K();
        output.h();
        output.I(48.0f, 88.0f);
        output.M(13.0f);
        output.V(0.0627451f, 0.07450981f, 0.09019608f);
        output.L(fontMedium, 12.0f);
        Iterator<String> it = listH.iterator();
        while (it.hasNext()) {
            output.d0(it.next());
            output.H();
        }
        output.I(0.0f, -2.0f);
        output.M(9.0f);
        output.V(0.32156864f, 0.34117648f, 0.37254903f);
        output.L(fontRegular, 8.0f);
        output.d0(date);
        output.H();
        output.d0("Podpis osobisty w aplikacji mObywatel");
        output.H();
        output.u();
        output.J();
    }

    private final List<String> h(String textToSplit, float fontSize, r font, float width) {
        ArrayList arrayList = new ArrayList();
        String string = textToSplit;
        while (true) {
            int i15 = -1;
            while (string.length() > 0) {
                int iQ0 = fu.r.q0(string, ' ', i15 + 1, false, 4, null);
                if (iQ0 < 0) {
                    iQ0 = string.length();
                }
                if ((font.m(string.substring(0, iQ0)) * fontSize) / 1000 > width) {
                    if (i15 < 0) {
                        i15 = iQ0;
                    }
                    arrayList.add(string.substring(0, i15));
                    String strSubstring = string.substring(i15);
                    int length = strSubstring.length() - 1;
                    int i16 = 0;
                    boolean z15 = false;
                    while (i16 <= length) {
                        boolean z16 = t.d(strSubstring.charAt(!z15 ? i16 : length), 32) <= 0;
                        if (z15) {
                            if (!z16) {
                                break;
                            }
                            length--;
                        } else if (z16) {
                            i16++;
                        } else {
                            z15 = true;
                        }
                    }
                    string = strSubstring.subSequence(i16, length + 1).toString();
                } else if (iQ0 == string.length()) {
                    arrayList.add(string);
                    string = "";
                } else {
                    i15 = iQ0;
                }
            }
            return arrayList;
        }
    }

    public final g b(gp.e page) {
        int i15 = page.i();
        float fH = page.e().h();
        float fC = page.e().c();
        if (i15 == 90) {
            return new g(24.0f, fC - 220.0f, 100.0f, 204.0f);
        }
        if (i15 != 180) {
            return i15 != 270 ? new g(fH - 220.0f, fC - 124.0f, 204.0f, 100.0f) : new g(fH - 124.0f, 16.0f, 100.0f, 204.0f);
        }
        return new g(16.0f, 24.0f, 204.0f, 100.0f);
    }

    public final InputStream c(gp.c sourceDocument, Instant signingTime, String citizenName) {
        gp.e eVarM = sourceDocument.M(0);
        int i15 = eVarM.i();
        g gVarB = b(eVarM);
        gp.c cVar = new gp.c();
        try {
            cVar.b(new gp.e(eVarM.h()));
            m mVarD = d(cVar);
            mVarD.n(gVarB);
            q qVarA = a(gVarB, cVar, i15);
            o oVar = new o();
            oVar.D1().A2(true);
            oVar.c(qVarA);
            mVarD.i(oVar);
            f fVar = new f(cVar, qVarA);
            try {
                f(signingTime, citizenName, cVar, fVar);
                i0 i0Var = i0.f148189a;
                ar.b.a(fVar, null);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                cVar.T0(byteArrayOutputStream);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                ar.b.a(cVar, null);
                return byteArrayInputStream;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(fVar, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                ar.b.a(cVar, th6);
                throw th7;
            }
        }
    }
}

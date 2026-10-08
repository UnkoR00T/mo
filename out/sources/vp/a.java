package vp;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import io.sentry.android.core.c2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import lp.e0;
import lp.f0;
import lp.g0;
import lp.y;

/* JADX INFO: loaded from: classes4.dex */
class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ap.a f207788d = ap.a.d("BMC");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ap.a f207789e = ap.a.d("EMC");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float[] f207790f = {0.6f, 0.75686276f, 0.84313726f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f207791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f207792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f207793c;

    a(t tVar) throws IOException {
        this.f207791a = tVar;
        x();
        try {
            this.f207792b = tVar.m();
        } catch (IOException e15) {
            throw new IOException("Could not process default appearance string '" + tVar.l() + "' for field '" + tVar.e() + "'", e15);
        }
    }

    private hp.g a(hp.g gVar, float f15) {
        float fD = gVar.d() + f15;
        float fE = gVar.e() + f15;
        float f16 = f15 * 2.0f;
        return new hp.g(fD, fE, gVar.h() - f16, gVar.c() - f16);
    }

    private float b(lp.r rVar, hp.g gVar) {
        float fE = this.f207792b.e();
        if (fE != 0.0f) {
            return fE;
        }
        if (!l()) {
            float fJ = rVar.b().j() * 1000.0f;
            float fH = (gVar.h() / (rVar.m(this.f207793c) * rVar.b().i())) * rVar.b().i() * 1000.0f;
            float fC = (rVar.j().c() + (-rVar.j().d())) * rVar.b().j();
            if (fC <= 0.0f) {
                fC = rVar.c().a() * rVar.b().j();
            }
            return Math.min((gVar.c() / fC) * fJ, fH);
        }
        u uVar = new u(this.f207793c);
        if (uVar.a() == null) {
            return 12.0f;
        }
        float fH2 = gVar.h() - gVar.d();
        float f15 = 4.0f;
        while (f15 <= 12.0f) {
            Iterator<u.b> it = uVar.a().iterator();
            int size = 0;
            while (it.hasNext()) {
                size += it.next().a(rVar, f15, fH2).size();
            }
            if (rVar.c().a() * (f15 / 1000.0f) * size > gVar.c()) {
                return Math.max(f15 - 1.0f, 4.0f);
            }
            f15 += 1.0f;
        }
        return Math.min(f15, 12.0f);
    }

    private wo.a c(hp.g gVar, int i15) {
        float f15;
        if (i15 == 0) {
            return new wo.a();
        }
        float fG = 0.0f;
        if (i15 == 90) {
            fG = gVar.g();
            f15 = 0.0f;
        } else if (i15 != 180) {
            f15 = i15 != 270 ? 0.0f : gVar.f();
        } else {
            fG = gVar.g();
            f15 = gVar.f();
        }
        return xp.d.g(Math.toRadians(i15), fG, f15).c();
    }

    private String d(String str) {
        sp.q qVarC = this.f207791a.c();
        if (qVarC != null && qVarC.b() != null) {
            this.f207791a.b().h();
        }
        return str;
    }

    private int e(tp.m mVar) {
        return mVar.D1().y4(bp.i.f20780j7, this.f207791a.n());
    }

    private i f(tp.m mVar) {
        return new i((bp.p) mVar.D1().p4(bp.i.X1), this.f207791a.b().b());
    }

    private void g(tp.m mVar, tp.n nVar, tp.q qVar) throws IOException {
        float fB;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        gp.f fVar = new gp.f(this.f207791a.b().c(), qVar, byteArrayOutputStream);
        if (nVar != null) {
            op.a aVarA = nVar.a();
            if (aVarA != null) {
                fVar.Z(aVarA);
                hp.g gVarO = o(mVar, qVar);
                fVar.b(gVarO.d(), gVarO.e(), gVarO.h(), gVarO.c());
                fVar.y();
            }
            op.a aVarB = nVar.b();
            if (aVarB != null) {
                fVar.b0(aVarB);
                fB = 1.0f;
            } else {
                fB = 0.0f;
            }
            tp.r rVarP = mVar.p();
            if (rVarP != null && rVarP.b() > 0.0f) {
                fB = rVarP.b();
            }
            if (fB > 0.0f && aVarB != null) {
                if (fB != 1.0f) {
                    fVar.N(fB);
                }
                hp.g gVarA = a(o(mVar, qVar), Math.max(0.5f, fB / 2.0f));
                fVar.b(gVarA.d(), gVarA.e(), gVarA.h(), gVarA.c());
                fVar.p();
            }
        }
        fVar.close();
        byteArrayOutputStream.close();
        y(byteArrayOutputStream.toByteArray(), qVar);
    }

    private void h(tp.m mVar, tp.q qVar, OutputStream outputStream) throws IOException {
        float fQ;
        float fC;
        float fMin;
        gp.f fVar = new gp.f(this.f207791a.b().c(), qVar, outputStream);
        hp.g gVarO = o(mVar, qVar);
        float fB = mVar.p() != null ? mVar.p().b() : 0.0f;
        hp.g gVarA = a(gVarO, Math.max(1.0f, fB));
        hp.g gVarA2 = a(gVarA, Math.max(1.0f, fB));
        fVar.K();
        fVar.b(gVarA.d(), gVarA.e(), gVarA.h(), gVarA.c());
        fVar.m();
        lp.r rVarB = this.f207792b.b();
        if (rVarB == null) {
            throw new IllegalArgumentException("font is null, check whether /DA entry is incomplete or incorrect");
        }
        if (rVarB.getName().contains("+")) {
            c2.g("PdfBox-Android", "Font '" + this.f207792b.d().A3() + "' of field '" + this.f207791a.e() + "' contains subsetted font '" + rVarB.getName() + "'");
            c2.g("PdfBox-Android", "This may bring trouble with PDField.setValue(), PDAcroForm.flatten() or PDAcroForm.refreshAppearances()");
            c2.g("PdfBox-Android", "You should replace this font with a non-subsetted font:");
            c2.g("PdfBox-Android", "PDFont font = PDType0Font.load(doc, new FileInputStream(fontfile), false);");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("acroForm.getDefaultResources().put(COSName.getPDFName(\"");
            sb5.append(this.f207792b.d().A3());
            sb5.append("\", font);");
            c2.g("PdfBox-Android", sb5.toString());
        }
        float fE = this.f207792b.e();
        if (fE == 0.0f) {
            fE = b(rVarB, gVarA2);
        }
        float f15 = fE;
        if (this.f207791a instanceof m) {
            k(fVar, qVar, rVarB, f15);
        }
        fVar.h();
        this.f207792b.n(fVar, f15);
        float f16 = f15 / 1000.0f;
        float fA = rVarB.c().a() * f16;
        if (rVarB.j() != null) {
            fC = rVarB.j().c() * f16;
            fQ = rVarB.j().d();
        } else {
            float fP = p(rVarB);
            fQ = q(rVarB);
            fC = fP * f16;
        }
        float f17 = fQ * f16;
        t tVar = this.f207791a;
        if ((tVar instanceof s) && ((s) tVar).t()) {
            fMin = gVarA2.g() - fA;
        } else if (fC > gVarA.c()) {
            fMin = gVarA.e() + (-f17);
        } else {
            float fE2 = gVarA.e() + ((gVarA.c() - fC) / 2.0f);
            float f18 = -f17;
            fMin = fE2 - gVarA.e() < f18 ? Math.min(f18 + gVarA2.e(), Math.max(fE2, (gVarA2.c() - gVarA2.e()) - fC)) : fE2;
        }
        float fD = gVarA2.d();
        if (v()) {
            i(fVar, qVar, rVarB, f15);
        } else if (this.f207791a instanceof m) {
            j(fVar, qVar, gVarA2, rVarB, f15);
        } else {
            u uVar = new u(this.f207793c);
            b bVar = new b();
            bVar.d(rVarB);
            bVar.e(f15);
            bVar.f(rVarB.c().a() * f16);
            new v.b(fVar).k(bVar).l(uVar).n(gVarA2.h()).o(l()).j(fD, fMin).m(e(mVar)).i().a();
        }
        fVar.u();
        fVar.J();
        fVar.close();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005e A[LOOP:0: B:10:0x005c->B:11:0x005e, LOOP_END] */
    private void i(gp.f fVar, tp.q qVar, lp.r rVar, float f15) {
        int i15;
        int i16;
        float f16;
        int iP = ((s) this.f207791a).p();
        int iN = this.f207791a.n();
        int iMin = Math.min(this.f207793c.length(), iP);
        hp.g gVarA = a(qVar.e(), 1.0f);
        float fH = qVar.e().h() / iP;
        float fE = gVarA.e() + ((qVar.e().c() - ((rVar.j().a() / 1000.0f) * f15)) / 2.0f);
        float f17 = fH / 2.0f;
        if (iN != 2) {
            if (iN == 1) {
                i15 = (iP - iMin) / 2;
            }
            i16 = 0;
            f16 = 0.0f;
            while (i16 < iMin) {
                int i17 = i16 + 1;
                String strSubstring = this.f207793c.substring(i16, i17);
                float fM = ((rVar.m(strSubstring) / 1000.0f) * f15) / 2.0f;
                fVar.I((f17 + (f16 / 2.0f)) - (fM / 2.0f), fE);
                fVar.d0(strSubstring);
                fE = 0.0f;
                f17 = fH;
                f16 = fM;
                i16 = i17;
            }
        }
        i15 = iP - iMin;
        f17 += i15 * fH;
        i16 = 0;
        f16 = 0.0f;
        while (i16 < iMin) {
            int i18 = i16 + 1;
            String strSubstring2 = this.f207793c.substring(i16, i18);
            float fM2 = ((rVar.m(strSubstring2) / 1000.0f) * f15) / 2.0f;
            fVar.I((f17 + (f16 / 2.0f)) - (fM2 / 2.0f), fE);
            fVar.d0(strSubstring2);
            fE = 0.0f;
            f17 = fH;
            f16 = fM2;
            i16 = i18;
        }
    }

    private void j(gp.f fVar, tp.q qVar, hp.g gVar, lp.r rVar, float f15) throws IOException {
        fVar.O(0.0f);
        int iN = this.f207791a.n();
        if (iN == 1 || iN == 2) {
            float fH = (qVar.e().h() - ((rVar.m(this.f207793c) / 1000.0f) * f15)) - 4.0f;
            if (iN == 1) {
                fH /= 2.0f;
            }
            fVar.I(fH, 0.0f);
        } else if (iN != 0) {
            throw new IOException("Error: Unknown justification value:" + iN);
        }
        List<String> listQ = ((m) this.f207791a).q();
        int size = listQ.size();
        float fG = gVar.g();
        int iV = ((m) this.f207791a).v();
        float fA = rVar.j().a();
        float fA2 = rVar.c().a();
        for (int i15 = iV; i15 < size; i15++) {
            if (i15 == iV) {
                fG -= (fA / 1000.0f) * f15;
            } else {
                fG -= (fA2 / 1000.0f) * f15;
                fVar.h();
            }
            fVar.I(gVar.d(), fG);
            fVar.d0(listQ.get(i15));
            if (i15 != size - 1) {
                fVar.u();
            }
        }
    }

    private void k(gp.f fVar, tp.q qVar, lp.r rVar, float f15) throws IOException {
        m mVar = (m) this.f207791a;
        List<Integer> listS = mVar.s();
        List<String> listT = mVar.t();
        List<String> listR = mVar.r();
        if (!listT.isEmpty() && !listR.isEmpty() && listS.isEmpty()) {
            listS = new ArrayList<>(listT.size());
            Iterator<String> it = listT.iterator();
            while (it.hasNext()) {
                listS.add(Integer.valueOf(listR.indexOf(it.next())));
            }
        }
        int iV = mVar.v();
        float fA = (rVar.c().a() * f15) / 1000.0f;
        hp.g gVarA = a(qVar.e(), 1.0f);
        Iterator<Integer> it4 = listS.iterator();
        while (it4.hasNext()) {
            int iIntValue = it4.next().intValue();
            float[] fArr = f207790f;
            fVar.V(fArr[0], fArr[1], fArr[2]);
            fVar.b(gVarA.d(), (gVarA.g() - (((iIntValue - iV) + 1) * fA)) + 2.0f, gVarA.h(), fA);
            fVar.y();
        }
        fVar.O(0.0f);
    }

    private boolean l() {
        t tVar = this.f207791a;
        return (tVar instanceof s) && ((s) tVar).t();
    }

    private static boolean m(tp.p pVar) {
        hp.g gVarE;
        return pVar != null && pVar.c() && (gVarE = pVar.a().e()) != null && Math.abs(gVarE.h()) > 0.0f && Math.abs(gVarE.c()) > 0.0f;
    }

    private tp.q n(tp.m mVar) {
        tp.q qVar = new tp.q(this.f207791a.b().c());
        int iS = s(mVar);
        hp.g gVarF = mVar.f();
        PointF pointFL = xp.d.g(Math.toRadians(iS), 0.0f, 0.0f).l(gVarF.h(), gVarF.c());
        hp.g gVar = new hp.g(Math.abs(pointFL.x), Math.abs(pointFL.y));
        qVar.h(gVar);
        wo.a aVarC = c(gVar, iS);
        if (!aVarC.t()) {
            qVar.j(aVarC);
        }
        qVar.i(1);
        qVar.k(new gp.h());
        return qVar;
    }

    private hp.g o(tp.m mVar, tp.q qVar) {
        hp.g gVarE = qVar.e();
        return gVarE == null ? mVar.f().a() : gVarE;
    }

    private float p(lp.r rVar) {
        return r(rVar, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n.codePointAt(0));
    }

    private float q(lp.r rVar) {
        return r(rVar, "y".codePointAt(0)) - r(rVar, "a".codePointAt(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private float r(lp.r rVar, int i15) throws IOException {
        Path pathB = null;
        if (rVar instanceof f0) {
            f0 f0Var = (f0) rVar;
            e0 e0VarJ = f0Var.J(i15);
            if (e0VarJ != null) {
                uo.a aVarC = f0Var.c();
                hp.g gVarD = e0VarJ.d();
                if (gVarD != null) {
                    gVarD.i(Math.max(aVarC.b(), gVarD.d()));
                    gVarD.j(Math.max(aVarC.c(), gVarD.e()));
                    gVarD.k(Math.min(aVarC.d(), gVarD.f()));
                    gVarD.l(Math.min(aVarC.e(), gVarD.g()));
                    pathB = gVarD.m();
                }
            }
        } else if (rVar instanceof g0) {
            pathB = ((g0) rVar).a(i15);
        } else if (rVar instanceof y) {
            y yVar = (y) rVar;
            pathB = yVar.B(yVar.z().f(i15));
        } else {
            c2.g("PdfBox-Android", "Unknown font class: " + rVar.getClass());
        }
        if (pathB == null) {
            return -1.0f;
        }
        RectF rectF = new RectF();
        pathB.computeBounds(rectF, true);
        return rectF.height();
    }

    private int s(tp.m mVar) {
        tp.n nVarO = mVar.o();
        if (nVarO != null) {
            return nVarO.e();
        }
        return 0;
    }

    private void t(tp.m mVar, tp.q qVar) throws IOException {
        this.f207792b.a(qVar);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        fp.d dVar = new fp.d(byteArrayOutputStream);
        List<Object> listW = w(qVar);
        ap.a aVar = f207788d;
        int iIndexOf = listW.indexOf(aVar);
        if (iIndexOf == -1) {
            dVar.b(listW);
            dVar.c(bp.i.f20722d9, aVar);
        } else {
            dVar.b(listW.subList(0, iIndexOf + 1));
        }
        h(mVar, qVar, byteArrayOutputStream);
        ap.a aVar2 = f207789e;
        int iIndexOf2 = listW.indexOf(aVar2);
        if (iIndexOf2 == -1) {
            dVar.c(aVar2);
        } else {
            dVar.b(listW.subList(iIndexOf2, listW.size()));
        }
        byteArrayOutputStream.close();
        y(byteArrayOutputStream.toByteArray(), qVar);
    }

    private boolean v() {
        t tVar = this.f207791a;
        return (!(tVar instanceof s) || !((s) tVar).r() || ((s) this.f207791a).t() || ((s) this.f207791a).u() || ((s) this.f207791a).s()) ? false : true;
    }

    private List<Object> w(tp.q qVar) throws IOException {
        ep.g gVar = new ep.g(qVar);
        gVar.P();
        return gVar.L();
    }

    private void x() {
        gp.h hVarG;
        if (this.f207791a.b().b() == null) {
            return;
        }
        gp.h hVarB = this.f207791a.b().b();
        Iterator<tp.m> it = this.f207791a.k().iterator();
        while (it.hasNext()) {
            tp.q qVarE = it.next().e();
            if (qVarE != null && (hVarG = qVarE.g()) != null) {
                bp.d dVarD1 = hVarG.D1();
                bp.i iVar = bp.i.H3;
                bp.d dVarK4 = dVarD1.k4(iVar);
                bp.d dVarK5 = hVarB.D1().k4(iVar);
                for (bp.i iVar2 : hVarG.k()) {
                    try {
                        if (hVarB.j(iVar2) == null) {
                            Objects.toString(iVar2);
                            dVarK5.Y4(iVar2, dVarK4.C4(iVar2));
                        }
                    } catch (IOException unused) {
                        c2.g("PdfBox-Android", "Unable to match field level font with AcroForm font");
                    }
                }
            }
        }
    }

    private void y(byte[] bArr, tp.q qVar) throws IOException {
        OutputStream outputStreamN5 = qVar.D1().n5();
        outputStreamN5.write(bArr);
        outputStreamN5.close();
    }

    public void u(String str) {
        tp.q qVarA;
        this.f207793c = d(str);
        t tVar = this.f207791a;
        if ((tVar instanceof s) && !((s) tVar).t()) {
            this.f207793c = this.f207793c.replaceAll("\\u000D\\u000A|[\\u000A\\u000B\\u000C\\u000D\\u0085\\u2028\\u2029]", " ");
        }
        for (tp.m mVar : this.f207791a.k()) {
            if (mVar.D1().N3("PMD")) {
                c2.g("PdfBox-Android", "widget of field " + this.f207791a.e() + " is a PaperMetaData widget, no appearance stream created");
            } else {
                i iVar = this.f207792b;
                if (mVar.D1().p4(bp.i.X1) != null) {
                    this.f207792b = f(mVar);
                }
                if (mVar.f() == null) {
                    mVar.D1().P4(bp.i.H);
                    c2.g("PdfBox-Android", "widget of field " + this.f207791a.e() + " has no rectangle, no appearance stream created");
                } else {
                    tp.o oVarB = mVar.b();
                    if (oVarB == null) {
                        oVarB = new tp.o();
                        mVar.i(oVarB);
                    }
                    tp.p pVarB = oVarB.b();
                    if (m(pVarB)) {
                        qVarA = pVarB.a();
                    } else {
                        tp.q qVarN = n(mVar);
                        oVarB.c(qVarN);
                        qVarA = qVarN;
                    }
                    tp.n nVarO = mVar.o();
                    if (nVarO != null || qVarA.f().e() == 0) {
                        g(mVar, nVarO, qVarA);
                    }
                    t(mVar, qVarA);
                    this.f207792b = iVar;
                }
            }
        }
    }
}

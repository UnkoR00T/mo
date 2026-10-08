package f40;

import androidx.compose.foundation.layout.d;
import d1.i;
import d1.m3;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import f3.j;
import f3.m;
import h30.q;
import j70.h;
import mx.Label;
import n50.e;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf40/b;", "Ln50/e;", "Lf40/c;", "data", "<init>", "(Lf40/c;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Lf40/c;", "getData", "()Lf40/c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LabelButtonImageSingleCardData data;

    public b(LabelButtonImageSingleCardData labelButtonImageSingleCardData) {
        this.data = labelButtonImageSingleCardData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // n50.e
    public void a(r rVar, final int i15) {
        int i16;
        r rVar2;
        m.Companion companion;
        ?? r15;
        final b bVar = this;
        r rVarH = rVar.h(-1245452986);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(bVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1245452986, i16, -1, "pl.gov.coi.common.ui.ds.custom.singlecard.labelbuttonimage.LabelButtonImageSingleCard.Content (LabelButtonImageSingleCard.kt:34)");
            }
            i iVar = i.f39152a;
            i.f fVarH = iVar.h();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion2.i();
            m.Companion companion3 = m.INSTANCE;
            m mVarH = d.h(companion3, 0.0f, 1, null);
            w0 w0VarB = m3.b(fVarH, interfaceC1317cI, rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarH);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            q3 q3Var = q3.f39261a;
            w0 w0VarA = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, companion3);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label label = bVar.data.getLabel();
            if (label == null) {
                rVarH.X(1275131265);
                rVarH.R();
                companion = companion3;
                r15 = 0;
            } else {
                rVarH.X(1275131266);
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                companion = companion3;
                h.g(null, null, label, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                r15 = 0;
                r3.a(d.i(companion, aVar.b(rVarH, i17).getSpacing50()), rVarH, 0);
                i0 i0Var2 = i0.f148189a;
                rVarH.R();
            }
            m mVarT = d.t(companion, c5.h.n(100));
            w0 w0VarI = d1.r.i(companion2.o(), r15);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, r15));
            e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarT);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            x xVar = x.f39368a;
            bVar = this;
            m20.c.c(bVar.data.getQrCodeImage().getBitmap(), rVarH, r15);
            rVarH.x();
            rVarH.x();
            q.p(bVar.data.getButtonData(), false, null, rVarH, 0, 6);
            rVar2 = rVarH;
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f40.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.d(this.f59064a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ er.q<e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }
}

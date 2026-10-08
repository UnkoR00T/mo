package cb3;

import android.text.Spanned;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001aU\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcb3/f;", "viewModel", "Loq/i0;", "k", "(Lcb3/f;Lm2/r;I)V", "Lcb3/f$a;", "data", "h", "(Lcb3/f$a;Lm2/r;I)V", "Lf3/m;", "modifier", "Lmx/a;", "title", "Landroid/text/Spanned;", "summary", "content", "", "Lcb3/f$a$a;", "sections", "Lkotlin/Function1;", "", "onUrlClick", "f", "(Lf3/m;Lmx/a;Landroid/text/Spanned;Landroid/text/Spanned;Ljava/util/List;Ler/l;Lm2/r;II)V", "Lq4/e;", "description", "n", "(Lmx/a;Lq4/e;Lm2/r;I)V", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    private static final void f(f3.m mVar, final Label label, final Spanned spanned, final Spanned spanned2, final List<f.Data.Section> list, final er.l<? super String, i0> lVar, p076m2.r rVar, final int i15, final int i16) {
        f3.m mVar2;
        int i17;
        Label label2;
        p076m2.r rVar2;
        final f3.m mVar3;
        int i18;
        p076m2.r rVarH = rVar.h(-1471393721);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            label2 = label;
            i17 |= rVarH.W(label2) ? 32 : 16;
        } else {
            label2 = label;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(spanned) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.G(spanned2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.G(list) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i17 |= rVarH.G(lVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if (rVarH.r((74899 & i17) != 74898, i17 & 1)) {
            f3.m mVar4 = i19 != 0 ? f3.m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-1471393721, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.profile.Content (CountryProfileScreen.kt:65)");
            }
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVar4);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            int i26 = i17;
            f3.m mVar5 = mVar4;
            j70.h.g(null, null, label2, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).k(), null, null, false, false, null, rVarH, (i17 << 3) & 896, 0, 0, 33030139);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
            int i27 = (i26 >> 12) & 112;
            j70.h.g(null, null, null, null, u10.i.n(spanned, lVar, rVarH, ((i26 >> 6) & 14) | i27, 0), aVar.a(rVarH, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030095);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, null, null, u10.i.n(spanned2, lVar, rVarH, ((i26 >> 9) & 14) | i27, 0), aVar.a(rVarH, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030095);
            rVar2 = rVarH;
            if (list == null) {
                rVar2.X(1419607229);
                rVar2.R();
                i18 = 0;
            } else {
                rVar2.X(1419607230);
                for (f.Data.Section section : list) {
                    n(section.getTitle(), u10.i.n(section.getDescription(), null, rVar2, 0, 1), rVar2, 0);
                }
                i18 = 0;
                rVar2.R();
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, i18);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar5;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cb3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.g(mVar3, label, spanned, spanned2, list, lVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f3.m mVar, Label label, Spanned spanned, Spanned spanned2, List list, er.l lVar, int i15, int i16, p076m2.r rVar, int i17) {
        f(mVar, label, spanned, spanned2, list, lVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void h(final f.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-850787334);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-850787334, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.profile.CountryProfileContent (CountryProfileScreen.kt:34)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, f3VarB, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2073854759, true, new er.q() { // from class: cb3.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.i(f3VarB, data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32702);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cb3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.j(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(f3 f3Var, f.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = (rVar.W(d3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-2073854759, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.profile.CountryProfileContent.<anonymous>.<anonymous> (CountryProfileScreen.kt:41)");
            }
            f(t70.s.n(t70.i.S(a3.l(f3.m.INSTANCE, d3Var), f3Var, rVar, 0, 0), rVar, 0), data.getTitle(), data.getSummary(), data.getContent(), data.d(), data.b(), rVar, 0, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f.Data data, int i15, p076m2.r rVar, int i16) {
        h(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(289606219);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(289606219, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.profile.CountryProfileScreen (CountryProfileScreen.kt:26)");
            }
            h(l(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cb3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.Data l(f6<f.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(f fVar, int i15, p076m2.r rVar, int i16) {
        k(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final Label label, q4.e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        final q4.e eVar2 = eVar;
        p076m2.r rVarH = rVar.h(-1749909182);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(eVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1749909182, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.profile.InfoSection (CountryProfileScreen.kt:100)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).m(), null, null, false, false, null, rVar2, (i16 << 6) & 896, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            j70.h.g(null, null, null, null, eVar, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).b(), null, null, false, false, null, rVar2, (i16 << 9) & 57344, 0, 0, 33030095);
            eVar2 = eVar;
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cb3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.o(label, eVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(Label label, q4.e eVar, int i15, p076m2.r rVar, int i16) {
        n(label, eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}

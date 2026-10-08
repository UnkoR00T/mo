package cm2;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import du0.ArticleParagraph;
import em2.ArticleHeaderScreenData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n3.l0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q4.TextStyle;
import w0.i1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0013\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcm2/d;", "viewModel", "Loq/i0;", "p", "(Lcm2/d;Lm2/r;I)V", "Lcm2/d$a;", "screenData", "k", "(Lcm2/d$a;Lm2/r;I)V", "Lcm2/d$a$b;", "m", "(Lcm2/d$a$b;Lm2/r;I)V", "Lem2/a;", "articleData", "i", "(Lem2/a;Lm2/r;I)V", "", "Ldu0/d;", "paragraphs", "g", "(Ljava/util/List;Lm2/r;I)V", "networksecurityissues_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void g(final List<ArticleParagraph> list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        ArrayList arrayList;
        k70.a aVar;
        int i17;
        int i18;
        p076m2.r rVarH = rVar.h(1732578046);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(list) ? 4 : 2);
        } else {
            i16 = i15;
        }
        int i19 = 0;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1732578046, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.details.ArticleContent (NetworkSecurityIssuesKnowledgeBaseDetailsScreen.kt:119)");
            }
            List<ArticleParagraph> list2 = list;
            ArrayList arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ArticleParagraph articleParagraph = (ArticleParagraph) it.next();
                f3.m.Companion companion = f3.m.INSTANCE;
                k70.a aVar2 = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i25).getSpacing300()), rVarH, i19);
                String title = articleParagraph.getTitle();
                if (title == null) {
                    rVarH.X(-277778639);
                    rVarH.R();
                    arrayList = arrayList2;
                    aVar = aVar2;
                    i18 = i19;
                    i17 = i25;
                } else {
                    rVarH.X(-277778638);
                    p076m2.r rVar3 = rVarH;
                    arrayList = arrayList2;
                    aVar = aVar2;
                    i17 = i25;
                    j70.h.g(null, null, mx.b.b(title, "title"), null, null, aVar2.a(rVarH, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i25).j(), null, null, false, false, null, rVar3, 0, 0, 0, 33026011);
                    rVarH = rVar3;
                    i18 = 0;
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
                    rVarH.R();
                }
                p076m2.r rVar4 = rVarH;
                int i26 = i18;
                j70.h.g(null, null, mx.b.b(articleParagraph.getContent(), "content"), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVar4, 0, 0, 0, 33026011);
                ArrayList arrayList3 = arrayList;
                arrayList3.add(i0.f148189a);
                it = it;
                arrayList2 = arrayList3;
                rVarH = rVar4;
                i19 = i26;
            }
            rVar2 = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cm2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.h(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(List list, int i15, p076m2.r rVar, int i16) {
        g(list, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final ArticleHeaderScreenData articleHeaderScreenData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1750645229);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(articleHeaderScreenData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1750645229, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.details.ArticleHeader (NetworkSecurityIssuesKnowledgeBaseDetailsScreen.kt:79)");
            }
            Label title = articleHeaderScreenData.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            long jI = aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            TextStyle textStyleI = aVar.f(rVarH, i17).i();
            b5.j.Companion companion = b5.j.INSTANCE;
            j70.h.g(null, null, title, null, null, jI, 0L, null, null, null, 0L, null, b5.j.h(companion.f()), 0L, 0, false, 0, 0, null, textStyleI, null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.h(), f3.c.INSTANCE.l(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarH);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            rVar2 = rVarH;
            j70.h.g(null, null, articleHeaderScreenData.getCategoryName(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(companion.f()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33026011);
            j70.h.g(null, null, articleHeaderScreenData.getFormattedPublishDate(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(companion.b()), 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33026011);
            rVar2.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            i1.g(l0.c(articleHeaderScreenData.getPicture()), null, k3.f.a(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), aVar.e(rVar2, i17).getRadius150()), null, p036e4.l.INSTANCE.d(), 0.0f, null, 0, rVar2, 24624, 232);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cm2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(articleHeaderScreenData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(ArticleHeaderScreenData articleHeaderScreenData, int i15, p076m2.r rVar, int i16) {
        i(articleHeaderScreenData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final d.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-427221267);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-427221267, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.details.NetworkSecurityIssuesKnowledgeBaseDetailsContent (NetworkSecurityIssuesKnowledgeBaseDetailsScreen.kt:45)");
            }
            if (fr.t.c(aVar, d.a.C0725a.f28233a)) {
                rVarH.X(1757226526);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Initialized)) {
                    rVarH.X(1757225395);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1757228026);
                m((d.a.Initialized) aVar, rVarH, i16 & 14);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cm2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(d.a aVar, int i15, p076m2.r rVar, int i16) {
        k(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1741519808);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1741519808, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.details.NetworkSecurityIssuesKnowledgeBaseDetailsInitialized (NetworkSecurityIssuesKnowledgeBaseDetailsScreen.kt:55)");
            }
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1061701101, true, new er.q() { // from class: cm2.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.n(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, initialized.d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cm2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.o(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(d.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1061701101, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.details.NetworkSecurityIssuesKnowledgeBaseDetailsInitialized.<anonymous> (NetworkSecurityIssuesKnowledgeBaseDetailsScreen.kt:57)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, rVar, 6, 1);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(a3.l(w0.i.d(mVarS, aVar.a(rVar, i16).getBase().a(), null, 2, null), d3Var), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            i(initialized.getArticleHeader(), rVar, 0);
            g(initialized.b(), rVar, 0);
            c30.b alertData = initialized.getAlertData();
            if (alertData == null) {
                rVar.X(383346320);
            } else {
                rVar.X(383346321);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
                c30.e.c(null, alertData, rVar, c30.b.f22944i << 3, 1);
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        m(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2122607106);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2122607106, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.details.NetworkSecurityIssuesKnowledgeBaseDetailsScreen (NetworkSecurityIssuesKnowledgeBaseDetailsScreen.kt:39)");
            }
            k(q(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cm2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.r(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a q(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(d dVar, int i15, p076m2.r rVar, int i16) {
        p(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}

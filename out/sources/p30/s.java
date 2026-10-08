package p30;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.l1;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.z0;
import h30.ButtonData;
import java.util.Iterator;
import java.util.List;
import l3.g0;
import mx.Label;
import n3.y2;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.c2;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import w0.q0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001d\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001fH\u0003¢\u0006\u0004\b \u0010!¨\u0006$²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lf3/m;", "modifier", "Lp30/a;", "data", "Loq/i0;", "t", "(Lf3/m;Lp30/a;Lm2/r;II)V", "Lp30/a$b;", "E", "(Lf3/m;Lp30/a$b;Lm2/r;I)V", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Lkotlin/Function0;", "content", "q", "(Lf3/m;JLer/p;Lm2/r;I)V", "Lp30/a$a;", "x", "(Lf3/m;Lp30/a$a;Lm2/r;I)V", "Lp30/a$a$a;", "C", "(Lp30/a$a$a;Lm2/r;I)V", "Lp30/a0;", "footerData", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lp30/a0;Lm2/r;I)V", "", "Lp30/t;", "actions", "v", "(Ljava/util/List;Lm2/r;I)V", "Lp30/a$c;", "N", "(Lf3/m;Lp30/a$c;Lm2/r;I)V", "", "sourcesExpanded", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(List list, l1 l1Var, p076m2.r rVar, int i15) {
        p076m2.r rVar2 = rVar;
        if (rVar2.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(691178748, i15, -1, "pl.gov.coi.common.ui.ds.chatbubble.IncomingMessage.<anonymous>.<anonymous>.<anonymous> (ChatBubble.kt:173)");
            }
            int i16 = 0;
            for (Object obj : list) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    pq.v.x();
                }
                ClickableContent clickableContent = (ClickableContent) obj;
                h30.q.p(new ButtonData(null, null, new k30.a.Large(false), new k30.c.WithText(mx.b.b(clickableContent.getValue(), "suggestionButton_" + i16), null, 2, null), new k30.d.Secondary(null, 1, null), null, clickableContent.b(), 35, null), false, null, rVar2, 0, 6);
                rVar2 = rVar;
                i16 = i17;
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(f3.m mVar, a.IncomingMessage incomingMessage, int i15, p076m2.r rVar, int i16) {
        x(mVar, incomingMessage, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void C(final a.IncomingMessage.InterfaceC3749a interfaceC3749a, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(271821070);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(interfaceC3749a) : rVarH.G(interfaceC3749a) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(271821070, i16, -1, "pl.gov.coi.common.ui.ds.chatbubble.IncomingMessageContent (ChatBubble.kt:193)");
            }
            if (interfaceC3749a instanceof a.IncomingMessage.InterfaceC3749a.Static) {
                rVarH.X(1808299776);
                Label label = ((a.IncomingMessage.InterfaceC3749a.Static) interfaceC3749a).getLabel();
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                j70.h.g(null, null, label, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                rVarH.R();
            } else {
                if (!(interfaceC3749a instanceof a.IncomingMessage.InterfaceC3749a.WithAnimatedDots)) {
                    rVarH.X(-772953877);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-772944922);
                d0.b(((a.IncomingMessage.InterfaceC3749a.WithAnimatedDots) interfaceC3749a).getLabel(), 0L, null, 0, 0, 0, 0L, rVarH, 0, 126);
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
            d5VarM.a(new er.p() { // from class: p30.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.D(interfaceC3749a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(a.IncomingMessage.InterfaceC3749a interfaceC3749a, int i15, p076m2.r rVar, int i16) {
        C(interfaceC3749a, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void E(final f3.m mVar, final a.Loading loading, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1114930460);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(loading) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1114930460, i16, -1, "pl.gov.coi.common.ui.ds.chatbubble.Loading (ChatBubble.kt:58)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            q(androidx.compose.foundation.layout.d.G(a3.r(mVarH, 0.0f, 0.0f, aVar.b(rVarH, i17).getSpacing600(), 0.0f, 11, null), f3.c.INSTANCE.k(), false, 2, null), aVar.a(rVarH, i17).getSurface().a(), y2.m.d(-183191425, true, new er.p() { // from class: p30.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.F(loading, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: p30.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.G(mVar, loading, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(a.Loading loading, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-183191425, i15, -1, "pl.gov.coi.common.ui.ds.chatbubble.Loading.<anonymous> (ChatBubble.kt:66)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarQ = a3.q(companion, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing150(), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            j70.h.g(a3.r(companion, 0.0f, aVar.b(rVar, i16).getSpacing50(), 0.0f, aVar.b(rVar, i16).getSpacing100(), 5, null), null, loading.getLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030138);
            w.c(rVar, 0);
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
    public static final i0 G(f3.m mVar, a.Loading loading, int i15, p076m2.r rVar, int i16) {
        E(mVar, loading, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0559  */
    /* JADX WARN: Code duplicated, block: B:57:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x02ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x02af  */
    /* JADX WARN: Code duplicated, block: B:63:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x030e  */
    /* JADX WARN: Code duplicated, block: B:71:0x031a  */
    /* JADX WARN: Code duplicated, block: B:72:0x031e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0376  */
    /* JADX WARN: Code duplicated, block: B:78:0x0382  */
    /* JADX WARN: Code duplicated, block: B:79:0x0386  */
    private static final void H(FooterData footerData, p076m2.r rVar, final int i15) {
        final FooterData footerData2;
        int i16;
        int i17;
        boolean z15;
        List<ClickableContent> listX0;
        int i18;
        er.a<androidx.compose.ui.node.c> aVarB;
        er.a<androidx.compose.ui.node.c> aVarB2;
        final p076m2.a3 a3Var;
        Label showMoreButtonLabel;
        int i19;
        d1.i iVar;
        k70.a aVar;
        p076m2.r rVarH = rVar.h(-981346996);
        int i25 = (i15 & 6) == 0 ? i15 | (rVarH.G(footerData) ? 4 : 2) : i15;
        if (rVarH.r((i25 & 3) != 2, i25 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-981346996, i25, -1, "pl.gov.coi.common.ui.ds.chatbubble.MessageFooter (ChatBubble.kt:208)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE);
            }
            p076m2.a3 a3Var2 = (p076m2.a3) objE;
            if (footerData.getIsVisible()) {
                rVarH.X(534188447);
                f3.m.Companion companion = f3.m.INSTANCE;
                k70.a aVar2 = k70.a.f108864a;
                int i26 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i26).getSpacing250()), rVarH, 0);
                f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
                f3.c.Companion companion2 = f3.c.INSTANCE;
                f3.c.InterfaceC1317c interfaceC1317cI = companion2.i();
                d1.i iVar2 = d1.i.f39152a;
                w0 w0VarB = m3.b(iVar2.j(), interfaceC1317cI, rVarH, 48);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarH);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB3);
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
                SourcesData sourcesData = footerData.getSourcesData();
                if (sourcesData == null) {
                    rVarH.X(1332263209);
                    rVarH.R();
                    iVar = iVar2;
                    aVar = aVar2;
                    i19 = i26;
                } else {
                    rVarH.X(1332263210);
                    i19 = i26;
                    iVar = iVar2;
                    aVar = aVar2;
                    j70.h.g(null, null, sourcesData.getTitle(), null, null, aVar2.a(rVarH, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i26).c(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                    rVarH = rVarH;
                    i0 i0Var = i0.f148189a;
                    rVarH.R();
                }
                f3.m mVarC = p3.c(q3Var, companion, 1.0f, false, 2, null);
                d1.i.e eVarS = iVar.s(aVar.b(rVarH, i19).getSpacing100(), companion2.j());
                footerData2 = footerData;
                p076m2.r rVar2 = rVarH;
                z0.h(mVarC, eVarS, null, null, 0, 0, y2.m.d(-721588880, true, new er.q() { // from class: p30.e
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return s.K(footerData2, (l1) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, 1572864, 60);
                rVarH = rVar2;
                rVarH.x();
                rVarH.R();
            } else {
                footerData2 = footerData;
                a3Var2 = a3Var2;
                rVarH.X(527376662);
                rVarH.R();
            }
            SourcesData sourcesData2 = footerData2.getSourcesData();
            if (sourcesData2 == null) {
                rVarH.X(535035521);
                rVarH.R();
                i16 = 0;
            } else {
                rVarH.X(535035522);
                f3.m.Companion companion4 = f3.m.INSTANCE;
                i16 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, 0);
                float f15 = 0.0f;
                Object obj = null;
                f3.m mVarH2 = androidx.compose.foundation.layout.d.h(companion4, 0.0f, 1, null);
                w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarH2);
                androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB4 = companion5.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB4);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarA, companion5.d());
                n6.i(rVarC2, e0VarT2, companion5.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
                n6.g(rVarC2, companion5.a());
                n6.i(rVarC2, mVarE2, companion5.e());
                d1.i0 i0Var2 = d1.i0.f39176a;
                if (I(a3Var2)) {
                    i17 = 2;
                } else {
                    i17 = 2;
                    if (sourcesData2.a().size() != 2) {
                        z15 = false;
                    }
                    if (z15) {
                        listX0 = sourcesData2.a();
                    } else {
                        if (!z15) {
                            throw new oq.p();
                        }
                        listX0 = pq.v.X0(sourcesData2.a(), 1);
                    }
                    rVarH.X(-311626775);
                    i18 = 0;
                    for (Object obj2 : listX0) {
                        int i27 = i18 + 1;
                        if (i18 < 0) {
                            pq.v.x();
                        }
                        ClickableContent clickableContent = (ClickableContent) obj2;
                        f3.m.Companion companion6 = f3.m.INSTANCE;
                        f3.m mVarH3 = androidx.compose.foundation.layout.d.h(companion6, f15, 1, obj);
                        f3.c.Companion companion7 = f3.c.INSTANCE;
                        w0 w0VarB2 = m3.b(d1.i.f39152a.j(), companion7.i(), rVarH, 48);
                        int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                        p076m2.e0 e0VarT3 = rVarH.t();
                        f3.m mVarE3 = f3.j.e(rVarH, mVarH3);
                        androidx.compose.ui.node.c.Companion companion8 = androidx.compose.ui.node.c.INSTANCE;
                        aVarB = companion8.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB);
                        } else {
                            rVarH.u();
                        }
                        p076m2.r rVarC3 = n6.c(rVarH);
                        n6.i(rVarC3, w0VarB2, companion8.d());
                        n6.i(rVarC3, e0VarT3, companion8.f());
                        n6.i(rVarC3, Integer.valueOf(iHashCode3), companion8.c());
                        n6.g(rVarC3, companion8.a());
                        n6.i(rVarC3, mVarE3, companion8.e());
                        f3.m mVarA = q3.f39261a.a(companion6, 1.0f, false);
                        w0 w0VarI = d1.r.i(companion7.o(), false);
                        int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                        p076m2.e0 e0VarT4 = rVarH.t();
                        f3.m mVarE4 = f3.j.e(rVarH, mVarA);
                        aVarB2 = companion8.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB2);
                        } else {
                            rVarH.u();
                        }
                        p076m2.r rVarC4 = n6.c(rVarH);
                        n6.i(rVarC4, w0VarI, companion8.d());
                        n6.i(rVarC4, e0VarT4, companion8.f());
                        n6.i(rVarC4, Integer.valueOf(iHashCode4), companion8.c());
                        n6.g(rVarC4, companion8.a());
                        n6.i(rVarC4, mVarE4, companion8.e());
                        d1.x xVar = d1.x.f39368a;
                        k30.a.b bVar = k30.a.b.f107765a;
                        h30.q.p(new ButtonData(null, null, bVar, new k30.c.WithText(mx.b.b(clickableContent.getValue(), "sourceButton_" + i18), null, i17, null), k30.d.a.f107773a, null, clickableContent.b(), 35, null), false, null, rVarH, 0, 6);
                        rVarH.x();
                        if ((I(a3Var2) && i18 == 0 && sourcesData2.a().size() > i17) || (I(a3Var2) && i18 == sourcesData2.a().size() - 1)) {
                            rVarH.X(1828426460);
                            f3.m mVarR = a3.r(companion6, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100(), 0.0f, 0.0f, 0.0f, 14, null);
                            w0 w0VarI2 = d1.r.i(companion7.o(), false);
                            int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                            p076m2.e0 e0VarT5 = rVarH.t();
                            f3.m mVarE5 = f3.j.e(rVarH, mVarR);
                            er.a<androidx.compose.ui.node.c> aVarB5 = companion8.b();
                            if (rVarH.l() == null) {
                                p076m2.m.d();
                            }
                            rVarH.K();
                            if (rVarH.getInserting()) {
                                rVarH.H(aVarB5);
                            } else {
                                rVarH.u();
                            }
                            p076m2.r rVarC5 = n6.c(rVarH);
                            n6.i(rVarC5, w0VarI2, companion8.d());
                            n6.i(rVarC5, e0VarT5, companion8.f());
                            n6.i(rVarC5, Integer.valueOf(iHashCode5), companion8.c());
                            n6.g(rVarC5, companion8.a());
                            n6.i(rVarC5, mVarE5, companion8.e());
                            k30.d.c cVar = k30.d.c.f107775a;
                            boolean zI = I(a3Var2);
                            if (zI) {
                                showMoreButtonLabel = sourcesData2.getShowLessButtonLabel();
                            } else {
                                if (zI) {
                                    throw new oq.p();
                                }
                                showMoreButtonLabel = sourcesData2.getShowMoreButtonLabel();
                            }
                            obj = null;
                            k30.c.WithText withText = new k30.c.WithText(showMoreButtonLabel, null, i17, null);
                            Object objE2 = rVarH.E();
                            if (objE2 == p076m2.r.INSTANCE.a()) {
                                a3Var = a3Var2;
                                objE2 = new er.a() { // from class: p30.f
                                    @Override // er.a
                                    public final Object a() {
                                        return s.L(a3Var);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                a3Var = a3Var2;
                            }
                            h30.q.p(new ButtonData(null, null, bVar, withText, cVar, null, (er.a) objE2, 35, null), false, null, rVarH, 0, 6);
                            rVarH.x();
                        } else {
                            a3Var = a3Var2;
                            obj = null;
                            rVarH.X(1819641215);
                        }
                        rVarH.R();
                        rVarH.x();
                        a3Var2 = a3Var;
                        i18 = i27;
                        f15 = 0.0f;
                    }
                    rVarH.R();
                    rVarH.x();
                    i0 i0Var3 = i0.f148189a;
                    rVarH.R();
                }
                z15 = true;
                if (z15) {
                    listX0 = sourcesData2.a();
                } else {
                    if (!z15) {
                        throw new oq.p();
                    }
                    listX0 = pq.v.X0(sourcesData2.a(), 1);
                }
                rVarH.X(-311626775);
                i18 = 0;
                while (r2.hasNext()) {
                    int i28 = i18 + 1;
                    if (i18 < 0) {
                        pq.v.x();
                    }
                    ClickableContent clickableContent2 = (ClickableContent) obj2;
                    f3.m.Companion companion9 = f3.m.INSTANCE;
                    f3.m mVarH4 = androidx.compose.foundation.layout.d.h(companion9, f15, 1, obj);
                    f3.c.Companion companion10 = f3.c.INSTANCE;
                    w0 w0VarB3 = m3.b(d1.i.f39152a.j(), companion10.i(), rVarH, 48);
                    int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT6 = rVarH.t();
                    f3.m mVarE6 = f3.j.e(rVarH, mVarH4);
                    androidx.compose.ui.node.c.Companion companion11 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion11.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC6 = n6.c(rVarH);
                    n6.i(rVarC6, w0VarB3, companion11.d());
                    n6.i(rVarC6, e0VarT6, companion11.f());
                    n6.i(rVarC6, Integer.valueOf(iHashCode6), companion11.c());
                    n6.g(rVarC6, companion11.a());
                    n6.i(rVarC6, mVarE6, companion11.e());
                    f3.m mVarA2 = q3.f39261a.a(companion9, 1.0f, false);
                    w0 w0VarI3 = d1.r.i(companion10.o(), false);
                    int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT7 = rVarH.t();
                    f3.m mVarE7 = f3.j.e(rVarH, mVarA2);
                    aVarB2 = companion11.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB2);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC7 = n6.c(rVarH);
                    n6.i(rVarC7, w0VarI3, companion11.d());
                    n6.i(rVarC7, e0VarT7, companion11.f());
                    n6.i(rVarC7, Integer.valueOf(iHashCode7), companion11.c());
                    n6.g(rVarC7, companion11.a());
                    n6.i(rVarC7, mVarE7, companion11.e());
                    d1.x xVar2 = d1.x.f39368a;
                    k30.a.b bVar2 = k30.a.b.f107765a;
                    h30.q.p(new ButtonData(null, null, bVar2, new k30.c.WithText(mx.b.b(clickableContent2.getValue(), "sourceButton_" + i18), null, i17, null), k30.d.a.f107773a, null, clickableContent2.b(), 35, null), false, null, rVarH, 0, 6);
                    rVarH.x();
                    if (I(a3Var2)) {
                        a3Var = a3Var2;
                        obj = null;
                        rVarH.X(1819641215);
                    } else {
                        a3Var = a3Var2;
                        obj = null;
                        rVarH.X(1819641215);
                    }
                    rVarH.R();
                    rVarH.x();
                    a3Var2 = a3Var;
                    i18 = i28;
                    f15 = 0.0f;
                }
                rVarH.R();
                rVarH.x();
                i0 i0Var4 = i0.f148189a;
                rVarH.R();
            }
            if (footerData2.getIsVisible()) {
                rVarH.X(536932226);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, i16);
            } else {
                rVarH.X(527376662);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            footerData2 = footerData;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: p30.g
                @Override // er.p
                public final Object B(Object obj3, Object obj4) {
                    return s.M(footerData2, i15, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final boolean I(p076m2.a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    private static final void J(p076m2.a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(FooterData footerData, l1 l1Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-721588880, i15, -1, "pl.gov.coi.common.ui.ds.chatbubble.MessageFooter.<anonymous>.<anonymous> (ChatBubble.kt:234)");
            }
            Iterator<T> it = footerData.a().iterator();
            while (it.hasNext()) {
                i30.g.f(((x) it.next()).getButtonData(), false, false, rVar, 0, 6);
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(p076m2.a3 a3Var) {
        J(a3Var, !I(a3Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(FooterData footerData, int i15, p076m2.r rVar, int i16) {
        H(footerData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void N(final f3.m mVar, final a.OutgoingMessage outgoingMessage, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1623571196);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(outgoingMessage) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1623571196, i16, -1, "pl.gov.coi.common.ui.ds.chatbubble.OutgoingMessage (ChatBubble.kt:325)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            q(androidx.compose.foundation.layout.d.G(a3.r(mVarH, aVar.b(rVarH, i17).getSpacing600(), 0.0f, 0.0f, 0.0f, 14, null), f3.c.INSTANCE.j(), false, 2, null), aVar.a(rVarH, i17).getBase().getPrimary(), y2.m.d(-1500322657, true, new er.p() { // from class: p30.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.O(outgoingMessage, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: p30.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.P(mVar, outgoingMessage, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(a.OutgoingMessage outgoingMessage, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1500322657, i15, -1, "pl.gov.coi.common.ui.ds.chatbubble.OutgoingMessage.<anonymous> (ChatBubble.kt:333)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(a3.n(companion, aVar.b(rVar, i16).getSpacing200()), null, outgoingMessage.getContent(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(f3.m mVar, a.OutgoingMessage outgoingMessage, int i15, p076m2.r rVar, int i16) {
        N(mVar, outgoingMessage, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void q(final f3.m mVar, final long j15, final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(423187626);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.d(j15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(pVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(423187626, i16, -1, "pl.gov.coi.common.ui.ds.chatbubble.Bubble (ChatBubble.kt:92)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            y2 radius150 = aVar.e(rVarH, i17).getRadius150();
            y1 y1Var = y1.f58315a;
            int i18 = y1.f58316b;
            c2.c(mVar, radius150, y1Var.b(j15, 0L, 0L, 0L, rVarH, ((i16 >> 3) & 14) | (i18 << 12), 14), y1Var.c(aVar.c(rVarH, i17).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i18 << 18, 62), null, y2.m.d(509057016, true, new er.q() { // from class: p30.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.r(pVar, (h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196608 | (i16 & 14), 16);
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
            d5VarM.a(new er.p() { // from class: p30.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.s(mVar, j15, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(er.p pVar, h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(509057016, i15, -1, "pl.gov.coi.common.ui.ds.chatbubble.Bubble.<anonymous> (ChatBubble.kt:99)");
            }
            pVar.B(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(f3.m mVar, long j15, er.p pVar, int i15, p076m2.r rVar, int i16) {
        q(mVar, j15, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void t(final f3.m mVar, final a aVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-1484926824);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1484926824, i17, -1, "pl.gov.coi.common.ui.ds.chatbubble.ChatBubble (ChatBubble.kt:46)");
            }
            if (aVar instanceof a.Loading) {
                rVarH.X(-1085531519);
                E(mVar, (a.Loading) aVar, rVarH, i17 & 126);
                rVarH.R();
            } else if (aVar instanceof a.IncomingMessage) {
                rVarH.X(-1085528855);
                x(mVar, (a.IncomingMessage) aVar, rVarH, i17 & 126);
                rVarH.R();
            } else {
                if (!(aVar instanceof a.OutgoingMessage)) {
                    rVarH.X(-1085532790);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1085525943);
                N(mVar, (a.OutgoingMessage) aVar, rVarH, i17 & 126);
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
            d5VarM.a(new er.p() { // from class: p30.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.u(mVar, aVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(f3.m mVar, a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        t(mVar, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void v(final List<ClickableContent> list, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(1142725186);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1142725186, i16, -1, "pl.gov.coi.common.ui.ds.chatbubble.CtaSection (ChatBubble.kt:303)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarH, 0.0f, aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing600(), 0.0f, 9, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
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
            rVarH.X(-168625884);
            int i18 = 0;
            for (Object obj : list) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    pq.v.x();
                }
                h30.q.p(((ClickableContent) obj).getActionButtonData(), false, null, rVarH, 0, 6);
                if (i18 != pq.v.p(list)) {
                    rVarH.X(464886905);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
                } else {
                    rVarH.X(454868790);
                }
                rVarH.R();
                i18 = i19;
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: p30.h
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return s.w(list, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(List list, int i15, p076m2.r rVar, int i16) {
        v(list, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void x(final f3.m mVar, final a.IncomingMessage incomingMessage, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        f3.m mVarC;
        d1.i iVar;
        int i17;
        f3.m.Companion companion;
        k70.a aVar;
        p076m2.r rVarH = rVar.h(-1765131708);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(mVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(incomingMessage) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1765131708, i16, -1, "pl.gov.coi.common.ui.ds.chatbubble.IncomingMessage (ChatBubble.kt:107)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null);
            d1.i iVar2 = d1.i.f39152a;
            d1.i.n nVarK = iVar2.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m.Companion companion4 = f3.m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(a3.r(companion4, 0.0f, 0.0f, aVar2.b(rVarH, i18).getSpacing600(), 0.0f, 11, null), 0.0f, 1, null);
            l3.d0 focusRequester = incomingMessage.getFocusRequester();
            if (focusRequester == null) {
                rVarH.X(1764447894);
                rVarH.R();
                mVarC = null;
            } else {
                rVarH.X(1764447895);
                f3.m mVarC2 = q0.c(g0.a(companion4, focusRequester), false, null, 3, null);
                Object objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: p30.n
                        @Override // er.l
                        public final Object b(Object obj) {
                            return s.y((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                mVarC = n4.v.c(mVarC2, true, (er.l) objE);
                rVarH.R();
            }
            if (mVarC == null) {
                mVarC = companion4;
            }
            q(mVarH2.u(mVarC), aVar2.a(rVarH, i18).getSurface().a(), y2.m.d(1500588629, true, new er.p() { // from class: p30.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.z(incomingMessage, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
            List<ClickableContent> listC = incomingMessage.c();
            if (listC == null || listC.isEmpty()) {
                listC = null;
            }
            if (listC == null) {
                rVarH.X(1765535095);
            } else {
                rVarH.X(1765535096);
                v(listC, rVarH, 0);
            }
            rVarH.R();
            Label additionalInfo = incomingMessage.getAdditionalInfo();
            if (additionalInfo == null) {
                rVarH.X(1765616222);
                rVarH.R();
                i17 = 0;
                iVar = iVar2;
                companion = companion4;
                aVar = aVar2;
            } else {
                rVarH.X(1765616223);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVarH, i18).getSpacing50()), rVarH, 0);
                iVar = iVar2;
                i17 = 0;
                companion = companion4;
                aVar = aVar2;
                j70.h.g(null, null, additionalInfo, null, null, aVar2.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).f(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                rVarH.R();
            }
            final List<ClickableContent> listI = incomingMessage.i();
            if (listI == null) {
                rVarH.X(1765922998);
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(1765922999);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing300()), rVarH, i17);
                d1.i iVar3 = iVar;
                rVar2 = rVarH;
                z0.h(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), iVar3.s(aVar.b(rVarH, i18).getSpacing100(), companion2.j()), iVar3.r(aVar.b(rVarH, i18).getSpacing100()), null, 0, 0, y2.m.d(691178748, true, new er.q() { // from class: p30.p
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return s.A(listI, (l1) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, 1572870, 56);
                rVar2.R();
            }
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: p30.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.B(mVar, incomingMessage, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(a.IncomingMessage incomingMessage, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1500588629, i15, -1, "pl.gov.coi.common.ui.ds.chatbubble.IncomingMessage.<anonymous>.<anonymous> (ChatBubble.kt:125)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarQ = a3.q(companion, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing150(), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            j70.h.g(a3.r(companion, 0.0f, aVar.b(rVar, i16).getSpacing50(), 0.0f, aVar.b(rVar, i16).getSpacing100(), 5, null), null, incomingMessage.getLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030138);
            C(incomingMessage.getContent(), rVar, 0);
            FooterData footerData = incomingMessage.getFooterData();
            if (footerData == null) {
                rVar.X(-1366329274);
            } else {
                rVar.X(-1366329273);
                H(footerData, rVar, 0);
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
}

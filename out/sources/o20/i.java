package o20;

import androidx.compose.ui.graphics.Color;
import b30.AccordionData;
import b30.AccordionElement;
import d1.a3;
import d1.d3;
import d1.r3;
import f40.LabelButtonImageSingleCardData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0014\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lo20/r2;", "data", "Loq/i0;", "t", "(Lo20/r2;Lm2/r;I)V", "Lo20/j;", "Lty/a;", "vmsContent", "r", "(Lo20/j;Lty/a;Lm2/r;I)V", "Lo20/k;", "baseDocumentData", "m", "(Lo20/k;Lm2/r;I)V", "p", "(Lo20/k;Lty/a;Lm2/r;II)V", "", "additionalDataTestTag", "", "Lo20/l;", "i", "(Ljava/lang/String;Ljava/util/List;Lm2/r;I)V", "Lc5/h;", "a", "F", "CARD_MINIMUM_HEIGHT", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f140729a = c5.h.n(80);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f140730a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(1428324518);
            if (p076m2.t.k()) {
                p076m2.t.o(1428324518, i15, -1, "pl.gov.coi.common.ui.document.component.AdditionalData.<anonymous>.<anonymous> (BaseDocumentComponent.kt:353)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f140731a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1916589994);
            if (p076m2.t.k()) {
                p076m2.t.o(-1916589994, i15, -1, "pl.gov.coi.common.ui.document.component.AdditionalData.<anonymous>.<anonymous> (BaseDocumentComponent.kt:360)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f140732a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-91009110);
            if (p076m2.t.k()) {
                p076m2.t.o(-91009110, i15, -1, "pl.gov.coi.common.ui.document.component.AdditionalData.<anonymous>.<anonymous> (BaseDocumentComponent.kt:200)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0199  */
    private static final void i(final String str, final List<? extends l> list, p076m2.r rVar, final int i15) {
        int i16;
        char c15;
        int i17;
        int i18;
        boolean z15;
        String str2;
        String str3;
        n50.x0.Button button;
        String str4;
        String str5;
        String str6;
        p076m2.r rVarH = rVar.h(2098948729);
        int i19 = 2;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(str) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(list) ? 32 : 16;
        }
        char c16 = 18;
        boolean z16 = true;
        int i25 = 0;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2098948729, i16, -1, "pl.gov.coi.common.ui.document.component.AdditionalData (BaseDocumentComponent.kt:169)");
            }
            Iterator it = list.iterator();
            final int i26 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i27 = i26 + 1;
                if (i26 < 0) {
                    pq.v.x();
                }
                final l lVar = (l) next;
                if (lVar instanceof l.Expandable) {
                    rVarH.X(-76508309);
                    l.Expandable expandable = (l.Expandable) lVar;
                    b30.j.g(new AccordionData(pq.v.e(new AccordionElement(null, expandable.getTitle(), null, false, null, false, new q20.b(expandable.getCardListData()), 29, null))), rVarH, AccordionData.f16343b);
                    rVarH.R();
                } else if (lVar instanceof l.StaticList) {
                    rVarH.X(-76495577);
                    m30.i.d(((l.StaticList) lVar).getCardListData(), null, null, rVarH, 0, 6);
                    rVarH.R();
                } else {
                    String str7 = null;
                    if (lVar instanceof l.Button) {
                        rVarH.X(-76492027);
                        n50.h0.v(((l.Button) lVar).getItem(), null, rVarH, i25, i19);
                        rVarH.R();
                    } else if (lVar instanceof l.SingleCardIconForward) {
                        rVarH.X(-76487434);
                        if (str != null) {
                            str6 = str + i26 + "IconForwardCard";
                        } else {
                            str6 = null;
                        }
                        l.SingleCardIconForward singleCardIconForward = (l.SingleCardIconForward) lVar;
                        n50.h0.v(new DefaultSingleCardData(str6, singleCardIconForward.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(singleCardIconForward.getLabel(), null, null, 3, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(singleCardIconForward.getIconResId(), null, c.f140732a, null, null, 26, null), 3, null), n50.x0.Icon.INSTANCE.b(), null, 2300, null), null, rVarH, i25, i19);
                        rVarH.R();
                    } else {
                        if (lVar instanceof l.SingleCardImageButton) {
                            rVarH.X(1924604564);
                            if (str != null) {
                                str5 = str + i26 + "ImageButtonCard";
                                if (str5 == null) {
                                    str5 = "BaseDocumentImageButtonSingleCard";
                                }
                            } else {
                                str5 = "BaseDocumentImageButtonSingleCard";
                            }
                            l.SingleCardImageButton singleCardImageButton = (l.SingleCardImageButton) lVar;
                            n50.h0.v(new CustomSingleCardData(str5, new f40.b(new LabelButtonImageSingleCardData(null, new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(singleCardImageButton.getButtonLabel(), null, i19, null), k30.d.a.f107773a, null, singleCardImageButton.c(), 35, null), new n50.i.Image(singleCardImageButton.getImage(), null, null, 6, null), 1, null)), null, false, null, null, false, null, 252, null), null, rVarH, CustomSingleCardData.f131996i, i19);
                            rVarH.R();
                        } else {
                            if (lVar instanceof l.Section) {
                                rVarH.X(1925476780);
                                l.Section section = (l.Section) lVar;
                                Label label = section.getLabel();
                                if (label == null || !label.l()) {
                                    label = null;
                                }
                                if (label == null) {
                                    rVarH.X(1925541600);
                                    rVarH.R();
                                    c15 = c16;
                                    i17 = i25;
                                } else {
                                    rVarH.X(1925541601);
                                    if (str != null) {
                                        str7 = str + i26 + "SectionText";
                                    }
                                    k70.a aVar = k70.a.f108864a;
                                    int i28 = k70.a.f108865b;
                                    p076m2.r rVar2 = rVarH;
                                    c15 = c16;
                                    i17 = i25;
                                    j70.h.g(null, str7, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i28).p(), null, null, false, false, null, rVar2, 0, 0, 0, 33030137);
                                    rVarH = rVar2;
                                    if (section.b().isEmpty()) {
                                        rVarH.X(-819589678);
                                    } else {
                                        rVarH.X(-810852111);
                                        r3.a(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, aVar.b(rVarH, i28).getSpacing150()), rVarH, i17);
                                    }
                                    rVarH.R();
                                    oq.i0 i0Var = oq.i0.f148189a;
                                    rVarH.R();
                                }
                                m30.i.d(new CardListData(section.b(), null, false, null, null, 30, null), null, null, rVarH, 0, 6);
                                rVarH.R();
                            } else {
                                it = it;
                                c15 = c16;
                                i17 = i25;
                                if (lVar instanceof l.TopSection) {
                                    rVarH.X(-76412784);
                                    x30.c.c(null, 0.0f, y2.m.d(-567328511, true, new er.p() { // from class: o20.e
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return i.j(lVar, str, i26, (p076m2.r) obj, ((Integer) obj2).intValue());
                                        }
                                    }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
                                    rVarH.R();
                                } else if (lVar instanceof l.UpdateDataItem) {
                                    rVarH.X(-76342221);
                                    if (str != null) {
                                        str3 = str + i26 + "UpdateDataItemCard";
                                    } else {
                                        str3 = null;
                                    }
                                    l.UpdateDataItem updateDataItem = (l.UpdateDataItem) lVar;
                                    BodySection bodySection = new BodySection(n50.l.b(updateDataItem.getLastUpdateLabel(), null, null, 3, null), new n50.b.Title(n50.l.b(updateDataItem.getLastUpdateValue(), null, null, 3, null)), null, 4, null);
                                    Label updateButton = updateDataItem.getUpdateButton();
                                    if (updateButton != null) {
                                        if (str != null) {
                                            str4 = str + i26 + "UpdateDataItemButton";
                                        } else {
                                            str4 = null;
                                        }
                                        button = new n50.x0.Button(new ButtonData(str4, null, k30.a.b.f107765a, new k30.c.WithText(updateButton, updateDataItem.getUpdateButtonContentDescription()), k30.d.a.f107773a, null, updateDataItem.c(), 34, null));
                                    } else {
                                        button = null;
                                    }
                                    i18 = 2;
                                    n50.h0.v(new DefaultSingleCardData(str3, null, false, null, null, false, null, null, bodySection, null, button, null, 2814, null), null, rVarH, i17, 2);
                                    rVarH.R();
                                    z15 = true;
                                } else {
                                    i18 = 2;
                                    if (lVar instanceof l.InfoItem) {
                                        rVarH.X(1929456436);
                                        f3.m mVarB = androidx.compose.foundation.layout.d.b(f3.m.INSTANCE, 0.0f, f140729a, 1, null);
                                        p046f2.y1 y1Var = p046f2.y1.f58315a;
                                        int i29 = p046f2.y1.f58316b;
                                        p046f2.x1 x1VarA = y1Var.a(rVarH, i29);
                                        k70.a aVar2 = k70.a.f108864a;
                                        int i35 = k70.a.f108865b;
                                        p076m2.r rVar3 = rVarH;
                                        z15 = true;
                                        p046f2.c2.c(mVarB, l1.h.f(aVar2.b(rVarH, i35).getSpacing150()), p046f2.x1.d(x1VarA, aVar2.a(rVarH, i35).getSupport().i(), 0L, 0L, 0L, 14, null), y1Var.c(aVar2.c(rVarH, i35).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVar3, i29 << 18, 62), null, y2.m.d(-2131869104, true, new er.q() { // from class: o20.f
                                            @Override // er.q
                                            public final Object w(Object obj, Object obj2, Object obj3) {
                                                return i.k(lVar, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                            }
                                        }, rVar3, 54), rVar3, 196614, 16);
                                        rVarH = rVar3;
                                        rVarH.R();
                                    } else {
                                        z15 = true;
                                        if (lVar instanceof l.b) {
                                            rVarH.X(-76289036);
                                            if (str != null) {
                                                str2 = str + i26 + "DeleteItemCard";
                                            } else {
                                                str2 = null;
                                            }
                                            l.b bVar = (l.b) lVar;
                                            n50.h0.v(new DefaultSingleCardData(str2, bVar.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(bVar.a(), null, b.f140731a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106727a, null, a.f140730a, null, null, 26, null), 3, null), null, null, 3324, null), null, rVarH, i17, 2);
                                            rVarH.R();
                                        } else {
                                            if (!(lVar instanceof l.Shortcuts)) {
                                                rVarH.X(-76502998);
                                                rVarH.R();
                                                throw new oq.p();
                                            }
                                            rVarH.X(1930812314);
                                            h70.g.f(((l.Shortcuts) lVar).getShortcutsLayoutData(), rVarH, i17);
                                            r3.a(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, i17);
                                            rVarH.R();
                                        }
                                    }
                                }
                            }
                            i18 = 2;
                            z15 = true;
                        }
                        r3.a(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i17);
                        it = it;
                        i19 = i18;
                        z16 = z15;
                        i26 = i27;
                        c16 = c15;
                        i25 = i17;
                    }
                }
                it = it;
                i18 = i19;
                c15 = c16;
                i17 = i25;
                z15 = z16;
                r3.a(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i17);
                it = it;
                i19 = i18;
                z16 = z15;
                i26 = i27;
                c16 = c15;
                i25 = i17;
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o20.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(str, list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(l lVar, String str, int i15, p076m2.r rVar, int i16) {
        f3.m.Companion companion;
        int i17;
        String str2;
        String string;
        String str3;
        int i18;
        boolean z15;
        p076m2.r rVar2 = rVar;
        if (rVar2.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-567328511, i16, -1, "pl.gov.coi.common.ui.document.component.AdditionalData.<anonymous>.<anonymous> (BaseDocumentComponent.kt:259)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, companion2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            l.TopSection topSection = (l.TopSection) lVar;
            Label title = topSection.getTitle();
            if (title == null) {
                rVar2.X(472244935);
                rVar2.R();
                companion = companion2;
                i17 = 0;
            } else {
                rVar2.X(472244936);
                String str4 = str != null ? str + i15 + "TopSectionTitleText" : null;
                k70.a aVar = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                companion = companion2;
                i17 = 0;
                j70.h.g(null, str4, title, null, null, aVar.a(rVar2, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i19).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030105);
                rVar2 = rVar;
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVar2.R();
            }
            Label section = topSection.getSection();
            if (section == null) {
                rVar2.X(472607232);
                rVar2.R();
                str3 = str;
            } else {
                rVar2.X(472607233);
                if (topSection.getTitle() != null) {
                    rVar2.X(1757527416);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, i17);
                } else {
                    rVar2.X(1748000837);
                }
                rVar2.R();
                if (str != null) {
                    StringBuilder sb5 = new StringBuilder();
                    str2 = str;
                    sb5.append(str2);
                    sb5.append(i15);
                    sb5.append("TopSectionSectionText");
                    string = sb5.toString();
                } else {
                    str2 = str;
                    string = null;
                }
                k70.a aVar2 = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                String str5 = str2;
                String str6 = string;
                str3 = str5;
                j70.h.g(null, str6, section, null, null, aVar2.a(rVar2, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i25).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030105);
                rVar2 = rVar;
                oq.i0 i0Var3 = oq.i0.f148189a;
                rVar2.R();
            }
            List<Label> listC = topSection.c();
            int i26 = 10;
            if (listC == null) {
                rVar2.X(473138355);
                rVar2.R();
                i18 = 10;
            } else {
                rVar2.X(473138356);
                List<Label> list = listC;
                ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
                for (Label label : list) {
                    if (topSection.getTitle() == null && topSection.getSection() == null) {
                        rVar2.X(-638008445);
                    } else {
                        rVar2.X(-627912458);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, i17);
                    }
                    rVar2.R();
                    String str7 = str3 != null ? str3 + i15 + "TopStaticSectionText" : null;
                    k70.a aVar3 = k70.a.f108864a;
                    int i27 = k70.a.f108865b;
                    ArrayList arrayList2 = arrayList;
                    j70.h.g(null, str7, label, null, null, aVar3.a(rVar2, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i27).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030105);
                    rVar2 = rVar;
                    arrayList2.add(oq.i0.f148189a);
                    arrayList = arrayList2;
                    i26 = i26;
                    i17 = 0;
                    str3 = str;
                }
                i18 = i26;
                rVar2.R();
            }
            List<Label> listA = topSection.a();
            if (listA == null) {
                rVar2.X(473716536);
                rVar2.R();
            } else {
                rVar2.X(473716537);
                List<Label> list2 = listA;
                ArrayList arrayList3 = new ArrayList(pq.v.y(list2, i18));
                for (Label label2 : list2) {
                    if (topSection.getTitle() == null && topSection.getSection() == null && topSection.c() == null) {
                        rVar2.X(2012434722);
                        rVar2.R();
                        z15 = false;
                    } else {
                        rVar2.X(2023194357);
                        z15 = false;
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, 0);
                        rVar2.R();
                    }
                    String str8 = str != null ? str + i15 + "TopDynamicSectionText" : null;
                    k70.a aVar4 = k70.a.f108864a;
                    int i28 = k70.a.f108865b;
                    ArrayList arrayList4 = arrayList3;
                    j70.h.g(null, str8, label2, null, null, aVar4.a(rVar2, i28).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVar2, i28).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030105);
                    arrayList4.add(oq.i0.f148189a);
                    rVar2 = rVar;
                    arrayList3 = arrayList4;
                }
                rVar.R();
            }
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(l lVar, d1.h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2131869104, i15, -1, "pl.gov.coi.common.ui.document.component.AdditionalData.<anonymous>.<anonymous> (BaseDocumentComponent.kt:343)");
            }
            c30.e.c(null, new c30.b.c(null, null, null, ((l.InfoItem) lVar).getLabel(), null, null, null, 119, null), rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(String str, List list, int i15, p076m2.r rVar, int i16) {
        i(str, list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final BaseDocumentData baseDocumentData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1592409422);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(baseDocumentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1592409422, i16, -1, "pl.gov.coi.common.ui.document.component.BaseDocumentComponent (BaseDocumentComponent.kt:99)");
            }
            rVar2 = rVarH;
            i50.s.r(baseDocumentData.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1308401093, true, new er.q() { // from class: o20.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.n(baseDocumentData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o20.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(baseDocumentData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(BaseDocumentData baseDocumentData, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1308401093, i15, -1, "pl.gov.coi.common.ui.document.component.BaseDocumentComponent.<anonymous> (BaseDocumentComponent.kt:105)");
            }
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), null, rVar, 0, 1);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarS, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing200(), 0.0f, 8, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            p(baseDocumentData, null, rVar, 0, 2);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(BaseDocumentData baseDocumentData, int i15, p076m2.r rVar, int i16) {
        m(baseDocumentData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f A[LOOP:1: B:39:0x0079->B:41:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0221  */
    /* JADX WARN: Code duplicated, block: B:69:0x0233  */
    /* JADX WARN: Code duplicated, block: B:72:0x0241  */
    /* JADX WARN: Code duplicated, block: B:74:0x024b  */
    /* JADX WARN: Code duplicated, block: B:77:0x025d A[LOOP:0: B:75:0x0257->B:77:0x025d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0288  */
    /* JADX WARN: Code duplicated, block: B:82:0x028e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0297  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00dc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x01d6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0221, please report this as an issue */
    public static final void p(final BaseDocumentData baseDocumentData, ty.a aVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final ty.a aVar2;
        boolean z15;
        d5 d5VarM;
        ty.a aVar3;
        List<c30.b> listG;
        Iterator<T> it;
        DocumentGiloshData giloshData;
        String testTag;
        String str;
        f3.m.Companion companion;
        k70.a aVar4;
        int i18;
        ty.a aVar5;
        int i19;
        List<l> listF;
        String testTag2;
        String str2;
        String testTag3;
        String str3;
        List<c30.b> listC;
        Iterator<T> it4;
        p076m2.r rVarH = rVar.h(523438116);
        if ((i15 & 6) == 0) {
            i17 = i15 | (rVarH.G(baseDocumentData) ? 4 : 2);
        } else {
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                aVar2 = aVar;
                i17 |= rVarH.G(aVar2) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i25 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(523438116, i17, -1, "pl.gov.coi.common.ui.document.component.BaseDocumentComponentContent (BaseDocumentComponent.kt:127)");
                }
                listG = baseDocumentData.g();
                if (listG == null) {
                    rVarH.X(-1281216220);
                } else {
                    rVarH.X(-1281216219);
                    it = listG.iterator();
                    while (it.hasNext()) {
                        c30.e.c(null, (c30.b) it.next(), rVarH, c30.b.f22944i << 3, 1);
                        r3.a(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
                    }
                }
                rVarH.R();
                if (aVar3 == null) {
                    rVarH.X(-1281084811);
                } else {
                    rVarH.X(512864012);
                    aVar3.b(rVarH, (i17 >> 3) & 14);
                }
                rVarH.R();
                giloshData = baseDocumentData.getGiloshData();
                if (giloshData == null) {
                    rVarH.X(-1281032948);
                    rVarH.R();
                    i19 = 0;
                    aVar5 = aVar3;
                } else {
                    rVarH.X(-1281032947);
                    testTag = baseDocumentData.getTestTag();
                    if (testTag != null) {
                        str = testTag + "TimerText";
                    } else {
                        str = null;
                    }
                    companion = f3.m.INSTANCE;
                    f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
                    int iA = b5.j.INSTANCE.a();
                    Label label = (Label) m7.b.c(giloshData.getDocumentVMS().a(), null, null, null, rVarH, 0, 7).getValue();
                    aVar4 = k70.a.f108864a;
                    i18 = k70.a.f108865b;
                    aVar5 = aVar3;
                    i19 = 0;
                    j70.h.g(mVarH, str, label, null, null, aVar4.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 0, 0, null, aVar4.f(rVarH, i18).f(), null, null, false, false, null, rVarH, 6, 0, 0, 33026008);
                    rVarH = rVarH;
                    r3.a(androidx.compose.foundation.layout.d.t(companion, aVar4.b(rVarH, i18).getSpacing200()), rVarH, 0);
                    listF = baseDocumentData.f();
                    if (listF.isEmpty()) {
                        listF = null;
                    }
                    if (listF == null) {
                        rVarH.X(-237248051);
                    } else {
                        rVarH.X(-237248050);
                        testTag2 = baseDocumentData.getTestTag();
                        if (testTag2 != null) {
                            str2 = testTag2 + "TopSection";
                        } else {
                            str2 = null;
                        }
                        i(str2, baseDocumentData.f(), rVarH, 0);
                        r3.a(androidx.compose.foundation.layout.d.t(companion, aVar4.b(rVarH, i18).getSpacing100()), rVarH, 0);
                    }
                    rVarH.R();
                    p2.E(giloshData, rVarH, 0);
                    rVarH.R();
                }
                r3.a(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, i19);
                testTag3 = baseDocumentData.getTestTag();
                if (testTag3 != null) {
                    str3 = testTag3 + "MiddleSection";
                } else {
                    str3 = null;
                }
                i(str3, baseDocumentData.a(), rVarH, i19);
                listC = baseDocumentData.c();
                if (listC == null) {
                    rVarH.X(-1280050620);
                } else {
                    rVarH.X(-1280050619);
                    it4 = listC.iterator();
                    while (it4.hasNext()) {
                        c30.e.c(null, (c30.b) it4.next(), rVarH, c30.b.f22944i << 3, 1);
                        r3.a(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i19);
                    }
                }
                rVarH.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                aVar2 = aVar5;
            } else {
                rVarH.O();
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: o20.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.q(baseDocumentData, aVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        aVar2 = aVar;
        if ((i17 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i25 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(523438116, i17, -1, "pl.gov.coi.common.ui.document.component.BaseDocumentComponentContent (BaseDocumentComponent.kt:127)");
            }
            listG = baseDocumentData.g();
            if (listG == null) {
                rVarH.X(-1281216220);
            } else {
                rVarH.X(-1281216219);
                it = listG.iterator();
                while (it.hasNext()) {
                    c30.e.c(null, (c30.b) it.next(), rVarH, c30.b.f22944i << 3, 1);
                    r3.a(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
                }
            }
            rVarH.R();
            if (aVar3 == null) {
                rVarH.X(-1281084811);
            } else {
                rVarH.X(512864012);
                aVar3.b(rVarH, (i17 >> 3) & 14);
            }
            rVarH.R();
            giloshData = baseDocumentData.getGiloshData();
            if (giloshData == null) {
                rVarH.X(-1281032948);
                rVarH.R();
                i19 = 0;
                aVar5 = aVar3;
            } else {
                rVarH.X(-1281032947);
                testTag = baseDocumentData.getTestTag();
                if (testTag != null) {
                    str = testTag + "TimerText";
                } else {
                    str = null;
                }
                companion = f3.m.INSTANCE;
                f3.m mVarH2 = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
                int iA2 = b5.j.INSTANCE.a();
                Label label2 = (Label) m7.b.c(giloshData.getDocumentVMS().a(), null, null, null, rVarH, 0, 7).getValue();
                aVar4 = k70.a.f108864a;
                i18 = k70.a.f108865b;
                aVar5 = aVar3;
                i19 = 0;
                j70.h.g(mVarH2, str, label2, null, null, aVar4.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(iA2), 0L, 0, false, 0, 0, null, aVar4.f(rVarH, i18).f(), null, null, false, false, null, rVarH, 6, 0, 0, 33026008);
                rVarH = rVarH;
                r3.a(androidx.compose.foundation.layout.d.t(companion, aVar4.b(rVarH, i18).getSpacing200()), rVarH, 0);
                listF = baseDocumentData.f();
                if (listF.isEmpty()) {
                    listF = null;
                }
                if (listF == null) {
                    rVarH.X(-237248051);
                } else {
                    rVarH.X(-237248050);
                    testTag2 = baseDocumentData.getTestTag();
                    if (testTag2 != null) {
                        str2 = testTag2 + "TopSection";
                    } else {
                        str2 = null;
                    }
                    i(str2, baseDocumentData.f(), rVarH, 0);
                    r3.a(androidx.compose.foundation.layout.d.t(companion, aVar4.b(rVarH, i18).getSpacing100()), rVarH, 0);
                }
                rVarH.R();
                p2.E(giloshData, rVarH, 0);
                rVarH.R();
            }
            r3.a(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, i19);
            testTag3 = baseDocumentData.getTestTag();
            if (testTag3 != null) {
                str3 = testTag3 + "MiddleSection";
            } else {
                str3 = null;
            }
            i(str3, baseDocumentData.a(), rVarH, i19);
            listC = baseDocumentData.c();
            if (listC == null) {
                rVarH.X(-1280050620);
            } else {
                rVarH.X(-1280050619);
                it4 = listC.iterator();
                while (it4.hasNext()) {
                    c30.e.c(null, (c30.b) it4.next(), rVarH, c30.b.f22944i << 3, 1);
                    r3.a(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i19);
                }
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            aVar2 = aVar5;
        } else {
            rVarH.O();
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o20.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.q(baseDocumentData, aVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(BaseDocumentData baseDocumentData, ty.a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        p(baseDocumentData, aVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final void r(final BaseDocumentComponentNewData baseDocumentComponentNewData, final ty.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1083055136);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(baseDocumentComponentNewData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1083055136, i16, -1, "pl.gov.coi.common.ui.document.component.BaseDocumentComponentNew (BaseDocumentComponent.kt:79)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                BaseDocumentData baseDocumentData = new BaseDocumentData(baseDocumentComponentNewData.getTestTag(), new BaseScaffoldData(null, null, null, null, null, null, 63, null), pq.v.n(), null, baseDocumentComponentNewData.a(), baseDocumentComponentNewData.d(), baseDocumentComponentNewData.b());
                rVarH.v(baseDocumentData);
                objE = baseDocumentData;
            }
            p((BaseDocumentData) objE, aVar, rVarH, i16 & 112, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o20.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.s(baseDocumentComponentNewData, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(BaseDocumentComponentNewData baseDocumentComponentNewData, ty.a aVar, int i15, p076m2.r rVar, int i16) {
        r(baseDocumentComponentNewData, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void t(DocumentGiloshData documentGiloshData, p076m2.r rVar, final int i15) {
        int i16;
        final DocumentGiloshData documentGiloshData2;
        String str;
        p076m2.r rVarH = rVar.h(-1605929438);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(documentGiloshData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1605929438, i16, -1, "pl.gov.coi.common.ui.document.component.DocumentCardContentNew (BaseDocumentComponent.kt:59)");
            }
            String testTag = documentGiloshData.getTestTag();
            if (testTag != null) {
                str = testTag + "TimerText";
            } else {
                str = null;
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            int iA = b5.j.INSTANCE.a();
            Label label = (Label) m7.b.c(documentGiloshData.getDocumentVMS().a(), null, null, null, rVarH, 0, 7).getValue();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(mVarH, str, label, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).f(), null, null, false, false, null, rVarH, 6, 0, 0, 33026008);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.t(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            documentGiloshData2 = documentGiloshData;
            p2.E(documentGiloshData2, rVarH, i16 & 14);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            documentGiloshData2 = documentGiloshData;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o20.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.u(documentGiloshData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(DocumentGiloshData documentGiloshData, int i15, p076m2.r rVar, int i16) {
        t(documentGiloshData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}

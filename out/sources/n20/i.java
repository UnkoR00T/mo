package n20;

import androidx.compose.ui.graphics.Color;
import b30.AccordionData;
import b30.AccordionElement;
import d1.a3;
import d1.e0;
import d1.m3;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import er.q;
import f3.m;
import f40.LabelButtonImageSingleCardData;
import h30.ButtonData;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.h0;
import n50.x0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.c2;
import p046f2.x1;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;
import w0.f3;
import w0.u2;
import w20.BaseDocumentScreenState;
import w20.DocumentGiloshData;
import y30.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0013\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lf3/m;", "modifier", "Lw20/f;", "data", "Lw20/a;", "screenData", "", "scrollToTop", "Lkotlin/Function0;", "Loq/i0;", "onUpwardSlide", "alternativeDocumentContent", "j", "(Lf3/m;Lw20/f;Lw20/a;ZLer/a;Ler/p;Lm2/r;II)V", "Lw20/f$a;", "m", "(Lw20/f$a;Lw20/a;Lm2/r;I)V", "", "Lw20/b;", "g", "(Ljava/util/List;Lm2/r;I)V", "o", "(Lm2/r;I)V", "Lc5/h;", "a", "F", "CARD_MINIMUM_HEIGHT", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f130760a = c5.h.n(80);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f130761a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-224228044);
            if (t.k()) {
                t.o(-224228044, i15, -1, "pl.gov.coi.common.ui.document.AdditionalData.<anonymous>.<anonymous> (BaseDocumentScreen.kt:207)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f130762a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(861725248);
            if (t.k()) {
                t.o(861725248, i15, -1, "pl.gov.coi.common.ui.document.AdditionalData.<anonymous>.<anonymous> (BaseDocumentScreen.kt:293)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f130763a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(242768265);
            if (t.k()) {
                t.o(242768265, i15, -1, "pl.gov.coi.common.ui.document.AdditionalData.<anonymous>.<anonymous> (BaseDocumentScreen.kt:300)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f130764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f130765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p0 f130766g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f3 f130767h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f130768j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f130769e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ f3 f130770f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.a<i0> f130771g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f3 f3Var, er.a<i0> aVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f130770f = f3Var;
                this.f130771g = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f130769e;
                if (i15 == 0) {
                    u.b(obj);
                    f3 f3Var = this.f130770f;
                    this.f130769e = 1;
                    if (f3Var.v(0, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                this.f130771g.a();
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f130770f, this.f130771g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z15, p0 p0Var, f3 f3Var, er.a<i0> aVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f130765f = z15;
            this.f130766g = p0Var;
            this.f130767h = f3Var;
            this.f130768j = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f130764e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (this.f130765f) {
                ju.k.d(this.f130766g, null, null, new a(this.f130767h, this.f130768j, null), 3, null);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f130765f, this.f130766g, this.f130767h, this.f130768j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130772a;

        static {
            int[] iArr = new int[n.Switch.EnumC5973b.values().length];
            try {
                iArr[n.Switch.EnumC5973b.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f130772a = iArr;
        }
    }

    private static final void g(final List<? extends w20.b> list, r rVar, final int i15) {
        int i16;
        int i17;
        int i18;
        boolean z15;
        x0.Button button;
        r rVarH = rVar.h(750177042);
        int i19 = 2;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(list) ? 4 : 2);
        } else {
            i16 = i15;
        }
        boolean z16 = true;
        int i25 = 0;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(750177042, i16, -1, "pl.gov.coi.common.ui.document.AdditionalData (BaseDocumentScreen.kt:180)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final w20.b bVar = (w20.b) it.next();
                if (bVar instanceof w20.b.Expandable) {
                    rVarH.X(-532900636);
                    w20.b.Expandable expandable = (w20.b.Expandable) bVar;
                    b30.j.g(new AccordionData(v.e(new AccordionElement(null, expandable.getTitle(), null, false, null, false, new q20.b(expandable.getCardListData()), 29, null))), rVarH, AccordionData.f16343b);
                    rVarH.R();
                } else if (bVar instanceof w20.b.a) {
                    rVarH.X(-532888034);
                    h0.v(((w20.b.a) bVar).a(), null, rVarH, i25, i19);
                    rVarH.R();
                } else if (bVar instanceof w20.b.g) {
                    rVarH.X(-532883245);
                    w20.b.g gVar = (w20.b.g) bVar;
                    h0.v(new DefaultSingleCardData(null, gVar.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(gVar.b(), null, null, 3, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(gVar.a(), null, a.f130761a, null, null, 26, null), 3, null), x0.Icon.INSTANCE.b(), null, 2301, null), null, rVarH, i25, i19);
                    rVarH.R();
                } else {
                    if (bVar instanceof w20.b.h) {
                        rVarH.X(661175985);
                        w20.b.h hVar = (w20.b.h) bVar;
                        h0.v(new CustomSingleCardData("BaseDocumentImageButtonSingleCard", new f40.b(new LabelButtonImageSingleCardData(null, new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(hVar.a(), null, i19, null), k30.d.a.f107773a, null, hVar.c(), 35, null), new n50.i.Image(hVar.b(), null, null, 6, null), 1, null)), null, false, null, null, false, null, 252, null), null, rVarH, CustomSingleCardData.f131996i, i19);
                        rVarH.R();
                    } else {
                        if (bVar instanceof w20.b.Section) {
                            rVarH.X(661961959);
                            w20.b.Section section = (w20.b.Section) bVar;
                            if (fr.t.c(section.getLabel(), Label.INSTANCE.c())) {
                                i17 = i25;
                                rVarH.X(653080645);
                            } else {
                                rVarH.X(662006630);
                                Label label = section.getLabel();
                                k70.a aVar = k70.a.f108864a;
                                int i26 = k70.a.f108865b;
                                r rVar2 = rVarH;
                                i17 = i25;
                                j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i26).p(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
                                rVarH = rVar2;
                                if (section.b().isEmpty()) {
                                    rVarH.X(653080645);
                                } else {
                                    rVarH.X(662186027);
                                    r3.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, aVar.b(rVarH, i26).getSpacing150()), rVarH, i17);
                                }
                                rVarH.R();
                            }
                            rVarH.R();
                            m30.i.d(new CardListData(section.b(), null, false, null, null, 30, null), null, null, rVarH, 0, 6);
                            rVarH.R();
                            i18 = 2;
                        } else {
                            it = it;
                            i17 = i25;
                            if (bVar instanceof w20.b.i) {
                                rVarH.X(-532818062);
                                w20.b.i iVar = (w20.b.i) bVar;
                                BodySection bodySection = new BodySection(n50.l.b(iVar.a(), null, null, 3, null), new n50.b.Title(n50.l.b(iVar.b(), null, null, 3, null)), null, 4, null);
                                Label labelD = iVar.d();
                                if (labelD != null) {
                                    button = new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(labelD, iVar.e()), k30.d.a.f107773a, null, iVar.c(), 35, null));
                                } else {
                                    button = null;
                                }
                                i18 = 2;
                                h0.v(new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, button, null, 2815, null), null, rVarH, i17, 2);
                                rVarH.R();
                            } else {
                                i18 = 2;
                                if (bVar instanceof w20.b.DeleteItem) {
                                    rVarH.X(-532787152);
                                    w20.b.DeleteItem deleteItem = (w20.b.DeleteItem) bVar;
                                    h0.v(new DefaultSingleCardData(null, deleteItem.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(deleteItem.getLabel(), null, c.f130763a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106727a, null, b.f130762a, null, null, 26, null), 3, null), null, null, 3325, null), null, rVarH, i17, 2);
                                    rVarH.R();
                                } else if (bVar instanceof w20.b.InfoItem) {
                                    rVarH.X(664201957);
                                    z15 = true;
                                    m mVarB = androidx.compose.foundation.layout.d.b(m.INSTANCE, 0.0f, f130760a, 1, null);
                                    y1 y1Var = y1.f58315a;
                                    int i27 = y1.f58316b;
                                    x1 x1VarA = y1Var.a(rVarH, i27);
                                    k70.a aVar2 = k70.a.f108864a;
                                    int i28 = k70.a.f108865b;
                                    r rVar3 = rVarH;
                                    c2.c(mVarB, l1.h.f(aVar2.b(rVarH, i28).getSpacing150()), x1.d(x1VarA, aVar2.a(rVarH, i28).getSupport().i(), 0L, 0L, 0L, 14, null), y1Var.c(aVar2.c(rVarH, i28).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVar3, i27 << 18, 62), null, y2.m.d(1471132752, true, new q() { // from class: n20.g
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return i.h(bVar, (d1.h0) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVar3, 54), rVar3, 196614, 16);
                                    rVarH = rVar3;
                                    rVarH.R();
                                } else {
                                    z15 = true;
                                    if (bVar instanceof w20.b.f) {
                                        rVarH.X(664776449);
                                        h70.g.f(((w20.b.f) bVar).a(), rVarH, i17);
                                        r3.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, i17);
                                    } else {
                                        rVarH.X(653080645);
                                    }
                                    rVarH.R();
                                }
                            }
                        }
                        z15 = true;
                    }
                    r3.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i17);
                    it = it;
                    i19 = i18;
                    i25 = i17;
                    z16 = z15;
                }
                it = it;
                i18 = i19;
                z15 = z16;
                i17 = i25;
                r3.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i17);
                it = it;
                i19 = i18;
                i25 = i17;
                z16 = z15;
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n20.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(list, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(w20.b bVar, d1.h0 h0Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1471132752, i15, -1, "pl.gov.coi.common.ui.document.AdditionalData.<anonymous>.<anonymous> (BaseDocumentScreen.kt:318)");
            }
            c30.e.c(null, new c30.b.c(null, null, null, ((w20.b.InfoItem) bVar).getLabel(), null, null, null, 119, null), rVar, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(List list, int i15, r rVar, int i16) {
        g(list, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:116:0x0244  */
    /* JADX WARN: Code duplicated, block: B:119:0x0250  */
    /* JADX WARN: Code duplicated, block: B:120:0x0254  */
    /* JADX WARN: Code duplicated, block: B:124:0x0296  */
    /* JADX WARN: Code duplicated, block: B:125:0x029b  */
    /* JADX WARN: Code duplicated, block: B:127:0x029e  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:134:0x031e  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:138:0x032e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0370  */
    /* JADX WARN: Code duplicated, block: B:144:0x0383  */
    /* JADX WARN: Code duplicated, block: B:146:0x038c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0398  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x0159  */
    /* JADX WARN: Code duplicated, block: B:95:0x0165  */
    /* JADX WARN: Code duplicated, block: B:96:0x0169  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3  */
    @oq.a
    public static final void j(m mVar, final w20.f fVar, final BaseDocumentScreenState baseDocumentScreenState, boolean z15, er.a<i0> aVar, p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        boolean z16;
        int i18;
        er.a<i0> aVar2;
        int i19;
        int i25;
        p<? super r, ? super Integer, i0> pVarB;
        int i26;
        boolean z17;
        m mVar3;
        final p<? super r, ? super Integer, i0> pVar2;
        final er.a<i0> aVar3;
        d5 d5VarM;
        boolean z18;
        er.a<i0> aVar4;
        Object objE;
        r.Companion companion;
        p0 p0Var;
        f3 f3VarB;
        d1.i iVar;
        f3.c.Companion companion2;
        androidx.compose.ui.node.c.Companion companion3;
        er.a<androidx.compose.ui.node.c> aVarB;
        boolean z19;
        boolean z25;
        boolean z26;
        Object objE2;
        w20.f.Data data;
        n.Switch controllersData;
        er.a<androidx.compose.ui.node.c> aVarB2;
        n.Switch controllersData2;
        n.Switch.EnumC5973b selectedItemType;
        int i27;
        er.a<androidx.compose.ui.node.c> aVarB3;
        Object objE3;
        r rVarH = rVar.h(-677866647);
        int i28 = i16 & 1;
        if (i28 != 0) {
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
            i17 |= (i15 & 64) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(baseDocumentScreenState) ? 256 : 128;
        }
        int i29 = i16 & 8;
        if (i29 == 0) {
            if ((i15 & 3072) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 2048 : 1024;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    aVar2 = aVar;
                    if (rVarH.G(aVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 32;
                if (i25 != 0) {
                    i17 |= 196608;
                    pVarB = pVar;
                } else {
                    pVarB = pVar;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.G(pVarB)) {
                            i26 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i26 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i26;
                    }
                }
                if ((i17 & 74899) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i28 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (i18 != 0) {
                        objE3 = rVarH.E();
                        if (objE3 == r.INSTANCE.a()) {
                            objE3 = new er.a() { // from class: n20.c
                                @Override // er.a
                                public final Object a() {
                                    return i.k();
                                }
                            };
                            rVarH.v(objE3);
                        }
                        aVar4 = (er.a) objE3;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i25 != 0) {
                        pVarB = l.f130773a.b();
                    }
                    if (t.k()) {
                        t.o(-677866647, i17, -1, "pl.gov.coi.common.ui.document.BaseDocumentContent (BaseDocumentScreen.kt:83)");
                    }
                    if (fVar instanceof w20.f.Data) {
                        rVarH.X(611278205);
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE);
                        }
                        p0Var = (p0) objE;
                        f3VarB = u2.b(0, rVarH, 0, 1);
                        m mVarF = androidx.compose.foundation.layout.d.f(mVar3, 0.0f, 1, null);
                        iVar = d1.i.f39152a;
                        d1.i.n nVarK = iVar.k();
                        companion2 = f3.c.INSTANCE;
                        w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
                        int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        p076m2.e0 e0VarT = rVarH.t();
                        m mVarE = f3.j.e(rVarH, mVarF);
                        companion3 = androidx.compose.ui.node.c.INSTANCE;
                        aVarB = companion3.b();
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
                        n6.i(rVarC, w0VarA, companion3.d());
                        n6.i(rVarC, e0VarT, companion3.f());
                        n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                        n6.g(rVarC, companion3.a());
                        n6.i(rVarC, mVarE, companion3.e());
                        d1.i0 i0Var = d1.i0.f39176a;
                        Boolean boolValueOf = Boolean.valueOf(z18);
                        if ((i17 & 7168) == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean zG = z19 | rVarH.G(p0Var) | rVarH.W(f3VarB);
                        if ((57344 & i17) == 16384) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = zG | z25;
                        objE2 = rVarH.E();
                        if (z26 || objE2 == companion.a()) {
                            objE2 = new d(z18, p0Var, f3VarB, aVar4, null);
                            rVarH.v(objE2);
                        }
                        Function0.d(boolValueOf, (p) objE2, rVarH, (i17 >> 9) & 14);
                        data = (w20.f.Data) fVar;
                        controllersData = data.getControllersData();
                        if (controllersData == null) {
                            rVarH.X(-242163902);
                        } else {
                            rVarH.X(-242163901);
                            m.Companion companion4 = m.INSTANCE;
                            k70.a aVar5 = k70.a.f108864a;
                            int i35 = k70.a.f108865b;
                            m mVarP = a3.p(a3.p(companion4, 0.0f, aVar5.b(rVarH, i35).getSpacing100(), 1, null), aVar5.b(rVarH, i35).getSpacing200(), 0.0f, 2, null);
                            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVarH, 0);
                            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                            p076m2.e0 e0VarT2 = rVarH.t();
                            m mVarE2 = f3.j.e(rVarH, mVarP);
                            aVarB2 = companion3.b();
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
                            n6.i(rVarC2, w0VarB, companion3.d());
                            n6.i(rVarC2, e0VarT2, companion3.f());
                            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                            n6.g(rVarC2, companion3.a());
                            n6.i(rVarC2, mVarE2, companion3.e());
                            q3 q3Var = q3.f39261a;
                            y30.m.g(controllersData, rVarH, n.Switch.f223693f);
                            rVarH.x();
                            i0 i0Var2 = i0.f148189a;
                        }
                        rVarH.R();
                        controllersData2 = data.getControllersData();
                        if (controllersData2 != null) {
                            selectedItemType = controllersData2.getSelectedItemType();
                        } else {
                            selectedItemType = null;
                        }
                        if (selectedItemType == null) {
                            i27 = -1;
                        } else {
                            i27 = e.f130772a[selectedItemType.ordinal()];
                        }
                        if (i27 == 1) {
                            rVarH.X(1931863319);
                            pVarB.B(rVarH, Integer.valueOf((i17 >> 15) & 14));
                            rVarH.R();
                        } else {
                            rVarH.X(1931865591);
                            m mVarS = t70.i.S(m.INSTANCE, null, rVarH, 6, 1);
                            k70.a aVar6 = k70.a.f108864a;
                            int i36 = k70.a.f108865b;
                            m mVarR = a3.r(mVarS, aVar6.b(rVarH, i36).getSpacing200(), aVar6.b(rVarH, i36).getSpacing100(), aVar6.b(rVarH, i36).getSpacing200(), 0.0f, 8, null);
                            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
                            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                            p076m2.e0 e0VarT3 = rVarH.t();
                            m mVarE3 = f3.j.e(rVarH, mVarR);
                            aVarB3 = companion3.b();
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
                            n6.i(rVarC3, w0VarA2, companion3.d());
                            n6.i(rVarC3, e0VarT3, companion3.f());
                            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                            n6.g(rVarC3, companion3.a());
                            n6.i(rVarC3, mVarE3, companion3.e());
                            m(data, baseDocumentScreenState, rVarH, (i17 >> 3) & 126);
                            rVarH.x();
                            rVarH.R();
                        }
                        rVarH.x();
                        rVarH.R();
                    } else {
                        rVarH.X(1405232978);
                        o(rVarH, 0);
                        rVarH.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    pVar2 = pVarB;
                    z16 = z18;
                    aVar3 = aVar4;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    pVar2 = pVarB;
                    aVar3 = aVar2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final m mVar4 = mVar3;
                    final boolean z27 = z16;
                    d5VarM.a(new p() { // from class: n20.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.l(mVar4, fVar, baseDocumentScreenState, z27, aVar3, pVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            aVar2 = aVar;
            i25 = i16 & 32;
            if (i25 != 0) {
                i17 |= 196608;
                pVarB = pVar;
            } else {
                pVarB = pVar;
                if ((i15 & 196608) == 0) {
                    if (rVarH.G(pVarB)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
            }
            if ((i17 & 74899) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i28 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i29 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (i18 != 0) {
                    objE3 = rVarH.E();
                    if (objE3 == r.INSTANCE.a()) {
                        objE3 = new er.a() { // from class: n20.c
                            @Override // er.a
                            public final Object a() {
                                return i.k();
                            }
                        };
                        rVarH.v(objE3);
                    }
                    aVar4 = (er.a) objE3;
                } else {
                    aVar4 = aVar2;
                }
                if (i25 != 0) {
                    pVarB = l.f130773a.b();
                }
                if (t.k()) {
                    t.o(-677866647, i17, -1, "pl.gov.coi.common.ui.document.BaseDocumentContent (BaseDocumentScreen.kt:83)");
                }
                if (fVar instanceof w20.f.Data) {
                    rVarH.X(611278205);
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE);
                    }
                    p0Var = (p0) objE;
                    f3VarB = u2.b(0, rVarH, 0, 1);
                    m mVarF2 = androidx.compose.foundation.layout.d.f(mVar3, 0.0f, 1, null);
                    iVar = d1.i.f39152a;
                    d1.i.n nVarK2 = iVar.k();
                    companion2 = f3.c.INSTANCE;
                    w0 w0VarA3 = e0.a(nVarK2, companion2.k(), rVarH, 0);
                    int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT4 = rVarH.t();
                    m mVarE4 = f3.j.e(rVarH, mVarF2);
                    companion3 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion3.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC4 = n6.c(rVarH);
                    n6.i(rVarC4, w0VarA3, companion3.d());
                    n6.i(rVarC4, e0VarT4, companion3.f());
                    n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
                    n6.g(rVarC4, companion3.a());
                    n6.i(rVarC4, mVarE4, companion3.e());
                    d1.i0 i0Var3 = d1.i0.f39176a;
                    Boolean boolValueOf2 = Boolean.valueOf(z18);
                    if ((i17 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean zG2 = z19 | rVarH.G(p0Var) | rVarH.W(f3VarB);
                    if ((57344 & i17) == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zG2 | z25;
                    objE2 = rVarH.E();
                    if (z26) {
                        objE2 = new d(z18, p0Var, f3VarB, aVar4, null);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new d(z18, p0Var, f3VarB, aVar4, null);
                        rVarH.v(objE2);
                    }
                    Function0.d(boolValueOf2, (p) objE2, rVarH, (i17 >> 9) & 14);
                    data = (w20.f.Data) fVar;
                    controllersData = data.getControllersData();
                    if (controllersData == null) {
                        rVarH.X(-242163902);
                    } else {
                        rVarH.X(-242163901);
                        m.Companion companion5 = m.INSTANCE;
                        k70.a aVar7 = k70.a.f108864a;
                        int i37 = k70.a.f108865b;
                        m mVarP2 = a3.p(a3.p(companion5, 0.0f, aVar7.b(rVarH, i37).getSpacing100(), 1, null), aVar7.b(rVarH, i37).getSpacing200(), 0.0f, 2, null);
                        w0 w0VarB2 = m3.b(iVar.j(), companion2.l(), rVarH, 0);
                        int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                        p076m2.e0 e0VarT5 = rVarH.t();
                        m mVarE5 = f3.j.e(rVarH, mVarP2);
                        aVarB2 = companion3.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB2);
                        } else {
                            rVarH.u();
                        }
                        r rVarC5 = n6.c(rVarH);
                        n6.i(rVarC5, w0VarB2, companion3.d());
                        n6.i(rVarC5, e0VarT5, companion3.f());
                        n6.i(rVarC5, Integer.valueOf(iHashCode5), companion3.c());
                        n6.g(rVarC5, companion3.a());
                        n6.i(rVarC5, mVarE5, companion3.e());
                        q3 q3Var2 = q3.f39261a;
                        y30.m.g(controllersData, rVarH, n.Switch.f223693f);
                        rVarH.x();
                        i0 i0Var4 = i0.f148189a;
                    }
                    rVarH.R();
                    controllersData2 = data.getControllersData();
                    if (controllersData2 != null) {
                        selectedItemType = controllersData2.getSelectedItemType();
                    } else {
                        selectedItemType = null;
                    }
                    if (selectedItemType == null) {
                        i27 = -1;
                    } else {
                        i27 = e.f130772a[selectedItemType.ordinal()];
                    }
                    if (i27 == 1) {
                        rVarH.X(1931863319);
                        pVarB.B(rVarH, Integer.valueOf((i17 >> 15) & 14));
                        rVarH.R();
                    } else {
                        rVarH.X(1931865591);
                        m mVarS2 = t70.i.S(m.INSTANCE, null, rVarH, 6, 1);
                        k70.a aVar8 = k70.a.f108864a;
                        int i38 = k70.a.f108865b;
                        m mVarR2 = a3.r(mVarS2, aVar8.b(rVarH, i38).getSpacing200(), aVar8.b(rVarH, i38).getSpacing100(), aVar8.b(rVarH, i38).getSpacing200(), 0.0f, 8, null);
                        w0 w0VarA4 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
                        int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                        p076m2.e0 e0VarT6 = rVarH.t();
                        m mVarE6 = f3.j.e(rVarH, mVarR2);
                        aVarB3 = companion3.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB3);
                        } else {
                            rVarH.u();
                        }
                        r rVarC6 = n6.c(rVarH);
                        n6.i(rVarC6, w0VarA4, companion3.d());
                        n6.i(rVarC6, e0VarT6, companion3.f());
                        n6.i(rVarC6, Integer.valueOf(iHashCode6), companion3.c());
                        n6.g(rVarC6, companion3.a());
                        n6.i(rVarC6, mVarE6, companion3.e());
                        m(data, baseDocumentScreenState, rVarH, (i17 >> 3) & 126);
                        rVarH.x();
                        rVarH.R();
                    }
                    rVarH.x();
                    rVarH.R();
                } else {
                    rVarH.X(1405232978);
                    o(rVarH, 0);
                    rVarH.R();
                }
                if (t.k()) {
                    t.n();
                }
                pVar2 = pVarB;
                z16 = z18;
                aVar3 = aVar4;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                pVar2 = pVarB;
                aVar3 = aVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar5 = mVar3;
                final boolean z28 = z16;
                d5VarM.a(new p() { // from class: n20.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.l(mVar5, fVar, baseDocumentScreenState, z28, aVar3, pVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        z16 = z15;
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                aVar2 = aVar;
                if (rVarH.G(aVar2)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                i17 |= 196608;
                pVarB = pVar;
            } else {
                pVarB = pVar;
                if ((i15 & 196608) == 0) {
                    if (rVarH.G(pVarB)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
            }
            if ((i17 & 74899) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i28 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i29 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (i18 != 0) {
                    objE3 = rVarH.E();
                    if (objE3 == r.INSTANCE.a()) {
                        objE3 = new er.a() { // from class: n20.c
                            @Override // er.a
                            public final Object a() {
                                return i.k();
                            }
                        };
                        rVarH.v(objE3);
                    }
                    aVar4 = (er.a) objE3;
                } else {
                    aVar4 = aVar2;
                }
                if (i25 != 0) {
                    pVarB = l.f130773a.b();
                }
                if (t.k()) {
                    t.o(-677866647, i17, -1, "pl.gov.coi.common.ui.document.BaseDocumentContent (BaseDocumentScreen.kt:83)");
                }
                if (fVar instanceof w20.f.Data) {
                    rVarH.X(611278205);
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE);
                    }
                    p0Var = (p0) objE;
                    f3VarB = u2.b(0, rVarH, 0, 1);
                    m mVarF3 = androidx.compose.foundation.layout.d.f(mVar3, 0.0f, 1, null);
                    iVar = d1.i.f39152a;
                    d1.i.n nVarK3 = iVar.k();
                    companion2 = f3.c.INSTANCE;
                    w0 w0VarA5 = e0.a(nVarK3, companion2.k(), rVarH, 0);
                    int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT7 = rVarH.t();
                    m mVarE7 = f3.j.e(rVarH, mVarF3);
                    companion3 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion3.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC7 = n6.c(rVarH);
                    n6.i(rVarC7, w0VarA5, companion3.d());
                    n6.i(rVarC7, e0VarT7, companion3.f());
                    n6.i(rVarC7, Integer.valueOf(iHashCode7), companion3.c());
                    n6.g(rVarC7, companion3.a());
                    n6.i(rVarC7, mVarE7, companion3.e());
                    d1.i0 i0Var5 = d1.i0.f39176a;
                    Boolean boolValueOf3 = Boolean.valueOf(z18);
                    if ((i17 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean zG3 = z19 | rVarH.G(p0Var) | rVarH.W(f3VarB);
                    if ((57344 & i17) == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zG3 | z25;
                    objE2 = rVarH.E();
                    if (z26) {
                        objE2 = new d(z18, p0Var, f3VarB, aVar4, null);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new d(z18, p0Var, f3VarB, aVar4, null);
                        rVarH.v(objE2);
                    }
                    Function0.d(boolValueOf3, (p) objE2, rVarH, (i17 >> 9) & 14);
                    data = (w20.f.Data) fVar;
                    controllersData = data.getControllersData();
                    if (controllersData == null) {
                        rVarH.X(-242163902);
                    } else {
                        rVarH.X(-242163901);
                        m.Companion companion6 = m.INSTANCE;
                        k70.a aVar9 = k70.a.f108864a;
                        int i39 = k70.a.f108865b;
                        m mVarP3 = a3.p(a3.p(companion6, 0.0f, aVar9.b(rVarH, i39).getSpacing100(), 1, null), aVar9.b(rVarH, i39).getSpacing200(), 0.0f, 2, null);
                        w0 w0VarB3 = m3.b(iVar.j(), companion2.l(), rVarH, 0);
                        int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
                        p076m2.e0 e0VarT8 = rVarH.t();
                        m mVarE8 = f3.j.e(rVarH, mVarP3);
                        aVarB2 = companion3.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB2);
                        } else {
                            rVarH.u();
                        }
                        r rVarC8 = n6.c(rVarH);
                        n6.i(rVarC8, w0VarB3, companion3.d());
                        n6.i(rVarC8, e0VarT8, companion3.f());
                        n6.i(rVarC8, Integer.valueOf(iHashCode8), companion3.c());
                        n6.g(rVarC8, companion3.a());
                        n6.i(rVarC8, mVarE8, companion3.e());
                        q3 q3Var3 = q3.f39261a;
                        y30.m.g(controllersData, rVarH, n.Switch.f223693f);
                        rVarH.x();
                        i0 i0Var6 = i0.f148189a;
                    }
                    rVarH.R();
                    controllersData2 = data.getControllersData();
                    if (controllersData2 != null) {
                        selectedItemType = controllersData2.getSelectedItemType();
                    } else {
                        selectedItemType = null;
                    }
                    if (selectedItemType == null) {
                        i27 = -1;
                    } else {
                        i27 = e.f130772a[selectedItemType.ordinal()];
                    }
                    if (i27 == 1) {
                        rVarH.X(1931863319);
                        pVarB.B(rVarH, Integer.valueOf((i17 >> 15) & 14));
                        rVarH.R();
                    } else {
                        rVarH.X(1931865591);
                        m mVarS3 = t70.i.S(m.INSTANCE, null, rVarH, 6, 1);
                        k70.a aVar10 = k70.a.f108864a;
                        int i310 = k70.a.f108865b;
                        m mVarR3 = a3.r(mVarS3, aVar10.b(rVarH, i310).getSpacing200(), aVar10.b(rVarH, i310).getSpacing100(), aVar10.b(rVarH, i310).getSpacing200(), 0.0f, 8, null);
                        w0 w0VarA6 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
                        int iHashCode9 = Long.hashCode(p076m2.m.b(rVarH, 0));
                        p076m2.e0 e0VarT9 = rVarH.t();
                        m mVarE9 = f3.j.e(rVarH, mVarR3);
                        aVarB3 = companion3.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB3);
                        } else {
                            rVarH.u();
                        }
                        r rVarC9 = n6.c(rVarH);
                        n6.i(rVarC9, w0VarA6, companion3.d());
                        n6.i(rVarC9, e0VarT9, companion3.f());
                        n6.i(rVarC9, Integer.valueOf(iHashCode9), companion3.c());
                        n6.g(rVarC9, companion3.a());
                        n6.i(rVarC9, mVarE9, companion3.e());
                        m(data, baseDocumentScreenState, rVarH, (i17 >> 3) & 126);
                        rVarH.x();
                        rVarH.R();
                    }
                    rVarH.x();
                    rVarH.R();
                } else {
                    rVarH.X(1405232978);
                    o(rVarH, 0);
                    rVarH.R();
                }
                if (t.k()) {
                    t.n();
                }
                pVar2 = pVarB;
                z16 = z18;
                aVar3 = aVar4;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                pVar2 = pVarB;
                aVar3 = aVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar6 = mVar3;
                final boolean z29 = z16;
                d5VarM.a(new p() { // from class: n20.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.l(mVar6, fVar, baseDocumentScreenState, z29, aVar3, pVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        aVar2 = aVar;
        i25 = i16 & 32;
        if (i25 != 0) {
            i17 |= 196608;
            pVarB = pVar;
        } else {
            pVarB = pVar;
            if ((i15 & 196608) == 0) {
                if (rVarH.G(pVarB)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
        }
        if ((i17 & 74899) != 74898) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i28 != 0) {
                mVar3 = m.INSTANCE;
            } else {
                mVar3 = mVar2;
            }
            if (i29 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (i18 != 0) {
                objE3 = rVarH.E();
                if (objE3 == r.INSTANCE.a()) {
                    objE3 = new er.a() { // from class: n20.c
                        @Override // er.a
                        public final Object a() {
                            return i.k();
                        }
                    };
                    rVarH.v(objE3);
                }
                aVar4 = (er.a) objE3;
            } else {
                aVar4 = aVar2;
            }
            if (i25 != 0) {
                pVarB = l.f130773a.b();
            }
            if (t.k()) {
                t.o(-677866647, i17, -1, "pl.gov.coi.common.ui.document.BaseDocumentContent (BaseDocumentScreen.kt:83)");
            }
            if (fVar instanceof w20.f.Data) {
                rVarH.X(611278205);
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                p0Var = (p0) objE;
                f3VarB = u2.b(0, rVarH, 0, 1);
                m mVarF4 = androidx.compose.foundation.layout.d.f(mVar3, 0.0f, 1, null);
                iVar = d1.i.f39152a;
                d1.i.n nVarK4 = iVar.k();
                companion2 = f3.c.INSTANCE;
                w0 w0VarA7 = e0.a(nVarK4, companion2.k(), rVarH, 0);
                int iHashCode10 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT10 = rVarH.t();
                m mVarE10 = f3.j.e(rVarH, mVarF4);
                companion3 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC10 = n6.c(rVarH);
                n6.i(rVarC10, w0VarA7, companion3.d());
                n6.i(rVarC10, e0VarT10, companion3.f());
                n6.i(rVarC10, Integer.valueOf(iHashCode10), companion3.c());
                n6.g(rVarC10, companion3.a());
                n6.i(rVarC10, mVarE10, companion3.e());
                d1.i0 i0Var7 = d1.i0.f39176a;
                Boolean boolValueOf4 = Boolean.valueOf(z18);
                if ((i17 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean zG4 = z19 | rVarH.G(p0Var) | rVarH.W(f3VarB);
                if ((57344 & i17) == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = zG4 | z25;
                objE2 = rVarH.E();
                if (z26) {
                    objE2 = new d(z18, p0Var, f3VarB, aVar4, null);
                    rVarH.v(objE2);
                } else {
                    objE2 = new d(z18, p0Var, f3VarB, aVar4, null);
                    rVarH.v(objE2);
                }
                Function0.d(boolValueOf4, (p) objE2, rVarH, (i17 >> 9) & 14);
                data = (w20.f.Data) fVar;
                controllersData = data.getControllersData();
                if (controllersData == null) {
                    rVarH.X(-242163902);
                } else {
                    rVarH.X(-242163901);
                    m.Companion companion7 = m.INSTANCE;
                    k70.a aVar11 = k70.a.f108864a;
                    int i311 = k70.a.f108865b;
                    m mVarP4 = a3.p(a3.p(companion7, 0.0f, aVar11.b(rVarH, i311).getSpacing100(), 1, null), aVar11.b(rVarH, i311).getSpacing200(), 0.0f, 2, null);
                    w0 w0VarB4 = m3.b(iVar.j(), companion2.l(), rVarH, 0);
                    int iHashCode11 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT11 = rVarH.t();
                    m mVarE11 = f3.j.e(rVarH, mVarP4);
                    aVarB2 = companion3.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB2);
                    } else {
                        rVarH.u();
                    }
                    r rVarC11 = n6.c(rVarH);
                    n6.i(rVarC11, w0VarB4, companion3.d());
                    n6.i(rVarC11, e0VarT11, companion3.f());
                    n6.i(rVarC11, Integer.valueOf(iHashCode11), companion3.c());
                    n6.g(rVarC11, companion3.a());
                    n6.i(rVarC11, mVarE11, companion3.e());
                    q3 q3Var4 = q3.f39261a;
                    y30.m.g(controllersData, rVarH, n.Switch.f223693f);
                    rVarH.x();
                    i0 i0Var8 = i0.f148189a;
                }
                rVarH.R();
                controllersData2 = data.getControllersData();
                if (controllersData2 != null) {
                    selectedItemType = controllersData2.getSelectedItemType();
                } else {
                    selectedItemType = null;
                }
                if (selectedItemType == null) {
                    i27 = -1;
                } else {
                    i27 = e.f130772a[selectedItemType.ordinal()];
                }
                if (i27 == 1) {
                    rVarH.X(1931863319);
                    pVarB.B(rVarH, Integer.valueOf((i17 >> 15) & 14));
                    rVarH.R();
                } else {
                    rVarH.X(1931865591);
                    m mVarS4 = t70.i.S(m.INSTANCE, null, rVarH, 6, 1);
                    k70.a aVar12 = k70.a.f108864a;
                    int i312 = k70.a.f108865b;
                    m mVarR4 = a3.r(mVarS4, aVar12.b(rVarH, i312).getSpacing200(), aVar12.b(rVarH, i312).getSpacing100(), aVar12.b(rVarH, i312).getSpacing200(), 0.0f, 8, null);
                    w0 w0VarA8 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
                    int iHashCode12 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT12 = rVarH.t();
                    m mVarE12 = f3.j.e(rVarH, mVarR4);
                    aVarB3 = companion3.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB3);
                    } else {
                        rVarH.u();
                    }
                    r rVarC12 = n6.c(rVarH);
                    n6.i(rVarC12, w0VarA8, companion3.d());
                    n6.i(rVarC12, e0VarT12, companion3.f());
                    n6.i(rVarC12, Integer.valueOf(iHashCode12), companion3.c());
                    n6.g(rVarC12, companion3.a());
                    n6.i(rVarC12, mVarE12, companion3.e());
                    m(data, baseDocumentScreenState, rVarH, (i17 >> 3) & 126);
                    rVarH.x();
                    rVarH.R();
                }
                rVarH.x();
                rVarH.R();
            } else {
                rVarH.X(1405232978);
                o(rVarH, 0);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
            pVar2 = pVarB;
            z16 = z18;
            aVar3 = aVar4;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            pVar2 = pVarB;
            aVar3 = aVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar7 = mVar3;
            final boolean z210 = z16;
            d5VarM.a(new p() { // from class: n20.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(mVar7, fVar, baseDocumentScreenState, z210, aVar3, pVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(m mVar, w20.f fVar, BaseDocumentScreenState baseDocumentScreenState, boolean z15, er.a aVar, p pVar, int i15, int i16, r rVar, int i17) {
        j(mVar, fVar, baseDocumentScreenState, z15, aVar, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void m(final w20.f.Data data, final BaseDocumentScreenState baseDocumentScreenState, r rVar, final int i15) {
        int i16;
        int i17;
        r rVar2;
        int i18;
        m mVar;
        r rVarH = rVar.h(1756104752);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(baseDocumentScreenState) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1756104752, i16, -1, "pl.gov.coi.common.ui.document.DefaultBaseDocumentContent (BaseDocumentScreen.kt:139)");
            }
            List<c30.b> listG = data.g();
            if (listG == null) {
                rVarH.X(-879838984);
            } else {
                rVarH.X(-879838983);
                Iterator<T> it = listG.iterator();
                while (it.hasNext()) {
                    c30.e.c(null, (c30.b) it.next(), rVarH, c30.b.f22944i << 3, 1);
                    r3.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
                }
            }
            rVarH.R();
            int i19 = i16;
            DocumentGiloshData giloshData = data.getGiloshData();
            if (giloshData == null) {
                rVarH.X(-879673258);
                rVarH.R();
                mVar = null;
                i18 = 0;
            } else {
                rVarH.X(-879673257);
                Label currentTime = baseDocumentScreenState.getCurrentTime();
                if (currentTime == null) {
                    rVarH.X(55911734);
                    rVarH.R();
                    rVar2 = rVarH;
                    i17 = 0;
                } else {
                    rVarH.X(55911735);
                    m.Companion companion = m.INSTANCE;
                    m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
                    int iA = b5.j.INSTANCE.a();
                    k70.a aVar = k70.a.f108864a;
                    int i25 = k70.a.f108865b;
                    i17 = 0;
                    j70.h.g(mVarH, null, currentTime, null, null, aVar.a(rVarH, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).f(), null, null, false, false, null, rVarH, 6, 0, 0, 33026010);
                    rVar2 = rVarH;
                    r3.a(androidx.compose.foundation.layout.d.t(companion, aVar.b(rVar2, i25).getSpacing200()), rVar2, 0);
                    rVar2.R();
                }
                data.d();
                rVar2.X(56268358);
                rVar2.R();
                List<w20.b> listF = data.f();
                if (listF.isEmpty()) {
                    listF = null;
                }
                if (listF == null) {
                    rVar2.X(56516420);
                } else {
                    rVar2.X(56516421);
                    g(data.f(), rVar2, i17);
                    r3.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, i17);
                }
                rVar2.R();
                i18 = i17;
                rVarH = rVar2;
                mVar = null;
                u20.g.g(null, giloshData, baseDocumentScreenState, rVarH, (i19 << 3) & 896, 1);
                r3.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, i18);
                rVarH.R();
            }
            g(data.a(), rVarH, i18);
            List<c30.b.c> listB = data.b();
            if (listB == null) {
                rVarH.X(-878688264);
            } else {
                rVarH.X(-878688263);
                Iterator<T> it4 = listB.iterator();
                while (it4.hasNext()) {
                    c30.e.c(mVar, (c30.b.c) it4.next(), rVarH, i18, 1);
                    r3.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i18);
                }
            }
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n20.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.n(data, baseDocumentScreenState, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(w20.f.Data data, BaseDocumentScreenState baseDocumentScreenState, int i15, r rVar, int i16) {
        m(data, baseDocumentScreenState, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void o(r rVar, final int i15) {
        r rVarH = rVar.h(1357558725);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (t.k()) {
                t.o(1357558725, i15, -1, "pl.gov.coi.common.ui.document.Loading (BaseDocumentScreen.kt:335)");
            }
            m mVarD = w0.i.d(androidx.compose.foundation.layout.d.f(m.INSTANCE, 0.0f, 1, null), Color.m9copywmQWz5c$default(k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarD);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            x70.f.g(x70.a.C5796a.f217280c, rVarH, x70.a.C5796a.f217281d);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n20.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.p(i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(int i15, r rVar, int i16) {
        o(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}

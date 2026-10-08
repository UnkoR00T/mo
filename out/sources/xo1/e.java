package xo1;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.e0;
import d1.r3;
import e20.k;
import er.p;
import f3.m;
import fr.q;
import h30.ButtonData;
import i30.ButtonIconData;
import java.util.List;
import l60.KeyValueData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.h0;
import n50.x0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.n;
import pq.v;
import t70.s;
import w20.BaseDocumentScreenState;
import w20.DocumentGiloshData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxo1/f;", "viewModel", "", "enabledAnimations", "Loq/i0;", "d", "(Lxo1/f;ZLm2/r;II)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f220195a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1485342401);
            if (t.k()) {
                t.o(1485342401, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.document.DeveloperDocumentScreen.<anonymous>.<anonymous> (DeveloperDocumentScreen.kt:121)");
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
    static final /* synthetic */ class b extends q implements er.a<i0> {
        b(Object obj) {
            super(0, obj, f.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void E() {
            ((f) this.f66391b).d();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0156  */
    /* JADX WARN: Code duplicated, block: B:45:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0246  */
    /* JADX WARN: Code duplicated, block: B:51:0x0252  */
    /* JADX WARN: Code duplicated, block: B:52:0x0256  */
    /* JADX WARN: Code duplicated, block: B:61:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0365  */
    /* JADX WARN: Code duplicated, block: B:72:0x0371  */
    /* JADX WARN: Code duplicated, block: B:73:0x0375  */
    /* JADX WARN: Code duplicated, block: B:76:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:81:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void d(final f fVar, boolean z15, r rVar, final int i15, final int i16) {
        int i17;
        final boolean z16;
        boolean z17;
        d5 d5VarM;
        boolean z18;
        final Context context;
        boolean zG;
        Object objE;
        boolean zG2;
        Object objE2;
        er.a<androidx.compose.ui.node.c> aVarB;
        boolean z19;
        Object objE3;
        er.a<androidx.compose.ui.node.c> aVarB2;
        r rVarH = rVar.h(-40453368);
        if ((i15 & 6) == 0) {
            i17 = i15 | ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2);
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 == 0) {
            if ((i15 & 48) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i18 != 0) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                if (t.k()) {
                    t.o(-40453368, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.document.DeveloperDocumentScreen (DeveloperDocumentScreen.kt:47)");
                }
                context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                Bitmap bitmapB = y5.b.b(w5.h.e(context.getResources(), c20.b.f22715s, null), 0, 0, null, 7, null);
                List listQ = v.q(new KeyValueData(mx.b.b("Stanisław", ""), mx.b.b("Imię (imiona)", ""), false, 4, null), new KeyValueData(mx.b.b("Kowalski", ""), mx.b.b("Nazwisko", ""), false, 4, null), new KeyValueData(mx.b.b("Polskie", ""), mx.b.b("Obywatelstwo", ""), false, 4, null), new KeyValueData(mx.b.b("12.08.1986", ""), mx.b.b("Data urodzenia", ""), false, 4, null), new KeyValueData(mx.b.b("ACC 231122", ""), mx.b.b("Seria i numer", ""), false, 4, null));
                BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Potwierdź swoje dane", ""), null, null, 0, 0, null, 62, null)), null, 5, null);
                x0.Icon iconB = x0.Icon.INSTANCE.b();
                LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106785h1, null, null, null, null, 30, null), 3, null);
                zG = rVarH.G(context);
                objE = rVarH.E();
                if (zG || objE == r.INSTANCE.a()) {
                    objE = new er.a() { // from class: xo1.b
                        @Override // er.a
                        public final Object a() {
                            return e.e(context);
                        }
                    };
                    rVarH.v(objE);
                }
                DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, (er.a) objE, false, null, null, false, null, null, bodySection, leadingSection, iconB, null, 2301, null);
                BodySection bodySection2 = new BodySection(new SingleCardLabel(mx.b.b("Ostatnia aktualizacja", ""), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b("05.05.2023", ""), null, null, 0, 0, null, 62, null)), null, 4, null);
                k30.a.b bVar = k30.a.b.f107765a;
                k30.d.a aVar = k30.d.a.f107773a;
                k30.c.WithText withText = new k30.c.WithText(mx.b.b("Aktualizuj", ""), null, 2, null);
                zG2 = rVarH.G(context);
                objE2 = rVarH.E();
                if (zG2 || objE2 == r.INSTANCE.a()) {
                    objE2 = new er.a() { // from class: xo1.c
                        @Override // er.a
                        public final Object a() {
                            return e.f(context);
                        }
                    };
                    rVarH.v(objE2);
                }
                DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection2, null, new x0.Button(new ButtonData(null, null, bVar, withText, aVar, null, (er.a) objE2, 35, null)), null, 2815, null);
                m.Companion companion = m.INSTANCE;
                d1.i iVar = d1.i.f39152a;
                d1.i.n nVarK = iVar.k();
                f3.c.Companion companion2 = f3.c.INSTANCE;
                w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                m mVarE = f3.j.e(rVarH, companion);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
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
                Label labelB = mx.b.b("DocumentScreen", "");
                int i19 = jz.a.U;
                a aVar2 = a.f220195a;
                Label labelR = c70.a.f23835a.a().R();
                if ((i17 & 14) != 4 || ((i17 & 8) != 0 && rVarH.G(fVar))) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objE3 = rVarH.E();
                if (z19 || objE3 == r.INSTANCE.a()) {
                    objE3 = new b(fVar);
                    rVarH.v(objE3);
                }
                n.g(null, null, labelB, null, null, 0L, null, new ButtonIconData(null, i19, aVar2, null, labelR, (er.a) ((mr.g) objE3), 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
                f3.c.b bVarK = companion2.k();
                m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                k70.a aVar3 = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                m mVarS = t70.i.S(a3.r(w0.i.d(mVarF, aVar3.a(rVarH, i25).getBase().a(), null, 2, null), aVar3.b(rVarH, i25).getSpacing200(), 0.0f, aVar3.b(rVarH, i25).getSpacing200(), 0.0f, 10, null), null, rVarH, 0, 1);
                w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                m mVarE2 = f3.j.e(rVarH, mVarS);
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
                n6.i(rVarC2, w0VarA2, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i25).getSpacing300()), rVarH, 0);
                j70.h.g(null, null, mx.b.b("DocumentLogo - component", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i25).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i25).getSpacing200()), rVarH, 0);
                t20.c.c("Czmuchowska karta seniora", bitmapB, null, rVarH, 6, 4);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i25).getSpacing300()), rVarH, 0);
                j70.h.g(null, null, mx.b.b("DocumentCard - component", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i25).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i25).getSpacing200()), rVarH, 0);
                u20.g.g(null, new DocumentGiloshData(c20.b.f22645a, Integer.valueOf(c20.b.f22649b), null, null, mx.b.b("Zdjęcie\nniedostępne", ""), null, null, k.Poland, null, true, mx.b.b("Dokument ważny", ""), null, new DocumentGiloshData.a(listQ), null, z18, null, null, mx.b.b("Flaga Polski", ""), null, 371048, null), new BaseDocumentScreenState(null, mx.b.b("Rzeczpospolita\nPolska", ""), null, fVar.w(), 5, null), rVarH, (DocumentGiloshData.f209344t << 3) | (BaseDocumentScreenState.f209332e << 6), 1);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i25).getSpacing300()), rVarH, 0);
                j70.h.g(null, null, mx.b.b("BasicItem.Icon - component", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i25).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i25).getSpacing300()), rVarH, 0);
                h0.v(defaultSingleCardData, null, rVarH, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i25).getSpacing300()), rVarH, 0);
                j70.h.g(null, null, mx.b.b("BasicItem.ClickableButton - component", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i25).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                rVarH = rVarH;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i25).getSpacing300()), rVarH, 0);
                h0.v(defaultSingleCardData2, null, rVarH, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i25).getSpacing300()), rVarH, 0);
                rVarH.x();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                z16 = z18;
            } else {
                rVarH.O();
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: xo1.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.g(fVar, z16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        z16 = z15;
        if ((i17 & 19) != 18) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i18 != 0) {
                z18 = true;
            } else {
                z18 = z16;
            }
            if (t.k()) {
                t.o(-40453368, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.document.DeveloperDocumentScreen (DeveloperDocumentScreen.kt:47)");
            }
            context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            Bitmap bitmapB2 = y5.b.b(w5.h.e(context.getResources(), c20.b.f22715s, null), 0, 0, null, 7, null);
            List listQ2 = v.q(new KeyValueData(mx.b.b("Stanisław", ""), mx.b.b("Imię (imiona)", ""), false, 4, null), new KeyValueData(mx.b.b("Kowalski", ""), mx.b.b("Nazwisko", ""), false, 4, null), new KeyValueData(mx.b.b("Polskie", ""), mx.b.b("Obywatelstwo", ""), false, 4, null), new KeyValueData(mx.b.b("12.08.1986", ""), mx.b.b("Data urodzenia", ""), false, 4, null), new KeyValueData(mx.b.b("ACC 231122", ""), mx.b.b("Seria i numer", ""), false, 4, null));
            BodySection bodySection3 = new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Potwierdź swoje dane", ""), null, null, 0, 0, null, 62, null)), null, 5, null);
            x0.Icon iconB2 = x0.Icon.INSTANCE.b();
            LeadingSection leadingSection2 = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106785h1, null, null, null, null, 30, null), 3, null);
            zG = rVarH.G(context);
            objE = rVarH.E();
            if (zG) {
                objE = new er.a() { // from class: xo1.b
                    @Override // er.a
                    public final Object a() {
                        return e.e(context);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.a() { // from class: xo1.b
                    @Override // er.a
                    public final Object a() {
                        return e.e(context);
                    }
                };
                rVarH.v(objE);
            }
            DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, (er.a) objE, false, null, null, false, null, null, bodySection3, leadingSection2, iconB2, null, 2301, null);
            BodySection bodySection4 = new BodySection(new SingleCardLabel(mx.b.b("Ostatnia aktualizacja", ""), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b("05.05.2023", ""), null, null, 0, 0, null, 62, null)), null, 4, null);
            k30.a.b bVar2 = k30.a.b.f107765a;
            k30.d.a aVar4 = k30.d.a.f107773a;
            k30.c.WithText withText2 = new k30.c.WithText(mx.b.b("Aktualizuj", ""), null, 2, null);
            zG2 = rVarH.G(context);
            objE2 = rVarH.E();
            if (zG2) {
                objE2 = new er.a() { // from class: xo1.c
                    @Override // er.a
                    public final Object a() {
                        return e.f(context);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new er.a() { // from class: xo1.c
                    @Override // er.a
                    public final Object a() {
                        return e.f(context);
                    }
                };
                rVarH.v(objE2);
            }
            DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection4, null, new x0.Button(new ButtonData(null, null, bVar2, withText2, aVar4, null, (er.a) objE2, 35, null)), null, 2815, null);
            m.Companion companion4 = m.INSTANCE;
            d1.i iVar2 = d1.i.f39152a;
            d1.i.n nVarK2 = iVar2.k();
            f3.c.Companion companion5 = f3.c.INSTANCE;
            w0 w0VarA3 = e0.a(nVarK2, companion5.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            m mVarE3 = f3.j.e(rVarH, companion4);
            androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion6.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA3, companion6.d());
            n6.i(rVarC3, e0VarT3, companion6.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion6.c());
            n6.g(rVarC3, companion6.a());
            n6.i(rVarC3, mVarE3, companion6.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            Label labelB2 = mx.b.b("DocumentScreen", "");
            int i110 = jz.a.U;
            a aVar5 = a.f220195a;
            Label labelR2 = c70.a.f23835a.a().R();
            if ((i17 & 14) != 4) {
                z19 = true;
            } else {
                z19 = true;
            }
            objE3 = rVarH.E();
            if (z19) {
                objE3 = new b(fVar);
                rVarH.v(objE3);
            } else {
                objE3 = new b(fVar);
                rVarH.v(objE3);
            }
            n.g(null, null, labelB2, null, null, 0L, null, new ButtonIconData(null, i110, aVar5, null, labelR2, (er.a) ((mr.g) objE3), 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
            f3.c.b bVarK2 = companion5.k();
            m mVarF2 = androidx.compose.foundation.layout.d.f(companion4, 0.0f, 1, null);
            k70.a aVar6 = k70.a.f108864a;
            int i26 = k70.a.f108865b;
            m mVarS2 = t70.i.S(a3.r(w0.i.d(mVarF2, aVar6.a(rVarH, i26).getBase().a(), null, 2, null), aVar6.b(rVarH, i26).getSpacing200(), 0.0f, aVar6.b(rVarH, i26).getSpacing200(), 0.0f, 10, null), null, rVarH, 0, 1);
            w0 w0VarA4 = e0.a(iVar2.k(), bVarK2, rVarH, 48);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            m mVarE4 = f3.j.e(rVarH, mVarS2);
            aVarB2 = companion6.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarA4, companion6.d());
            n6.i(rVarC4, e0VarT4, companion6.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion6.c());
            n6.g(rVarC4, companion6.a());
            n6.i(rVarC4, mVarE4, companion6.e());
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar6.b(rVarH, i26).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("DocumentLogo - component", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar6.f(rVarH, i26).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar6.b(rVarH, i26).getSpacing200()), rVarH, 0);
            t20.c.c("Czmuchowska karta seniora", bitmapB2, null, rVarH, 6, 4);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar6.b(rVarH, i26).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("DocumentCard - component", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar6.f(rVarH, i26).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar6.b(rVarH, i26).getSpacing200()), rVarH, 0);
            u20.g.g(null, new DocumentGiloshData(c20.b.f22645a, Integer.valueOf(c20.b.f22649b), null, null, mx.b.b("Zdjęcie\nniedostępne", ""), null, null, k.Poland, null, true, mx.b.b("Dokument ważny", ""), null, new DocumentGiloshData.a(listQ2), null, z18, null, null, mx.b.b("Flaga Polski", ""), null, 371048, null), new BaseDocumentScreenState(null, mx.b.b("Rzeczpospolita\nPolska", ""), null, fVar.w(), 5, null), rVarH, (DocumentGiloshData.f209344t << 3) | (BaseDocumentScreenState.f209332e << 6), 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar6.b(rVarH, i26).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("BasicItem.Icon - component", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar6.f(rVarH, i26).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar6.b(rVarH, i26).getSpacing300()), rVarH, 0);
            h0.v(defaultSingleCardData3, null, rVarH, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar6.b(rVarH, i26).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("BasicItem.ClickableButton - component", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar6.f(rVarH, i26).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar6.b(rVarH, i26).getSpacing300()), rVarH, 0);
            h0.v(defaultSingleCardData4, null, rVarH, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar6.b(rVarH, i26).getSpacing300()), rVarH, 0);
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            z16 = z18;
        } else {
            rVarH.O();
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: xo1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.g(fVar, z16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Context context) {
        s.M(context, "Kliknięto potwierdź swoje dane.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Context context) {
        s.M(context, "Kliknięto aktualizuj.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f fVar, boolean z15, int i15, int i16, r rVar, int i17) {
        d(fVar, z15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}

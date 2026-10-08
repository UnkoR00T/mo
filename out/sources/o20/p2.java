package o20;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import h30.ButtonData;
import java.util.Iterator;
import java.util.Locale;
import l60.KeyValueData;
import mx.Label;
import n3.y2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u000e\u001aA\u0010\u0019\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001c\u0010\u000e\u001a!\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001e\u0010\u000e\u001a3\u0010$\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0016H\u0003¢\u0006\u0004\b$\u0010%\"\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\"\u0014\u0010+\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(\"\u0014\u0010-\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(¨\u0006."}, d2 = {"Lo20/r2;", "data", "Loq/i0;", "E", "(Lo20/r2;Lm2/r;I)V", "Lmx/a;", "animationsButtonText", "Lkotlin/Function0;", "animationsButtonOnClick", "u", "(Lmx/a;Ler/a;Lm2/r;I)V", "", "photoSectionTestTag", "R", "(Ljava/lang/String;Lo20/r2;Lm2/r;I)V", "mediaSectionTestTag", "N", "hologramSectionTestTag", "Lo20/u2$b;", "Lmu/g;", "", "rotation", "", "enabledAnimations", "itemTraversalIndex", "K", "(Ljava/lang/String;Lo20/u2$b;Lmu/g;ZFLm2/r;I)V", "leadingSectionTestTag", "z", "trailingSectionTestTag", "B", "bottomSectionTestTag", "Lh30/a;", "updateButtonData", "validityMessage", "isValid", "w", "(Ljava/lang/String;Lh30/a;Lmx/a;ZLm2/r;I)V", "Lc5/h;", "a", "F", "MAIN_CARD_HEIGHT", "b", "IMAGE_CONTAINER_WIDTH", "c", "IMAGE_CONTAINER_HEIGHT", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f140980a = c5.h.n(460);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f140981b = c5.h.n(125);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f140982c = c5.h.n(167);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f140983a;

        static {
            int[] iArr = new int[androidx.lifecycle.j.a.values().length];
            try {
                iArr[androidx.lifecycle.j.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f140983a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(String str, DocumentGiloshData documentGiloshData, int i15, p076m2.r rVar, int i16) {
        z(str, documentGiloshData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    private static final void B(final String str, final DocumentGiloshData documentGiloshData, p076m2.r rVar, final int i15) {
        int i16;
        String str2;
        String str3;
        float spacing150;
        DocumentGiloshData documentGiloshData2 = documentGiloshData;
        int i17 = 0;
        p076m2.r rVarH = rVar.h(1672530797);
        int i18 = 4;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(str) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(documentGiloshData2) ? 32 : 16;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1672530797, i16, -1, "pl.gov.coi.common.ui.document.component.DocumentCardTrailingSection (DocumentComponentMainCard.kt:389)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVarH.X(-1387388227);
            Iterator it = documentGiloshData2.i().iterator();
            final int i19 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i25 = i19 + 1;
                if (i19 < 0) {
                    pq.v.x();
                }
                final KeyValueData keyValueData = (KeyValueData) next;
                f3.m.Companion companion3 = f3.m.INSTANCE;
                ?? r15 = (rVarH.c(i19) ? 1 : 0) | ((i16 & 14) == i18 ? z15 : i17) | (rVarH.W(keyValueData) ? 1 : 0);
                Object objE = rVarH.E();
                if (r15 != 0 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: o20.o2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return p2.C(i19, str, keyValueData, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f3.m mVarC = n4.v.c(companion3, z15, (er.l) objE);
                p036e4.w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, i17);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, i17));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarC);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
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
                p076m2.r rVarC2 = n6.c(rVarH);
                Iterator it4 = it;
                n6.i(rVarC2, w0VarA2, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                d1.i0 i0Var2 = d1.i0.f39176a;
                if (str != null) {
                    str2 = str + i19 + "Text";
                } else {
                    str2 = null;
                }
                Label labelD = keyValueData.d();
                k70.a aVar = k70.a.f108864a;
                int i26 = k70.a.f108865b;
                TextStyle textStyleA = aVar.f(rVarH, i26).a();
                long jK = t70.s.K(16, rVarH, 6);
                Color colorB = documentGiloshData2.j().B(rVarH, 0);
                long jM20unboximpl = colorB != null ? colorB.m20unboximpl() : Color.INSTANCE.h();
                p076m2.r rVar2 = rVarH;
                int i27 = i19;
                int i28 = i16;
                j70.h.g(null, str2, labelD, null, null, jM20unboximpl, jK, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleA, null, Float.valueOf(i25), false, true, null, rVar2, 0, 0, 3072, 22544281);
                if (str != null) {
                    str3 = str + i27 + "DescriptionText";
                } else {
                    str3 = null;
                }
                Label labelC = keyValueData.c();
                TextStyle textStyleF = aVar.f(rVar2, i26).f();
                long jK2 = t70.s.K(12, rVar2, 6);
                Color colorB2 = documentGiloshData.h().B(rVar2, 0);
                j70.h.g(null, str3, labelC, null, null, colorB2 != null ? colorB2.m20unboximpl() : Color.INSTANCE.h(), jK2, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleF, null, Float.valueOf(i27), false, true, null, rVar2, 0, 0, 3072, 22544281);
                rVarH = rVar2;
                rVarH.x();
                boolean z16 = i27 == pq.v.p(documentGiloshData.i());
                if (z16) {
                    rVarH.X(-1330664128);
                    spacing150 = aVar.b(rVarH, i26).getZero();
                    rVarH.R();
                } else {
                    if (z16) {
                        rVarH.X(-1330666761);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-1330662650);
                    spacing150 = aVar.b(rVarH, i26).getSpacing150();
                    rVarH.R();
                }
                r3.a(androidx.compose.foundation.layout.d.i(companion3, spacing150), rVarH, 0);
                documentGiloshData2 = documentGiloshData;
                i16 = i28;
                z15 = true;
                it = it4;
                i19 = i25;
                i18 = 4;
                i17 = 0;
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
            d5VarM.a(new er.p() { // from class: o20.w1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p2.D(str, documentGiloshData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:6:0x001b, please report this as an issue */
    public static final oq.i0 C(int i15, String str, KeyValueData keyValueData, n4.i0 i0Var) {
        String str2;
        String lowerCase;
        n4.f0.I0(i0Var, i15);
        n4.g0.a(i0Var, true);
        if (str != null) {
            str2 = str + i15;
            if (str2 == null) {
                str2 = keyValueData.c().getTag() + '_' + keyValueData.d().getTag();
            }
        } else {
            str2 = keyValueData.c().getTag() + '_' + keyValueData.d().getTag();
        }
        n4.f0.y0(i0Var, str2);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(t70.s.O(keyValueData.c()));
        boolean readLetterByLetter = keyValueData.getReadLetterByLetter();
        if (readLetterByLetter) {
            lowerCase = dz.e.g(keyValueData.d().getText(), 1, " ");
        } else {
            if (readLetterByLetter) {
                throw new oq.p();
            }
            lowerCase = t70.s.O(keyValueData.d()).toLowerCase(Locale.ROOT);
        }
        sb5.append(lowerCase);
        n4.f0.c0(i0Var, sb5.toString());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(String str, DocumentGiloshData documentGiloshData, int i15, p076m2.r rVar, int i16) {
        B(str, documentGiloshData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [T, u20.i] */
    public static final void E(final DocumentGiloshData documentGiloshData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        final x20.h hVar;
        p076m2.r rVarH = rVar.h(926898330);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(documentGiloshData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(926898330, i16, -1, "pl.gov.coi.common.ui.document.component.DocumentMainCard (DocumentComponentMainCard.kt:72)");
            }
            final fr.p0 p0Var = new fr.p0();
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                rVarH.v(null);
                objE = null;
            }
            p0Var.f66410a = (u20.i) objE;
            if (((Boolean) rVarH.N(androidx.compose.ui.platform.u1.a())).booleanValue()) {
                rVarH.X(883687318);
                rVarH.R();
                hVar = null;
            } else {
                rVarH.X(883601045);
                Object objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = new x20.h(true);
                    rVarH.v(objE2);
                }
                rVarH.R();
                hVar = (x20.h) objE2;
            }
            t70.s.j(new er.p() { // from class: o20.v1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p2.F(p0Var, hVar, (androidx.p016lifecycle.q) obj, (androidx.lifecycle.j.a) obj2);
                }
            }, rVarH, 0);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.g(), rVarH, 48);
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
            f3.m mVarA = d1.a2.a(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), d1.c2.Min);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            y2 radius150 = aVar.e(rVarH, i17).getRadius150();
            p046f2.y1 y1Var = p046f2.y1.f58315a;
            float level0 = aVar.c(rVarH, i17).getLevel0();
            int i18 = p046f2.y1.f58316b;
            p046f2.c2.c(mVarA, radius150, p046f2.x1.d(y1Var.a(rVarH, i18), 0L, Color.INSTANCE.a(), 0L, 0L, 13, null), y1Var.c(level0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i18 << 18, 62), null, y2.m.d(1283493298, true, new er.q() { // from class: o20.g2
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p2.G(documentGiloshData, hVar, p0Var, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196614, 16);
            rVar2 = rVarH;
            u(documentGiloshData.getAnimationsButtonText(), documentGiloshData.c(), rVar2, 0);
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
            d5VarM.a(new er.p() { // from class: o20.h2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p2.J(documentGiloshData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.i0 F(fr.p0 p0Var, x20.h hVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        int i15 = a.f140983a[aVar.ordinal()];
        if (i15 == 1) {
            u20.i iVar = (u20.i) p0Var.f66410a;
            if (iVar != null) {
                iVar.e();
            }
            if (hVar != null) {
                hVar.h();
            }
        } else if (i15 == 2) {
            u20.i iVar2 = (u20.i) p0Var.f66410a;
            if (iVar2 != null) {
                iVar2.d();
            }
            if (hVar != null) {
                hVar.i();
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(DocumentGiloshData documentGiloshData, final x20.h hVar, final fr.p0 p0Var, d1.h0 h0Var, p076m2.r rVar, int i15) {
        String str;
        String str2;
        String str3;
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1283493298, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentMainCard.<anonymous>.<anonymous> (DocumentComponentMainCard.kt:114)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarA = d1.a2.a(companion, d1.c2.Min);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), true);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarA);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            w0.i1.c(l4.c.c(documentGiloshData.getBackgroundLayer().f().B(rVar, 0).intValue(), rVar, 0), null, androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), f140980a), null, p036e4.l.INSTANCE.b(), 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 25008, 104);
            if (!documentGiloshData.getEnabledAnimations() || documentGiloshData.getBackgroundLayer().e() == null || hVar == null) {
                rVar.X(592005174);
            } else {
                rVar.X(596910025);
                final int iIntValue = documentGiloshData.getBackgroundLayer().e().B(rVar, 0).intValue();
                androidx.compose.ui.viewinterop.e.b(new er.l() { // from class: o20.i2
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p2.H(iIntValue, hVar, p0Var, (Context) obj);
                    }
                }, null, null, rVar, 0, 6);
            }
            rVar.R();
            f3.m mVarD = androidx.compose.foundation.layout.d.d(companion, 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            p036e4.w0 w0VarA = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarD);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: o20.j2
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p2.I((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(n4.v.d(companion, false, (er.l) objE, 1, null), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarO = a3.o(mVarH, aVar.b(rVar, i16).getSpacing250(), aVar.b(rVar, i16).getSpacing250());
            p036e4.w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarO);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            p076m2.r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarB, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            q3 q3Var = q3.f39261a;
            String testTag = documentGiloshData.getTestTag();
            if (testTag != null) {
                str = testTag + "LeadingSection";
            } else {
                str = null;
            }
            z(str, documentGiloshData, rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing250()), rVar, 0);
            String testTag2 = documentGiloshData.getTestTag();
            if (testTag2 != null) {
                str2 = testTag2 + "TrailingSection";
            } else {
                str2 = null;
            }
            B(str2, documentGiloshData, rVar, 0);
            rVar.x();
            r3.a(d1.h0.b(i0Var, companion, 1.0f, false, 2, null), rVar, 0);
            String testTag3 = documentGiloshData.getTestTag();
            if (testTag3 != null) {
                str3 = testTag3 + "BottomSection";
            } else {
                str3 = null;
            }
            w(str3, documentGiloshData.getUpdateButtonData(), documentGiloshData.getValidityMessage(), documentGiloshData.getIsValid(), rVar, 0);
            rVar.x();
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, u20.i, x20.d] */
    public static final u20.i H(int i15, x20.h hVar, fr.p0 p0Var, Context context) {
        ?? iVar = new u20.i(context, i15);
        hVar.g(iVar);
        iVar.e();
        p0Var.f66410a = iVar;
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(n4.i0 i0Var) {
        n4.f0.H0(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(DocumentGiloshData documentGiloshData, int i15, p076m2.r rVar, int i16) {
        E(documentGiloshData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void K(final String str, final u2.Hologram hologram, final mu.g<Float> gVar, final boolean z15, final float f15, p076m2.r rVar, final int i15) {
        int i16;
        String str2;
        p076m2.r rVarH = rVar.h(737662675);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(hologram) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(gVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.a(z15) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.b(f15) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (rVarH.r((i16 & 9363) != 9362, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(737662675, i16, -1, "pl.gov.coi.common.ui.document.component.HologramSection (DocumentComponentMainCard.kt:342)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean z16 = ((i16 & 14) == 4) | ((57344 & i16) == 16384) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (z16 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: o20.e2
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p2.L(f15, hologram, str, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarC = n4.v.c(companion, true, (er.l) objE);
            p036e4.w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.i(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarC);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            g60.z.q(null, g60.a0.SMALL, gVar, z15, rVarH, (i16 & 896) | 48 | (i16 & 7168), 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i17).getSpacing50()), rVarH, 0);
            if (str != null) {
                str2 = str + "Text";
            } else {
                str2 = null;
            }
            String str3 = str2;
            Label emblemText = hologram.getEmblemText();
            TextStyle textStyleD = aVar.f(rVarH, i17).d();
            long jK = t70.s.K(14, rVarH, 6);
            Color colorB = hologram.b().B(rVarH, 0);
            j70.h.g(null, str3, emblemText, null, null, colorB != null ? colorB.m20unboximpl() : Color.INSTANCE.h(), jK, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleD, null, null, false, true, null, rVarH, 0, 0, 3072, 24641433);
            rVarH = rVarH;
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o20.f2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p2.M(str, hologram, gVar, z15, f15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(float f15, u2.Hologram hologram, String str, n4.i0 i0Var) {
        n4.f0.I0(i0Var, f15);
        n4.g0.a(i0Var, true);
        n4.f0.y0(i0Var, hologram.getEmblemText().getTag());
        if (str == null) {
            str = t70.s.O(hologram.getEmblemText());
        }
        n4.f0.c0(i0Var, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(String str, u2.Hologram hologram, mu.g gVar, boolean z15, float f15, int i15, p076m2.r rVar, int i16) {
        K(str, hologram, gVar, z15, f15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v14 */
    private static final void N(final String str, final DocumentGiloshData documentGiloshData, p076m2.r rVar, final int i15) {
        p076m2.r rVar2;
        int i16;
        p076m2.r rVar3;
        boolean z15;
        p076m2.r rVarH = rVar.h(-2013048018);
        int i17 = (i15 & 6) == 0 ? (rVarH.W(str) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(documentGiloshData) ? 32 : 16;
        }
        int i18 = i17;
        int i19 = 1;
        ?? r15 = 0;
        if (rVarH.r((i18 & 19) != 18, i18 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2013048018, i18, -1, "pl.gov.coi.common.ui.document.component.MediaSection (DocumentComponentMainCard.kt:287)");
            }
            int i25 = 0;
            for (Object obj : documentGiloshData.k()) {
                int i26 = i25 + 1;
                if (i25 < 0) {
                    pq.v.x();
                }
                final u2 u2Var = (u2) obj;
                final float size = documentGiloshData.i().size() + i25 + 2.0f;
                if (u2Var instanceof u2.Logo) {
                    rVarH.X(1933226552);
                    f3.m mVarK = androidx.compose.foundation.layout.d.k(f3.m.INSTANCE, 0.0f, c5.h.n(50), i19, null);
                    ?? r16 = (rVarH.b(size) ? 1 : 0) | ((i18 & 14) == 4 ? i19 : r15) | (rVarH.G(u2Var) ? 1 : 0);
                    Object objE = rVarH.E();
                    if (r16 != 0 || objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.l() { // from class: o20.x1
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return p2.O(size, str, u2Var, (n4.i0) obj2);
                            }
                        };
                        rVarH.v(objE);
                    }
                    rVar3 = rVarH;
                    i16 = i19;
                    w0.i1.c(l4.c.c(((u2.Logo) u2Var).getLogo(), rVarH, r15), null, n4.v.d(mVarK, r15, (er.l) objE, i19, null), null, null, 0.0f, null, rVar3, androidx.compose.ui.graphics.painter.a.f9956g | 48, 120);
                    rVar3.R();
                    z15 = false;
                } else {
                    i16 = i19;
                    rVar3 = rVarH;
                    if (u2Var instanceof u2.Flag) {
                        rVar3.X(-768904948);
                        f3.m.Companion companion = f3.m.INSTANCE;
                        int i27 = (rVar3.b(size) ? 1 : 0) | ((i18 & 14) == 4 ? i16 : 0) | (rVar3.G(u2Var) ? 1 : 0);
                        Object objE2 = rVar3.E();
                        if (i27 != 0 || objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new er.l() { // from class: o20.y1
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return p2.P(size, str, u2Var, (n4.i0) obj2);
                                }
                            };
                            rVar3.v(objE2);
                        }
                        f3.m mVarA = n4.v.a(companion, (er.l) objE2);
                        z15 = false;
                        p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                        int iHashCode = Long.hashCode(p076m2.m.b(rVar3, 0));
                        p076m2.e0 e0VarT = rVar3.t();
                        f3.m mVarE = f3.j.e(rVar3, mVarA);
                        androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                        er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
                        if (rVar3.l() == null) {
                            p076m2.m.d();
                        }
                        rVar3.K();
                        if (rVar3.getInserting()) {
                            rVar3.H(aVarB);
                        } else {
                            rVar3.u();
                        }
                        p076m2.r rVarC = n6.c(rVar3);
                        n6.i(rVarC, w0VarI, companion2.d());
                        n6.i(rVarC, e0VarT, companion2.f());
                        n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                        n6.g(rVarC, companion2.a());
                        n6.i(rVarC, mVarE, companion2.e());
                        d1.x xVar = d1.x.f39368a;
                        u2.Flag flag = (u2.Flag) u2Var;
                        e20.c.c(flag.getFlag(), documentGiloshData.getEnabledAnimations(), flag.getLogoFlagContentDescription(), rVar3, 0, 0);
                        rVar3.x();
                        rVar3.R();
                    } else {
                        z15 = false;
                        if (!(u2Var instanceof u2.Hologram)) {
                            rVar3.X(-768922728);
                            rVar3.R();
                            throw new oq.p();
                        }
                        rVar3.X(-768884914);
                        K(str != null ? str + "HologramSection" : null, (u2.Hologram) u2Var, documentGiloshData.getDocumentVMS().w(), documentGiloshData.getEnabledAnimations(), size, rVar3, 0);
                        rVar3.R();
                    }
                }
                rVarH = rVar3;
                r15 = z15;
                i25 = i26;
                i19 = i16;
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
            d5VarM.a(new er.p() { // from class: o20.z1
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return p2.Q(str, documentGiloshData, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    public static final oq.i0 O(float f15, String str, u2 u2Var, n4.i0 i0Var) {
        String tag;
        n4.f0.I0(i0Var, f15);
        n4.g0.a(i0Var, true);
        if (str != null) {
            tag = str + "Image";
            if (tag == null) {
                tag = ((u2.Logo) u2Var).getContentDescription().getTag();
            }
        } else {
            tag = ((u2.Logo) u2Var).getContentDescription().getTag();
        }
        n4.f0.y0(i0Var, tag);
        n4.f0.c0(i0Var, ((u2.Logo) u2Var).getContentDescription().getText());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    public static final oq.i0 P(float f15, String str, u2 u2Var, n4.i0 i0Var) {
        String tag;
        n4.f0.I0(i0Var, f15);
        n4.g0.a(i0Var, true);
        if (str != null) {
            tag = str + "Flag";
            if (tag == null) {
                tag = ((u2.Flag) u2Var).getLogoFlagContentDescription().getTag();
            }
        } else {
            tag = ((u2.Flag) u2Var).getLogoFlagContentDescription().getTag();
        }
        n4.f0.y0(i0Var, tag);
        n4.f0.c0(i0Var, t70.s.O(((u2.Flag) u2Var).getLogoFlagContentDescription()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(String str, DocumentGiloshData documentGiloshData, int i15, p076m2.r rVar, int i16) {
        N(str, documentGiloshData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void R(final String str, final DocumentGiloshData documentGiloshData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        long jI;
        p076m2.r rVarH = rVar.h(52741756);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(documentGiloshData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(52741756, i16, -1, "pl.gov.coi.common.ui.document.component.PhotoSection (DocumentComponentMainCard.kt:212)");
            }
            final float size = documentGiloshData.i().size();
            f3.m mVarI = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(f3.m.INSTANCE, f140981b), f140982c);
            p046f2.y1 y1Var = p046f2.y1.f58315a;
            int i17 = p046f2.y1.f58316b;
            p046f2.x1 x1VarA = y1Var.a(rVarH, i17);
            if (documentGiloshData.getPhoto() == null) {
                Color noPhotoBackgroundColor = documentGiloshData.getNoPhotoBackgroundColor();
                jI = noPhotoBackgroundColor != null ? noPhotoBackgroundColor.m20unboximpl() : Color.INSTANCE.g();
            } else {
                jI = Color.INSTANCE.i();
            }
            p046f2.x1 x1VarD = p046f2.x1.d(x1VarA, jI, 0L, 0L, 0L, 14, null);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            p046f2.c2.c(mVarI, aVar.e(rVarH, i18).getRadius150(), x1VarD, y1Var.c(aVar.c(rVarH, i18).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i17 << 18, 62), null, y2.m.d(812108014, true, new er.q() { // from class: o20.a2
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p2.S(documentGiloshData, size, str, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196614, 16);
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
            d5VarM.a(new er.p() { // from class: o20.b2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p2.V(str, documentGiloshData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    public static final oq.i0 S(final DocumentGiloshData documentGiloshData, final float f15, final String str, d1.h0 h0Var, p076m2.r rVar, int i15) {
        float f16;
        String str2;
        ?? r15;
        long jM20unboximpl;
        Label label;
        String str3;
        long jM20unboximpl2;
        long jM20unboximpl3;
        p076m2.r rVar2 = rVar;
        if (rVar2.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(812108014, i15, -1, "pl.gov.coi.common.ui.document.component.PhotoSection.<anonymous> (DocumentComponentMainCard.kt:228)");
            }
            Bitmap photo = documentGiloshData.getPhoto();
            oq.i0 i0Var = null;
            if (photo == null) {
                rVar2.X(-40901642);
                rVar2.R();
                f16 = 0.0f;
                str2 = null;
                r15 = 1;
            } else {
                rVar2.X(-40901641);
                f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
                boolean zB = rVar2.b(f15) | rVar2.W(str) | rVar2.W(documentGiloshData);
                Object objE = rVar2.E();
                if (zB || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: o20.c2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return p2.T(f15, str, documentGiloshData, (n4.i0) obj);
                        }
                    };
                    rVar2.v(objE);
                }
                f16 = 0.0f;
                str2 = null;
                r15 = 1;
                w0.i1.g(n3.l0.c(photo), documentGiloshData.getPhotoContentDescription().getText(), n4.v.d(mVarF, false, (er.l) objE, 1, null), null, null, 0.0f, null, 0, rVar2, 0, 248);
                rVar2.R();
                i0Var = oq.i0.f148189a;
            }
            if (i0Var == null) {
                rVar2.X(-40403316);
                final Label noPhotoText = documentGiloshData.getNoPhotoText();
                if (noPhotoText == null) {
                    rVar2.X(-40403317);
                    rVar2.R();
                } else {
                    rVar2.X(-40403316);
                    f3.m.Companion companion = f3.m.INSTANCE;
                    f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion, f16, r15, str2);
                    boolean zB2 = rVar2.b(f15) | rVar2.W(str) | rVar2.W(noPhotoText);
                    Object objE2 = rVar2.E();
                    if (zB2 || objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new er.l() { // from class: o20.d2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return p2.U(f15, str, noPhotoText, (n4.i0) obj);
                            }
                        };
                        rVar2.v(objE2);
                    }
                    f3.m mVarC = n4.v.c(mVarF2, r15, (er.l) objE2);
                    k70.a aVar = k70.a.f108864a;
                    int i16 = k70.a.f108865b;
                    float strokeWidth = aVar.b(rVar2, i16).getStrokeWidth();
                    Color colorB = documentGiloshData.m().B(rVar2, 0);
                    if (colorB == null) {
                        rVar2.X(-1412575873);
                        jM20unboximpl = aVar.a(rVar2, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d();
                        rVar2.R();
                    } else {
                        rVar2.X(-1412577640);
                        rVar2.R();
                        jM20unboximpl = colorB.m20unboximpl();
                    }
                    f3.m mVarG = w0.o.g(mVarC, w0.x.a(strokeWidth, jM20unboximpl), aVar.e(rVar2, i16).getRadius150());
                    p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar2, 54);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
                    p076m2.e0 e0VarT = rVar2.t();
                    f3.m mVarE = f3.j.e(rVar2, mVarG);
                    androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                    er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
                    n6.i(rVarC, w0VarA, companion2.d());
                    n6.i(rVarC, e0VarT, companion2.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                    n6.g(rVarC, companion2.a());
                    n6.i(rVarC, mVarE, companion2.e());
                    d1.i0 i0Var2 = d1.i0.f39176a;
                    if (str != null) {
                        str3 = str + "NoPhotoIcon";
                        label = noPhotoText;
                    } else {
                        label = noPhotoText;
                        str3 = str2;
                    }
                    Integer numValueOf = Integer.valueOf(c20.b.f22736z);
                    h60.g gVar = h60.g.MBig;
                    Color colorB2 = documentGiloshData.m().B(rVar2, 0);
                    if (colorB2 == null) {
                        rVar2.X(-708424139);
                        jM20unboximpl2 = aVar.a(rVar2, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d();
                        rVar2.R();
                    } else {
                        rVar2.X(-708425906);
                        rVar2.R();
                        jM20unboximpl2 = colorB2.m20unboximpl();
                    }
                    String str4 = str2;
                    Label label2 = label;
                    h60.f.e(null, str3, numValueOf, gVar, jM20unboximpl2, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVar, 3072, 0, 4065);
                    if (str != null) {
                        str4 = str + "NoPhotoText";
                    }
                    f3.m mVarR = a3.r(companion, 0.0f, aVar.b(rVar, i16).getSpacing150(), 0.0f, 0.0f, 13, null);
                    int iA = b5.j.INSTANCE.a();
                    long jG = c5.w.g(10);
                    TextStyle textStyleE = aVar.f(rVar, i16).e();
                    Color colorB3 = documentGiloshData.m().B(rVar, 0);
                    if (colorB3 == null) {
                        rVar.X(-708410539);
                        jM20unboximpl3 = aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d();
                        rVar.R();
                    } else {
                        rVar.X(-708412306);
                        rVar.R();
                        jM20unboximpl3 = colorB3.m20unboximpl();
                    }
                    j70.h.g(mVarR, str4, label2, null, null, jM20unboximpl3, jG, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 0, 0, null, textStyleE, null, null, false, true, null, rVar, 1572864, 0, 3072, 24637336);
                    rVar2 = rVar;
                    rVar2.x();
                    rVar2.R();
                    oq.i0 i0Var3 = oq.i0.f148189a;
                }
                rVar2.R();
            } else {
                rVar2.X(-1248244171);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    public static final oq.i0 T(float f15, String str, DocumentGiloshData documentGiloshData, n4.i0 i0Var) {
        String tag;
        n4.f0.I0(i0Var, f15);
        n4.g0.a(i0Var, true);
        if (str != null) {
            tag = str + "Photo";
            if (tag == null) {
                tag = documentGiloshData.getPhotoContentDescription().getTag();
            }
        } else {
            tag = documentGiloshData.getPhotoContentDescription().getTag();
        }
        n4.f0.y0(i0Var, tag);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    public static final oq.i0 U(float f15, String str, Label label, n4.i0 i0Var) {
        String tag;
        n4.f0.I0(i0Var, f15);
        n4.g0.a(i0Var, true);
        if (str != null) {
            tag = str + "NoPhoto";
            if (tag == null) {
                tag = label.getTag();
            }
        } else {
            tag = label.getTag();
        }
        n4.f0.y0(i0Var, tag);
        n4.f0.c0(i0Var, t70.s.O(label));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(String str, DocumentGiloshData documentGiloshData, int i15, p076m2.r rVar, int i16) {
        R(str, documentGiloshData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void u(final Label label, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1134987032);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1134987032, i16, -1, "pl.gov.coi.common.ui.document.component.AnimationsButton (DocumentComponentMainCard.kt:190)");
            }
            if (label != null) {
                rVarH.X(1878993915);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
                rVar2 = rVarH;
                h30.q.p(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(label, null, 2, null), k30.d.a.f107773a, null, aVar, 35, null), false, null, rVar2, 0, 6);
            } else {
                rVar2 = rVarH;
                rVar2.X(1872196762);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o20.k2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p2.v(label, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(Label label, er.a aVar, int i15, p076m2.r rVar, int i16) {
        u(label, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void w(final String str, final ButtonData buttonData, final Label label, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        String str2;
        long jG;
        String str3;
        long jG2;
        p076m2.r rVarH = rVar.h(-2037576672);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(buttonData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(label) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.a(z15) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2037576672, i16, -1, "pl.gov.coi.common.ui.document.component.BottomCardSection (DocumentComponentMainCard.kt:443)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(a3.o(w0.i.c(companion, aVar.a(rVarH, i17).getSurface().a(), l1.h.g(aVar.b(rVarH, i17).getZero(), aVar.b(rVarH, i17).getZero(), aVar.b(rVarH, i17).getSpacing150(), aVar.b(rVarH, i17).getSpacing150())), aVar.b(rVarH, i17).getSpacing250(), aVar.b(rVarH, i17).getSpacing300()), 0.0f, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion2.i();
            d1.i iVar = d1.i.f39152a;
            p036e4.w0 w0VarB = m3.b(iVar.h(), interfaceC1317cI, rVarH, 54);
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            f3.m mVarC = p3.c(q3Var, companion, 1.0f, false, 2, null);
            p036e4.w0 w0VarA = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            int i18 = i16 & 896;
            boolean z16 = (i18 == 256) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (z16 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: o20.m2
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p2.x(str, label, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarC2 = n4.v.c(companion, true, (er.l) objE);
            p036e4.w0 w0VarB2 = m3.b(iVar.j(), companion2.i(), rVarH, 48);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarC2);
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
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarB2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            if (str != null) {
                str2 = str + "Icon";
            } else {
                str2 = null;
            }
            f3.m mVarT = androidx.compose.foundation.layout.d.t(companion, aVar.b(rVarH, i17).getSpacing300());
            int i19 = z15 ? c20.b.f22688k2 : c20.b.f22737z0;
            if (z15) {
                rVarH.X(1739178624);
                jG = aVar.a(rVarH, i17).getSupport().d();
                rVarH.R();
            } else {
                rVarH.X(1739248002);
                jG = aVar.a(rVarH, i17).getSupport().g();
                rVarH.R();
            }
            h60.f.e(mVarT, str2, Integer.valueOf(i19), null, jG, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVarH, 0, 48, 2024);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            if (str != null) {
                str3 = str + "Text";
            } else {
                str3 = null;
            }
            f3.m mVarC3 = p3.c(q3Var, companion, 1.0f, false, 2, null);
            long jK = t70.s.K(14, rVarH, 6);
            int iF = b5.j.INSTANCE.f();
            TextStyle textStyleC = aVar.f(rVarH, i17).c();
            if (z15) {
                rVarH.X(1739714304);
                jG2 = aVar.a(rVarH, i17).getSupport().d();
                rVarH.R();
            } else {
                rVarH.X(1739783682);
                jG2 = aVar.a(rVarH, i17).getSupport().g();
                rVarH.R();
            }
            j70.h.g(mVarC3, str3, label, null, null, jG2, jK, null, null, null, 0L, null, b5.j.h(iF), 0L, 0, false, 0, 0, null, textStyleC, null, null, false, true, null, rVarH, i18, 0, 3072, 24637336);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i17).getSpacing150()), rVarH, 0);
            rVarH.x();
            rVarH.x();
            if (buttonData == null) {
                rVarH.X(-938669593);
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(-938669592);
                h30.q.p(buttonData, false, null, rVarH, 0, 6);
                rVar2 = rVarH;
                oq.i0 i0Var2 = oq.i0.f148189a;
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
            d5VarM.a(new er.p() { // from class: o20.n2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p2.y(str, buttonData, label, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(String str, Label label, n4.i0 i0Var) {
        n4.g0.a(i0Var, true);
        if (str == null) {
            str = label.getTag();
        }
        n4.f0.y0(i0Var, str);
        n4.f0.c0(i0Var, t70.s.O(label));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(String str, ButtonData buttonData, Label label, boolean z15, int i15, p076m2.r rVar, int i16) {
        w(str, buttonData, label, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void z(final String str, final DocumentGiloshData documentGiloshData, p076m2.r rVar, final int i15) {
        int i16;
        String str2;
        p076m2.r rVarH = rVar.h(1871025157);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(documentGiloshData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1871025157, i16, -1, "pl.gov.coi.common.ui.document.component.DocumentCardLeadingSection (DocumentComponentMainCard.kt:375)");
            }
            d1.i.f fVarR = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing250());
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(fVarR, f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            String str3 = null;
            if (str != null) {
                str2 = str + "PhotoSection";
            } else {
                str2 = null;
            }
            int i17 = i16 & 112;
            R(str2, documentGiloshData, rVarH, i17);
            if (str != null) {
                str3 = str + "MediaSection";
            }
            N(str3, documentGiloshData, rVarH, i17);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o20.l2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p2.A(str, documentGiloshData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

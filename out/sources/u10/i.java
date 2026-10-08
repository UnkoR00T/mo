package u10;

import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.Color;
import b5.TextGeometricTransform;
import b5.k;
import er.l;
import er.p;
import fr.t;
import java.util.ArrayList;
import n3.Shadow;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import q4.SpanStyle;
import q4.j0;
import q4.m;
import q4.n;
import q4.u3;
import u4.FontWeight;
import u4.y;
import u4.z;
import x4.LocaleList;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000e\u001a\u00020\u0003*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u0003*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00020\u0003*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a#\u0010\u0013\u001a\u00020\u0003*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u0003*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0011\u001aA\u0010\u0016\u001a\u00020\u0003*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001a\u001a\u00020\u0003*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroid/text/Spanned;", "Lkotlin/Function1;", "", "Loq/i0;", "onUrlClick", "Lq4/e;", "n", "(Landroid/text/Spanned;Ler/l;Lm2/r;II)Lq4/e;", "Lq4/e$b;", "Landroid/text/style/StyleSpan;", "span", "", "start", "end", "f", "(Lq4/e$b;Landroid/text/style/StyleSpan;II)V", "g", "(Lq4/e$b;II)V", "i", "h", "m", "url", "j", "(Lq4/e$b;IILjava/lang/String;Ler/l;Lm2/r;I)V", "", "size", "d", "(Lq4/e$b;IIFLm2/r;I)V", "textformatter_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements n, fr.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f194118a;

        a(l lVar) {
            this.f194118a = lVar;
        }

        @Override // q4.n
        public final /* synthetic */ void a(m mVar) {
            this.f194118a.b(mVar);
        }

        @Override // fr.n
        public final oq.e<?> b() {
            return this.f194118a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof n) && (obj instanceof fr.n)) {
                return t.c(b(), ((fr.n) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    private static final void d(final q4.e.b bVar, final int i15, final int i16, final float f15, r rVar, final int i17) {
        int i18;
        long jN;
        r rVarH = rVar.h(48622359);
        if ((i17 & 6) == 0) {
            i18 = ((i17 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 48) == 0) {
            i18 |= rVarH.c(i15) ? 32 : 16;
        }
        if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.c(i16) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i18 |= rVarH.b(f15) ? 2048 : 1024;
        }
        if (rVarH.r((i18 & 1171) != 1170, i18 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(48622359, i18, -1, "pl.gov.coi.common.textformatter.annotatedstringparser.addRelativeSizeSpanStyle (SpannedParser.kt:157)");
            }
            if (f15 == 1.5f) {
                rVarH.X(-518547873);
                jN = k70.a.f108864a.f(rVarH, k70.a.f108865b).m().n();
                rVarH.R();
            } else {
                if (f15 == 1.4f) {
                    rVarH.X(-518546177);
                    jN = k70.a.f108864a.f(rVarH, k70.a.f108865b).q().n();
                    rVarH.R();
                } else {
                    if (f15 == 1.3f) {
                        rVarH.X(-518544385);
                        jN = k70.a.f108864a.f(rVarH, k70.a.f108865b).p().n();
                        rVarH.R();
                    } else {
                        rVarH.X(-518542561);
                        jN = k70.a.f108864a.f(rVarH, k70.a.f108865b).a().n();
                        rVarH.R();
                    }
                }
            }
            long j15 = jN;
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            bVar.b(new SpanStyle(aVar.a(rVarH, i19).getNeutral().i(), j15, (FontWeight) null, aVar.f(rVarH, i19).p().o(), (z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j0) null, (p3.g) null, 65524, (fr.k) null), i15, i16);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: u10.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.e(bVar, i15, i16, f15, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(q4.e.b bVar, int i15, int i16, float f15, int i17, r rVar, int i18) {
        d(bVar, i15, i16, f15, rVar, g4.a(i17 | 1));
        return i0.f148189a;
    }

    private static final void f(q4.e.b bVar, StyleSpan styleSpan, int i15, int i16) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            g(bVar, i15, i16);
        } else if (style == 2) {
            i(bVar, i15, i16);
        } else {
            if (style != 3) {
                return;
            }
            h(bVar, i15, i16);
        }
    }

    private static final void g(q4.e.b bVar, int i15, int i16) {
        bVar.b(new SpanStyle(0L, 0L, FontWeight.INSTANCE.a(), (y) null, (z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j0) null, (p3.g) null, 65531, (fr.k) null), i15, i16);
    }

    private static final void h(q4.e.b bVar, int i15, int i16) {
        bVar.b(new SpanStyle(0L, 0L, FontWeight.INSTANCE.a(), y.c(y.INSTANCE.a()), (z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j0) null, (p3.g) null, 65523, (fr.k) null), i15, i16);
    }

    private static final void i(q4.e.b bVar, int i15, int i16) {
        bVar.b(new SpanStyle(0L, 0L, (FontWeight) null, y.c(y.INSTANCE.a()), (z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j0) null, (p3.g) null, 65527, (fr.k) null), i15, i16);
    }

    private static final void j(final q4.e.b bVar, final int i15, final int i16, final String str, final l<? super String, i0> lVar, r rVar, final int i17) {
        int i18;
        l lVar2;
        r rVarH = rVar.h(-1101948733);
        if ((i17 & 6) == 0) {
            i18 = ((i17 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 48) == 0) {
            i18 |= rVarH.c(i15) ? 32 : 16;
        }
        if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.c(i16) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i18 |= rVarH.W(str) ? 2048 : 1024;
        }
        if ((i17 & 24576) == 0) {
            i18 |= rVarH.G(lVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (rVarH.r((i18 & 9363) != 9362, i18 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1101948733, i18, -1, "pl.gov.coi.common.textformatter.annotatedstringparser.addURLSpanStyle (SpannedParser.kt:130)");
            }
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            long primary = aVar.a(rVarH, i19).getBase().getPrimary();
            k.Companion companion = k.INSTANCE;
            u3 u3Var = new u3(new SpanStyle(primary, 0L, (FontWeight) null, (y) null, (z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, companion.d(), (Shadow) null, (j0) null, (p3.g) null, 61438, (fr.k) null), new SpanStyle(l70.b.a(aVar.a(rVarH, i19).getBase().getPrimary()), 0L, (FontWeight) null, (y) null, (z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, Color.m9copywmQWz5c$default(aVar.a(rVarH, i19).getNeutral().i(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), companion.d(), (Shadow) null, (j0) null, (p3.g) null, 59390, (fr.k) null), null, null, 12, null);
            if (lVar == null) {
                rVarH.X(-1718984651);
                rVarH.R();
                lVar2 = null;
            } else {
                rVarH.X(-1718984650);
                boolean z15 = ((57344 & i18) == 16384) | ((i18 & 7168) == 2048);
                Object objE = rVarH.E();
                if (z15 || objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: u10.g
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.k(lVar, str, (m) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                lVar2 = (l) objE;
                rVarH.R();
            }
            bVar.a(new m.b(str, u3Var, lVar2 != null ? new a(lVar2) : null), i15, i16);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: u10.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(bVar, i15, i16, str, lVar, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(l lVar, String str, m mVar) {
        lVar.b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(q4.e.b bVar, int i15, int i16, String str, l lVar, int i17, r rVar, int i18) {
        j(bVar, i15, i16, str, lVar, rVar, g4.a(i17 | 1));
        return i0.f148189a;
    }

    private static final void m(q4.e.b bVar, int i15, int i16) {
        bVar.b(new SpanStyle(0L, 0L, (FontWeight) null, (y) null, (z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, k.INSTANCE.d(), (Shadow) null, (j0) null, (p3.g) null, 61439, (fr.k) null), i15, i16);
    }

    public static final q4.e n(Spanned spanned, l<? super String, i0> lVar, r rVar, int i15, int i16) {
        q4.e.b bVar;
        l<? super String, i0> lVar2 = (i16 & 1) != 0 ? null : lVar;
        if (p076m2.t.k()) {
            p076m2.t.o(-67118428, i15, -1, "pl.gov.coi.common.textformatter.annotatedstringparser.toAnnotatedString (SpannedParser.kt:23)");
        }
        rVar.X(-76295756);
        q4.e.b bVar2 = new q4.e.b(0, 1, null);
        bVar2.append(spanned);
        int length = spanned.length();
        rVar.X(-76288070);
        eu.h hVarA0 = pq.n.a0(spanned.getSpans(0, length, Object.class));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : hVarA0) {
            if (obj instanceof URLSpan) {
                arrayList2.add(obj);
            } else {
                arrayList.add(obj);
            }
        }
        oq.r rVar2 = new oq.r(arrayList, arrayList2);
        rVar.X(-76287752);
        for (Object obj2 : (Iterable) rVar2.c()) {
            q4.e.b bVar3 = bVar2;
            int spanStart = spanned.getSpanStart(obj2);
            int spanEnd = spanned.getSpanEnd(obj2);
            if (obj2 instanceof RelativeSizeSpan) {
                rVar.X(366142718);
                d(bVar3, spanStart, spanEnd, ((RelativeSizeSpan) obj2).getSizeChange(), rVar, q4.e.b.f164456e);
                bVar = bVar3;
                rVar.R();
            } else if (obj2 instanceof StyleSpan) {
                bVar = bVar3;
                rVar.X(704552525);
                rVar.R();
                f(bVar, (StyleSpan) obj2, spanStart, spanEnd);
            } else if (obj2 instanceof UnderlineSpan) {
                bVar = bVar3;
                rVar.X(704556733);
                rVar.R();
                m(bVar, spanStart, spanEnd);
            } else {
                bVar = bVar3;
                rVar.X(364814585);
                rVar.R();
            }
            bVar2 = bVar;
        }
        q4.e.b bVar4 = bVar2;
        rVar.R();
        rVar.X(-76270530);
        for (Object obj3 : (Iterable) rVar2.d()) {
            q4.e.b bVar5 = bVar4;
            l<? super String, i0> lVar3 = lVar2;
            j(bVar5, spanned.getSpanStart(obj3), spanned.getSpanEnd(obj3), ((URLSpan) obj3).getURL(), lVar3, rVar, q4.e.b.f164456e | ((i15 << 9) & 57344));
            bVar4 = bVar5;
            lVar2 = lVar3;
        }
        rVar.R();
        rVar.R();
        q4.e eVarP = bVar4.p();
        rVar.R();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return eVarP;
    }
}

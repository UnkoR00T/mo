package k90;

import android.graphics.Shader;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.i;
import androidx.compose.ui.graphics.k;
import b60.WhatsNewColorScheme;
import d1.a3;
import d1.c4;
import d1.f4;
import d1.g4;
import d1.v4;
import d1.x;
import er.p;
import f3.j;
import k70.Dimensions;
import k70.h;
import k70.n;
import k70.q;
import n3.b2;
import n3.o1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.l;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.i1;
import w0.z;
import y2.m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lxg0/a;", "theme", "Lkotlin/Function0;", "Loq/i0;", "content", "i", "(Lxg0/a;Ler/p;Lm2/r;I)V", "Ll70/c;", "baseColors", "Lb60/a;", "whatsNewColors", "", "background", "Lk90/a;", "backgroundMode", "f", "(Ll70/c;Lb60/a;ILer/p;Lk90/a;Lm2/r;I)V", "Landroidx/compose/ui/graphics/Color;", "overlay", "primaryButton", "n", "(JJJ)Lb60/a;", "patternResId", "Lf3/m;", "modifier", "k", "(ILf3/m;Lm2/r;II)V", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f109216b;

        static {
            int[] iArr = new int[xg0.a.values().length];
            try {
                iArr[xg0.a.ENERGY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xg0.a.GEOMETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xg0.a.COSMOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f109215a = iArr;
            int[] iArr2 = new int[k90.a.values().length];
            try {
                iArr2[k90.a.CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k90.a.TILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f109216b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f109217a;

        b(long j15) {
            this.f109217a = j15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1367440380);
            if (t.k()) {
                t.o(1367440380, i15, -1, "pl.gov.coi.mjunior.config.theme.juniorWhatsNewColorScheme.<anonymous> (JuniorAppTheme.kt:137)");
            }
            long j15 = this.f109217a;
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return j15;
        }
    }

    public static final void f(final l70.c cVar, final WhatsNewColorScheme whatsNewColorScheme, final int i15, final p<? super r, ? super Integer, i0> pVar, k90.a aVar, r rVar, final int i16) {
        int i17;
        final k90.a aVar2;
        r rVarH = rVar.h(2127234484);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.G(cVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.W(whatsNewColorScheme) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.c(i15) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= rVarH.G(pVar) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 |= rVarH.c(aVar.ordinal()) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (rVarH.r((i17 & 9363) != 9362, i17 & 1)) {
            if (t.k()) {
                t.o(2127234484, i17, -1, "pl.gov.coi.mjunior.config.theme.CompositionProvider (JuniorAppTheme.kt:92)");
            }
            c4.Companion companion = c4.INSTANCE;
            final c4 c4VarI = f4.i(v4.d(companion, rVarH, 6), v4.c(companion, rVarH, 6));
            p076m2.c4<l70.c> c4VarD = l70.e.c().d(cVar);
            p076m2.c4<WhatsNewColorScheme> c4VarD2 = b60.c.d().d(whatsNewColorScheme);
            b4<Dimensions> b4VarC = k70.e.c();
            k70.a aVar3 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            p076m2.c4[] c4VarArr = {c4VarD, c4VarD2, b4VarC.d(aVar3.b(rVarH, i18)), h.c().d(aVar3.c(rVarH, i18)), n.c().d(aVar3.e(rVarH, i18)), q.c().d(aVar3.f(rVarH, i18))};
            aVar2 = aVar;
            d0.d(c4VarArr, m.d(-587662732, true, new p() { // from class: k90.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.g(aVar2, i15, c4VarI, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            aVar2 = aVar;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final k90.a aVar4 = aVar2;
            d5VarM.a(new p() { // from class: k90.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.h(cVar, whatsNewColorScheme, i15, pVar, aVar4, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(k90.a aVar, int i15, c4 c4Var, p pVar, r rVar, int i16) {
        Object obj;
        if (rVar.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-587662732, i16, -1, "pl.gov.coi.mjunior.config.theme.CompositionProvider.<anonymous> (JuniorAppTheme.kt:104)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarF);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            x xVar = x.f39368a;
            int i17 = a.f109216b[aVar.ordinal()];
            if (i17 == 1) {
                rVar.X(1163460004);
                obj = null;
                i1.c(l4.c.c(i15, rVar, 0), null, androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, l.INSTANCE.a(), 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 25008, 104);
                rVar.R();
            } else {
                if (i17 != 2) {
                    rVar.X(-1902133228);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-1902124432);
                k(i15, xVar.c(companion), rVar, 0, 0);
                rVar.R();
                obj = null;
            }
            f3.m mVarA = g4.a(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, obj), f4.f(c4Var, rVar, 0)), c4Var);
            w0 w0VarI2 = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = j.e(rVar, mVarA);
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
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarI2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            pVar.B(rVar, 0);
            rVar.x();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l70.c cVar, WhatsNewColorScheme whatsNewColorScheme, int i15, p pVar, k90.a aVar, int i16, r rVar, int i17) {
        f(cVar, whatsNewColorScheme, i15, pVar, aVar, rVar, p076m2.g4.a(i16 | 1));
        return i0.f148189a;
    }

    public static final void i(final xg0.a aVar, p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        final p<? super r, ? super Integer, i0> pVar2 = pVar;
        r rVarH = rVar.h(-1224894907);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.c(aVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1224894907, i16, -1, "pl.gov.coi.mjunior.config.theme.JuniorAppTheme (JuniorAppTheme.kt:45)");
            }
            int i17 = a.f109215a[aVar.ordinal()];
            if (i17 == 1) {
                rVarH.X(-302962143);
                pVar2 = pVar;
                f(l90.b.a(l90.a.b.f117272a), n(o1.d(4283041024L), o1.d(4292826112L), o1.d(4290658817L)), yd0.a.f226495w, pVar2, k90.a.CROP, rVarH, ((i16 << 6) & 7168) | 24576);
                rVarH.R();
            } else if (i17 == 2) {
                rVarH.X(-302947995);
                pVar2 = pVar;
                f(l90.b.a(l90.a.c.f117278a), n(o1.d(4281532548L), o1.d(4285733631L), o1.d(4284814564L)), yd0.a.f226496x, pVar2, k90.a.TILE, rVarH, ((i16 << 6) & 7168) | 24576);
                rVarH.R();
            } else {
                if (i17 != 3) {
                    rVarH.X(-302962524);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-302933791);
                f(l90.b.a(l90.a.C2839a.f117266a), n(o1.d(4278728219L), o1.d(4278225689L), o1.d(4278728219L)), yd0.a.f226494v, pVar2, k90.a.TILE, rVarH, ((i16 << 6) & 7168) | 24576);
                rVarH.R();
                pVar2 = pVar;
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: k90.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.j(aVar, pVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(xg0.a aVar, p pVar, int i15, r rVar, int i16) {
        i(aVar, pVar, rVar, p076m2.g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final int i15, final f3.m mVar, r rVar, final int i16, final int i17) {
        int i18;
        r rVarH = rVar.h(-1225754743);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.c(i15) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        int i19 = i17 & 2;
        if (i19 != 0) {
            i18 |= 48;
        } else if ((i16 & 48) == 0) {
            i18 |= rVarH.W(mVar) ? 32 : 16;
        }
        if (rVarH.r((i18 & 19) != 18, i18 & 1)) {
            if (i19 != 0) {
                mVar = f3.m.INSTANCE;
            }
            if (t.k()) {
                t.o(-1225754743, i18, -1, "pl.gov.coi.mjunior.config.theme.TilePatternBackground (JuniorAppTheme.kt:144)");
            }
            b2 b2VarA = l4.a.a(b2.INSTANCE, i15, rVarH, ((i18 << 3) & 112) | 6);
            boolean zW = rVarH.W(b2VarA);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                k.Companion companion = k.INSTANCE;
                objE = i.b(b2VarA, companion.d(), companion.d());
                rVarH.v(objE);
            }
            final Shader shader = (Shader) objE;
            boolean zG = rVarH.G(shader);
            Object objE2 = rVarH.E();
            if (zG || objE2 == r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: k90.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.l(shader, (p3.f) obj);
                    }
                };
                rVarH.v(objE2);
            }
            z.b(mVar, (er.l) objE2, rVarH, (i18 >> 3) & 14);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: k90.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.m(i15, mVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Shader shader, p3.f fVar) {
        p3.f.F1(fVar, androidx.compose.ui.graphics.d.a(shader), 0L, fVar.a(), 0.0f, null, null, 0, 122, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(int i15, f3.m mVar, int i16, int i17, r rVar, int i18) {
        k(i15, mVar, rVar, p076m2.g4.a(i16 | 1), i17);
        return i0.f148189a;
    }

    private static final WhatsNewColorScheme n(long j15, long j16, long j17) {
        return WhatsNewColorScheme.b(b60.c.c(), j15, j16, 0L, 0L, new b(j17), 12, null);
    }
}

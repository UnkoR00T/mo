package m90;

import lc0.LoginThemeColors;
import lc0.LoginThemeDrawable;
import n3.o1;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxg0/a;", "theme", "Lkotlin/Function0;", "Loq/i0;", "content", "c", "(Lxg0/a;Ler/p;Lm2/r;I)V", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124699a;

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
            f124699a = iArr;
        }
    }

    public static final void c(final xg0.a aVar, final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        LoginThemeDrawable loginThemeDrawable;
        LoginThemeColors loginThemeColors;
        p076m2.r rVarH = rVar.h(1697635793);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.c(aVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1697635793, i16, -1, "pl.gov.coi.mjunior.config.theme.providers.LoginThemeProvider (LoginThemeProvider.kt:16)");
            }
            b4<LoginThemeDrawable> b4VarF = lc0.e.f();
            int[] iArr = a.f124699a;
            int i17 = iArr[aVar.ordinal()];
            if (i17 == 1) {
                loginThemeDrawable = new LoginThemeDrawable(yd0.a.f226474b);
            } else if (i17 == 2) {
                loginThemeDrawable = new LoginThemeDrawable(yd0.a.f226475c);
            } else {
                if (i17 != 3) {
                    throw new oq.p();
                }
                loginThemeDrawable = new LoginThemeDrawable(yd0.a.f226473a);
            }
            c4<LoginThemeDrawable> c4VarD = b4VarF.d(loginThemeDrawable);
            b4<LoginThemeColors> b4VarE = lc0.e.e();
            int i18 = iArr[aVar.ordinal()];
            if (i18 == 1) {
                loginThemeColors = new LoginThemeColors(o1.d(BodyPartID.bodyIdMax), null);
            } else if (i18 == 2) {
                loginThemeColors = new LoginThemeColors(o1.d(4288701695L), null);
            } else {
                if (i18 != 3) {
                    throw new oq.p();
                }
                loginThemeColors = new LoginThemeColors(o1.d(4278255447L), null);
            }
            d0.d(new c4[]{c4VarD, b4VarE.d(loginThemeColors)}, y2.m.d(1088057617, true, new er.p() { // from class: m90.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.d(pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m90.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.e(aVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1088057617, i15, -1, "pl.gov.coi.mjunior.config.theme.providers.LoginThemeProvider.<anonymous> (LoginThemeProvider.kt:35)");
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
    public static final i0 e(xg0.a aVar, er.p pVar, int i15, p076m2.r rVar, int i16) {
        c(aVar, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}

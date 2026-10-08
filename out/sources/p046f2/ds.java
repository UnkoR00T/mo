package p046f2;

import androidx.compose.material3.d;
import l2.k1;
import l2.l1;
import oq.p;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lf2/bs;", "Ll2/k1;", "value", "Lq4/b4;", "d", "(Lf2/bs;Ll2/k1;)Lq4/b4;", "Lm2/b4;", "a", "Lm2/b4;", "getLocalTypography", "()Lm2/b4;", "LocalTypography", "Ll2/l1;", "b", "Ll2/l1;", "typographyTokens", "e", "(Ll2/k1;Lm2/r;I)Lq4/b4;", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<Typography> f55681a = d0.j(new er.a() { // from class: f2.cs
        @Override // er.a
        public final Object a() {
            return ds.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l1 f55682b = new l1(null, 1, 0 == true ? 1 : 0);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55683a;

        static {
            int[] iArr = new int[k1.values().length];
            try {
                iArr[k1.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k1.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k1.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k1.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k1.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k1.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k1.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k1.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k1.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k1.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[k1.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[k1.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[k1.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[k1.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[k1.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[k1.DisplayLargeEmphasized.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[k1.DisplayMediumEmphasized.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[k1.DisplaySmallEmphasized.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[k1.HeadlineLargeEmphasized.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[k1.HeadlineMediumEmphasized.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[k1.HeadlineSmallEmphasized.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[k1.TitleLargeEmphasized.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[k1.TitleMediumEmphasized.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[k1.TitleSmallEmphasized.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[k1.BodyLargeEmphasized.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[k1.BodyMediumEmphasized.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[k1.BodySmallEmphasized.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[k1.LabelLargeEmphasized.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[k1.LabelMediumEmphasized.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[k1.LabelSmallEmphasized.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            f55683a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typography b() {
        return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public static final TextStyle d(Typography typography, k1 k1Var) {
        switch (a.f55683a[k1Var.ordinal()]) {
            case 1:
                return typography.getDisplayLarge();
            case 2:
                return typography.getDisplayMedium();
            case 3:
                return typography.getDisplaySmall();
            case 4:
                return typography.getHeadlineLarge();
            case 5:
                return typography.getHeadlineMedium();
            case 6:
                return typography.getHeadlineSmall();
            case 7:
                return typography.getTitleLarge();
            case 8:
                return typography.getTitleMedium();
            case 9:
                return typography.getTitleSmall();
            case 10:
                return typography.getBodyLarge();
            case 11:
                return typography.getBodyMedium();
            case 12:
                return typography.getBodySmall();
            case 13:
                return typography.getLabelLarge();
            case 14:
                return typography.getLabelMedium();
            case 15:
                return typography.getLabelSmall();
            case 16:
                return typography.getDisplayLargeEmphasized();
            case 17:
                return typography.getDisplayMediumEmphasized();
            case 18:
                return typography.getDisplaySmallEmphasized();
            case 19:
                return typography.getHeadlineLargeEmphasized();
            case 20:
                return typography.getHeadlineMediumEmphasized();
            case 21:
                return typography.getHeadlineSmallEmphasized();
            case 22:
                return typography.getTitleLargeEmphasized();
            case 23:
                return typography.getTitleMediumEmphasized();
            case 24:
                return typography.getTitleSmallEmphasized();
            case 25:
                return typography.getBodyLargeEmphasized();
            case 26:
                return typography.getBodyMediumEmphasized();
            case 27:
                return typography.getBodySmallEmphasized();
            case 28:
                return typography.getLabelLargeEmphasized();
            case 29:
                return typography.getLabelMediumEmphasized();
            case 30:
                return typography.getLabelSmallEmphasized();
            default:
                throw new p();
        }
    }

    public static final TextStyle e(k1 k1Var, r rVar, int i15) {
        if (t.k()) {
            t.o(-1049072145, i15, -1, "androidx.compose.material3.<get-value> (Typography.kt:734)");
        }
        TextStyle textStyleD = d(d.f9816a.e(rVar, 6), k1Var);
        if (t.k()) {
            t.n();
        }
        return textStyleD;
    }
}

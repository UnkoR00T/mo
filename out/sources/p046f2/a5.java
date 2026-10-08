package p046f2;

import a1.f;
import a1.n;
import androidx.compose.material3.d;
import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import f1.y0;
import f3.m;
import h2.a2;
import h2.b2;
import java.util.Arrays;
import java.util.Locale;
import l2.k0;
import l2.q;
import l2.s;
import l2.t;
import lr.i;
import n3.y2;
import n4.f0;
import n4.v;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p143z0.d3;
import p143z0.e1;
import u0.c0;
import u0.e0;
import u0.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u008b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\"\u0010#J+\u0010)\u001a\u00020(2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$¢\u0006\u0004\b)\u0010*J+\u00101\u001a\u0002002\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u0007H\u0007¢\u0006\u0004\b1\u00102J=\u00106\u001a\u0002002\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010,\u001a\u00020+2\u0006\u00105\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u0007H\u0007¢\u0006\u0004\b6\u00107J'\u0010>\u001a\u00020=2\u0006\u00109\u001a\u0002082\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:H\u0001¢\u0006\u0004\b>\u0010?R\u0017\u0010E\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010K\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010P\u001a\u00020L8\u0006¢\u0006\f\n\u0004\b6\u0010M\u001a\u0004\bN\u0010OR\u0018\u0010T\u001a\u00020\u0004*\u00020Q8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010X\u001a\u00020U8G¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lf2/a5;", "", "<init>", "()V", "Lf2/w4;", "i", "(Lm2/r;I)Lf2/w4;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContentColor", "dayInSelectionRangeContainerColor", "dividerColor", "Lf2/hn;", "dateTextFieldColors", "j", "(JJJJJJJJJJJJJJJJJJJJJJJJLf2/hn;Lm2/r;IIII)Lf2/w4;", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "Lf2/h5;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf2/h5;", "Lf2/ob;", "displayMode", "Lf3/m;", "modifier", "contentColor", "Loq/i0;", "g", "(ILf3/m;JLm2/r;II)V", "", "selectedDateMillis", "dateFormatter", "d", "(Ljava/lang/Long;ILf2/h5;Lf3/m;JLm2/r;II)V", "Lf1/y0;", "lazyListState", "Lu0/c0;", "", "decayAnimationSpec", "Lz0/e1;", "r", "(Lf1/y0;Lu0/c0;Lm2/r;II)Lz0/e1;", "Llr/i;", "b", "Llr/i;", "q", "()Llr/i;", "YearRange", "Lc5/h;", "c", "F", "p", "()F", "TonalElevation", "Lf2/pi;", "Lf2/pi;", "m", "()Lf2/pi;", "AllDates", "Lf2/e2;", "n", "(Lf2/e2;Lm2/r;I)Lf2/w4;", "defaultDatePickerColors", "Ln3/y2;", "o", "(Lm2/r;I)Ln3/y2;", "shape", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5 f55133a = new a5();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final i YearRange = new i(1900, 2100);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float TonalElevation = t.f115244a.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final pi AllDates = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f2/a5$a", "Lf2/pi;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements pi {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"f2/a5$b", "La1/n;", "", "velocity", "decayOffset", "b", "(FF)F", "a", "(F)F", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ n f55137a;

        b(n nVar) {
            this.f55137a = nVar;
        }

        @Override // a1.n
        public float a(float velocity) {
            return this.f55137a.a(velocity);
        }

        @Override // a1.n
        public float b(float velocity, float decayOffset) {
            return 0.0f;
        }
    }

    private a5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(String str, n4.i0 i0Var) {
        f0.l0(i0Var, n4.i.INSTANCE.b());
        f0.c0(i0Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(a5 a5Var, Long l15, int i15, h5 h5Var, m mVar, long j15, int i16, int i17, r rVar, int i18) {
        a5Var.d(l15, i15, h5Var, mVar, j15, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(a5 a5Var, int i15, m mVar, long j15, int i16, int i17, r rVar, int i18) {
        a5Var.g(i15, mVar, j15, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }

    public static /* synthetic */ h5 l(a5 a5Var, String str, String str2, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = "yMMMM";
        }
        if ((i15 & 2) != 0) {
            str2 = "yMMMd";
        }
        if ((i15 & 4) != 0) {
            str3 = "yMMMMEEEEd";
        }
        return a5Var.k(str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:108:0x020d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0235  */
    /* JADX WARN: Code duplicated, block: B:116:0x027b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0281  */
    /* JADX WARN: Code duplicated, block: B:121:0x028e  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x011d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0133  */
    /* JADX WARN: Code duplicated, block: B:88:0x013d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:91:0x0161  */
    /* JADX WARN: Code duplicated, block: B:93:0x016c  */
    /* JADX WARN: Code duplicated, block: B:95:0x017e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0194  */
    /* JADX WARN: Code duplicated, block: B:98:0x019e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b4  */
    public final void d(Long l15, final int i15, h5 h5Var, m mVar, long j15, r rVar, final int i16, final int i17) {
        int i18;
        m mVar2;
        long headlineContentColor;
        boolean z15;
        r rVar2;
        final m mVar3;
        final long j16;
        d5 d5VarM;
        m mVar4;
        int i19;
        long j17;
        m mVar5;
        String strC;
        String strB;
        String strB2;
        ob.Companion companion;
        final String str;
        boolean zW;
        Object objE;
        ob.Companion companion2;
        ob.Companion companion3;
        int i25;
        int i26;
        final Long l16 = l15;
        final h5 h5Var2 = h5Var;
        r rVarH = rVar.h(1913724796);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.W(l16) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= rVarH.c(i15) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= (i16 & 512) == 0 ? rVarH.W(h5Var2) : rVarH.G(h5Var2) ? 256 : 128;
        }
        int i27 = i17 & 8;
        if (i27 == 0) {
            if ((i16 & 3072) == 0) {
                mVar2 = mVar;
                i18 |= rVarH.W(mVar2) ? 2048 : 1024;
            }
            if ((i16 & 24576) == 0) {
                if ((i17 & 16) == 0) {
                    headlineContentColor = j15;
                    if (rVarH.d(headlineContentColor)) {
                        i26 = 16384;
                    }
                    i18 |= i26;
                } else {
                    headlineContentColor = j15;
                }
                i26 = PKIFailureInfo.certRevoked;
                i18 |= i26;
            } else {
                headlineContentColor = j15;
            }
            if ((196608 & i16) == 0) {
                if (rVarH.W(this)) {
                    i25 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i25 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i25;
            }
            if ((74899 & i18) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0 || rVarH.Q()) {
                    if (i27 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 16) != 0) {
                        headlineContentColor = i(rVarH, (i18 >> 15) & 14).getHeadlineContentColor();
                        i18 &= -57345;
                    }
                    i19 = i18;
                    j17 = headlineContentColor;
                    mVar5 = mVar4;
                } else {
                    rVarH.O();
                    if ((i17 & 16) != 0) {
                        i18 &= -57345;
                    }
                    i19 = i18;
                    j17 = headlineContentColor;
                    mVar5 = mVar2;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(1913724796, i19, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:699)");
                }
                Locale localeA = v1.a(rVarH, 0);
                strC = h5.c(h5Var, l16, localeA, false, 4, null);
                h5Var2 = h5Var;
                l16 = l16;
                strB = h5Var2.b(l16, localeA, true);
                strB2 = "";
                if (strB == null) {
                    rVarH.X(380170059);
                    companion3 = ob.INSTANCE;
                    if (ob.f(i15, companion3.b())) {
                        rVarH.X(843549359);
                        a2.Companion companion4 = a2.INSTANCE;
                        strB = b2.b(a2.a(ih.f56327q), rVarH, 0);
                        rVarH.R();
                    } else if (ob.f(i15, companion3.a())) {
                        rVarH.X(843552330);
                        a2.Companion companion5 = a2.INSTANCE;
                        strB = b2.b(a2.a(ih.f56322l), rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(380391490);
                        rVarH.R();
                        strB = "";
                    }
                    rVarH.R();
                } else {
                    rVarH.X(843541746);
                    rVarH.R();
                }
                if (strC == null) {
                    rVarH.X(380491715);
                    companion2 = ob.INSTANCE;
                    if (ob.f(i15, companion2.b())) {
                        rVarH.X(843559745);
                        a2.Companion companion6 = a2.INSTANCE;
                        strC = b2.b(a2.a(ih.f56324n), rVarH, 0);
                        rVarH.R();
                    } else if (ob.f(i15, companion2.a())) {
                        rVarH.X(843562272);
                        a2.Companion companion7 = a2.INSTANCE;
                        strC = b2.b(a2.a(ih.f56316f), rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(380690082);
                        rVarH.R();
                        strC = "";
                    }
                    rVarH.R();
                } else {
                    rVarH.X(843556896);
                    rVarH.R();
                }
                companion = ob.INSTANCE;
                if (ob.f(i15, companion.b())) {
                    rVarH.X(843569932);
                    a2.Companion companion8 = a2.INSTANCE;
                    strB2 = b2.b(a2.a(ih.f56325o), rVarH, 0);
                    rVarH.R();
                } else if (ob.f(i15, companion.a())) {
                    rVarH.X(843572811);
                    a2.Companion companion9 = a2.INSTANCE;
                    strB2 = b2.b(a2.a(ih.f56317g), rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(381027362);
                    rVarH.R();
                }
                str = String.format(strB2, Arrays.copyOf(new Object[]{strB}, 1));
                zW = rVarH.W(str);
                objE = rVarH.E();
                if (zW || objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: f2.x4
                        @Override // er.l
                        public final Object b(Object obj) {
                            return a5.e(str, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                rVar2 = rVarH;
                m mVar6 = mVar5;
                oo.j(strC, v.d(mVar5, false, (l) objE, 1, null), j17, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, rVar2, (i19 >> 6) & 896, 24576, 245752);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar6;
                j16 = j17;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                j16 = headlineContentColor;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.y4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return a5.f(this.f58317a, l16, i15, h5Var2, mVar3, j16, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 3072;
        mVar2 = mVar;
        if ((i16 & 24576) == 0) {
            if ((i17 & 16) == 0) {
                headlineContentColor = j15;
                if (rVarH.d(headlineContentColor)) {
                    i26 = 16384;
                }
                i18 |= i26;
            } else {
                headlineContentColor = j15;
            }
            i26 = PKIFailureInfo.certRevoked;
            i18 |= i26;
        } else {
            headlineContentColor = j15;
        }
        if ((196608 & i16) == 0) {
            if (rVarH.W(this)) {
                i25 = PKIFailureInfo.unsupportedVersion;
            } else {
                i25 = PKIFailureInfo.notAuthorized;
            }
            i18 |= i25;
        }
        if ((74899 & i18) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if (i27 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 16) != 0) {
                    headlineContentColor = i(rVarH, (i18 >> 15) & 14).getHeadlineContentColor();
                    i18 &= -57345;
                }
                i19 = i18;
                j17 = headlineContentColor;
                mVar5 = mVar4;
            } else {
                if (i27 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 16) != 0) {
                    headlineContentColor = i(rVarH, (i18 >> 15) & 14).getHeadlineContentColor();
                    i18 &= -57345;
                }
                i19 = i18;
                j17 = headlineContentColor;
                mVar5 = mVar4;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(1913724796, i19, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:699)");
            }
            Locale localeA2 = v1.a(rVarH, 0);
            strC = h5.c(h5Var, l16, localeA2, false, 4, null);
            h5Var2 = h5Var;
            l16 = l16;
            strB = h5Var2.b(l16, localeA2, true);
            strB2 = "";
            if (strB == null) {
                rVarH.X(380170059);
                companion3 = ob.INSTANCE;
                if (ob.f(i15, companion3.b())) {
                    rVarH.X(843549359);
                    a2.Companion companion10 = a2.INSTANCE;
                    strB = b2.b(a2.a(ih.f56327q), rVarH, 0);
                    rVarH.R();
                } else if (ob.f(i15, companion3.a())) {
                    rVarH.X(843552330);
                    a2.Companion companion11 = a2.INSTANCE;
                    strB = b2.b(a2.a(ih.f56322l), rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(380391490);
                    rVarH.R();
                    strB = "";
                }
                rVarH.R();
            } else {
                rVarH.X(843541746);
                rVarH.R();
            }
            if (strC == null) {
                rVarH.X(380491715);
                companion2 = ob.INSTANCE;
                if (ob.f(i15, companion2.b())) {
                    rVarH.X(843559745);
                    a2.Companion companion12 = a2.INSTANCE;
                    strC = b2.b(a2.a(ih.f56324n), rVarH, 0);
                    rVarH.R();
                } else if (ob.f(i15, companion2.a())) {
                    rVarH.X(843562272);
                    a2.Companion companion13 = a2.INSTANCE;
                    strC = b2.b(a2.a(ih.f56316f), rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(380690082);
                    rVarH.R();
                    strC = "";
                }
                rVarH.R();
            } else {
                rVarH.X(843556896);
                rVarH.R();
            }
            companion = ob.INSTANCE;
            if (ob.f(i15, companion.b())) {
                rVarH.X(843569932);
                a2.Companion companion14 = a2.INSTANCE;
                strB2 = b2.b(a2.a(ih.f56325o), rVarH, 0);
                rVarH.R();
            } else if (ob.f(i15, companion.a())) {
                rVarH.X(843572811);
                a2.Companion companion15 = a2.INSTANCE;
                strB2 = b2.b(a2.a(ih.f56317g), rVarH, 0);
                rVarH.R();
            } else {
                rVarH.X(381027362);
                rVarH.R();
            }
            str = String.format(strB2, Arrays.copyOf(new Object[]{strB}, 1));
            zW = rVarH.W(str);
            objE = rVarH.E();
            if (zW) {
                objE = new l() { // from class: f2.x4
                    @Override // er.l
                    public final Object b(Object obj) {
                        return a5.e(str, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new l() { // from class: f2.x4
                    @Override // er.l
                    public final Object b(Object obj) {
                        return a5.e(str, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            rVar2 = rVarH;
            m mVar7 = mVar5;
            oo.j(strC, v.d(mVar5, false, (l) objE, 1, null), j17, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, rVar2, (i19 >> 6) & 896, 24576, 245752);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar3 = mVar7;
            j16 = j17;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
            j16 = headlineContentColor;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.y4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a5.f(this.f58317a, l16, i15, h5Var2, mVar3, j16, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0165  */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public final void g(final int i15, m mVar, long j15, r rVar, final int i16, final int i17) {
        int i18;
        m mVar2;
        long j16;
        boolean z15;
        final long j17;
        m mVar3;
        d5 d5VarM;
        m mVar4;
        long j18;
        ob.Companion companion;
        int i19;
        r rVarH = rVar.h(-390880814);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.c(i15) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        int i25 = i17 & 2;
        if (i25 == 0) {
            if ((i16 & 48) == 0) {
                mVar2 = mVar;
                i18 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i17 & 4) == 0) {
                    j16 = j15;
                    int i26 = rVarH.d(j16) ? 256 : 128;
                    i18 |= i26;
                } else {
                    j16 = j15;
                }
                i18 |= i26;
            } else {
                j16 = j15;
            }
            if ((i16 & 3072) == 0) {
                if (rVarH.W(this)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i18 |= i19;
            }
            if ((i18 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0 || rVarH.Q()) {
                    if (i25 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        long titleContentColor = i(rVarH, (i18 >> 9) & 14).getTitleContentColor();
                        i18 &= -897;
                        j18 = titleContentColor;
                    } else {
                        j18 = j16;
                    }
                    mVar3 = mVar4;
                } else {
                    rVarH.O();
                    if ((i17 & 4) != 0) {
                        i18 &= -897;
                    }
                    j18 = j16;
                    mVar3 = mVar2;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-390880814, i18, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:664)");
                }
                companion = ob.INSTANCE;
                if (ob.f(i15, companion.b())) {
                    rVarH.X(-1974299676);
                    a2.Companion companion2 = a2.INSTANCE;
                    oo.j(b2.b(a2.a(ih.f56334x), rVarH, 0), mVar3, j18, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVarH, i18 & 1008, 0, 262136);
                    rVarH.R();
                } else if (ob.f(i15, companion.a())) {
                    rVarH.X(-1974292381);
                    a2.Companion companion3 = a2.INSTANCE;
                    oo.j(b2.b(a2.a(ih.f56323m), rVarH, 0), mVar3, j18, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVarH, i18 & 1008, 0, 262136);
                    rVarH.R();
                } else {
                    rVarH.X(-1073341648);
                    rVarH.R();
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                j17 = j18;
            } else {
                rVarH.O();
                j17 = j16;
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar5 = mVar3;
                d5VarM.a(new p() { // from class: f2.z4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return a5.h(this.f58461a, i15, mVar5, j17, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        mVar2 = mVar;
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i17 & 4) == 0) {
                j16 = j15;
                if (rVarH.d(j16)) {
                }
                i18 |= i26;
            } else {
                j16 = j15;
            }
            i18 |= i26;
        } else {
            j16 = j15;
        }
        if ((i16 & 3072) == 0) {
            if (rVarH.W(this)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i18 |= i19;
        }
        if ((i18 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if (i25 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 4) != 0) {
                    long titleContentColor2 = i(rVarH, (i18 >> 9) & 14).getTitleContentColor();
                    i18 &= -897;
                    j18 = titleContentColor2;
                } else {
                    j18 = j16;
                }
                mVar3 = mVar4;
            } else {
                if (i25 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 4) != 0) {
                    long titleContentColor3 = i(rVarH, (i18 >> 9) & 14).getTitleContentColor();
                    i18 &= -897;
                    j18 = titleContentColor3;
                } else {
                    j18 = j16;
                }
                mVar3 = mVar4;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-390880814, i18, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:664)");
            }
            companion = ob.INSTANCE;
            if (ob.f(i15, companion.b())) {
                rVarH.X(-1974299676);
                a2.Companion companion4 = a2.INSTANCE;
                oo.j(b2.b(a2.a(ih.f56334x), rVarH, 0), mVar3, j18, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVarH, i18 & 1008, 0, 262136);
                rVarH.R();
            } else if (ob.f(i15, companion.a())) {
                rVarH.X(-1974292381);
                a2.Companion companion5 = a2.INSTANCE;
                oo.j(b2.b(a2.a(ih.f56323m), rVarH, 0), mVar3, j18, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVarH, i18 & 1008, 0, 262136);
                rVarH.R();
            } else {
                rVarH.X(-1073341648);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            j17 = j18;
        } else {
            rVarH.O();
            j17 = j16;
            mVar3 = mVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar6 = mVar3;
            d5VarM.a(new p() { // from class: f2.z4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a5.h(this.f58461a, i15, mVar6, j17, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final w4 i(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-275219611, i15, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:462)");
        }
        w4 w4VarN = n(d.f9816a.a(rVar, 6), rVar, (i15 << 3) & 112);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return w4VarN;
    }

    public final w4 j(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, hn hnVar, r rVar, int i15, int i16, int i17, int i18) {
        long jH = (i18 & 1) != 0 ? Color.INSTANCE.h() : j15;
        long jH2 = (i18 & 2) != 0 ? Color.INSTANCE.h() : j16;
        long jH3 = (i18 & 4) != 0 ? Color.INSTANCE.h() : j17;
        long jH4 = (i18 & 8) != 0 ? Color.INSTANCE.h() : j18;
        long jH5 = (i18 & 16) != 0 ? Color.INSTANCE.h() : j19;
        long jH6 = (i18 & 32) != 0 ? Color.INSTANCE.h() : j25;
        long jH7 = (i18 & 64) != 0 ? Color.INSTANCE.h() : j26;
        long j59 = jH;
        long jH8 = (i18 & 128) != 0 ? Color.INSTANCE.h() : j27;
        long jH9 = (i18 & 256) != 0 ? Color.INSTANCE.h() : j28;
        long jH10 = (i18 & 512) != 0 ? Color.INSTANCE.h() : j29;
        long jH11 = (i18 & 1024) != 0 ? Color.INSTANCE.h() : j35;
        long jH12 = (i18 & 2048) != 0 ? Color.INSTANCE.h() : j36;
        long jH13 = (i18 & PKIFailureInfo.certConfirmed) != 0 ? Color.INSTANCE.h() : j37;
        long jH14 = (i18 & PKIFailureInfo.certRevoked) != 0 ? Color.INSTANCE.h() : j38;
        long jH15 = (i18 & 16384) != 0 ? Color.INSTANCE.h() : j39;
        long jH16 = (i18 & 32768) != 0 ? Color.INSTANCE.h() : j45;
        long jH17 = (i18 & PKIFailureInfo.notAuthorized) != 0 ? Color.INSTANCE.h() : j46;
        long jH18 = (i18 & PKIFailureInfo.unsupportedVersion) != 0 ? Color.INSTANCE.h() : j47;
        long jH19 = (i18 & PKIFailureInfo.transactionIdInUse) != 0 ? Color.INSTANCE.h() : j48;
        long jH20 = (i18 & PKIFailureInfo.signerNotTrusted) != 0 ? Color.INSTANCE.h() : j49;
        long jH21 = (i18 & PKIFailureInfo.badCertTemplate) != 0 ? Color.INSTANCE.h() : j55;
        long jH22 = (i18 & PKIFailureInfo.badSenderNonce) != 0 ? Color.INSTANCE.h() : j56;
        long jH23 = (i18 & 4194304) != 0 ? Color.INSTANCE.h() : j57;
        long jH24 = (i18 & 8388608) != 0 ? Color.INSTANCE.h() : j58;
        hn hnVar2 = (i18 & 16777216) != 0 ? null : hnVar;
        if (p076m2.t.k()) {
            p076m2.t.o(1991626358, i15, i16, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:531)");
        }
        w4 w4VarB = n(d.f9816a.a(rVar, 6), rVar, (i17 >> 12) & 112).b(j59, jH2, jH3, jH4, jH5, jH6, jH7, jH8, jH9, jH10, jH11, jH12, jH13, jH14, jH15, jH16, jH17, jH18, jH19, jH20, jH21, jH23, jH22, jH24, hnVar2);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return w4VarB;
    }

    public final h5 k(String yearSelectionSkeleton, String selectedDateSkeleton, String selectedDateDescriptionSkeleton) {
        return new i5(yearSelectionSkeleton, selectedDateSkeleton, selectedDateDescriptionSkeleton);
    }

    public final pi m() {
        return AllDates;
    }

    public final w4 n(ColorScheme colorScheme, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1180555308, i15, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:561)");
        }
        w4 defaultDatePickerColorsCached = colorScheme.getDefaultDatePickerColorsCached();
        if (defaultDatePickerColorsCached == null) {
            rVar.X(642416503);
            q qVar = q.f115154a;
            w4 w4Var = new w4(g2.h(colorScheme, qVar.a()), g2.h(colorScheme, qVar.s()), g2.h(colorScheme, qVar.q()), g2.h(colorScheme, qVar.H()), g2.h(colorScheme, qVar.x()), colorScheme.getOnSurfaceVariant(), g2.h(colorScheme, qVar.G()), Color.m9copywmQWz5c$default(g2.h(colorScheme, qVar.G()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, qVar.n()), g2.h(colorScheme, qVar.E()), Color.m9copywmQWz5c$default(g2.h(colorScheme, qVar.E()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, qVar.D()), Color.m9copywmQWz5c$default(g2.h(colorScheme, qVar.D()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, qVar.o()), Color.m9copywmQWz5c$default(g2.h(colorScheme, qVar.o()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, qVar.j()), Color.m9copywmQWz5c$default(g2.h(colorScheme, qVar.j()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, qVar.i()), Color.m9copywmQWz5c$default(g2.h(colorScheme, qVar.i()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, qVar.n()), g2.h(colorScheme, qVar.l()), g2.h(colorScheme, qVar.u()), g2.h(colorScheme, qVar.z()), g2.h(colorScheme, s.f115228a.a()), wf.f58214a.u(colorScheme, rVar, (i15 & 14) | 48), null);
            colorScheme.n0(w4Var);
            rVar.R();
            defaultDatePickerColorsCached = w4Var;
        } else {
            rVar.X(642290457);
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return defaultDatePickerColorsCached;
    }

    public final y2 o(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(700927667, i15, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:785)");
        }
        y2 y2VarH = ui.h(q.f115154a.c(), rVar, 6);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return y2VarH;
    }

    public final float p() {
        return TonalElevation;
    }

    public final i q() {
        return YearRange;
    }

    public final e1 r(y0 y0Var, c0<Float> c0Var, r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            c0Var = e0.c(0.0f, 0.0f, 3, null);
        }
        if (p076m2.t.k()) {
            p076m2.t.o(-2036003494, i15, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:756)");
        }
        j0 j0VarB = of.b(k0.DefaultEffects, rVar, 6);
        boolean zW = ((((i15 & 14) ^ 6) > 4 && rVar.W(y0Var)) || (i15 & 6) == 4) | rVar.W(c0Var);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = a1.m.q(new b(f.b(y0Var, null, 2, null)), c0Var, j0VarB);
            rVar.v(objE);
        }
        d3 d3Var = (d3) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return d3Var;
    }
}

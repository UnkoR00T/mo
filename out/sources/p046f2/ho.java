package p046f2;

import c5.d;
import c5.h;
import c5.n;
import d1.d3;
import e5.b;
import er.l;
import er.p;
import f3.c;
import fr.k;
import fr.p0;
import fr.t;
import h2.g3;
import h2.h1;
import h2.l1;
import ip.a;
import java.util.List;
import l2.l0;
import n3.a2;
import oq.g;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.f0;
import p036e4.v;
import p036e4.v0;
import p036e4.w;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\u001b\u001a\u00020\u0013*\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001a\u001a\u00020\u00132\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010&\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'Jk\u00103\u001a\u00020\u0013*\u00020(2\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0006\u00101\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J·\u0001\u0010G\u001a\u00020F*\u0002052\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00132\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u0001072\b\u0010;\u001a\u0004\u0018\u0001072\b\u0010<\u001a\u0004\u0018\u0001072\b\u0010=\u001a\u0004\u0018\u0001072\b\u0010>\u001a\u0004\u0018\u0001072\u0006\u0010?\u001a\u0002072\b\u0010@\u001a\u0004\u0018\u0001072\u0006\u0010A\u001a\u00020\u00132\u0006\u0010B\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u0002022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00132\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bG\u0010HJ\u0087\u0001\u0010K\u001a\u00020F*\u0002052\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00132\u0006\u0010I\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u0001072\b\u0010;\u001a\u0004\u0018\u0001072\b\u0010<\u001a\u0004\u0018\u0001072\b\u0010=\u001a\u0004\u0018\u0001072\b\u0010>\u001a\u0004\u0018\u0001072\u0006\u0010?\u001a\u0002072\b\u0010@\u001a\u0004\u0018\u0001072\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010J\u001a\u000202H\u0002¢\u0006\u0004\bK\u0010LJ)\u0010P\u001a\u00020O*\u00020M2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020N0\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\bP\u0010QJ)\u0010R\u001a\u00020\u0013*\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\bR\u0010SJ)\u0010T\u001a\u00020\u0013*\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\bT\u0010SJ)\u0010U\u001a\u00020\u0013*\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010SJ)\u0010V\u001a\u00020\u0013*\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bV\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010[R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010[R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010[R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010]R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006`"}, d2 = {"Lf2/ho;", "Le4/w0;", "", "singleLine", "Lf2/tn;", "labelPosition", "Lh2/h1;", "labelProgress", "placeholderAlpha", "affixAlpha", "Ld1/d3;", "paddingValues", "Lc5/h;", "minimizedLabelHalfHeight", "<init>", "(ZLf2/tn;Lh2/h1;Lh2/h1;Lh2/h1;Ld1/d3;FLfr/k;)V", "", "Le4/v;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "t", "(Ljava/util/List;ILer/p;)I", "Le4/w;", "width", "s", "(Le4/w;Ljava/util/List;ILer/p;)I", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "r", "(IIIIIIIJ)I", "Lc5/d;", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "isLabelAbove", "", "q", "(Lc5/d;IIIIIIIIJZF)I", "Le4/a2$a;", "totalHeight", "Le4/a2;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelStartY", "labelEndY", "textPosition", "Lc5/t;", "layoutDirection", "Loq/i0;", "z", "(Le4/a2$a;IILe4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;IIZFLh2/h1;Lh2/h1;ILc5/t;)V", "textPlaceable", "density", a.f96138c, "(Le4/a2$a;IILe4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Lh2/h1;Lh2/h1;F)V", "Le4/y0;", "Le4/v0;", "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "f", "(Le4/w;Ljava/util/List;I)I", "h", "i", "c", "a", "Z", "b", "Lf2/tn;", "Lh2/h1;", "d", "Ld1/d3;", "g", "F", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ho implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tn labelPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h1 labelProgress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h1 placeholderAlpha;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h1 affixAlpha;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d3 paddingValues;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float minimizedLabelHalfHeight;

    public /* synthetic */ ho(boolean z15, tn tnVar, h1 h1Var, h1 h1Var2, h1 h1Var3, d3 d3Var, float f15, k kVar) {
        this(z15, tnVar, h1Var, h1Var2, h1Var3, d3Var, f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(h1 h1Var, a2 a2Var) {
        a2Var.g(h1Var.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(h1 h1Var, a2 a2Var) {
        a2Var.g(h1Var.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(h1 h1Var, a2 a2Var) {
        a2Var.g(h1Var.a());
        return i0.f148189a;
    }

    private final void D(e4.a2.a aVar, int i15, int i16, p036e4.a2 a2Var, p036e4.a2 a2Var2, p036e4.a2 a2Var3, p036e4.a2 a2Var4, p036e4.a2 a2Var5, p036e4.a2 a2Var6, p036e4.a2 a2Var7, p036e4.a2 a2Var8, final h1 h1Var, final h1 h1Var2, float f15) {
        e4.a2.a.G(aVar, a2Var7, n.INSTANCE.b(), 0.0f, 2, null);
        int iA = i16 - l1.a(a2Var8);
        int iD = hr.a.d(this.paddingValues.getTop() * f15);
        if (a2Var3 != null) {
            e4.a2.a.I(aVar, a2Var3, 0, c.INSTANCE.i().a(a2Var3.getHeight(), iA), 0.0f, 4, null);
        }
        if (a2Var5 != null) {
            e4.a2.a.R(aVar, a2Var5, l1.c(a2Var3), E(this, iA, iD, a2Var5), 0.0f, new l() { // from class: f2.fo
                @Override // er.l
                public final Object b(Object obj) {
                    return ho.F(h1Var2, (a2) obj);
                }
            }, 4, null);
        }
        int iC = l1.c(a2Var5) + l1.c(a2Var3);
        e4.a2.a.I(aVar, a2Var, iC, E(this, iA, iD, a2Var), 0.0f, 4, null);
        if (a2Var2 != null) {
            e4.a2.a.R(aVar, a2Var2, iC, E(this, iA, iD, a2Var2), 0.0f, new l() { // from class: f2.go
                @Override // er.l
                public final Object b(Object obj) {
                    return ho.G(h1Var, (a2) obj);
                }
            }, 4, null);
        }
        if (a2Var6 != null) {
            e4.a2.a.R(aVar, a2Var6, (i15 - l1.c(a2Var4)) - a2Var6.getWidth(), E(this, iA, iD, a2Var6), 0.0f, new l() { // from class: f2.wn
                @Override // er.l
                public final Object b(Object obj) {
                    return ho.H(h1Var2, (a2) obj);
                }
            }, 4, null);
        }
        if (a2Var4 != null) {
            e4.a2.a.I(aVar, a2Var4, i15 - a2Var4.getWidth(), c.INSTANCE.i().a(a2Var4.getHeight(), iA), 0.0f, 4, null);
        }
        if (a2Var8 != null) {
            e4.a2.a.I(aVar, a2Var8, 0, iA, 0.0f, 4, null);
        }
    }

    private static final int E(ho hoVar, int i15, int i16, p036e4.a2 a2Var) {
        return hoVar.singleLine ? c.INSTANCE.i().a(a2Var.getHeight(), i15) : i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(h1 h1Var, a2 a2Var) {
        a2Var.g(h1Var.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(h1 h1Var, a2 a2Var) {
        a2Var.g(h1Var.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(h1 h1Var, a2 a2Var) {
        a2Var.g(h1Var.a());
        return i0.f148189a;
    }

    private final int q(d dVar, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, long j15, boolean z15, float f15) {
        int iX0 = dVar.X0(h.n(this.paddingValues.getTop() + this.paddingValues.getBottom())) + ((i16 <= 0 || z15) ? 0 : Math.max(dVar.X0(h.n(this.minimizedLabelHalfHeight * 2)), e5.c.c(0, i16, l0.f114877a.a().a(f15)))) + sq.a.j(i15, i26, i19, i25, z15 ? 0 : e5.c.c(i16, 0, f15));
        if (!z15) {
            i16 = 0;
        }
        return c5.c.f(j15, i16 + Math.max(i17, Math.max(i18, iX0)) + i27);
    }

    private final int r(int leadingWidth, int trailingWidth, int prefixWidth, int suffixWidth, int textFieldWidth, int labelWidth, int placeholderWidth, long constraints) {
        int i15 = prefixWidth + suffixWidth;
        return c5.c.g(constraints, leadingWidth + Math.max(textFieldWidth + i15, Math.max(placeholderWidth + i15, labelWidth)) + trailingWidth);
    }

    private final int s(w wVar, List<? extends v> list, int i15, p<? super v, ? super Integer, Integer> pVar) {
        v vVar;
        int i16;
        int iD;
        int iIntValue;
        v vVar2;
        int iIntValue2;
        v vVar3;
        v vVar4;
        int iD2;
        int i17;
        v vVar5;
        int iIntValue3;
        int i18;
        v vVar6;
        v vVar7;
        List<? extends v> list2 = list;
        int size = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size) {
                vVar = null;
                break;
            }
            vVar = list.get(i19);
            if (t.c(l1.b(vVar), "Leading")) {
                break;
            }
            i19++;
        }
        v vVar8 = vVar;
        if (vVar8 != null) {
            i16 = i15;
            iD = l1.d(i16, vVar8.m0(Integer.MAX_VALUE));
            iIntValue = pVar.B(vVar8, Integer.valueOf(i16)).intValue();
        } else {
            i16 = i15;
            iD = i16;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size2) {
                vVar2 = null;
                break;
            }
            vVar2 = list.get(i25);
            if (t.c(l1.b(vVar2), "Trailing")) {
                break;
            }
            i25++;
        }
        v vVar9 = vVar2;
        if (vVar9 != null) {
            iD = l1.d(iD, vVar9.m0(Integer.MAX_VALUE));
            iIntValue2 = pVar.B(vVar9, Integer.valueOf(i16)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size3) {
                vVar3 = null;
                break;
            }
            vVar3 = list.get(i26);
            if (t.c(l1.b(vVar3), "Label")) {
                break;
            }
            i26++;
        }
        v vVar10 = vVar3;
        int iIntValue4 = vVar10 != null ? pVar.B(vVar10, Integer.valueOf(iD)).intValue() : 0;
        int size4 = list2.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size4) {
                vVar4 = null;
                break;
            }
            vVar4 = list.get(i27);
            if (t.c(l1.b(vVar4), "Prefix")) {
                break;
            }
            i27++;
        }
        v vVar11 = vVar4;
        if (vVar11 != null) {
            int iIntValue5 = pVar.B(vVar11, Integer.valueOf(iD)).intValue();
            int iD3 = l1.d(iD, vVar11.m0(Integer.MAX_VALUE));
            i17 = iIntValue5;
            iD2 = iD3;
        } else {
            iD2 = iD;
            i17 = 0;
        }
        int size5 = list2.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size5) {
                vVar5 = null;
                break;
            }
            vVar5 = list.get(i28);
            if (t.c(l1.b(vVar5), "Suffix")) {
                break;
            }
            i28++;
        }
        v vVar12 = vVar5;
        if (vVar12 != null) {
            iIntValue3 = pVar.B(vVar12, Integer.valueOf(iD2)).intValue();
            iD2 = l1.d(iD2, vVar12.m0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size6 = list2.size();
        for (int i29 = 0; i29 < size6; i29++) {
            v vVar13 = list.get(i29);
            if (t.c(l1.b(vVar13), "TextField")) {
                int iIntValue6 = pVar.B(vVar13, Integer.valueOf(iD2)).intValue();
                List<? extends v> list3 = list;
                int size7 = list3.size();
                int i35 = 0;
                while (true) {
                    if (i35 >= size7) {
                        i18 = iIntValue6;
                        vVar6 = null;
                        break;
                    }
                    vVar6 = list.get(i35);
                    i18 = iIntValue6;
                    if (t.c(l1.b(vVar6), "Hint")) {
                        break;
                    }
                    i35++;
                    iIntValue6 = i18;
                }
                v vVar14 = vVar6;
                int iIntValue7 = vVar14 != null ? pVar.B(vVar14, Integer.valueOf(iD2)).intValue() : 0;
                int size8 = list3.size();
                int i36 = 0;
                while (true) {
                    if (i36 >= size8) {
                        vVar7 = null;
                        break;
                    }
                    vVar7 = list.get(i36);
                    if (t.c(l1.b(vVar7), "Supporting")) {
                        break;
                    }
                    i36++;
                }
                v vVar15 = vVar7;
                return q(wVar, i18, iIntValue4, iIntValue, iIntValue2, i17, iIntValue3, iIntValue7, vVar15 != null ? pVar.B(vVar15, Integer.valueOf(i16)).intValue() : 0, c5.c.b(0, 0, 0, 0, 15, null), this.labelPosition instanceof tn.a, this.labelProgress.a());
            }
        }
        b.f("Collection contains no element matching the predicate.");
        throw new g();
    }

    private final int t(List<? extends v> measurables, int height, p<? super v, ? super Integer, Integer> intrinsicMeasurer) {
        v vVar;
        v vVar2;
        v vVar3;
        v vVar4;
        v vVar5;
        v vVar6;
        int size = measurables.size();
        for (int i15 = 0; i15 < size; i15++) {
            v vVar7 = measurables.get(i15);
            if (t.c(l1.b(vVar7), "TextField")) {
                int iIntValue = intrinsicMeasurer.B(vVar7, Integer.valueOf(height)).intValue();
                List<? extends v> list = measurables;
                int size2 = list.size();
                int i16 = 0;
                while (true) {
                    vVar = null;
                    if (i16 >= size2) {
                        vVar2 = null;
                        break;
                    }
                    vVar2 = measurables.get(i16);
                    if (t.c(l1.b(vVar2), "Label")) {
                        break;
                    }
                    i16++;
                }
                v vVar8 = vVar2;
                int iIntValue2 = vVar8 != null ? intrinsicMeasurer.B(vVar8, Integer.valueOf(height)).intValue() : 0;
                int size3 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size3) {
                        vVar3 = null;
                        break;
                    }
                    vVar3 = measurables.get(i17);
                    if (t.c(l1.b(vVar3), "Trailing")) {
                        break;
                    }
                    i17++;
                }
                v vVar9 = vVar3;
                int iIntValue3 = vVar9 != null ? intrinsicMeasurer.B(vVar9, Integer.valueOf(height)).intValue() : 0;
                int size4 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size4) {
                        vVar4 = null;
                        break;
                    }
                    vVar4 = measurables.get(i18);
                    if (t.c(l1.b(vVar4), "Prefix")) {
                        break;
                    }
                    i18++;
                }
                v vVar10 = vVar4;
                int iIntValue4 = vVar10 != null ? intrinsicMeasurer.B(vVar10, Integer.valueOf(height)).intValue() : 0;
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        vVar5 = null;
                        break;
                    }
                    vVar5 = measurables.get(i19);
                    if (t.c(l1.b(vVar5), "Suffix")) {
                        break;
                    }
                    i19++;
                }
                v vVar11 = vVar5;
                int iIntValue5 = vVar11 != null ? intrinsicMeasurer.B(vVar11, Integer.valueOf(height)).intValue() : 0;
                int size6 = list.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size6) {
                        vVar6 = null;
                        break;
                    }
                    vVar6 = measurables.get(i25);
                    if (t.c(l1.b(vVar6), "Leading")) {
                        break;
                    }
                    i25++;
                }
                v vVar12 = vVar6;
                int iIntValue6 = vVar12 != null ? intrinsicMeasurer.B(vVar12, Integer.valueOf(height)).intValue() : 0;
                int size7 = list.size();
                for (int i26 = 0; i26 < size7; i26++) {
                    v vVar13 = measurables.get(i26);
                    if (t.c(l1.b(vVar13), "Hint")) {
                        vVar = vVar13;
                        break;
                    }
                }
                v vVar14 = vVar;
                return r(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, vVar14 != null ? intrinsicMeasurer.B(vVar14, Integer.valueOf(height)).intValue() : 0, c5.c.b(0, 0, 0, 0, 15, null));
            }
        }
        b.f("Collection contains no element matching the predicate.");
        throw new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(v vVar, int i15) {
        return vVar.n(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int v(v vVar, int i15) {
        return vVar.m0(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 w(p0 p0Var, boolean z15, ho hoVar, int i15, int i16, int i17, int i18, p036e4.a2 a2Var, p036e4.a2 a2Var2, p036e4.a2 a2Var3, p036e4.a2 a2Var4, p036e4.a2 a2Var5, p036e4.a2 a2Var6, p036e4.a2 a2Var7, p036e4.a2 a2Var8, float f15, y0 y0Var, e4.a2.a aVar) {
        e4.a2.a aVar2;
        int iX0;
        int i19;
        if (p0Var.f66410a != 0) {
            if (z15) {
                aVar2 = aVar;
                i19 = 0;
            } else {
                if (hoVar.singleLine) {
                    iX0 = c.INSTANCE.i().a(((p036e4.a2) p0Var.f66410a).getHeight(), i15);
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar;
                    iX0 = i16 + aVar2.X0(hoVar.minimizedLabelHalfHeight);
                }
                i19 = iX0;
            }
            int i25 = z15 ? 0 : i16;
            T t15 = p0Var.f66410a;
            hoVar.z(aVar2, i17, i18, a2Var, (p036e4.a2) t15, a2Var2, a2Var3, a2Var4, a2Var5, a2Var6, a2Var7, a2Var8, i19, i25, z15, f15, hoVar.placeholderAlpha, hoVar.affixAlpha, i16 + (z15 ? 0 : ((p036e4.a2) t15).getHeight()), y0Var.getLayoutDirection());
        } else {
            hoVar.D(aVar, i17, i18, a2Var, a2Var2, a2Var3, a2Var4, a2Var5, a2Var6, a2Var7, a2Var8, hoVar.placeholderAlpha, hoVar.affixAlpha, aVar.getDensity());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x(v vVar, int i15) {
        return vVar.U(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int y(v vVar, int i15) {
        return vVar.e0(i15);
    }

    private final void z(e4.a2.a aVar, int i15, int i16, p036e4.a2 a2Var, p036e4.a2 a2Var2, p036e4.a2 a2Var3, p036e4.a2 a2Var4, p036e4.a2 a2Var5, p036e4.a2 a2Var6, p036e4.a2 a2Var7, p036e4.a2 a2Var8, p036e4.a2 a2Var9, int i17, int i18, boolean z15, float f15, final h1 h1Var, final h1 h1Var2, int i19, c5.t tVar) {
        int height = z15 ? a2Var2.getHeight() : 0;
        e4.a2.a.E(aVar, a2Var8, 0, height, 0.0f, 4, null);
        int iA = (i16 - l1.a(a2Var9)) - (z15 ? a2Var2.getHeight() : 0);
        if (a2Var4 != null) {
            e4.a2.a.I(aVar, a2Var4, 0, height + c.INSTANCE.i().a(a2Var4.getHeight(), iA), 0.0f, 4, null);
        }
        int iC = e5.c.c(i17, i18, f15);
        if (z15) {
            e4.a2.a.E(aVar, a2Var2, g3.m0(this.labelPosition).a(a2Var2.getWidth(), i15, tVar), iC, 0.0f, 4, null);
        } else {
            int iC2 = tVar == c5.t.Ltr ? l1.c(a2Var4) : l1.c(a2Var5);
            e4.a2.a.E(aVar, a2Var2, e5.c.c(g3.i0(this.labelPosition).a(a2Var2.getWidth(), (i15 - l1.c(a2Var4)) - l1.c(a2Var5), tVar) + iC2, g3.m0(this.labelPosition).a(a2Var2.getWidth(), (i15 - l1.c(a2Var4)) - l1.c(a2Var5), tVar) + iC2, f15), iC, 0.0f, 4, null);
        }
        if (a2Var6 != null) {
            e4.a2.a.R(aVar, a2Var6, l1.c(a2Var4), height + i19, 0.0f, new l() { // from class: f2.bo
                @Override // er.l
                public final Object b(Object obj) {
                    return ho.A(h1Var2, (a2) obj);
                }
            }, 4, null);
        }
        int iC3 = l1.c(a2Var4) + l1.c(a2Var6);
        int i25 = height + i19;
        e4.a2.a.I(aVar, a2Var, iC3, i25, 0.0f, 4, null);
        if (a2Var3 != null) {
            e4.a2.a.R(aVar, a2Var3, iC3, i25, 0.0f, new l() { // from class: f2.co
                @Override // er.l
                public final Object b(Object obj) {
                    return ho.B(h1Var, (a2) obj);
                }
            }, 4, null);
        }
        if (a2Var7 != null) {
            e4.a2.a.R(aVar, a2Var7, (i15 - l1.c(a2Var5)) - a2Var7.getWidth(), i25, 0.0f, new l() { // from class: f2.eo
                @Override // er.l
                public final Object b(Object obj) {
                    return ho.C(h1Var2, (a2) obj);
                }
            }, 4, null);
        }
        if (a2Var5 != null) {
            e4.a2.a.I(aVar, a2Var5, i15 - a2Var5.getWidth(), c.INSTANCE.i().a(a2Var5.getHeight(), iA) + height, 0.0f, 4, null);
        }
        if (a2Var9 != null) {
            e4.a2.a.I(aVar, a2Var9, 0, height + iA, 0.0f, 4, null);
        }
    }

    @Override // p036e4.w0
    public int c(w wVar, List<? extends v> list, int i15) {
        return t(list, i15, new p() { // from class: f2.vn
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(ho.y((v) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p036e4.w0
    public x0 e(final y0 y0Var, List<? extends v0> list, long j15) {
        v0 v0Var;
        v0 v0Var2;
        long j16;
        p036e4.a2 a2VarO0;
        v0 v0Var3;
        v0 v0Var4;
        v0 v0Var5;
        int iU;
        v0 v0Var6;
        int i15;
        v0 v0Var7;
        v0 v0Var8;
        long j17;
        final float fA = this.labelProgress.a();
        int iX0 = y0Var.X0(this.paddingValues.getTop());
        int iX1 = y0Var.X0(this.paddingValues.getBottom());
        long jD = c5.b.d(j15, 0, 0, 0, 0, 10, null);
        List<? extends v0> list2 = list;
        int size = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                v0Var = null;
                break;
            }
            v0Var = list.get(i16);
            if (t.c(f0.a(v0Var), "Leading")) {
                break;
            }
            i16++;
        }
        v0 v0Var9 = v0Var;
        p036e4.a2 a2VarO1 = v0Var9 != null ? v0Var9.o0(jD) : null;
        int iC = l1.c(a2VarO1);
        int iMax = Math.max(0, l1.a(a2VarO1));
        int size2 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                v0Var2 = null;
                break;
            }
            v0Var2 = list.get(i17);
            if (t.c(f0.a(v0Var2), "Trailing")) {
                break;
            }
            i17++;
        }
        v0 v0Var10 = v0Var2;
        if (v0Var10 != null) {
            j16 = jD;
            a2VarO0 = v0Var10.o0(c5.c.j(j16, -iC, 0, 2, null));
        } else {
            j16 = jD;
            a2VarO0 = null;
        }
        int iC2 = iC + l1.c(a2VarO0);
        int iMax2 = Math.max(iMax, l1.a(a2VarO0));
        int size3 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size3) {
                v0Var3 = null;
                break;
            }
            v0Var3 = list.get(i18);
            if (t.c(f0.a(v0Var3), "Prefix")) {
                break;
            }
            i18++;
        }
        v0 v0Var11 = v0Var3;
        p036e4.a2 a2VarO2 = v0Var11 != null ? v0Var11.o0(c5.c.j(j16, -iC2, 0, 2, null)) : null;
        int iC3 = iC2 + l1.c(a2VarO2);
        int iMax3 = Math.max(iMax2, l1.a(a2VarO2));
        int size4 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size4) {
                v0Var4 = null;
                break;
            }
            v0Var4 = list.get(i19);
            if (t.c(f0.a(v0Var4), "Suffix")) {
                break;
            }
            i19++;
        }
        v0 v0Var12 = v0Var4;
        p036e4.a2 a2VarO3 = v0Var12 != null ? v0Var12.o0(c5.c.j(j16, -iC3, 0, 2, null)) : null;
        int iC4 = iC3 + l1.c(a2VarO3);
        int iMax4 = Math.max(iMax3, l1.a(a2VarO3));
        boolean z15 = this.labelPosition instanceof tn.a;
        int size5 = list2.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size5) {
                v0Var5 = null;
                break;
            }
            v0Var5 = list.get(i25);
            if (t.c(f0.a(v0Var5), "Label")) {
                break;
            }
            i25++;
        }
        v0 v0Var13 = v0Var5;
        final p0 p0Var = new p0();
        if (z15) {
            iU = v0Var13 != null ? v0Var13.U(c5.b.n(j15)) : 0;
        } else {
            p0Var.f66410a = v0Var13 != null ? v0Var13.o0(c5.c.i(j16, -iC4, -iX1)) : 0;
            iU = 0;
        }
        int size6 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size6) {
                v0Var6 = v0Var13;
                i15 = iX1;
                v0Var7 = null;
                break;
            }
            v0Var7 = list.get(i26);
            v0Var6 = v0Var13;
            i15 = iX1;
            if (t.c(f0.a(v0Var7), "Supporting")) {
                break;
            }
            i26++;
            v0Var13 = v0Var6;
            iX1 = i15;
        }
        v0 v0Var14 = v0Var7;
        int iU2 = v0Var14 != null ? v0Var14.U(c5.b.n(j15)) : 0;
        int iA = l1.a((p036e4.a2) p0Var.f66410a) + iU + iX0;
        long jI = c5.c.i(c5.b.d(j15, 0, 0, 0, 0, 11, null), -iC4, ((-iA) - i15) - iU2);
        int size7 = list2.size();
        int i27 = 0;
        while (i27 < size7) {
            v0 v0Var15 = list.get(i27);
            int i28 = size7;
            if (t.c(f0.a(v0Var15), "TextField")) {
                final p036e4.a2 a2VarO4 = v0Var15.o0(jI);
                long jD2 = c5.b.d(jI, 0, 0, 0, 0, 14, null);
                List<? extends v0> list3 = list;
                int size8 = list3.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size8) {
                        v0Var8 = null;
                        break;
                    }
                    v0Var8 = list.get(i29);
                    int i35 = size8;
                    if (t.c(f0.a(v0Var8), "Hint")) {
                        break;
                    }
                    i29++;
                    size8 = i35;
                }
                v0 v0Var16 = v0Var8;
                p036e4.a2 a2VarO5 = v0Var16 != null ? v0Var16.o0(jD2) : null;
                int iMax5 = Math.max(iMax4, Math.max(l1.a(a2VarO4), l1.a(a2VarO5)) + iA + i15);
                boolean z16 = z15;
                long j18 = j16;
                final int i36 = iX0;
                v0 v0Var17 = v0Var6;
                final int iR = r(l1.c(a2VarO1), l1.c(a2VarO0), l1.c(a2VarO2), l1.c(a2VarO3), a2VarO4.getWidth(), l1.c((p036e4.a2) p0Var.f66410a), l1.c(a2VarO5), j15);
                if (z16) {
                    j17 = j18;
                    p0Var.f66410a = v0Var17 != null ? v0Var17.o0(c5.b.d(j17, 0, iR, 0, iU, 5, null)) : 0;
                } else {
                    j17 = j18;
                }
                p036e4.a2 a2VarO6 = v0Var14 != null ? v0Var14.o0(c5.b.d(c5.c.j(j17, 0, -iMax5, 1, null), 0, iR, 0, 0, 9, null)) : null;
                int iA2 = l1.a(a2VarO6);
                boolean z17 = z16;
                int iQ = q(y0Var, a2VarO4.getHeight(), l1.a((p036e4.a2) p0Var.f66410a), l1.a(a2VarO1), l1.a(a2VarO0), l1.a(a2VarO2), l1.a(a2VarO3), l1.a(a2VarO5), l1.a(a2VarO6), j15, z17, fA);
                final int iA3 = (iQ - iA2) - (z17 ? l1.a((p036e4.a2) p0Var.f66410a) : 0);
                int size9 = list3.size();
                int i37 = 0;
                while (i37 < size9) {
                    v0 v0Var18 = list.get(i37);
                    if (t.c(f0.a(v0Var18), "Container")) {
                        final p036e4.a2 a2VarO7 = v0Var18.o0(c5.c.a(iR != Integer.MAX_VALUE ? iR : 0, iR, iA3 != Integer.MAX_VALUE ? iA3 : 0, iA3));
                        final int i38 = iQ;
                        final boolean z18 = z17;
                        final p036e4.a2 a2Var = a2VarO1;
                        final p036e4.a2 a2Var2 = a2VarO6;
                        final p036e4.a2 a2Var3 = a2VarO0;
                        final p036e4.a2 a2Var4 = a2VarO2;
                        final p036e4.a2 a2Var5 = a2VarO3;
                        final p036e4.a2 a2Var6 = a2VarO5;
                        return y0.j2(y0Var, iR, i38, null, new l() { // from class: f2.yn
                            @Override // er.l
                            public final Object b(Object obj) {
                                return ho.w(p0Var, z18, this, iA3, i36, iR, i38, a2VarO4, a2Var6, a2Var, a2Var3, a2Var4, a2Var5, a2VarO7, a2Var2, fA, y0Var, (e4.a2.a) obj);
                            }
                        }, 4, null);
                    }
                    i37++;
                    iQ = iQ;
                    z17 = z17;
                }
                b.f("Collection contains no element matching the predicate.");
                throw new g();
            }
            i27++;
            size7 = i28;
            j16 = j16;
            z15 = z15;
            jI = jI;
            iX0 = iX0;
            v0Var6 = v0Var6;
        }
        b.f("Collection contains no element matching the predicate.");
        throw new g();
    }

    @Override // p036e4.w0
    public int f(w wVar, List<? extends v> list, int i15) {
        return s(wVar, list, i15, new p() { // from class: f2.ao
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(ho.u((v) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // p036e4.w0
    public int h(w wVar, List<? extends v> list, int i15) {
        return s(wVar, list, i15, new p() { // from class: f2.zn
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(ho.x((v) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // p036e4.w0
    public int i(w wVar, List<? extends v> list, int i15) {
        return t(list, i15, new p() { // from class: f2.xn
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(ho.v((v) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    private ho(boolean z15, tn tnVar, h1 h1Var, h1 h1Var2, h1 h1Var3, d3 d3Var, float f15) {
        this.singleLine = z15;
        this.labelPosition = tnVar;
        this.labelProgress = h1Var;
        this.placeholderAlpha = h1Var2;
        this.affixAlpha = h1Var3;
        this.paddingValues = d3Var;
        this.minimizedLabelHalfHeight = f15;
    }
}

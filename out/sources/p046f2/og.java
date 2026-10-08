package p046f2;

import c5.d;
import c5.h;
import c5.t;
import d1.a3;
import d1.d3;
import e5.b;
import e5.c;
import er.l;
import er.p;
import fr.p0;
import h2.g3;
import h2.h1;
import h2.l1;
import java.util.List;
import lr.m;
import m3.k;
import n3.a2;
import oq.g;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.f0;
import p036e4.v;
import p036e4.v0;
import p036e4.w;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import sq.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u001c\u001a\u00020\u0018*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010\u001f\u001a\u00020\u0018*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001e\u001a\u00020\u00182\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ[\u0010+\u001a\u00020\u0018*\u00020 2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,Jk\u00106\u001a\u00020\u0018*\u00020 2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(2\u0006\u00105\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020*H\u0002¢\u0006\u0004\b6\u00107J±\u0001\u0010H\u001a\u00020\u0004*\u0002082\u0006\u00109\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010<\u001a\u0004\u0018\u00010:2\b\u0010=\u001a\u0004\u0018\u00010:2\b\u0010>\u001a\u0004\u0018\u00010:2\u0006\u0010?\u001a\u00020:2\b\u0010@\u001a\u0004\u0018\u00010:2\b\u0010A\u001a\u0004\u0018\u00010:2\u0006\u0010B\u001a\u00020:2\b\u0010C\u001a\u0004\u0018\u00010:2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010D\u001a\u00020*2\u0006\u0010F\u001a\u00020E2\u0006\u00105\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020*2\u0006\u0010G\u001a\u00020*H\u0002¢\u0006\u0004\bH\u0010IJ)\u0010M\u001a\u00020L*\u00020J2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020K0\u00152\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bM\u0010NJ)\u0010O\u001a\u00020\u0018*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\bO\u0010PJ)\u0010Q\u001a\u00020\u0018*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\bQ\u0010PJ)\u0010R\u001a\u00020\u0018*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bR\u0010PJ)\u0010S\u001a\u00020\u0018*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bS\u0010PR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010ZR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010ZR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010]¨\u0006^"}, d2 = {"Lf2/og;", "Le4/w0;", "Lkotlin/Function1;", "Lm3/k;", "Loq/i0;", "onLabelMeasured", "", "singleLine", "Lf2/tn;", "labelPosition", "Lh2/h1;", "labelProgress", "placeholderAlpha", "affixAlpha", "Ld1/d3;", "paddingValues", "Lc5/h;", "horizontalIconPadding", "<init>", "(Ler/l;ZLf2/tn;Lh2/h1;Lh2/h1;Lh2/h1;Ld1/d3;FLfr/k;)V", "Le4/w;", "", "Le4/v;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "q", "(Le4/w;Ljava/util/List;ILer/p;)I", "width", "p", "Lc5/d;", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "", "o", "(Lc5/d;IIIIIIIJF)I", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "isLabelAbove", "n", "(Lc5/d;IIIIIIIIJZF)I", "Le4/a2$a;", "totalHeight", "Le4/a2;", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "density", "Lc5/t;", "layoutDirection", "iconPadding", "w", "(Le4/a2$a;IILe4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Le4/a2;Lh2/h1;Lh2/h1;FLc5/t;ZFF)V", "Le4/y0;", "Le4/v0;", "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "f", "(Le4/w;Ljava/util/List;I)I", "h", "i", "c", "a", "Ler/l;", "b", "Z", "Lf2/tn;", "d", "Lh2/h1;", "g", "Ld1/d3;", "F", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class og implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<k, i0> onLabelMeasured;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tn labelPosition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h1 labelProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h1 placeholderAlpha;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h1 affixAlpha;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d3 paddingValues;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float horizontalIconPadding;

    public /* synthetic */ og(l lVar, boolean z15, tn tnVar, h1 h1Var, h1 h1Var2, h1 h1Var3, d3 d3Var, float f15, fr.k kVar) {
        this(lVar, z15, tnVar, h1Var, h1Var2, h1Var3, d3Var, f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(h1 h1Var, a2 a2Var) {
        a2Var.g(h1Var.a());
        return i0.f148189a;
    }

    private final int n(d dVar, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, long j15, boolean z15, float f15) {
        int iJ = a.j(i19, i26, i17, i18, z15 ? 0 : c.c(i25, 0, f15));
        float fL2 = dVar.l2(this.paddingValues.getTop());
        if (!z15) {
            fL2 = c.b(fL2, Math.max(fL2, i25 / 2.0f), f15);
        }
        float fL3 = fL2 + iJ + dVar.l2(this.paddingValues.getBottom());
        if (!z15) {
            i25 = 0;
        }
        return c5.c.f(j15, i25 + Math.max(i15, Math.max(i16, hr.a.d(fL3))) + i27);
    }

    private final int o(d dVar, int i15, int i16, int i17, int i18, int i19, int i25, int i26, long j15, float f15) {
        int i27 = i17 + i18;
        int iMax = i15 + Math.max(i19 + i27, Math.max(i26 + i27, c.c(i25, 0, f15))) + i16;
        d3 d3Var = this.paddingValues;
        t tVar = t.Ltr;
        return c5.c.g(j15, Math.max(iMax, hr.a.d((i25 + dVar.l2(h.n(d3Var.c(tVar) + this.paddingValues.b(tVar)))) * f15)));
    }

    private final int p(w wVar, List<? extends v> list, int i15, p<? super v, ? super Integer, Integer> pVar) {
        v vVar;
        int iD;
        int iIntValue;
        v vVar2;
        int iIntValue2;
        v vVar3;
        v vVar4;
        int iIntValue3;
        v vVar5;
        int iIntValue4;
        int i16;
        v vVar6;
        v vVar7;
        og ogVar = this;
        float fA = ogVar.labelProgress.a();
        List<? extends v> list2 = list;
        int size = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                vVar = null;
                break;
            }
            vVar = list.get(i17);
            if (fr.t.c(l1.b(vVar), "Leading")) {
                break;
            }
            i17++;
        }
        v vVar8 = vVar;
        if (vVar8 != null) {
            iD = l1.d(i15, vVar8.m0(Integer.MAX_VALUE));
            iIntValue = pVar.B(vVar8, Integer.valueOf(i15)).intValue();
        } else {
            iD = i15;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size2) {
                vVar2 = null;
                break;
            }
            vVar2 = list.get(i18);
            if (fr.t.c(l1.b(vVar2), "Trailing")) {
                break;
            }
            i18++;
        }
        v vVar9 = vVar2;
        if (vVar9 != null) {
            iD = l1.d(iD, vVar9.m0(Integer.MAX_VALUE));
            iIntValue2 = pVar.B(vVar9, Integer.valueOf(i15)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                vVar3 = null;
                break;
            }
            vVar3 = list.get(i19);
            if (fr.t.c(l1.b(vVar3), "Label")) {
                break;
            }
            i19++;
        }
        v vVar10 = vVar3;
        int iIntValue5 = vVar10 != null ? pVar.B(vVar10, Integer.valueOf(c.c(iD, i15, fA))).intValue() : 0;
        int size4 = list2.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size4) {
                vVar4 = null;
                break;
            }
            vVar4 = list.get(i25);
            if (fr.t.c(l1.b(vVar4), "Prefix")) {
                break;
            }
            i25++;
        }
        v vVar11 = vVar4;
        if (vVar11 != null) {
            iIntValue3 = pVar.B(vVar11, Integer.valueOf(iD)).intValue();
            iD = l1.d(iD, vVar11.m0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size5) {
                vVar5 = null;
                break;
            }
            vVar5 = list.get(i26);
            if (fr.t.c(l1.b(vVar5), "Suffix")) {
                break;
            }
            i26++;
        }
        v vVar12 = vVar5;
        if (vVar12 != null) {
            iIntValue4 = pVar.B(vVar12, Integer.valueOf(iD)).intValue();
            iD = l1.d(iD, vVar12.m0(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list2.size();
        int i27 = 0;
        while (i27 < size6) {
            v vVar13 = list.get(i27);
            if (fr.t.c(l1.b(vVar13), "TextField")) {
                int iIntValue6 = pVar.B(vVar13, Integer.valueOf(iD)).intValue();
                List<? extends v> list3 = list;
                int size7 = list3.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size7) {
                        i16 = iIntValue6;
                        vVar6 = null;
                        break;
                    }
                    vVar6 = list.get(i28);
                    i16 = iIntValue6;
                    if (fr.t.c(l1.b(vVar6), "Hint")) {
                        break;
                    }
                    i28++;
                    iIntValue6 = i16;
                }
                v vVar14 = vVar6;
                int iIntValue7 = vVar14 != null ? pVar.B(vVar14, Integer.valueOf(iD)).intValue() : 0;
                int size8 = list3.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size8) {
                        vVar7 = null;
                        break;
                    }
                    vVar7 = list.get(i29);
                    if (fr.t.c(l1.b(vVar7), "Supporting")) {
                        break;
                    }
                    i29++;
                }
                v vVar15 = vVar7;
                return ogVar.n(wVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, i16, iIntValue5, iIntValue7, vVar15 != null ? pVar.B(vVar15, Integer.valueOf(i15)).intValue() : 0, c5.c.b(0, 0, 0, 0, 15, null), ogVar.labelPosition instanceof tn.a, fA);
            }
            i27++;
            iIntValue5 = iIntValue5;
            ogVar = this;
        }
        b.f("Collection contains no element matching the predicate.");
        throw new g();
    }

    private final int q(w wVar, List<? extends v> list, int i15, p<? super v, ? super Integer, Integer> pVar) {
        v vVar;
        v vVar2;
        v vVar3;
        v vVar4;
        v vVar5;
        v vVar6;
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            v vVar7 = list.get(i16);
            if (fr.t.c(l1.b(vVar7), "TextField")) {
                int iIntValue = pVar.B(vVar7, Integer.valueOf(i15)).intValue();
                List<? extends v> list2 = list;
                int size2 = list2.size();
                int i17 = 0;
                while (true) {
                    vVar = null;
                    if (i17 >= size2) {
                        vVar2 = null;
                        break;
                    }
                    vVar2 = list.get(i17);
                    if (fr.t.c(l1.b(vVar2), "Label")) {
                        break;
                    }
                    i17++;
                }
                v vVar8 = vVar2;
                int iIntValue2 = vVar8 != null ? pVar.B(vVar8, Integer.valueOf(i15)).intValue() : 0;
                int size3 = list2.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size3) {
                        vVar3 = null;
                        break;
                    }
                    vVar3 = list.get(i18);
                    if (fr.t.c(l1.b(vVar3), "Trailing")) {
                        break;
                    }
                    i18++;
                }
                v vVar9 = vVar3;
                int iIntValue3 = vVar9 != null ? pVar.B(vVar9, Integer.valueOf(i15)).intValue() : 0;
                int size4 = list2.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size4) {
                        vVar4 = null;
                        break;
                    }
                    vVar4 = list.get(i19);
                    if (fr.t.c(l1.b(vVar4), "Leading")) {
                        break;
                    }
                    i19++;
                }
                v vVar10 = vVar4;
                int iIntValue4 = vVar10 != null ? pVar.B(vVar10, Integer.valueOf(i15)).intValue() : 0;
                int size5 = list2.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size5) {
                        vVar5 = null;
                        break;
                    }
                    vVar5 = list.get(i25);
                    if (fr.t.c(l1.b(vVar5), "Prefix")) {
                        break;
                    }
                    i25++;
                }
                v vVar11 = vVar5;
                int iIntValue5 = vVar11 != null ? pVar.B(vVar11, Integer.valueOf(i15)).intValue() : 0;
                int size6 = list2.size();
                int i26 = 0;
                while (true) {
                    if (i26 >= size6) {
                        vVar6 = null;
                        break;
                    }
                    vVar6 = list.get(i26);
                    if (fr.t.c(l1.b(vVar6), "Suffix")) {
                        break;
                    }
                    i26++;
                }
                v vVar12 = vVar6;
                int iIntValue6 = vVar12 != null ? pVar.B(vVar12, Integer.valueOf(i15)).intValue() : 0;
                int size7 = list2.size();
                for (int i27 = 0; i27 < size7; i27++) {
                    v vVar13 = list.get(i27);
                    if (fr.t.c(l1.b(vVar13), "Hint")) {
                        vVar = vVar13;
                        break;
                    }
                }
                v vVar14 = vVar;
                return o(wVar, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, vVar14 != null ? pVar.B(vVar14, Integer.valueOf(i15)).intValue() : 0, c5.c.b(0, 0, 0, 0, 15, null), this.labelProgress.a());
            }
        }
        b.f("Collection contains no element matching the predicate.");
        throw new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(v vVar, int i15) {
        return vVar.n(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int s(v vVar, int i15) {
        return vVar.m0(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 t(og ogVar, int i15, int i16, p036e4.a2 a2Var, p036e4.a2 a2Var2, p036e4.a2 a2Var3, p036e4.a2 a2Var4, p036e4.a2 a2Var5, p0 p0Var, p036e4.a2 a2Var6, p036e4.a2 a2Var7, p036e4.a2 a2Var8, y0 y0Var, boolean z15, float f15, e4.a2.a aVar) {
        ogVar.w(aVar, i15, i16, a2Var, a2Var2, a2Var3, a2Var4, a2Var5, (p036e4.a2) p0Var.f66410a, a2Var6, a2Var7, a2Var8, ogVar.placeholderAlpha, ogVar.affixAlpha, aVar.getDensity(), y0Var.getLayoutDirection(), z15, f15, aVar.l2(ogVar.horizontalIconPadding));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(v vVar, int i15) {
        return vVar.U(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int v(v vVar, int i15) {
        return vVar.e0(i15);
    }

    private final void w(e4.a2.a aVar, int i15, int i16, p036e4.a2 a2Var, p036e4.a2 a2Var2, p036e4.a2 a2Var3, p036e4.a2 a2Var4, p036e4.a2 a2Var5, p036e4.a2 a2Var6, p036e4.a2 a2Var7, p036e4.a2 a2Var8, p036e4.a2 a2Var9, final h1 h1Var, final h1 h1Var2, float f15, t tVar, boolean z15, float f16, float f17) {
        int i17;
        int i18;
        int i19;
        int iA;
        int iA2 = z15 ? l1.a(a2Var6) : 0;
        e4.a2.a.E(aVar, a2Var8, 0, iA2, 0.0f, 4, null);
        int iA3 = (i15 - l1.a(a2Var9)) - (z15 ? l1.a(a2Var6) : 0);
        int iD = hr.a.d(this.paddingValues.getTop() * f15);
        if (a2Var != null) {
            e4.a2.a.I(aVar, a2Var, 0, iA2 + f3.c.INSTANCE.i().a(a2Var.getHeight(), iA3), 0.0f, 4, null);
        }
        if (a2Var6 != null) {
            if (z15) {
                iA = 0;
            } else {
                iA = this.singleLine ? f3.c.INSTANCE.i().a(a2Var6.getHeight(), iA3) : iD;
            }
            int iC = c.c(iA, z15 ? 0 : -(a2Var6.getHeight() / 2), f16);
            if (z15) {
                e4.a2.a.E(aVar, a2Var6, g3.m0(this.labelPosition).a(a2Var6.getWidth(), i16, tVar), iC, 0.0f, 4, null);
            } else {
                float fK = a3.k(this.paddingValues, tVar) * f15;
                float fJ = a3.j(this.paddingValues, tVar) * f15;
                float width = a2Var == null ? fK : a2Var.getWidth() + m.d(fK - f17, 0.0f);
                float width2 = a2Var2 == null ? fJ : a2Var2.getWidth() + m.d(fJ - f17, 0.0f);
                t tVar2 = t.Ltr;
                e4.a2.a.E(aVar, a2Var6, hr.a.d(c.b(g3.i0(this.labelPosition).a(a2Var6.getWidth(), i16 - hr.a.d(width + width2), tVar) + (tVar == tVar2 ? width : width2), g3.m0(this.labelPosition).a(a2Var6.getWidth(), i16 - hr.a.d(fK + fJ), tVar) + (tVar == tVar2 ? fK : fJ), f16)), iC, 0.0f, 4, null);
            }
        }
        if (a2Var3 != null) {
            i17 = iA3;
            i18 = iD;
            i19 = iA2;
            e4.a2.a.R(aVar, a2Var3, l1.c(a2Var), x(i19, this, i17, i18, a2Var6, a2Var3), 0.0f, new l() { // from class: f2.lg
                @Override // er.l
                public final Object b(Object obj) {
                    return og.y(h1Var2, (a2) obj);
                }
            }, 4, null);
        } else {
            i17 = iA3;
            i18 = iD;
            i19 = iA2;
        }
        int iC2 = l1.c(a2Var) + l1.c(a2Var3);
        e4.a2.a.I(aVar, a2Var5, iC2, x(i19, this, i17, i18, a2Var6, a2Var5), 0.0f, 4, null);
        if (a2Var7 != null) {
            e4.a2.a.R(aVar, a2Var7, iC2, x(i19, this, i17, i18, a2Var6, a2Var7), 0.0f, new l() { // from class: f2.mg
                @Override // er.l
                public final Object b(Object obj) {
                    return og.z(h1Var, (a2) obj);
                }
            }, 4, null);
        }
        if (a2Var4 != null) {
            e4.a2.a.R(aVar, a2Var4, (i16 - l1.c(a2Var2)) - a2Var4.getWidth(), x(i19, this, i17, i18, a2Var6, a2Var4), 0.0f, new l() { // from class: f2.ng
                @Override // er.l
                public final Object b(Object obj) {
                    return og.A(h1Var2, (a2) obj);
                }
            }, 4, null);
        }
        if (a2Var2 != null) {
            e4.a2.a.I(aVar, a2Var2, i16 - a2Var2.getWidth(), i19 + f3.c.INSTANCE.i().a(a2Var2.getHeight(), i17), 0.0f, 4, null);
        }
        if (a2Var9 != null) {
            e4.a2.a.I(aVar, a2Var9, 0, i19 + i17, 0.0f, 4, null);
        }
    }

    private static final int x(int i15, og ogVar, int i16, int i17, p036e4.a2 a2Var, p036e4.a2 a2Var2) {
        if (ogVar.singleLine) {
            i17 = f3.c.INSTANCE.i().a(a2Var2.getHeight(), i16);
        }
        int i18 = i15 + i17;
        return ogVar.labelPosition instanceof tn.a ? i18 : Math.max(i18, l1.a(a2Var) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(h1 h1Var, a2 a2Var) {
        a2Var.g(h1Var.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(h1 h1Var, a2 a2Var) {
        a2Var.g(h1Var.a());
        return i0.f148189a;
    }

    @Override // p036e4.w0
    public int c(w wVar, List<? extends v> list, int i15) {
        return q(wVar, list, i15, new p() { // from class: f2.kg
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(og.v((v) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, e4.a2] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41, types: [T, e4.a2] */
    /* JADX WARN: Type inference failed for: r6v60 */
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
        List<? extends v0> list2;
        v0 v0Var6;
        v0 v0Var7;
        p0 p0Var;
        long j17;
        long jB;
        long jB2;
        List<? extends v0> list3 = list;
        final float fA = this.labelProgress.a();
        int iX0 = y0Var.X0(this.paddingValues.getBottom());
        long jD = c5.b.d(j15, 0, 0, 0, 0, 10, null);
        List<? extends v0> list4 = list3;
        int size = list4.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                v0Var = null;
                break;
            }
            v0Var = list3.get(i15);
            if (fr.t.c(f0.a(v0Var), "Leading")) {
                break;
            }
            i15++;
        }
        v0 v0Var8 = v0Var;
        p036e4.a2 a2VarO1 = v0Var8 != null ? v0Var8.o0(jD) : null;
        int iC = l1.c(a2VarO1);
        int iMax = Math.max(0, l1.a(a2VarO1));
        int size2 = list4.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                v0Var2 = null;
                break;
            }
            v0Var2 = list3.get(i16);
            if (fr.t.c(f0.a(v0Var2), "Trailing")) {
                break;
            }
            i16++;
        }
        v0 v0Var9 = v0Var2;
        if (v0Var9 != null) {
            j16 = jD;
            a2VarO0 = v0Var9.o0(c5.c.j(j16, -iC, 0, 2, null));
        } else {
            j16 = jD;
            a2VarO0 = null;
        }
        int iC2 = iC + l1.c(a2VarO0);
        int iMax2 = Math.max(iMax, l1.a(a2VarO0));
        int size3 = list4.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                v0Var3 = null;
                break;
            }
            v0Var3 = list3.get(i17);
            if (fr.t.c(f0.a(v0Var3), "Prefix")) {
                break;
            }
            i17++;
        }
        v0 v0Var10 = v0Var3;
        p036e4.a2 a2VarO2 = v0Var10 != null ? v0Var10.o0(c5.c.j(j16, -iC2, 0, 2, null)) : null;
        int iC3 = iC2 + l1.c(a2VarO2);
        int iMax3 = Math.max(iMax2, l1.a(a2VarO2));
        int size4 = list4.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size4) {
                v0Var4 = null;
                break;
            }
            v0Var4 = list3.get(i18);
            if (fr.t.c(f0.a(v0Var4), "Suffix")) {
                break;
            }
            i18++;
        }
        v0 v0Var11 = v0Var4;
        p036e4.a2 a2VarO3 = v0Var11 != null ? v0Var11.o0(c5.c.j(j16, -iC3, 0, 2, null)) : null;
        int iC4 = iC3 + l1.c(a2VarO3);
        int iMax4 = Math.max(iMax3, l1.a(a2VarO3));
        boolean z15 = this.labelPosition instanceof tn.a;
        int size5 = list4.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size5) {
                v0Var5 = null;
                break;
            }
            v0Var5 = list3.get(i19);
            if (fr.t.c(f0.a(v0Var5), "Label")) {
                break;
            }
            i19++;
        }
        v0 v0Var12 = v0Var5;
        p0 p0Var2 = new p0();
        if (z15) {
            iU = v0Var12 != null ? v0Var12.U(c5.b.n(j15)) : 0;
        } else {
            int iX1 = y0Var.X0(this.paddingValues.c(y0Var.getLayoutDirection())) + y0Var.X0(this.paddingValues.b(y0Var.getLayoutDirection()));
            ?? O0 = v0Var12 != null ? v0Var12.o0(c5.c.i(j16, -c.c(iC4 + iX1, iX1, fA), -iX0)) : 0;
            p0Var2.f66410a = O0;
            if (O0 != 0) {
                jB2 = k.d((((long) Float.floatToRawIntBits(O0.getWidth())) << 32) | (((long) Float.floatToRawIntBits(O0.getHeight())) & BodyPartID.bodyIdMax));
            } else {
                jB2 = k.INSTANCE.b();
            }
            this.onLabelMeasured.b(k.c(jB2));
            iU = 0;
        }
        int size6 = list4.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size6) {
                list2 = list4;
                v0Var6 = null;
                break;
            }
            v0Var6 = list3.get(i25);
            list2 = list4;
            int i26 = size6;
            if (fr.t.c(f0.a(v0Var6), "Supporting")) {
                break;
            }
            i25++;
            size6 = i26;
            list4 = list2;
        }
        v0 v0Var13 = v0Var6;
        int iU2 = v0Var13 != null ? v0Var13.U(c5.b.n(j15)) : 0;
        int iX2 = z15 ? y0Var.X0(this.paddingValues.getTop()) : Math.max(l1.a((p036e4.a2) p0Var2.f66410a) / 2, y0Var.X0(this.paddingValues.getTop()));
        long jD2 = c5.b.d(c5.c.i(j15, -iC4, (((-iX0) - iX2) - iU) - iU2), 0, 0, 0, 0, 11, null);
        int size7 = list2.size();
        int i27 = 0;
        while (i27 < size7) {
            v0 v0Var14 = list3.get(i27);
            int i28 = iX0;
            v0 v0Var15 = v0Var13;
            if (fr.t.c(f0.a(v0Var14), "TextField")) {
                final p036e4.a2 a2VarO4 = v0Var14.o0(jD2);
                long jD3 = c5.b.d(jD2, 0, 0, 0, 0, 14, null);
                List<? extends v0> list5 = list3;
                int size8 = list5.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size8) {
                        v0Var7 = null;
                        break;
                    }
                    v0Var7 = list3.get(i29);
                    if (fr.t.c(f0.a(v0Var7), "Hint")) {
                        break;
                    }
                    i29++;
                }
                v0 v0Var16 = v0Var7;
                p036e4.a2 a2VarO5 = v0Var16 != null ? v0Var16.o0(jD3) : null;
                int iMax5 = Math.max(iMax4, Math.max(l1.a(a2VarO4), l1.a(a2VarO5)) + iX2 + i28);
                boolean z16 = z15;
                long j18 = j16;
                int iO = o(y0Var, l1.c(a2VarO1), l1.c(a2VarO0), l1.c(a2VarO2), l1.c(a2VarO3), a2VarO4.getWidth(), l1.c((p036e4.a2) p0Var2.f66410a), l1.c(a2VarO5), j15, fA);
                if (z16) {
                    p0Var = p0Var2;
                    j17 = j18;
                    ?? O1 = v0Var12 != null ? v0Var12.o0(c5.b.d(j17, 0, iO, 0, iU, 5, null)) : 0;
                    p0Var.f66410a = O1;
                    if (O1 != 0) {
                        jB = k.d((((long) Float.floatToRawIntBits(O1.getWidth())) << 32) | (((long) Float.floatToRawIntBits(O1.getHeight())) & BodyPartID.bodyIdMax));
                    } else {
                        jB = k.INSTANCE.b();
                    }
                    this.onLabelMeasured.b(k.c(jB));
                } else {
                    p0Var = p0Var2;
                    j17 = j18;
                }
                int i35 = iO;
                p036e4.a2 a2VarO6 = v0Var15 != null ? v0Var15.o0(c5.b.d(c5.c.j(j17, 0, -iMax5, 1, null), 0, iO, 0, 0, 9, null)) : null;
                int iA = l1.a(a2VarO6);
                boolean z17 = z16;
                final p0 p0Var3 = p0Var;
                final int iN = n(y0Var, l1.a(a2VarO1), l1.a(a2VarO0), l1.a(a2VarO2), l1.a(a2VarO3), a2VarO4.getHeight(), l1.a((p036e4.a2) p0Var.f66410a), l1.a(a2VarO5), l1.a(a2VarO6), j15, z17, fA);
                int iA2 = (iN - iA) - (z17 ? l1.a((p036e4.a2) p0Var3.f66410a) : 0);
                int size9 = list5.size();
                int i36 = 0;
                while (i36 < size9) {
                    v0 v0Var17 = list.get(i36);
                    if (fr.t.c(f0.a(v0Var17), "Container")) {
                        final p036e4.a2 a2VarO7 = v0Var17.o0(c5.c.a(i35 != Integer.MAX_VALUE ? i35 : 0, i35, iA2 != Integer.MAX_VALUE ? iA2 : 0, iA2));
                        final int i37 = i35;
                        final p036e4.a2 a2Var = a2VarO0;
                        final p036e4.a2 a2Var2 = a2VarO2;
                        final p036e4.a2 a2Var3 = a2VarO3;
                        final p036e4.a2 a2Var4 = a2VarO5;
                        final boolean z18 = z17;
                        final p036e4.a2 a2Var5 = a2VarO6;
                        final p036e4.a2 a2Var6 = a2VarO1;
                        return y0.j2(y0Var, i37, iN, null, new l() { // from class: f2.ig
                            @Override // er.l
                            public final Object b(Object obj) {
                                return og.t(this.f56296a, iN, i37, a2Var6, a2Var, a2Var2, a2Var3, a2VarO4, p0Var3, a2Var4, a2VarO7, a2Var5, y0Var, z18, fA, (e4.a2.a) obj);
                            }
                        }, 4, null);
                    }
                    i36++;
                    iN = iN;
                    i35 = i35;
                    a2VarO6 = a2VarO6;
                    z17 = z17;
                }
                b.f("Collection contains no element matching the predicate.");
                throw new g();
            }
            i27++;
            v0Var13 = v0Var15;
            iX0 = i28;
            z15 = z15;
            j16 = j16;
            list3 = list3;
            jD2 = jD2;
        }
        b.f("Collection contains no element matching the predicate.");
        throw new g();
    }

    @Override // p036e4.w0
    public int f(w wVar, List<? extends v> list, int i15) {
        return p(wVar, list, i15, new p() { // from class: f2.jg
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(og.r((v) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // p036e4.w0
    public int h(w wVar, List<? extends v> list, int i15) {
        return p(wVar, list, i15, new p() { // from class: f2.gg
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(og.u((v) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // p036e4.w0
    public int i(w wVar, List<? extends v> list, int i15) {
        return q(wVar, list, i15, new p() { // from class: f2.hg
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(og.s((v) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private og(l<? super k, i0> lVar, boolean z15, tn tnVar, h1 h1Var, h1 h1Var2, h1 h1Var3, d3 d3Var, float f15) {
        this.onLabelMeasured = lVar;
        this.singleLine = z15;
        this.labelPosition = tnVar;
        this.labelProgress = h1Var;
        this.placeholderAlpha = h1Var2;
        this.affixAlpha = h1Var3;
        this.paddingValues = d3Var;
        this.horizontalIconPadding = f15;
    }
}

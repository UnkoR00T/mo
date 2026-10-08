package p079n1;

import b5.v;
import c5.d;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import q4.Placeholder;
import q4.TextStyle;
import q4.e;
import u4.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001as\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "", "a", "(F)I", "Ln1/j4;", "current", "Lq4/e;", "text", "Lq4/b4;", "style", "Lc5/d;", "density", "Lu4/l$b;", "fontFamilyResolver", "", "softWrap", "Lb5/v;", "overflow", "maxLines", "minLines", "", "Lq4/e$d;", "Lq4/g0;", "placeholders", "b", "(Ln1/j4;Lq4/e;Lq4/b4;Lc5/d;Lu4/l$b;ZIIILjava/util/List;)Ln1/j4;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k4 {
    public static final int a(float f15) {
        return Math.round((float) Math.ceil(f15));
    }

    public static final j4 b(j4 j4Var, e eVar, TextStyle textStyle, d dVar, l.b bVar, boolean z15, int i15, int i16, int i17, List<e.Range<Placeholder>> list) {
        boolean z16;
        int i18;
        int i19;
        int i25;
        List<e.Range<Placeholder>> list2;
        if (t.c(j4Var.getText(), eVar) && t.c(j4Var.getStyle(), textStyle)) {
            z16 = z15;
            if (j4Var.getSoftWrap() == z16) {
                i18 = i15;
                if (v.g(j4Var.getOverflow(), i18)) {
                    i19 = i16;
                    if (j4Var.getMaxLines() == i19) {
                        i25 = i17;
                        if (j4Var.getMinLines() == i25 && t.c(j4Var.getDensity(), dVar)) {
                            list2 = list;
                            if (t.c(j4Var.h(), list2)) {
                                bVar = bVar;
                                if (j4Var.getFontFamilyResolver() == bVar) {
                                    return j4Var;
                                }
                            } else {
                                bVar = bVar;
                            }
                        } else {
                            bVar = bVar;
                            list2 = list;
                        }
                    } else {
                        bVar = bVar;
                        i25 = i17;
                        list2 = list;
                    }
                } else {
                    bVar = bVar;
                    i19 = i16;
                    i25 = i17;
                    list2 = list;
                }
            }
            return new j4(eVar, textStyle, i19, i25, z16, i18, dVar, bVar, list2, null);
        }
        z16 = z15;
        i18 = i15;
        i19 = i16;
        i25 = i17;
        list2 = list;
        return new j4(eVar, textStyle, i19, i25, z16, i18, dVar, bVar, list2, null);
    }

    public static /* synthetic */ j4 c(j4 j4Var, e eVar, TextStyle textStyle, d dVar, l.b bVar, boolean z15, int i15, int i16, int i17, List list, int i18, Object obj) {
        if ((i18 & 32) != 0) {
            z15 = true;
        }
        if ((i18 & 64) != 0) {
            i15 = v.INSTANCE.a();
        }
        if ((i18 & 128) != 0) {
            i16 = Integer.MAX_VALUE;
        }
        if ((i18 & 256) != 0) {
            i17 = 1;
        }
        return b(j4Var, eVar, textStyle, dVar, bVar, z15, i15, i16, i17, list);
    }
}

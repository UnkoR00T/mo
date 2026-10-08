package b5;

import androidx.compose.ui.graphics.Color;
import n3.o1;
import p071kotlin.Metadata;
import q4.j3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u0003*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb5/p;", "start", "stop", "", "fraction", "b", "(Lb5/p;Lb5/p;F)Lb5/p;", "Landroidx/compose/ui/graphics/Color;", "alpha", "c", "(JF)J", "Lkotlin/Function0;", "block", "d", "(FLer/a;)F", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    public static final p b(p pVar, p pVar2, float f15) {
        boolean z15 = pVar instanceof BrushStyle;
        if (!z15 && !(pVar2 instanceof BrushStyle)) {
            return p.INSTANCE.b(o1.h(pVar.getValue(), pVar2.getValue(), f15));
        }
        if (!z15 || !(pVar2 instanceof BrushStyle)) {
            return (p) j3.e(pVar, pVar2, f15);
        }
        BrushStyle cVar = (BrushStyle) pVar;
        BrushStyle cVar2 = (BrushStyle) pVar2;
        return p.INSTANCE.a((androidx.compose.ui.graphics.c) j3.e(cVar.h(), cVar2.h(), f15), e5.c.b(cVar.getAlpha(), cVar2.getAlpha(), f15));
    }

    public static final long c(long j15, float f15) {
        return (Float.isNaN(f15) || f15 >= 1.0f) ? j15 : Color.m9copywmQWz5c$default(j15, Color.m12getAlphaimpl(j15) * f15, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f15, er.a<Float> aVar) {
        return Float.isNaN(f15) ? aVar.a().floatValue() : f15;
    }
}

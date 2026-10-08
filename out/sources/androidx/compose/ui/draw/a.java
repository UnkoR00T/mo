package androidx.compose.ui.draw;

import f3.c;
import f3.m;
import n3.n1;
import p036e4.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf3/m;", "Landroidx/compose/ui/graphics/painter/a;", "painter", "", "sizeToIntrinsics", "Lf3/c;", "alignment", "Le4/l;", "contentScale", "", "alpha", "Ln3/n1;", "colorFilter", "a", "(Lf3/m;Landroidx/compose/ui/graphics/painter/a;ZLf3/c;Le4/l;FLn3/n1;)Lf3/m;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final m a(m mVar, androidx.compose.ui.graphics.painter.a aVar, boolean z15, c cVar, l lVar, float f15, n1 n1Var) {
        return mVar.u(new PainterElement(aVar, z15, cVar, lVar, f15, n1Var));
    }

    public static /* synthetic */ m b(m mVar, androidx.compose.ui.graphics.painter.a aVar, boolean z15, c cVar, l lVar, float f15, n1 n1Var, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        boolean z16 = z15;
        if ((i15 & 4) != 0) {
            cVar = c.INSTANCE.e();
        }
        c cVar2 = cVar;
        if ((i15 & 8) != 0) {
            lVar = l.INSTANCE.f();
        }
        l lVar2 = lVar;
        if ((i15 & 16) != 0) {
            f15 = 1.0f;
        }
        float f16 = f15;
        if ((i15 & 32) != 0) {
            n1Var = null;
        }
        return a(mVar, aVar, z16, cVar2, lVar2, f16, n1Var);
    }
}

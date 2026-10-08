package io.sentry.android.replay.util;

import android.graphics.Rect;
import androidx.compose.ui.graphics.Color;
import c5.r;
import java.lang.reflect.Field;
import java.util.List;
import n3.p1;
import p036e4.ModifierInfo;
import p036e4.b0;
import p036e4.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\r\u001a\u00020\f*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/graphics/painter/a;", "b", "(Landroidx/compose/ui/node/g;)Landroidx/compose/ui/graphics/painter/a;", "", "d", "(Landroidx/compose/ui/graphics/painter/a;)Z", "Lio/sentry/android/replay/util/m;", "c", "(Landroidx/compose/ui/node/g;)Lio/sentry/android/replay/util/m;", "Le4/b0;", "rootCoordinates", "Landroid/graphics/Rect;", "a", "(Le4/b0;Le4/b0;)Landroid/graphics/Rect;", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class j {
    public static final Rect a(b0 b0Var, b0 b0Var2) {
        if (b0Var2 == null) {
            b0Var2 = c0.e(b0Var);
        }
        float fG = r.g(b0Var2.b());
        float f15 = r.f(b0Var2.b());
        m3.g gVarZ0 = b0.z0(b0Var2, b0Var, false, 2, null);
        float left = gVarZ0.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fG) {
            left = fG;
        }
        float top = gVarZ0.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > f15) {
            top = f15;
        }
        float right = gVarZ0.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= fG) {
            fG = right;
        }
        float bottom = gVarZ0.getBottom();
        float f16 = bottom >= 0.0f ? bottom : 0.0f;
        if (f16 <= f15) {
            f15 = f16;
        }
        if (left == fG || top == f15) {
            return new Rect();
        }
        long jW = b0Var2.W(m3.f.a(left, top));
        long jW2 = b0Var2.W(m3.f.a(fG, top));
        long jW3 = b0Var2.W(m3.f.a(fG, f15));
        long jW4 = b0Var2.W(m3.f.a(left, f15));
        float fM = m3.e.m(jW);
        float fM2 = m3.e.m(jW2);
        float fM3 = m3.e.m(jW4);
        float fM4 = m3.e.m(jW3);
        float fMin = Math.min(fM, Math.min(fM2, Math.min(fM3, fM4)));
        float fMax = Math.max(fM, Math.max(fM2, Math.max(fM3, fM4)));
        float fN = m3.e.n(jW);
        float fN2 = m3.e.n(jW2);
        float fN3 = m3.e.n(jW4);
        float fN4 = m3.e.n(jW3);
        return new Rect((int) fMin, (int) Math.min(fN, Math.min(fN2, Math.min(fN3, fN4))), (int) fMax, (int) Math.max(fN, Math.max(fN2, Math.max(fN3, fN4))));
    }

    public static final androidx.compose.ui.graphics.painter.a b(androidx.compose.ui.node.g gVar) {
        List<ModifierInfo> listU0 = gVar.u0();
        int size = listU0.size();
        for (int i15 = 0; i15 < size; i15++) {
            f3.m modifier = listU0.get(i15).getModifier();
            if (fu.r.d0(modifier.getClass().getName(), "Painter", false, 2, null)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    if (obj instanceof androidx.compose.ui.graphics.painter.a) {
                        return (androidx.compose.ui.graphics.painter.a) obj;
                    }
                } catch (Throwable unused) {
                }
                return null;
            }
        }
        return null;
    }

    public static final TextAttributes c(androidx.compose.ui.node.g gVar) {
        List<ModifierInfo> listU0 = gVar.u0();
        int size = listU0.size();
        Color colorM0boximpl = null;
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            f3.m modifier = listU0.get(i15).getModifier();
            String name = modifier.getClass().getName();
            if (fu.r.d0(name, "Text", false, 2, null)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    p1 p1Var = obj instanceof p1 ? (p1) obj : null;
                    colorM0boximpl = p1Var != null ? Color.m0boximpl(p1Var.a()) : null;
                } catch (Throwable unused) {
                }
            } else if (fu.r.d0(name, "Fill", false, 2, null)) {
                z15 = true;
            }
        }
        return new TextAttributes(colorM0boximpl, z15, null);
    }

    public static final boolean d(androidx.compose.ui.graphics.painter.a aVar) {
        String name = aVar.getClass().getName();
        return (fu.r.d0(name, "Vector", false, 2, null) || fu.r.d0(name, "Color", false, 2, null) || fu.r.d0(name, "Brush", false, 2, null)) ? false : true;
    }
}

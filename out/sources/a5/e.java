package a5;

import android.graphics.Paint;
import n3.a3;
import n3.b3;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln3/b3;", "Landroid/graphics/Paint$Join;", "b", "(I)Landroid/graphics/Paint$Join;", "Ln3/a3;", "Landroid/graphics/Paint$Cap;", "a", "(I)Landroid/graphics/Paint$Cap;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final Paint.Cap a(int i15) {
        a3.Companion companion = a3.INSTANCE;
        if (a3.e(i15, companion.a())) {
            return Paint.Cap.BUTT;
        }
        if (a3.e(i15, companion.b())) {
            return Paint.Cap.ROUND;
        }
        return a3.e(i15, companion.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public static final Paint.Join b(int i15) {
        b3.Companion companion = b3.INSTANCE;
        if (b3.e(i15, companion.b())) {
            return Paint.Join.MITER;
        }
        if (b3.e(i15, companion.c())) {
            return Paint.Join.ROUND;
        }
        return b3.e(i15, companion.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}

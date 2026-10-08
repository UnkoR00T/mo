package n3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\" \u0010\u0006\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0007"}, d2 = {"Ln3/y2;", "a", "Ln3/y2;", "()Ln3/y2;", "getRectangleShape$annotations", "()V", "RectangleShape", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y2 f131064a = new a();

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"n3/t2$a", "Ln3/y2;", "Lm3/k;", "size", "Lc5/t;", "layoutDirection", "Lc5/d;", "density", "Ln3/i2$b;", "b", "(JLc5/t;Lc5/d;)Ln3/i2$b;", "", "toString", "()Ljava/lang/String;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements y2 {
        a() {
        }

        @Override // n3.y2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i2.b a(long size, c5.t layoutDirection, c5.d density) {
            return new i2.b(m3.l.c(size));
        }

        public String toString() {
            return "RectangleShape";
        }
    }

    public static final y2 a() {
        return f131064a;
    }
}

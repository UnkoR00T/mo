package l2;

import b5.LineHeightStyle;
import p071kotlin.Metadata;
import q4.TextStyle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0001\u0010\t¨\u0006\u000b"}, d2 = {"Lb5/h;", "a", "Lb5/h;", "getDefaultLineHeightStyle", "()Lb5/h;", "DefaultLineHeightStyle", "Lq4/b4;", "b", "Lq4/b4;", "()Lq4/b4;", "DefaultTextStyle", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LineHeightStyle f114948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TextStyle f114949b;

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.d.INSTANCE.b(), (fr.k) null);
        f114948a = lineHeightStyle;
        f114949b = TextStyle.e(TextStyle.INSTANCE.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, h2.x0.a(), lineHeightStyle, 0, 0, null, 15204351, null);
    }

    public static final TextStyle a() {
        return f114949b;
    }
}

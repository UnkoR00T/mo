package p012a2;

import b5.LineHeightStyle;
import er.a;
import fr.k;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import q4.TextStyle;
import u4.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\u000f\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\" \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lq4/b4;", "Lu4/l;", "default", "f", "(Lq4/b4;Lu4/l;)Lq4/b4;", "Lb5/h;", "a", "Lb5/h;", "getDefaultLineHeightStyle", "()Lb5/h;", "DefaultLineHeightStyle", "b", "Lq4/b4;", "d", "()Lq4/b4;", "DefaultTextStyle", "Lm2/b4;", "La2/k5;", "c", "Lm2/b4;", "e", "()Lm2/b4;", "LocalTypography", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LineHeightStyle f1795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TextStyle f1796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b4<Typography> f1797c;

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.d.INSTANCE.b(), (k) null);
        f1795a = lineHeightStyle;
        f1796b = TextStyle.e(TextStyle.INSTANCE.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, q1.a(), lineHeightStyle, 0, 0, null, 15204351, null);
        f1797c = d0.j(new a() { // from class: a2.l5
            @Override // er.a
            public final Object a() {
                return m5.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typography b() {
        return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public static final TextStyle d() {
        return f1796b;
    }

    public static final b4<Typography> e() {
        return f1797c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle f(TextStyle textStyle, l lVar) {
        return textStyle.l() != null ? textStyle : TextStyle.e(textStyle, 0L, 0L, null, null, null, lVar, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
    }
}

package p012a2;

import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"La2/m2;", "", "<init>", "()V", "La2/a1;", "a", "(Lm2/r;I)La2/a1;", "colors", "La2/k5;", "c", "(Lm2/r;I)La2/k5;", "typography", "La2/s3;", "b", "(Lm2/r;I)La2/s3;", "shapes", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m2 f1788a = new m2();

    private m2() {
    }

    public final Colors a(r rVar, int i15) {
        if (t.k()) {
            t.o(-1462282791, i15, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
        }
        Colors colors = (Colors) rVar.N(c1.e());
        if (t.k()) {
            t.n();
        }
        return colors;
    }

    public final Shapes b(r rVar, int i15) {
        if (t.k()) {
            t.o(-1586253541, i15, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:109)");
        }
        Shapes shapes = (Shapes) rVar.N(u3.c());
        if (t.k()) {
            t.n();
        }
        return shapes;
    }

    public final Typography c(r rVar, int i15) {
        if (t.k()) {
            t.o(-1630198856, i15, -1, "androidx.compose.material.MaterialTheme.<get-typography> (MaterialTheme.kt:105)");
        }
        Typography k5Var = (Typography) rVar.N(m5.e());
        if (t.k()) {
            t.n();
        }
        return k5Var;
    }
}

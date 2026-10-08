package op;

import bp.i;
import bp.k;
import io.sentry.android.core.c2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f148056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f148057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f148058c;

    public a(bp.a aVar, b bVar) {
        if (aVar.size() <= 0 || !(aVar.g4(aVar.size() - 1) instanceof i)) {
            this.f148056a = new float[aVar.size()];
            c(aVar);
            this.f148057b = null;
        } else {
            this.f148056a = new float[aVar.size() - 1];
            c(aVar);
            bp.b bVarG4 = aVar.g4(aVar.size() - 1);
            if (bVarG4 instanceof i) {
                this.f148057b = (i) bVarG4;
            } else {
                c2.g("PdfBox-Android", "pattern name in " + aVar + " isn't a name, ignored");
                this.f148057b = i.J3("Unknown");
            }
        }
        this.f148058c = bVar;
    }

    private void c(bp.a aVar) {
        for (int i15 = 0; i15 < this.f148056a.length; i15++) {
            bp.b bVarG4 = aVar.g4(i15);
            if (bVarG4 instanceof k) {
                this.f148056a[i15] = ((k) bVarG4).i3();
            } else {
                c2.g("PdfBox-Android", "color component " + i15 + " in " + aVar + " isn't a number, ignored");
            }
        }
    }

    public b a() {
        return this.f148058c;
    }

    public float[] b() {
        b bVar = this.f148058c;
        return bVar == null ? (float[]) this.f148056a.clone() : Arrays.copyOf(this.f148056a, bVar.e());
    }

    public bp.a d() {
        bp.a aVar = new bp.a();
        aVar.q4(this.f148056a);
        i iVar = this.f148057b;
        if (iVar != null) {
            aVar.A3(iVar);
        }
        return aVar;
    }

    public String toString() {
        return "PDColor{components=" + Arrays.toString(this.f148056a) + ", patternName=" + this.f148057b + "}";
    }

    public a(float[] fArr, b bVar) {
        this.f148056a = (float[]) fArr.clone();
        this.f148057b = null;
        this.f148058c = bVar;
    }
}

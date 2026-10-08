package hp;

import bp.i;
import bp.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f86157a;

    public h(gp.c cVar) {
        this.f86157a = cVar.H().A3();
    }

    public bp.g a() {
        return this.f86157a.l5();
    }

    public OutputStream b() {
        return this.f86157a.n5();
    }

    @Override // hp.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o D1() {
        return this.f86157a;
    }

    public List<i> d() {
        bp.b bVarT5 = this.f86157a.t5();
        if (bVarT5 instanceof i) {
            i iVar = (i) bVarT5;
            return new a(iVar, iVar, this.f86157a, i.f20933y3);
        }
        if (bVarT5 instanceof bp.a) {
            return ((bp.a) bVarT5).toList();
        }
        return null;
    }

    public int e() {
        return this.f86157a.y4(i.f20699b5, 0);
    }

    public byte[] f() throws Throwable {
        bp.g gVarA;
        try {
            gVarA = a();
            try {
                byte[] bArrE = dp.a.e(gVarA);
                if (gVarA != null) {
                    gVarA.close();
                }
                return bArrE;
            } catch (Throwable th4) {
                th = th4;
                if (gVarA != null) {
                    gVarA.close();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            gVarA = null;
        }
    }

    public h(o oVar) {
        this.f86157a = oVar;
    }

    public h(gp.c cVar, InputStream inputStream, i iVar) {
        this(cVar, inputStream, (bp.b) iVar);
    }

    private h(gp.c cVar, InputStream inputStream, bp.b bVar) throws IOException {
        OutputStream outputStreamO5 = null;
        try {
            o oVarA3 = cVar.H().A3();
            this.f86157a = oVarA3;
            outputStreamO5 = oVarA3.o5(bVar);
            dp.a.c(inputStream, outputStreamO5);
        } finally {
            if (outputStreamO5 != null) {
                outputStreamO5.close();
            }
            inputStream.close();
        }
    }
}

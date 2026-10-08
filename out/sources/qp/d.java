package qp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bp.g;
import bp.i;
import bp.l;
import bp.o;
import cp.k;
import gp.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends np.c implements hp.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SoftReference<Bitmap> f167844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private op.b f167845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f167846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f167847e;

    public d(gp.c cVar, InputStream inputStream, bp.b bVar, int i15, int i16, int i17, op.b bVar2) {
        super(f(cVar, inputStream), i.f20912w4);
        this.f167846d = Integer.MAX_VALUE;
        D1().Y4(i.f20933y3, bVar);
        this.f167847e = null;
        this.f167845c = null;
        j(i17);
        m(i15);
        l(i16);
        k(bVar2);
    }

    public static d e(gp.c cVar, byte[] bArr, String str) throws IOException {
        try {
            yp.b bVarA = yp.c.a(bArr);
            if (bVarA == null) {
                throw new IllegalArgumentException("Image type not supported: " + str);
            }
            if (bVarA.equals(yp.b.JPEG)) {
                return b.a(cVar, bArr);
            }
            if (bVarA.equals(yp.b.TIFF)) {
                try {
                    return a.a(cVar, bArr);
                } catch (IOException unused) {
                    bVarA = yp.b.PNG;
                }
            }
            if (bVarA.equals(yp.b.BMP) || bVarA.equals(yp.b.GIF) || bVarA.equals(yp.b.PNG)) {
                return c.b(cVar, BitmapFactory.decodeStream(new ByteArrayInputStream(bArr)));
            }
            throw new IllegalArgumentException("Image type " + bVarA + " not supported: " + str);
        } catch (IOException e15) {
            throw new IOException("Could not determine file type: " + str, e15);
        }
    }

    private static o f(gp.c cVar, InputStream inputStream) throws Throwable {
        OutputStream outputStreamQ5;
        o oVarA3 = cVar.H().A3();
        try {
            outputStreamQ5 = oVarA3.q5();
            try {
                dp.a.c(inputStream, outputStreamQ5);
                if (outputStreamQ5 != null) {
                    outputStreamQ5.close();
                }
                return oVarA3;
            } catch (Throwable th4) {
                th = th4;
                if (outputStreamQ5 != null) {
                    outputStreamQ5.close();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            outputStreamQ5 = null;
        }
    }

    public int g() {
        if (i()) {
            return 1;
        }
        return D1().z4(i.C0, i.M0);
    }

    public op.b h() throws IOException {
        l lVar;
        h hVar;
        if (this.f167845c == null) {
            bp.b bVarD4 = D1().D4(i.I1, i.V1);
            if (bVarD4 == null) {
                if (i()) {
                    return op.d.f148060c;
                }
                throw new IOException("could not determine color space");
            }
            if (!(bVarD4 instanceof l) || (hVar = this.f167847e) == null || hVar.n() == null) {
                lVar = null;
            } else {
                lVar = (l) bVarD4;
                op.b bVarC = this.f167847e.n().c(lVar);
                this.f167845c = bVarC;
                if (bVarC != null) {
                    return bVarC;
                }
            }
            this.f167845c = op.b.a(bVarD4, this.f167847e);
            if (lVar != null) {
                this.f167847e.n().b(lVar, this.f167845c);
            }
        }
        return this.f167845c;
    }

    public boolean i() {
        return D1().h4(i.f20923x4, false);
    }

    public void j(int i15) {
        D1().W4(i.C0, i15);
    }

    public void k(op.b bVar) {
        D1().Y4(i.I1, bVar != null ? bVar.D1() : null);
        this.f167845c = null;
        this.f167844b = null;
    }

    public void l(int i15) {
        D1().W4(i.f20737f4, i15);
    }

    public void m(int i15) {
        D1().W4(i.H9, i15);
    }

    public d(hp.h hVar, h hVar2) throws Throwable {
        g gVarA;
        super(hVar, i.f20912w4);
        this.f167846d = Integer.MAX_VALUE;
        this.f167847e = hVar2;
        List<i> listD = hVar.d();
        if (listD == null || listD.isEmpty() || !i.L4.equals(listD.get(listD.size() - 1))) {
            return;
        }
        List listAsList = Arrays.asList(i.H9, i.f20737f4, i.I1);
        o oVarD1 = hVar.D1();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            if (!oVarD1.J3((i) it.next())) {
                try {
                    gVarA = hVar.a();
                    try {
                        k kVarH = gVarA.h();
                        hVar.D1().i3(kVarH.b());
                        this.f167845c = kVarH.a();
                        dp.a.b(gVarA);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        dp.a.b(gVarA);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    gVarA = null;
                }
            }
        }
    }
}

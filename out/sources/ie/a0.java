package ie;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class a0 implements zd.j<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f91870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce.b f91871b;

    static class a implements o.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f91872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ve.d f91873b;

        a(y yVar, ve.d dVar) {
            this.f91872a = yVar;
            this.f91873b = dVar;
        }

        @Override // ie.o.b
        public void a() {
            this.f91872a.h();
        }

        @Override // ie.o.b
        public void b(ce.d dVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionB = this.f91873b.b();
            if (iOExceptionB != null) {
                if (bitmap == null) {
                    throw iOExceptionB;
                }
                dVar.c(bitmap);
                throw iOExceptionB;
            }
        }
    }

    public a0(o oVar, ce.b bVar) {
        this.f91870a = oVar;
        this.f91871b = bVar;
    }

    @Override // zd.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public be.v<Bitmap> b(InputStream inputStream, int i15, int i16, zd.h hVar) {
        boolean z15;
        y yVar;
        if (inputStream instanceof y) {
            yVar = (y) inputStream;
            z15 = false;
        } else {
            z15 = true;
            yVar = new y(inputStream, this.f91871b);
        }
        ve.d dVarH = ve.d.h(yVar);
        try {
            return this.f91870a.f(new ve.i(dVarH), i15, i16, hVar, new a(yVar, dVarH));
        } finally {
            dVarH.m();
            if (z15) {
                yVar.m();
            }
        }
    }

    @Override // zd.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, zd.h hVar) {
        return this.f91870a.p(inputStream);
    }
}

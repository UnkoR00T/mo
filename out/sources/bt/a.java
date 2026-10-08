package bt;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f21380a = 0;

    w a() {
        return new w(this);
    }

    public void d(OutputStream outputStream) throws IOException {
        int iE = e();
        f fVarJ = f.J(outputStream, f.u(f.v(iE) + iE));
        fVarJ.o0(iE);
        m(fVarJ);
        fVarJ.I();
    }

    /* JADX INFO: renamed from: bt.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0557a<BuilderType extends AbstractC0557a> implements q.a {
        protected static w n(q qVar) {
            return new w(qVar);
        }

        @Override // bt.q.a
        public abstract BuilderType l(e eVar, g gVar);

        /* JADX INFO: renamed from: bt.a$a$a, reason: collision with other inner class name */
        static final class C0558a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f21381a;

            C0558a(InputStream inputStream, int i15) {
                super(inputStream);
                this.f21381a = i15;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f21381a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f21381a <= 0) {
                    return -1;
                }
                int i15 = super.read();
                if (i15 >= 0) {
                    this.f21381a--;
                }
                return i15;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j15) throws IOException {
                long jSkip = super.skip(Math.min(j15, this.f21381a));
                if (jSkip >= 0) {
                    this.f21381a = (int) (((long) this.f21381a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i15, int i16) throws IOException {
                int i17 = this.f21381a;
                if (i17 <= 0) {
                    return -1;
                }
                int i18 = super.read(bArr, i15, Math.min(i16, i17));
                if (i18 >= 0) {
                    this.f21381a -= i18;
                }
                return i18;
            }
        }
    }
}

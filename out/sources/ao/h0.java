package ao;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {
    public static yn.l a(ho.a aVar) {
        boolean z15;
        try {
            try {
                aVar.a0();
                z15 = false;
                try {
                    return bo.p.V.b(aVar);
                } catch (EOFException e15) {
                    e = e15;
                    if (z15) {
                        return yn.n.f228069a;
                    }
                    throw new yn.t(e);
                }
            } catch (EOFException e16) {
                e = e16;
                z15 = true;
            }
        } catch (ho.d e17) {
            throw new yn.t(e17);
        } catch (IOException e18) {
            throw new yn.m(e18);
        } catch (NumberFormatException e19) {
            throw new yn.t(e19);
        }
    }

    public static void b(yn.l lVar, ho.c cVar) {
        bo.p.V.d(cVar, lVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    private static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f13913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f13914b = new a();

        private static class a implements CharSequence {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private char[] f13915a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f13916b;

            private a() {
            }

            void a(char[] cArr) {
                this.f13915a = cArr;
                this.f13916b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i15) {
                return this.f13915a[i15];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f13915a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i15, int i16) {
                return new String(this.f13915a, i15, i16 - i15);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f13916b == null) {
                    this.f13916b = new String(this.f13915a);
                }
                return this.f13916b;
            }
        }

        b(Appendable appendable) {
            this.f13913a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i15, int i16) throws IOException {
            this.f13914b.a(cArr);
            this.f13913a.append(this.f13914b, i15, i16 + i15);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f13913a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i15) throws IOException {
            this.f13913a.append((char) i15);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i15, int i16) throws IOException {
            this.f13913a.append(charSequence, i15, i16);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i15, int i16) throws IOException {
            Objects.requireNonNull(str);
            this.f13913a.append(str, i15, i16 + i15);
        }
    }
}

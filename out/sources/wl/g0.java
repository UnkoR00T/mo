package wl;

import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 {
    public static com.google.gson.l a(zl.a aVar) {
        boolean z15;
        try {
            try {
                aVar.a0();
                z15 = false;
                try {
                    return TypeAdapters.V.b(aVar);
                } catch (EOFException e15) {
                    e = e15;
                    if (z15) {
                        return com.google.gson.n.f36856a;
                    }
                    throw new com.google.gson.u(e);
                }
            } catch (EOFException e16) {
                e = e16;
                z15 = true;
            }
        } catch (zl.d e17) {
            throw new com.google.gson.u(e17);
        } catch (IOException e18) {
            throw new com.google.gson.m(e18);
        } catch (NumberFormatException e19) {
            throw new com.google.gson.u(e19);
        }
    }

    public static void b(com.google.gson.l lVar, zl.c cVar) {
        TypeAdapters.V.d(cVar, lVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    private static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f214031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f214032b = new a();

        private static class a implements CharSequence {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private char[] f214033a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f214034b;

            private a() {
            }

            void a(char[] cArr) {
                this.f214033a = cArr;
                this.f214034b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i15) {
                return this.f214033a[i15];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f214033a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i15, int i16) {
                return new String(this.f214033a, i15, i16 - i15);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f214034b == null) {
                    this.f214034b = new String(this.f214033a);
                }
                return this.f214034b;
            }
        }

        b(Appendable appendable) {
            this.f214031a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i15, int i16) throws IOException {
            this.f214032b.a(cArr);
            this.f214031a.append(this.f214032b, i15, i16 + i15);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f214031a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i15) throws IOException {
            this.f214031a.append((char) i15);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i15, int i16) throws IOException {
            this.f214031a.append(charSequence, i15, i16);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i15, int i16) throws IOException {
            Objects.requireNonNull(str);
            this.f214031a.append(str, i15, i16 + i15);
        }
    }
}

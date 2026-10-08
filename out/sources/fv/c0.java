package fv;

import java.io.File;
import java.nio.charset.Charset;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import vv.k0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lfv/c0;", "", "<init>", "()V", "Lfv/x;", "b", "()Lfv/x;", "", "a", "()J", "Lvv/f;", "sink", "Loq/i0;", "h", "(Lvv/f;)V", "", "f", "()Z", "g", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fv.c0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u0007*\u00020\u00132\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lfv/c0$a;", "", "<init>", "()V", "", "Lfv/x;", CMSAttributeTableGenerator.CONTENT_TYPE, "Lfv/c0;", "f", "(Ljava/lang/String;Lfv/x;)Lfv/c0;", "Lvv/h;", "g", "(Lvv/h;Lfv/x;)Lfv/c0;", "", "", "offset", "byteCount", "h", "([BLfv/x;II)Lfv/c0;", "Ljava/io/File;", "e", "(Ljava/io/File;Lfv/x;)Lfv/c0;", "content", "a", "(Lfv/x;Ljava/lang/String;)Lfv/c0;", "b", "(Lfv/x;Lvv/h;)Lfv/c0;", "d", "(Lfv/x;[BII)Lfv/c0;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: fv.c0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"fv/c0$a$a", "Lfv/c0;", "Lfv/x;", "b", "()Lfv/x;", "", "a", "()J", "Lvv/f;", "sink", "Loq/i0;", "h", "(Lvv/f;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C1511a extends c0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f67278b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f67279c;

            C1511a(x xVar, File file) {
                this.f67278b = xVar;
                this.f67279c = file;
            }

            @Override // fv.c0
            public long a() {
                return this.f67279c.length();
            }

            @Override // fv.c0
            /* JADX INFO: renamed from: b, reason: from getter */
            public x getOrg.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE java.lang.String() {
                return this.f67278b;
            }

            @Override // fv.c0
            public void h(vv.f sink) {
                k0 k0VarI = vv.v.i(this.f67279c);
                try {
                    sink.U1(k0VarI);
                    ar.b.a(k0VarI, null);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ar.b.a(k0VarI, th4);
                        throw th5;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: fv.c0$a$b */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"fv/c0$a$b", "Lfv/c0;", "Lfv/x;", "b", "()Lfv/x;", "", "a", "()J", "Lvv/f;", "sink", "Loq/i0;", "h", "(Lvv/f;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b extends c0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f67280b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ vv.h f67281c;

            b(x xVar, vv.h hVar) {
                this.f67280b = xVar;
                this.f67281c = hVar;
            }

            @Override // fv.c0
            public long a() {
                return this.f67281c.Q();
            }

            @Override // fv.c0
            /* JADX INFO: renamed from: b, reason: from getter */
            public x getOrg.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE java.lang.String() {
                return this.f67280b;
            }

            @Override // fv.c0
            public void h(vv.f sink) {
                sink.M0(this.f67281c);
            }
        }

        /* JADX INFO: renamed from: fv.c0$a$c */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"fv/c0$a$c", "Lfv/c0;", "Lfv/x;", "b", "()Lfv/x;", "", "a", "()J", "Lvv/f;", "sink", "Loq/i0;", "h", "(Lvv/f;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c extends c0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f67282b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f67283c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ byte[] f67284d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f67285e;

            c(x xVar, int i15, byte[] bArr, int i16) {
                this.f67282b = xVar;
                this.f67283c = i15;
                this.f67284d = bArr;
                this.f67285e = i16;
            }

            @Override // fv.c0
            public long a() {
                return this.f67283c;
            }

            @Override // fv.c0
            /* JADX INFO: renamed from: b, reason: from getter */
            public x getOrg.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE java.lang.String() {
                return this.f67282b;
            }

            @Override // fv.c0
            public void h(vv.f sink) {
                sink.write(this.f67284d, this.f67285e, this.f67283c);
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ c0 i(Companion companion, x xVar, byte[] bArr, int i15, int i16, int i17, Object obj) {
            if ((i17 & 4) != 0) {
                i15 = 0;
            }
            if ((i17 & 8) != 0) {
                i16 = bArr.length;
            }
            return companion.d(xVar, bArr, i15, i16);
        }

        public static /* synthetic */ c0 j(Companion companion, vv.h hVar, x xVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                xVar = null;
            }
            return companion.g(hVar, xVar);
        }

        public static /* synthetic */ c0 k(Companion companion, byte[] bArr, x xVar, int i15, int i16, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                xVar = null;
            }
            if ((i17 & 2) != 0) {
                i15 = 0;
            }
            if ((i17 & 4) != 0) {
                i16 = bArr.length;
            }
            return companion.h(bArr, xVar, i15, i16);
        }

        @oq.a
        public final c0 a(x contentType, String content) {
            return f(content, contentType);
        }

        @oq.a
        public final c0 b(x contentType, vv.h content) {
            return g(content, contentType);
        }

        @oq.a
        public final c0 c(x xVar, byte[] bArr) {
            return i(this, xVar, bArr, 0, 0, 12, null);
        }

        @oq.a
        public final c0 d(x contentType, byte[] content, int offset, int byteCount) {
            return h(content, contentType, offset, byteCount);
        }

        public final c0 e(File file, x xVar) {
            return new C1511a(xVar, file);
        }

        public final c0 f(String str, x xVar) {
            Charset charset = fu.d.UTF_8;
            if (xVar != null) {
                Charset charsetD = x.d(xVar, null, 1, null);
                if (charsetD == null) {
                    xVar = x.INSTANCE.b(xVar + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            byte[] bytes = str.getBytes(charset);
            return h(bytes, xVar, 0, bytes.length);
        }

        public final c0 g(vv.h hVar, x xVar) {
            return new b(xVar, hVar);
        }

        public final c0 h(byte[] bArr, x xVar, int i15, int i16) {
            gv.d.l(bArr.length, i15, i16);
            return new c(xVar, i16, bArr, i15);
        }

        private Companion() {
        }
    }

    @oq.a
    public static final c0 c(x xVar, String str) {
        return INSTANCE.a(xVar, str);
    }

    @oq.a
    public static final c0 d(x xVar, vv.h hVar) {
        return INSTANCE.b(xVar, hVar);
    }

    @oq.a
    public static final c0 e(x xVar, byte[] bArr) {
        return INSTANCE.c(xVar, bArr);
    }

    public long a() {
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public abstract x getOrg.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE java.lang.String();

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract void h(vv.f sink);
}

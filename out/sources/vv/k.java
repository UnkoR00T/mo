package vv;

import java.io.Closeable;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 /2\u00060\u0001j\u0002`\u0002:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b \u0010\u001cJ\u0015\u0010!\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u001eJ!\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H&¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b,\u0010$J\u0015\u0010-\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020\"H\u0016¢\u0006\u0004\b.\u0010\u0004¨\u00060"}, d2 = {"Lvv/k;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "Lvv/b0;", "path", "Lvv/j;", "J", "(Lvv/b0;)Lvv/j;", "K", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lvv/b0;)Z", "dir", "", "I", "(Lvv/b0;)Ljava/util/List;", "file", "Lvv/i;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lvv/b0;)Lvv/i;", "Lvv/k0;", "O", "(Lvv/b0;)Lvv/k0;", "mustCreate", "Lvv/j0;", "N", "(Lvv/b0;Z)Lvv/j0;", "M", "(Lvv/b0;)Lvv/j0;", "mustExist", "h", "b", "Loq/i0;", "u", "(Lvv/b0;Z)V", "r", "p", "(Lvv/b0;)V", "source", "target", "m", "(Lvv/b0;Lvv/b0;)V", "E", "C", "close", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class k implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f208405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f208406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f208407d;

    static {
        k tVar;
        try {
            Class.forName("java.nio.file.Files");
            tVar = new u();
        } catch (ClassNotFoundException unused) {
            tVar = new t();
        }
        f208405b = tVar;
        f208406c = b0.Companion.e(b0.INSTANCE, System.getProperty("java.io.tmpdir"), false, 1, null);
        f208407d = new wv.l(wv.l.class.getClassLoader(), false, null, 4, null);
    }

    public static /* synthetic */ void y(k kVar, b0 b0Var, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        kVar.u(b0Var, z15);
    }

    public final void C(b0 path) {
        E(path, false);
    }

    public abstract void E(b0 path, boolean mustExist);

    public final boolean H(b0 path) {
        return wv.d.b(this, path);
    }

    public abstract List<b0> I(b0 dir);

    public final j J(b0 path) {
        return wv.d.c(this, path);
    }

    public abstract j K(b0 path);

    public abstract i L(b0 file);

    public final j0 M(b0 file) {
        return N(file, false);
    }

    public abstract j0 N(b0 file, boolean mustCreate);

    public abstract k0 O(b0 file);

    public final j0 b(b0 file) {
        return h(file, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract j0 h(b0 file, boolean mustExist);

    public abstract void m(b0 source, b0 target);

    public final void p(b0 dir) {
        r(dir, false);
    }

    public final void r(b0 dir, boolean mustCreate) {
        wv.d.a(this, dir, mustCreate);
    }

    public abstract void u(b0 dir, boolean mustCreate);
}

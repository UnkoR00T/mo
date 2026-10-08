package vv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 62\u00020\u0001:\u00017B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010$J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00105¨\u00068"}, d2 = {"Lvv/n0;", "Lvv/k;", "Lvv/b0;", "zipPath", "fileSystem", "", "Lwv/n;", "entries", "", "comment", "<init>", "(Lvv/b0;Lvv/k;Ljava/util/Map;Ljava/lang/String;)V", "path", "V", "(Lvv/b0;)Lvv/b0;", "dir", "", "throwOnFailure", "", "Z", "(Lvv/b0;Z)Ljava/util/List;", "Lvv/j;", "K", "(Lvv/b0;)Lvv/j;", "file", "Lvv/i;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lvv/b0;)Lvv/i;", "I", "(Lvv/b0;)Ljava/util/List;", "Lvv/k0;", "O", "(Lvv/b0;)Lvv/k0;", "mustCreate", "Lvv/j0;", "N", "(Lvv/b0;Z)Lvv/j0;", "mustExist", "h", "Loq/i0;", "u", "(Lvv/b0;Z)V", "source", "target", "m", "(Lvv/b0;Lvv/b0;)V", "E", "e", "Lvv/b0;", "f", "Lvv/k;", "g", "Ljava/util/Map;", "Ljava/lang/String;", "j", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n0 extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f208416j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final b0 f208417k = b0.Companion.e(b0.INSTANCE, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0 zipPath;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k fileSystem;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<b0, wv.n> entries;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String comment;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvv/n0$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public n0(b0 b0Var, k kVar, Map<b0, wv.n> map, String str) {
        this.zipPath = b0Var;
        this.fileSystem = kVar;
        this.entries = map;
        this.comment = str;
    }

    private final b0 V(b0 path) {
        return f208417k.q(path, true);
    }

    private final List<b0> Z(b0 dir, boolean throwOnFailure) throws IOException {
        wv.n nVar = this.entries.get(V(dir));
        if (nVar != null) {
            return pq.v.f1(nVar.c());
        }
        if (!throwOnFailure) {
            return null;
        }
        throw new IOException("not a directory: " + dir);
    }

    @Override // vv.k
    public void E(b0 path, boolean mustExist) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // vv.k
    public List<b0> I(b0 dir) {
        return Z(dir, true);
    }

    @Override // vv.k
    public j K(b0 path) throws Throwable {
        Throwable th4;
        Throwable th5;
        wv.n nVarQ = this.entries.get(V(path));
        if (nVarQ == null) {
            return null;
        }
        if (nVarQ.getOffset() != -1) {
            i iVarL = this.fileSystem.L(this.zipPath);
            try {
                g gVarC = v.c(iVarL.H(nVarQ.getOffset()));
                try {
                    nVarQ = wv.s.q(gVarC, nVarQ);
                    if (gVarC != null) {
                        try {
                            gVarC.close();
                        } catch (Throwable th6) {
                            th5 = th6;
                        }
                    }
                    th5 = null;
                } catch (Throwable th7) {
                    if (gVarC != null) {
                        try {
                            gVarC.close();
                        } catch (Throwable th8) {
                            oq.c.a(th7, th8);
                        }
                    }
                    th5 = th7;
                    nVarQ = null;
                }
                if (th5 != null) {
                    throw th5;
                }
                if (iVarL != null) {
                    try {
                        iVarL.close();
                    } catch (Throwable th9) {
                        th4 = th9;
                    }
                }
                th4 = null;
            } catch (Throwable th10) {
                if (iVarL != null) {
                    try {
                        iVarL.close();
                    } catch (Throwable th11) {
                        oq.c.a(th10, th11);
                    }
                }
                th4 = th10;
                nVarQ = null;
            }
            if (th4 != null) {
                throw th4;
            }
        }
        return new j(!nVarQ.getIsDirectory(), nVarQ.getIsDirectory(), null, nVarQ.getIsDirectory() ? null : Long.valueOf(nVarQ.getSize()), nVarQ.f(), nVarQ.h(), nVarQ.g(), null, 128, null);
    }

    @Override // vv.k
    public i L(b0 file) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // vv.k
    public j0 N(b0 file, boolean mustCreate) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // vv.k
    public k0 O(b0 file) throws IOException {
        wv.n nVar = this.entries.get(V(file));
        if (nVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        i iVarL = this.fileSystem.L(this.zipPath);
        g th4 = null;
        try {
            g gVarC = v.c(iVarL.H(nVar.getOffset()));
            if (iVarL != null) {
                try {
                    iVarL.close();
                } catch (Throwable th5) {
                    th4 = th5;
                }
            }
            th = th4;
            th4 = gVarC;
        } catch (Throwable th6) {
            th = th6;
            if (iVarL != null) {
                try {
                    iVarL.close();
                } catch (Throwable th7) {
                    oq.c.a(th, th7);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        wv.s.u(th4);
        return nVar.getCompressionMethod() == 0 ? new wv.i(th4, nVar.getSize(), true) : new wv.i(new q(new wv.i(th4, nVar.getCompressedSize(), true), new Inflater(true)), nVar.getSize(), false);
    }

    @Override // vv.k
    public j0 h(b0 file, boolean mustExist) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // vv.k
    public void m(b0 source, b0 target) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // vv.k
    public void u(b0 dir, boolean mustCreate) throws IOException {
        throw new IOException("zip file systems are read-only");
    }
}

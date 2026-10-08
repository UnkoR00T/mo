package vv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010#J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lvv/t;", "Lvv/k;", "<init>", "()V", "Lvv/b0;", "dir", "", "throwOnFailure", "", "V", "(Lvv/b0;Z)Ljava/util/List;", "Loq/i0;", "a0", "(Lvv/b0;)V", "Z", "path", "Lvv/j;", "K", "(Lvv/b0;)Lvv/j;", "I", "(Lvv/b0;)Ljava/util/List;", "file", "Lvv/i;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lvv/b0;)Lvv/i;", "Lvv/k0;", "O", "(Lvv/b0;)Lvv/k0;", "mustCreate", "Lvv/j0;", "N", "(Lvv/b0;Z)Lvv/j0;", "mustExist", "h", "u", "(Lvv/b0;Z)V", "source", "target", "m", "(Lvv/b0;Lvv/b0;)V", "E", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class t extends k {
    private final List<b0> V(b0 dir, boolean throwOnFailure) throws IOException {
        File file = dir.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(dir.p(str));
            }
            pq.v.B(arrayList);
            return arrayList;
        }
        if (!throwOnFailure) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + dir);
        }
        throw new FileNotFoundException("no such file: " + dir);
    }

    private final void Z(b0 b0Var) throws IOException {
        if (H(b0Var)) {
            throw new IOException(b0Var + " already exists.");
        }
    }

    private final void a0(b0 b0Var) throws IOException {
        if (H(b0Var)) {
            return;
        }
        throw new IOException(b0Var + " doesn't exist.");
    }

    @Override // vv.k
    public void E(b0 path, boolean mustExist) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (mustExist) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // vv.k
    public List<b0> I(b0 dir) {
        return V(dir, true);
    }

    @Override // vv.k
    public j K(b0 path) {
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new j(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
    }

    @Override // vv.k
    public i L(b0 file) {
        return new s(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // vv.k
    public j0 N(b0 file, boolean mustCreate) throws IOException {
        if (mustCreate) {
            Z(file);
        }
        return w.d(file.toFile(), false, 1, null);
    }

    @Override // vv.k
    public k0 O(b0 file) {
        return v.i(file.toFile());
    }

    @Override // vv.k
    public j0 h(b0 file, boolean mustExist) throws IOException {
        if (mustExist) {
            a0(file);
        }
        return v.e(file.toFile(), true);
    }

    @Override // vv.k
    public void m(b0 source, b0 target) throws IOException {
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // vv.k
    public void u(b0 dir, boolean mustCreate) throws IOException {
        if (dir.toFile().mkdir()) {
            return;
        }
        j jVarK = K(dir);
        if (jVarK == null || !jVarK.getIsDirectory()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (mustCreate) {
            throw new IOException(dir + " already exists.");
        }
    }
}

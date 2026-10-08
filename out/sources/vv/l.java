package vv;

import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b*\u0010%J\u000f\u0010+\u001a\u00020#H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u0002\u00101¨\u00062"}, d2 = {"Lvv/l;", "Lvv/k;", "delegate", "<init>", "(Lvv/k;)V", "Lvv/b0;", "path", "", "functionName", "parameterName", "V", "(Lvv/b0;Ljava/lang/String;Ljava/lang/String;)Lvv/b0;", "Z", "(Lvv/b0;Ljava/lang/String;)Lvv/b0;", "Lvv/j;", "K", "(Lvv/b0;)Lvv/j;", "dir", "", "I", "(Lvv/b0;)Ljava/util/List;", "file", "Lvv/i;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lvv/b0;)Lvv/i;", "Lvv/k0;", "O", "(Lvv/b0;)Lvv/k0;", "", "mustCreate", "Lvv/j0;", "N", "(Lvv/b0;Z)Lvv/j0;", "mustExist", "h", "Loq/i0;", "u", "(Lvv/b0;Z)V", "source", "target", "m", "(Lvv/b0;Lvv/b0;)V", "E", "close", "()V", "toString", "()Ljava/lang/String;", "e", "Lvv/k;", "()Lvv/k;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class l extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k delegate;

    public l(k kVar) {
        this.delegate = kVar;
    }

    @Override // vv.k
    public void E(b0 path, boolean mustExist) {
        this.delegate.E(V(path, "delete", "path"), mustExist);
    }

    @Override // vv.k
    public List<b0> I(b0 dir) {
        List<b0> listI = this.delegate.I(V(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(Z((b0) it.next(), "list"));
        }
        pq.v.B(arrayList);
        return arrayList;
    }

    @Override // vv.k
    public j K(b0 path) {
        j jVarK = this.delegate.K(V(path, "metadataOrNull", "path"));
        if (jVarK == null) {
            return null;
        }
        return jVarK.getSymlinkTarget() == null ? jVarK : j.b(jVarK, false, false, Z(jVarK.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    @Override // vv.k
    public i L(b0 file) {
        return this.delegate.L(V(file, "openReadOnly", "file"));
    }

    @Override // vv.k
    public j0 N(b0 file, boolean mustCreate) {
        return this.delegate.N(V(file, "sink", "file"), mustCreate);
    }

    @Override // vv.k
    public k0 O(b0 file) {
        return this.delegate.O(V(file, "source", "file"));
    }

    public b0 V(b0 path, String functionName, String parameterName) {
        return path;
    }

    public b0 Z(b0 path, String functionName) {
        return path;
    }

    @Override // vv.k, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // vv.k
    public j0 h(b0 file, boolean mustExist) {
        return this.delegate.h(V(file, "appendingSink", "file"), mustExist);
    }

    @Override // vv.k
    public void m(b0 source, b0 target) {
        this.delegate.m(V(source, "atomicMove", "source"), V(target, "atomicMove", "target"));
    }

    public String toString() {
        return q0.c(getClass()).D() + '(' + this.delegate + ')';
    }

    @Override // vv.k
    public void u(b0 dir, boolean mustCreate) {
        this.delegate.u(V(dir, "createDirectory", "dir"), mustCreate);
    }
}

package wv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import vv.b0;
import vv.j0;
import vv.k0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001<B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u0010*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010(J\u001f\u0010,\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020+2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020+2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R-\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lwv/l;", "Lvv/k;", "Ljava/lang/ClassLoader;", "classLoader", "", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLvv/k;)V", "Lvv/b0;", "path", "b0", "(Lvv/b0;)Lvv/b0;", "", "H0", "(Lvv/b0;)Ljava/lang/String;", "", "Loq/r;", "n0", "(Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/net/URL;", "t0", "(Ljava/net/URL;)Loq/r;", "u0", "dir", "I", "(Lvv/b0;)Ljava/util/List;", "file", "Lvv/i;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lvv/b0;)Lvv/i;", "Lvv/j;", "K", "(Lvv/b0;)Lvv/j;", "Lvv/k0;", "O", "(Lvv/b0;)Lvv/k0;", "mustCreate", "Lvv/j0;", "N", "(Lvv/b0;Z)Lvv/j0;", "mustExist", "h", "Loq/i0;", "u", "(Lvv/b0;Z)V", "source", "target", "m", "(Lvv/b0;Lvv/b0;)V", "E", "e", "Ljava/lang/ClassLoader;", "f", "Lvv/k;", "g", "Loq/k;", "c0", "()Ljava/util/List;", "roots", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends vv.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f215241h = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final b0 f215242j = b0.Companion.e(b0.INSTANCE, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ClassLoader classLoader;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final vv.k systemFileSystem;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oq.k roots;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwv/l$a;", "", "<init>", "()V", "Lvv/b0;", "path", "", "c", "(Lvv/b0;)Z", "base", "d", "(Lvv/b0;Lvv/b0;)Lvv/b0;", "ROOT", "Lvv/b0;", "b", "()Lvv/b0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(b0 path) {
            return !fu.r.E(path.k(), ".class", true);
        }

        public final b0 b() {
            return l.f215242j;
        }

        public final b0 d(b0 b0Var, b0 b0Var2) {
            return b().p(fu.r.O(fu.r.M0(b0Var.toString(), b0Var2.toString()), '\\', '/', false, 4, null));
        }

        private a() {
        }
    }

    public l(ClassLoader classLoader, boolean z15, vv.k kVar) {
        this.classLoader = classLoader;
        this.systemFileSystem = kVar;
        this.roots = oq.l.a(new er.a() { // from class: wv.j
            @Override // er.a
            public final Object a() {
                return l.d0(this.f215240a);
            }
        });
        if (z15) {
            c0().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C0(n nVar) {
        return f215241h.c(nVar.getCanonicalPath());
    }

    private final String H0(b0 b0Var) {
        return b0(b0Var).o(f215242j).toString();
    }

    private final b0 b0(b0 path) {
        return f215242j.q(path, true);
    }

    private final List<oq.r<vv.k, b0>> c0() {
        return (List) this.roots.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d0(l lVar) {
        return lVar.n0(lVar.classLoader);
    }

    private final List<oq.r<vv.k, b0>> n0(ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(""));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oq.r<vv.k, b0> rVarT0 = t0((URL) it.next());
            if (rVarT0 != null) {
                arrayList.add(rVarT0);
            }
        }
        ArrayList list2 = Collections.list(classLoader.getResources("META-INF/MANIFEST.MF"));
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            oq.r<vv.k, b0> rVarU0 = u0((URL) it4.next());
            if (rVarU0 != null) {
                arrayList2.add(rVarU0);
            }
        }
        return v.L0(arrayList, arrayList2);
    }

    private final oq.r<vv.k, b0> t0(URL url) {
        if (fr.t.c(url.getProtocol(), "file")) {
            return y.a(this.systemFileSystem, b0.Companion.d(b0.INSTANCE, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    private final oq.r<vv.k, b0> u0(URL url) {
        int iX0;
        String string = url.toString();
        if (fu.r.V(string, "jar:file:", false, 2, null) && (iX0 = fu.r.x0(string, "!", 0, false, 6, null)) != -1) {
            return y.a(s.i(b0.Companion.d(b0.INSTANCE, new File(URI.create(string.substring(4, iX0))), false, 1, null), this.systemFileSystem, new er.l() { // from class: wv.k
                @Override // er.l
                public final Object b(Object obj) {
                    return Boolean.valueOf(l.C0((n) obj));
                }
            }), f215242j);
        }
        return null;
    }

    @Override // vv.k
    public void E(b0 path, boolean mustExist) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // vv.k
    public List<b0> I(b0 dir) throws FileNotFoundException {
        String strH0 = H0(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z15 = false;
        for (oq.r<vv.k, b0> rVar : c0()) {
            vv.k kVarA = rVar.a();
            b0 b0VarB = rVar.b();
            try {
                List<b0> listI = kVarA.I(b0VarB.p(strH0));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listI) {
                    if (f215241h.c((b0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f215241h.d((b0) it.next(), b0VarB));
                }
                v.D(linkedHashSet, arrayList2);
                z15 = true;
            } catch (IOException unused) {
            }
        }
        if (z15) {
            return v.f1(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // vv.k
    public vv.j K(b0 path) {
        if (!f215241h.c(path)) {
            return null;
        }
        String strH0 = H0(path);
        for (oq.r<vv.k, b0> rVar : c0()) {
            vv.j jVarK = rVar.a().K(rVar.b().p(strH0));
            if (jVarK != null) {
                return jVarK;
            }
        }
        return null;
    }

    @Override // vv.k
    public vv.i L(b0 file) throws FileNotFoundException {
        if (!f215241h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strH0 = H0(file);
        for (oq.r<vv.k, b0> rVar : c0()) {
            try {
                return rVar.a().L(rVar.b().p(strH0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // vv.k
    public j0 N(b0 file, boolean mustCreate) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // vv.k
    public k0 O(b0 file) throws IOException {
        if (!f215241h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        b0 b0Var = f215242j;
        URL resource = this.classLoader.getResource(b0.r(b0Var, file, false, 2, null).o(b0Var).toString());
        if (resource != null) {
            URLConnection uRLConnectionOpenConnection = resource.openConnection();
            if (uRLConnectionOpenConnection instanceof JarURLConnection) {
                ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
            }
            return vv.v.j(uRLConnectionOpenConnection.getInputStream());
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // vv.k
    public j0 h(b0 file, boolean mustExist) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // vv.k
    public void m(b0 source, b0 target) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // vv.k
    public void u(b0 dir, boolean mustCreate) throws IOException {
        throw new IOException(this + " is read-only");
    }

    public /* synthetic */ l(ClassLoader classLoader, boolean z15, vv.k kVar, int i15, fr.k kVar2) {
        this(classLoader, z15, (i15 & 4) != 0 ? vv.k.f208405b : kVar);
    }
}

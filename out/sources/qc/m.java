package qc;

import fr.t;
import fu.r;
import kc.h0;
import kc.s;
import p071kotlin.Metadata;
import vv.b0;
import vv.v;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqc/m;", "Lqc/j;", "Lkc/h0;", "uri", "Lzc/n;", "options", "<init>", "(Lkc/h0;Lzc/n;)V", "Lqc/i;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lkc/h0;", "b", "Lzc/n;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0 uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqc/m$a;", "Lqc/j$a;", "Lkc/h0;", "<init>", "()V", "data", "", "c", "(Lkc/h0;)Z", "Lzc/n;", "options", "Lkc/s;", "imageLoader", "Lqc/j;", "b", "(Lkc/h0;Lzc/n;Lkc/s;)Lqc/j;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<h0> {
        private final boolean c(h0 data) {
            return t.c(data.getScheme(), "jar:file");
        }

        @Override // qc.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(h0 data, Options options, s imageLoader) {
            if (c(data)) {
                return new m(data, options);
            }
            return null;
        }
    }

    public m(h0 h0Var, Options options) {
        this.uri = h0Var;
        this.options = options;
    }

    @Override // qc.j
    public Object a(tq.e<? super i> eVar) {
        String path = this.uri.getPath();
        if (path == null) {
            path = "";
        }
        String str = path;
        int iQ0 = r.q0(str, '!', 0, false, 6, null);
        if (iQ0 != -1) {
            b0.Companion companion = b0.INSTANCE;
            b0 b0VarE = b0.Companion.e(companion, str.substring(0, iQ0), false, 1, null);
            b0 b0VarE2 = b0.Companion.e(companion, str.substring(iQ0 + 1, str.length()), false, 1, null);
            return new SourceFetchResult(oc.t.d(b0VarE2, v.d(this.options.getFileSystem(), b0VarE), null, null, null, 28, null), ed.v.f49487a.a(ed.k.d(b0VarE2)), oc.f.DISK);
        }
        throw new IllegalStateException(("Invalid jar:file URI: " + this.uri).toString());
    }
}

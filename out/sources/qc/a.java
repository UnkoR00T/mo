package qc;

import ed.g0;
import kc.h0;
import kc.i0;
import kc.s;
import oc.t;
import p071kotlin.Metadata;
import pq.v;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqc/a;", "Lqc/j;", "Lkc/h0;", "data", "Lzc/n;", "options", "<init>", "(Lkc/h0;Lzc/n;)V", "Lqc/i;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lkc/h0;", "b", "Lzc/n;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0 data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: qc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqc/a$a;", "Lqc/j$a;", "Lkc/h0;", "<init>", "()V", "data", "Lzc/n;", "options", "Lkc/s;", "imageLoader", "Lqc/j;", "b", "(Lkc/h0;Lzc/n;Lkc/s;)Lqc/j;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C4146a implements j.a<h0> {
        @Override // qc.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(h0 data, Options options, s imageLoader) {
            if (g0.h(data)) {
                return new a(data, options);
            }
            return null;
        }
    }

    public a(h0 h0Var, Options options) {
        this.data = h0Var;
        this.options = options;
    }

    @Override // qc.j
    public Object a(tq.e<? super i> eVar) {
        String strV0 = v.v0(v.f0(i0.f(this.data), 1), "/", null, null, 0, null, null, 62, null);
        return new SourceFetchResult(t.a(vv.v.c(vv.v.j(this.options.getContext().getAssets().open(strV0))), this.options.getFileSystem(), new oc.a(strV0)), ed.v.f49487a.b(strV0), oc.f.DISK);
    }
}

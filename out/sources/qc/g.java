package qc;

import fr.t;
import fu.r;
import kc.h0;
import kc.s;
import p071kotlin.Metadata;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\f\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lqc/g;", "Lqc/j;", "Lkc/h0;", "uri", "Lzc/n;", "options", "<init>", "(Lkc/h0;Lzc/n;)V", "Lqc/i;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lkc/h0;", "b", "Lzc/n;", "c", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f165949c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0 uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqc/g$a;", "", "<init>", "()V", "", "BASE64_TAG", "Ljava/lang/String;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqc/g$b;", "Lqc/j$a;", "Lkc/h0;", "<init>", "()V", "data", "Lzc/n;", "options", "Lkc/s;", "imageLoader", "Lqc/j;", "b", "(Lkc/h0;Lzc/n;Lkc/s;)Lqc/j;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements j.a<h0> {
        @Override // qc.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(h0 data, Options options, s imageLoader) {
            if (t.c(data.getScheme(), "data")) {
                return new g(data, options);
            }
            return null;
        }
    }

    public g(h0 h0Var, Options options) {
        this.uri = h0Var;
        this.options = options;
    }

    @Override // qc.j
    public Object a(tq.e<? super i> eVar) {
        int iR0 = r.r0(this.uri.getData(), ";base64,", 0, false, 6, null);
        if (iR0 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.uri).toString());
        }
        int iQ0 = r.q0(this.uri.getData(), ':', 0, false, 6, null);
        if (iQ0 != -1) {
            String strSubstring = this.uri.getData().substring(iQ0 + 1, iR0);
            byte[] bArrF = br.a.f(br.a.INSTANCE, this.uri.getData(), iR0 + 8, 0, 4, null);
            vv.e eVar2 = new vv.e();
            eVar2.write(bArrF);
            return new SourceFetchResult(oc.t.c(eVar2, this.options.getFileSystem(), null, 4, null), strSubstring, oc.f.MEMORY);
        }
        throw new IllegalStateException(("invalid data uri: " + this.uri).toString());
    }
}

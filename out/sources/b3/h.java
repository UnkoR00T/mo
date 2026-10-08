package b3;

import java.util.Arrays;
import p071kotlin.Metadata;
import p076m2.u4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BG\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J!\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0016\u0010\u000b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010 R \u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&¨\u0006("}, d2 = {"Lb3/h;", "T", "Lb3/b0;", "Lm2/u4;", "Lb3/x;", "", "saver", "Lb3/r;", "registry", "", "key", "value", "", "inputs", "<init>", "(Lb3/x;Lb3/r;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "Loq/i0;", "g", "()V", "h", "", "b", "(Ljava/lang/Object;)Z", "c", "e", "d", "f", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Lb3/x;", "Lb3/r;", "Ljava/lang/String;", "Ljava/lang/Object;", "[Ljava/lang/Object;", "Lb3/r$a;", "Lb3/r$a;", "entry", "Lkotlin/Function0;", "Ler/a;", "valueProvider", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h<T> implements b0, u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private x<T, Object> saver;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private r registry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String key;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private T value;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object[] inputs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private r.a entry;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final er.a<Object> valueProvider = new er.a() { // from class: b3.g
        @Override // er.a
        public final Object a() {
            return h.i(this.f16307a);
        }
    };

    public h(x<T, Object> xVar, r rVar, String str, T t15, Object[] objArr) {
        this.saver = xVar;
        this.registry = rVar;
        this.key = str;
        this.value = t15;
        this.inputs = objArr;
    }

    private final void g() {
        r rVar = this.registry;
        if (this.entry == null) {
            if (rVar != null) {
                f.n(rVar, this.valueProvider.a());
                this.entry = rVar.c(this.key, this.valueProvider);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(h hVar) {
        x<T, Object> xVar = hVar.saver;
        T t15 = hVar.value;
        if (t15 != null) {
            return xVar.a(hVar, t15);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }

    @Override // b3.b0
    public boolean b(Object value) {
        r rVar = this.registry;
        return rVar == null || rVar.b(value);
    }

    @Override // p076m2.u4
    public void c() {
        g();
    }

    @Override // p076m2.u4
    public void d() {
        r.a aVar = this.entry;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // p076m2.u4
    public void e() {
        r.a aVar = this.entry;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final T f(Object[] inputs) {
        if (Arrays.equals(inputs, this.inputs)) {
            return this.value;
        }
        return null;
    }

    public final void h(x<T, Object> saver, r registry, String key, T value, Object[] inputs) {
        boolean z15;
        boolean z16 = true;
        if (this.registry != registry) {
            this.registry = registry;
            z15 = true;
        } else {
            z15 = false;
        }
        if (fr.t.c(this.key, key)) {
            z16 = z15;
        } else {
            this.key = key;
        }
        this.saver = saver;
        this.value = value;
        this.inputs = inputs;
        r.a aVar = this.entry;
        if (aVar == null || !z16) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.entry = null;
        g();
    }
}

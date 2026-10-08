package androidx.compose.ui.platform;

import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0003H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00180\u0017H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/j1;", "Lb3/r;", "saveableStateRegistry", "Lkotlin/Function0;", "Loq/i0;", "onDispose", "<init>", "(Lb3/r;Ler/a;)V", "a", "()V", "", "key", "", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "valueProvider", "Lb3/r$a;", "c", "(Ljava/lang/String;Ler/a;)Lb3/r$a;", "value", "", "b", "(Ljava/lang/Object;)Z", "", "", "e", "()Ljava/util/Map;", "Ler/a;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j1 implements b3.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b3.r f10641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<oq.i0> onDispose;

    public j1(b3.r rVar, er.a<oq.i0> aVar) {
        this.f10641a = rVar;
        this.onDispose = aVar;
    }

    public final void a() {
        this.onDispose.a();
    }

    @Override // b3.r
    public boolean b(Object value) {
        return this.f10641a.b(value);
    }

    @Override // b3.r
    public b3.r.a c(String key, er.a<? extends Object> valueProvider) {
        return this.f10641a.c(key, valueProvider);
    }

    @Override // b3.r
    public Map<String, List<Object>> e() {
        return this.f10641a.e();
    }

    @Override // b3.r
    public Object f(String key) {
        return this.f10641a.f(key);
    }
}

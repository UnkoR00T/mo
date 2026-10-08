package gy0;

import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lgy0/b;", "Lky0/b;", "<init>", "()V", "Lhy0/a;", "d", "()Lhy0/a;", "data", "Loq/i0;", "c", "(Lhy0/a;Ltq/e;)Ljava/lang/Object;", "", "b", "()Ljava/lang/Long;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lhy0/a;", "widgetLocalData", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements ky0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private hy0.a widgetLocalData = new hy0.a.Uninitialized(null, 1, null);

    @Override // ky0.b
    public Object a(e<? super i0> eVar) {
        this.widgetLocalData = new hy0.a.Uninitialized(null, 1, null);
        return i0.f148189a;
    }

    @Override // ky0.b
    public Long b() {
        return this.widgetLocalData.getLastWidgetUpdate();
    }

    @Override // ky0.b
    public Object c(hy0.a aVar, e<? super i0> eVar) {
        this.widgetLocalData = aVar;
        return i0.f148189a;
    }

    @Override // ky0.b
    /* JADX INFO: renamed from: d, reason: from getter */
    public hy0.a getWidgetLocalData() {
        return this.widgetLocalData;
    }
}

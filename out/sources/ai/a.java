package ai;

import com.google.android.gms.common.api.Status;
import jg.r;

/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Status f6373b;

    public a(T t15, Status status) {
        this.f6372a = t15;
        this.f6373b = status;
    }

    public T a() {
        return (T) this.f6372a;
    }

    public Status b() {
        return this.f6373b;
    }

    public String toString() {
        return r.c(this).a("status", this.f6373b).a("result", this.f6372a).toString();
    }

    public a(Status status) {
        this(null, status);
    }
}

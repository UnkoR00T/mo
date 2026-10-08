package jg;

import io.sentry.android.core.c2;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f102567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f102568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f102569c;

    public w0(c cVar, Object obj) {
        Objects.requireNonNull(cVar);
        this.f102569c = cVar;
        this.f102567a = obj;
        this.f102568b = false;
    }

    protected abstract void a(Object obj);

    public final void b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f102567a;
                if (this.f102568b) {
                    String string = toString();
                    StringBuilder sb5 = new StringBuilder(string.length() + 47);
                    sb5.append("Callback proxy ");
                    sb5.append(string);
                    sb5.append(" being reused. This is not safe.");
                    c2.g("GmsClient", sb5.toString());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f102568b = true;
        }
        c();
    }

    public final void c() {
        d();
        c cVar = this.f102569c;
        synchronized (cVar.Z()) {
            cVar.Z().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f102567a = null;
        }
    }
}

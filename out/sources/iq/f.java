package iq;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.o;

/* JADX INFO: loaded from: classes4.dex */
public class f implements lq.b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f96173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f96174b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f96175c;

    public interface a {
        gq.c e();
    }

    public f(o oVar) {
        this.f96175c = oVar;
    }

    private Object a() {
        lq.d.b(this.f96175c.H(), "Hilt Fragments must be attached before creating the component.");
        lq.d.c(this.f96175c.H() instanceof lq.c, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f96175c.H().getClass());
        e(this.f96175c);
        return ((a) bq.a.a(this.f96175c.H(), a.class)).e().a(this.f96175c).build();
    }

    public static ContextWrapper b(Context context, o oVar) {
        return new i(context, oVar);
    }

    public static ContextWrapper c(LayoutInflater layoutInflater, o oVar) {
        return new i(layoutInflater, oVar);
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    protected void e(o oVar) {
    }

    @Override // lq.b
    public Object p() {
        if (this.f96173a == null) {
            synchronized (this.f96174b) {
                try {
                    if (this.f96173a == null) {
                        this.f96173a = a();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.f96173a;
    }
}

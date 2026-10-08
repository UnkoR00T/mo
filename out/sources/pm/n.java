package pm;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yk.c<?> f160874b = yk.c.c(n.class).b(yk.q.j(i.class)).b(yk.q.j(Context.class)).e(new yk.g() { // from class: pm.f0
        @Override // yk.g
        public final Object a(yk.d dVar) {
            return new n((Context) dVar.a(Context.class));
        }
    }).d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f160875a;

    public n(Context context) {
        this.f160875a = context;
    }

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    protected final SharedPreferences b() {
        return this.f160875a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}

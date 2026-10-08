package il;

import android.content.Context;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import yk.d0;
import yk.w;

/* JADX INFO: loaded from: classes4.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kl.b<q> f93234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f93235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kl.b<tl.i> f93236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<g> f93237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f93238e;

    private f(final Context context, final String str, Set<g> set, kl.b<tl.i> bVar, Executor executor) {
        this(new w(new kl.b() { // from class: il.d
            @Override // kl.b
            public final Object get() {
                return f.d(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                q qVar = fVar.f93234a.get();
                List<r> listG = qVar.g();
                qVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i15 = 0; i15 < listG.size(); i15++) {
                    r rVar = listG.get(i15);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", rVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) rVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th4) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                throw th8;
            }
        }
        return string;
    }

    public static /* synthetic */ q d(Context context, String str) {
        return new q(context, str);
    }

    public static /* synthetic */ f e(d0 d0Var, yk.d dVar) {
        return new f((Context) dVar.a(Context.class), ((vk.e) dVar.a(vk.e.class)).n(), (Set<g>) dVar.c(g.class), (kl.b<tl.i>) dVar.d(tl.i.class), (Executor) dVar.b(d0Var));
    }

    public static /* synthetic */ Void f(f fVar) {
        synchronized (fVar) {
            fVar.f93234a.get().o(System.currentTimeMillis(), fVar.f93236c.get().a());
        }
        return null;
    }

    public static yk.c<f> g() {
        final d0 d0VarA = d0.a(xk.a.class, Executor.class);
        return yk.c.d(f.class, i.class, j.class).b(yk.q.j(Context.class)).b(yk.q.j(vk.e.class)).b(yk.q.m(g.class)).b(yk.q.l(tl.i.class)).b(yk.q.k(d0VarA)).e(new yk.g() { // from class: il.c
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return f.e(d0VarA, dVar);
            }
        }).d();
    }

    @Override // il.i
    public vh.l<String> a() {
        return !e6.m.a(this.f93235b) ? vh.o.f("") : vh.o.c(this.f93238e, new Callable() { // from class: il.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.c(this.f93233a);
            }
        });
    }

    @Override // il.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVar = this.f93234a.get();
        if (!qVar.m(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        qVar.k();
        return j.a.GLOBAL;
    }

    public vh.l<Void> h() {
        if (this.f93237d.size() > 0 && e6.m.a(this.f93235b)) {
            return vh.o.c(this.f93238e, new Callable() { // from class: il.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return f.f(this.f93229a);
                }
            });
        }
        return vh.o.f(null);
    }

    f(kl.b<q> bVar, Set<g> set, Executor executor, kl.b<tl.i> bVar2, Context context) {
        this.f93234a = bVar;
        this.f93237d = set;
        this.f93238e = executor;
        this.f93236c = bVar2;
        this.f93235b = context;
    }
}

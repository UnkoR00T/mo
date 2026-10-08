package bh;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final i f19445i = i.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f19448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pm.n f19449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vh.l f19450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vh.l f19451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19453h;

    public m0(Context context, final pm.n nVar, f0 f0Var, String str) {
        new HashMap();
        new HashMap();
        this.f19446a = context.getPackageName();
        this.f19447b = pm.c.a(context);
        this.f19449d = nVar;
        this.f19448c = f0Var;
        w0.a();
        this.f19452g = str;
        this.f19450e = pm.g.a().b(new Callable() { // from class: bh.k0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19439a.a();
            }
        });
        pm.g gVarA = pm.g.a();
        Objects.requireNonNull(nVar);
        this.f19451f = gVarA.b(new Callable() { // from class: bh.l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        i iVar = f19445i;
        this.f19453h = iVar.containsKey(str) ? DynamiteModule.c(context, (String) iVar.get(str)) : -1;
    }

    final /* synthetic */ String a() {
        return jg.p.a().b(this.f19452g);
    }
}

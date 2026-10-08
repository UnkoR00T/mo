package he4;

import com.google.gson.a0;
import com.google.gson.f;
import fv.c0;
import fv.x;
import ge4.h;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import vv.e;

/* JADX INFO: loaded from: classes2.dex */
final class b<T> implements h<T, c0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final x f84060d = x.e("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f84061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0<T> f84062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f84063c;

    b(f fVar, a0<T> a0Var, boolean z15) {
        this.f84061a = fVar;
        this.f84062b = a0Var;
        this.f84063c = z15;
    }

    static <T> void c(vv.f fVar, f fVar2, a0<T> a0Var, T t15) {
        zl.c cVarR = fVar2.r(new OutputStreamWriter(fVar.b4(), StandardCharsets.UTF_8));
        a0Var.d(cVarR, t15);
        cVarR.close();
    }

    @Override // ge4.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 a(T t15) {
        if (this.f84063c) {
            return new d(this.f84061a, this.f84062b, t15);
        }
        e eVar = new e();
        c(eVar, this.f84061a, this.f84062b, t15);
        return c0.d(f84060d, eVar.d0());
    }
}

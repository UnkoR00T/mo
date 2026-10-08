package he4;

import com.google.gson.f;
import fv.c0;
import fv.e0;
import ge4.h;
import ge4.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f84058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f84059b;

    private a(f fVar, boolean z15) {
        this.f84058a = fVar;
        this.f84059b = z15;
    }

    public static a f(f fVar) {
        if (fVar != null) {
            return new a(fVar, false);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // ge4.h.a
    public h<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        return new b(this.f84058a, this.f84058a.l(com.google.gson.reflect.a.b(type)), this.f84059b);
    }

    @Override // ge4.h.a
    public h<e0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        return new c(this.f84058a, this.f84058a.l(com.google.gson.reflect.a.b(type)));
    }
}

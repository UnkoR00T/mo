package rn;

import fv.c0;
import fv.e0;
import fv.x;
import ge4.h;
import ge4.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0002\b\u0003\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u0016\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lrn/b;", "Lge4/h$a;", "Lfv/x;", CMSAttributeTableGenerator.CONTENT_TYPE, "Lrn/e;", "serializer", "<init>", "(Lfv/x;Lrn/e;)V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lge4/y;", "retrofit", "Lge4/h;", "Lfv/e0;", "d", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lge4/y;)Lge4/h;", "parameterAnnotations", "methodAnnotations", "Lfv/c0;", "c", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lge4/y;)Lge4/h;", "a", "Lfv/x;", "b", "Lrn/e;", "retrofit2-kotlinx-serialization-converter"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x contentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e serializer;

    public b(x xVar, e eVar) {
        this.contentType = xVar;
        this.serializer = eVar;
    }

    @Override // ge4.h.a
    public h<?, c0> c(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, y retrofit) {
        return new d(this.contentType, this.serializer.c(type), this.serializer);
    }

    @Override // ge4.h.a
    public h<e0, ?> d(Type type, Annotation[] annotations, y retrofit) {
        return new a(this.serializer.c(type), this.serializer);
    }
}

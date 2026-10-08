package bs;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a A[RETURN] */
    public static final g a(Annotation[] annotationArr, zs.c cVar) {
        for (Annotation annotation : annotationArr) {
            if (fr.t.c(f.e(dr.a.b(dr.a.a(annotation))).a(), cVar)) {
                if (annotation != null) {
                    return new g(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new g(annotation);
        }
        return null;
    }

    public static final List<g> b(Annotation[] annotationArr) {
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new g(annotation));
        }
        return arrayList;
    }
}

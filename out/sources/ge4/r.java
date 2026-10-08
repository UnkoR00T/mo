package ge4;

import android.annotation.TargetApi;
import fv.e0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
@IgnoreJRERequirement
public final class r extends h.a {

    @IgnoreJRERequirement
    static final class a<T> implements h<e0, Optional<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h<e0, T> f72370a;

        a(h<e0, T> hVar) {
            this.f72370a = hVar;
        }

        @Override // ge4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> a(e0 e0Var) {
            return Optional.ofNullable(this.f72370a.a(e0Var));
        }
    }

    r() {
    }

    @Override // ge4.h.a
    public h<e0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (h.a.b(type) != Optional.class) {
            return null;
        }
        return new a(yVar.h(h.a.a(0, (ParameterizedType) type), annotationArr));
    }
}

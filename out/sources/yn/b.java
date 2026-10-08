package yn;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f228003a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f228003a = field;
    }

    public String toString() {
        return this.f228003a.toString();
    }
}

package io.sentry.compose;

import f3.m;
import fr.k;
import fr.t;
import io.sentry.b7;
import io.sentry.v0;
import java.lang.reflect.Field;
import java.util.Map;
import n4.h0;
import n4.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lio/sentry/compose/a;", "", "Lio/sentry/v0;", "logger", "<init>", "(Lio/sentry/v0;)V", "Lf3/m;", "modifier", "", "a", "(Lf3/m;)Ljava/lang/String;", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Field;", "testTagElementField", "b", "sentryTagElementField", "c", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94790d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Field testTagElementField;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Field sentryTagElementField;

    /* JADX INFO: renamed from: io.sentry.compose.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/sentry/compose/a$a;", "", "<init>", "()V", "Lio/sentry/v0;", "logger", "", "className", "fieldName", "Ljava/lang/reflect/Field;", "b", "(Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Field;", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Field b(v0 logger, String className, String fieldName) {
            try {
                Field declaredField = Class.forName(className).getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
                logger.c(b7.WARNING, "Could not load " + className + '.' + fieldName + " field", new Object[0]);
                return null;
            }
        }

        private Companion() {
        }
    }

    public a(v0 v0Var) {
        Companion companion = INSTANCE;
        this.testTagElementField = companion.b(v0Var, "androidx.compose.ui.platform.TestTagElement", "tag");
        this.sentryTagElementField = companion.b(v0Var, "io.sentry.compose.SentryModifier$SentryTagModifierNodeElement", "tag");
    }

    public final String a(m modifier) {
        Field field;
        Field field2;
        String name = modifier.getClass().getName();
        try {
            if (t.c("androidx.compose.ui.platform.TestTagElement", name) && (field2 = this.testTagElementField) != null) {
                return (String) field2.get(modifier);
            }
            if (t.c("io.sentry.compose.SentryModifier$SentryTagModifierNodeElement", name) && (field = this.sentryTagElementField) != null) {
                return (String) field.get(modifier);
            }
            if (!(modifier instanceof u)) {
                return null;
            }
            for (Map.Entry<? extends h0<?>, ? extends Object> entry : ((u) modifier).f()) {
                h0<?> key = entry.getKey();
                Object value = entry.getValue();
                String name2 = key.getName();
                if (t.c("SentryTag", name2) || t.c("TestTag", name2)) {
                    if (value instanceof String) {
                        return (String) value;
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }
}

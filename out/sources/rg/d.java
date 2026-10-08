package rg;

import android.os.IBinder;
import java.lang.reflect.Field;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends b.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f173723d;

    private d(Object obj) {
        this.f173723d = obj;
    }

    public static <T> T n3(b bVar) {
        if (bVar instanceof d) {
            return (T) ((d) bVar).f173723d;
        }
        IBinder iBinderAsBinder = bVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i15 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i15++;
                field = field2;
            }
        }
        if (i15 != 1) {
            int length = declaredFields.length;
            StringBuilder sb5 = new StringBuilder(String.valueOf(length).length() + 53);
            sb5.append("Unexpected number of IObjectWrapper declared fields: ");
            sb5.append(length);
            throw new IllegalArgumentException(sb5.toString());
        }
        s.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e15) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e15);
        } catch (NullPointerException e16) {
            throw new IllegalArgumentException("Binder object is null.", e16);
        }
    }

    public static <T> b o3(T t15) {
        return new d(t15);
    }
}

package io.sentry;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Object> f94697a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f94698b;

    c2(int i15) {
        this.f94698b = i15;
    }

    private List<Object> a(Collection<?> collection, v0 v0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), v0Var));
        }
        return arrayList;
    }

    private List<Object> b(Object[] objArr, v0 v0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(d(obj, v0Var));
        }
        return arrayList;
    }

    private Map<String, Object> c(Map<?, ?> map, v0 v0Var) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), d(obj2, v0Var));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public Object d(Object obj, v0 v0Var) {
        Object string;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return io.sentry.util.q.a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (!(obj instanceof URI) && !(obj instanceof InetAddress) && !(obj instanceof UUID) && !(obj instanceof Currency)) {
            if (obj instanceof Calendar) {
                return io.sentry.util.q.c((Calendar) obj);
            }
            if (obj.getClass().isEnum()) {
                return obj.toString();
            }
            if (this.f94697a.contains(obj)) {
                v0Var.c(b7.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            this.f94697a.add(obj);
            try {
                if (this.f94697a.size() > this.f94698b) {
                    this.f94697a.remove(obj);
                    v0Var.c(b7.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                    return obj.toString();
                }
                try {
                    if (obj.getClass().isArray()) {
                        string = b((Object[]) obj, v0Var);
                    } else if (obj instanceof Collection) {
                        string = a((Collection) obj, v0Var);
                    } else if (obj instanceof Map) {
                        string = c((Map) obj, v0Var);
                    } else {
                        Map<String, Object> mapE = e(obj, v0Var);
                        string = mapE.isEmpty() ? obj.toString() : mapE;
                    }
                    return string;
                } catch (Exception e15) {
                    v0Var.b(b7.INFO, "Not serializing object due to throwing sub-path.", e15);
                    return null;
                }
            } finally {
                this.f94697a.remove(obj);
            }
        }
        return obj.toString();
    }

    public Map<String, Object> e(Object obj, v0 v0Var) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, d(field.get(obj), v0Var));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    v0Var.c(b7.INFO, "Cannot access field " + name + ".", new Object[0]);
                }
            }
        }
        return map;
    }
}

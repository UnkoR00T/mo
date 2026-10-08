package io.sentry;

import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes4.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f93620a;

    public a2(int i15) {
        this.f93620a = new c2(i15);
    }

    private void b(l3 l3Var, v0 v0Var, Collection<?> collection) {
        l3Var.g();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            a(l3Var, v0Var, it.next());
        }
        l3Var.e();
    }

    private void c(l3 l3Var, v0 v0Var, Date date) {
        try {
            l3Var.h(m.h(date));
        } catch (Exception e15) {
            v0Var.b(b7.ERROR, "Error when serializing Date", e15);
            l3Var.n();
        }
    }

    private void d(l3 l3Var, v0 v0Var, Map<?, ?> map) {
        l3Var.Y();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                l3Var.f((String) obj);
                a(l3Var, v0Var, map.get(obj));
            }
        }
        l3Var.h0();
    }

    private void e(l3 l3Var, v0 v0Var, TimeZone timeZone) {
        try {
            l3Var.h(timeZone.getID());
        } catch (Exception e15) {
            v0Var.b(b7.ERROR, "Error when serializing TimeZone", e15);
            l3Var.n();
        }
    }

    public void a(l3 l3Var, v0 v0Var, Object obj) {
        if (obj == null) {
            l3Var.n();
            return;
        }
        if (obj instanceof Character) {
            l3Var.h(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            l3Var.h((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            l3Var.d(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            l3Var.k((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            c(l3Var, v0Var, (Date) obj);
            return;
        }
        if (obj instanceof TimeZone) {
            e(l3Var, v0Var, (TimeZone) obj);
            return;
        }
        if (obj instanceof d2) {
            ((d2) obj).serialize(l3Var, v0Var);
            return;
        }
        if (obj instanceof Collection) {
            b(l3Var, v0Var, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            b(l3Var, v0Var, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            d(l3Var, v0Var, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            l3Var.h(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            b(l3Var, v0Var, io.sentry.util.q.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            l3Var.d(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            l3Var.h(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            l3Var.h(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            l3Var.h(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            l3Var.h(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            d(l3Var, v0Var, io.sentry.util.q.c((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            l3Var.h(obj.toString());
            return;
        }
        try {
            a(l3Var, v0Var, this.f93620a.d(obj, v0Var));
        } catch (Exception e15) {
            v0Var.b(b7.ERROR, "Failed serializing unknown object.", e15);
            l3Var.h("[OBJECT]");
        }
    }
}

package jg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f102546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f102547b;

        /* synthetic */ a(Object obj, byte[] bArr) {
            s.l(obj);
            this.f102547b = obj;
            this.f102546a = new ArrayList();
        }

        public a a(String str, Object obj) {
            s.l(str);
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            StringBuilder sb5 = new StringBuilder(length + 1 + strValueOf.length());
            sb5.append(str);
            sb5.append("=");
            sb5.append(strValueOf);
            this.f102546a.add(sb5.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder(100);
            sb5.append(this.f102547b.getClass().getSimpleName());
            sb5.append('{');
            List list = this.f102546a;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                sb5.append((String) list.get(i15));
                if (i15 < size - 1) {
                    sb5.append(", ");
                }
            }
            sb5.append('}');
            return sb5.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}

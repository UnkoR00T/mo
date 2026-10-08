package fv;

import fr.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 (2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002%(B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\"¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b'\u0010\u001f¨\u0006)"}, d2 = {"Lfv/u;", "", "Loq/r;", "", "", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "index", "f", "(I)Ljava/lang/String;", "k", "", "l", "(Ljava/lang/String;)Ljava/util/List;", "", "iterator", "()Ljava/util/Iterator;", "Lfv/u$a;", "g", "()Lfv/u$a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "i", "()Ljava/util/Map;", "a", "[Ljava/lang/String;", "size", "b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u implements Iterable<oq.r<? extends String, ? extends String>>, gr.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String[] namesAndValues;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0007J \u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lfv/u$a;", "", "<init>", "()V", "", "line", "c", "(Ljava/lang/String;)Lfv/u$a;", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lfv/u$a;", "e", "Lfv/u;", "headers", "b", "(Lfv/u;)Lfv/u$a;", "d", "h", "i", "f", "()Lfv/u;", "", "Ljava/util/List;", "g", "()Ljava/util/List;", "namesAndValues", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<String> namesAndValues = new ArrayList(20);

        public final a a(String name, String value) {
            Companion companion = u.INSTANCE;
            companion.d(name);
            companion.e(value, name);
            d(name, value);
            return this;
        }

        public final a b(u headers) {
            int size = headers.size();
            for (int i15 = 0; i15 < size; i15++) {
                d(headers.f(i15), headers.k(i15));
            }
            return this;
        }

        public final a c(String line) {
            int iQ0 = fu.r.q0(line, ':', 1, false, 4, null);
            if (iQ0 != -1) {
                d(line.substring(0, iQ0), line.substring(iQ0 + 1));
                return this;
            }
            if (line.charAt(0) == ':') {
                d("", line.substring(1));
                return this;
            }
            d("", line);
            return this;
        }

        public final a d(String name, String value) {
            this.namesAndValues.add(name);
            this.namesAndValues.add(fu.r.u1(value).toString());
            return this;
        }

        public final a e(String name, String value) {
            u.INSTANCE.d(name);
            d(name, value);
            return this;
        }

        public final u f() {
            return new u((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final List<String> g() {
            return this.namesAndValues;
        }

        public final a h(String name) {
            int i15 = 0;
            while (i15 < this.namesAndValues.size()) {
                if (fu.r.G(name, this.namesAndValues.get(i15), true)) {
                    this.namesAndValues.remove(i15);
                    this.namesAndValues.remove(i15);
                    i15 -= 2;
                }
                i15 += 2;
            }
            return this;
        }

        public final a i(String name, String value) {
            Companion companion = u.INSTANCE;
            companion.d(name);
            companion.e(value, name);
            h(name);
            d(name, value);
            return this;
        }
    }

    /* JADX INFO: renamed from: fv.u$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfv/u$b;", "", "<init>", "()V", "", "", "namesAndValues", "name", "f", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Loq/i0;", "d", "(Ljava/lang/String;)V", "value", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "Lfv/u;", "g", "([Ljava/lang/String;)Lfv/u;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String name) {
            if (name.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = name.length();
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = name.charAt(i15);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(gv.d.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i15), name).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String value, String name) {
            int length = value.length();
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = value.charAt(i15);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(gv.d.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i15), name));
                    sb5.append(gv.d.G(name) ? "" : ": " + value);
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String[] namesAndValues, String name) {
            int length = namesAndValues.length - 2;
            int iC = xq.c.c(length, 0, -2);
            if (iC > length) {
                return null;
            }
            while (!fu.r.G(name, namesAndValues[length], true)) {
                if (length == iC) {
                    return null;
                }
                length -= 2;
            }
            return namesAndValues[length + 1];
        }

        public final u g(String... namesAndValues) {
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                String str = strArr[i16];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i16] = fu.r.u1(str).toString();
            }
            int iC = xq.c.c(0, strArr.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    String str2 = strArr[i15];
                    String str3 = strArr[i15 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i15 == iC) {
                        break;
                    }
                    i15 += 2;
                }
            }
            return new u(strArr, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ u(String[] strArr, fr.k kVar) {
        this(strArr);
    }

    public static final u h(String... strArr) {
        return INSTANCE.g(strArr);
    }

    public final String e(String name) {
        return INSTANCE.f(this.namesAndValues, name);
    }

    public boolean equals(Object other) {
        return (other instanceof u) && Arrays.equals(this.namesAndValues, ((u) other).namesAndValues);
    }

    public final String f(int index) {
        return this.namesAndValues[index * 2];
    }

    public final a g() {
        a aVar = new a();
        pq.v.E(aVar.g(), this.namesAndValues);
        return aVar;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public final Map<String, List<String>> i() {
        TreeMap treeMap = new TreeMap(fu.r.I(v0.f66418a));
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            String lowerCase = f(i15).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(k(i15));
        }
        return treeMap;
    }

    @Override // java.lang.Iterable
    public Iterator<oq.r<? extends String, ? extends String>> iterator() {
        int size = size();
        oq.r[] rVarArr = new oq.r[size];
        for (int i15 = 0; i15 < size; i15++) {
            rVarArr[i15] = oq.y.a(f(i15), k(i15));
        }
        return fr.c.a(rVarArr);
    }

    public final String k(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    public final List<String> l(String name) {
        int size = size();
        ArrayList arrayList = null;
        for (int i15 = 0; i15 < size; i15++) {
            if (fu.r.G(name, f(i15), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(k(i15));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : pq.v.n();
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            String strF = f(i15);
            String strK = k(i15);
            sb5.append(strF);
            sb5.append(": ");
            if (gv.d.G(strF)) {
                strK = "██";
            }
            sb5.append(strK);
            sb5.append("\n");
        }
        return sb5.toString();
    }

    private u(String[] strArr) {
        this.namesAndValues = strArr;
    }
}

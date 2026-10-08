package ta;

import fr.t;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0006*\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\t*\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\u0003*\u00020\u00182\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0006*\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\t*\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010 \u001a\u00020\u0003*\u00020\u001f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0006*\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010(\u001a\u00020\t2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010*\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b*\u0010)\u001a\u0017\u0010+\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b+\u0010)¨\u0006,"}, d2 = {"Lta/r;", "", "other", "", "f", "(Lta/r;Ljava/lang/Object;)Z", "", "k", "(Lta/r;)I", "", "q", "(Lta/r;)Ljava/lang/String;", "Lta/r$a;", "c", "(Lta/r$a;Ljava/lang/Object;)Z", "current", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "a", "(Ljava/lang/String;)Z", "h", "(Lta/r$a;)I", "n", "(Lta/r$a;)Ljava/lang/String;", "Lta/r$c;", "d", "(Lta/r$c;Ljava/lang/Object;)Z", "i", "(Lta/r$c;)I", "o", "(Lta/r$c;)Ljava/lang/String;", "Lta/r$d;", "e", "(Lta/r$d;Ljava/lang/Object;)Z", "j", "(Lta/r$d;)I", "p", "(Lta/r$d;)Ljava/lang/String;", "", "collection", "g", "(Ljava/util/Collection;)Ljava/lang/String;", "m", "l", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((r.a) t15).name, ((r.a) t16).name);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((r.d) t15).name, ((r.d) t16).name);
        }
    }

    private static final boolean a(String str) {
        if (str.length() == 0) {
            return false;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < str.length()) {
            char cCharAt = str.charAt(i15);
            int i18 = i17 + 1;
            if (i17 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt == '(') {
                i16++;
            } else if (cCharAt == ')' && (i16 = i16 - 1) == 0 && i17 != str.length() - 1) {
                return false;
            }
            i15++;
            i17 = i18;
        }
        return i16 == 0;
    }

    public static final boolean b(String str, String str2) {
        if (t.c(str, str2)) {
            return true;
        }
        if (a(str)) {
            return t.c(fu.r.u1(str.substring(1, str.length() - 1)).toString(), str2);
        }
        return false;
    }

    public static final boolean c(r.a aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof r.a)) {
            return false;
        }
        r.a aVar2 = (r.a) obj;
        if (aVar.a() != aVar2.a() || !t.c(aVar.name, aVar2.name) || aVar.notNull != aVar2.notNull) {
            return false;
        }
        String str = aVar.defaultValue;
        String str2 = aVar2.defaultValue;
        if (aVar.createdFrom == 1 && aVar2.createdFrom == 2 && str != null && !b(str, str2)) {
            return false;
        }
        if (aVar.createdFrom == 2 && aVar2.createdFrom == 1 && str2 != null && !b(str2, str)) {
            return false;
        }
        int i15 = aVar.createdFrom;
        return (i15 == 0 || i15 != aVar2.createdFrom || (str == null ? str2 == null : b(str, str2))) && aVar.affinity == aVar2.affinity;
    }

    public static final boolean d(r.c cVar, Object obj) {
        if (cVar == obj) {
            return true;
        }
        if (!(obj instanceof r.c)) {
            return false;
        }
        r.c cVar2 = (r.c) obj;
        if (t.c(cVar.referenceTable, cVar2.referenceTable) && t.c(cVar.onDelete, cVar2.onDelete) && t.c(cVar.onUpdate, cVar2.onUpdate) && t.c(cVar.columnNames, cVar2.columnNames)) {
            return t.c(cVar.referenceColumnNames, cVar2.referenceColumnNames);
        }
        return false;
    }

    public static final boolean e(r.d dVar, Object obj) {
        if (dVar == obj) {
            return true;
        }
        if (!(obj instanceof r.d)) {
            return false;
        }
        r.d dVar2 = (r.d) obj;
        if (dVar.unique == dVar2.unique && t.c(dVar.columns, dVar2.columns) && t.c(dVar.orders, dVar2.orders)) {
            return fu.r.V(dVar.name, "index_", false, 2, null) ? fu.r.V(dVar2.name, "index_", false, 2, null) : t.c(dVar.name, dVar2.name);
        }
        return false;
    }

    public static final boolean f(r rVar, Object obj) {
        Set<r.d> set;
        if (rVar == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar2 = (r) obj;
        if (!t.c(rVar.name, rVar2.name) || !t.c(rVar.columns, rVar2.columns) || !t.c(rVar.foreignKeys, rVar2.foreignKeys)) {
            return false;
        }
        Set<r.d> set2 = rVar.indices;
        if (set2 == null || (set = rVar2.indices) == null) {
            return true;
        }
        return t.c(set2, set);
    }

    public static final String g(Collection<?> collection) {
        if (collection.isEmpty()) {
            return " }";
        }
        return fu.r.j(v.v0(collection, ",\n", "\n", "\n", 0, null, null, 56, null), null, 1, null) + "},";
    }

    public static final int h(r.a aVar) {
        return (((((aVar.name.hashCode() * 31) + aVar.affinity) * 31) + (aVar.notNull ? 1231 : 1237)) * 31) + aVar.primaryKeyPosition;
    }

    public static final int i(r.c cVar) {
        return (((((((cVar.referenceTable.hashCode() * 31) + cVar.onDelete.hashCode()) * 31) + cVar.onUpdate.hashCode()) * 31) + cVar.columnNames.hashCode()) * 31) + cVar.referenceColumnNames.hashCode();
    }

    public static final int j(r.d dVar) {
        return ((((((fu.r.V(dVar.name, "index_", false, 2, null) ? -1184239155 : dVar.name.hashCode()) * 31) + (dVar.unique ? 1 : 0)) * 31) + dVar.columns.hashCode()) * 31) + dVar.orders.hashCode();
    }

    public static final int k(r rVar) {
        return (((rVar.name.hashCode() * 31) + rVar.columns.hashCode()) * 31) + rVar.foreignKeys.hashCode();
    }

    private static final String l(Collection<?> collection) {
        return fu.r.j(v.v0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null) + fu.r.j(" }", null, 1, null);
    }

    private static final String m(Collection<?> collection) {
        return fu.r.j(v.v0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null) + fu.r.j("},", null, 1, null);
    }

    public static final String n(r.a aVar) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("\n            |Column {\n            |   name = '");
        sb5.append(aVar.name);
        sb5.append("',\n            |   type = '");
        sb5.append(aVar.type);
        sb5.append("',\n            |   affinity = '");
        sb5.append(aVar.affinity);
        sb5.append("',\n            |   notNull = '");
        sb5.append(aVar.notNull);
        sb5.append("',\n            |   primaryKeyPosition = '");
        sb5.append(aVar.primaryKeyPosition);
        sb5.append("',\n            |   defaultValue = '");
        String str = aVar.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb5.append(str);
        sb5.append("'\n            |}\n        ");
        return fu.r.j(fu.r.p(sb5.toString(), null, 1, null), null, 1, null);
    }

    public static final String o(r.c cVar) {
        return fu.r.j(fu.r.p("\n            |ForeignKey {\n            |   referenceTable = '" + cVar.referenceTable + "',\n            |   onDelete = '" + cVar.onDelete + "',\n            |   onUpdate = '" + cVar.onUpdate + "',\n            |   columnNames = {" + m(v.T0(cVar.columnNames)) + "\n            |   referenceColumnNames = {" + l(v.T0(cVar.referenceColumnNames)) + "\n            |}\n        ", null, 1, null), null, 1, null);
    }

    public static final String p(r.d dVar) {
        return fu.r.j(fu.r.p("\n            |Index {\n            |   name = '" + dVar.name + "',\n            |   unique = '" + dVar.unique + "',\n            |   columns = {" + m(dVar.columns) + "\n            |   orders = {" + l(dVar.orders) + "\n            |}\n        ", null, 1, null), null, 1, null);
    }

    public static final String q(r rVar) {
        List listN;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("\n            |TableInfo {\n            |    name = '");
        sb5.append(rVar.name);
        sb5.append("',\n            |    columns = {");
        sb5.append(g(v.U0(rVar.columns.values(), new a())));
        sb5.append("\n            |    foreignKeys = {");
        sb5.append(g(rVar.foreignKeys));
        sb5.append("\n            |    indices = {");
        Set<r.d> set = rVar.indices;
        if (set == null || (listN = v.U0(set, new b())) == null) {
            listN = v.n();
        }
        sb5.append(g(listN));
        sb5.append("\n            |}\n        ");
        return fu.r.p(sb5.toString(), null, 1, null);
    }
}

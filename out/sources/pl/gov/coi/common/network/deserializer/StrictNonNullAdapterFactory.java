package pl.gov.coi.common.network.deserializer;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.p;
import fr.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mr.n;
import nr.d;
import p071kotlin.Metadata;
import pq.v;
import zl.a;
import zl.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lpl/gov/coi/common/network/deserializer/StrictNonNullAdapterFactory;", "Lcom/google/gson/b0;", "<init>", "()V", "", "T", "Lcom/google/gson/f;", "gson", "Lcom/google/gson/reflect/a;", "type", "Lcom/google/gson/a0;", "b", "(Lcom/google/gson/f;Lcom/google/gson/reflect/a;)Lcom/google/gson/a0;", "a", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StrictNonNullAdapterFactory implements b0 {

    /* JADX INFO: renamed from: pl.gov.coi.common.network.deserializer.StrictNonNullAdapterFactory$a, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\f¨\u0006\u001c"}, d2 = {"Lpl/gov/coi/common/network/deserializer/StrictNonNullAdapterFactory$a;", "", "", "propertyName", "", "isNonNullable", "", "jsonKeys", "primaryCheckSerializedKey", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "d", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final /* data */ class FieldInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String propertyName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isNonNullable;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> jsonKeys;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String primaryCheckSerializedKey;

        public FieldInfo(String str, boolean z15, List<String> list, String str2) {
            this.propertyName = str;
            this.isNonNullable = z15;
            this.jsonKeys = list;
            this.primaryCheckSerializedKey = str2;
        }

        public final List<String> a() {
            return this.jsonKeys;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPrimaryCheckSerializedKey() {
            return this.primaryCheckSerializedKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPropertyName() {
            return this.propertyName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsNonNullable() {
            return this.isNonNullable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldInfo)) {
                return false;
            }
            FieldInfo fieldInfo = (FieldInfo) other;
            return t.c(this.propertyName, fieldInfo.propertyName) && this.isNonNullable == fieldInfo.isNonNullable && t.c(this.jsonKeys, fieldInfo.jsonKeys) && t.c(this.primaryCheckSerializedKey, fieldInfo.primaryCheckSerializedKey);
        }

        public int hashCode() {
            int iHashCode = ((((this.propertyName.hashCode() * 31) + Boolean.hashCode(this.isNonNullable)) * 31) + this.jsonKeys.hashCode()) * 31;
            String str = this.primaryCheckSerializedKey;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "FieldInfo(propertyName=" + this.propertyName + ", isNonNullable=" + this.isNonNullable + ", jsonKeys=" + this.jsonKeys + ", primaryCheckSerializedKey=" + this.primaryCheckSerializedKey + ')';
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/common/network/deserializer/StrictNonNullAdapterFactory$b", "Lcom/google/gson/a0;", "Lzl/c;", "out", "value", "Loq/i0;", "d", "(Lzl/c;Ljava/lang/Object;)V", "Lzl/a;", "input", "b", "(Lzl/a;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> extends a0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0<T> f158110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0<l> f158111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<FieldInfo> f158112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Class<? super T> f158113d;

        b(a0<T> a0Var, a0<l> a0Var2, List<FieldInfo> list, Class<? super T> cls) {
            this.f158110a = a0Var;
            this.f158111b = a0Var2;
            this.f158112c = list;
            this.f158113d = cls;
        }

        @Override // com.google.gson.a0
        public T b(a input) {
            String next;
            l lVarB = this.f158111b.b(input);
            if (!(lVarB instanceof o)) {
                return this.f158110a.b(new com.google.gson.internal.bind.b(lVarB));
            }
            List<FieldInfo> list = this.f158112c;
            Class<? super T> cls = this.f158113d;
            for (FieldInfo fieldInfo : list) {
                Iterator<String> it = fieldInfo.a().iterator();
                boolean z15 = false;
                boolean z16 = false;
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    o oVar = (o) lVarB;
                    if (oVar.v(next)) {
                        l lVarT = oVar.t(next);
                        if (lVarT != null && !lVarT.k()) {
                            z15 = true;
                            break;
                        }
                        z16 = true;
                    }
                }
                if (fieldInfo.getIsNonNullable()) {
                    if (z16 && !z15) {
                        throw new p("Field '" + fieldInfo.getPropertyName() + "' is non-nullable but JSON contains null in " + cls.getSimpleName());
                    }
                    if (!z15) {
                        throw new p("Missing required field '" + fieldInfo.getPropertyName() + "' in JSON for class " + cls.getSimpleName());
                    }
                }
                if (z15 && fieldInfo.getPrimaryCheckSerializedKey() != null && !t.c(next, fieldInfo.getPrimaryCheckSerializedKey())) {
                    o oVar2 = (o) lVarB;
                    oVar2.o(fieldInfo.getPrimaryCheckSerializedKey(), oVar2.t(next));
                }
            }
            return this.f158110a.b(new com.google.gson.internal.bind.b(lVarB));
        }

        @Override // com.google.gson.a0
        public void d(c out, T value) {
            this.f158110a.d(out, value);
        }
    }

    @Override // com.google.gson.b0
    public <T> a0<T> b(f gson, com.google.gson.reflect.a<T> type) {
        a0<T> a0VarN = gson.n(this, type);
        a0<T> a0VarM = gson.m(l.class);
        Class<? super T> clsC = type.c();
        for (Annotation annotation : clsC.getDeclaredAnnotations()) {
            if (t.c(dr.a.a(annotation).C(), "kotlin.Metadata")) {
                Collection<n> collectionA = d.a(dr.a.e(clsC));
                ArrayList arrayList = new ArrayList();
                for (n nVar : collectionA) {
                    boolean zF = nVar.f().f();
                    boolean z15 = !zF;
                    Field fieldB = or.d.b(nVar);
                    vl.c cVar = fieldB != null ? (vl.c) fieldB.getAnnotation(vl.c.class) : null;
                    List listC = v.c();
                    listC.add(nVar.getName());
                    if (cVar != null) {
                        listC.add(cVar.value());
                        v.E(listC, cVar.alternate());
                    }
                    FieldInfo fieldInfo = (zF && cVar == null) ? null : new FieldInfo(nVar.getName(), z15, v.a(listC), cVar != null ? cVar.value() : null);
                    if (fieldInfo != null) {
                        arrayList.add(fieldInfo);
                    }
                }
                return arrayList.isEmpty() ? a0VarN : new b(a0VarN, a0VarM, arrayList, clsC);
            }
        }
        return null;
    }
}

package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class EnumTypeAdapter<T extends Enum<T>> extends a0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final b0 f36724d = new b0() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.b0
        public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> clsC = aVar.c();
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new EnumTypeAdapter(clsC);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, T> f36725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, T> f36726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<T, String> f36727c;

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public T b(zl.a aVar) throws IOException {
        if (aVar.a0() == zl.b.NULL) {
            aVar.O();
            return null;
        }
        String strQ2 = aVar.q2();
        T t15 = this.f36725a.get(strQ2);
        return t15 == null ? this.f36726b.get(strQ2) : t15;
    }

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(zl.c cVar, T t15) throws IOException {
        cVar.H0(t15 == null ? null : this.f36727c.get(t15));
    }

    private EnumTypeAdapter(Class<T> cls) {
        this.f36725a = new HashMap();
        this.f36726b = new HashMap();
        this.f36727c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i15 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i15] = field;
                    i15++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i15);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r15 = (Enum) field2.get(null);
                String strName = r15.name();
                String string = r15.toString();
                vl.c cVar = (vl.c) field2.getAnnotation(vl.c.class);
                if (cVar != null) {
                    strName = cVar.value();
                    for (String str : cVar.alternate()) {
                        this.f36725a.put(str, (T) r15);
                    }
                }
                this.f36725a.put(strName, (T) r15);
                this.f36726b.put(string, (T) r15);
                this.f36727c.put((T) r15, strName);
            }
        } catch (IllegalAccessException e15) {
            throw new AssertionError(e15);
        }
    }
}

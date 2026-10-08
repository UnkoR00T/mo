package bo;

import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import yn.a0;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
class d<T extends Enum<T>> extends z<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a0 f20469d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, T> f20470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, T> f20471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<T, String> f20472c;

    class a implements a0 {
        a() {
        }

        @Override // yn.a0
        public <T> z<T> b(yn.f fVar, go.a<T> aVar) {
            Class<? super T> clsD = aVar.d();
            a aVar2 = null;
            if (!Enum.class.isAssignableFrom(clsD) || clsD == Enum.class) {
                return null;
            }
            if (!clsD.isEnum()) {
                clsD = clsD.getSuperclass();
            }
            return new d(clsD, aVar2);
        }
    }

    /* synthetic */ d(Class cls, a aVar) {
        this(cls);
    }

    @Override // yn.z
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public T b(ho.a aVar) throws IOException {
        if (aVar.a0() == ho.b.NULL) {
            aVar.O();
            return null;
        }
        String strQ2 = aVar.q2();
        T t15 = this.f20470a.get(strQ2);
        return t15 == null ? this.f20471b.get(strQ2) : t15;
    }

    @Override // yn.z
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ho.c cVar, T t15) throws IOException {
        cVar.H0(t15 == null ? null : this.f20472c.get(t15));
    }

    private d(Class<T> cls) {
        this.f20470a = new HashMap();
        this.f20471b = new HashMap();
        this.f20472c = new HashMap();
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
                zn.c cVar = (zn.c) field2.getAnnotation(zn.c.class);
                if (cVar != null) {
                    strName = cVar.value();
                    for (String str : cVar.alternate()) {
                        this.f20470a.put(str, (T) r15);
                    }
                }
                this.f20470a.put(strName, (T) r15);
                this.f20471b.put(string, (T) r15);
                this.f20472c.put((T) r15, strName);
            }
        } catch (IllegalAccessException e15) {
            throw new AssertionError(e15);
        }
    }
}

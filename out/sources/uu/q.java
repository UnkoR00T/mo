package uu;

import fr.q0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import oq.x;
import p071kotlin.Metadata;
import pq.v;
import yu.b1;
import yu.o1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001a-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u000f*\u00020\u0004*\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\f*\u00020\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lbv/c;", "Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "", "d", "(Lbv/c;Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "g", "", "failOnMissingTypeArgSerializer", "e", "(Lbv/c;Ljava/lang/reflect/Type;Z)Lkotlinx/serialization/KSerializer;", "Ljava/lang/Class;", "h", "(Lbv/c;Ljava/lang/Class;Z)Lkotlinx/serialization/KSerializer;", "T", "jClass", "", "typeArgumentsSerializers", "c", "(Lbv/c;Ljava/lang/Class;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Ljava/lang/reflect/GenericArrayType;", "a", "(Lbv/c;Ljava/lang/reflect/GenericArrayType;Z)Lkotlinx/serialization/KSerializer;", "b", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "kotlinx-serialization-core"}, k = 5, mv = {2, 3, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
final /* synthetic */ class q {
    private static final KSerializer<Object> a(bv.c cVar, GenericArrayType genericArrayType, boolean z15) {
        KSerializer<Object> kSerializerC;
        mr.c cVarE;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            genericComponentType = (Type) pq.n.n0(((WildcardType) genericComponentType).getUpperBounds());
        }
        if (z15) {
            kSerializerC = p.a(cVar, genericComponentType);
        } else {
            kSerializerC = p.c(cVar, genericComponentType);
            if (kSerializerC == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            cVarE = dr.a.e((Class) ((ParameterizedType) genericComponentType).getRawType());
        } else {
            if (!(genericComponentType instanceof mr.c)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + q0.c(genericComponentType.getClass()));
            }
            cVarE = (mr.c) genericComponentType;
        }
        return vu.a.a(cVarE, kSerializerC);
    }

    private static final Class<?> b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return b(((ParameterizedType) type).getRawType());
        }
        if (type instanceof WildcardType) {
            return b((Type) pq.n.n0(((WildcardType) type).getUpperBounds()));
        }
        if (type instanceof GenericArrayType) {
            return b(((GenericArrayType) type).getGenericComponentType());
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + q0.c(type.getClass()));
    }

    private static final <T> KSerializer<T> c(bv.c cVar, Class<T> cls, List<? extends KSerializer<Object>> list) throws IllegalAccessException, InvocationTargetException {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer<T> kSerializerC = b1.c(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerC != null) {
            return kSerializerC;
        }
        mr.c<T> cVarE = dr.a.e(cls);
        KSerializer<T> kSerializerB = o1.b(cVarE);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        KSerializer<T> kSerializerA = cVar.a(cVarE, list);
        if (kSerializerA != null) {
            return kSerializerA;
        }
        if (cls.isInterface()) {
            return new f(dr.a.e(cls));
        }
        return null;
    }

    public static final KSerializer<Object> d(bv.c cVar, Type type) {
        KSerializer<Object> kSerializerE = e(cVar, type, true);
        if (kSerializerE != null) {
            return kSerializerE;
        }
        b1.n(b(type));
        throw new oq.g();
    }

    private static final KSerializer<Object> e(bv.c cVar, Type type, boolean z15) {
        ArrayList arrayList;
        if (type instanceof GenericArrayType) {
            return a(cVar, (GenericArrayType) type, z15);
        }
        if (type instanceof Class) {
            return h(cVar, (Class) type, z15);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                return f(cVar, (Type) pq.n.n0(((WildcardType) type).getUpperBounds()), false, 2, null);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + q0.c(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls = (Class) parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (z15) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                arrayList.add(p.a(cVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                KSerializer<Object> kSerializerC = p.c(cVar, type3);
                if (kSerializerC == null) {
                    return null;
                }
                arrayList.add(kSerializerC);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            return vu.a.n((KSerializer) arrayList.get(0));
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            return vu.a.h((KSerializer) arrayList.get(0));
        }
        if (Map.class.isAssignableFrom(cls)) {
            return vu.a.k((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            return vu.a.j((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (oq.r.class.isAssignableFrom(cls)) {
            return vu.a.m((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (x.class.isAssignableFrom(cls)) {
            return vu.a.p((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((KSerializer) it.next());
        }
        return c(cVar, cls, arrayList2);
    }

    static /* synthetic */ KSerializer f(bv.c cVar, Type type, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        return e(cVar, type, z15);
    }

    public static final KSerializer<Object> g(bv.c cVar, Type type) {
        return e(cVar, type, false);
    }

    private static final KSerializer<Object> h(bv.c cVar, Class<?> cls, boolean z15) {
        KSerializer<Object> kSerializerC;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            return c(cVar, cls, v.n());
        }
        Class<?> componentType = cls.getComponentType();
        if (z15) {
            kSerializerC = p.a(cVar, componentType);
        } else {
            kSerializerC = p.c(cVar, componentType);
            if (kSerializerC == null) {
                return null;
            }
        }
        return vu.a.a(dr.a.e(componentType), kSerializerC);
    }
}

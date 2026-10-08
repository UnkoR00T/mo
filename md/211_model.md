# Paczka 211 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `uu/k.java`

## uu/k.java

```java
package uu;

import fr.q0;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import oq.i0;
import p071kotlin.Metadata;
import pq.l0;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b¢\u0006\u0004\b\f\u0010\rBY\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\f\u0010\u0010J'\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R6\u0010(\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%¨\u0006+"}, d2 = {"Luu/k;", "", "T", "Lyu/b;", "", "serialName", "Lmr/c;", "baseClass", "", "subclasses", "Lkotlinx/serialization/KSerializer;", "subclassSerializers", "<init>", "(Ljava/lang/String;Lmr/c;[Lmr/c;[Lkotlinx/serialization/KSerializer;)V", "", "classAnnotations", "(Ljava/lang/String;Lmr/c;[Lmr/c;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Luu/o;", "b", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Luu/o;", "a", "Lmr/c;", "c", "()Lmr/c;", "", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Loq/k;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "d", "Ljava/util/Map;", "getClass2Serializer$kotlinx_serialization_core", "()Ljava/util/Map;", "class2Serializer", "e", "serialName2Serializer", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k<T> extends yu.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mr.c<T> baseClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends Annotation> _annotations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k descriptor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<mr.c<? extends T>, KSerializer<? extends T>> class2Serializer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, KSerializer<? extends T>> serialName2Serializer;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"uu/k$a", "Lpq/l0;", "", "b", "()Ljava/util/Iterator;", "element", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements l0<Map.Entry<? extends mr.c<? extends T>, ? extends KSerializer<? extends T>>, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f201461a;

        public a(Iterable iterable) {
            this.f201461a = iterable;
        }

        @Override // pq.l0
        public String a(Map.Entry<? extends mr.c<? extends T>, ? extends KSerializer<? extends T>> element) {
            return element.getValue().getDescriptor().getSerialName();
        }

        @Override // pq.l0
        public Iterator<Map.Entry<? extends mr.c<? extends T>, ? extends KSerializer<? extends T>>> b() {
            return this.f201461a.iterator();
        }
    }

    public k(final String str, mr.c<T> cVar, mr.c<? extends T>[] cVarArr, KSerializer<? extends T>[] kSerializerArr) {
        this.baseClass = cVar;
        this._annotations = v.n();
        this.descriptor = oq.l.b(oq.o.PUBLICATION, new er.a() { // from class: uu.h
            @Override // er.a
            public final Object a() {
                return k.g(str, this);
            }
        });
        if (cVarArr.length != kSerializerArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + c().D() + " should be marked @Serializable");
        }
        Map<mr.c<? extends T>, KSerializer<? extends T>> mapS = v0.s(pq.n.F1(cVarArr, kSerializerArr));
        this.class2Serializer = mapS;
        l0 aVar = new a(mapS.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = aVar.b();
        while (itB.hasNext()) {
            T next = itB.next();
            Object objA = aVar.a(next);
            Object obj = linkedHashMap.get(objA);
            if (obj == null) {
                linkedHashMap.containsKey(objA);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str2 = (String) objA;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + c() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.e(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.serialName2Serializer = linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor g(String str, final k kVar) {
        return wu.j.d(str, wu.d.b.f215082a, new SerialDescriptor[0], new er.l() { // from class: uu.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.h(this.f201454a, (wu.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final k kVar, wu.a aVar) {
        wu.a.b(aVar, "type", vu.a.D(fr.v0.f66418a).getDescriptor(), null, false, 12, null);
        wu.a.b(aVar, "value", wu.j.d("kotlinx.serialization.Sealed<" + kVar.c().D() + '>', wu.k.a.f215111a, new SerialDescriptor[0], new er.l() { // from class: uu.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.i(this.f201455a, (wu.a) obj);
            }
        }), null, false, 12, null);
        aVar.h(kVar._annotations);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(k kVar, wu.a aVar) {
        for (Map.Entry<String, KSerializer<? extends T>> entry : kVar.serialName2Serializer.entrySet()) {
            wu.a.b(aVar, entry.getKey(), entry.getValue().getDescriptor(), null, false, 12, null);
        }
        return i0.f148189a;
    }

    @Override // yu.b
    public o<T> b(Encoder encoder, T value) {
        KSerializer<? extends T> kSerializer = this.class2Serializer.get(q0.c(value.getClass()));
        KSerializer<? extends T> kSerializerB = kSerializer != null ? kSerializer : super.b(encoder, value);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        return null;
    }

    @Override // yu.b
    public mr.c<T> c() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor.getValue();
    }

    public k(String str, mr.c<T> cVar, mr.c<? extends T>[] cVarArr, KSerializer<? extends T>[] kSerializerArr, Annotation[] annotationArr) {
        this(str, cVar, cVarArr, kSerializerArr);
        this._annotations = pq.n.f(annotationArr);
    }
}

```

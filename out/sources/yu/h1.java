package yu;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\"R\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010 R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000202\u0018\u0001010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00109R%\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030;0-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R!\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00010-8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\bA\u0010BR\u001b\u0010F\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010 R\u0014\u0010I\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010K¨\u0006M"}, d2 = {"Lyu/h1;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lyu/k;", "", "serialName", "Lyu/z;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;Lyu/z;I)V", "", "h", "()Ljava/util/Map;", "name", "", "isOptional", "Loq/i0;", "f", "(Ljava/lang/String;Z)V", "index", "r", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "t", "(I)Z", "q", "(I)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "s", "b", "Lyu/z;", "c", "I", "p", "d", "added", "", "e", "[Ljava/lang/String;", "names", "", "", "[Ljava/util/List;", "propertiesAnnotations", "", "g", "[Z", "elementsOptionality", "Ljava/util/Map;", "indices", "Lkotlinx/serialization/KSerializer;", "i", "Loq/k;", "j", "()[Lkotlinx/serialization/KSerializer;", "childSerializers", "l", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors", "k", "m", "_hashCode", "Lwu/k;", "()Lwu/k;", "kind", "", "()Ljava/util/Set;", "serialNames", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class h1 implements SerialDescriptor, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z<?> generatedSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int added;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String[] names;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation>[] propertiesAnnotations;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean[] elementsOptionality;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Map<String, Integer> indices;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final oq.k childSerializers;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oq.k typeParameterDescriptors;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oq.k _hashCode;

    public h1(String str, z<?> zVar, int i15) {
        this.serialName = str;
        this.generatedSerializer = zVar;
        this.elementsCount = i15;
        this.added = -1;
        String[] strArr = new String[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            strArr[i16] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i17 = this.elementsCount;
        this.propertiesAnnotations = new List[i17];
        this.elementsOptionality = new boolean[i17];
        this.indices = pq.v0.i();
        oq.o oVar = oq.o.PUBLICATION;
        this.childSerializers = oq.l.b(oVar, new er.a() { // from class: yu.e1
            @Override // er.a
            public final Object a() {
                return h1.i(this.f229432a);
            }
        });
        this.typeParameterDescriptors = oq.l.b(oVar, new er.a() { // from class: yu.f1
            @Override // er.a
            public final Object a() {
                return h1.u(this.f229438a);
            }
        });
        this._hashCode = oq.l.b(oVar, new er.a() { // from class: yu.g1
            @Override // er.a
            public final Object a() {
                return Integer.valueOf(h1.e(this.f229442a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(h1 h1Var) {
        return j1.b(h1Var, h1Var.l());
    }

    public static /* synthetic */ void g(h1 h1Var, String str, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        h1Var.f(str, z15);
    }

    private final Map<String, Integer> h() {
        HashMap map = new HashMap();
        int length = this.names.length;
        for (int i15 = 0; i15 < length; i15++) {
            map.put(this.names[i15], Integer.valueOf(i15));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer[] i(h1 h1Var) {
        KSerializer<?>[] kSerializerArrChildSerializers;
        z<?> zVar = h1Var.generatedSerializer;
        return (zVar == null || (kSerializerArrChildSerializers = zVar.childSerializers()) == null) ? k1.f229466a : kSerializerArrChildSerializers;
    }

    private final KSerializer<?>[] j() {
        return (KSerializer[]) this.childSerializers.getValue();
    }

    private final int m() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] u(h1 h1Var) {
        ArrayList arrayList;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        z<?> zVar = h1Var.generatedSerializer;
        if (zVar == null || (kSerializerArrTypeParametersSerializers = zVar.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
            for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                arrayList.add(kSerializer.getDescriptor());
            }
        }
        return c1.b(arrayList);
    }

    @Override // yu.k
    public Set<String> a() {
        return this.indices.keySet();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h1)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) other;
        if (!fr.t.c(getSerialName(), serialDescriptor.getSerialName()) || !Arrays.equals(l(), ((h1) other).l()) || getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i15 = 0; i15 < elementsCount; i15++) {
            if (!fr.t.c(r(i15).getSerialName(), serialDescriptor.r(i15).getSerialName()) || !fr.t.c(r(i15).getKind(), serialDescriptor.r(i15).getKind())) {
                return false;
            }
        }
        return true;
    }

    public final void f(String name, boolean isOptional) {
        String[] strArr = this.names;
        int i15 = this.added + 1;
        this.added = i15;
        strArr[i15] = name;
        this.elementsOptionality[i15] = isOptional;
        this.propertiesAnnotations[i15] = null;
        if (i15 == this.elementsCount - 1) {
            this.indices = h();
        }
    }

    public int hashCode() {
        return m();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: k */
    public wu.k getKind() {
        return wu.l.a.f215113a;
    }

    public final SerialDescriptor[] l() {
        return (SerialDescriptor[]) this.typeParameterDescriptors.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: n */
    public /* bridge */ boolean getIsInline() {
        return super.getIsInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* bridge */ boolean o() {
        return super.o();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String q(int index) {
        return this.names[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor r(int index) {
        return j()[index].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: s, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean t(int index) {
        return this.elementsOptionality[index];
    }

    public String toString() {
        return j1.c(this);
    }

    public /* synthetic */ h1(String str, z zVar, int i15, int i16, fr.k kVar) {
        this(str, (i16 & 2) != 0 ? null : zVar, i15);
    }
}

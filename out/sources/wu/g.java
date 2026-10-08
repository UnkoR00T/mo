package wu;

import fr.t;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import oq.y;
import p071kotlin.Metadata;
import pq.IndexedValue;
import pq.n;
import pq.v;
import pq.v0;
import yu.c1;
import yu.j1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u001b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001cR&\u00100\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0003018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u001f\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0003068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\t068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010;R\u001b\u0010K\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b*\u0010\u001c¨\u0006L"}, d2 = {"Lwu/g;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lyu/k;", "", "serialName", "Lwu/k;", "kind", "", "elementsCount", "", "typeParameters", "Lwu/a;", "builder", "<init>", "(Ljava/lang/String;Lwu/k;ILjava/util/List;Lwu/a;)V", "index", "q", "(I)Ljava/lang/String;", "r", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "t", "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "s", "b", "Lwu/k;", "k", "()Lwu/k;", "c", "I", "p", "", "d", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "getAnnotations$annotations", "()V", "annotations", "", "e", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "", "f", "[Ljava/lang/String;", "elementNames", "g", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "h", "[Ljava/util/List;", "elementAnnotations", "", "i", "[Z", "elementOptionality", "", "j", "Ljava/util/Map;", "name2Index", "typeParametersDescriptors", "l", "Loq/k;", "_hashCode", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements SerialDescriptor, yu.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k kind;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation> annotations;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<String> serialNames;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String[] elementNames;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SerialDescriptor[] elementDescriptors;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation>[] elementAnnotations;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean[] elementOptionality;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> name2Index;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SerialDescriptor[] typeParametersDescriptors;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oq.k _hashCode;

    public g(String str, k kVar, int i15, List<? extends SerialDescriptor> list, a aVar) {
        this.serialName = str;
        this.kind = kVar;
        this.elementsCount = i15;
        this.annotations = aVar.c();
        this.serialNames = v.d1(aVar.f());
        String[] strArr = (String[]) aVar.f().toArray(new String[0]);
        this.elementNames = strArr;
        this.elementDescriptors = c1.b(aVar.e());
        this.elementAnnotations = (List[]) aVar.d().toArray(new List[0]);
        this.elementOptionality = v.Z0(aVar.g());
        Iterable<IndexedValue> iterableC1 = n.C1(strArr);
        ArrayList arrayList = new ArrayList(v.y(iterableC1, 10));
        for (IndexedValue indexedValue : iterableC1) {
            arrayList.add(y.a(indexedValue.d(), Integer.valueOf(indexedValue.c())));
        }
        this.name2Index = v0.s(arrayList);
        this.typeParametersDescriptors = c1.b(list);
        this._hashCode = oq.l.a(new er.a() { // from class: wu.f
            @Override // er.a
            public final Object a() {
                return Integer.valueOf(g.c(this.f215092a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(g gVar) {
        return j1.b(gVar, gVar.typeParametersDescriptors);
    }

    private final int d() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    @Override // yu.k
    public Set<String> a() {
        return this.serialNames;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) other;
        if (!t.c(getSerialName(), serialDescriptor.getSerialName()) || !Arrays.equals(this.typeParametersDescriptors, ((g) other).typeParametersDescriptors) || getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i15 = 0; i15 < elementsCount; i15++) {
            if (!t.c(r(i15).getSerialName(), serialDescriptor.r(i15).getSerialName()) || !t.c(r(i15).getKind(), serialDescriptor.r(i15).getKind())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: k, reason: from getter */
    public k getKind() {
        return this.kind;
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
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String q(int index) {
        return this.elementNames[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor r(int index) {
        return this.elementDescriptors[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: s, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean t(int index) {
        return this.elementOptionality[index];
    }

    public String toString() {
        return j1.c(this);
    }
}

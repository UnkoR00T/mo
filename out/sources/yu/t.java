package yu;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lyu/t;", "Lyu/h1;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "index", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "r", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "Lwu/k;", "l", "Lwu/k;", "k", "()Lwu/k;", "kind", "", "m", "Loq/k;", "x", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends h1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final wu.k kind;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oq.k elementDescriptors;

    public t(final String str, final int i15) {
        super(str, null, i15, 2, null);
        this.kind = wu.k.b.f215112a;
        this.elementDescriptors = oq.l.a(new er.a() { // from class: yu.s
            @Override // er.a
            public final Object a() {
                return t.w(i15, str, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] w(int i15, String str, t tVar) {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            serialDescriptorArr[i16] = wu.j.e(str + '.' + tVar.q(i16), wu.l.d.f215116a, new SerialDescriptor[0], null, 8, null);
        }
        return serialDescriptorArr;
    }

    private final SerialDescriptor[] x() {
        return (SerialDescriptor[]) this.elementDescriptors.getValue();
    }

    @Override // yu.h1
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) other;
        return serialDescriptor.getKind() == wu.k.b.f215112a && fr.t.c(getSerialName(), serialDescriptor.getSerialName()) && fr.t.c(c1.a(this), c1.a(serialDescriptor));
    }

    @Override // yu.h1
    public int hashCode() {
        int iHashCode = getSerialName().hashCode();
        Iterator<String> it = wu.h.b(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i15 = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i15 + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // yu.h1, kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: k, reason: from getter */
    public wu.k getKind() {
        return this.kind;
    }

    @Override // yu.h1, kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor r(int index) {
        return x()[index];
    }

    @Override // yu.h1
    public String toString() {
        return pq.v.v0(wu.h.b(this), ", ", getSerialName() + '(', ")", 0, null, null, 56, null);
    }
}

package yu;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0018\u0010#R\u0014\u0010'\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0014\u0010/\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010\u0010¨\u00060"}, d2 = {"Lyu/q1;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lyu/k;", "original", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "index", "q", "(I)Ljava/lang/String;", "r", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "t", "(I)Z", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getOriginal$kotlinx_serialization_core", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Ljava/lang/String;", "s", "serialName", "", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "o", "()Z", "isNullable", "Lwu/k;", "k", "()Lwu/k;", "kind", "n", "isInline", "p", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q1 implements SerialDescriptor, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SerialDescriptor original;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<String> serialNames;

    public q1(SerialDescriptor serialDescriptor) {
        this.original = serialDescriptor;
        this.serialName = serialDescriptor.getSerialName() + '?';
        this.serialNames = c1.a(serialDescriptor);
    }

    @Override // yu.k
    public Set<String> a() {
        return this.serialNames;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof q1) && fr.t.c(this.original, ((q1) other).original);
    }

    public int hashCode() {
        return this.original.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public wu.k k() {
        return this.original.k();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean n() {
        return this.original.n();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean o() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: p */
    public int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String q(int index) {
        return this.original.q(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor r(int index) {
        return this.original.r(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: s, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean t(int index) {
        return this.original.t(index);
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.original);
        sb5.append('?');
        return sb5.toString();
    }
}

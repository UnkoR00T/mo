package wu;

import fr.t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wu.c, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0014\u0010$\u001a\u00020!8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\t8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\t8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010+\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010\u000e¨\u0006,"}, d2 = {"Lwu/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "Lmr/c;", "kClass", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lmr/c;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "index", "q", "(I)Ljava/lang/String;", "r", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "t", "(I)Z", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lmr/c;", "c", "Ljava/lang/String;", "s", "serialName", "Lwu/k;", "k", "()Lwu/k;", "kind", "o", "()Z", "isNullable", "n", "isInline", "p", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class ContextDescriptor implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SerialDescriptor original;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final mr.c<?> kClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    public ContextDescriptor(SerialDescriptor serialDescriptor, mr.c<?> cVar) {
        this.original = serialDescriptor;
        this.kClass = cVar;
        this.serialName = serialDescriptor.getSerialName() + '<' + cVar.D() + '>';
    }

    public boolean equals(Object other) {
        ContextDescriptor contextDescriptor = other instanceof ContextDescriptor ? (ContextDescriptor) other : null;
        return contextDescriptor != null && t.c(this.original, contextDescriptor.original) && t.c(contextDescriptor.kClass, this.kClass);
    }

    public int hashCode() {
        return (this.kClass.hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public k k() {
        return this.original.k();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean n() {
        return this.original.n();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean o() {
        return this.original.o();
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
        return "ContextDescriptor(kClass: " + this.kClass + ", original: " + this.original + ')';
    }
}

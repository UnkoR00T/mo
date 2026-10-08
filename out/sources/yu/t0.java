package yu;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u0014\u0010$\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0018¨\u0006%"}, d2 = {"Lyu/t0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "", "a", "()Ljava/lang/Void;", "", "index", "", "q", "(I)Ljava/lang/String;", "", "t", "(I)Z", "r", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lwu/k;", "b", "Lwu/k;", "k", "()Lwu/k;", "kind", "c", "Ljava/lang/String;", "s", "serialName", "p", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f229506a = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final wu.k kind = wu.l.d.f215116a;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String serialName = "kotlin.Nothing";

    private t0() {
    }

    private final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public boolean equals(Object other) {
        return this == other;
    }

    public int hashCode() {
        return getSerialName().hashCode() + (k().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public wu.k k() {
        return kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* bridge */ boolean n() {
        return super.n();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* bridge */ boolean o() {
        return super.o();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: p */
    public int getElementsCount() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String q(int index) {
        a();
        throw new oq.g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor r(int index) {
        a();
        throw new oq.g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: s */
    public String getSerialName() {
        return serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean t(int index) {
        a();
        throw new oq.g();
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
